/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.sim.esi.esi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>kvpair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sim.esi.esi.kvpair#getK <em>K</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sim.esi.esi.kvpair#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.sim.esi.esi.EsiPackage#getkvpair()
 * @model
 * @generated
 */
public interface kvpair extends EObject
{
  /**
   * Returns the value of the '<em><b>K</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>K</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>K</em>' attribute.
   * @see #setK(String)
   * @see de.cau.cs.kieler.sim.esi.esi.EsiPackage#getkvpair_K()
   * @model
   * @generated
   */
  String getK();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.sim.esi.esi.kvpair#getK <em>K</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>K</em>' attribute.
   * @see #getK()
   * @generated
   */
  void setK(String value);

  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(String)
   * @see de.cau.cs.kieler.sim.esi.esi.EsiPackage#getkvpair_Val()
   * @model
   * @generated
   */
  String getVal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.sim.esi.esi.kvpair#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(String value);

} // kvpair
