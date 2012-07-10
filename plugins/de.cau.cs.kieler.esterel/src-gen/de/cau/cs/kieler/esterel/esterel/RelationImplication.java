/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.core.kexpressions.ISignal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Implication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.RelationImplication#getFirst <em>First</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.RelationImplication#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRelationImplication()
 * @model
 * @generated
 */
public interface RelationImplication extends RelationType
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
   * @see #setFirst(ISignal)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRelationImplication_First()
   * @model
   * @generated
   */
  ISignal getFirst();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.RelationImplication#getFirst <em>First</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(ISignal value);

  /**
   * Returns the value of the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second</em>' reference.
   * @see #setSecond(ISignal)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRelationImplication_Second()
   * @model
   * @generated
   */
  ISignal getSecond();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.RelationImplication#getSecond <em>Second</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second</em>' reference.
   * @see #getSecond()
   * @generated
   */
  void setSecond(ISignal value);

} // RelationImplication
