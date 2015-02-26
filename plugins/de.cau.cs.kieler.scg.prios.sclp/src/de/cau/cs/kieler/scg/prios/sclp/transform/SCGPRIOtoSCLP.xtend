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
import de.cau.cs.kieler.scgprios.results.PrioIDResult
import de.cau.cs.kieler.kexpressions.c.transform.KExpressionsToC
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scgprios.extensions.export.SCGPrioExportExtension

/**
 * This transformation translates an SCG with prioIDs to SCL_P
 * It can be called manually or used by KiCo to perform a series of transformations.
 * 
 * @author cbu
 *
 */
class SCGPRIOtoSCLP{
   
    private var gotoLabelList = <Node,String> newHashMap
    private var threadLabelList = <Node,String> newHashMap
    private var translatedNodes = <Node> newLinkedList  
    private int labelNumber = 0
    private int threadLabelNumber = 0
    private var prioIDs = <Node,Long> newHashMap
    private var exp = new KExpressionsToC 
    private var anno = new  AnnotationsExtensions 
    private var prioExt = new SCGPrioExportExtension
  
    def Object transform(EObject eObject, KielerCompilerContext context) {
        var program = new Object()
        program = transformSCGToSCLP(eObject as SCGraph, context)
        return program
    }
    
    def Object transformSCGToSCLP(SCGraph scg, KielerCompilerContext context)  {

        var prioIDsRes = context.compilationResult.ancillaryData.filter[it instanceof PrioIDResult]

        // if previous results exist, optimize node priorities
        if (!prioIDsRes.empty){  
           
        prioIDs = (prioIDsRes.head as PrioIDResult).priorityMap
        
        gotoLabelList.clear
        threadLabelList.clear
        translatedNodes.clear
        labelNumber = 0
        threadLabelNumber = 0
        var rootNode = scg.nodes.head
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
    
    /**
     * Generate Macros for joinn and forkn if n > 1
     * @param scg
     *          the scg in question
     */
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
     * @param n
     *          number of threads of the fork node
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
     * @param n
     *          number of prioIDs/threads, that are joined by the join node
     */
    def String generateJoinMacro(int n){
        '''
        #ifdef _threadVectorSize
        #define join«n»(«FOR i : 1 ..< n»sib«i», «ENDFOR»sib«n») { \
           threadvector emptyVec; \
           _idClear(emptyVec); \
           «FOR i : 1 ..< n+1»
           _idAdd(emptyVec,sib«i»); \
        «ENDFOR»
           __LABEL__: if (isEnabledAnyOf( (emptyVec))){       \
           PAUSEG_(__LABEL__); }} 
        #else
        #define join«n»(«FOR i : 1 ..< n»sib«i», «ENDFOR»sib«n»)\
            __LABEL__: if (isEnabledAnyOf( («FOR i : 1 ..< n»(u2b(sib«i»)) | «ENDFOR»(u2b(sib«n»)) ))) {   \
            PAUSEG_(__LABEL__); }
        #endif
        '''
    }
    
   
    ////////////////////////////////////////////////////////////////////////////////
    /////////////////////////// TRANSLATE NODES ////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////
    
    
    /**
     * Translates an exit node
     * There is nothing to do here
     * 
     * @param exit
     *          exit node
     */
    private def dispatch String transformNode(Exit exit) {
    }
    
    /**
     * Translates an entry node
     * Creates a thread label, if enty node is not rootnode and calls this function for the next node
     * 
     * @param entry
     *          entry node 
     */
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
    
    /**
     * Translates a fork node
     * Kicks off translation of all entry nodes, which belong to the fork node and translates
     * the join node afterwards.
     * 
     * @param fork
     *          fork node
     */
    private def dispatch String transformNode(Fork fork) {
        if (translatedNodes.contains(fork)) {
            '''
                goto «gotoLabelList.get(fork)»;
            '''
        } else {
            translatedNodes.add(fork)
            var entrylist = prioExt.getAllChildrenOfNode(fork)
            var joiningNode = findJoiningNode(entrylist)
            var firstNode = getFirstThread(entrylist)
            entrylist.remove(joiningNode)
            entrylist.remove(firstNode)
            '''
                «setLabelIfRequired(fork)»
                fork«fork.next.length - 1»(«listForkThreads(firstNode, entrylist, joiningNode)»){
                    «transformNode(firstNode)»
                } par {
                «FOR e : entrylist»
                    «transformNode(e)»
                    } par {
                «ENDFOR»
                    «transformNode(joiningNode)»
                } join«fork.next.length - 1»(«listJoinThreads(entrylist, firstNode)»);
                «transformNode((fork as Fork).join)»
            '''
        }
    }
   
    /**
     * As the join node has already been translated by the corresponding fork node, only the
     * translation of the next node is called
     * 
     * @param join
     *          join node
     */
    private def dispatch String transformNode(Join join) {
        '''
        «setPrioStatementIfRequired(join,join.next.target)»
        «transformNode(join.next.target)»'''
    }
    
    /**
     * Translates an assignment node
     * 
     * @param assignment 
     *          assignment node
     */
    private def dispatch String transformNode(Assignment assignment) {
        if (translatedNodes.contains(assignment)) {
            '''
                goto «gotoLabelList.get(assignment)»;
            '''
        } else {
            translatedNodes.add(assignment)
            if (assignment.valuedObject != null) {
                '''
                    «setLabelIfRequired(assignment)»
                    «assignment.valuedObject.name»«IF !assignment.indices.empty»«exp.transformExpressions(assignment.indices)»«ENDIF» = «exp.
                        transformExpression(assignment.assignment)»;
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
    
    /**
     * Translates a conditional node
     * Kickstarts translation of node on then and else branch
     * 
     * @param conditional
     *          conditional node
     */
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
    
    /**
     * Translates a surface node
     * 
     * @param surface
     *          surface node
     */
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
    
    /**
     * Transforms a depth node
     * 
     * @param depth
     *          depth node
     * 
     */
    private def dispatch String transformNode(Depth depth){
        transformNode(depth.next.target)
    }
   
    
    
    ////////////////////////////////////////////////////////////////////////////////////////
    //////////////////// HELPER FUNCTIONS: NODE TRANSLATION ////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////
    
    /**
     * Checks if a label is required (a label is requried if the node has more than one parent)
     * and calls a function which generates the label, no such label has been generated so far
     * 
     * @param node
     *          node which might require a label
     */
    private def setLabelIfRequired(Node node){
        var l = node.incoming.filter[it instanceof ControlFlow].length
        if (l > 1 && !gotoLabelList.containsKey(node)){
            generateNewGotoLabel(node) 
            
        }    
    }
    
    /**
     * Generates a new goto label for the node
     * 
     * @param node
     *          node which requires a label
     */
    private def String generateNewGotoLabel(Node node) {
        var newString = "label_" + labelNumber.toString
        gotoLabelList.put(node, "label_" + labelNumber.toString)
        labelNumber = labelNumber + 1
        '''
            «newString»:
        '''
    }
    
    /**
     * Generate a label which identifies the thread
     * If a unique regionname exists, that name is taken
     * Otherwise the regionname is modified until it is unique
     * If no regionname exists, a new label is created
     * 
     * @param node
     *          entry node of region
     * 
     */
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

    /**
     * Sets a prio statement, if the child node has a priority different from the parent node
     * 
     * @param parent
     *          parent node
     * @param child
     *          child node
     */
    private def String setPrioStatementIfRequired(Node parent, Node child){
        if (prioIDs.get(parent) != prioIDs.get(child)){
            '''
            prio(«prioIDs.get(child).toString»);
            '''
        } 
    }
    
    /**
     * Creates a label for each thread and
     * creates a list which contains the label and the prioID of each thread which should be forked
     * 
     * @param firstnode 
     *          first child of fork
     * @param threads
     *          threads without first and last child
     * @param joiningNode
     *          last child (performs join)
     */
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
    
    /**
     * Creates a list of all prioIDs from all threads, which should be joined
     * 
     * @param threads
     *          all threads except from the first and the last child
     * @param firstThread
     *          first child 
     */
    private def String listJoinThreads(List<Node> threads, Node firstThread) {

        var newString = new String

        if (! threads.empty) {
            var newList = <Long>newLinkedList
            for (t : threads) {
                newList.add(prioIDs.get((t as Entry).exit))
            }
            for (n : newList) {
                newString = newString + (n.toString) + ","
            }
        }

        newString = newString + prioIDs.get((firstThread as Entry).exit)

        newString
    }
    
    /**
     * Find child which should perform the join. This is the child whose exit node has the lowest prioID
     * 
     * @param entrylist
     *          list of entry nodes
     */
    private def Node findJoiningNode(LinkedList<Node> entrylist){
        var joiningnode = entrylist.head
        for (e : entrylist){
            if (prioIDs.get(((e as Entry).exit)) < prioIDs.get((joiningnode as Entry).exit)){
                joiningnode = e
            } 
        }
        joiningnode
    }
    
    /**
     * Find child which should be forked first. This is usually the child whose entry node has the 
     * highest prioID
     * 
     * @param entrylist
     *          list of entry nodes
     */
     private def Node getFirstThread(LinkedList<Node> nodelist){
        var firstThread = nodelist.head
        for (n : nodelist){
            if (prioIDs.get(n) > prioIDs.get(firstThread)){
                firstThread = n
            } 
        }
        firstThread
    }
}