/**
 */
package de.cau.cs.kieler.scl.scl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.Parallel#getThreads <em>Threads</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getParallel()
 * @model
 * @generated
 */
public interface Parallel extends Instruction {
    /**
	 * Returns the value of the '<em><b>Threads</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.scl.scl.Thread}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Threads</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Threads</em>' containment reference list.
	 * @see de.cau.cs.kieler.scl.scl.SclPackage#getParallel_Threads()
	 * @model containment="true"
	 * @generated
	 */
    EList<de.cau.cs.kieler.scl.scl.Thread> getThreads();

} // Parallel
