/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.scl.Statement;
import de.cau.cs.kieler.scl.StatementContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.Abort#isWeak <em>Weak</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Abort#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Abort#getDoStatements <em>Do Statements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Abort#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getAbort()
 * @model
 * @generated
 */
public interface Abort extends EsterelStatement, StatementContainer {
    /**
     * Returns the value of the '<em><b>Weak</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Weak</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Weak</em>' attribute.
     * @see #setWeak(boolean)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getAbort_Weak()
     * @model
     * @generated
     */
    boolean isWeak();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.Abort#isWeak <em>Weak</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Weak</em>' attribute.
     * @see #isWeak()
     * @generated
     */
    void setWeak(boolean value);

    /**
     * Returns the value of the '<em><b>Delay</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delay</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' containment reference.
     * @see #setDelay(DelayExpression)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getAbort_Delay()
     * @model containment="true"
     * @generated
     */
    DelayExpression getDelay();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.Abort#getDelay <em>Delay</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' containment reference.
     * @see #getDelay()
     * @generated
     */
    void setDelay(DelayExpression value);

    /**
     * Returns the value of the '<em><b>Do Statements</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scl.Statement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Do Statements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Do Statements</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getAbort_DoStatements()
     * @model containment="true"
     * @generated
     */
    EList<Statement> getDoStatements();

    /**
     * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.Case}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cases</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getAbort_Cases()
     * @model containment="true"
     * @generated
     */
    EList<Case> getCases();

} // Abort
