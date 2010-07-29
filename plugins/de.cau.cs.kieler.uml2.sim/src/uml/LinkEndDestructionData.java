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
 * A representation of the model object '<em><b>Link End Destruction Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link end destruction data is not an action. It is an element that identifies links. It identifies one end of a link to be destroyed by destroy link action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.LinkEndDestructionData#isIsDestroyDuplicates <em>Is Destroy Duplicates</em>}</li>
 *   <li>{@link uml.LinkEndDestructionData#getDestroyAt <em>Destroy At</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getLinkEndDestructionData()
 * @model
 * @generated
 */
public interface LinkEndDestructionData extends LinkEndData {
	/**
	 * Returns the value of the '<em><b>Is Destroy Duplicates</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether to destroy duplicates of the value in nonunique association ends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Destroy Duplicates</em>' attribute.
	 * @see #setIsDestroyDuplicates(boolean)
	 * @see uml.UmlPackage#getLinkEndDestructionData_IsDestroyDuplicates()
	 * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDestroyDuplicates();

	/**
	 * Sets the value of the '{@link uml.LinkEndDestructionData#isIsDestroyDuplicates <em>Is Destroy Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroy Duplicates</em>' attribute.
	 * @see #isIsDestroyDuplicates()
	 * @generated
	 */
	void setIsDestroyDuplicates(boolean value);

	/**
	 * Returns the value of the '<em><b>Destroy At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the position of an existing link to be destroyed in ordered nonunique association ends. The type of the pin is UnlimitedNatural, but the value cannot be zero or unlimited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destroy At</em>' reference.
	 * @see #setDestroyAt(InputPin)
	 * @see uml.UmlPackage#getLinkEndDestructionData_DestroyAt()
	 * @model ordered="false"
	 * @generated
	 */
	InputPin getDestroyAt();

	/**
	 * Sets the value of the '{@link uml.LinkEndDestructionData#getDestroyAt <em>Destroy At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destroy At</em>' reference.
	 * @see #getDestroyAt()
	 * @generated
	 */
	void setDestroyAt(InputPin value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LinkEndDestructionData can only be end data for DestroyLinkAction or one of its specializations.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean destroy_link_action(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LinkEndDestructionData for ordered nonunique association ends must have a single destroyAt input pin if isDestroyDuplicates is false. It must be of type UnlimitedNatural and have a multiplicity of 1..1. Otherwise, the action has no input pin for the removal position.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean unlimited_natural_and_multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LinkEndDestructionData
