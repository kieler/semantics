/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QType List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.QTypeList#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.QTypeList#getT <em>T</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getQTypeList()
 * @model
 * @generated
 */
public interface QTypeList extends EObject
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
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getQTypeList_Type()
   * @model containment="true"
   * @generated
   */
  QType getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.editor.quartz.quartz.QTypeList#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(QType value);

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.editor.quartz.quartz.QType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference list.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getQTypeList_T()
   * @model containment="true"
   * @generated
   */
  EList<QType> getT();

} // QTypeList
