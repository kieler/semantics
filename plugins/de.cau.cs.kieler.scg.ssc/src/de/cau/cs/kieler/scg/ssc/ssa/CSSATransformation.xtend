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

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.Parameter
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ScgPackage
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.UnsupportedSCGException
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.ssc.features.SSAFeature
import de.cau.cs.kieler.scg.ssc.ssa.domtree.DominatorTree
import java.util.Collection
import javax.inject.Inject

import static com.google.common.collect.Maps.*
import static de.cau.cs.kieler.scg.ssc.ssa.SSAFunction.*
import de.cau.cs.kieler.scg.RelativeWrite_Read
import de.cau.cs.kieler.scg.AbsoluteWrite_Read
import de.cau.cs.kieler.scg.AbsoluteWrite_RelativeWrite

/**
 * The SSA transformation for SCGs
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class CSSATransformation extends RegularSSATransformation {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "scg.ssa.cssa"
    }

    override getName() {
        return "CSSA"
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
    override transform(SCGraph scg, KielerCompilerContext context) {
        
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
        val phiDefs = scg.placePhi(dt)
        
        // ---------------
        // 2. Replace Phi at thread join by Psi
        // ---------------
        scg.placePsi(phiDefs)

        // ---------------
        // 3. Place Pi at thread read access on shared variables
        // ---------------
        val ssaReferences = scg.placePi
        
        // ---------------
        // 4. Renaming
        // ---------------
        scg.rename(dt, entryBB, ssaDecl)

        // ---------------
        // 5. Fix Pi references
        // ---------------
        for (ref : ssaReferences.entries) {
            ref.value.expression = ref.key.valuedObject.reference
        }
        scg.createStringAnnotation(SSAFeature.ID, SSAFeature.ID)

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

    // -------------------------------------------------------------------------
    
    protected def Collection<Assignment> placePsi(SCGraph scg, Collection<Assignment> phiDefs) {
        val psiDefs = newHashSet
        for (phi : phiDefs) {
            var Node predecessor = phi
            var continue = true
            var psi = false
            while (continue) {
                val predecessors = predecessor.incoming.filter(ControlFlow).toList
                if (predecessors.size != 1) {
                    continue = false
                } else {
                    predecessor = predecessors.head.eContainer as Node
                    if (predecessor instanceof Join) {
                        continue = false
                        psi = true
                    } else if (!predecessor.isSSA){
                        continue = false
                    }
                }
            }
            if (psi) {
                phi.markSSA(PSI)
                (phi.assignment as FunctionCall).functionName = PSI.symbol
                psiDefs.add(phi)
            }
        }
        return psiDefs
    }

    protected def Multimap<Assignment, Parameter> placePi(SCGraph scg) {
        val refs = HashMultimap.<Assignment, Parameter>create
        val nodes = newHashMap
        for (n : scg.nodes.filter[!isSSA]) {
            val incomingDeps = n.incoming.filter(DataDependency).filter[concurrent && (it instanceof RelativeWrite_Read || it instanceof AbsoluteWrite_Read || it instanceof AbsoluteWrite_RelativeWrite)].toList
            if (!incomingDeps.empty) {
                val concVODefs = HashMultimap.<ValuedObject, Assignment>create
                incomingDeps.forEach[
                    val asm = eContainer as Assignment
                    concVODefs.put(asm.valuedObject, asm)
                ]
                for (vo : concVODefs.keySet) {
                    // Create Pi assignment
                    val asm = createAssignment
                    val sb = n.schedulingBlock
                    sb.nodes.add(sb.nodes.indexOf(n), asm)
                    nodes.put(n, asm)
                    asm.valuedObject = vo
                    asm.markSSA(PI)
                    val func = PI.createFunction
                    asm.assignment = func
                    // Insert before
                    n.allPrevious.toList.forEach[target = asm]
                    asm.createControlFlow.target = n
                    // Create Parameters
                    for (concDef : concVODefs.get(vo)) {
                        val param = createParameter
                        func.parameters.add(param)
                        refs.put(concDef, param)
                    }
                }
            }
        }
        for (entry : nodes.entrySet) {
            scg.nodes.add(scg.nodes.indexOf(entry.key), entry.value)
        }
        return refs
    }

}
    