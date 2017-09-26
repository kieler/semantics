/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.kexpressions.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.ProcedureCall#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ProcedureCall#getReferenceArguments <em>Reference Arguments</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ProcedureCall#getValueArguments <em>Value Arguments</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getProcedureCall()
 * @model
 * @generated
 */
public interface ProcedureCall extends EsterelStatement {
    /**
     * Returns the value of the '<em><b>Procedure</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Procedure</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Procedure</em>' reference.
     * @see #setProcedure(Procedure)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getProcedureCall_Procedure()
     * @model
     * @generated
     */
    Procedure getProcedure();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.ProcedureCall#getProcedure <em>Procedure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Procedure</em>' reference.
     * @see #getProcedure()
     * @generated
     */
    void setProcedure(Procedure value);

    /**
     * Returns the value of the '<em><b>Reference Arguments</b></em>' reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.Variable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference Arguments</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference Arguments</em>' reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getProcedureCall_ReferenceArguments()
     * @model
     * @generated
     */
    EList<Variable> getReferenceArguments();

    /**
     * Returns the value of the '<em><b>Value Arguments</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Expression}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Arguments</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Arguments</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getProcedureCall_ValueArguments()
     * @model containment="true"
     * @generated
     */
    EList<Expression> getValueArguments();

} // ProcedureCall
