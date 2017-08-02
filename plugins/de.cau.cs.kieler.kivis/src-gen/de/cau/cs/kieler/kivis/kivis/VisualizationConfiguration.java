/**
 */
package de.cau.cs.kieler.kivis.kivis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.VisualizationConfiguration#getImage <em>Image</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.VisualizationConfiguration#getElements <em>Elements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.VisualizationConfiguration#getInteractions <em>Interactions</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getVisualizationConfiguration()
 * @model
 * @generated
 */
public interface VisualizationConfiguration extends EObject
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
   * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getVisualizationConfiguration_Image()
   * @model
   * @generated
   */
  String getImage();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kivis.kivis.VisualizationConfiguration#getImage <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' attribute.
   * @see #getImage()
   * @generated
   */
  void setImage(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kivis.kivis.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getVisualizationConfiguration_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

  /**
   * Returns the value of the '<em><b>Interactions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kivis.kivis.Interaction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interactions</em>' containment reference list.
   * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getVisualizationConfiguration_Interactions()
   * @model containment="true"
   * @generated
   */
  EList<Interaction> getInteractions();

} // VisualizationConfiguration
