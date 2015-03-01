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
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import java.util.HashMap
import com.google.inject.Inject

/**
 * This transformation translates an SCG with prioIDs to SCL_P
 * It can be called manually or used by KiCo to perform a series of transformations.
 * 
 * @author cbu
 *
 */
class SCGPRIOtoSCLP{
    
    @Inject
    extension SCGThreadExtensions
    @Inject 
    extension AnnotationsExtensions
    @Inject
    extension KExpressionsToC
    @Inject 
    extension SCGPrioExportExtension
   
    private var gotoLabelList = <Node,String> newHashMap
    private var threadLabelList = <Node,String> newHashMap
    private var translatedNodes = <Node> newLinkedList  
    private int labelNumber = 0
    private int threadLabelNumber = 0
    private var prioIDs = <Node,Long> newHashMap
    private var joinPrioMap = <Node,LinkedList<Long>> newHashMap
  
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
        joinPrioMap = createJoinHashMap(scg)
        
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
        «transformDeclarations(scg.declarations)»
                                                                  
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
        var forkmacros = <Integer> newArrayList
        var joinmacros = <Integer> newArrayList
        
        for (f : forknodes){
            var entrynodes = (f as Fork).next.length
            if (entrynodes > 2 && (!forkmacros.contains((entrynodes - 1)))){
                forkmacros.add(entrynodes - 1)
            }
            var joinprios = joinPrioMap.get((f as Fork).join).length
            if (joinprios > 1 && (!joinmacros.contains(joinprios))){
                joinmacros.add(joinprios)
            }
            
        }
        
        '''
        «FOR m : forkmacros»
        «generateForkMacro(m)»
        «ENDFOR»
                                                     
        «FOR m : joinmacros»
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
        // rootnode?
        if (entry.incoming.filter[it instanceof ControlFlow].length > 0){
            var threadLabel = threadLabelList.get(entry)
            if (!((entry.next.target instanceof Surface) && (prioIDs.get(entry) != prioIDs.get((entry.next.target as Surface).depth)))){
                gotoLabelList.put(entry.next.target, threadLabel)
            }
            '''
            «threadLabel»:
            «setPrioStatementIfRequired(entry, entry.next.target)»
            «transformNode(entry.next.target)»
            '''
        } else {
            '''
            «setPrioStatementIfRequired(entry, entry.next.target)»
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
            var threadlist = getAllChildrenOfNode(fork)
            var joiningNode = findJoiningNode(threadlist)
            var firstNode = getFirstThread(threadlist)
            threadlist.remove(joiningNode)
            threadlist.remove(firstNode)
            '''
                «setLabelIfRequired(fork)»
                fork«fork.next.length - 1»(«listForkThreads(firstNode, threadlist, joiningNode)»){
                    «transformNode(firstNode)»
                } par {
                «FOR t : threadlist»
                    «transformNode(t)»
                    } par {
                «ENDFOR»
                    «transformNode(joiningNode)»
                } join«joinPrioMap.get(fork.join).length»(«listJoinThreads(joinPrioMap.get(fork.join))»);
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
                    «assignment.valuedObject.name»«IF !assignment.indices.empty»«transformExpressions(assignment.indices)»«ENDIF» = «
                        transformExpression(assignment.assignment)»;
                    «setPrioStatementIfRequired(assignment, assignment.next.target)»
                    «transformNode(assignment.next.target)»
                '''
            } else {
                '''
                    «setLabelIfRequired(assignment)»
                    «transformExpression(assignment.assignment)»;
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
        if («transformExpression(conditional.condition)»){
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
        var regionlabel = getStringAnnotationValue(node,"regionName")
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
        if (child instanceof Surface && (prioIDs.get(parent) != prioIDs.get((child as Surface).depth))){
            '''
            prio(«prioIDs.get((child as Surface).depth).toString»);
            '''
        }
        else if ((!(child instanceof Surface)) && (prioIDs.get(parent) != prioIDs.get(child))){
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
    private def String listJoinThreads(List<Long> prios) {

        var newString = ""
        if (!prios.empty) {
            var lastprio = prios.last
            prios.remove(lastprio)

            if (! prios.empty) {
                for (p : prios) {
                    newString = newString + (p.toString) + ","
                }
            }

            newString = newString + lastprio.toString
        }
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
   
    /**
     * Get all priorities from a single thread  which have to be considered by a join node
     * 
     * @param entry
     *          entry node of that thread
     */
    private def LinkedList<Long> getAllPriorities(Entry entry, long exitPriority) {
        var allNodes = getThreadNodes(entry)
        var prioList = <Long>newLinkedList
        for (a : allNodes) {
            var priority = prioIDs.get(a)
            if (!prioList.contains(priority)) {
                if (a instanceof Depth) {
                    prioList.add(priority)
                } else {
                    if (priority < exitPriority) {
                        prioList.add(priority)
                    }
                }
            }
        }
        prioList
    }
    
   /**
    * This method creates a list of priorities which have to be joined for each join node
    * When the joining thread is called, there are four possibilities, at which points
    * the other threads might have been stopped: 
    * - entry node, because thread has not been called yet
    * - depth node, because thread pauses
    * - exit node, if thread has already terminated
    * - after a prio statement
    * For the entry and exit nodes, and for the case, that a prio statement stopped the
    * thread, it is enough to wait for those priorities, which are higher than the 
    * priority of the exit node of the thread which performs the join.
    * To sum up: 
    * - all priorities from all nodes of the thread are considered, if they are bigger than
    *   the priority of the exit node of the thread, which performs the join
    * - the priorities of all depth nodes are considered
    * 
    * all these possible priorities have to be considered
    *
    * @param scg 
    *          current SCG
    */
    private def HashMap<Node,LinkedList<Long>> createJoinHashMap(SCGraph scg) {
        var joinnodes = scg.nodes.filter[it instanceof Join]
        var joinpriomap = <Node,LinkedList<Long>> newHashMap
        for (j : joinnodes){
            var entrylist = getAllChildrenOfNode((j as Join).fork)
            var joiningnode = findJoiningNode(entrylist)
            entrylist.remove(joiningnode)
            var priolist = <Long> newLinkedList
            for (e : entrylist){
                priolist.addAll(getAllPriorities((e as Entry),prioIDs.get((joiningnode as Entry).exit)))
            }
            joinpriomap.put(j,priolist)
        }
        joinpriomap
    }
}