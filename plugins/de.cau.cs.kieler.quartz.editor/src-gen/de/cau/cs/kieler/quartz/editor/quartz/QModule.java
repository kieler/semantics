/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QModule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.QModule#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.QModule#getIntf <em>Intf</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.QModule#getStmt <em>Stmt</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.QModule#getObs <em>Obs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQModule()
 * @model
 * @generated
 */
public interface QModule extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Name)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQModule_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.QModule#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

  /**
   * Returns the value of the '<em><b>Intf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intf</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intf</em>' containment reference.
   * @see #setIntf(InterfaceList)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQModule_Intf()
   * @model containment="true"
   * @generated
   */
  InterfaceList getIntf();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.QModule#getIntf <em>Intf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intf</em>' containment reference.
   * @see #getIntf()
   * @generated
   */
  void setIntf(InterfaceList value);

  /**
   * Returns the value of the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt</em>' containment reference.
   * @see #setStmt(LocStmt)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQModule_Stmt()
   * @model containment="true"
   * @generated
   */
  LocStmt getStmt();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.QModule#getStmt <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt</em>' containment reference.
   * @see #getStmt()
   * @generated
   */
  void setStmt(LocStmt value);

  /**
   * Returns the value of the '<em><b>Obs</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.quartz.editor.quartz.ObservedSpecList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obs</em>' containment reference list.
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQModule_Obs()
   * @model containment="true"
   * @generated
   */
  EList<ObservedSpecList> getObs();

} // QModule
