/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.EventDefinition#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.EventDefinition#isIsOutput <em>Is Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpPackage#getEventDefinition()
 * @model
 * @generated
 */
public interface EventDefinition extends SignalDefinition
{
  /**
   * Returns the value of the '<em><b>Is Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Input</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Input</em>' attribute.
   * @see #setIsInput(boolean)
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpPackage#getEventDefinition_IsInput()
   * @model
   * @generated
   */
  boolean isIsInput();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.EventDefinition#isIsInput <em>Is Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Input</em>' attribute.
   * @see #isIsInput()
   * @generated
   */
  void setIsInput(boolean value);

  /**
   * Returns the value of the '<em><b>Is Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Output</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Output</em>' attribute.
   * @see #setIsOutput(boolean)
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpPackage#getEventDefinition_IsOutput()
   * @model
   * @generated
   */
  boolean isIsOutput();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.EventDefinition#isIsOutput <em>Is Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Output</em>' attribute.
   * @see #isIsOutput()
   * @generated
   */
  void setIsOutput(boolean value);

} // EventDefinition
