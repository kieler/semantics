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
package de.cau.cs.kieler.scg.processors.ssa

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.common.SCGAnnotations
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.ssa.IOPreserverExtensions
import de.cau.cs.kieler.scg.ssa.SSACoreExtensions
import de.cau.cs.kieler.scg.ssa.SSAParameterProperty
import de.cau.cs.kieler.scg.ssa.SSATransformationExtensions
import de.cau.cs.kieler.scg.ssa.domtree.DominatorTree
import javax.inject.Inject

import static com.google.common.collect.Maps.*
import static de.cau.cs.kieler.scg.DataDependencyType.*
import static de.cau.cs.kieler.scg.ssa.SSAFunction.*
import static de.cau.cs.kieler.scg.ssa.SSAParameterProperty.*
import de.cau.cs.kieler.scg.Entry

/**
 * The SSA transformation for SCGs with simplified SC semantics.
 * 
 * - Uses psi/pi node for merging versions without further semantic information.
 * - Does not preserve outputs naming.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SimpleSCSSATransformation extends InplaceProcessor<SCGraphs> implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.scg.processors.ssa.scssa.simple"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Simple SCSSA"
    }
    
    override process() {
        model.scgs.forEach[transform]
        model = model
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KEffectsExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension IOPreserverExtensions
    @Inject extension SSACoreExtensions
    @Inject extension SSATransformationExtensions
    
    // -------------------------------------------------------------------------
    def SCGraph transform(SCGraph scg) {
        validateStructure(scg)
        validateExpressions(scg)
        
        scg.normalizeAssignments
        
        val entryBB = scg.basicBlocks.head
        val entryNode = entryBB.nodes.head as Entry
        
        // Create new declarations for SSA versions
        val ssaDecl = scg.createSSADeclarations
        val dt = new DominatorTree(scg)
        
        // ---------------
        // 2. Preserve output behavior
        // ---------------
        scg.createInputPreservingAssignments(entryNode, true)
//        scg.snapshot
        
        // ---------------
        // 1. Place Phi & Psi
        // ---------------
        dt.place[ ValuedObject vo, Node bbHead |
            val asm = phiPlacer.apply(vo, bbHead)
            
            if (bbHead instanceof Join) {
                asm.expression = PSI.createFunction
                asm.markSSA(PSI)
            }
            
            return asm
        ]
        
        // ---------------
        // 3. Place Pi at thread read access on shared variables
        // ---------------
        val piSSAReferences = scg.placePi
        scg.snapshot
        
        
        // ---------------
        // 2. Renaming
        // ---------------
        val parameters = dt.rename(entryBB, ssaDecl)[isSSA]
        environment.setProperty(SSA_PARAMETER_PROPERTY, new SSAParameterProperty(parameters))
        
        // ---------------
        // 5. Fix Pi references
        // ---------------
        
        // Fix incoming version
        for (piNode : scg.nodes.filter(Assignment).filter[isSSA(PI)]) {
            // Move a uniqe incoming vo-ref to the front
            val fc = piNode.expression as FunctionCall
            val exp = fc.parameters.findFirst[expression !== null]
            fc.parameters.removeIf[expression !== null]
            fc.parameters.add(0, exp)
        }
        // Fix empty parameter
        for (ref : piSSAReferences.entries) {
            ref.value.expression = ref.key.valuedObject.reference
        }
        scg.annotations += createStringAnnotation(SCGAnnotations.ANNOTATION_SSA, ID)
//        scg.snapshot

        // ---------------
        // 6. Remove input preserver
        // ---------------
        scg.removeInputPreservingAssignments

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
        val nodes = newLinkedHashMap
        for (n : scg.nodes.filter[!isSSA]) {
            val incomingDeps = n.incoming.filter(DataDependency).filter[concurrent && (type == WRITE_READ || type == WRITE_RELATIVEWRITE)].toList
            if (!incomingDeps.empty) {
                val concVODefs = HashMultimap.<ValuedObject, Assignment>create
                incomingDeps.forEach[
                    val asm = eContainer as Assignment
                    concVODefs.put(asm.valuedObject, asm)
                ]
                val sb = n.schedulingBlock
                var headNode = n
                for (vo : concVODefs.keySet) {
                    // Create Pi assignment
                    val asm = ScgFactory.eINSTANCE.createAssignment
                    sb.nodes.add(sb.nodes.indexOf(headNode), asm)
                    nodes.put(headNode, asm)
                    asm.valuedObject = vo
                    asm.markSSA(PI)
                    val func = PI.createFunction
                    asm.expression = func
                    // Insert before
                    headNode.allPrevious.toList.forEach[target = asm]
                    asm.createControlFlow.target = headNode
                    // Create Parameters
                    for (concDef : concVODefs.get(vo)) {
                        val param = createParameter
                        func.parameters.add(param)
                        refs.put(concDef, param)
                    }
                    headNode = asm
                }
            }
        }
        for (entry : nodes.entrySet) {
            scg.nodes.add(scg.nodes.indexOf(entry.key), entry.value)
        }
        return refs
    }

}
    