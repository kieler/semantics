/**
 */
package de.cau.cs.kieler.scl;

import de.cau.cs.kieler.annotations.Nameable;
import de.cau.cs.kieler.annotations.Pragmatable;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.SCLProgram#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scl.SCLPackage#getSCLProgram()
 * @model
 * @generated
 */
public interface SCLProgram extends Pragmatable, Nameable {
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
     * @see de.cau.cs.kieler.scl.SCLPackage#getSCLProgram_Modules()
     * @model containment="true" required="true"
     * @generated
     */
    EList<de.cau.cs.kieler.scl.Module> getModules();

} // SCLProgram
