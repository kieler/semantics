package de.cau.cs.kieler.scg.scgdep

import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scgdep.AssignmentDep
import de.cau.cs.kieler.scgdep.SCGraphDep
import de.cau.cs.kieler.scgdep.ScgdepFactory
import de.cau.cs.kieler.scgdep.Dependency
import java.util.HashMap

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.scgdep.ConditionalDep
import org.eclipse.emf.ecore.EObject
import com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGExtensions

class SCGToSCGDEPTransformation {
    
    @Inject
    extension SCGExtensions
         
    private val nodeMapping = new HashMap<Node, Node>
    private val revNodeMapping = new HashMap<Node, Node>
    private val valuedObjectMapping = new HashMap<ValuedObject, ValuedObject>
    
    def SCGraphDep transformSCGToSCGDEP(SCGraph scg) {
        val scgdep = ScgdepFactory::eINSTANCE.createSCGraphDep()
                  
        for(valuedObject : scg.valuedObjects) {
//            val newValuedObject = KExpressionsFactory::eINSTANCE.createValuedObject
//            newValuedObject.name = valuedObject.name
            val newValuedObject = valuedObject.copy
            scgdep.valuedObjects.add(newValuedObject)
            valuedObjectMapping.put(valuedObject, newValuedObject)
        }
        
        for(node : scg.nodes) {
            val nodeCopy = node.copySCGNode
            nodeMapping.put(node, nodeCopy)
            revNodeMapping.put(nodeCopy, node)
            scgdep.nodes.add(nodeCopy)
        }

        scgdep.nodes.forEach[ it.addControlFlow ]
        
        scgdep.nodes.forEach[ it.adjustCrossReferences ]
        
        scgdep.nodes.filter(typeof(AssignmentDep)).forEach[ it.createDependencies(scgdep) ]
        
        return scgdep;
    }   
    
    
    def createDependencies(AssignmentDep assignment, SCGraphDep scg) {
        val iAmAbsoluteWriter = !assignment.isRelativeWriter
        
        scg.nodes.filter(typeof(AssignmentDep)).forEach[ node |
            if (node != assignment) {
                var Dependency dependency = null
                if (node.valuedObject == assignment.valuedObject) {
                    if (iAmAbsoluteWriter && node.isRelativeWriter) {
                        dependency = ScgdepFactory::eINSTANCE.createAbsoluteWrite_RelativeWrite                        
                    } else 
                    if (iAmAbsoluteWriter && !node.isRelativeWriter) {
                        dependency = ScgdepFactory::eINSTANCE.createWrite_Write       
                    }
                } else
                if (node.assignment.isReader(assignment.valuedObject)) {
                    if (iAmAbsoluteWriter) dependency = ScgdepFactory::eINSTANCE.createAbsoluteWrite_Read
                    else dependency = ScgdepFactory::eINSTANCE.createRelativeWrite_Read    
                }
                if (dependency != null) {
                    dependency.target = node;
                    if (assignment.hasLCAF(node)) dependency.concurrent = true
                    assignment.dependencies.add(dependency);
                }
            }
        ]
        
        scg.nodes.filter(typeof(ConditionalDep)).forEach[ node |
            var Dependency dependency = null
            if (node.condition.isReader(assignment.valuedObject)) {
                if (iAmAbsoluteWriter) dependency = ScgdepFactory::eINSTANCE.createAbsoluteWrite_Read
                else dependency = ScgdepFactory::eINSTANCE.createRelativeWrite_Read    
            }
            if (dependency != null) {
                dependency.target = node;
                if (assignment.hasLCAF(node)) dependency.concurrent = true
                assignment.dependencies.add(dependency);
            }
        ]
    }
    
    def boolean isRelativeWriter(AssignmentDep assignment) {
        assignment.assignment instanceof OperatorExpression &&
        assignment.assignment.eAllContents.filter(typeof(ValuedObjectReference)).filter[ e |
            e.valuedObject == assignment.valuedObject ].size > 0
    }
    
    def boolean isReader(Expression expression, ValuedObject valuedObject) {
        if (expression instanceof ValuedObjectReference) {
            return (expression as ValuedObjectReference).valuedObject == valuedObject
        } else {
            return expression.eAllContents.filter(typeof(ValuedObjectReference)).filter[ e |
                e.valuedObject == valuedObject].size > 0
        }
    }
    
    def boolean hasLCAF(Node node1, Node node2) {
        var node1AF = node1.getAncestorForks
        var node2AF = node2.getAncestorForks
        for (node : node1AF) {
            if (node2AF.contains(node)) return true
        }
        return false
    }

    def dispatch Node addControlFlow(Entry entry) {
        val sourceEntry = revNodeMapping.get(entry) as Entry
        if (sourceEntry.next != null) {
            entry.next = ScgFactory::eINSTANCE.createControlFlow()
            entry.next.target = nodeMapping.get(sourceEntry.next.target)
        }
        entry
    }    

    def dispatch Node addControlFlow(Exit exit) {
        val sourceExit = revNodeMapping.get(exit) as Exit
        if (sourceExit.next != null) {
            exit.next = ScgFactory::eINSTANCE.createControlFlow()
            exit.next.target = nodeMapping.get(sourceExit.next.target)
        }
        exit
    }    
    
    def dispatch Node addControlFlow(Surface surface) { surface }    

    def dispatch Node addControlFlow(Depth depth) {
        val sourceDepth = revNodeMapping.get(depth) as Depth
        if (sourceDepth.next != null) {
            depth.next = ScgFactory::eINSTANCE.createControlFlow();
            depth.next.target = nodeMapping.get(sourceDepth.next.target)
        }
        depth
    }     
    
    def dispatch Node addControlFlow(Fork fork) {
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

    def dispatch Node addControlFlow(Join join) {
        val sourceJoin = revNodeMapping.get(join) as Join
        if (sourceJoin.next != null) {
            join.next = ScgFactory::eINSTANCE.createControlFlow()
            join.next.target = nodeMapping.get(sourceJoin.next.target)
        }
        join
    }
    
    def dispatch Node addControlFlow(Assignment assignment) {
        val sourceAssignment = revNodeMapping.get(assignment) as Assignment
        if (sourceAssignment.next != null) {
            assignment.next = ScgFactory::eINSTANCE.createControlFlow()
            assignment.next.target = nodeMapping.get(sourceAssignment.next.target)
        }
        assignment
    }
        
    def dispatch Node addControlFlow(Conditional conditional) {
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
    
    
    
    def dispatch adjustCrossReferences(Entry entry) {
        entry.exit = nodeMapping.get((revNodeMapping.get(entry) as Entry).exit) as Exit
    }    
    
    def dispatch adjustCrossReferences(Exit exit) {
        exit.entry = nodeMapping.get((revNodeMapping.get(exit) as Exit).entry) as Entry
    }

    def dispatch adjustCrossReferences(Surface surface) {
        surface.depth = nodeMapping.get((revNodeMapping.get(surface) as Surface).depth) as Depth
    }    
    
    def dispatch adjustCrossReferences(Depth depth) {
        depth.surface = nodeMapping.get((revNodeMapping.get(depth) as Depth).surface) as Surface
    }
    
    def dispatch adjustCrossReferences(Fork fork) {
        fork.join = nodeMapping.get((revNodeMapping.get(fork) as Fork).join) as Join
    }    
    
    def dispatch adjustCrossReferences(Join join) {
        join.fork = nodeMapping.get((revNodeMapping.get(join) as Join).fork) as Fork
    }
    
    def dispatch adjustCrossReferences(Assignment assignment) { }

    def dispatch adjustCrossReferences(Conditional conditional) { }
    
    
    def dispatch Entry       copySCGNode(Entry       node) { ScgFactory::eINSTANCE.createEntry() }
    def dispatch Exit        copySCGNode(Exit        node) { ScgFactory::eINSTANCE.createExit() }
    def dispatch Surface     copySCGNode(Surface     node) { ScgFactory::eINSTANCE.createSurface() }
    def dispatch Depth       copySCGNode(Depth       node) { ScgFactory::eINSTANCE.createDepth() }
    def dispatch Fork        copySCGNode(Fork        node) { ScgFactory::eINSTANCE.createFork() }
    def dispatch Join        copySCGNode(Join        node) { ScgFactory::eINSTANCE.createJoin() }
    
    def dispatch Assignment  copySCGNode(Assignment  node) { 
//        val assignment = ScgFactory::eINSTANCE.createAssignment()
        val assignment = ScgdepFactory::eINSTANCE.createAssignmentDep()
        assignment.assignment = node.assignment.copyExpression
        assignment.valuedObject = node.valuedObject.copyValuedObject;
        assignment
    }
    
    def dispatch Conditional copySCGNode(Conditional node) { 
//        val conditional = ScgFactory::eINSTANCE.createConditional()
        val conditional = ScgdepFactory::eINSTANCE.createConditionalDep();
        conditional.condition = node.condition.copyExpression
        conditional
    }
    
    def ValuedObject copyValuedObject(ValuedObject valuedObject) {
        valuedObjectMapping.get(valuedObject)
    }
    
    def Expression copyExpression(Expression expression) {
        val newExpression = expression.copy
        if (newExpression instanceof ValuedObjectReference) {
            (newExpression as ValuedObjectReference).valuedObject = 
                (expression as ValuedObjectReference).valuedObject.copyValuedObject                    
        } else {
            newExpression.eAllContents.filter(typeof(ValuedObjectReference)).forEach[ vor |
                vor.valuedObject = vor.valuedObject.copyValuedObject ]        
        }
        newExpression
    }

   // -------------------------------------------------------------------------   
}