/**
 */
package de.cau.cs.kieler.kivis.kivis;

import de.cau.cs.kieler.prom.kibuild.Literal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.FunctionParameter#getVariableReference <em>Variable Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.FunctionParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getFunctionParameter()
 * @model
 * @generated
 */
public interface FunctionParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Reference</em>' containment reference.
   * @see #setVariableReference(VariableReference)
   * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getFunctionParameter_VariableReference()
   * @model containment="true"
   * @generated
   */
  VariableReference getVariableReference();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kivis.kivis.FunctionParameter#getVariableReference <em>Variable Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Reference</em>' containment reference.
   * @see #getVariableReference()
   * @generated
   */
  void setVariableReference(VariableReference value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Literal)
   * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getFunctionParameter_Value()
   * @model containment="true"
   * @generated
   */
  Literal getValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kivis.kivis.FunctionParameter#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Literal value);

} // FunctionParameter