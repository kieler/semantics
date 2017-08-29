/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.annotations.Annotation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Relation#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Relation#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends RelationDecl
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.annotations.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRelation_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotations();

  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.RelationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRelation_Relations()
   * @model containment="true"
   * @generated
   */
  EList<RelationType> getRelations();

} // Relation
