/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ParameterAccessType
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingEcoreUtilExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import java.util.List

/**
 * Implements the Module Call Semantics SCG transformation.
 * 
 * @author glu
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

    protected var List<ClassDeclaration> moduleClasses

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
        moduleClasses = scg.getModuleClasses
        val assignments = scg.nodes.immutableCopy.filter(Assignment)
        val refCalls = assignments.map[expression].filter(ReferenceCall)
        // Inspect all function calls within assignment nodes in the entire SCG
        refCalls.forEach [ ref |
            val cont = ref.valuedObject.eContainer
            // Process only functions that are defined by a module class (created in the MCS SCCharts tranformation)
            if (ClassDeclaration.isInstance(cont) && moduleClasses.contains(cont)) {
                val decl = cont as ClassDeclaration
                val referencedMethod = ref.subReference.valuedObject
                // Correct the syntax of tick and reset method calls
                if (referencedMethod.name == REF_CALL_TICK_METHOD_NAME ||
                    referencedMethod.name == REF_CALL_RESET_METHOD_NAME) {
                    rephraseCall(ref, decl)
                // Replace copy_inputs and copy_outputs calls with assignment nodes
                } else if (referencedMethod.name == REF_CALL_CPIN_METHOD_NAME ||
                    referencedMethod.name == REF_CALL_CPOUT_METHOD_NAME) {
                    val newAssignments = createArgpassingAssignments(scg, ref, referencedMethod)
                    rephraseArgpassing(scg, ref, newAssignments)
                } else {
                    environment.warnings.add(
                        "Unknown method call " + referencedMethod.name + " in module stub state"
                    )
                }
            }
        ]
        // handle calls to get_term()
        rephraseTerminationChecks(scg)
        // rename module classes if necessary
        renameModuleClasses()
    }
    
    /** Replaces calls to get_term with references to the callee's actual termination flag.*/
    protected def rephraseTerminationChecks(SCGraph scg) {
        val termCalls = scg.nodes.filter(Conditional).map[condition].filter(ReferenceCall).filter [
            moduleClasses.contains(valuedObject.eContainer) &&
                subReference.valuedObject.name == REF_CALL_TERM_METHOD_NAME
        ]
        termCalls.forEach [ termCall |
            val cond = termCall.eContainer as Conditional
            val instance = termCall.valuedObject
            val subref = (termCall.valuedObject.eContainer as ClassDeclaration).declarations.filter(
                VariableDeclaration).map[valuedObjects].flatten.findFirst[name == "_TERM"].reference
            cond.condition = instance.reference => [subReference = subref]
        ]
        
        // handle calls to get_term() within operator expressions
        val opExpressions = scg.nodes.filter(Conditional).map[condition].filter(OperatorExpression)
        opExpressions.forEach [
            handleOperatorExpression
        ]
    }
    
    /** Recursively searches the subexpressions of an operation in order to rephrase termination checks within.*/
    protected def void handleOperatorExpression(OperatorExpression expression) {
        expression.subExpressions.indexed.forEach [ indexExp |
            val index = indexExp.key
            val subExp = indexExp.value
            if (OperatorExpression.isInstance(subExp)) {
                (subExp as OperatorExpression).handleOperatorExpression
            } else if (ReferenceCall.isInstance(subExp)) {
                val refCall = subExp as ReferenceCall
                if (moduleClasses.contains(refCall.valuedObject.eContainer) &&
                    refCall.subReference.valuedObject.name == REF_CALL_TERM_METHOD_NAME) {
                    val instance = refCall.valuedObject
                    val subref = (refCall.valuedObject.eContainer as ClassDeclaration).declarations.filter(
                        VariableDeclaration).map[valuedObjects].flatten.findFirst[name == "_TERM"].reference
                    expression.subExpressions.set(index, instance.reference => [subReference = subref])
                }
            }
        ]
    }
    
    /** Replaces a node with sequence of assignment nodes.*/
    protected def rephraseArgpassing(SCGraph scg, ReferenceCall reference, List<Assignment> newAssignments) {
        val originalAsmt = reference.eContainer as Assignment
        val nextCF = originalAsmt.next
        if (!newAssignments.empty) {
            // place new assignments in the scg
            scg.nodes.addAll(newAssignments)
            newAssignments.take(newAssignments.length - 1).indexed.forEach [
                val index = key
                val assignment = value
                assignment.next = assignment.createControlFlow => [target = newAssignments.get(index + 1)]
            ]
            newAssignments.last.next = nextCF
            originalAsmt.incomingLinks.immutableCopy.forEach[target = newAssignments.head]
            scg.nodes.remove(originalAsmt)
        } else {
            // newAssignments is empty => no values to copy => skip assignment node entirely
            originalAsmt.incomingLinks.immutableCopy.forEach[target = nextCF.target]
            scg.nodes.remove(originalAsmt)
            scg.nodes.remove(nextCF)
        }
    }
    
    /** Creates assignment nodes from calls to copy_inputs and copy_outputs methods.*/
    protected def List<Assignment> createArgpassingAssignments(SCGraph scg, ReferenceCall reference, ValuedObject referencedMethod) {
        val newAssignments = <Assignment>newLinkedList
        val params = reference.parameters
        val methodDeclaration = referencedMethod.eContainer as MethodDeclaration
        val toParams = methodDeclaration.parameterDeclarations.map[valuedObjects].flatten.toList
        while (!params.empty) {
            val newAsmt = ScgFactory::eINSTANCE.createAssignment
            val fromExp = params.remove(0).expression
            val toExp = toParams.remove(0)
            if (referencedMethod.name == REF_CALL_CPIN_METHOD_NAME) {
                newAsmt.expression = fromExp.copy
                newAsmt.reference = reference.valuedObject.reference => [subReference = toExp.reference]
            } else {
                newAsmt.expression = reference.valuedObject.reference => [subReference = toExp.reference]
                newAsmt.reference = fromExp.asValuedObjectReference
                // signal workaround
                // if the interface variable is a signal, use relative write to enable more flexible scheduling
                if (toExp.variableDeclaration.signal) {
                    newAsmt.operator = AssignOperator::ASSIGNOR
                }
            }
            newAssignments += newAsmt
        }
        return newAssignments
    }
    
    /** Corrects the syntax of tick and reset function calls.*/
    protected def void rephraseCall(ReferenceCall ref, ClassDeclaration classDecl) {
        (ref.eContainer as Assignment).expression = createFunctionCall => [
            functionName = ref.subReference.valuedObject.name + classDecl.name
            it.parameters.add(createParameter => [
                it.accessType = ParameterAccessType::CALL_BY_REFERENCE
                it.expression = (createValuedObject => [
                    name = ref.valuedObject.name
                ]).reference
            ])
        ]
    }

    protected def List<ClassDeclaration> getModuleClasses(SCGraph scg) {
        return scg.declarations.filter(ClassDeclaration).filter[hasAnnotation(REF_CALL_TAG_ANNOTATION)].toList
    }
    
    protected def renameModuleClasses() {
        moduleClasses.forEach[name = "TickData" + name]
    }

}
