/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Ordering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A general ordering represents a binary relation between two occurrence specifications, to describe that one occurrence specification must occur before the other in a valid trace. This mechanism provides the ability to define partial orders of occurrence cpecifications that may otherwise not have a specified order.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.GeneralOrdering#getBefore <em>Before</em>}</li>
 *   <li>{@link uml.GeneralOrdering#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getGeneralOrdering()
 * @model
 * @generated
 */
public interface GeneralOrdering extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Before</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.OccurrenceSpecification#getToAfter <em>To After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OccurrenceSpecification referenced comes before the OccurrenceSpecification referenced by after.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Before</em>' reference.
	 * @see #setBefore(OccurrenceSpecification)
	 * @see uml.UmlPackage#getGeneralOrdering_Before()
	 * @see uml.OccurrenceSpecification#getToAfter
	 * @model opposite="toAfter" required="true" ordered="false"
	 * @generated
	 */
	OccurrenceSpecification getBefore();

	/**
	 * Sets the value of the '{@link uml.GeneralOrdering#getBefore <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(OccurrenceSpecification value);

	/**
	 * Returns the value of the '<em><b>After</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.OccurrenceSpecification#getToBefore <em>To Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OccurrenceSpecification referenced comes after the OccurrenceSpecification referenced by before.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>After</em>' reference.
	 * @see #setAfter(OccurrenceSpecification)
	 * @see uml.UmlPackage#getGeneralOrdering_After()
	 * @see uml.OccurrenceSpecification#getToBefore
	 * @model opposite="toBefore" required="true" ordered="false"
	 * @generated
	 */
	OccurrenceSpecification getAfter();

	/**
	 * Sets the value of the '{@link uml.GeneralOrdering#getAfter <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' reference.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(OccurrenceSpecification value);

} // GeneralOrdering
