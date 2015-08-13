/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import org.eclipse.emf.common.util.EList;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.Assignment#getNext <em>Next</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Assignment#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Assignment#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Assignment#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Node {
    /**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Next</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(ControlFlow)
	 * @see de.cau.cs.kieler.scg.ScgPackage#getAssignment_Next()
	 * @model containment="true"
	 * @generated
	 */
    ControlFlow getNext();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.Assignment#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
    void setNext(ControlFlow value);

    /**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference.
	 * @see #setAssignment(Expression)
	 * @see de.cau.cs.kieler.scg.ScgPackage#getAssignment_Assignment()
	 * @model containment="true"
	 * @generated
	 */
    Expression getAssignment();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.Assignment#getAssignment <em>Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment</em>' containment reference.
	 * @see #getAssignment()
	 * @generated
	 */
    void setAssignment(Expression value);

    /**
	 * Returns the value of the '<em><b>Valued Object</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valued Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Valued Object</em>' reference.
	 * @see #setValuedObject(ValuedObject)
	 * @see de.cau.cs.kieler.scg.ScgPackage#getAssignment_ValuedObject()
	 * @model
	 * @generated
	 */
    ValuedObject getValuedObject();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.Assignment#getValuedObject <em>Valued Object</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valued Object</em>' reference.
	 * @see #getValuedObject()
	 * @generated
	 */
    void setValuedObject(ValuedObject value);

				/**
	 * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indices</em>' containment reference list.
	 * @see de.cau.cs.kieler.scg.ScgPackage#getAssignment_Indices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getIndices();

} // Assignment
