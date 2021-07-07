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

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.ParameterAccessType
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingEcoreUtilExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import java.util.List
import de.cau.cs.kieler.scg.ScgFactory

/**
 * @author glu
 * 
 */
class ReferenceCallProcessor extends InplaceProcessor<SCGraphs> implements Traceable {

    @Inject extension SCGControlFlowExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension TracingEcoreUtilExtensions

    public static val REF_CALL_TICK_METHOD_NAME = "tick"
    public static val REF_CALL_RESET_METHOD_NAME = "reset"
    public static val REF_CALL_CPIN_METHOD_NAME = "copy_inputs"
    public static val REF_CALL_CPOUT_METHOD_NAME = "copy_outputs"
    public static val REF_CALL_TERM_METHOD_NAME = "get_term"
    public static val REF_CALL_TAG_ANNOTATION = "Module"

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
                if (ref.subReference.valuedObject.name == REF_CALL_TICK_METHOD_NAME ||
                    ref.subReference.valuedObject.name == REF_CALL_RESET_METHOD_NAME) {
                    (ref.eContainer as Assignment).expression = createFunctionCall => [
                        functionName = ref.subReference.valuedObject.name + decl.name
                        it.parameters.add(createParameter => [
                            it.accessType = ParameterAccessType::CALL_BY_REFERENCE
                            it.expression = (createValuedObject => [
                                name = ref.valuedObject.name
                            ]).reference
                        ])
                    ]
                } else if (ref.subReference.valuedObject.name == REF_CALL_CPIN_METHOD_NAME ||
                    ref.subReference.valuedObject.name == REF_CALL_CPOUT_METHOD_NAME) {
                    val originalAsmt = ref.eContainer as Assignment
                    val nextCF = originalAsmt.next
                    val newAssignments = <Assignment>newLinkedList
                    val params = ref.parameters
                    while (!params.empty) {
                        val newAsmt = ScgFactory::eINSTANCE.createAssignment
                        val fromExp = params.remove(0).expression
                        val toExp = params.remove(0).expression
                        if (ref.subReference.valuedObject.name == REF_CALL_CPIN_METHOD_NAME) {
                            newAsmt.expression = fromExp.copy
                            newAsmt.reference = toExp.asValuedObjectReference
                        } else {
                            newAsmt.expression = toExp.copy
                            newAsmt.reference = fromExp.asValuedObjectReference
                        }
                        newAssignments += newAsmt
                    }
                    // place new assignments in the scg
//                        scg.nodes.addAll(newAssignments)
                    newAssignments.take(newAssignments.length - 1).indexed.forEach [
                        val index = key
                        val assignment = value
                        assignment.next = assignment.createControlFlow => [target = newAssignments.get(index + 1)]
                    ]
                    newAssignments.last.next = nextCF
//                        originalAsmt.incomingLinks.forEach[target = newAssignments.head]
                } else {
                    environment.warnings.add(
                        "Unknown method call" + ref.subReference.valuedObject.name + "in module stub state"
                    )
                }
            }
        ]

        val termCalls = scg.nodes.filter(Conditional).map[condition].filter(ReferenceCall).filter [
            moduleClasses.contains(valuedObject.eContainer) &&
                subReference.valuedObject.name == REF_CALL_TERM_METHOD_NAME
        ]
        termCalls.forEach [ termCall |
            val cond = termCall.eContainer as Conditional
            // evil stuff TODO exorcise demons
            cond.condition = createTextExpression("d->" + termCall.valuedObject.name + "._TERM")
        ]

        moduleClasses.forEach[name = "TickData" + name]
    }

    protected def List<ClassDeclaration> getModuleClasses(SCGraph scg) {
        return scg.declarations.filter(ClassDeclaration).filter[hasAnnotation(REF_CALL_TAG_ANNOTATION)].toList
    }

}
