/**
 */
package de.cau.cs.kieler.kvis.kvis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.Visualization#getImage <em>Image</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.Visualization#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getVisualization()
 * @model
 * @generated
 */
public interface Visualization extends EObject
{
  /**
   * Returns the value of the '<em><b>Image</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image</em>' attribute.
   * @see #setImage(String)
   * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getVisualization_Image()
   * @model
   * @generated
   */
  String getImage();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.kvis.Visualization#getImage <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' attribute.
   * @see #getImage()
   * @generated
   */
  void setImage(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kvis.kvis.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getVisualization_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

} // Visualization
