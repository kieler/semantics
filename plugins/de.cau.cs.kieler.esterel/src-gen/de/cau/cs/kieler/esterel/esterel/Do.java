/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.annotations.Annotation;

import de.cau.cs.kieler.scl.scl.Statement;
import de.cau.cs.kieler.scl.scl.StatementContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Do#getEndingAnnotations <em>Ending Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Do#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Do#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Do#getWatchingStatements <em>Watching Statements</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDo()
 * @model
 * @generated
 */
public interface Do extends StatementContainer, Statement
{
  /**
   * Returns the value of the '<em><b>Ending Annotations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.annotations.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ending Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ending Annotations</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDo_EndingAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getEndingAnnotations();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(DelayExpr)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDo_Expression()
   * @model containment="true"
   * @generated
   */
  DelayExpr getExpression();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Do#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(DelayExpr value);

  /**
   * Returns the value of the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delay</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay</em>' containment reference.
   * @see #setDelay(DelayExpr)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDo_Delay()
   * @model containment="true"
   * @generated
   */
  DelayExpr getDelay();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Do#getDelay <em>Delay</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay</em>' containment reference.
   * @see #getDelay()
   * @generated
   */
  void setDelay(DelayExpr value);

  /**
   * Returns the value of the '<em><b>Watching Statements</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.scl.scl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Watching Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Watching Statements</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDo_WatchingStatements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getWatchingStatements();

} // Do
