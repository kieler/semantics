/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.kies.esterel;

import de.cau.cs.kieler.core.kexpressions.ISignal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Incompatibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.RelationIncompatibility#getIncomp <em>Incomp</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getRelationIncompatibility()
 * @model
 * @generated
 */
public interface RelationIncompatibility extends RelationType
{
  /**
   * Returns the value of the '<em><b>Incomp</b></em>' reference list.
   * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.ISignal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incomp</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incomp</em>' reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getRelationIncompatibility_Incomp()
   * @model
   * @generated
   */
  EList<ISignal> getIncomp();

} // RelationIncompatibility
