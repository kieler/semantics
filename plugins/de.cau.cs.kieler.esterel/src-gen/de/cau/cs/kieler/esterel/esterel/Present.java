/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.annotations.Annotation;

import de.cau.cs.kieler.kexpressions.Expression;

import de.cau.cs.kieler.scl.scl.Statement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Present</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Present#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Present#getTick <em>Tick</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Present#getThenAnnotations <em>Then Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Present#getThenStatements <em>Then Statements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Present#getCases <em>Cases</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Present#getElseAnnotations <em>Else Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Present#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getPresent()
 * @model
 * @generated
 */
public interface Present extends Statement
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getPresent_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Present#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Tick</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tick</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tick</em>' containment reference.
   * @see #setTick(ISignal)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getPresent_Tick()
   * @model containment="true"
   * @generated
   */
  ISignal getTick();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Present#getTick <em>Tick</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tick</em>' containment reference.
   * @see #getTick()
   * @generated
   */
  void setTick(ISignal value);

  /**
   * Returns the value of the '<em><b>Then Annotations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.annotations.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Annotations</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getPresent_ThenAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getThenAnnotations();

  /**
   * Returns the value of the '<em><b>Then Statements</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.scl.scl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Statements</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getPresent_ThenStatements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getThenStatements();

  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.PresentCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getPresent_Cases()
   * @model containment="true"
   * @generated
   */
  EList<PresentCase> getCases();

  /**
   * Returns the value of the '<em><b>Else Annotations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.annotations.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Annotations</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getPresent_ElseAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getElseAnnotations();

  /**
   * Returns the value of the '<em><b>Else Statements</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.scl.scl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Statements</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getPresent_ElseStatements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getElseStatements();

} // Present
