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
 * A representation of the model object '<em><b>Qrz File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.QrzFile#getImports <em>Imports</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.QrzFile#getMacros <em>Macros</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.QrzFile#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQrzFile()
 * @model
 * @generated
 */
public interface QrzFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference.
   * @see #setImports(ImportList)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQrzFile_Imports()
   * @model containment="true"
   * @generated
   */
  ImportList getImports();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.QrzFile#getImports <em>Imports</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imports</em>' containment reference.
   * @see #getImports()
   * @generated
   */
  void setImports(ImportList value);

  /**
   * Returns the value of the '<em><b>Macros</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.quartz.editor.quartz.MacroDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Macros</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Macros</em>' containment reference list.
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQrzFile_Macros()
   * @model containment="true"
   * @generated
   */
  EList<MacroDef> getMacros();

  /**
   * Returns the value of the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' containment reference.
   * @see #setModule(QModule)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQrzFile_Module()
   * @model containment="true"
   * @generated
   */
  QModule getModule();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.QrzFile#getModule <em>Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' containment reference.
   * @see #getModule()
   * @generated
   */
  void setModule(QModule value);

} // QrzFile
