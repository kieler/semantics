/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Emission represents setting an {@link Signal}
 * from "absent" to "present" in a tick.
 * An Emission has a reference to the Signal
 * that it emits.
 * For valued Signals, an Emission may carry an
 * {@link Expression} that represents the new
 * value for that signal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.Emission#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Emission#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getEmission()
 * @model
 * @generated
 */
public interface Emission extends Effect {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2009 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Signal</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getEmission_Signal()
	 * @model required="true"
	 * @generated
	 */
    Signal getSignal();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Emission#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
    void setSignal(Signal value);

    /**
	 * Returns the value of the '<em><b>New Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>New Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' containment reference.
	 * @see #setNewValue(Expression)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getEmission_NewValue()
	 * @model containment="true"
	 * @generated
	 */
    Expression getNewValue();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Emission#getNewValue <em>New Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' containment reference.
	 * @see #getNewValue()
	 * @generated
	 */
    void setNewValue(Expression value);

} // Emission
