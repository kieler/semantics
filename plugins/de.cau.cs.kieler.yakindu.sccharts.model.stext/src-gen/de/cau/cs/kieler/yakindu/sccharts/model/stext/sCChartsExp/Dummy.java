/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp;

import de.cau.cs.kieler.yakindu.model.stext.synctext.VariableDefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dummy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.Dummy#getVariableDefinition <em>Variable Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpPackage#getDummy()
 * @model
 * @generated
 */
public interface Dummy extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Definition</em>' containment reference.
   * @see #setVariableDefinition(VariableDefinition)
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpPackage#getDummy_VariableDefinition()
   * @model containment="true"
   * @generated
   */
  VariableDefinition getVariableDefinition();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.Dummy#getVariableDefinition <em>Variable Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Definition</em>' containment reference.
   * @see #getVariableDefinition()
   * @generated
   */
  void setVariableDefinition(VariableDefinition value);

} // Dummy
