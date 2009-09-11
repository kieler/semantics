/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.Relation#getFirst <em>First</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Relation#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Relation#getSecond <em>Second</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Relation#getIncomp <em>Incomp</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject
{
  /**
   * Returns the value of the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' reference.
   * @see #setFirst(Signal)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getRelation_First()
   * @model
   * @generated
   */
  Signal getFirst();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.Relation#getFirst <em>First</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(Signal value);

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
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getRelation_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.Relation#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second</em>' reference.
   * @see #setSecond(Signal)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getRelation_Second()
   * @model
   * @generated
   */
  Signal getSecond();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.Relation#getSecond <em>Second</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second</em>' reference.
   * @see #getSecond()
   * @generated
   */
  void setSecond(Signal value);

  /**
   * Returns the value of the '<em><b>Incomp</b></em>' reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.Signal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incomp</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incomp</em>' reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getRelation_Incomp()
   * @model
   * @generated
   */
  EList<Signal> getIncomp();

} // Relation
