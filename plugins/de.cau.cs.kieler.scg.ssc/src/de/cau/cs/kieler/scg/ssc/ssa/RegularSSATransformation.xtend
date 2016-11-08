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
package de.cau.cs.kieler.scg.ssc.ssa

import com.google.common.base.Function
import com.google.common.collect.BiMap
import com.google.common.collect.HashBiMap
import com.google.common.collect.HashMultimap
import com.google.common.collect.LinkedHashMultimap
import com.google.common.collect.Multimap
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.Parameter
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.util.Pair
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.RelativeWrite_Read
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ScgPackage
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.UnsupportedSCGException
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.ssc.features.SSAFeature
import de.cau.cs.kieler.scg.ssc.ssa.domtree.DominatorTree
import java.util.Collection
import java.util.Deque
import java.util.LinkedList
import javax.inject.Inject

import static com.google.common.collect.Lists.*
import static com.google.common.collect.Maps.*
import static de.cau.cs.kieler.scg.ssc.ssa.SSACoreExtensions.*
import static de.cau.cs.kieler.scg.ssc.ssa.SSAFunction.*

import static extension com.google.common.base.Predicates.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.ssc.ssa.processors.SSAOptimizer
import de.cau.cs.kieler.scg.ssc.ssa.processors.SeqConcTransformer
import de.cau.cs.kieler.scg.DataDependency
import java.util.List
import java.util.Iterator
import org.eclipse.emf.common.util.EList
import com.google.common.collect.HashBasedTable
import com.google.common.collect.Table

/**
 * The SSA transformation for SCGs
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class RegularSSATransformation extends AbstractProductionTransformation {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "scg.ssa.regular"
    }

    override getName() {
        return "Regular SSA"
    }

    override getProducedFeatureId() {
        return SSAFeature.ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::BASICBLOCK_ID)
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    extension ScgFactory = ScgPackage.eINSTANCE.scgFactory
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SSACoreExtensions

    // -------------------------------------------------------------------------
    def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
        
        // It is expected that this node is an entry node.
        val entryNode = scg.nodes.head
        if (!(entryNode instanceof Entry) || scg.basicBlocks.head.schedulingBlocks.head.nodes.head != entryNode) {
            throw new UnsupportedSCGException(
                "The SSA analysis expects an entry node as first node in the first basic block!")
        }
        val entryBB = scg.basicBlocks.head
        
        // Create new declarations for SSA versions
        val ssaDecl = scg.createSSADeclarations
        val dt = new DominatorTree(scg)
        
        // ---------------
        // 1. Place Phi
        // ---------------
        scg.placePhi(dt)
        
        // ---------------
        // 2. Renaming
        // ---------------
        scg.rename(dt, entryBB, ssaDecl)
        scg.createStringAnnotation(SSAFeature.ID, SSAFeature.ID)

        // ---------------
        // 3. Remove unused ssa versions
        // ---------------
        scg.removeUnusedSSAVersions

        // ---------------
        // 4. Update SSA VO version numbering
        // ---------------   
        scg.updateSSAVersions
        
        return scg
    }

    // -------------------------------------------------------------------------
    /**
     * Places phi nodes.
     */
    protected def Collection<Assignment> placePhi(SCGraph scg, DominatorTree dt) {
        val placedAssignment = newLinkedHashSet
        val hasPhi = newHashMap
        val work = newHashMap
        val workStack = <BasicBlock>newLinkedList
        val defsite = scg.defSite
        var iterCount = 0
        // Init with bb and 0
        hasPhi.putAll(scg.basicBlocks.toInvertedMap[0])
        work.putAll(hasPhi)

        for (vo : scg.declarations.allValuedObjectsOrdered.reverseView) {
            iterCount++
            for (n : defsite.get(vo)) {
                work.put(n, iterCount)
                workStack.push(n)
                while (!workStack.empty) {
                    workStack.pop
                    for (m : dt.getDominanceFrontiers(n)) {
                        // insert phi
                        if (hasPhi.get(m) < iterCount) {
                            var bbHead = m.firstNode
                            // Create Phi assignment
                            val asm = createAssignment
                            val bbHeadSB = bbHead.schedulingBlock
                            bbHeadSB.nodes.add(bbHeadSB.nodes.indexOf(bbHead), asm)
                            scg.nodes.add(scg.nodes.indexOf(bbHead), asm)
                            placedAssignment.add(asm)
                            asm.valuedObject = vo
                            asm.markSSA(PHI)
                            asm.assignment = PHI.createFunction
                            if (bbHead instanceof Join) {
                                // Insert after
                                val cf = bbHead.allNext.head
                                asm.createControlFlow.target = cf.target
                                cf.target = asm
                            } else {
                                // Insert before
                                bbHead.allPrevious.toList.forEach[target = asm]
                                asm.createControlFlow.target = bbHead
                            }
                            // Add to work
                            hasPhi.put(m, iterCount)
                            if (work.get(m) < iterCount) {
                                work.put(m, iterCount)
                                workStack.add(m)
                            }
                        }
                    }
                }
            }
        }
        return placedAssignment
    }

    protected def void rename(SCGraph scg, DominatorTree dt, BasicBlock start, BiMap<ValuedObject, Declaration> ssaDecl) {
        val versionStack = <ValuedObject, LinkedList<Integer>>newHashMap
        val versionStackFunc = [ ValuedObject vo |
            var voStack = versionStack.get(vo)
            if (voStack == null) {
                voStack = newLinkedList(0)
                versionStack.put(vo, voStack)
            }
            return voStack
        ]
        recursiveRename(start, dt, versionStackFunc, ssaDecl)
    }

    protected def void recursiveRename(BasicBlock block, DominatorTree dt, Function<ValuedObject, Deque<Integer>> stack, BiMap<ValuedObject, Declaration> ssaDecl) {
        val renamedDefs = <ValuedObject>newLinkedList
        for (sb : block.schedulingBlocks) {
            for (s : sb.nodes) {
                if (!s.isSSA && (s instanceof Assignment || s instanceof Conditional)) {
                    val expr = s.eContents.filter(Expression).head
                    for (ref : expr.allReferences) {
                        val vo = ref.valuedObject
                        ref.valuedObject = ssaDecl.get(vo).valuedObjects.get(stack.get(vo).peek)
                    }
                }
                if (s instanceof Assignment) {
                    // create new version
                    var vo = s.valuedObject
                    val version = ssaDecl.get(vo).valuedObjects.size
                    val newVO = vo.copy
                    ssaDecl.get(vo).valuedObjects.add(newVO)
                    stack.get(vo).push(version)
                    s.valuedObject = newVO
                    renamedDefs.add(vo)
                }
            }
        }
        for (m : dt.successors(block)) {
            for (sb : m.schedulingBlocks) {
                for (asm : sb.nodes.filter(Assignment).filter[isSSA(PHI)]) {
                    val vo = if (ssaDecl.containsKey(asm.valuedObject)) {
                        asm.valuedObject
                    } else {
                        ssaDecl.inverse.get(asm.valuedObject.declaration)
                    }
                    (asm.assignment as FunctionCall).createParameter(
                        ssaDecl.get(vo).valuedObjects.get(stack.get(vo).peek).reference)
                }
            }
        }
        val bbs = (block.eContainer as SCGraph).basicBlocks
        for (m : dt.children(block).sortBy[bbs.indexOf(it)]) {
            m.recursiveRename(dt, stack, ssaDecl)
        }
        // leave version scopes
        for (vo : renamedDefs) {
            stack.get(vo).pop
        }
    }

    protected def get(Function<ValuedObject, Deque<Integer>> stackFunc, ValuedObject vo) {
        return stackFunc.apply(vo)
    }

    protected def allValuedObjectsOrdered(Collection<Declaration> declarations) {
        val vars = newArrayListWithExpectedSize(declarations.size)
        declarations.forEach [
            vars.addAll(it.valuedObjects)
        ]
        return vars
    }

    def firstNode(BasicBlock block) {
        // Assuming the nodes are ordered correctly
        return block.schedulingBlocks.head.nodes.head
// FIXME otherwise uncomment
//        var bbHead = block.schedulingBlocks.head.nodes.head
//        var bbHeadPrev = bbHead.allPrevious.map[eContainer as Node].head
//        while (bbHead.allPrevious.size == 1 && bbHeadPrev.basicBlock == m && !bbHeadPrev.hasAnnotation(SSA)) {
//            bbHead = bbHeadPrev
//            bbHeadPrev = bbHead.allPrevious.map[eContainer as Node].head
//        }
//        return bbHead
    }
    
    protected def defSite(SCGraph scg) {
        val defsite = HashMultimap.<ValuedObject, BasicBlock>create
        for (asm : scg.nodes.filter(Assignment)) {
            defsite.put(asm.valuedObject, asm.basicBlock)
        }
        return defsite
    }
}
    