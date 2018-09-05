/*
RegularSSATransformation.xtend * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.ssa.optimizer

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kexpressions.Call
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.eval.PartialExpressionEvaluator
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValueExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.common.SCGAnnotations
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGManipulationExtensions
import de.cau.cs.kieler.scg.processors.ssa.SSATransformation
import de.cau.cs.kieler.scg.processors.ssa.SimpleSCSSATransformation
import de.cau.cs.kieler.scg.ssa.SSACoreExtensions
import de.cau.cs.kieler.scg.ssa.domtree.DominatorTree
import java.util.Map
import javax.inject.Inject

import static de.cau.cs.kieler.kexpressions.keffects.DataDependencyType.*
import static de.cau.cs.kieler.scg.ssa.SSAFunction.*
import static de.cau.cs.kieler.scg.ssa.SSAParameterProperty.*

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kexpressions.keffects.DataDependency

/**
 * The Sparse Conditional Constant Propagation for SCGs.
 * 
 * Based on "Modern Compiler Implementation in Java", Second Edition, by Appel and Palsberg
 * and "Concurrent Static Single Assignment Form and Constant Propagation for Explicitly Parallel Programs" by Lee, Midki, and Padua
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SCCP extends InplaceProcessor<SCGraphs> implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "de.cau.cs.kieler.scg.processors.ssa.optimizer.sccp"
    }

    override getName() {
        return "SCCP"
    }
    
    override process() {
        model.scgs.forEach[transform]
        model = model
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    
    public static val SUPPORTED_SSA_TYPES = #[SSATransformation.ID, SimpleSCSSATransformation.ID]
    
    // Whether to remove assignments with no readers
    public static val IProperty<Boolean> REMOVE_UNREAD_ASSIGNMENTS = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.ssa.sccp.removeLocals", true)
    // Whether to remove assignments to outputs (if above is active)
    public static val IProperty<Boolean> REMOVE_OUTPUTS = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.ssa.sccp.removeOutputs", false)
    // Whether to propagate constant values of output variables
    public static val IProperty<Boolean> PROPAGATE_OUTPUTS = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.ssa.sccp.propagateOutputs", true)
            
    // -------------------------------------------------------------------------
    
    @Inject extension KEffectsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsValueExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGManipulationExtensions
    @Inject extension SSACoreExtensions
    
    // -------------------------------------------------------------------------

    // Alive code
    protected val executable = newHashSet
    // Constant lattice
    protected val constants = <ValuedObject, Value>newHashMap
    protected val overdefined = <ValuedObject>newHashSet
    // Work lists
    protected val voWorkList = <ValuedObject>newLinkedList
    protected val blockWorkList = <BasicBlock>newLinkedList
    // Terminating Threads
    protected val term = <BasicBlock, Integer>newHashMap
    // side data
    protected var superfluousConditionals = <Conditional, Boolean>newHashMap
    protected var parEvalConditionals = <Conditional, Expression>newHashMap
    protected var parEvalAssinments = <Assignment, Expression>newHashMap
    protected var ssaCopyPropagation = HashMultimap.<ValuedObject, ValuedObject>create
    // Analysis results
    protected val inputs = <ValuedObject>newHashSet
    protected var DominatorTree dt;
    protected var Map<ValuedObject, Assignment> defs;
    protected var Multimap<ValuedObject, Node> uses;
    // SSA data
    protected var Map<Parameter, BasicBlock> parameterMapping

    // -------------------------------------------------------------------------    
    
    def SCGraph transform(SCGraph scg) {
        if (!SUPPORTED_SSA_TYPES.contains(scg.annotations.filter(StringAnnotation).findFirst[ name == SCGAnnotations.ANNOTATION_SSA ]?.values?.head)) {
            environment.errors.add("SCG is not in compatible SSA form")
        }
        
        parameterMapping = environment.getProperty(SSA_PARAMETER_PROPERTY)?.parameterMapping
        if (parameterMapping === null) {
            environment.errors.add("Missing SSA parameter mapping information!")
            return scg
        }
        
        // init
        executable.clear
        constants.clear
        overdefined.clear
        term.clear
        inputs.clear
        dt = new DominatorTree(scg)
        defs = scg.defs
        uses = scg.uses
        val entryBB = scg.basicBlocks.head
        
        // ---------------
        // 1. Analysis
        // ---------------
        
        // set all inputs to over-defined
        inputs.addAll(uses.keySet.filter[!defs.containsKey(it)])
        overdefined.addAll(inputs)
        // cannot handle arrays
        for (d : scg.declarations) {
            if (d instanceof VariableDeclaration) {
                if (!d.extern && d.hostType.nullOrEmpty) {
                    overdefined.addAll(d.valuedObjects.filter[!cardinalities.nullOrEmpty]) // cannot handle arrays
                } else { // cannot handle external types
                    overdefined.addAll(d.valuedObjects)
                }
            } else { // cannot handle non-variables
                overdefined.addAll(d.valuedObjects)
            }
        }
        
        // the programs always starts
        executable.add(entryBB)
        blockWorkList.add(entryBB)
        
        // analysis
        while(!(voWorkList.empty && blockWorkList.empty)) {
            while(!blockWorkList.empty) {
                blockWorkList.pop.handleBlock
            }            
            while(!voWorkList.empty) {
                voWorkList.pop.handleVO
            }
        }
        
        // ---------------
        // 2. Kill dead code
        // --------------- 
        val deadBlocks = scg.basicBlocks.filter[!executable.contains(it)].toSet
        val preserveDeadBBs = newArrayList
        for (bb : deadBlocks) {
            val headSB = bb.schedulingBlocks.head
            if (headSB !== null &&
                headSB.nodes.head !== null && (
                headSB.nodes.head instanceof Join ||
                headSB.nodes.head instanceof Exit)) { // Do not break entry/exit and fork/join pairs
                if (!bb.finalBlock) {
                    bb.deadBlock = true
                }
                preserveDeadBBs += bb        
            } else {
                // Fix incoming CF
                val firstNode = bb.schedulingBlocks.head.nodes.head
                for (incoming : firstNode.allPrevious.toList) {
                    val prev = incoming.eContainer as Node
                    if (prev instanceof Conditional) {
                        prev.removeConditional(prev.then == incoming, false)
                    } else {
                        incoming.target = null
                        prev.eContents.immutableCopy.forEach[remove]
                    }
                }
                
                // remove all nodes
                for (sb : bb.schedulingBlocks.immutableCopy) {
                    for (node : sb.nodes.immutableCopy) {
                        node.removeNode(false)
                        defs.values.removeIf[it == node]
                        uses.values.removeIf[it == node]
                    }
                }
                
                // clear sb
                bb.schedulingBlocks.forEach[ guards.forEach[remove] ]
                bb.schedulingBlocks.clear
                
                // fix predecessor information in non-dead successor block
                for (nonDeadBB : dt.successors(bb).filter[!deadBlocks.contains(it)]) {
                    nonDeadBB.fixSSANodes(bb)
                    nonDeadBB.predecessors.removeIf[basicBlock == bb]
                }
            }
        }
        deadBlocks.removeAll(preserveDeadBBs)
        scg.basicBlocks.removeAll(deadBlocks)
        if (!deadBlocks.empty && environment.inDeveloperMode) scg.snapshot

        
        // Remove dead branches
        var deadBranches = 0
        for (entry : superfluousConditionals.entrySet.filter[key.eContainer !== null]) {
            entry.key.removeConditional(entry.value, true)
            deadBranches++
            if (environment.inDeveloperMode) scg.snapshot
        }
        
        // Remove dead threads
        var deadThreads = 0
        for (entry : scg.nodes.filter(Entry).filter[!incomingLinks.empty].toList) {
            if (entry.eContainer !== null) {
                val threadNodes = <Node>newArrayList()
                var dead = true
                var next = entry.next.targetNode
                while (dead && !(next instanceof Exit)) {
                    if (next.isSSA) {
                        val asm = next as Assignment
                        next = asm.next.targetNode
                        threadNodes += next
                    } else {
                        dead = false
                    }
                }
                if (dead) {
                    val exit = next as Exit
                    val fork = entry.allPreviousHeadNode as Fork
                    val join = fork.join
                    
                    entry.removeNode(false)
                    exit.removeNode(false)
                    threadNodes.forEach[ node |
                        node.removeNode(false)
                        defs.values.removeIf[it == node]
                        uses.values.removeIf[it == node]
                    ]
                    
                    if (fork.allNext.size == 1) {
                        val tEntry = fork.allNext.head.target as Entry
                        val tExit = join.allPreviousHeadNode as Exit
                        val joinBB = join.basicBlock
                        joinBB.synchronizerBlock = false
                        
                        val psis = <Assignment>newArrayList
                        next = join.next.targetNode
                        while (next.isSSA(PSI)) {
                            psis += next as Assignment
                            next = (next as Assignment).next.targetNode
                        }
                        
                        fork.removeNode(true)
                        tEntry.removeNode(true)
                        tExit.removeNode(true)
                        join.removeNode(true)
                        
                        for (psi : psis) {
                            val fc = psi.expression as FunctionCall
                            var ValuedObject replacement
                            
                            val sources = ssaCopyPropagation.get(psi.valuedObject)
                            if (sources.size == 1) {
                                replacement = sources.head
                            }
                            
                            if (replacement === null) {
                                for (p : fc.parameters) {
                                    val pBB = parameterMapping.get(p)
                                    if (replacement === null &&
                                        pBB.eContainer !== null &&
                                        !dt.isDominator(pBB, joinBB)) {
                                        replacement = (p.expression as ValuedObjectReference).valuedObject
                                    }
                                }
                            }
                            
                            if (replacement === null) {
                                throw new Exception("This should not happen!")
                            }
                            
                            // replace usage by previous
                            // TODO improve performance
                            for (vor : scg.eAllContents.filter(ValuedObjectReference).filter[valuedObject == psi.valuedObject].toList) {
                                vor.valuedObject = replacement
                            }
                            
                            psi.removeNode(true)
                            defs.values.removeIf[it == psi]
                            uses.values.removeIf[it == psi]
                        }
                    }
                    
                    deadThreads++
                    if (environment.inDeveloperMode) scg.snapshot
                }
            }
        }
        
        if (!deadBlocks.empty || deadBranches > 0 || deadThreads > 0) scg.snapshot
        
        
        
        // ---------------
        // 3. Propagate Constants / Apply partial evaluation
        // ---------------
        val readers = HashMultimap.create
        for (n : scg.nodes.filter[!isSSA]) {
            // Replace expressions
            val replacement = if (parEvalAssinments.containsKey(n)) {
                parEvalAssinments.get(n)
            } else if (n instanceof Assignment) {
                parEvalEngine.evaluate(n.expression)
            } else if (n instanceof Conditional) {
                parEvalEngine.evaluate(n.condition)
            }
            if (replacement !== null) {
                if (n instanceof Assignment) {
                    n.expression.replace(replacement)
                } else if (n instanceof Conditional) {
                    n.condition.replace(replacement)
                }
                
                // Store new readers
                val reads = replacement.allReferences.map[valuedObject].toSet
                uses.entries.removeIf[value == n && !reads.contains(key)]
                readers.putAll(n, reads)
            }
        }
        if (environment.inDeveloperMode) scg.snapshot
        
        // ---------------
        // 4. Remove superfluous definitions
        // ---------------
        if (environment.getProperty(REMOVE_UNREAD_ASSIGNMENTS)) {
            val ineffectiveOutputs = <Assignment>newHashSet
            if (environment.getProperty(REMOVE_OUTPUTS)) {
                // TDOD handle pauses
                if (scg.nodes.forall[!(it instanceof Surface)]) {
                    val exitBB = (entryBB.schedulingBlocks.head.nodes.head as Entry).exit.basicBlock
                    
                    for (decl : scg.SSADeclarations.filter[output == true]) {
                        val uselessDefs = newHashSet
                        val secureOutputs = newHashSet
                        for (vo : decl.valuedObjects) {
                            val def = defs.get(vo)
                            if (def !== null) {
                                if (uses.get(vo).nullOrEmpty) {
                                    uselessDefs += def
                                }
                                if (dt.isStrictDominator(def.basicBlock, exitBB)) {
                                    secureOutputs += def
                                }
                            }
                        }
                        for (useless : uselessDefs) {
                            for (secure : secureOutputs) {
                                // FIXME does not work since dt is initial structure not optimized
                                if (useless !== secure && dt.isStrictDominator(useless.basicBlock, secure.basicBlock)) {
                                    ineffectiveOutputs += useless
                                }
                            }
                        }
                    }
                }
            }
            
            val useless = defs.entrySet.filter[
                key.cardinalities.nullOrEmpty && // Not an array // TODO support arrays
                !key.isOutput && // Not an output
                uses.get(it.key).nullOrEmpty // No uses
            ].map[value].toList
            if (environment.getProperty(REMOVE_OUTPUTS)) {
                useless.addAll(ineffectiveOutputs)
            }
            while (!useless.empty) {
                val def = useless.head
                useless.remove(0) // pop
                
                // Remove from data
                defs.remove(def.valuedObject, def)
                uses.values.removeIf[it == def]
                readers.removeAll(def)
                
                // Find more
                for (more : def.expression.allReferences.map[valuedObject].toSet) {
                    if ((!more.isOutput || environment.getProperty(REMOVE_OUTPUTS)) && uses.get(more).nullOrEmpty) {
                        val moreDef = defs.get(more)
                        if (moreDef !== null) {
                            useless += moreDef
                        }
                    }
                }
                
                // Remove from scg (here is important because remove node clears content)
                def.removeNode(true)
            } 
        }
        if (environment.inDeveloperMode) scg.snapshot
        
        // ---------------
        // 5. Remove superfluous dependencies
        // --------------- 
        for (reader : readers.keySet) {
            val directReads = readers.get(reader)
            val reads = newHashSet => [addAll(directReads)]
            // SSA closure
            for (read : directReads) {
                val vos = newLinkedList(read)
                while(!vos.empty) {
                    val def = defs.get(vos.pop)
                    if (def !== null && def.isSSA) {
                        for (param : def.expression.allReferences.map[valuedObject].toSet) {
                            if (!reads.contains(param)) {
                                reads += param
                                vos += param
                            }
                        }
                    }
                }
            }
            // Remove dependencies
            reader.incomingLinks.filter(DataDependency).filter[type == WRITE_READ].filter[
                !reads.contains((eContainer as Assignment).valuedObject)
            ].toList.forEach[remove]
        }
        
        // ---------------
        // 6. Remove unused ssa versions
        // ---------------
        scg.removeUnusedSSAVersions

        // ---------------
        // 7. Update SSA VO version numbering
        // ---------------   
        scg.updateSSAVersions
                
        return scg
    }
        
    protected def void handleBlock(BasicBlock block) {
        // Activate next iff only one block outgoing
        val successors = dt.successors(block)
        if (successors.size == 1) {
            val succ = successors.head
            if (succ.schedulingBlocks.head.nodes.head instanceof Join) {
                if (term.containsKey(succ)) {
                    term.put(succ, term.get(succ) + 1)
                } else {
                    term.put(succ, 1)
                }
                if (term.get(succ) == succ.predecessors.filter[!basicBlock.finalBlock].size) {
                    succ.markExecutable
                }
            } else {
                succ.markExecutable
            }
        }
        
        // Handle nodes
        for (sb : block.schedulingBlocks) {
            for (node : sb.nodes.filterNull) {
                node.handleNode
            }
        }
    }
    
    protected def void handleVO(ValuedObject vo) {
        for (use : uses.get(vo).filterNull) {
            if (executable.contains(use.basicBlock)) {
                use.handleNode
            }
        }
    }
    
    protected def dispatch void handleNode(Assignment asm) {
        if (asm.valuedObject === null) {
            return
        }
        if (asm.isSSA) {
            var constantSources = newHashSet
            var Value constantValue
            val bb = asm.basicBlock
            val fc = (asm.expression as FunctionCall)
            
            for (entry : fc.parameters.map[(it.expression as ValuedObjectReference).valuedObject].indexed) {
                val vo = entry.value
                val voDef = defs.get(vo)
                var exec = executable.contains(voDef.basicBlock)
                if (asm.isSSA(PHI) && fc.parameters.size == 2 && dt.isStrictDominator(voDef.basicBlock, bb)) {
                    val cond = bb.predecessors.map[conditional].filterNull.head
                    if (cond !== null && superfluousConditionals.containsKey(cond)) {
                        val aliveTargetBranch = if (!superfluousConditionals.get(cond)) cond.then else cond.^else
                        val sourceBB = parameterMapping.get(fc.parameters.get(entry.key))
                        if (sourceBB == cond.basicBlock) {
                            exec = aliveTargetBranch.targetNode.basicBlock == bb
                        } else {
                            exec = executable.contains(sourceBB)
                        }
                    }
                }
                if (overdefined.contains(vo) && (exec || inputs.contains(vo))) {
                    asm.valuedObject.raiseOverdefined
                    return
                } else if (constants.containsKey(vo) && exec) {
                    constantSources += vo
                    if (!asm.isSSA(PSI)) {
                        if (constantValue === null) {
                            constantValue = constants.get(vo)
                        } else if (!constants.get(vo).isSameValue(constantValue)) {
                            asm.valuedObject.raiseOverdefined
                            return
                        }
                    }
                }
            }
            
            val vo = asm.valuedObject
            
            if (asm.isSSA(PSI) && !constantSources.empty) {
                // Some SC semantics for psi
                val sources = newHashSet//HashMultimap.<ValuedObject, ValuedObject>create
                val work = newHashSet
                val processed = newHashSet
                var ValuedObject dominator
                var Assignment dominatorAsm
                
                // compute closure
                for (source : constantSources) {
                    work += source
                    while(!work.empty) {
                        val nextVO = work.head
                        work.remove(nextVO)
                        val nextDef = defs.get(nextVO)
                        processed += nextVO
                        if (dt.isDominator(nextDef.basicBlock, bb)) {
                            if (dominator === null || dt.isStrictDominator(dominatorAsm.basicBlock, nextDef.basicBlock)) {
                                dominator = nextVO
                                dominatorAsm = nextDef
                            }
                        } else if (ssaCopyPropagation.containsKey(nextVO)) {
                            for (otherSources : ssaCopyPropagation.get(nextVO)) {
                                if (!processed.contains(otherSources)) {
                                    work += otherSources
                                }
                            }
                        } else if (!sources.contains(nextVO)) {
                            sources += nextVO
                        }
                    }
                    processed.clear
                }
                
                if (sources.empty) {
                    ssaCopyPropagation.removeAll(vo)
                    ssaCopyPropagation.put(vo, dominator)
                    if (constants.containsKey(vo)) {
                        constantValue = constants.get(dominator)
                    }
                } else {
                    ssaCopyPropagation.removeAll(vo)
                    ssaCopyPropagation.putAll(vo, sources)
                    
                    if (sources.forall[constants.containsKey(it)]) {
                        for (source : sources) {
                            if (constantValue === null) {
                                constantValue = constants.get(source)
                            } else if (!constants.get(source).isSameValue(constantValue)) {
                                vo.raiseOverdefined
                                return
                            }
                        }
                    }
                }
                
            } else if (!constantSources.empty) {
                ssaCopyPropagation.removeAll(vo)
                ssaCopyPropagation.putAll(vo, constantSources)
            }

            if (constantValue !== null) {
                vo.raiseConstant(constantValue)
            }
            
        } else {
            asm.evaluateAssignment
        }
    } 
    
    protected def dispatch void handleNode(Conditional cond) {
        superfluousConditionals.remove(cond)
        val parEvalResult = parEvalEngine.evaluate(cond.condition)
        parEvalConditionals.put(cond, parEvalResult)
        if (parEvalResult instanceof Value) { // Can be evaluated
            val branch = PartialExpressionEvaluator.isThruthy(parEvalResult)
            // Activate branch
            if (branch) {
                if (cond.then !== null) cond.then.targetNode.basicBlock.markExecutable
            } else {
                if (cond.^else !== null) cond.^else.targetNode.basicBlock.markExecutable
            }
            superfluousConditionals.put(cond, !branch)
        } else if (parEvalResult.isOverdefined) { // Mark both
            if (cond.then !== null) cond.then.targetNode.basicBlock.markExecutable
            if (cond.^else !== null) cond.^else.targetNode.basicBlock.markExecutable
        }
    } 
          
    protected def dispatch void handleNode(Fork fork) {
        // Execute Threads
        dt.successors(fork.basicBlock).forEach[markExecutable]
    }
     
    protected def dispatch void handleNode(Node n) {
        // Pass
    }
    
    protected def void markExecutable(BasicBlock block) {
        // Mark only on first time
        if (block !== null && !executable.contains(block)) {
            // Mark
            executable.add(block)
            
            // Add the block and all executable successors to work list
            blockWorkList.add(block)
            val newBlocks = newLinkedList(block)
            val addedBlocks = newHashSet(block)
            while (!newBlocks.empty) {
                for (succ : dt.successors(newBlocks.pop).filter[executable.contains(it) && !addedBlocks.contains(it)].filterNull) {
                    blockWorkList.add(succ)
                    newBlocks.add(succ)
                    addedBlocks.add(succ)
                }
            }
        }
    }
    
    protected def void evaluateAssignment(Assignment asm){
        val parEvalResult = parEvalEngine.evaluate(asm.expression)
        parEvalAssinments.put(asm, parEvalResult)
        if (parEvalResult instanceof Value) { // Can be evaluated
            asm.valuedObject.raiseConstant(parEvalResult)
        } else if (parEvalResult.isOverdefined) {
            asm.valuedObject.raiseOverdefined
        }
    }
    
    protected def boolean isOverdefined(Expression expression) {
        if (expression instanceof ValuedObjectReference) {
            return overdefined.contains(expression.valuedObject)
        } else if (expression instanceof OperatorExpression) { 
            if (expression.operator == OperatorType.PRE) {
                return true // Always overdefined
            }
//            if (expression.operator == OperatorType.LOGICAL_OR || expression.operator == OperatorType.BITWISE_OR) { // Lazy Or
//                if (expression.subExpressions.filter(ValuedObjectReference).map[valuedObject].exists[!overdefined.contains(it)]) { // One operand still not defined
//                    return false // Result still open
//                }
//            }
        } else if (expression instanceof Call) {
            return true // Always overdefined
        }
        // otherwise always
        return expression.allReferences.map[valuedObject].exists[overdefined.contains(it)]
    }
    
    protected def raiseConstant(ValuedObject vo, Value value) {
        if (!overdefined.contains(vo)) {
            if (constants.containsKey(vo)) {
                if (constants.get(vo).isSameValue(value)) {
                    return
                } else {
                    throw new Exception("Algorithm propagated different constant values for the same variable")
                }
            }
            
            constants.put(vo, value)
            voWorkList.add(vo)
        }
    }
    
    protected def raiseOverdefined(ValuedObject vo) {
        if (!overdefined.contains(vo)) {
            overdefined.add(vo)
        
            if (constants.containsKey(vo)) {
                voWorkList.add(vo)
                constants.remove(vo)
            }
        }
    }
    
    def void removeConditional(Conditional c, boolean trueBranchDead, boolean fixSSA) {
        val bb = c.basicBlock

        // Checking null branches is important for cured schizophrenia
        val deadTargetBranch = if (trueBranchDead) c.then else c.^else
        val deadTargetBB = if (deadTargetBranch !== null) deadTargetBranch.targetNode.basicBlock
        val aliveTargetBranch = if (!trueBranchDead) c.then else c.^else
        val aliveTargetBB = if (aliveTargetBranch !== null) aliveTargetBranch.targetNode.basicBlock
        if (deadTargetBB !== null) {
            deadTargetBB.predecessors.removeIf[basicBlock == bb]
            if (fixSSA) deadTargetBB.fixSSANodes(bb)
        }
        
        // reroute
        for (p : c.allPrevious.toList) {
            if (aliveTargetBranch !== null) {
                p.target = aliveTargetBranch.target
            } else {
                p.target = null
            }
        }
        
        // remove
        uses.values.removeIf[it == c]
        c.removeNode(false)
        
        if (aliveTargetBB !== null) {
            // fix predecessor information in successor block
            val info = aliveTargetBB.predecessors.findFirst[basicBlock == bb && conditional == c]
            if (info !== null) {
                info.conditional = null
                info.branchType = null
            }
            if (bb.eContainer === null) { // removed
                if (info !== null) {
                    aliveTargetBB.predecessors.remove(info)
                }
                for (p : bb.predecessors.immutableCopy) {
                    if (!aliveTargetBB.predecessors.exists[basicBlock == p.basicBlock]) {
                        aliveTargetBB.predecessors.add(p)
                    }
                }
            }
        }
    }
    
    def void fixSSANodes(BasicBlock target, BasicBlock source) {
        // Fix ssa nodes
        if (!target.schedulingBlocks.nullOrEmpty) {
            for (n : target.schedulingBlocks.head.nodes.filter(Assignment).filter[isSSA].toList) {
                val fc = n.expression as FunctionCall
                fc.parameters.removeIf[parameterMapping.get(it) == source]
                if (fc.parameters.size == 1) {
                    val voUses = uses.get(n.valuedObject)
                    val newVO = (fc.parameters.head.expression as ValuedObjectReference).valuedObject
                    for (use : voUses) {
                        use.eAllContents.filter(ValuedObjectReference).filter[valuedObject == n.valuedObject].forEach[
                            valuedObject = newVO
                        ]
                        uses.put(newVO, use)
                    }
                    uses.keys.removeIf[it == n.valuedObject]
                    n.removeNode(true)
                    defs.values.removeIf[it == n]
                    uses.values.removeIf[it == n]
                }
            }
        }
    }
    
    protected def getParEvalEngine() {
        return new PartialExpressionEvaluator(constants) => [
            compute = true
        ]
    }
    
}
    