/**
 */
package de.cau.cs.kieler.kvis.kvis;

import de.cau.cs.kieler.kexpressions.Expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.Animation#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.Animation#getVariable <em>Variable</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.Animation#getAttributeMappings <em>Attribute Mappings</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.Animation#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getAnimation()
 * @model
 * @generated
 */
public interface Animation extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getAnimation_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.kvis.Animation#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableReference)
   * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getAnimation_Variable()
   * @model containment="true"
   * @generated
   */
  VariableReference getVariable();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.kvis.Animation#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableReference value);

  /**
   * Returns the value of the '<em><b>Attribute Mappings</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kvis.kvis.AttributeMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Mappings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Mappings</em>' containment reference list.
   * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getAnimation_AttributeMappings()
   * @model containment="true"
   * @generated
   */
  EList<AttributeMapping> getAttributeMappings();

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expression)
   * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getAnimation_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.kvis.Animation#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expression value);

} // Animation
