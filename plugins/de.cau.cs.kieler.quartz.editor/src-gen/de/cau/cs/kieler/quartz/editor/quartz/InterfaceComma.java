/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Comma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.InterfaceComma#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.InterfaceComma#getNames <em>Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getInterfaceComma()
 * @model
 * @generated
 */
public interface InterfaceComma extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(QType)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getInterfaceComma_Type()
   * @model containment="true"
   * @generated
   */
  QType getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.InterfaceComma#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(QType value);

  /**
   * Returns the value of the '<em><b>Names</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' containment reference.
   * @see #setNames(InOutNameListComma)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getInterfaceComma_Names()
   * @model containment="true"
   * @generated
   */
  InOutNameListComma getNames();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.InterfaceComma#getNames <em>Names</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Names</em>' containment reference.
   * @see #getNames()
   * @generated
   */
  void setNames(InOutNameListComma value);

} // InterfaceComma
