/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.MainModule#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.MainModule#getModInt <em>Mod Int</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.MainModule#getModBody <em>Mod Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getMainModule()
 * @model
 * @generated
 */
public interface MainModule extends EObject
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
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getMainModule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.MainModule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Mod Int</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mod Int</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mod Int</em>' containment reference.
   * @see #setModInt(ModuleInterface)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getMainModule_ModInt()
   * @model containment="true"
   * @generated
   */
  ModuleInterface getModInt();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.MainModule#getModInt <em>Mod Int</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mod Int</em>' containment reference.
   * @see #getModInt()
   * @generated
   */
  void setModInt(ModuleInterface value);

  /**
   * Returns the value of the '<em><b>Mod Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mod Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mod Body</em>' containment reference.
   * @see #setModBody(ModuleBody)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getMainModule_ModBody()
   * @model containment="true"
   * @generated
   */
  ModuleBody getModBody();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.MainModule#getModBody <em>Mod Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mod Body</em>' containment reference.
   * @see #getModBody()
   * @generated
   */
  void setModBody(ModuleBody value);

} // MainModule
