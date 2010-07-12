/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An actor specifies a role played by a user or any other system that interacts with the subject.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.UmlPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends BehavioredClassifier {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An actor can only have associations to use cases, components and classes. Furthermore these associations must be binary.
     * self.ownedAttribute->forAll ( a |
     * (a.association->notEmpty()) implies
     * ((a.association.memberEnd.size() = 2) and
     * (a.opposite.class.oclIsKindOf(UseCase) or
     * (a.opposite.class.oclIsKindOf(Class) and not a.opposite.class.oclIsKindOf(Behavior))))
     * 
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean associations(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An actor must have a name.
     * name->notEmpty()
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean must_have_name(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Actor
