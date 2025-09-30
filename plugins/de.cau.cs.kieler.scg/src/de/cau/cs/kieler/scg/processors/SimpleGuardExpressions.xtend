/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.processors

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.BranchType
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.ForkType
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Predecessor
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import de.cau.cs.kieler.scg.extensions.SCGSequentialForkExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import de.cau.cs.kieler.scg.extensions.UnsupportedSCGException
import de.cau.cs.kieler.scg.processors.synchronizer.SynchronizerSelector
import java.util.HashMap
import java.util.List

import static de.cau.cs.kieler.scg.processors.SCGAnnotations.*

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/** 
 * This class is part of the SCG transformation chain. The chain is used to gather information 
 * about the schedulability of a given SCG. This is done in several key steps. Contrary to the first 
 * version of SCGs, there is only one SCG meta-model. In each step the gathered data will be added to 
 * the model. 
 * You can either call the transformation manually or use KiCo to perform a series of transformations.
 * <pre>
 * SCG 
 *   |-- Dependency Analysis 	 					
 *   |-- Basic Block Analysis				
 *   |-- Scheduler
 *   |-- Sequentialization (new SCG)	<== YOU ARE HERE
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-12-05 proposed 
 * @kieler.rating 2013-12-05 proposed yellow
 */
class SimpleGuardExpressions extends InplaceProcessor<SCGraphs> implements Traceable {
    
    /** Name of the term signal. */
    public static val String TERM_GUARD_NAME = "_TERM"
    public static val String GO_GUARD_NAME = "_GO"
    public static val String CONDITIONAL_EXPRESSION_PREFIX = "_c"   
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.expressions"
    }
    
    override getName() {
        "Expressions"
    }

    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGDeclarationExtensions
    @Inject extension SCGDependencyExtensions
    @Inject extension SCGThreadExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsComplexCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SynchronizerSelector
    @Inject extension KEffectsExtensions
    @Inject extension SCGMethodExtensions
    @Inject extension SCGSequentialForkExtensions

    protected val schedulingBlocks = <SchedulingBlock>newArrayList
    protected val schedulingBlockCache = new HashMap<Node, SchedulingBlock>
    protected val schedulingBlockGuardCache = <Guard, SchedulingBlock>newHashMap

    /** Caching for predecessors */
    protected val predecessorTwinCache = <Predecessor, Predecessor>newHashMap
    protected val predecessorBBCache = <BasicBlock, List<Predecessor>>newHashMap
    protected val predecessorSBCache = <Predecessor, List<SchedulingBlock>>newHashMap
    protected val predecessorTwinMark = <SchedulingBlock>newHashSet

    protected val conditionalGuards = <Conditional, Guard>newHashMap
    
    
    override process() {
        for (scg : model.scgs.ignoreMethods) {
            scg.process
        }
    }
    
    protected def SCGraph process(SCGraph scg) {
        val voStore = VariableStore.getVariableStore(environment)
        
        scg.addTagAnnotation(ANNOTATION_GUARDCREATOR)

        //        schizoDeclaration = createDeclaration=>[ setType(ValueType::BOOL) ]
        val predecessorList = <Predecessor>newArrayList
        val basicBlockList = <BasicBlock>newArrayList
        scg.createGOSignal

        conditionalGuards.clear
        val conditionalDeclaration = createBoolDeclaration => [ 
        	scg.declarations += it
        ]

        //        newSchizoGuards.clear
        schedulingBlocks.clear
        schedulingBlockCache.clear
        schedulingBlockGuardCache.clear
        for (basicBlock : scg.basicBlocks) {
            predecessorList += basicBlock.predecessors
            for (schedulingBlock : basicBlock.schedulingBlocks) {
                schedulingBlocks += schedulingBlock
                for (node : schedulingBlock.nodes) {
                    schedulingBlockCache.put(node, schedulingBlock)
                    schedulingBlockGuardCache.put(schedulingBlock.guards.head, schedulingBlock)
                }
            }
        }

        // Create the predecessor caches for each predecessor.
        predecessorList.forEach [ p |
            if (p.branchType == BranchType::TRUEBRANCH) {
                p.cacheTwin(basicBlockList)
            } else if (p.branchType == BranchType::ELSEBRANCH) {
                p.cacheTwin(basicBlockList)
            }
            val conditional = p.conditional
            if (conditional !== null && !conditionalGuards.keySet.contains(conditional)) {
                val newVO = KExpressionsFactory::eINSTANCE.createValuedObject
                newVO.name = CONDITIONAL_EXPRESSION_PREFIX + p.basicBlock.schedulingBlocks.head.guards.head.valuedObject.name.replaceFirst("^_", "")

                val newGuard = ScgFactory::eINSTANCE.createGuard
                newGuard.valuedObject = newVO
                newGuard.expression = conditional.condition.copy
                scg.guards += newGuard

                conditionalGuards.put(conditional, newGuard)
                conditionalDeclaration.valuedObjects += newVO
                voStore.update(newVO, "guard", "conditionalGuard")
                
                KEffectsFactory::eINSTANCE.createControlDependency => [
	                conditional.dependencies += it
	                it.target = newGuard
                ] 
            }
        ]

        for (schedulingBlock : schedulingBlocks) {
            schedulingBlock.guards.head.createGuardEquation(schedulingBlock, scg)
        }
        
        scg     	
    }

    /**
     * createGuardExpression creates an expression for a guard of a specific scheduling block.
     * 
     * @param schedulingBlock
     *          the scheduling block in question.
     * @param scg
     *          the SCG
     * @return Returns the guard expression.
     * @throws UnsupportedSCGException 
     *      Throws an UnsupportedSCGException if a standard guarded block has no predecessor information.
     */
    protected def void createGuardEquation(Guard guard, SchedulingBlock schedulingBlock, SCGraph scg) {

        // Query the basic block of the scheduling block.
        val basicBlock = schedulingBlock.basicBlock

        /*if (guard.schizophrenic && basicBlock.entryBlock && 
        	((basicBlock.schedulingBlocks.head.nodes.head as Entry).allPrevious.head as Fork).join.getSynchronizer.id 
        	== DepthJoinSynchronizer::SYNCHRONIZER_ID
        ) {
            guard.expression = FALSE
        } else {      */
        /** 
         * If the scheduling block is the first scheduling block in the basic block,
         * create an appropriate expression for the activity state of this guard.
         * A more accurate description of the interconnectivity between the activity states
         * of the basic blocks can be found in rtsys:ssm-dt, 2013.
         */
        // Is the scheduling block the first scheduling block of the basic block?
        if (basicBlock.schedulingBlocks.head == schedulingBlock) {
            if (basicBlock.goBlock) {

                /**
                 * If the basic block is a GO block, meaning it should be active when the programs starts,
                 * add a reference to the GO signal as expression for the guard.
                 */
                guard.createGoBlockGuardExpression(schedulingBlock, scg)
            } else if (basicBlock.depthBlock) {

                /**
                 * If the basic block is a depth block, meaning it is delayed in its execution,
                 * add a pre operator expression as expression for the guard.
                 */
                guard.createDepthBlockGuardExpression(schedulingBlock, scg)
            } else if (basicBlock.synchronizerBlock) {

                /**
                 * If the basic block is a surface block, meaning it is responsible for joining concurrent threads,
                 * invoke a synchronizer. The synchronizer will create the guard expression for this node.
                 * Additionally, the synchronizer may create new valued objects mandatory for the expression.
                 * These must be added to the graph in order to be serializable later on. 
                 */
                guard.createSynchronizerBlockGuardExpression(schedulingBlock, scg)

            //                if (joinData.synchronizerId == DepthJoinSynchronizer::SYNCHRONIZER_ID ||
            //                	scheduledBlock.schizophrenic
            //                ) {
            //                    assignment.assignment = scg.fixSchizophrenicExpression(assignment.assignment)
            //                }
            } else {

                /**
                 * If the block is neither of them, it solely depends on the activity states of previous basic blocks.
                 * At least one block must be active to activate the current block. Therefore, connect all guards
                 * of the predecessors with OR expressions.
                 */
                guard.createStandardBlockGuardExpression(schedulingBlock, scg)
            }
        } else {

            /**
             * If the scheduling block is not the first scheduling block in the basic block, it is active 
             * if and only if its basic block, and in this case the first scheduling block of the basic block,
             * is active but possibly at a later stage in the net list. Add a reference of the guard of the first
             * scheduling block as expression.
             * 
             * HINT: There were some concerns that the expression would maybe evaluate differently at a later stage in 
             * the net list and that the whole expression must be re-evaluated at that particular point of time.
             * However, due to the rules valid for the basic block and scheduling block creation, this scenario 
             * cannot occur. A difference of guard evaluation with respect to data dependencies can only occur 
             * between conditional nodes but conditional nodes force the create of new basic blocks after their execution.
             * Therefore, there will always be a new basic block with a new guard expression in this scenario.
             */
            guard.createSubsequentSchedulingBlockGuardExpression(schedulingBlock, scg)
        }

    }

    // --- CREATE GUARDS: GO BLOCK 
    protected def void createGoBlockGuardExpression(Guard guard, SchedulingBlock schedulingBlock, SCGraph scg) {
//        guard.setDefaultTrace
        guard.expression = scg.findValuedObjectByName(GO_GUARD_NAME).reference
    }

    // --- CREATE GUARDS: DEPTH BLOCK 
    protected def void createDepthBlockGuardExpression(Guard guard, SchedulingBlock schedulingBlock, SCGraph scg) {
//        guard.setDefaultTrace
        var Expression firstExpression = createPreExpression(schedulingBlock.basicBlock.preGuard.reference)
        
        val ownEntry = schedulingBlock.nodes.head?.threadEntry
        val forks = ownEntry?.ancestorForks
        
        if (forks !== null && forks.exists[join.any]) { // Weak abort
            // Join.any joins as soon any thread terminates and weakly aborts all remaining threads
            // Kill a weakly aborted threads by checking if it was join in the last tick
            // Hence, overrule pre(guard) guard with pre(join)
            val joinKill = not(or(forks.map[join].filter[any && !it.basicBlock.deadBlock]
                .map[createPreExpression(it.schedulingBlockCached.createGuardRef)].toList))
            
            // But only if surface node of depth is not in thread surface and could be revived by thread reincanation
            // TODO Currently only works for single revival by next ancestor par-or fork
            val surface = schedulingBlock.nodes.head.asDepth.surface
            val firstFeedbackFork = forks.findFirst[join.any && !it.basicBlock.deadBlock && it.join.immediateFeedback]
            var _ownEntryInFork = ownEntry
            if (firstFeedbackFork !== null) {
                val entries = firstFeedbackFork.allNextNodes.filter(Entry).toList
                while (_ownEntryInFork !== null && !entries.contains(_ownEntryInFork)) {
                    _ownEntryInFork = _ownEntryInFork.threadEntry
                }
            }
            val ownEntryInFork = _ownEntryInFork // finalize
            
            // Can be revived if entry in feedback fork can instantaneously reach the surface node
            val revivalPaths = ownEntryInFork?.getInstantaneousControlFlows(surface).toList
            if (firstFeedbackFork !== null && !revivalPaths.empty) {
                // Find guard expression that indicates revival.
                // There are some aspects to consider:
                //  - Entry might have reached exit or another surface node
                //  - A path from this depth to its surface shares nodes with thet path from entry to the surface node
                var Expression revival
                
                // Find node that is only active upon revival or exclude all other paths
                // This requires a fixpoint iteration to not accept paths depending on paths that are dropped later
                var unambigousPaths = revivalPaths
                var searchPaths = true
                while(searchPaths) {
                    val allPathCFs = unambigousPaths.flatten.toSet
                    val filteredPaths = revivalPaths.filter[it.forall[
                        val source = it.sourceNode
                        // If not entry or join, all incoming must be on a path to source
                        return ((source instanceof Entry) || (source instanceof Join) || source.allPrevious.forall[allPathCFs.contains(it)])
                            && ((source instanceof Fork) || source.allNext.forall[allPathCFs.contains(it)])
                    ]].toList
                    filteredPaths.removeIf[empty]
                    unambigousPaths = filteredPaths
                    searchPaths = !filteredPaths.empty && filteredPaths.size !== unambigousPaths.size
                }
                if (!unambigousPaths.empty) {
                    revival = createPreExpression(unambigousPaths.head.last.sourceNode.schedulingBlock.createGuardRef)
                } else {
                    val nonRevivalPathTaken = ownEntryInFork.threadNodes.filter(Surface).filter[ // all surface nodes in suface
                        it !== surface // not own surface
                        && ownEntryInFork.hasInstantaneousControlFlowTo(it) // instantanously reachable
                    ].map[it as Node].toList
                    // Also consider immediate termination
                    if (!ownEntry.exit.schedulingBlockCached.basicBlock.deadBlock && ownEntryInFork.hasInstantaneousControlFlowTo(ownEntry.exit)) {
                        nonRevivalPathTaken += ownEntry.exit
                    }
                    
                    revival = createPreExpression(ownEntry.schedulingBlock.createGuardRef)
                    if (!nonRevivalPathTaken.empty) {
                        revival = and(revival, not(or(nonRevivalPathTaken.map[createPreExpression(ownEntry.exit.schedulingBlock.createGuardRef)])))
                    }
                }
                firstExpression = and(firstExpression, or(joinKill, revival))
            } else {
                firstExpression = and(firstExpression, joinKill)
            }
            
        }
        
        if (forks !== null && forks.exists[nonParallel]) { // Sequential start and strong abort
            val guards = <Expression>newArrayList(firstExpression)
            for (fork : forks.filter[nonParallel]) {
                // Special guards for depths in sequential forks
                val entries = fork.allNextNodes.filter(Entry).toList
                var ownEntryInFork = ownEntry
                while (ownEntryInFork !== null && !entries.contains(ownEntryInFork)) {
                    ownEntryInFork = ownEntryInFork.threadEntry
                }
                if (entries.head !== ownEntryInFork) { // Not first
                    if (fork.type === ForkType.SEQUENTIAL_PREEMPTIVE) { // Strong abort
                        // Suppress start from this depth if previous thread exited this tick
                        //val leftExit = entries.get(entries.indexOf(ownEntryInFork) - 1).exit
                        //guards += not(leftExit.schedulingBlockCached.createGuardRef) 
                        // NEW
                        // Suppress start from this depth if any previous thread exited this tick
                        val leftExits = entries.take(entries.indexOf(ownEntryInFork) - 1).map[exit].toList
                        val leftExitSBs = leftExits.map[schedulingBlockCached].filter[!it.basicBlock.deadBlock].toList
                        if (!leftExitSBs.empty) {
                            guards += not(or(leftExitSBs.map[createGuardRef].toList))
                        }
                    }
                    // The Guard transformation will take care of introducing appropriate 
                    // control dependencies to order the threads
                }
            }
            
            guard.expression = and(guards)
        } else if (schedulingBlock.basicBlock.finalBlock) {
            // FIXME Does not work with par-or (redundant behavior)
            val joinNode = schedulingBlock.basicBlock.threadEntry.allPrevious.map[eContainer].head.asNode.asFork.join
            val joinBlock = schedulingBlockCache.get(joinNode)
            if (!joinBlock.basicBlock.deadBlock) {
                val joinNodeGuard = schedulingBlockCache.get(joinNode).guards.head
                val secondExpression = (KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                    setOperator(OperatorType::PRE)
                    subExpressions.add(joinNodeGuard.reference.valuedObject.reference)
                ]).negate
                
                val surface = schedulingBlock.nodes.head.asDepth.surface
                val forkNodeGuard = schedulingBlockCache.get(joinNode.fork).guards.head
                val considerForkGuard = joinNode.immediateFeedback && surface.isInSurface
                
                val thirdExpression = if (considerForkGuard)
                    KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                       setOperator(OperatorType::LOGICAL_OR)
                        subExpressions.add(secondExpression)
                        subExpressions.add(
                            KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                                setOperator(OperatorType::PRE)
                                subExpressions.add(forkNodeGuard.reference.valuedObject.reference)
                            ]                        
                        )
                    ]                 
                    else secondExpression
                
                guard.expression = and(firstExpression, thirdExpression)
            } else {
                guard.expression = firstExpression
            }
        } else {
            guard.expression = firstExpression 
        }        
//        guard.expression = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
//            setOperator(OperatorType::PRE)
//            subExpressions.add(schedulingBlock.basicBlock.preGuard.reference)
//        ]
    }

    // --- CREATE GUARDS: SYNCHRONIZER BLOCK 
    protected def void createSynchronizerBlockGuardExpression(Guard guard, SchedulingBlock schedulingBlock, SCGraph scg) {
//        guard.setDefaultTrace
        // The simple scheduler uses the SurfaceSynchronizer. 
        // The result of the synchronizer is stored in the synchronizerData class joinData.
        val join = schedulingBlock.nodes.head as Join
        if (!join.hasAnnotation(SynchronizerSelector::ANNOTATION_SELECTEDSYNCHRONIZER)) {
            val sync = join.chooseSynchronizer
            sync.annotate(join)
        }
        val synchronizer = join.getSynchronizer

        synchronizer.synchronize(schedulingBlock.nodes.head as Join, guard, schedulingBlock, scg, schedulingBlockCache)
                
        // Add empty guards to VariableStore
        val voStore = VariableStore.get(environment)
        synchronizer.newGuards.forEach[
            voStore.update(it.valuedObject, "guard", "emptyGuard")
        ]

    }

    // --- CREATE GUARDS: STANDARD BLOCK 
    protected def void createStandardBlockGuardExpression(Guard guard, SchedulingBlock schedulingBlock, SCGraph scg) {
//        guard.setDefaultTrace
        val basicBlock = schedulingBlock.basicBlock

        val relevantPredecessors = <Predecessor> newLinkedList
        relevantPredecessors += basicBlock.predecessors.filter[ !it.basicBlock.deadBlock ].toList

        // If there are more than one predecessor, create an operator expression and connect them via OR.
        if (relevantPredecessors.size > 1) {
            // Create OR operator expression via kexpressions factory.
            val expr = KExpressionsFactory::eINSTANCE.createOperatorExpression
            expr.setOperator(OperatorType::LOGICAL_OR)

            // For each predecessor add its expression to the sub expressions list of the operator expression.
            relevantPredecessors.forEach [
                //                if (!scheduledBlock.schizophrenic || it.basicBlock.entryBlock)
                expr.subExpressions += guard.predecessorExpression(it, schedulingBlock, scg)
            ]
            guard.expression = expr
        } 
        // If it is exactly one predecessor, we can use its expression directly.
        else if (relevantPredecessors.size == 1) {
            val pred = relevantPredecessors.head
            if (pred.isNonParalellFork) {
                // Special guards for entries with sequential forks.
                // Only start an entry node, if left-hand thread is finished (ran into surface or exited).
                // Preemtion in first tick is achieved by not considering exit as trigger.
                // SimpleGuardTransformation will take that this entry is placed after all (surface) nodes 
                // in the previous thread, otherwise this might not work because entry only depends on the
                // previous surface.
                val fork = pred.basicBlock.fork
                val ownEntry = schedulingBlock.nodes.head as Entry
                
                val entries = fork.allNextNodes.filter(Entry).toList
                if (entries.head !== ownEntry && fork.type === ForkType.SEQUENTIAL_PREEMPTIVE) { // Strong abort
                    // If this may be preempted by any preceeding thread, add exit check.
                    val prevEntries = entries.takeWhile[it !== ownEntry].toList
                    val prevExitSBs = prevEntries.map[it.exit.schedulingBlockCached].filter[!it.basicBlock.deadBlock].toList
                    var Expression preemtionExpression = null
                    if (!prevExitSBs.empty) {
                        preemtionExpression = not(or(prevExitSBs.map[createGuardRef])) // not any prev exit active
                    }
                                        
                    // Check if thread could be reincarated
                    // TODO Currently only works for single revival by next ancestor par-or fork
                    if (fork.join.immediateFeedback && fork.join.any) {
                        val relevantThreadTypes = prevEntries.map[
                            it.getStringAnnotationValue(ANNOTATION_CONTROLFLOWTHREADPATHTYPE).fromString2
                        ].toList
                        if (relevantThreadTypes.exists[it == ThreadPathType.UNKNOWN]) {
                            environment.errors.add("Cannot handle thread reincarnation without thread type information", ownEntry, true)
                        } else if (relevantThreadTypes.forall[it == ThreadPathType.DELAYED]) {
                            val reincarate = or(prevEntries.map[
                                and(it.schedulingBlockCached.createGuardRef,
                                    it.exit.schedulingBlockCached.createGuardRef
                                    )]
                                )
                            if (preemtionExpression === null) {
                                preemtionExpression = reincarate
                            } else {
                                preemtionExpression = or(preemtionExpression, reincarate)
                            }
                        } else {
                            environment.errors.add("Cannot handle thread reincarnation with (potentially) instantaneous threads", ownEntry, true)
                        }
                    }
                    
                    if (preemtionExpression === null) {
                        guard.expression = guard.predecessorExpression(pred, schedulingBlock, scg)
                    } else {
                        guard.expression = and(guard.predecessorExpression(pred, schedulingBlock, scg), preemtionExpression)
                    }                               
                } else {
                    // If first or not preempted, start immediately.
                    // The Guard transformation will take care of introducing appropriate 
                    // control dependencies to order them
                    guard.expression = guard.predecessorExpression(pred, schedulingBlock, scg)
                }
            } else {
                guard.expression = guard.predecessorExpression(pred, schedulingBlock, scg)
            }
        } else {

            /**
            * If we reach this point, the basic block contains no predecessor information but is not marked as go block.
            * This is not supported by this scheduler: throw an exception. 
            */
            if (!basicBlock.deadBlock) {
                throw new UnsupportedSCGException("Cannot handle standard guard without predecessor information!")
            } else {
                guard.expression = FALSE
            }
        }
    }

    // --- CREATE GUARDS: SUBSEQUENT SCHEDULING BLOCK 
    protected def void createSubsequentSchedulingBlockGuardExpression(Guard guard, SchedulingBlock schedulingBlock,
        SCGraph scg) {
//        guard.setDefaultTrace
        guard.expression = schedulingBlock.basicBlock.schedulingBlocks.head.createGuardRef
    }
    
    /**
     * PredecessorExpression forms a single expression with respect to the predecessor,
     * meaning that the expression is a reference to the guard of the predecessor and
     * combined with the (negated) expression of a condition in the case of a 
     * conditional predecessor.
     *  
     * @param predecessor
     *          The predecessor in question.
     * @return Returns the expression for this predecessor.
     * @throws UnsupportedSCGException
     *      Throws an UnsupportedSCGException if the predecessor does not contain sufficient information to form the expression.
     */
    protected def Expression predecessorExpression(Guard guard, Predecessor predecessor, SchedulingBlock schedulingBlock,
        SCGraph scg) {
//        guard.setDefaultTrace
        // Return a solely reference as expression if the predecessor is not a conditional
        if (predecessor.branchType == BranchType::NORMAL) {
            return predecessor.basicBlock.schedulingBlocks.last.createGuardRef
        }
        // If we are in the true branch of the predecessor, combine the predecessor guard reference with
        // the condition of the conditional and return the expression.
        else if (predecessor.branchType == BranchType::TRUEBRANCH) {
            val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression
            expression.setOperator(OperatorType::LOGICAL_AND)
            expression.subExpressions += predecessor.basicBlock.schedulingBlocks.last.createGuardRef
            expression.subExpressions += conditionalGuards.get(predecessor.conditional).valuedObject.reference

            // Conditional branches are mutual exclusive. Since the other branch may modify the condition 
            // make sure the subsequent branch will not evaluate to true if the first one was already taken.
            val twin = predecessor.getSchedulingBlockTwin(BranchType::ELSEBRANCH, scg)
            if (predecessorTwinMark.contains(twin)) {
//                val twinVOR = twin.guards.head.valuedObject.reference

            //            	guard.volatile += twinVOR.valuedObject
            //                expression.subExpressions.add(0, twinVOR.negate)
            }
            predecessorTwinMark.add(schedulingBlock)

            return expression
        }
        // If we are in the true branch of the predecessor, combine the predecessor guard reference with
        // the negated condition of the conditional and return the expression.
        else if (predecessor.branchType == BranchType::ELSEBRANCH) {
            val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression
            expression.setOperator(OperatorType::LOGICAL_AND)
            expression.subExpressions += predecessor.basicBlock.schedulingBlocks.last.createGuardRef
            expression.subExpressions += conditionalGuards.get(predecessor.conditional).valuedObject.reference.negate

            // Conditional branches are mutual exclusive. Since the other branch may modify the condition 
            // make sure the subsequent branch will not evaluate to true if the first one was already taken.
            val twin = predecessor.getSchedulingBlockTwin(BranchType::TRUEBRANCH, scg)
            if (predecessorTwinMark.contains(twin)) {
//                val twinVOR = twin.guards.head.valuedObject.reference

            //            	guard.volatile += twinVOR.valuedObject
            //                expression.subExpressions.add(0, twinVOR.negate)
            }
            predecessorTwinMark.add(schedulingBlock)

            return expression
        }

        throw new UnsupportedSCGException(
            "Cannot create predecessor expression without predecessor block type information.")
    }
    
    def SchedulingBlock getSchedulingBlockCached(Node n) {
        return schedulingBlockCache.get(n)
    }
    
    def ValuedObjectReference createGuardRef(SchedulingBlock sb) {
        return sb.guards.head.valuedObject.reference
    }

    protected def SchedulingBlock getSchedulingBlockTwin(Predecessor predecessor, BranchType blockType, SCGraph scg) {
        val twin = predecessorTwinCache.get(predecessor)
        predecessorSBCache.get(twin)?.head
    }

    private def cacheTwin(Predecessor predecessor, List<BasicBlock> basicBlocks) {
        val bb = predecessor.basicBlock
        var predList = predecessorBBCache.get(bb)
        if (predList === null) {
            predList = <Predecessor>newArrayList => [add(predecessor)]
            predecessorBBCache.put(bb, predList)
        } else {
            val fPred = predList.get(0)
            predList.add(predecessor)
            predecessorTwinCache.put(fPred, predecessor)
            predecessorTwinCache.put(predecessor, fPred)

            val sbList1 = <SchedulingBlock>newArrayList
            val basicBlock1 = fPred.eContainer as BasicBlock
            sbList1 += basicBlock1.schedulingBlocks.head
            predecessorSBCache.put(fPred, sbList1)

            val sbList2 = <SchedulingBlock>newArrayList
            val basicBlock2 = predecessor.eContainer as BasicBlock
            sbList2 += basicBlock2.schedulingBlocks.head
            predecessorSBCache.put(predecessor, sbList2)
        }
    }

    /*    protected def Expression fixSchizophrenicExpression(SCGraph scg, Expression expression) {
        if (expression instanceof ValuedObjectReference) {
            val vor = (expression as ValuedObjectReference)
            val newVO = schizoDeclaration.findValuedObjectByName(vor.valuedObject.name + SCHIZOPHRENIC_SUFFIX)
            if (newVO != null) {
                vor.valuedObject = newVO 
            }
        } else if (expression instanceof OperatorExpression) {
            val vors = (expression as OperatorExpression).eAllContents.filter(typeof(ValuedObjectReference))
            for(vor : vors.toIterable) {
                val newVO = schizoDeclaration.findValuedObjectByName(vor.valuedObject.name + SCHIZOPHRENIC_SUFFIX)
                if (newVO != null) {
                    vor.valuedObject = newVO 
                }
            }
        }
        
        expression
    }*/
    def ValuedObject findValuedObjectByName(Declaration declaration, String name) {
        for (vo : declaration.valuedObjects) {
            if(vo.name.equals(name)) return vo
        }
        return null
    }


    private def immediateFeedback(Join join) {
        join.nodeExistsPath(join.fork, false)
    }
    
    private def isInSurface(Node node) {
        val visited = <Node> newHashSet
        val searchStack = <Node> newLinkedList => [ add(node) ]
        
        while (!searchStack.empty) {
            val head = searchStack.pop
            
            if (head instanceof Entry) {
                return true
            }
            
            visited += head
            val nextNodes = head.allPrevious?.map[ eContainer ].filter(Node).
                filter[ !(it instanceof Depth) ].
                filter[ !visited.contains(it) ].toList
            if (nextNodes !== null && nextNodes.contains(null)) {
                throw new IllegalStateException("The successor node list in the surface check has a null entry. This should not happen!")
            }
            searchStack.addAll(nextNodes)
        }
        
        return false
    }
    
    /**
     * To form (circuit like) guard expression a GO signal must be created.  
     * It is needed in the guard expression of blocks that are active
     * when the program starts.
     */
    protected def ValuedObject createGOSignal(SCGraph scg) {
        // Create a new signal using the kexpression factory for the GO signal.
        // Don't forget to add it to the SCG.
        createValuedObject(GO_GUARD_NAME) => [
            scg.declarations += createBoolDeclaration.attach(it)    
            VariableStore.get(environment).update(it, "guard", "goGuard")
        ]
    }    
        
}
