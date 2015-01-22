/**
 */
package de.cau.cs.kieler.scgprios;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling Block P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.SchedulingBlock_P#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.SchedulingBlock_P#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.SchedulingBlock_P#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getSchedulingBlock_P()
 * @model
 * @generated
 */
public interface SchedulingBlock_P extends EObject {
    /**
     * Returns the value of the '<em><b>Nodes</b></em>' reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scgprios.Node_P}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nodes</em>' reference list.
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getSchedulingBlock_P_Nodes()
     * @model
     * @generated
     */
    EList<Node_P> getNodes();

    /**
     * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scgprios.Dependency_P}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dependencies</em>' reference list.
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getSchedulingBlock_P_Dependencies()
     * @model
     * @generated
     */
    EList<Dependency_P> getDependencies();

    /**
     * Returns the value of the '<em><b>Guard</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Guard</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Guard</em>' reference.
     * @see #setGuard(Guard_P)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getSchedulingBlock_P_Guard()
     * @model required="true"
     * @generated
     */
    Guard_P getGuard();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.SchedulingBlock_P#getGuard <em>Guard</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Guard</em>' reference.
     * @see #getGuard()
     * @generated
     */
    void setGuard(Guard_P value);

} // SchedulingBlock_P
