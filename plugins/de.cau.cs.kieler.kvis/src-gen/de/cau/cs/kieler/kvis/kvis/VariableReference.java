/**
 */
package de.cau.cs.kieler.kvis.kvis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.VariableReference#getModel <em>Model</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.VariableReference#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.VariableReference#getIndices <em>Indices</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' containment reference.
   * @see #setModel(ModelReference)
   * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getVariableReference_Model()
   * @model containment="true"
   * @generated
   */
  ModelReference getModel();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.kvis.VariableReference#getModel <em>Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' containment reference.
   * @see #getModel()
   * @generated
   */
  void setModel(ModelReference value);

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
   * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getVariableReference_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.kvis.VariableReference#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Indices</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indices</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indices</em>' attribute list.
   * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getVariableReference_Indices()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getIndices();

} // VariableReference
