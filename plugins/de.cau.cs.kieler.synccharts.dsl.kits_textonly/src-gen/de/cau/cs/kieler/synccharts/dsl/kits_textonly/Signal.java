/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.kits_textonly;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#isIsLocal <em>Is Local</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#isIsOutput <em>Is Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#getCombineOperator <em>Combine Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#getHostCombineOperator <em>Host Combine Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends ValuedObject
{
  /**
   * Returns the value of the '<em><b>Is Local</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Local</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Local</em>' attribute.
   * @see #setIsLocal(boolean)
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getSignal_IsLocal()
   * @model
   * @generated
   */
  boolean isIsLocal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#isIsLocal <em>Is Local</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Local</em>' attribute.
   * @see #isIsLocal()
   * @generated
   */
  void setIsLocal(boolean value);

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
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getSignal_IsInput()
   * @model
   * @generated
   */
  boolean isIsInput();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#isIsInput <em>Is Input</em>}' attribute.
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
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getSignal_IsOutput()
   * @model
   * @generated
   */
  boolean isIsOutput();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#isIsOutput <em>Is Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Output</em>' attribute.
   * @see #isIsOutput()
   * @generated
   */
  void setIsOutput(boolean value);

  /**
   * Returns the value of the '<em><b>Combine Operator</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.CombineOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Combine Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Combine Operator</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.CombineOperator
   * @see #setCombineOperator(CombineOperator)
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getSignal_CombineOperator()
   * @model
   * @generated
   */
  CombineOperator getCombineOperator();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#getCombineOperator <em>Combine Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Combine Operator</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.CombineOperator
   * @see #getCombineOperator()
   * @generated
   */
  void setCombineOperator(CombineOperator value);

  /**
   * Returns the value of the '<em><b>Host Combine Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Host Combine Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Host Combine Operator</em>' attribute.
   * @see #setHostCombineOperator(String)
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getSignal_HostCombineOperator()
   * @model
   * @generated
   */
  String getHostCombineOperator();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#getHostCombineOperator <em>Host Combine Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Host Combine Operator</em>' attribute.
   * @see #getHostCombineOperator()
   * @generated
   */
  void setHostCombineOperator(String value);

} // Signal
