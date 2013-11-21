/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.extensions

import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Surface
import java.util.List
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Depth
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scgbb.SchedulingBlock
import de.cau.cs.kieler.scgbb.SCGraphBB
import java.util.InputMismatchException

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * SCG Extensions.
 * 
 * @author cmot ssm
 * @kieler.design 2013-08-20 proposed 
 * @kieler.rating 2013-08-20 proposed yellow
 */
class SCGExtensions { 

   // -------------------------------------------------------------------------

    // Creates a new ValuedObject.
    def ValuedObject createValuedObject(String valuedObjectName) {
         val valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject();
         valuedObject.setName(valuedObjectName)
         valuedObject
    }
   
    // Creates a new ValuedObject in an SCG.
    def ValuedObject createValuedObject(SCGraph sCGraph, String valuedObjectName) {
         val valuedObject = createValuedObject(valuedObjectName)
         sCGraph.valuedObjects.add(valuedObject)
         valuedObject
    }
   

   // -------------------------------------------------------------------------
   
   def List<ControlFlow> getAllNext (Node node) {
       var List<ControlFlow> returnList = <ControlFlow> newLinkedList;
       for (eObject : node.eContents) {
           if (eObject instanceof ControlFlow) {
               returnList.add(eObject as ControlFlow);
           }
       }
       return returnList;
   }
   
   // -------------------------------------------------------------------------
   
   // Retrieves all incoming control flows at once.
   def List<ControlFlow> getAllPrevious (Node node) {
       var List<ControlFlow> returnList = <ControlFlow> newLinkedList;
       returnList.addAll(node.incoming.filter(typeof(ControlFlow)))
       return returnList;
   }
      
   // -------------------------------------------------------------------------   
    
    def List<Node> getThreadNodes (Entry entry) {
        val List<Node> returnList = <Node> newLinkedList
        val List<ControlFlow> controlFlows = <ControlFlow> newLinkedList
        returnList.add(entry)
        val exit = entry.exit
        controlFlows.addAll(entry.getAllNext)
        while(!controlFlows.empty) {
            var nextNode = controlFlows.head.target
            controlFlows.remove(0)
            if (!returnList.contains(nextNode)) returnList.add(nextNode);
            if (nextNode instanceof Surface) {
                nextNode = (nextNode as Surface).depth
                if (!returnList.contains(nextNode)) returnList.add(nextNode);                                
            }
            val nextFlows = nextNode.getAllNext.filter(e | 
                (!returnList.contains(e.target)) && (!controlFlows.contains(e)) && 
                (!e.target.equals(exit)))
            controlFlows.addAll(nextFlows)
        }
        returnList.add(exit)
        return returnList
    }    
    
   // -------------------------------------------------------------------------   

   // Finds all ancestor forks of a node.
   def List<Fork> getAncestorForks(Node node) {
       val List<Fork> returnList = <Fork> newLinkedList
       val List<ControlFlow> controlFlows = <ControlFlow> newLinkedList
       val List<ControlFlow> marked = <ControlFlow> newLinkedList
       
       controlFlows.addAll(node.getAllPrevious)
       while(!controlFlows.empty) {
           val nextControlFlow = controlFlows.head
           var prevNode = nextControlFlow.eContainer as Node
           marked.add(nextControlFlow);
           controlFlows.remove(0)
           
           if (prevNode instanceof Join) { 
               controlFlows.addAll((prevNode as Join).fork.getAllPrevious);
           }
           else if (prevNode instanceof Fork) {
               returnList.add(prevNode as Fork)
           } 
           else if (prevNode instanceof Depth) {
               controlFlows.addAll((prevNode as Depth).surface.getAllPrevious)
           } else {
               controlFlows.addAll(prevNode.getAllPrevious)           
           }
           
           for(m : marked) {
               if (controlFlows.contains(m)) controlFlows.remove(m)
           }
       }
       
       return returnList
   }

   // -------------------------------------------------------------------------
   
   def SCGraph graph(Node node) {
       var EObject nodeObj = node
       while(nodeObj != null) {
           if (nodeObj.eContainer instanceof SCGraph) return nodeObj.eContainer as SCGraph;
           nodeObj = nodeObj.eContainer
       }
       null
   }   

   // Finds all ancestor forks of a node.
   def SchedulingBlock schedulingBlock(Node node) {
       val scg = node.graph
       var SchedulingBlock myBlock = null
       if (!(scg instanceof SCGraphBB)) return null
       for (block : scg.eAllContents.toList.filter(typeof(SchedulingBlock))) {
           if (block.nodes.contains(node)) { myBlock = block }
       }
       myBlock
   }
            
}
