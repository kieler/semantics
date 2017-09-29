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
package de.cau.cs.kieler.scg.processors.transformators.ssa

import com.google.common.collect.HashMultimap
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.BranchType
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Predecessor
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ScgPackage
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.ssa.SSACoreExtensions
import de.cau.cs.kieler.scg.ssa.SSAFunction
import de.cau.cs.kieler.scg.ssa.SSATransformationExtensions
import de.cau.cs.kieler.scg.ssa.domtree.DominatorTree
import java.util.BitSet
import java.util.Map
import javax.inject.Inject

import static com.google.common.collect.Lists.*
import static com.google.common.collect.Maps.*
import static de.cau.cs.kieler.scg.ssa.SSAFunction.*

import static extension com.google.common.collect.Sets.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.scg.common.SCGAnnotations

/**
 * The SSA transformation for SCGs
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class WeakUnemitSSATransformation extends Processor<SCGraphs, SCGraphs> implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "de.cau.cs.kieler.scg.processors.transformators.ssa.wuscc"
    }

    override getName() {
        return "Weak Unemit SSA"
    }
    
    override getType() {
        return ProcessorType.TRANSFORMATOR
    }
    
    override process() {
        model.scgs.forEach[transform]
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    
    public static val IMPLICIT_ANNOTAION = "scg.ssa.implicit"
    public static val ATTACH_ANNOTATION = "scg.ssa.attach"
    public static val BRANCH_ANNOTATION = "scg.ssa.branch"
    
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension KExpressionsDeclarationExtensions
    extension ScgFactory = ScgPackage.eINSTANCE.scgFactory
    extension AnnotationsFactory = AnnotationsFactory.eINSTANCE
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SSATransformationExtensions
    @Inject extension SSACoreExtensions
    
    var Map<Parameter, BasicBlock> bbVersion

    // -------------------------------------------------------------------------
    def transform(SCGraph scg) {
        validate(scg)
        val entryBB = scg.basicBlocks.head
        
        // Add implicit assignments at the entry and after each pause 
        scg.addImplicitEvironmentAssignments(entryBB)
        
        // Create new declarations for SSA versions
        val ssaDecl = scg.createSSADeclarations
        val dt = new DominatorTree(scg)
        
        // ---------------
        // 1. Place Phi
        // ---------------
        dt.place[ ValuedObject vo, Node bbHead |
            val asm = phiPlacer.apply(vo, bbHead)
            
            if (bbHead instanceof Join) {
                asm.expression = PSI.createFunction
            } else {
                if (bbHead instanceof Assignment && ((bbHead as Assignment).valuedObject.name.startsWith("join_")
                    || (bbHead as Assignment).eAllContents.filter(FunctionCall).exists[functionName == PSI.symbol])) {
                    asm.expression = PSI.createFunction
                }
            }
            
            return asm
        ]
        
        // ---------------
        // 2. Renaming
        // ---------------
        bbVersion = dt.rename(entryBB, ssaDecl)
        scg.annotations += createStringAnnotation(SCGAnnotations.ANNOTATION_SSA, id)
        scg.snapshot
        
        // Transform phi node into assignments in each branch
        scg.transformPhi(dt)
        scg.snapshot
        // Reduce introduced assignments using constant propagation
        scg.propagatePhi(PHI_ASM)
        scg.snapshot
        
        // Adds reads to concurrent writers
        scg.addConcurrentWritersToReaders
        scg.snapshot
        
        // Removes all references to signals that are never emitted
//        scg.removeAbsentReads  
//        scg.snapshot
              
        // Removes assignments to signals which are never read
        scg.removePhiWritesWithoutRead
        scg.snapshot
        // DONT ACTIVATE: trap-par-example wrong semantics for B
        // scg.propagatePhi(PHI)
        
        // Removes the introduced implicit writers
        scg.removeImplicitEvironmentAssignments
        scg.snapshot
                
        // ---------------
        // 3. Remove unused ssa versions
        // ---------------
        
        // Removes conditional with constant conditions
//        scg.removeDeadCodeSimple
//        scg.snapshot
        // Removes all ssa versions which are not read
        scg.removeUnusedSSAVersions
        // Merges ssa version which are always used together (in OR expressions)
        scg.mergeIneffectiveSSAVersions
        scg.snapshot
        // Removes version index is only one version exits
        scg.removeSingleSSAVersions

        // ---------------
        // 4. Update SSA VO version numbering
        // ---------------   
        scg.updateSSAVersions
        scg.snapshot
    }
    
    // -------------------------------------------------------------------------
    
    def void addConcurrentWritersToReaders(SCGraph scg) {
        for (node : scg.uses.values.filter[!isSSA].toSet) {
            for (declDepPair : node.incoming.filter(DataDependency).filter[concurrent].groupBy[(eContainer as Assignment).valuedObject.declaration].entrySet) {
                if (!declDepPair.key.hasAnnotation(SSATransformationExtensions.ANNOTATION_IGNORE_DECLARATION)) {
                    val refs = node.eContents.filter(Expression).head.allReferences.filter[valuedObject.declaration == declDepPair.key].toList
                    for (ref : refs) {
                        ref.replace(createOperatorExpression(OperatorType.BITWISE_OR) => [
                            subExpressions += ref.copy
                            subExpressions.addAll(declDepPair.value.map[(eContainer as Assignment).valuedObject.reference])
                        ])
                    }
                }
            }
        }
    }
    
    private def void addImplicitEvironmentAssignments(SCGraph scg, BasicBlock start) {
        val nodes = newLinkedList(start.nodes.head)
        nodes.addAll(scg.nodes.filter(Depth).toList)
        for (n : nodes) {
            val cf = n.eContents.filter(ControlFlow).head
            val sb = scg.schedulingBlocks.findFirst[it.nodes.contains(n)]
            for (d: scg.variableDeclarations.filter[type == ValueType.PURE && !input && !hasAnnotation(SSATransformationExtensions.ANNOTATION_IGNORE_DECLARATION)]) {//FIXME ignored input
                for (vo : d.valuedObjects) {
                    scg.nodes += createAssignment => [
                        annotations += createStringAnnotation(WeakUnemitSSATransformation.IMPLICIT_ANNOTAION, WeakUnemitSSATransformation.IMPLICIT_ANNOTAION)
                        valuedObject = vo
                        expression = if (d.input) {vo.reference} else {createBoolValue(false)}
                        next = createControlFlow => [
                            target = cf.target
                        ]
                        cf.target = it
                        sb.nodes.add(sb.nodes.indexOf(n)+1, it)
                    ]
                }
            }
        }
    }
    
    private def void removeImplicitEvironmentAssignments(SCGraph scg) {
        for (n : scg.nodes.filter(Assignment).filter[hasAnnotation(WeakUnemitSSATransformation.IMPLICIT_ANNOTAION)].toList) {
            scg.schedulingBlocks.findFirst[nodes.contains(n)].nodes.remove(n)
            val incoming = n.incoming.immutableCopy
            for (in : incoming) {
                in.target = n.next.target
            }
            n.next.target = null
            n.remove
        }
    }
    
    private def void removeAbsentReads(SCGraph scg) {
        val defs = HashMultimap.<ValuedObject, Assignment>create
        val reducedExp = newHashSet
        for (asm : scg.nodes.filter(Assignment)) {
            defs.put(asm.valuedObject, asm)
        }
        val uses = scg.uses
        var continue = true
        while (continue) {
            continue = false
            for (use : uses.entries.immutableCopy) {
                if (!use.key.variableDeclaration.input) {
                    if (defs.get(use.key).forall[expression instanceof BoolValue && !(expression as BoolValue).value]) {
                        // remove
                        val exp = use.value.eContents.filter(Expression).head
                        reducedExp.add(exp)
                        val refs = exp.allReferences.filter[valuedObject == use.key].toList
                        uses.remove(use.key, use.value)
                        continue = true
                        for (ref : refs) {
                            ref.replace(createBoolValue(false))
                        }
                    }
                }
            }
        }
        //reduce expressions
        for (e : reducedExp) {
            e.replace(e.parEval)
        }
    }
    
    def Expression parEval(Expression e) {
        if (e instanceof OperatorExpression) {
            e.subExpressions.immutableCopy.forEach[it.replace(it.parEval)]
            switch (e.operator) {
                case BITWISE_AND: {
                    if (e.subExpressions.filter(BoolValue).exists[!value]) {
                        return createBoolValue(false)
                    } else {
                        e.subExpressions.removeIf[it instanceof BoolValue && (it as BoolValue).value]
                        switch (e.subExpressions.size) {
                            case 0: return createBoolValue(true)
                            case 1: e.subExpressions.head
                            default: return e
                        }
                    }
                }
                case BITWISE_OR: {
                    e.subExpressions.removeIf[it instanceof BoolValue && !(it as BoolValue).value]
                    switch (e.subExpressions.size) {
                        case 0: return createBoolValue(false)
                        case 1: e.subExpressions.head
                        default: return e
                    }
                }
                case NOT: {
                    if (e.subExpressions.head instanceof BoolValue) {
                        return (e.subExpressions.head as BoolValue) => [value = !value]
                    } else {
                        return e
                    }
                }
                default: throw new UnsupportedOperationException("Cannot handle operator type: "+e.operator)
            }
        } else {
            return e
        }
    }
    
    // TODO doas not work with signal reinc example
    private def mergeIneffectiveSSAVersions(SCGraph scg) {
        val uses = scg.uses
        val defs = scg.allDefs
        for (decl : scg.declarations.filter[isSSA].filter[valuedObjects.size > 1]) {
            val reads = newArrayList(decl.valuedObjects.map[uses.get(it)].fold(newHashSet)[set, e |
                set.addAll(e)
                set
            ])
            for (versions : decl.valuedObjects.groupBy[
                val use = uses.get(it)
                val id = new BitSet
                for (r : reads.indexed) {
                    if (use.contains(r.value)) {
                        id.set(r.key)
                    }
                }
                return id
            ].values.filter[size > 1].toList) {
                val effective = versions.head
                for (v : versions.drop(1)) {
                    defs.get(v).forEach[valuedObject = effective]
                    for (u : uses.get(v)) {
                        val expr = u.eContents.filter(Expression).head
                        expr.allReferences.filter[valuedObject == v].toList.forEach[it.replace(createBoolValue(false))]
                        expr.replace(expr.parEval)
                    }
                    v.remove
                }
            }
        }
    }
    
    private def void removePhiWritesWithoutRead(SCGraph scg) {
        var continue = true
        while (continue) {
            continue = false
            val reads = scg.uses
            for (n : scg.nodes.filter(Assignment).filter[(isSSA(PHI) || isSSA(PHI_ASM)) && reads.get(valuedObject).filter[
                return it instanceof Conditional || (it instanceof Assignment && !(it.isSSA(PHI) || isSSA(PHI_ASM)))
            ].empty].toList) {
                scg.schedulingBlocks.findFirst[nodes.contains(n)].nodes.remove(n)
                val incoming = n.incoming.immutableCopy
                for (in : incoming) {
                    in.target = n.next.target
                }
                n.next.target = null
                n.remove
                continue = true
            }
        }
    }
    
    private def void transformPhi(SCGraph scg, DominatorTree dt) {
        val phiNodes = scg.nodes.filter(Assignment).filter[isSSA(PHI)].toList
        // Find exit join phis
        val exitPhis = newHashMap
        val exitDecl = scg.declarations.findFirst[hasAnnotation("exit")]
        if (exitDecl != null) {
            val joinVOs = exitDecl.valuedObjects.filter[name.startsWith("join")].toSet
            val joinAsm = scg.nodes.filter(Assignment).filter[joinVOs.contains(valuedObject)]    
            for (join : joinAsm) {
                var Node prev = join
                while (prev != null) {
                    if (prev.allPrevious.size == 1) {
                        prev = prev.allPreviousHead.eContainer as Node
                        if (prev.isSSA(PHI)) {
                            exitPhis.put(prev as Assignment, join)
                        } else {
                            prev = null
                        }
                    } else {
                        prev = null
                    }
                }
            }        
        }
        // Exit phis
        for (n : exitPhis.keySet) {
            val f = n.expression as FunctionCall
            n.expression = createOperatorExpression(OperatorType.BITWISE_OR) => [
                subExpressions.addAll(newLinkedHashSet(f.parameters.map[(expression as ValuedObjectReference).valuedObject]).map[reference])
            ]
            val attach = exitPhis.get(n)
            n.annotations += createReferenceAnnotation => [
                name = ATTACH_ANNOTATION
                object = attach
            ]
        }
        phiNodes.removeAll(exitPhis.keySet)
        // Conditional Merge
        val newBBs = <BasicBlock, BasicBlock>newHashMap
        var phiNode = phiNodes.findFirst[incoming.size > 1]
        while (phiNode != null) {
            val node = phiNode
            val versions = (phiNode.expression as FunctionCall).parameters.toMap[
                bbVersion.get(it)
            ]
            for (in : node.incoming.immutableCopy) {
                scg.nodes += createAssignment => [
                    val prev = (in.eContainer as Node)
                    var attachPoint = prev
                    var cf = in
                    while (attachPoint != null && (attachPoint.isSSA || attachPoint.hasAnnotation(WeakUnemitSSATransformation.IMPLICIT_ANNOTAION))) {
                        cf = attachPoint.incoming.filter(ControlFlow).head
                        attachPoint = cf.eContainer as Node
                    }
                    val attach = attachPoint
                    val branch = if (attachPoint instanceof Conditional) {
                        if (attachPoint.then == cf) {
                            "then"
                        } else {
                            "else"
                        }
                    } else {
                        null
                    }
                    annotations += createReferenceAnnotation => [
                        name = ATTACH_ANNOTATION
                        object = attach
                    ]
                    if (branch != null) {
                        annotations += createStringAnnotation(BRANCH_ANNOTATION, branch)
                    }
                    val bb = prev.basicBlock
                    markSSA(PHI_ASM)
                    valuedObject = node.valuedObject
                    expression = versions.get(bb).expression.copy
                    in.target = it
                    next = createControlFlow => [
                        target = node.next.target
                    ]
                    // bb/sb for empty conditional branches do not exist
                    if (dt.successors(bb).size == 1) {
                        (in.eContainer as Node).schedulingBlock.nodes += it
                    } else if (!newBBs.containsKey(bb)){
                        scg.basicBlocks += createBasicBlock => [ b |
                            b.schedulingBlocks += createSchedulingBlock => [ s |
                                s.nodes += it
                            ]
                            node.basicBlock.predecessors.removeIf[basicBlock == bb]
                            b.createPredecessor(node.basicBlock)
                            bb.createPredecessor(b)
                            bbVersion.entrySet.filter[value == bb].forEach[value = b]
                        ]
                    } else {
                        newBBs.get(bb).schedulingBlocks.head.nodes += it
                    }
                ]
            }
            node.next.target = null
            node.remove
            phiNodes.remove(node)
            //Next
            phiNode = phiNodes.findFirst[incoming.size > 1]
        }
        // Join phis
        for (n : phiNodes) {
            val f = n.expression as FunctionCall
            n.expression = createOperatorExpression(OperatorType.BITWISE_OR) => [
                subExpressions.addAll(newLinkedHashSet(f.parameters.map[(expression as ValuedObjectReference).valuedObject]).map[reference])
            ]
            var attachPoint = n.allPreviousHeadNode
            while (!(attachPoint instanceof Join)) {
                attachPoint = attachPoint.allPreviousHeadNode
            }
            val attach = attachPoint
            n.annotations += createReferenceAnnotation => [
                name = ATTACH_ANNOTATION
                object = attach
            ]
        }
    }    
    
    def void propagatePhi(SCGraph scg, SSAFunction ssaF) {
        // Optimize Assignments
        val phiNodes = scg.nodes.filter(Assignment).filter[isSSA(ssaF)].toList
        val defs = HashMultimap.<ValuedObject, Assignment>create
        for (asm : scg.nodes.filter(Assignment)) {
            defs.put(asm.valuedObject, asm)
        }
        // FIXME optimize to topological sort!!!
        var continue = true
        while (continue && !phiNodes.empty) {
            val s = phiNodes.size
            for (n : phiNodes.immutableCopy) {
                if (n.expression instanceof ValuedObjectReference && (ssaF != PHI || !defs.get(n.valuedObject).filter[it != n].exists[it.hasAnnotation(WeakUnemitSSATransformation.IMPLICIT_ANNOTAION)])) {
                    val ref = n.expression as ValuedObjectReference
                    val bb = n.basicBlock
                    val refDef = defs.get(ref.valuedObject).immutableCopy
                    if (bb != null && refDef.exists[bb == it.basicBlock]) {
                        val asm = refDef.findFirst[bb == it.basicBlock]
                        asm.valuedObject = n.valuedObject
                        defs.remove(ref.valuedObject, asm)
                        defs.put(n.valuedObject, asm)
                        defs.remove(n.valuedObject, n)
                        for (in : n.incoming.immutableCopy) {
                            in.target = n.next.target
                        }
                        n.remove
                        phiNodes.remove(n)
                    } else if (ssaF == PHI) {
                        refDef.forEach[it.valuedObject = n.valuedObject]
                        defs.removeAll(ref.valuedObject)
                        defs.putAll(n.valuedObject, refDef)
                        defs.remove(n.valuedObject, n)
                        for (in : n.incoming.immutableCopy) {
                            in.target = n.next.target
                        }
                        n.remove
                        phiNodes.remove(n)
                    } else if (refDef.size == 1) {
                        n.expression = defs.get(ref.valuedObject).head.expression.copy
                        phiNodes.remove(n)
                    } else if (refDef.forall[it.expression instanceof BoolValue] && refDef.groupBy[(it.expression instanceof BoolValue).booleanValue].size == 1) {
                        n.expression = defs.get(ref.valuedObject).head.expression.copy
                        phiNodes.remove(n)
                    }
                }
            }
            if (s == phiNodes.size) {
                continue = false
            }
        }
    }
    
   private def createPredecessor(BasicBlock bb, BasicBlock target) {
        // Create a list for the predecessor objects.
        val predecessors = <Predecessor> newArrayList
        
        // Process each predecessor basic block.
            // Create a new predecessor object and set its basic block.
            if (bb != null) {
                val predecessor = ScgFactory::eINSTANCE.createPredecessor => [ basicBlock = bb ]
            
                // Additionally, check the last node of the predecessor block.
                val lastNode = bb.schedulingBlocks.last.nodes.last
                if (lastNode != null && lastNode instanceof Conditional) {
                   /**
                    * If it is a conditional, we want to mark this block appropriately and store a reference
                    * to the condition of the conditional. The scheduler can use this information without extra 
                    * examination of the basic blocks to generate the guard expressions.
                    * Therefore, check whether first node of the target block is the target of the then or else 
                    * branch of the conditional and add this information to the predecessor object. 
                    */
                    if (target.schedulingBlocks.head.nodes.head == (lastNode as Conditional).then.target) {
                        predecessor.branchType = BranchType::TRUEBRANCH
                    } else {
                        predecessor.branchType = BranchType::ELSEBRANCH
                    }
                    predecessor.conditional = lastNode as Conditional
                }
            
                // Add the predecessor to the predecessors list.
                predecessors.add(predecessor)
            }
        
        // Return the list.
        predecessors
    }
    
    def removeDeadCodeSimple(SCGraph scg) {
         for (c : scg.nodes.filter(Conditional).toList) {
            val cond = c.condition
            if (cond instanceof BoolValue) {
                var kill = if (cond.value) c.then else c.^else
                while (kill.target.incoming.filter(ControlFlow).size == 1) {
                    val t = kill.target
                    scg.nodes.remove(t)
                    kill.target = null
                    kill = (t as Assignment).allNext.head
                }
                val keep = if (!cond.value) c.then else c.^else
                c.incoming.toList.forEach[target = keep.target]
                keep.target = null
                scg.nodes.remove(c)
            }
        }
    }
    
}
    