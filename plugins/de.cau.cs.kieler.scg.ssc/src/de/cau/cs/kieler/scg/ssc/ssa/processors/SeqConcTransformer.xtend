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
import de.cau.cs.kieler.core.kexpressions.Declaration
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
import de.cau.cs.kieler.scg.ssc.ssa.SSACacheExtensions
import de.cau.cs.kieler.scg.ssc.ssa.SSACoreExtensions
import javax.inject.Inject
import static de.cau.cs.kieler.scg.ssc.ssa.SSAFunction.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
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
    @Inject
    extension SCGCoreExtensions

    @Inject
    extension SCGControlFlowExtensions

    extension ScgFactory = ScgPackage.eINSTANCE.scgFactory

    @Inject
    extension KExpressionsValuedObjectExtensions

    @Inject
    extension SSACoreExtensions
    @Inject
    extension SSACacheExtensions
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
            (asm.assignment as FunctionCall).functionName = SEQ.symbol
        }

        // Rename separate conc from seq
        for (asm : readJoinDef) {
            val fc = asm.assignment as FunctionCall
            val updateFC = fc.ssaParameterFunction(UPDATE)
            if (updateFC != null) {
                // FIXME this is WRONG
//                fc.parameters.remove(updateFC.eContainer)
//                fc.parameters.addAll(updateFC.parameters.sortBy[(expression as ValuedObjectReference).versionIndex])
            }
            val initFC = fc.ssaParameterFunction(INIT)
            if (initFC != null) {
                if (fc.parameters.size == 1) {
                    fc.functionName = CONC.symbol
                    fc.parameters.clear
                    fc.parameters += initFC.parameters
                } else if (initFC.parameters.size == 1) {
                    (initFC.eContainer as Parameter).expression = initFC.parameters.head.expression
                    fc.functionName = SEQ.symbol
                } else {
                    // Prepend conc function
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
                    (initFC.eContainer as Parameter).expression = newVO.reference
                    piAsm.assignment = initFC
                    // Insert before
                    asm.allPrevious.toList.forEach[target = piAsm]
                    piAsm.createControlFlow.target = asm
                    initFC.functionName = CONC.symbol
                    fc.functionName = SEQ.symbol
                }
            } else {
                fc.functionName = SEQ.symbol
            }
        }

        scg.updateSSAVersions

        scg.createStringAnnotation(SSASeqConcFeature.ID, SSASeqConcFeature.ID)
        return scg
    }

    private def int versionIndex(ValuedObjectReference ref) {
        val decl = ref.valuedObject.eContainer as Declaration
        return decl.valuedObjects.indexOf(ref.valuedObject)
    }

}
