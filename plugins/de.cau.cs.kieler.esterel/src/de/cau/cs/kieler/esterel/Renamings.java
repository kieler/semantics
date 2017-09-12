/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.annotations.Annotatable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Renamings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.Renamings#getRenamings <em>Renamings</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getRenamings()
 * @model
 * @generated
 */
public interface Renamings extends Annotatable {
    /**
     * Returns the value of the '<em><b>Renamings</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.Renaming}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Renamings</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Renamings</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getRenamings_Renamings()
     * @model containment="true"
     * @generated
     */
    EList<Renaming> getRenamings();

} // Renamings
