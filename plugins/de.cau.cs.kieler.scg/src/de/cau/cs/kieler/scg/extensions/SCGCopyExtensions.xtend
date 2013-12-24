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

import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
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
import de.cau.cs.kieler.scgbb.BasicBlock
import de.cau.cs.kieler.scgbb.SCGraphBB
import de.cau.cs.kieler.scgbb.ScgbbFactory
import de.cau.cs.kieler.scgbb.SchedulingBlock
import de.cau.cs.kieler.scgdep.AssignmentDep
import de.cau.cs.kieler.scgdep.Dependency
import de.cau.cs.kieler.scgdep.NodeDep
import de.cau.cs.kieler.scgdep.SCGraphDep
import de.cau.cs.kieler.scgdep.ScgdepFactory
import de.cau.cs.kieler.scgsched.SCGraphSched
import de.cau.cs.kieler.scgsched.ScgschedFactory
import de.cau.cs.kieler.scgsched.Schedule
import java.util.HashMap

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scgbb.ActivationExpression
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType

/** 
 * SCGCopyExtensions
 * 
 * @author ssm
 * @kieler.design 2013-11-27 proposed 
 * @kieler.rating 2013-11-27 proposed yellow
 */

// The SCG Copy Extensions manage all the work necessary to copy one SCG instance into another
// respecting different SCG specializations.
class SCGCopyExtensions {
     
    // M2M Mapping
    private val nodeMapping = new HashMap<Node, Node>
    private val revNodeMapping = new HashMap<Node, Node>
    private val valuedObjectMapping = new HashMap<ValuedObject, ValuedObject>
    private val dependencyMapping = new HashMap<Dependency, Dependency>
    private val revBasicBlockMapping = new HashMap<BasicBlock, BasicBlock>
    private val schedulingBlockMapping = new HashMap<SchedulingBlock, SchedulingBlock>
    private val basicBlockMapping = new HashMap<BasicBlock, BasicBlock>
    
    // -------------------------------------------------------------------------
    // -- Copy SCG instance 
    // -------------------------------------------------------------------------
    
    def copySCG(SCGraph source, SCGraph target) {
        // Copy declarations.
        source.copyDeclarations(target)
        
        // Additionally, copy all nodes and fill the mapping structures.
        for(node : source.nodes) {
            val nodeCopy = node.copySCGNode
            nodeMapping.put(node, nodeCopy)
            revNodeMapping.put(nodeCopy, node)
            target.nodes.add(nodeCopy)
        }

        // Add all control flows.
        target.nodes.forEach[ it.addControlFlow ]
        
        // Resolves all cross references.
        target.nodes.forEach[ it.adjustCrossReferences ]
        
        // If source and target are at least dependency specializations, copy all dependencies.
        if (source instanceof SCGraphDep && target instanceof SCGraphDep)
            source.eAllContents.filter(typeof(Dependency)).forEach[ it.copyDependency ]
       
        // If source and target are at least basic block specializations, copy all basic block information.
        if (source instanceof SCGraphBB && target instanceof SCGraphBB) { 
            (source as SCGraphBB).basicBlocks.forEach[ it.copyBasicBlock(target as SCGraphBB) ]
            (target as SCGraphBB).basicBlocks.forEach[bb|
            	revBasicBlockMapping.get(bb).predecessors.forEach[
   	           		bb.predecessors.add(basicBlockMapping.get(it))
            	]
            ] 
        }
        
        //If source and target are at least a scheduling specialization, copy all scheduling information.
        if (source instanceof SCGraphSched && target instanceof SCGraphSched) {
            (target as SCGraphSched).setUnschedulable((source as SCGraphSched).unschedulable)
            (source as SCGraphSched).schedules.forEach[ it.copySchedule(target as SCGraphSched) ]
        }
       
        target
    }   
    
    // -------------------------------------------------------------------------
    // -- Copy Declarations
    // -------------------------------------------------------------------------
    def copyDeclarations(SCGraph source, SCGraph target) {
        for(valuedObject : source.valuedObjects) {
            val newValuedObject = valuedObject.copy
            target.valuedObjects.add(newValuedObject)
            valuedObjectMapping.put(valuedObject, newValuedObject)
        }    	
    }
    
    // -------------------------------------------------------------------------
    // -- Copy Schedule 
    // -------------------------------------------------------------------------
    def copySchedule(Schedule schedule, SCGraphSched target) {
        val sched = ScgschedFactory::eINSTANCE.createSchedule
        
        schedule.schedulingBlocks.forEach[ sched.schedulingBlocks.add(schedulingBlockMapping.get(it)) ]
        
        target.schedules.add(sched)
        sched
    }
    
    // -------------------------------------------------------------------------
    // -- Copy Basic Blocks 
    // -------------------------------------------------------------------------
    def copyBasicBlock(BasicBlock basicBlock, SCGraphBB target) {
        val bb = ScgbbFactory::eINSTANCE.createBasicBlock
        basicBlock.guards.forEach[
        	val newGuard = it.copy
            bb.guards.add(newGuard)
        	valuedObjectMapping.put(it, newGuard)
        ]
        
        basicBlock.schedulingBlocks.forEach[ it.copySchedulingBlock(bb) ]
        
        bb => [
        	blockType = basicBlock.blockType
        	goBlock = basicBlock.goBlock
        	conditional = nodeMapping.get(basicBlock.conditional) as Conditional
        ]
                
        basicBlockMapping.put(basicBlock, bb)
        revBasicBlockMapping.put(bb, basicBlock)
        target.basicBlocks.add(bb)
        bb
    }
    
    def copySchedulingBlock(SchedulingBlock schedulingBlock, BasicBlock target) {
        val sb = ScgbbFactory::eINSTANCE.createSchedulingBlock
        
        sb.guard = valuedObjectMapping.get(schedulingBlock.guard)
        
        schedulingBlock.nodes.forEach[
            val tnode = nodeMapping.get(it) 
            sb.nodes.add(tnode)
            sb.dependencies.addAll(tnode.incoming.filter(typeof(Dependency)))  
        ]
    
        schedulingBlockMapping.put(schedulingBlock, sb)    
        target.schedulingBlocks.add(sb)
        sb
    }
   
    // -------------------------------------------------------------------------
    // -- Copy Dependencies 
    // -------------------------------------------------------------------------

    def copyDependency(Dependency dependency) {
        var newDependency = dependency.copy;
        (nodeMapping.get(dependency.eContainer as Node) as NodeDep).dependencies.add(newDependency)
        newDependency.target = nodeMapping.get(dependency.target)
        dependencyMapping.put(dependency, newDependency)
    }

    // -------------------------------------------------------------------------
    // -- Copy Control flow 
    // -------------------------------------------------------------------------
    
    // The control flow dispatcher copy each control flow element according to the node mapping. 
    
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
    
    def dispatch Node addControlFlow(AssignmentDep assignment) {
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
    

    // -------------------------------------------------------------------------
    // -- TRANSFORM Cross references 
    // -------------------------------------------------------------------------
    
    // The adjust dispatcher correct all encapsulated references (e.g. opposite relations).
    
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
    
    def dispatch adjustCrossReferences(AssignmentDep assignment) { }

    def dispatch adjustCrossReferences(Conditional conditional) { }
    
    
    // -------------------------------------------------------------------------
    // -- Copy SCG 
    // -------------------------------------------------------------------------

    // Create corresponding SCGDEP nodes for each SCG element.
    
    def dispatch Entry       copySCGNode(Entry       node) { ScgFactory::eINSTANCE.createEntry() }
    def dispatch Exit        copySCGNode(Exit        node) { ScgFactory::eINSTANCE.createExit() }
    def dispatch Surface     copySCGNode(Surface     node) { ScgFactory::eINSTANCE.createSurface() }
    def dispatch Depth       copySCGNode(Depth       node) { ScgFactory::eINSTANCE.createDepth() }
    def dispatch Fork        copySCGNode(Fork        node) { ScgFactory::eINSTANCE.createFork() }
    def dispatch Join        copySCGNode(Join        node) { ScgFactory::eINSTANCE.createJoin() }
    
    // Don't forget to copy the assignment expression and the valued object in assignments.
    def dispatch Assignment  copySCGNode(Assignment  node) { 
        val assignment = ScgdepFactory::eINSTANCE.createAssignmentDep()
        assignment.assignment = node.assignment.copyExpression
        assignment.valuedObject = node.valuedObject.copyValuedObject;
        assignment
    }
    
    def dispatch Assignment  copySCGNode(AssignmentDep  node) { 
        val assignment = ScgdepFactory::eINSTANCE.createAssignmentDep()
        assignment.assignment = node.assignment.copyExpression
        assignment.valuedObject = node.valuedObject.copyValuedObject;
        assignment
    }

    // Same goes for conditionals...   
    def dispatch Conditional copySCGNode(Conditional node) { 
        val conditional = ScgFactory::eINSTANCE.createConditional();
        conditional.condition = node.condition.copyExpression
        conditional
    }
   
    
    // Valued objects must be set according to the mapping!
    def ValuedObject copyValuedObject(ValuedObject valuedObject) {
        valuedObjectMapping.get(valuedObject)
    }
    
    // References in expressions must be corrected as well!
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
    
    def Expression reference (ValuedObject valuedObject) {
        val expression = KExpressionsFactory::eINSTANCE.createValuedObjectReference
        expression.valuedObject = valuedObject
        expression
    }
    
    def ValuedObject findValuedObjectByName(SCGraph scg, String name) {
    	scg.valuedObjects.filter[it.name == name]?.head
    }

    // -------------------------------------------------------------------------
    // -- Copy Helper 
    // -------------------------------------------------------------------------
    
    def addToValuedObjectMapping(ValuedObject object, ValuedObject newObject) {
		valuedObjectMapping.put(object, newObject)    	
    }
    
    def Expression splitOperatorExpression(Expression expression) {
    	if (!(expression instanceof OperatorExpression)) return expression
    	var newExp = expression as OperatorExpression
        if ((expression as OperatorExpression).subExpressions.size > 2) {
            var exp = expression.copy as OperatorExpression
            newExp = KExpressionsFactory::eINSTANCE.createOperatorExpression
            newExp.operator = exp.operator
            newExp.subExpressions.add(exp.subExpressions.get(0))
            newExp.subExpressions.add(exp.splitOperatorExpression)
        }
        newExp
    }
    
    def Expression negate(Expression expression) {
    	val nExp = KExpressionsFactory::eINSTANCE.createOperatorExpression
    	nExp.setOperator(OperatorType::NOT)
    	nExp.subExpressions.add(expression)
    	nExp
    }

    // -------------------------------------------------------------------------   
}