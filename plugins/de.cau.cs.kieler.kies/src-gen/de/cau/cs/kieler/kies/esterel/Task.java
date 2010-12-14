/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.kies.esterel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Task#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Task#getIdList1 <em>Id List1</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Task#getIdList2 <em>Id List2</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject
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
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getTask_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.Task#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Id List1</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kies.esterel.TypeIdentifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id List1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id List1</em>' containment reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getTask_IdList1()
   * @model containment="true"
   * @generated
   */
  EList<TypeIdentifier> getIdList1();

  /**
   * Returns the value of the '<em><b>Id List2</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kies.esterel.TypeIdentifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id List2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id List2</em>' containment reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getTask_IdList2()
   * @model containment="true"
   * @generated
   */
  EList<TypeIdentifier> getIdList2();

} // Task
