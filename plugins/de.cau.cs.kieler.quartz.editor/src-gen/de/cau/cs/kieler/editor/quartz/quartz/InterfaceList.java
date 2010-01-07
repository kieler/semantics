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
 * A representation of the model object '<em><b>Interface List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.InterfaceList#getIntf <em>Intf</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.InterfaceList#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getInterfaceList()
 * @model
 * @generated
 */
public interface InterfaceList extends EObject
{
  /**
   * Returns the value of the '<em><b>Intf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intf</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intf</em>' containment reference.
   * @see #setIntf(Interface)
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getInterfaceList_Intf()
   * @model containment="true"
   * @generated
   */
  Interface getIntf();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.editor.quartz.quartz.InterfaceList#getIntf <em>Intf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intf</em>' containment reference.
   * @see #getIntf()
   * @generated
   */
  void setIntf(Interface value);

  /**
   * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.editor.quartz.quartz.Interface}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfaces</em>' containment reference list.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getInterfaceList_Interfaces()
   * @model containment="true"
   * @generated
   */
  EList<Interface> getInterfaces();

} // InterfaceList
