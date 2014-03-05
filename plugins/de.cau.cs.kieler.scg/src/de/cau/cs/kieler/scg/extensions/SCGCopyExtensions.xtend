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
import de.cau.cs.kieler.scgdep.Dependency
import de.cau.cs.kieler.scgdep.NodeDep
import de.cau.cs.kieler.scgdep.SCGraphDep
import de.cau.cs.kieler.scgdep.ScgdepFactory
import de.cau.cs.kieler.scgsched.SCGraphSched
import de.cau.cs.kieler.scgsched.ScgschedFactory
import de.cau.cs.kieler.scgsched.Schedule
import java.util.HashMap

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.core.kexpressions.TypeGroup
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions

/** 
 * The SCG copy extensions are used to copy SCG model data to another SCG model. 
 * The source and the target model must not be of the same transformation step. 
 * Therefore, the copy extensions can be used to execute an upgrade from one metamodel
 * to another and preserve the data in the source model.<br>
 * Since some methods need to track the object transformations between the models and
 * map objects in the source model to objects in the target model (and vice versa), 
 * the extensions perform the model copy manually and do not make use of the EcoreUtils.
 * 
 * @author ssm
 * @kieler.design 2013-11-27 proposed 
 * @kieler.rating 2013-11-27 proposed yellow
 */

class SCGCopyExtensions {
	
	@Inject
	extension KExpressionsExtension
	
	@Inject
	extension AnnotationsExtensions
     
    // -------------------------------------------------------------------------
    // -- Mapping globals 
    // -------------------------------------------------------------------------
    
    /** Node mapping */
    private val nodeMapping = new HashMap<Node, Node>
    
    /** Reverse node mapping */
    private val revNodeMapping = new HashMap<Node, Node>
    
    /** Valued object mapping */
    private val valuedObjectMapping = new HashMap<ValuedObject, ValuedObject>
    
    /** Dependency mapping */
    private val dependencyMapping = new HashMap<Dependency, Dependency>
    
    /** Basic block mapping */
    private val basicBlockMapping = new HashMap<BasicBlock, BasicBlock>
    
    /** Reverse basic block mapping */
    private val revBasicBlockMapping = new HashMap<BasicBlock, BasicBlock>
    
    /** Scheduling block mapping */
    private val schedulingBlockMapping = new HashMap<SchedulingBlock, SchedulingBlock>
    
    
    // -------------------------------------------------------------------------
    // -- Copy SCG methods
    // -------------------------------------------------------------------------

	/**
	 * Copies one SCG into another. The source and the target instance may be any SCGraph instance.
	 * Hence, the method will only copy the information that can be stored in the target instance.
	 * 
	 * @param source
	 * 			the source SCG
	 * @param target
	 * 			the target SCG
	 * @return Returns the target SCG to allow further extension chains.
	 */    
    def SCGraph copySCG(SCGraph source, SCGraph target) {
    	
    	/** 
    	 * Firstly, all target SCG instance include declaration, node and control flow information. 
    	 * Copy these first. Additionally, adjust references if necessary.
    	 */
    	
        // Copy declarations.
        source.copyDeclarations(target)
        
        // Additionally, copy all nodes and fill the mapping structures.
        for(node : source.nodes) {
            val nodeCopy = node.copySCGNode(target)
            node.copyAnnotations(nodeCopy)
            nodeMapping.put(node, nodeCopy)
            revNodeMapping.put(nodeCopy, node)
            target.nodes.add(nodeCopy)
        }

        // Add all control flows.
        target.nodes.forEach[ addControlFlow ]
        
        // Resolves all cross references.
        target.nodes.forEach[ adjustCrossReferences ]
        
        /** 
         * Secondly, if the source SCG comprises dependency data and if the target SCG can handle them, 
         * copy the dependency data also.
         */
        
        if (source instanceof SCGraphDep && target instanceof SCGraphDep) {
            source.eAllContents.filter(typeof(Dependency)).forEach[ copyDependency ]
        }
        
        /**
         * Thirdly, check both instances for basic block information. Copy basic block data if present 
         * in the source instance and storable in the target model. Since the copyBasicBlock method cannot set
         * the predecessors before all new blocks are created, adjust the predecessor list afterwards.
         */
       
        if (source instanceof SCGraphBB && target instanceof SCGraphBB) { 
            (source as SCGraphBB).basicBlocks.forEach[ copyBasicBlock(target as SCGraphBB) ]
            (target as SCGraphBB).basicBlocks.forEach[bb|
            	revBasicBlockMapping.get(bb).predecessors.forEach[pred|
            		val predecessor = ScgbbFactory::eINSTANCE.createPredecessor => [
            			it.basicBlock = basicBlockMapping.get(pred.basicBlock)
            			it.blockType = pred.blockType
			        	it.conditional = nodeMapping.get(pred.conditional) as Conditional
            		]
   	           		bb.predecessors.add(predecessor)
            	]
            ] 
        }
        
        /**
         * Finally, if both SCGs are SCGs with scheduling information, copy these information as well.
         * Set the schedulability flag and copy all included schedules.
         */
        
        if (source instanceof SCGraphSched && target instanceof SCGraphSched) {
            (target as SCGraphSched).setUnschedulable((source as SCGraphSched).unschedulable)
            (source as SCGraphSched).schedules.forEach[ copySchedule(target as SCGraphSched) ]
        }

		// Also return the target instance as result.       
        target
    }   
    
    
    // -------------------------------------------------------------------------
    // -- Copy Declarations
    // -------------------------------------------------------------------------
    
    /**
     * Copies all declarations in the source SCG to the target SCG and
     * creates a mapping entry.
     * 
     * @param source
     * 			the source SCG
     * @param target
     * 			the target SCG
     */
    public def void copyDeclarations(SCGraph source, SCGraph target) {
    	for (typeGroup : source.typeGroups) {
    		val newTypeGroup = createTypeGroupWOValuedObjects(typeGroup)
    		typeGroup.valuedObjects.forEach[ copyValuedObject(newTypeGroup) ]
    		target.typeGroups += newTypeGroup
    	}
	}     
    
    public def void copyValuedObject(ValuedObject sourceObject, TypeGroup targetTypeGroup) {
        val newValuedObject = sourceObject.copy
        targetTypeGroup.valuedObjects += newValuedObject
        valuedObjectMapping.put(sourceObject, newValuedObject)
    }
    
    
    // -------------------------------------------------------------------------
    // -- Copy Schedule 
    // -------------------------------------------------------------------------
    
    /**
     * Copies a single schedule to another SCG and adds an entry to the 
     * scheduling mapping.
     * 
     * @param schedule
     * 			The schedule in question
     * @param target
     * 			The target SCG (with scheduling information)
     * @return Returns the newly created schedule.
     */
    private def Schedule copySchedule(Schedule schedule, SCGraphSched target) {
        val sched = ScgschedFactory::eINSTANCE.createSchedule
        
        schedule.schedulingBlocks.forEach[ sched.schedulingBlocks.add(schedulingBlockMapping.get(it)) ]
        
        target.schedules.add(sched)
        sched
    }
    
    
    // -------------------------------------------------------------------------
    // -- Copy Basic Blocks 
    // -------------------------------------------------------------------------
    
    /**
     * Copies a single basic Block to a target SCG (with at least basic block information)
     * and adds an entry to the basic block mapping.<br>
     * Uses {@link #copySchedulingBlock(SchedulingBlock, BasicBlock)}.
     * 
     * @param basicBlock
     * 			the basic block in question
     * @param target
     * 			the target SCG (with basic block information)
     * @return Returns the newly create basic block.
     */
    private def BasicBlock copyBasicBlock(BasicBlock basicBlock, SCGraphBB target) {
    	// Create a new basic block.
        val bb = ScgbbFactory::eINSTANCE.createBasicBlock
        
        // Copy all guards and add them to the valued object mapping.
        basicBlock.guards.forEach[
        	val newGuard = it.copy
            bb.guards.add(newGuard)
        	valuedObjectMapping.put(it, newGuard)
        ]
        
        // Copy each scheduling block.
        basicBlock.schedulingBlocks.forEach[ it.copySchedulingBlock(bb) ]
        
        // Set the basic block flags.
        bb => [
        	blockType = basicBlock.blockType
        	goBlock = basicBlock.goBlock
        	deadBlock = basicBlock.deadBlock
        	preGuard = valuedObjectMapping.get(basicBlock.preGuard)
        ]
                
        // Add entries to the basic block mappings.
        basicBlockMapping.put(basicBlock, bb)
        revBasicBlockMapping.put(bb, basicBlock)
        
        // Add the basic block to the target SCG and return.
        target.basicBlocks.add(bb)
        bb
    }
    
    /**
     * Copies a single scheduling block and adds an entry to the scheduling block mapping.
     * 
     * @param schedulingBlock
     * 			the scheduling block in question
     * @param target
     * 			the target basic block
     * @return Returns the newly created scheduling block.
     */
    private def SchedulingBlock copySchedulingBlock(SchedulingBlock schedulingBlock, BasicBlock target) {
    	// Create new scheduling block.
        val sb = ScgbbFactory::eINSTANCE.createSchedulingBlock
        
        // Use the valued object mapping to retrieve the valued object of the guard.
        sb.guard = valuedObjectMapping.get(schedulingBlock.guard)
        
        // Use the node mapping to find all nodes of the scheduling block.
        // Add the dependencies of the nodes directly to the scheduling block. 
        schedulingBlock.nodes.forEach[
            val tnode = nodeMapping.get(it) 
            sb.nodes.add(tnode)
            sb.dependencies.addAll(tnode.incoming.filter(typeof(Dependency)))  
        ]
    
    	// Update the mapping, add the scheduling block to the basic block and return.
        schedulingBlockMapping.put(schedulingBlock, sb)    
        target.schedulingBlocks.add(sb)
        sb
    }
   
   
    // -------------------------------------------------------------------------
    // -- Copy Dependencies 
    // -------------------------------------------------------------------------

	/**
	 * Copies a single dependency and adds it to the appropriate node. 
	 * Furthermore, the target of the dependency is adjusted according to the node mapping as well.
	 * 
	 * @param dependency
	 * 			The dependency tp copy
	 * @return Returns the newly created dependency.
	 */
    private def Dependency copyDependency(Dependency dependency) {
    	// Copy the original dependency.
        var newDependency = dependency.copy;
        
        // Add the new dependency to the corresponding node in the other model. 
        (nodeMapping.get(dependency.eContainer as Node) as NodeDep).dependencies.add(newDependency)
        
        // Adjust the target of the dependency.
        newDependency.target = nodeMapping.get(dependency.target)
        
        // Add an entry to the dependency mapping and return.
        dependencyMapping.put(dependency, newDependency)
        newDependency
    }


    // -------------------------------------------------------------------------
    // -- Copy Control flow 
    // -------------------------------------------------------------------------
    
    /**  
     * The addControlFlow dispatch methods use the node mapping to add all control flows to a node.
     * Each node type has its own dispatch method. They all return the node. 
     * To be able to handle an whole SCG each node type must be covered.
     */ 
    
    /**
     * Creates the control flows for entry nodes.
     * 
     * @param entry 
     * 			an entry node
     * @return Returns the node.
     */
    private def dispatch Node addControlFlow(Entry entry) {
        val sourceEntry = revNodeMapping.get(entry) as Entry
        if (sourceEntry.next != null) {
            entry.next = ScgFactory::eINSTANCE.createControlFlow()
            entry.next.target = nodeMapping.get(sourceEntry.next.target)
        }
        entry
    }    

    /**
     * Creates the control flows for exit nodes.
     * 
     * @param exit
     * 			an exit node
     * @return Returns the node.
     */
    private def dispatch Node addControlFlow(Exit exit) {
        val sourceExit = revNodeMapping.get(exit) as Exit
        if (sourceExit.next != null) {
            exit.next = ScgFactory::eINSTANCE.createControlFlow()
            exit.next.target = nodeMapping.get(sourceExit.next.target)
        }
        exit
    }    
    
    /**
     * Creates the control flows for surface nodes, hence, none.
     * 
     * @param surface
     * 			a surface node
     * @return Returns the node.
     */
    private def dispatch Node addControlFlow(Surface surface) { 
    	surface
    }    

    /**
     * Creates the control flows for depth nodes.
     * 
     * @param depth
     * 			a depth node
     * @return Returns the node.
     */
    private def dispatch Node addControlFlow(Depth depth) {
        val sourceDepth = revNodeMapping.get(depth) as Depth
        if (sourceDepth.next != null) {
            depth.next = ScgFactory::eINSTANCE.createControlFlow();
            depth.next.target = nodeMapping.get(sourceDepth.next.target)
        }
        depth
    }     
    
    /**
     * Creates the control flows for fork nodes.
     * 
     * @param fork
     * 			a fork node
     * @return Returns the node.
     */
    private def dispatch Node addControlFlow(Fork fork) {
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

    /**
     * Creates the control flows for join nodes.
     * 
     * @param join
     * 			a join node
     * @return Returns the node.
     */
    private def dispatch Node addControlFlow(Join join) {
        val sourceJoin = revNodeMapping.get(join) as Join
        if (sourceJoin.next != null) {
            join.next = ScgFactory::eINSTANCE.createControlFlow()
            join.next.target = nodeMapping.get(sourceJoin.next.target)
        }
        join
    }
    
    /**
     * Creates the control flows for assignment nodes.
     * 
     * @param assignment
     * 			an assignment node
     * @return Returns the node.
     */
    private def dispatch Node addControlFlow(Assignment assignment) {
        val sourceAssignment = revNodeMapping.get(assignment) as Assignment
        if (sourceAssignment.next != null) {
            assignment.next = ScgFactory::eINSTANCE.createControlFlow()
            assignment.next.target = nodeMapping.get(sourceAssignment.next.target)
        }
        assignment
    }
        
    /**
     * Creates the control flows for conditional nodes.
     * 
     * @param conditional
     * 			a conditional node
     * @return Returns the node.
     */
    private def dispatch Node addControlFlow(Conditional conditional) {
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
    // -- Adjust cross references 
    // -------------------------------------------------------------------------
    
    /**
     * The adjustCrossReferences dispatch methods correct all encapsulated references (e.g. opposite relations).
     * Each node type has its own dispatch method and each type has to have a dispatch method to handle SCGs.
     */
    
    /**
     * Corrects the references of entry nodes.
     * 
     * @param entry 
     * 			an entry node
     * @return Returns the node.
     */
    private def dispatch Node adjustCrossReferences(Entry entry) {
        entry.exit = nodeMapping.get((revNodeMapping.get(entry) as Entry).exit) as Exit
        entry
    }    
    
    /**
     * Corrects the references of exit nodes.
     * 
     * @param exit
     * 			an exit node
     * @return Returns the node.
     */
    private def dispatch Node adjustCrossReferences(Exit exit) {
        exit.entry = nodeMapping.get((revNodeMapping.get(exit) as Exit).entry) as Entry
        exit
    }

    /**
     * Corrects the references of surface nodes.
     * 
     * @param surface
     * 			a surface node
     * @return Returns the node.
     */
    private def dispatch Node adjustCrossReferences(Surface surface) {
        surface.depth = nodeMapping.get((revNodeMapping.get(surface) as Surface).depth) as Depth
        surface
    }    
    
    /**
     * Corrects the references of depth nodes.
     * 
     * @param depth
     * 			a depth node
     * @return Returns the node.
     */
    private def dispatch Node adjustCrossReferences(Depth depth) {
        depth.surface = nodeMapping.get((revNodeMapping.get(depth) as Depth).surface) as Surface
        depth
    }
    
    /**
     * Corrects the references of fork nodes.
     * 
     * @param fork
     * 			a fork node
     * @return Returns the node.
     */
    private def dispatch Node adjustCrossReferences(Fork fork) {
        fork.join = nodeMapping.get((revNodeMapping.get(fork) as Fork).join) as Join
        fork
    }    
    
    /**
     * Corrects the references of join nodes.
     * 
     * @param join
     * 			ajoin node
     * @return Returns the node.
     */
    private def dispatch Node adjustCrossReferences(Join join) {
        join.fork = nodeMapping.get((revNodeMapping.get(join) as Join).fork) as Fork
        join
    }
    
    /**
     * Corrects the references of assignment nodes, hence, none.
     * 
     * @param assignment
     * 			an assignment node
     * @return Returns the node.
     */
    private def dispatch Node adjustCrossReferences(Assignment assignment) { 
    	assignment
    }

    /**
     * Corrects the references of conditional nodes, hence, none.
     * 
     * @param conditional
     * 			a conditional node
     * @return Returns the node.
     */
    private def dispatch Node adjustCrossReferences(Conditional conditional) { 
    	conditional
    }
    
    
    // -------------------------------------------------------------------------
    // -- Copy nodes 
    // -------------------------------------------------------------------------

    /**  
     * Create corresponding nodes for each SCG element and copy data.
     * Be aware of the capabilities of the target SCG.
     */
    
    /** Creates an entry node. */
    def dispatch Entry copySCGNode(Entry node, SCGraph target) { ScgFactory::eINSTANCE.createEntry }
    
    /** Create an exit node. */
    def dispatch Exit copySCGNode(Exit node, SCGraph target) { ScgFactory::eINSTANCE.createExit }
    
    /** Create a surface node. */
    def dispatch Surface copySCGNode(Surface node, SCGraph target) { ScgFactory::eINSTANCE.createSurface }
    
    /** Create a depth node. */
    def dispatch Depth copySCGNode(Depth node, SCGraph target) { ScgFactory::eINSTANCE.createDepth }
    
    /** Create a fork node. */
    def dispatch Fork copySCGNode(Fork node, SCGraph target) { ScgFactory::eINSTANCE.createFork }
    
    /** Create a join node */
    def dispatch Join copySCGNode(Join node, SCGraph target) { ScgFactory::eINSTANCE.createJoin }
    
    /** Check target capabilities and create an assignment node.  */
    def dispatch Assignment copySCGNode(Assignment node, SCGraph target) {
    	var Assignment assignment
    	if(target instanceof SCGraphDep) { 
        	assignment = ScgdepFactory::eINSTANCE.createAssignmentDep
        } else {
        	assignment = ScgFactory::eINSTANCE.createAssignment
        }
        assignment.assignment = node.assignment.copyExpression
        assignment.valuedObject = node.valuedObject.getValuedObjectCopy;
        assignment
    }

    /** Create conditional node. */
    def dispatch Conditional copySCGNode(Conditional node, SCGraph target) { 
        val conditional = ScgFactory::eINSTANCE.createConditional
        conditional.condition = node.condition.copyExpression
        conditional
    }
   
    
    // -------------------------------------------------------------------------
    // -- Copy expressions 
    // -------------------------------------------------------------------------
    
    /**
     * Returns the corresponding valued object in the target SCG 
     * to a valued object in the source SCG.
     * 
     * @param valuedObject
     * 			the valued object in the source SCG
     * @return Returns the copied valued object in the target SCG.
     */
    def ValuedObject getValuedObjectCopy(ValuedObject valuedObject) {
        valuedObjectMapping.get(valuedObject)
    }
    
    /**
     * Copies an expression and corrects all references with respect to the objects in the target SCG.
     * 
     * @param expression
     * 			the expression to copy
     * @return Returns a copy of the given expression with corrected references with respect to the target SCG.
     */
    def Expression copyExpression(Expression expression) {
    	// Use the ecore utils to copy the expression. 
        val newExpression = expression.copy
        
        if (newExpression instanceof ValuedObjectReference) {
	        // If it is a single object reference, simply replace the reference with the object of the target SCG.
            (newExpression as ValuedObjectReference).valuedObject = 
                (expression as ValuedObjectReference).valuedObject.getValuedObjectCopy                    
        } else {
        	// Otherwise, query all references in the expression and replace the object with the new copy
        	// in the target SCG.
            newExpression.eAllContents.filter(typeof(ValuedObjectReference)).
            	forEach[ valuedObject = valuedObject.getValuedObjectCopy ]        
        }
        
        // Return the new expression.
        newExpression
    }
    
//    /**
//     * Create a new reference to a valued object.
//     * 
//     * @param valuedObject
//     * 			the valued object in question
//     * @return Returns a new reference to the given object.
//     */
//    def Expression reference(ValuedObject valuedObject) {
//        val valuedObjectReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference
//        valuedObjectReference.valuedObject = valuedObject
//        valuedObjectReference
//    }
    

    // -------------------------------------------------------------------------
    // -- Copy Helper 
    // -------------------------------------------------------------------------
    
    /** 
     * Provides the possibility to add entries to the valued object mapping
     * which may be necessary in the transformation classes.
     * 
     * @param source
     * 			the source object
     * @param target
     * 			the target object
     * @return Returns the target object.
     */
    def ValuedObject addToValuedObjectMapping(ValuedObject source, ValuedObject target) {
		valuedObjectMapping.put(source, target)
		target    	
    }
    
}