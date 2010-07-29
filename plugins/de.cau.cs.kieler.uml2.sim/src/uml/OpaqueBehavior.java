/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An behavior with implementation-specific semantics.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.OpaqueBehavior#getBody <em>Body</em>}</li>
 *   <li>{@link uml.OpaqueBehavior#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getOpaqueBehavior()
 * @model
 * @generated
 */
public interface OpaqueBehavior extends Behavior {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the behavior in one or more languages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute list.
	 * @see #isSetBody()
	 * @see #unsetBody()
	 * @see uml.UmlPackage#getOpaqueBehavior_Body()
	 * @model unique="false" unsettable="true" dataType="uml.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<String> getBody();

	/**
	 * Unsets the value of the '{@link uml.OpaqueBehavior#getBody <em>Body</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBody()
	 * @see #getBody()
	 * @generated
	 */
	void unsetBody();

	/**
	 * Returns whether the value of the '{@link uml.OpaqueBehavior#getBody <em>Body</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Body</em>' attribute list is set.
	 * @see #unsetBody()
	 * @see #getBody()
	 * @generated
	 */
	boolean isSetBody();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Languages the body strings use in the same order as the body strings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see uml.UmlPackage#getOpaqueBehavior_Language()
	 * @model unsettable="true" dataType="uml.String"
	 * @generated
	 */
	EList<String> getLanguage();

	/**
	 * Unsets the value of the '{@link uml.OpaqueBehavior#getLanguage <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link uml.OpaqueBehavior#getLanguage <em>Language</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Language</em>' attribute list is set.
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @generated
	 */
	boolean isSetLanguage();

} // OpaqueBehavior
