/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.prios.sclp.transform

import de.cau.cs.kieler.scg.SCGraph
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kico.KielerCompilerContext
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Node
import java.util.LinkedList
import de.cau.cs.kieler.scg.ControlFlow
import java.util.List
import java.util.HashMap
import de.cau.cs.kieler.scgprios.results.PrioIDResult
import de.cau.cs.kieler.kexpressions.c.transform.KExpressionsToC
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions

/**
 * @author cbu
 *
 */
class SCGPRIOtoSCLP{
    
    //String might save a label ??? Necessary? change to linkedlist otherwise
    private var gotoLabelList = <Node,String> newHashMap
    private var threadLabelList = <Node,String> newHashMap
    private var translatedNodes = <Node> newLinkedList  
    private int labelNumber = 0
    private int threadLabelNumber = 0
    private HashMap<Node,Long> prioIDs
    private KExpressionsToC exp
    private AnnotationsExtensions anno
    
    def Object transform(EObject eObject, KielerCompilerContext context) {
        var program = new Object()
        program = transformSCGToSCLP(eObject as SCGraph, context)
        return program
    }
    
    def Object transformSCGToSCLP(SCGraph scg, KielerCompilerContext context)  {

        var prioIDsRes = context.compilationResult.ancillaryData.filter[it instanceof PrioIDResult]

        // if previous results exist, optimize node priorities
        if (!prioIDsRes.empty){
        
        exp = new KExpressionsToC 
        anno = new AnnotationsExtensions   
           
        prioIDs = (prioIDsRes.head as PrioIDResult).priorityMap
        
        gotoLabelList.clear
        threadLabelList.clear
        translatedNodes.clear
        labelNumber = 0
        threadLabelNumber = 0
        var rootNode = findRootNode(scg.nodes)
        val code = 
        '''
        «header(getHighestPrioID(scg))»
        «generateForkAndJoinMacros(scg)»
        «exp.transformDeclarations(scg.declarations)»
                                                                  
        int tick()
        {
            tickstart(«prioIDs.get(rootNode)»);
            «transformNode(rootNode)»
            tickreturn();
        }
        '''
        
        code
        
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////
    ////////////////////// GENERATE PREPROCESSOR INSTRUCTIONS ////////////////////
    //////////////////////////////////////////////////////////////////////////////
    
    /**
     * Generate header 
     * @param highestPrioID: max PrioID
     */
    def String header(long maxPrioID) {
       '''
    /*****************************************************************************/
    /*                 G E N E R A T E D       C    C O D E                      */
    /*****************************************************************************/
    /* KIELER - Kiel Integrated Environment for Layout Eclipse RichClient        */
    /*                                                                           */
    /* http://www.informatik.uni-kiel.de/rtsys/kieler/                           */
    /* Copyright 2015 by                                                         */
    /* + Christian-Albrechts-University of Kiel                                  */
    /*   + Department of Computer Science                                        */
    /*     + Real-Time and Embedded Systems Group                                */
    /*                                                                           */
    /* This code is provided under the terms of the Eclipse Public License (EPL).*/
    /*****************************************************************************/
    
    #define _SC_ID_MAX «maxPrioID.toString»
    #include "scl_p.h"
    #include "sc.h"                      
    '''
    }
    
    /**
     * Find highest PrioID
     * @param scg: SCG
     * @return highest PrioID of SCG
     */
    private def long getHighestPrioID(SCGraph scg){
        var long maxPrioID = 0
        for (node : scg.nodes){
            if (maxPrioID < prioIDs.get(node)){
                maxPrioID = prioIDs.get(node)
            }
        }
        maxPrioID    
    }
    
    /////////////////////////////////////////////////////////////////////////////////
    /////////////////// Generate Fork and Join Macros ///////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////
    
    def String generateForkAndJoinMacros(SCGraph scg){
        var forknodes = scg.nodes.filter[it instanceof Fork]
        var macros = <Integer> newArrayList
        
        for (f : forknodes){
            var entrynodes = (f as Fork).next.length
            if (entrynodes > 2 && (!macros.contains((entrynodes - 1)))){
                macros.add(entrynodes - 1)
            }
        }
        '''
        «FOR m : macros»
        «generateForkMacro(m)»
                                                     
        «generateJoinMacro(m)»
                              
        «ENDFOR»
        '''
    }
    
    /**
     * Generate Macro for forkn
     * 
     * @param n: number of threads of the fork node
     */
    def String generateForkMacro(int n){
        '''
        #define fork«n»(«FOR i : 1 ..< n»label«i», p«i»,«ENDFOR»label«n», p«n») \
            «FOR j : 1 ..< n»
            fork1(label«j», p«j»);       \
            «ENDFOR»
            fork1(label«n», p«n»); 
        '''
    }
    
    /**
     * Generate Macro for joinn
     * Depending on the size of the highest prioID two cases have to be respected:
     * --> highest prioID 
     * 
     * @param n: number of prioIDs/threads, that are joined by the join node
     */
    def String generateJoinMacro(int n){
        '''
        #ifdef _threadVectorSize
        #define join«n»(«FOR i : 1 ..< n»sib«i», «ENDFOR»sib«n») { \
           threadvector emptyVec; \
           _idClear(emptyVec); \
           «generateJoinListForMacro(n)»
           __LABEL__: if (isEnabledAnyOf( (emptyVec))){       \
           PAUSEG_(__LABEL__); }} 
        #else
        #define join«n»(«FOR i : 1 ..< n»sib«i», «ENDFOR»sib«n»)\
            __LABEL__: if (isEnabledAnyOf( («FOR i : 1 ..< n»(u2b(sib«i»)) | «ENDFOR»(u2b(sib«n»)) ))) {   \
            PAUSEG_(__LABEL__); }
        #endif
        '''
    }
    
    private def String generateJoinListForMacro(int n){
        '''
        «FOR i : 1 ..< n+1»
        _idAdd(emptyVec,sib«i»); \
        «ENDFOR»'''
    }
   
    ////////////////////////////////////////////////////////////////////////////////
    /////////////////////////// TRANSLATE NODES ////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////
    
    private def setLabelIfRequired(Node node){
        var l = node.incoming.filter[it instanceof ControlFlow].length
        if (l > 1 && !gotoLabelList.containsKey(node)){
            setNewLabel(node) 
            
        }    
    }
    
    private def String generateThreadLabel(Node node){
        var regionlabel = anno.getStringAnnotationValue(node,"regionName")
        if (regionlabel.nullOrEmpty){
            threadLabelNumber = (threadLabelNumber + 1)
            '''tLabel_«(threadLabelNumber -1).toString»'''
        } else {
            if (threadLabelList.containsValue(regionlabel)){
                var i = 0
                var b = true
                while (b){
                    i = i+1
                    if (!threadLabelList.containsValue(regionlabel+i)){
                        b = false
                        regionlabel = regionlabel+i
                    }
                }
                '''«regionlabel»'''
            } else {
            '''«regionlabel»'''
            }
        }
    }

    private def String setNewLabel(Node node){

            var newString = "label_"+labelNumber.toString
            gotoLabelList.put(node,"label_"+labelNumber.toString)
            labelNumber = labelNumber+1
            '''
            «newString»:
            ''' 
       
       
    }
    
    
    private def String setPrioStatementIfRequired(Node parent, Node child){
        if (prioIDs.get(parent) != prioIDs.get(child)){
            '''
            prio(«prioIDs.get(child).toString»);
            '''
        } 
    }
    
    private def dispatch String transformNode(Exit exit) {
    }
    private def dispatch String transformNode(Entry entry) {
        // there should be no prio statement necessary.
        if (entry.incoming.filter[it instanceof ControlFlow].length > 0){
            var threadLabel = threadLabelList.get(entry)
            gotoLabelList.put(entry.next.target, threadLabel)
            '''
            «threadLabel»:
            «transformNode(entry.next.target)»
            '''
        } else {
            '''
            «transformNode(entry.next.target)»
            '''    
        }
    }
    
    // TODO: generate sclp macro
    private def dispatch String transformNode(Fork fork) {
        if (translatedNodes.contains(fork)){
        '''
        goto «gotoLabelList.get(fork)»;
        '''
        } else {
        translatedNodes.add(fork)
        var entrylist = getChildrenOfNode(fork)
        var joiningNode = findJoiningNode(entrylist)
        var firstNode = getFirstThread(entrylist)
        entrylist.remove(joiningNode)
        entrylist.remove(firstNode)
        '''
        «setLabelIfRequired(fork)»
        fork«fork.next.length-1»(«listForkThreads(firstNode, entrylist, joiningNode)»){
            «transformNode(firstNode)»
        } par {
        «FOR e : entrylist»
            «transformNode(e)»
        } par {
        «ENDFOR»
            «transformNode(joiningNode)»
        } join«fork.next.length-1»(«listJoinThreads(entrylist, firstNode)»);
        «transformNode((fork as Fork).join)»
        '''
        }
    }
    private def Node getFirstThread(LinkedList<Node> nodelist){
        var firstThread = nodelist.head
        for (n : nodelist){
            if (prioIDs.get(n) > prioIDs.get(firstThread)){
                firstThread = n
            } else if (prioIDs.get(n) == prioIDs.get(firstThread)){
                if (prioIDs.get((n as Entry).exit) > prioIDs.get((firstThread as Entry).exit)){
                    firstThread = n
                }
            }
        }
        firstThread
    }
    
    private def dispatch String transformNode(Join join) {
        '''
        «setPrioStatementIfRequired(join,join.next.target)»
        «transformNode(join.next.target)»'''
    }
    
    private def dispatch String transformNode(Assignment assignment) {
        if (translatedNodes.contains(assignment)){
        '''
        goto «gotoLabelList.get(assignment)»;
        '''
        } else { 
        translatedNodes.add(assignment)
        if (assignment.valuedObject != null){
         '''
        «setLabelIfRequired(assignment)»
        «assignment.valuedObject.name»«IF !assignment.indices.empty»«exp.transformExpressions(assignment.indices)»«ENDIF» = «exp.transformExpression(assignment.assignment)»;
        «setPrioStatementIfRequired(assignment, assignment.next.target)»
        «transformNode(assignment.next.target)»
        ''' 
        } else {
            '''
        «setLabelIfRequired(assignment)»
        «exp.transformExpression(assignment.assignment)»;
        «setPrioStatementIfRequired(assignment, assignment.next.target)»
        «transformNode(assignment.next.target)»
        '''
        }
        
        } 
    }
    
    //private def dispatch transformAssignment(Expression Assignment)
    
    private def dispatch String transformNode(Conditional conditional) {
        if (translatedNodes.contains(conditional)){
        '''
        goto «gotoLabelList.get(conditional)»;
        '''
        } else {
        translatedNodes.add(conditional)
        '''
        «setLabelIfRequired(conditional)»
        if («exp.transformExpression(conditional.condition)»){
            «setPrioStatementIfRequired(conditional, conditional.then.target)»
            «transformNode(conditional.then.target)»
        } «IF conditional.^else.target != null»else {
            «setPrioStatementIfRequired(conditional, conditional.^else.target)»
            «transformNode(conditional.^else.target)»
        }«ENDIF»
        '''
        }
        
    }
    private def dispatch String transformNode(Surface surface){        
        
        if (translatedNodes.contains(surface)){
        '''
        goto «gotoLabelList.get(surface)»;
        '''
        } else {
        translatedNodes.add(surface)
        '''
        «setLabelIfRequired(surface)»
        «setPrioStatementIfRequired(surface, surface.depth)»
        pause;
        «transformNode(surface.depth)»
        '''
        }
    }
    private def dispatch String transformNode(Depth depth){
        transformNode(depth.next.target)
    }
    private def Node findRootNode(EList<Node> nodes){
        for (node : nodes){
            if (node instanceof Entry && node.incoming.empty){
                return node
            }
        }
    }
    
    private def String listForkThreads(Node firstNode, List<Node> threads, Node joiningNode){
        var newString = ""
        
        var newLabel = generateThreadLabel(firstNode)
        threadLabelList.put(firstNode,newLabel)
    
        for (t : threads){
            
            var newLabel2 = generateThreadLabel(t)
            threadLabelList.put(t,newLabel2)
            newString = newString + newLabel2 + "," + prioIDs.get(t).toString + ","
            
        }
        var newLabel3 = generateThreadLabel(joiningNode)
        threadLabelList.put(joiningNode,newLabel3)
        newString = newString + newLabel3 + "," + prioIDs.get(joiningNode).toString
      
        newString
    }
    

    private def String listJoinThreads(List<Node> threads, Node firstThread){
        
        var newString = new String
        
        if (! threads.empty){
            var newList = <Long> newLinkedList
        for (t : threads){
            newList.add(prioIDs.get((t as Entry).exit))
        }
        for (n : newList){
            newString = newString + (n.toString)+","
        }
        }
        
        newString = newString + prioIDs.get((firstThread as Entry).exit)
        
        newString
    }
    
    private def Node findJoiningNode(LinkedList<Node> entrylist){
        var joiningnode = entrylist.head
        for (e : entrylist){
            if (prioIDs.get(((e as Entry).exit)) < prioIDs.get((joiningnode as Entry).exit)){
                joiningnode = e
            } else if (prioIDs.get(((e as Entry).exit)) == prioIDs.get((joiningnode as Entry).exit)){
                if (prioIDs.get(e) < prioIDs.get(joiningnode)){
                    joiningnode = e
                }
            }
        }
        joiningnode
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////// HELPER FUNCTIONS /////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////
    

    def LinkedList<Node> getChildrenOfNode(Node node) {
        System.out.println("starting getChildrenOfNode")
        var childNodes = new LinkedList<Node>
        if (node instanceof Entry) {
            var nextLink = (node as Entry).next
            if (nextLink != null) {
                var nextNode = nextLink.target
                childNodes.addLast(nextNode)
            }
        } else if (node instanceof Exit) {
            var nextLink = (node as Exit).next
            if (nextLink != null) {
                var nextNode = nextLink.target
                childNodes.addLast(nextNode)
            }
        } else if (node instanceof Assignment) {
            var nextLink = (node as Assignment).next
            if (nextLink != null) {
                var nextNode = nextLink.target
                childNodes.addLast(nextNode)
            }
        } else if (node instanceof Depth) {
            var nextLink = (node as Depth).next
            if (nextLink != null) {
                var nextNode = nextLink.target
                childNodes.addLast(nextNode)
            }
        } else if (node instanceof Surface) {
            var nextLink = (node as Surface).depth
            childNodes.addLast(nextLink)
        } else if (node instanceof Join) {
            var nextLink = (node as Join).next
            if (nextLink != null) {
                var nextNode = nextLink.target
                childNodes.addLast(nextNode)
            }
        } else if (node instanceof Conditional) {
            var thenLink = (node as Conditional).then
            if (thenLink != null) {
                var nextNode = thenLink.target
                childNodes.addLast(nextNode)
            }
            var elseLink = (node as Conditional).^else
            if (elseLink != null) {
                var nextNode = elseLink.target
                childNodes.addLast(nextNode)
            }
        } else if (node instanceof Fork) {
            var nextLinks = (node as Fork).next
            if (!nextLinks.empty) {
                for (nextLink : nextLinks) {
                    var nextNode = nextLink.target
                    childNodes.addLast(nextNode)
                }
            }
        }
        childNodes

    }
   
}