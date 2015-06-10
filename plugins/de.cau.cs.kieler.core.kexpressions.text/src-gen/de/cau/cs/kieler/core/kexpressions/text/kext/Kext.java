/**
 */
package de.cau.cs.kieler.core.kexpressions.text.kext;

import de.cau.cs.kieler.core.kexpressions.Declaration;

import de.cau.cs.kieler.core.kexpressions.keffects.Effect;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.text.kext.Kext#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.text.kext.Kext#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.text.kext.Kext#getEffects <em>Effects</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage#getKext()
 * @model
 * @generated
 */
public interface Kext extends EObject
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage#getKext_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarations();

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.text.kext.AnnotatedExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage#getKext_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<AnnotatedExpression> getExpressions();

  /**
   * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.keffects.Effect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effects</em>' containment reference list.
   * @see de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage#getKext_Effects()
   * @model containment="true"
   * @generated
   */
  EList<Effect> getEffects();

} // Kext
