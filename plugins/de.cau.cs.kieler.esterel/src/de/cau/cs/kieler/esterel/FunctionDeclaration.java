/**
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.FunctionDeclaration#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getFunctionDeclaration()
 * @model
 * @generated
 */
public interface FunctionDeclaration extends EsterelDeclaration {
    /**
     * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.Function}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Functions</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getFunctionDeclaration_Functions()
     * @model containment="true"
     * @generated
     */
    EList<Function> getFunctions();

} // FunctionDeclaration
