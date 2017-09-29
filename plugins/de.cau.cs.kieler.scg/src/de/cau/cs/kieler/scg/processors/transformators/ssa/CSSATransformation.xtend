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
import com.google.common.collect.Multimap
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ScgPackage
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.common.SCGAnnotations
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.ssa.SSACoreExtensions
import de.cau.cs.kieler.scg.ssa.SSATransformationExtensions
import de.cau.cs.kieler.scg.ssa.domtree.DominatorTree
import javax.inject.Inject

import static com.google.common.collect.Maps.*
import static de.cau.cs.kieler.scg.DataDependencyType.*
import static de.cau.cs.kieler.scg.ssa.SSAFunction.*

/**
 * The SSA transformation for SCGs
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class CSSATransformation extends InplaceProcessor<SCGraphs> implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "de.cau.cs.kieler.scg.processors.transformators.ssa.cssa"
    }

    override getName() {
        return "CSSA"
    }
    
    override process() {
        model.scgs.forEach[transform]
        model = model
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
    @Inject extension SSATransformationExtensions
    
    // -------------------------------------------------------------------------
    def SCGraph transform(SCGraph scg) {
        validate(scg)
        
        if (scg.nodes.exists[it instanceof Surface]) {
            environment.warnings.add("Cannot handle SCG with Concurrency or synchronous ticks")
        }
        
        val entryBB = scg.basicBlocks.head
        
        // Create new declarations for SSA versions
        val ssaDecl = scg.createSSADeclarations
        val dt = new DominatorTree(scg)
        
        // ---------------
        // 1. Place Phi & Psi
        // ---------------
        dt.place[ ValuedObject vo, Node bbHead |
            val asm = phiPlacer.apply(vo, bbHead)
            
            if (bbHead instanceof Join) {
                asm.expression = PSI.createFunction
            }
            
            return asm
        ]
        scg.snapshot
        
        // ---------------
        // 3. Place Pi at thread read access on shared variables
        // ---------------
        val ssaReferences = scg.placePi
        scg.snapshot
        
        
        // ---------------
        // 2. Renaming
        // ---------------
        dt.rename(entryBB, ssaDecl)
        scg.snapshot
        
        // ---------------
        // 5. Fix Pi references
        // ---------------
        for (ref : ssaReferences.entries) {
            ref.value.expression = ref.key.valuedObject.reference
        }        
        scg.annotations += createStringAnnotation(SCGAnnotations.ANNOTATION_SSA, id)
        scg.snapshot

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
 
    protected def Multimap<Assignment, Parameter> placePi(SCGraph scg) {
        val refs = HashMultimap.<Assignment, Parameter>create
        val nodes = newHashMap
        for (n : scg.nodes.filter[!isSSA]) {
            val incomingDeps = n.incoming.filter(DataDependency).filter[concurrent && (type == WRITE_READ || type == WRITE_RELATIVEWRITE)].toList
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
                    asm.expression = func
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
    