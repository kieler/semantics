/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.esterel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Procedure#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Procedure#getIdList1 <em>Id List1</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Procedure#getIdList2 <em>Id List2</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getProcedure()
 * @model
 * @generated
 */
public interface Procedure extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getProcedure_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Procedure#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Id List1</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id List1</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id List1</em>' attribute list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getProcedure_IdList1()
   * @model unique="false"
   * @generated
   */
  EList<String> getIdList1();

  /**
   * Returns the value of the '<em><b>Id List2</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id List2</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id List2</em>' attribute list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getProcedure_IdList2()
   * @model unique="false"
   * @generated
   */
  EList<String> getIdList2();

} // Procedure
