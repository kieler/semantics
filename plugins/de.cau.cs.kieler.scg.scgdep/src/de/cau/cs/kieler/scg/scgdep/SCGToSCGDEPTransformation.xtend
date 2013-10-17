package de.cau.cs.kieler.scg.scgdep

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.scgdep.SCGraphDep
import de.cau.cs.kieler.scgdep.ScgdepFactory
import java.util.HashMap
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow

class SCGToSCGDEPTransformation {
 
    def SCGraphDep transformSCGToSCGDEP(SCGraph scg) {
        val scgdep = ScgdepFactory::eINSTANCE.createSCGraphDep()
        
        val nodeMapping = new HashMap<Node, Node>
        val revNodeMapping = new HashMap<Node, Node>
        for(node : scg.nodes) {
            val nodeCopy = node.copySCGNode
            nodeMapping.put(node, nodeCopy)
            revNodeMapping.put(nodeCopy, node)
            scgdep.nodes.add(nodeCopy)
        }

        scgdep.nodes.forEach[ it.addControlFlow(nodeMapping, revNodeMapping) ]
        
        scgdep.nodes.forEach[ it.adjustCrossReferences(nodeMapping, revNodeMapping) ]
        
        return scgdep;
    }   
    

    def dispatch Node addControlFlow(Entry entry, HashMap<Node, Node> nodeMapping, HashMap<Node, Node> revNodeMapping) {
        val sourceEntry = revNodeMapping.get(entry) as Entry
        if (sourceEntry.next != null) {
            entry.next = ScgFactory::eINSTANCE.createControlFlow()
            entry.next.target = nodeMapping.get(sourceEntry.next.target)
        }
        entry
    }    

    def dispatch Node addControlFlow(Exit exit, HashMap<Node, Node> nodeMapping, HashMap<Node, Node> revNodeMapping) {
        val sourceExit = revNodeMapping.get(exit) as Exit
        if (sourceExit.next != null) {
            exit.next = ScgFactory::eINSTANCE.createControlFlow()
            exit.next.target = nodeMapping.get(sourceExit.next.target)
        }
        exit
    }    
    
    def dispatch Node addControlFlow(Surface surface, HashMap<Node, Node> nodeMapping, HashMap<Node, Node> revNodeMapping) { surface }    

    def dispatch Node addControlFlow(Depth depth, HashMap<Node, Node> nodeMapping, HashMap<Node, Node> revNodeMapping) {
        val sourceDepth = revNodeMapping.get(depth) as Depth
        if (sourceDepth.next != null) {
            depth.next = ScgFactory::eINSTANCE.createControlFlow();
            depth.next.target = nodeMapping.get(sourceDepth.next.target)
        }
        depth
    }     
    
    def dispatch Node addControlFlow(Fork fork, HashMap<Node, Node> nodeMapping, HashMap<Node, Node> revNodeMapping) {
        val sourceFork = revNodeMapping.get(fork) as Fork
        if (sourceFork.next.size > 0) {
            for (scf : sourceFork.next) {
              val cf = ScgFactory::eINSTANCE.createControlFlow()
              cf.target = nodeMapping.get(scf.target)
              fork.next.add(cf)
            }
        }
        fork
    }    

    def dispatch Node addControlFlow(Join join, HashMap<Node, Node> nodeMapping, HashMap<Node, Node> revNodeMapping) {
        val sourceJoin = revNodeMapping.get(join) as Join
        if (sourceJoin.next != null) {
            join.next = ScgFactory::eINSTANCE.createControlFlow()
            join.next.target = nodeMapping.get(sourceJoin.next.target)
        }
        join
    }
    
    def dispatch Node addControlFlow(Assignment assignment, HashMap<Node, Node> nodeMapping, HashMap<Node, Node> revNodeMapping) {
        val sourceAssignment = revNodeMapping.get(assignment) as Assignment
        if (sourceAssignment.next != null) {
            assignment.next = ScgFactory::eINSTANCE.createControlFlow()
            assignment.next.target = nodeMapping.get(sourceAssignment.next.target)
        }
        assignment
    }
        
    def dispatch Node addControlFlow(Conditional conditional, HashMap<Node, Node> nodeMapping, HashMap<Node, Node> revNodeMapping) {
        val sourceConditional = revNodeMapping.get(conditional) as Conditional
        if (sourceConditional.then != null) {
            conditional.then = ScgFactory::eINSTANCE.createControlFlow()
            conditional.then.target = nodeMapping.get(sourceConditional.then.target)
        }
        if (sourceConditional.getElse != null) {
            conditional.setElse(ScgFactory::eINSTANCE.createControlFlow())
            conditional.getElse.target = nodeMapping.get(sourceConditional.getElse.target)
        }
        conditional
    }
    
    
    
    def dispatch adjustCrossReferences(Entry entry, HashMap<Node, Node> nodeMapping, HashMap<Node, Node> revNodeMapping) {
        entry.exit = nodeMapping.get((revNodeMapping.get(entry) as Entry).exit) as Exit
    }    
    
    def dispatch adjustCrossReferences(Exit exit, HashMap<Node, Node> nodeMapping, HashMap<Node, Node> revNodeMapping) {
        exit.entry = nodeMapping.get((revNodeMapping.get(exit) as Exit).entry) as Entry
    }

    def dispatch adjustCrossReferences(Surface surface, HashMap<Node, Node> nodeMapping, HashMap<Node, Node> revNodeMapping) {
        surface.depth = nodeMapping.get((revNodeMapping.get(surface) as Surface).depth) as Depth
    }    
    
    def dispatch adjustCrossReferences(Depth depth, HashMap<Node, Node> nodeMapping, HashMap<Node, Node> revNodeMapping) {
        depth.surface = nodeMapping.get((revNodeMapping.get(depth) as Depth).surface) as Surface
    }
    
    def dispatch adjustCrossReferences(Fork fork, HashMap<Node, Node> nodeMapping, HashMap<Node, Node> revNodeMapping) {
        fork.join = nodeMapping.get((revNodeMapping.get(fork) as Fork).join) as Join
    }    
    
    def dispatch adjustCrossReferences(Join join, HashMap<Node, Node> nodeMapping, HashMap<Node, Node> revNodeMapping) {
        join.fork = nodeMapping.get((revNodeMapping.get(join) as Join).fork) as Fork
    }
    
    def dispatch adjustCrossReferences(Assignment assignment, HashMap<Node, Node> nodeMapping, HashMap<Node, Node> revNodeMapping) { }

    def dispatch adjustCrossReferences(Conditional conditional, HashMap<Node, Node> nodeMapping, HashMap<Node, Node> revNodeMapping) { }
    
    
    def dispatch Entry       copySCGNode(Entry       node) { ScgFactory::eINSTANCE.createEntry() }
    def dispatch Exit        copySCGNode(Exit        node) { ScgFactory::eINSTANCE.createExit() }
    def dispatch Surface     copySCGNode(Surface     node) { ScgFactory::eINSTANCE.createSurface() }
    def dispatch Depth       copySCGNode(Depth       node) { ScgFactory::eINSTANCE.createDepth() }
    def dispatch Fork        copySCGNode(Fork        node) { ScgFactory::eINSTANCE.createFork() }
    def dispatch Join        copySCGNode(Join        node) { ScgFactory::eINSTANCE.createJoin() }
    
    def dispatch Assignment  copySCGNode(Assignment  node) { 
//        val assignment = ScgFactory::eINSTANCE.createAssignment()
        val assignment = ScgdepFactory::eINSTANCE.createAssignmentDep()
        assignment.assignment = node.assignment
        assignment
    }
    
    def dispatch Conditional copySCGNode(Conditional node) { 
//        val conditional = ScgFactory::eINSTANCE.createConditional()
        val conditional = ScgdepFactory::eINSTANCE.createConditionalDep();
        conditional.condition = node.condition
        conditional
    }
}