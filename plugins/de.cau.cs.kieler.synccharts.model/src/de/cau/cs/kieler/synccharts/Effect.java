/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.Effect#getParentEAction <em>Parent EAction</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getEffect()
 * @model abstract="true"
 * @generated
 */
public interface Effect extends EObject {
    /**
     * Returns the value of the '<em><b>Parent EAction</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Action#getEffects <em>Effects</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent EAction</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent EAction</em>' container reference.
     * @see #setParentEAction(Action)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getEffect_ParentEAction()
     * @see de.cau.cs.kieler.synccharts.Action#getEffects
     * @model opposite="effects" required="true" transient="false"
     * @generated
     */
    Action getParentEAction();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Effect#getParentEAction <em>Parent EAction</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent EAction</em>' container reference.
     * @see #getParentEAction()
     * @generated
     */
    void setParentEAction(Action value);

} // Effect
