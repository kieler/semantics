/**
 * generated by Xtext 2.10.0
 */
package de.cau.cs.kieler.railsl.railSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Light Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.railsl.railSL.LightStatement#getLights <em>Lights</em>}</li>
 *   <li>{@link de.cau.cs.kieler.railsl.railSL.LightStatement#getState <em>State</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.railsl.railSL.RailSLPackage#getLightStatement()
 * @model
 * @generated
 */
public interface LightStatement extends OpStatement
{
  /**
   * Returns the value of the '<em><b>Lights</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lights</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lights</em>' attribute list.
   * @see de.cau.cs.kieler.railsl.railSL.RailSLPackage#getLightStatement_Lights()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getLights();

  /**
   * Returns the value of the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' attribute.
   * @see #setState(String)
   * @see de.cau.cs.kieler.railsl.railSL.RailSLPackage#getLightStatement_State()
   * @model
   * @generated
   */
  String getState();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.railsl.railSL.LightStatement#getState <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' attribute.
   * @see #getState()
   * @generated
   */
  void setState(String value);

} // LightStatement