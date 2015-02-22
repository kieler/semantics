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

/**
 * @author cbu
 *
 */
class SCGPRIOtoSCLP{
    
    //String might save a label ??? Necessary? change to linkedlist otherwise
    private var labelList = <Node,String> newHashMap
    private var createdLabelsList = <String> newLinkedList
    private var translatedNodes = <Node> newLinkedList  
    private int labelNumber = 0
    private HashMap<Node,Long> prioIDs
    private KExpressionsToC exp
    
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
           
        prioIDs = (prioIDsRes.head as PrioIDResult).priorityMap
        
        labelList.clear
        createdLabelsList.clear
        translatedNodes.clear
        labelNumber = 0
        var rootNode = findRootNode(scg.nodes)
        val code = 
        '''
        «header(scg)»
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
    
    def header(SCGraph scg) {
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
    
    #define _SC_ID_MAX «getHighestPrioID(scg)»
    #include "scl_p.h"
    #include "sc.h"                      
    '''
    }
    
    def long getHighestPrioID(SCGraph scg){
        var long maxPrioID = 0
        for (node : scg.nodes){
            if (maxPrioID < prioIDs.get(node)){
                maxPrioID = prioIDs.get(node)
            }
        }
        maxPrioID    
    }
    
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
    
    def String generateForkMacro(int n){
        '''
        #define fork«n»(«FOR i : 1 ..< n»label«i», p«i»,«ENDFOR»label«n», p«n») \
            «FOR j : 1 ..< n»
            fork1(label«j», p«j»)       \
            «ENDFOR»
            fork1(label«n», p«n») 
        '''
    }
    
    def String generateJoinMacro(int n){
        '''
        #define join«n»(«FOR i : 1 ..< n»sib«i», «ENDFOR»sib«n»)\
            __LABEL__: if (isEnabledAnyOf( («FOR i : 1 ..< n»(u2b(sib«i»)) | «ENDFOR»(u2b(sib«n»)) ))) {   \
            PAUSEG_(__LABEL__); }
        '''
    }
    
  
    
//    // is the first case really necessary? - yes!
//    // extern and static exclude each other
//    def String declarations(EList<Declaration> declarations){
//        '''
//        «FOR d : declarations»
//            «IF d.extern && d.const» 
//            extern const «getValuedObjects(d.type, d.valuedObjects)»
//            «ELSEIF d.static && d.const» 
//            static const «getValuedObjects(d.type, d.valuedObjects)»
//            «ELSEIF d.extern»
//            extern «getValuedObjects(d.type, d.valuedObjects)»
//            «ELSEIF d.static»
//            static «getValuedObjects(d.type, d.valuedObjects)»
//            «ELSEIF d.const»
//            const «getValuedObjects(d.type, d.valuedObjects)»
//            «ELSE»
//            «getValuedObjects(d.type, d.valuedObjects)»
//            «ENDIF»
//        «ENDFOR»
//        '''
//    }
    
//    def String getValuedObjects(ValueType type, EList<ValuedObject> objects){   
//       '''
//       «FOR o : objects»
//            «type» «o.name»«IF o.cardinalities.length > 0»«o.cardinalities»«ENDIF»;
//       «ENDFOR» 
//       '''
//    }
    
    
    private def setLabelIfRequired(Node node){
        var l = 0
        for (i : node.incoming){
            if (i instanceof ControlFlow){
                l = l + 1
            }
        }
        if (l > 1 || labelList.containsKey(node)){
            if (!createdLabelsList.contains(labelList.get(node))){
               setNewLabel(node) 
            }
        }    
    }
    
//    private def String setNewLabel(Node node){
//        if (labelList.containsKey(node)){
//            '''
//            «labelList.get(node)»:
//            ''' 
//        } else {
//            var newString = "label_"+labelNumber.toString
//            labelList.put(node,"label_"+labelNumber.toString)
//            labelNumber = labelNumber+1
//            '''
//            «newString»:
//            ''' 
//       
//       }
//    }

    private def String setNewLabel(Node node){

            var newString = "label_"+labelNumber.toString
            labelList.put(node,"label_"+labelNumber.toString)
            labelNumber = labelNumber+1
            createdLabelsList.add(newString)
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
        if (labelList.containsKey(entry)){
            createdLabelsList.add(labelList.get(entry))
        '''
        «labelList.get(entry)»:
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
        goto «labelList.get(fork)»;
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
    
    // TODO: Translate Assignment
    private def dispatch String transformNode(Assignment assignment) {
        System.out.println(assignment.toString)
        if (translatedNodes.contains(assignment)){
        '''
        goto «labelList.get(assignment)»;
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
        goto «labelList.get(conditional)»;
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
        goto «labelList.get(surface)»;
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
        
        var newLabel = "label_"+labelNumber.toString
        labelNumber = labelNumber+1
        labelList.put(firstNode,newLabel)
        
        var nextNode = (firstNode as Entry).next.target
        if (!(nextNode instanceof Exit)){
            labelList.put(nextNode,newLabel)
        }
    
        for (t : threads){
            
            var newLabel2 = "label_"+labelNumber.toString
            labelNumber = labelNumber+1
            newString = newString+newLabel2+","+prioIDs.get(t).toString+","
            labelList.put(t,newLabel2)
            
            nextNode = (t as Entry).next.target
            if (!(nextNode instanceof Exit)){
                labelList.put(nextNode,newLabel2)
            }
            
        }
        var newLabel3 = "label_"+labelNumber.toString
        labelNumber = labelNumber+1
        newString = newString+newLabel3+","+prioIDs.get(joiningNode).toString
        labelList.put(joiningNode,newLabel3)
        
        nextNode = (joiningNode as Entry).next.target
        if (!(nextNode instanceof Exit)){
            labelList.put(nextNode,newLabel3)
        }
        
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
    
//    private def dispatch String transformExpression(ValuedObjectReference ref){
//        System.out.println(ref.valuedObject.name)
//        '''«ref.valuedObject.name»«IF !ref.indices.empty»«transformExpressions(ref.indices)»«ENDIF»'''    
//    }
//    
//    private def dispatch String transformExpression(IntValue value){
//        '''«value.value»'''     
//    }
//    private def dispatch String transformExpression(BoolValue value){
//        '''«value.value»'''     
//    }
//    private def dispatch String transformExpression(FloatValue value){
//        '''«value.value»'''     
//    }
//    private def dispatch String transformExpression(StringValue value){
//        '''«value.value»'''
//    }
//    
//
//    
//    private def dispatch String transformExpression(OperatorExpression opExp){
//        
//        var operator = transformOperators(opExp.operator)
//        var subexpressions = opExp.subExpressions
//        if (subexpressions.length == 1){
//            System.out.println(operator+" "+transformExpression(subexpressions.head))
//            '''«transformFirstOperator(opExp.operator)»«transformExpression(subexpressions.head)»'''
//        } else {
//            var lastexpression = subexpressions.last
//            subexpressions.remove(lastexpression)
//            '''«FOR s : subexpressions»«transformExpression(s)» «operator» «ENDFOR»«transformExpression(lastexpression)»'''
//        }
//    }
//    
// 
//    
//    private def String transformExpressions(List<Expression> indices){
//        '''[«FOR i : indices»«transformExpression(i)»«ENDFOR»]'''
//    }
//    
//    private def dispatch String transformExpression(TextExpression textExp){
//        '''«textExp.text»'''
//    }
//    
//    private def String transformOperators(OperatorType operatortype){
//        if (operatortype.getName() == "AND"){
//            '''&&'''
//        } else if (operatortype.getName() == "OR"){
//            '''||'''
//        } else {
//            '''«operatortype»'''
//        }
//        
//    }
//    
//    private def String transformFirstOperator(OperatorType operatortype){
//        if (operatortype.getName() == "NOT" || operatortype.getName() == "SUB" || operatortype.getName() == "ADD"){
//            '''«operatortype»'''
//        } else {
//            ''''''
//        }
//    }
//    
//  // does this really exist?
//    private def dispatch String transformExpression(FunctionCall funcCall){
//        var newString = ""
//        for (p : funcCall.parameters){
//            newString = newString + transformParameter(p) + ","
//        }
//        '''«funcCall.functionName»(«newString.substring(0, newString.length()-1)»)'''
//    }
//    
//    private def String transformParameter(Parameter p){
//        if (p.callByReference){
//            '''*«transformExpression(p.expression)»'''
//        } else {
//            '''«transformExpression(p.expression)»'''
//        }
//    }

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