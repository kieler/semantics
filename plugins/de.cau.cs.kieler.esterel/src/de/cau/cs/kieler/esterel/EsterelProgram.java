/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.annotations.Pragmatable;
import de.cau.cs.kieler.scl.Module;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.EsterelProgram#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getEsterelProgram()
 * @model
 * @generated
 */
public interface EsterelProgram extends Pragmatable {
    /**
     * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scl.Module}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modules</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getEsterelProgram_Modules()
     * @model containment="true"
     * @generated
     */
    EList<Module> getModules();

} // EsterelProgram
