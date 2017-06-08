/**
 */
package de.cau.cs.kieler.kvis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kvis.Mapping#getVariableDomain <em>Variable Domain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.Mapping#getAttributeDomain <em>Attribute Domain</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kvis.KvisPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Domain</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Domain</em>' containment reference.
   * @see #setVariableDomain(Domain)
   * @see de.cau.cs.kieler.kvis.KvisPackage#getMapping_VariableDomain()
   * @model containment="true"
   * @generated
   */
  Domain getVariableDomain();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.Mapping#getVariableDomain <em>Variable Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Domain</em>' containment reference.
   * @see #getVariableDomain()
   * @generated
   */
  void setVariableDomain(Domain value);

  /**
   * Returns the value of the '<em><b>Attribute Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Domain</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Domain</em>' containment reference.
   * @see #setAttributeDomain(Domain)
   * @see de.cau.cs.kieler.kvis.KvisPackage#getMapping_AttributeDomain()
   * @model containment="true"
   * @generated
   */
  Domain getAttributeDomain();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.Mapping#getAttributeDomain <em>Attribute Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Domain</em>' containment reference.
   * @see #getAttributeDomain()
   * @generated
   */
  void setAttributeDomain(Domain value);

} // Mapping
