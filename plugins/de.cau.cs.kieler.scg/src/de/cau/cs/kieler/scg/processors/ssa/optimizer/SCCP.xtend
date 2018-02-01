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

import com.google.common.collect.Multimap
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kexpressions.Call
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.eval.PartialExpressionEvaluator
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValueExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.common.SCGAnnotations
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGManipulationExtensions
import de.cau.cs.kieler.scg.processors.ssa.SSATransformation
import de.cau.cs.kieler.scg.processors.ssa.SimpleSCSSATransformation
import de.cau.cs.kieler.scg.ssa.SSACoreExtensions
import de.cau.cs.kieler.scg.ssa.SSATransformationExtensions
import de.cau.cs.kieler.scg.ssa.domtree.DominatorTree
import java.util.Map
import javax.inject.Inject

import static de.cau.cs.kieler.scg.ssa.SSAFunction.*
import static de.cau.cs.kieler.scg.ssa.SSAParameterProperty.*

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.kexpressions.Parameter

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
    
    public static val IProperty<Boolean> REMOVE_OUTPUTS = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.ssa.sccp.removeOutputs", false)
    public static val IProperty<Boolean> PROPAGATE_OUTPUTS = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.ssa.sccp.propagateOutputs", true)
    public static val IProperty<Boolean> PROPAGATE_INTO_PHI = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.ssa.sccp.propagateIntoPhi", false)
            
    // -------------------------------------------------------------------------
    
    @Inject extension AnnotationsExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsValueExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGManipulationExtensions
    @Inject extension SSATransformationExtensions
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
    // superfluous conditionals
    protected var superfluousConditionals = <Conditional, Boolean>newHashMap
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
        for (bb : deadBlocks) {
            // Fix incoming CF
            val firstNode = bb.schedulingBlocks.head.nodes.head
            for (incoming : firstNode.allPrevious) {
                val prev = incoming.eContainer as Node
                if (prev instanceof Conditional) {
                    prev.removeConditional(prev.then == incoming)
                } else {
                    incoming.target = null
                    prev.eContents.toList.forEach[remove]
                }
            }
            
            // remove all nodes
            for (sb : bb.schedulingBlocks) {
                for (node : sb.nodes) {
                    node.removeNode(false)
                    defs.values.remove(node)
                    uses.values.remove(node)
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
        if (!deadBlocks.empty) environment.infos.add("Removed " + deadBlocks.size + " dead blocks")
        scg.basicBlocks.removeAll(deadBlocks)
        
        // Remove superfluous conditionals
        for (entry : superfluousConditionals.entrySet.filter[key.eContainer !== null]) {
            entry.key.removeConditional(entry.value)
        }
        if (!superfluousConditionals.empty) environment.infos.add("Removed " + superfluousConditionals.size + " dead conditional branches")
        
        // ---------------
        // 3. Propagate Constants
        // ---------------
        if (!constants.empty) {
            var propagated = 0
            for (const : constants.entrySet) {
                var boolean skippedPhi = false
                if (!const.key.isOutput || environment.getProperty(PROPAGATE_OUTPUTS)) {
                    if (uses.containsKey(const.key)) {
                        propagated++
                        // Replace in uses
                        for (node : uses.get(const.key)) {
                            if (!node.isSSA || environment.getProperty(PROPAGATE_INTO_PHI)) {
                                for (vor : node.eAllContents.filter(ValuedObjectReference).filter[valuedObject == const.key].toList) {
                                    vor.replace(const.value.copy)
                                }
                            } else {
                                skippedPhi = true
                            }
                        }
                    }
                }
                
                /*
                 * Assignment must no be removed if it is an output and the associated property is set
                 * OR an ssa function depends on its execution!
                 */
                if ((!const.key.isOutput || environment.getProperty(REMOVE_OUTPUTS)) && !skippedPhi) {
                    // Remove Definition
                    val node = defs.get(const.key)
                    node.removeNode(true)
                }
            }
            environment.infos.add("Propagated " + propagated + " constants")
        }
        
        // ---------------
        // 4. Remove unused ssa versions
        // ---------------
        scg.removeUnusedSSAVersions

        // ---------------
        // 5. Update SSA VO version numbering
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
                if (term.get(succ) == succ.predecessors.size) {
                    succ.markExecutable
                }
            } else {
                succ.markExecutable
            }
        }
        
        // Handle nodes
        for (sb : block.schedulingBlocks) {
            for (node : sb.nodes) {
                node.handleNode
            }
        }
    }
    
    protected def void handleVO(ValuedObject vo) {
        for (use : uses.get(vo)) {
            if (executable.contains(use.basicBlock)) {
                use.handleNode
            }
        }
    }
    
    protected def dispatch void handleNode(Assignment asm) {
        if (asm.isSSA) {
            if (asm.isSSA(PHI)) {
                var Value constantValue
                for (vo : (asm.expression as FunctionCall).parameters.map[(it.expression as ValuedObjectReference).valuedObject]) {
                    val exec = executable.contains(defs.get(vo).basicBlock)
                    if (overdefined.contains(vo) && (exec || inputs.contains(vo))) {
                        asm.valuedObject.raiseOverdefined
                        return
                    } else if (constants.containsKey(vo) && exec) {
                        if (constantValue === null) {
                            constantValue = constants.get(vo)
                        } else if (!constants.get(vo).isSameValue(constantValue)) {
                            asm.valuedObject.raiseOverdefined
                            return
                        }
                    }
                }
                if (constantValue !== null) {
                    asm.valuedObject.raiseConstant(constantValue)
                }
            } else if (asm.isSSA(PSI)) {
                asm.valuedObject.raiseOverdefined
            } else if (asm.isSSA(PI)) {
                asm.valuedObject.raiseOverdefined
            }
            // TODO others?
        } else {
            asm.evaluateAssignment
        }
    } 
    
    protected def dispatch void handleNode(Conditional cond) {
        superfluousConditionals.remove(cond)
        val parEval = new PartialExpressionEvaluator(constants)
        val parEvalResult = parEval.evaluate(cond.condition)
        if (parEvalResult instanceof Value) { // Can be evaluated
            val branch = parEval.isThruthy(parEvalResult)
            // Activate branch
            if (branch) {
                cond.then.target.basicBlock.markExecutable
            } else {
                cond.^else.target.basicBlock.markExecutable
            }
            superfluousConditionals.put(cond, branch)
        } else if (parEvalResult.isOverdefined) { // Mark both
            cond.then.target.basicBlock.markExecutable
            cond.^else.target.basicBlock.markExecutable
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
        if (!executable.contains(block)) {
            // Mark
            executable.add(block)
            
            // Add the block and all executable successors to work list
            blockWorkList.add(block)
            val newBlocks = newLinkedList(block)
            val addedBlocks = newHashSet(block)
            while (!newBlocks.empty) {
                for (succ : dt.successors(newBlocks.pop).filter[executable.contains(it) && !addedBlocks.contains(it)]) {
                    blockWorkList.add(succ)
                    newBlocks.add(succ)
                    addedBlocks.add(succ)
                }
            }
        }
    }
    
    protected def void evaluateAssignment(Assignment asm){
        val parEvalResult = new PartialExpressionEvaluator(constants).evaluate(asm.expression)
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
    
    def void removeConditional(Conditional c, boolean branch) {
        val bb = c.basicBlock
        // remove successor
        val deadTargetBB = (if(!branch) c.then.target else c.^else.target).basicBlock
        deadTargetBB.fixSSANodes(bb)
        deadTargetBB.predecessors.removeIf[basicBlock == bb]
        
        // reroute
        c.allPrevious.toList.forEach[ target = if(branch) c.then.target else c.^else.target ]
        c.removeNode(false)
        
        // fix predecessor information in successor block
        val info = dt.successors(bb).map[predecessors.findFirst[basicBlock == bb && conditional == c]].filterNull.head
        if (info !== null) {
            info.conditional = null
            info.branchType = null
        }
        
        defs.values.remove(c)
        uses.values.remove(c)
    }
    
    def void fixSSANodes(BasicBlock target, BasicBlock source) {
        // Fix ssa nodes
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
                uses.keys.remove(n.valuedObject)
                n.removeNode(true)
                defs.values.remove(n)
                uses.values.remove(n)
            }
        }
    }
    
}
    