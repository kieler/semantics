/**
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.ProcedureDeclaration#getProcedures <em>Procedures</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getProcedureDeclaration()
 * @model
 * @generated
 */
public interface ProcedureDeclaration extends EsterelDeclaration {
    /**
     * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.Procedure}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Procedures</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Procedures</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getProcedureDeclaration_Procedures()
     * @model containment="true"
     * @generated
     */
    EList<Procedure> getProcedures();

} // ProcedureDeclaration
