/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.sim.eso.eso;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sim.eso.eso.EsoBool#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.sim.eso.eso.EsoPackage#getEsoBool()
 * @model
 * @generated
 */
public interface EsoBool extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(boolean)
   * @see de.cau.cs.kieler.sim.eso.eso.EsoPackage#getEsoBool_Value()
   * @model
   * @generated
   */
  boolean isValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.sim.eso.eso.EsoBool#isValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #isValue()
   * @generated
   */
  void setValue(boolean value);

} // EsoBool
