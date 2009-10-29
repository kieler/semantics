/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.Relation#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends RelationDecl
{
  /**
   * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.RelationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getRelation_Relation()
   * @model containment="true"
   * @generated
   */
  EList<RelationType> getRelation();

} // Relation
