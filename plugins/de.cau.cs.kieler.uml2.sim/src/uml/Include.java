/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An include relationship defines that a use case contains the behavior defined in another use case.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Include#getAddition <em>Addition</em>}</li>
 *   <li>{@link uml.Include#getIncludingCase <em>Including Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends NamedElement, DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Addition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the use case that is to be included.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addition</em>' reference.
	 * @see #setAddition(UseCase)
	 * @see uml.UmlPackage#getInclude_Addition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UseCase getAddition();

	/**
	 * Sets the value of the '{@link uml.Include#getAddition <em>Addition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addition</em>' reference.
	 * @see #getAddition()
	 * @generated
	 */
	void setAddition(UseCase value);

	/**
	 * Returns the value of the '<em><b>Including Case</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.UseCase#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the use case which will include the addition and owns the include relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Including Case</em>' container reference.
	 * @see #setIncludingCase(UseCase)
	 * @see uml.UmlPackage#getInclude_IncludingCase()
	 * @see uml.UseCase#getInclude
	 * @model opposite="include" required="true" transient="false" ordered="false"
	 * @generated
	 */
	UseCase getIncludingCase();

	/**
	 * Sets the value of the '{@link uml.Include#getIncludingCase <em>Including Case</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Including Case</em>' container reference.
	 * @see #getIncludingCase()
	 * @generated
	 */
	void setIncludingCase(UseCase value);

} // Include
