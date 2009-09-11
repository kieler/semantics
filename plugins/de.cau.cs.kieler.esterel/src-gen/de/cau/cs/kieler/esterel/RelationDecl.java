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
 * A representation of the model object '<em><b>Relation Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.RelationDecl#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getRelationDecl()
 * @model
 * @generated
 */
public interface RelationDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.Relation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getRelationDecl_Relation()
   * @model containment="true"
   * @generated
   */
  EList<Relation> getRelation();

} // RelationDecl
