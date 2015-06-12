/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.For#getLoopVariable <em>Loop Variable</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.For#getFrom <em>From</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.For#getTo <em>To</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.For#getValuedObject <em>Valued Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getFor()
 * @model
 * @generated
 */
public interface For extends EObject {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * Returns the value of the '<em><b>Loop Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loop Variable</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Variable</em>' reference.
	 * @see #setLoopVariable(ValuedObject)
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getFor_LoopVariable()
	 * @model
	 * @generated
	 */
    ValuedObject getLoopVariable();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.sccharts.For#getLoopVariable <em>Loop Variable</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Variable</em>' reference.
	 * @see #getLoopVariable()
	 * @generated
	 */
    void setLoopVariable(ValuedObject value);

    /**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(int)
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getFor_From()
	 * @model
	 * @generated
	 */
    int getFrom();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.sccharts.For#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
    void setFrom(int value);

    /**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(int)
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getFor_To()
	 * @model
	 * @generated
	 */
    int getTo();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.sccharts.For#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
    void setTo(int value);

    /**
	 * Returns the value of the '<em><b>Valued Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valued Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Valued Object</em>' containment reference.
	 * @see #setValuedObject(ValuedObject)
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getFor_ValuedObject()
	 * @model containment="true" required="true"
	 * @generated
	 */
    ValuedObject getValuedObject();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.sccharts.For#getValuedObject <em>Valued Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valued Object</em>' containment reference.
	 * @see #getValuedObject()
	 * @generated
	 */
    void setValuedObject(ValuedObject value);

} // For
