/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.annotations.Annotation;

import de.cau.cs.kieler.scl.Statement;
import de.cau.cs.kieler.scl.StatementContainer;

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
 *   <li>{@link de.cau.cs.kieler.esterel.Do#getWatchingAnnotations <em>Watching Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Do#getWatching <em>Watching</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Do#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Do#getWatchingStatements <em>Watching Statements</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getDo()
 * @model
 * @generated
 */
public interface Do extends EsterelStatement, StatementContainer {
    /**
     * Returns the value of the '<em><b>Watching Annotations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.annotations.Annotation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Watching Annotations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Watching Annotations</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getDo_WatchingAnnotations()
     * @model containment="true"
     * @generated
     */
    EList<Annotation> getWatchingAnnotations();

    /**
     * Returns the value of the '<em><b>Watching</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Watching</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Watching</em>' containment reference.
     * @see #setWatching(DelayExpression)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getDo_Watching()
     * @model containment="true"
     * @generated
     */
    DelayExpression getWatching();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.Do#getWatching <em>Watching</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Watching</em>' containment reference.
     * @see #getWatching()
     * @generated
     */
    void setWatching(DelayExpression value);

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
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getDo_Delay()
     * @model containment="true"
     * @generated
     */
    DelayExpression getDelay();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.Do#getDelay <em>Delay</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' containment reference.
     * @see #getDelay()
     * @generated
     */
    void setDelay(DelayExpression value);

    /**
     * Returns the value of the '<em><b>Watching Statements</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scl.Statement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Watching Statements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Watching Statements</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getDo_WatchingStatements()
     * @model containment="true"
     * @generated
     */
    EList<Statement> getWatchingStatements();

} // Do
