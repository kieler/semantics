/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association describes a set of tuples whose values refer to typed instances. An instance of an association is called a link.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Association#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link uml.Association#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link uml.Association#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link uml.Association#getEndType <em>End Type</em>}</li>
 *   <li>{@link uml.Association#getNavigableOwnedEnd <em>Navigable Owned End</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Classifier, Relationship {
    /**
     * Returns the value of the '<em><b>Owned End</b></em>' containment reference list.
     * The list contents are of type {@link uml.Property}.
     * It is bidirectional and its opposite is '{@link uml.Property#getOwningAssociation <em>Owning Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ends that are owned by the association itself.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Owned End</em>' containment reference list.
     * @see uml.UmlPackage#getAssociation_OwnedEnd()
     * @see uml.Property#getOwningAssociation
     * @model opposite="owningAssociation" containment="true"
     * @generated
     */
    EList<Property> getOwnedEnd();

    /**
     * Returns the value of the '<em><b>Member End</b></em>' reference list.
     * The list contents are of type {@link uml.Property}.
     * It is bidirectional and its opposite is '{@link uml.Property#getAssociation <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Each end represents participation of instances of the classifier connected to the end in links of the association.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Member End</em>' reference list.
     * @see uml.UmlPackage#getAssociation_MemberEnd()
     * @see uml.Property#getAssociation
     * @model opposite="association" lower="2"
     * @generated
     */
    EList<Property> getMemberEnd();

    /**
     * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies whether the association is derived from other model elements such as other associations or constraints.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Derived</em>' attribute.
     * @see #setIsDerived(boolean)
     * @see uml.UmlPackage#getAssociation_IsDerived()
     * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isIsDerived();

    /**
     * Sets the value of the '{@link uml.Association#isIsDerived <em>Is Derived</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Derived</em>' attribute.
     * @see #isIsDerived()
     * @generated
     */
    void setIsDerived(boolean value);

    /**
     * Returns the value of the '<em><b>End Type</b></em>' reference list.
     * The list contents are of type {@link uml.Type}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the classifiers that are used as types of the ends of the association.
     * <!-- end-model-doc -->
     * @return the value of the '<em>End Type</em>' reference list.
     * @see uml.UmlPackage#getAssociation_EndType()
     * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    EList<Type> getEndType();

    /**
     * Returns the value of the '<em><b>Navigable Owned End</b></em>' reference list.
     * The list contents are of type {@link uml.Property}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The navigable ends that are owned by the association itself.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Navigable Owned End</em>' reference list.
     * @see uml.UmlPackage#getAssociation_NavigableOwnedEnd()
     * @model ordered="false"
     * @generated
     */
    EList<Property> getNavigableOwnedEnd();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An association specializing another association has the same number of ends as the other association.
     * self.parents()->forAll(p | p.memberEnd.size() = self.memberEnd.size())
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean specialized_end_number(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * When an association specializes another association, every end of the specific association corresponds to an end of the general association, and the specific end reaches the same type or a subtype of the more general end.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean specialized_end_types(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Only binary associations can be aggregations.
     * self.memberEnd->exists(aggregation <> Aggregation::none) implies self.memberEnd->size() = 2
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean binary_associations(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Association ends of associations with more than two ends must be owned by the association.
     * if memberEnd->size() > 2 then ownedEnd->includesAll(memberEnd)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean association_ends(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Determines whether this association is a binary association, i.e. whether it has exactly two member ends.
     * <!-- end-model-doc -->
     * @model kind="operation" dataType="uml.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isBinary();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * endType is derived from the types of the member ends.
     * result = self.memberEnd->collect(e | e.type)
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<Type> getEndTypes();

} // Association
