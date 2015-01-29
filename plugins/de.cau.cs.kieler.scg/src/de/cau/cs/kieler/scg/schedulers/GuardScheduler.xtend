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
package de.cau.cs.kieler.scg.schedulers

import com.google.inject.Inject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.KielerCompilerException
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.extensions.SCGCacheExtensions
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.analyzer.PotentialInstantaneousLoopAnalyzer
import com.google.inject.Guice
import de.cau.cs.kieler.scg.ScheduledBlock
import de.cau.cs.kieler.scg.analyzer.PotentialInstantaneousLoopResult
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import java.util.Set
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import java.util.Comparator
import java.util.Collections
import java.util.Arrays
import de.cau.cs.kieler.scg.guardCreation.AbstractGuardCreator
import de.cau.cs.kieler.scg.sequentializer.AbstractSequentializer
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.ScheduleBlock
import de.cau.cs.kieler.scg.ControlFlow

/** 
 * This class is part of the SCG transformation chain. 
 * The transformation chain is used to gather important information 
 * about the schedulability of a given SCG. This is done in several key steps. 
 * You can either call the transformation manually or use KiCo to perform a series of transformations.
 * <pre>
 * SCG 
 *   |-- Dependency Analysis                        
 *   |-- Basic Block Analysis
 *   |-- Scheduler                          <== YOU ARE HERE
 *   |-- Sequentialization (new SCG)                
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-11-27 proposed 
 * @kieler.rating 2013-11-27 proposed yellow
 */
class GuardScheduler extends AbstractScheduler {

    static final boolean DEBUG = false;

    def static void debug(String debugText) {
        debug(debugText, true);
    }

    def static void debug(String debugText, boolean lineBreak) {
        if (DEBUG) {
            if (lineBreak) {
                System.out.println(debugText);
            } else {
                System.out.print(debugText);
            }
        }
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    @Inject
    extension SCGCoreExtensions

    @Inject
    extension SCGCacheExtensions

    @Inject
    extension KExpressionsExtension

    @Inject
    extension AnnotationsExtensions

    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
    protected val topologicalSortVisited = <SchedulingBlock>newHashSet
    protected val schedulingBlockCache = new HashMap<Node, SchedulingBlock>
    protected val schedulingBlockVOCache = <ValuedObject, Set<SchedulingBlock>>newHashMap
    protected val allSchedulingBlocks = <SchedulingBlock>newHashSet
    protected var int schedulingBlockCount
    protected val guardVOCache = <ValuedObject, Guard>newHashMap

    protected val placedVOs = <ValuedObject>newHashSet

    // -------------------------------------------------------------------------
    // -- Scheduler 
    // -------------------------------------------------------------------------
    /**
     * The simple scheduler travels through the list of scheduling blocks and tries to generate their
     * guard expressions. Therefore, all preconditions, especially predecessor blocks, of a scheduling block 
     * must be met before creating such an expression. If a block cannot be processed at a time, it is skipped 
     * in this iteration and will be processed in a later one. Thus, if in one iteration no block can be processed,
     * a fixed point is reached and the graph is not scheduable by this scheduler.  
     */
    protected override SchedulingConstraints orderSchedulingBlocks(SCGraph scg) {
        val schedulingBlocks = <SchedulingBlock>newLinkedList
        scg.basicBlocks.filter[!isDeadBlock].forEach[it.schedulingBlocks.forEach[schedulingBlocks += it]]

        //        val guardList = <Guard> newArrayList => [ addAll(scg.guards.filter[ !isDead ]) ]
        new SchedulingConstraints => [
            it.schedulingBlocks = schedulingBlocks
        //        	it.guards = guardList
        ]
    }

    protected def void topologicalPlacement(
        SchedulingBlock schedulingBlock,
        Set<SchedulingBlock> remainingSchedulingBlocks,
        List<ScheduleBlock> schedule,
        SchedulingConstraints constraints,
        SCGraph scg,
        String indent
    ) {
        if (!topologicalSortVisited.contains(schedulingBlock)) {

            topologicalSortVisited.add(schedulingBlock)

            val VOR = <ValuedObject>newArrayList
            val lastVOs = <ValuedObject>newArrayList
            val addGuardBeforeScheduledBlock = <Guard>newHashSet

            val neededNodes = <Node>newHashSet

            if (schedulingBlock.guard.expression instanceof ValuedObjectReference) {
                VOR += (schedulingBlock.guard.expression as ValuedObjectReference).valuedObject
            } else {
                if (schedulingBlock.guard.expression instanceof OperatorExpression &&
                    (schedulingBlock.guard.expression as OperatorExpression).operator != OperatorType::PRE) {
                    schedulingBlock.guard.expression.eAllContents.filter(typeof(ValuedObjectReference)).map[
                        valuedObject].forEach[VOR += it]
                    for (vo : VOR) {
                        if (vo.name.startsWith(AbstractGuardCreator::CONDITIONAL_EXPRESSION_PREFIX))
                            lastVOs += vo
                    }
                    VOR -= lastVOs
                }
            }

            if (schedulingBlock != null) {
                val dependencies = schedulingBlock.getAllDependencies(scg)
                if (!dependencies.empty) {
                    System.out.print(indent + "Scheduling block" + schedulingBlock.label + " has dependencies: ")
                    for (dependency : dependencies) {
                        if (dependency.concurrent && !dependency.confluent) {
                            val sb = schedulingBlockCache.get(dependency.eContainer)
                            System.out.print(sb.label + " (" + sb.guard.valuedObject.name + ")")
                            neededNodes += dependency.target

                            // TODO: VERIFY!
                            //			                if (guard.schizophrenic) {
                            //			                    val schizoGuard = scg.guards.filter[ it.schedulingBlockLink == sb && it.schizophrenic].toList
                            //			                    if (!schizoGuard.empty) {
                            //			                        VOR += schizoGuard.head.valuedObject
                            //                                    System.out.print(" using " + schizoGuard.head.valuedObject.name)			                        
                            //			                    }
                            //			                } else {
                            VOR += sb.guard.valuedObject

                        //  			                }
                        }
                    }
                    debug("")
                }
            }

            //			if (!guard.originalObject.empty) {
            //				for(volatile : guard.originalObject) {
            ////					if (!placedVOs.contains(volatile)) {
            //						VOR -= volatile
            //						guard.expression = guard.expression.replace(volatile, TRUE)
            ////					}						
            //				}
            //			}
            
                debug(indent + "Placing scheduling block " + schedulingBlock.label + ": ", false)
                for (ref : VOR) {
                    debug(ref.name + " ", false)
                }
                debug("")

            for (ref : VOR) {
                if (!placedVOs.contains(ref)) {

                    //					val tpGuard = guardCache.get(ref)
                    val vorSBList = schedulingBlockVOCache.get(ref)
                    if (vorSBList != null) {
                        for (sb : schedulingBlockVOCache.get(ref)) {
                            sb.topologicalPlacement(remainingSchedulingBlocks, schedule, constraints, scg, indent + "  ")
                        }
                    } else {
                        addGuardBeforeScheduledBlock += guardVOCache.get(ref)
                        placedVOs += ref
                    }
                }
            }

            var placeable = true
            for (ref : VOR) {
                if (!placedVOs.contains(ref)) {

                    //					if (guard.volatile.contains(ref)) {
                    //						System.out.println(indent + ref.name + " too volatile... removing.")
                    //						guard.expression = guard.expression.replace(ref, TRUE)
                    //					} else {
                        debug(indent + ref.name + " not placed!")
                    placeable = false

                //					}
                }
            }

            neededNodes += schedulingBlock.nodes.head.incoming.filter(typeof(ControlFlow)).map[eContainer as Node]

            for (node : neededNodes) {
                var prevSB = schedulingBlockCache.get(node)
                if (!topologicalSortVisited.contains(prevSB)) {
                    debug(indent + "Previous SB is missing: " + prevSB.label)
                    prevSB.topologicalPlacement(remainingSchedulingBlocks, schedule, constraints, scg, indent + "  ")
                    if (!topologicalSortVisited.contains(prevSB)) {
                        placeable = false
                    }
                }
            }

            if (placeable) {

                for (ref : lastVOs) {
                    if (!placedVOs.contains(ref)) {

                        ////						val tpGuard = guardCache.get(ref)
                        //						for (sb : schedulingBlockVOCache.get(ref)) {
                        //							sb.topologicalPlacement(remainingSchedulingBlocks, schedule, constraints, scg, indent + "  ")
                        //						}
                        addGuardBeforeScheduledBlock += guardVOCache.get(ref)
                        placedVOs += ref
                    }
                }

                debug(indent + "  Scheduling block " + schedulingBlock.label + " placed.")

                val scheduleBlock = ScgFactory::eINSTANCE.createScheduleBlock => [
                    it.schedulingBlock = schedulingBlock
                    if (!addGuardBeforeScheduledBlock.empty) {
                        it.additionalGuards.addAll(addGuardBeforeScheduledBlock)
                    }
                ]

                schedule += scheduleBlock
                placedVOs += schedulingBlock.guard.valuedObject
                remainingSchedulingBlocks -= schedulingBlock
            }

        }

    }

    protected def boolean createSchedule(SCGraph scg, List<ScheduleBlock> schedule, SchedulingConstraints constraints,
        KielerCompilerContext context) {

        val remainingSchedulingBlocks = <SchedulingBlock>newHashSet
        remainingSchedulingBlocks += constraints.schedulingBlocks

        topologicalSortVisited.clear

        for (sb : constraints.schedulingBlocks.immutableCopy) {
            if (!topologicalSortVisited.contains(sb)) {
                sb.topologicalPlacement(remainingSchedulingBlocks, schedule, constraints, scg, "")
            }
        }

        System.out.print("Schedule: ")
        for (g : schedule) {
            System.out.print(g.schedulingBlock.label + " ")
        }
        debug("")

        remainingSchedulingBlocks.size == 0
    }

    /**
	 * The build method builds the schedules for the given SCG. It uses the information from the dependency and
	 * basic block analyses to build the guard expressions of the blocks. A schedule itself is an ordered list
	 * of scheduling blocks. The next transformation step can use this information to create a new SCG containing
	 * the guard expressions in the correct order.<br>
     * <pre>
     * Scheduler: Analyses --> Build schedule --> Optimization
     * </pre>
	 * This method is called by the interface. There is no need to call it directly.
	 * 
	 * @param scg
	 * 			the source SCG
	 * @return Returns the enriched SCG model.
	 */
    override public SCGraph schedule(SCGraph scg, KielerCompilerContext context) {

        if (scg.hasAnnotation(AbstractSequentializer::ANNOTATION_SEQUENTIALIZED)) {
            return scg
        }

        // Create a new schedule using the scgsched factory.
        val schedule = ScgFactory::eINSTANCE.createSchedule

        schedulingBlockCache.clear
        allSchedulingBlocks.clear
        schedulingBlockVOCache.clear
        scg.createSchedulingBlockCache(schedulingBlockCache)
        scg.basicBlocks.filter[!isDeadBlock].forEach [
            allSchedulingBlocks.addAll(schedulingBlocks)
            for (sb : schedulingBlocks) {
                val vo = sb.guard.valuedObject
                if (schedulingBlockVOCache.keySet.contains(vo)) {
                    val sbSet = schedulingBlockVOCache.get(vo)
                    sbSet += sbSet
                } else {
                    val sbSet = <SchedulingBlock>newHashSet
                    sbSet += sb
                    schedulingBlockVOCache.put(vo, sbSet)
                }
            }
        ]

        // Create and fill a list for all scheduling blocks.
        val schedulingConstraints = scg.orderSchedulingBlocks

        placedVOs.clear
        scg.declarations.forEach [ decl |
            placedVOs += decl.valuedObjects
        ]

        guardVOCache.clear
        scg.guards.forEach [ g |
            guardVOCache.put(g.valuedObject, g)
        ]

        val scedList = <ScheduleBlock>newLinkedList
        var schedulable = scg.createSchedule(scedList, schedulingConstraints, context)
        schedule.scheduleBlocks += scedList

        // Print out results on the console
        // and add the scheduling information to the graph.
        if (!schedulable) {
            if (context != null) {
                context.getCompilationResult().addPostponedWarning(
                    new KielerCompilerException(getId(), "The SCG is NOT ASC-schedulable!"));
            }
            System::out.println("The SCG is NOT ASC-schedulable!")
            scg.schedules.add(schedule)
        } else {
            System::out.println("The SCG is ASC-schedulable.")
            scg.schedules.add(schedule)
        }

        scg
    }

    private def Set<Dependency> getAllDependencies(SchedulingBlock schedulingBlock, SCGraph scg) {
        val returnSet = <Dependency>newHashSet;

        //    	val guard = schedulingBlock.guard
        //    	for (sb : scg.allSchedulingBlocks) {
        //    		if (sb.guard == guard) {
        //    			returnSet += sb.dependencies
        //    		}
        //    	} 
        //(schedulingBlock.eContainer as BasicBlock).schedulingBlocks.forEach[ returnSet += it.dependencies ]
        returnSet += schedulingBlock.dependencies

        returnSet
    }

}
