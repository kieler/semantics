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
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Function#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Function#getIdList <em>Id List</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Function#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
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
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.Function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Id List</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kies.esterel.TypeIdentifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id List</em>' containment reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getFunction_IdList()
   * @model containment="true"
   * @generated
   */
  EList<TypeIdentifier> getIdList();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeIdentifier)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getFunction_Type()
   * @model containment="true"
   * @generated
   */
  TypeIdentifier getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.Function#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeIdentifier value);

} // Function
