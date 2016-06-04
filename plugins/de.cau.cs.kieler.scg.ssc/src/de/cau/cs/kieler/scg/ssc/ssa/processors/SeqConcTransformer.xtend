/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
package de.cau.cs.kieler.scg.ssc.ssa.processors

import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.Parameter
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ScgPackage
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.ssc.features.SSAOptFeature
import de.cau.cs.kieler.scg.ssc.features.SSASeqConcFeature
import de.cau.cs.kieler.scg.ssc.ssa.SSAHelperExtensions
import javax.inject.Inject

import static de.cau.cs.kieler.scg.ssc.ssa.SSATransformation.*

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.kexpressions.Declaration

/**
 * The SSA transformation for SCGs
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SeqConcTransformer extends AbstractProductionTransformation {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "scg.ssa.seqconc"
    }

    override getName() {
        return "SSA Seq Conc"
    }

    override getProducedFeatureId() {
        return SSASeqConcFeature.ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SSAOptFeature.ID)
    }

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
//    override getId() {
//        return "scg.ssa.optimizer"
//    }
//
//    override getName() {
//        return "Seq Conc Transformer"
//    }
    // -------------------------------------------------------------------------
    public static val SEQ = "seq"
    public static val CONC = "conc"

    // -------------------------------------------------------------------------
    @Inject
    extension SCGCoreExtensions

    @Inject
    extension SCGControlFlowExtensions

    extension ScgFactory = ScgPackage.eINSTANCE.scgFactory

    @Inject
    extension KExpressionsValuedObjectExtensions

    @Inject
    extension SSAHelperExtensions
    @Inject
    extension AnnotationsExtensions

    // -------------------------------------------------------------------------
//    def SCGraph process(SCGraph scg, KielerCompilerContext context) {
    def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
        val seqDef = context.getSeqDef(scg)
        val readDef = context.getReadDef(scg)
        val joinDef =  context.getJoinDef(scg)
        val readJoinDef = newHashSet
        readJoinDef += readDef
        readJoinDef += joinDef
       

        // Rename phi function
        for (asm : seqDef) {
            (asm.assignment as FunctionCall).functionName = SEQ
        }

        // Rename separate conc from seq
        for (asm : readJoinDef) {
            val fc = asm.assignment as FunctionCall
            val psi = fc.ssaParameterFunction(PSI_SYMBOL)
            if (psi != null) {
                fc.parameters.remove(psi.eContainer)
                fc.parameters.addAll(psi.parameters.sortBy[(expression as ValuedObjectReference).versionIndex])
            }
            val pi = fc.ssaParameterFunction(PI_SYMBOL)
            if (pi != null) {
                if (fc.parameters.size == 1) {
                    fc.functionName = CONC
                    fc.parameters.clear
                    fc.parameters += pi.parameters
                } else if (pi.parameters.size == 1) {
                    (pi.eContainer as Parameter).expression = pi.parameters.head.expression
                    fc.functionName = SEQ
                } else {
                    // Prepend pi function
                    val piAsm = createAssignment
                    val sbNodes = asm.schedulingBlock.nodes
                    sbNodes.add(sbNodes.indexOf(asm), piAsm)
                    scg.nodes.add(scg.nodes.indexOf(asm), piAsm)
                    val vo = asm.valuedObject
                    val vos = vo.declaration.valuedObjects
                    val newVO = asm.valuedObject.copy
                    vos.add(vos.indexOf(vo), newVO)
                    piAsm.valuedObject = newVO
                    piAsm.markSSA(CONC)
                    (pi.eContainer as Parameter).expression = newVO.reference
                    piAsm.assignment = pi
                    // Insert before
                    asm.allPrevious.toList.forEach[target = piAsm]
                    piAsm.createControlFlow.target = asm
                    pi.functionName = CONC
                    fc.functionName = SEQ
                }
            } else {
                fc.functionName = SEQ
            }
            if (fc.parameters.size == 1) {
                asm.assignment = fc.parameters.head.expression
            }
        }

        // rename VOs
        for (decl : scg.declarations.filter[isSSA]) {
            for (vo : decl.valuedObjects.indexed) {
                // TODO handle variable names which contain numbers
                vo.value.name = vo.value.name.replaceAll("[0-9]*$", "") + vo.key
            }
        }

        scg.createStringAnnotation(SSASeqConcFeature.ID, SSASeqConcFeature.ID)
        return scg
    }

    private def int versionIndex(ValuedObjectReference ref) {
        val decl = ref.valuedObject.eContainer as Declaration
        return decl.valuedObjects.indexOf(ref.valuedObject)
    }

}
