/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors

import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import java.util.List
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGManipulationExtensions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCallExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.ParameterAccessType

/**
 * @author glu
 * 
 */
class ReferenceCallProcessor extends InplaceProcessor<SCGraphs> implements Traceable {

    @Inject extension SCGCoreExtensions
    @Inject extension SCGDeclarationExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGManipulationExtensions
    @Inject extension SCGMethodExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCallExtensions
    @Inject extension KExpressionsCreateExtensions

    override getId() {
        "de.cau.cs.kieler.scg.processors.referenceCall"
    }

    override getName() {
        "Reference Call"
    }

    override process() {
        setModel(model.transformAll)
    }

    def SCGraphs transformAll(SCGraphs scgs) {
        scgs => [
            it.scgs.forEach[transform]
        ]
    }

    def transform(SCGraph scg) {
        val moduleClasses = scg.getModuleClasses

        val assignments = scg.nodes.filter(Assignment)
        val refCalls = assignments.map[expression].filter(ReferenceCall)
        refCalls.forEach [ ref |
            val cont = ref.valuedObject.eContainer
            if (ClassDeclaration.isInstance(cont) && moduleClasses.contains(cont)) {
                val decl = cont as ClassDeclaration
                (ref.eContainer as Assignment).expression = createFunctionCall => [
                    functionName = ref.subReference.valuedObject.name + decl.name
                    it.parameters.add(createParameter => [
                        it.accessType = ParameterAccessType::CALL_BY_REFERENCE
                        it.expression = (createValuedObject => [
                            name = ref.valuedObject.name
                        ]).reference
                    ])
                ]
            }
        ]

        moduleClasses.forEach[name = "TickData" + name]
    }

    protected def List<ClassDeclaration> getModuleClasses(SCGraph scg) {
        return scg.declarations.filter(ClassDeclaration).filter[hasAnnotation("Module")].toList
    }

}
