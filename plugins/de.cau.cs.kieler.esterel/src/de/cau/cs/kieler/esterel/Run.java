/**
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.Run#getModule <em>Module</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Run#getRenamings <em>Renamings</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getRun()
 * @model
 * @generated
 */
public interface Run extends EsterelStatement {
    /**
     * Returns the value of the '<em><b>Module</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Module</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Module</em>' containment reference.
     * @see #setModule(ModuleRenaming)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getRun_Module()
     * @model containment="true"
     * @generated
     */
    ModuleRenaming getModule();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.Run#getModule <em>Module</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Module</em>' containment reference.
     * @see #getModule()
     * @generated
     */
    void setModule(ModuleRenaming value);

    /**
     * Returns the value of the '<em><b>Renamings</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.Renamings}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Renamings</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Renamings</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getRun_Renamings()
     * @model containment="true"
     * @generated
     */
    EList<Renamings> getRenamings();

} // Run
