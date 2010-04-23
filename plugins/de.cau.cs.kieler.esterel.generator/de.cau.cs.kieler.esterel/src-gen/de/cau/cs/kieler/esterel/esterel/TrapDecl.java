/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trap Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.TrapDecl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.TrapDecl#getChannelDesc <em>Channel Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getTrapDecl()
 * @model
 * @generated
 */
public interface TrapDecl extends EObject
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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getTrapDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.TrapDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Channel Desc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Channel Desc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Channel Desc</em>' containment reference.
   * @see #setChannelDesc(ChannelDescription)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getTrapDecl_ChannelDesc()
   * @model containment="true"
   * @generated
   */
  ChannelDescription getChannelDesc();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.TrapDecl#getChannelDesc <em>Channel Desc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Channel Desc</em>' containment reference.
   * @see #getChannelDesc()
   * @generated
   */
  void setChannelDesc(ChannelDescription value);

} // TrapDecl
