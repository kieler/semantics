/**
 */
package de.cau.cs.kieler.kivis.kivis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.Element#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.Element#getAnimations <em>Animations</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject
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
   * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kivis.kivis.Element#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Animations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kivis.kivis.Animation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Animations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Animations</em>' containment reference list.
   * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getElement_Animations()
   * @model containment="true"
   * @generated
   */
  EList<Animation> getAnimations();

} // Element
