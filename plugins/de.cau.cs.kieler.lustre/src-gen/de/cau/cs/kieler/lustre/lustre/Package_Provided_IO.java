/**
 * generated by Xtext 2.10.0
 */
package de.cau.cs.kieler.lustre.lustre;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Provided IO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.lustre.lustre.Package_Provided_IO#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.lustre.lustre.Package_Provided_IO#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.lustre.lustre.LustrePackage#getPackage_Provided_IO()
 * @model
 * @generated
 */
public interface Package_Provided_IO extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Variable_Declaration)
   * @see de.cau.cs.kieler.lustre.lustre.LustrePackage#getPackage_Provided_IO_Name()
   * @model
   * @generated
   */
  Variable_Declaration getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.lustre.lustre.Package_Provided_IO#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Variable_Declaration value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see de.cau.cs.kieler.lustre.lustre.LustrePackage#getPackage_Provided_IO_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.lustre.lustre.Package_Provided_IO#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // Package_Provided_IO