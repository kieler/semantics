/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.scl.Module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.EsterelModule#getEsterelDeclarations <em>Esterel Declarations</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getEsterelModule()
 * @model
 * @generated
 */
public interface EsterelModule extends Module {
    /**
     * Returns the value of the '<em><b>Esterel Declarations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.EsterelDeclaration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Esterel Declarations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Esterel Declarations</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getEsterelModule_EsterelDeclarations()
     * @model containment="true"
     * @generated
     */
    EList<EsterelDeclaration> getEsterelDeclarations();

} // EsterelModule
