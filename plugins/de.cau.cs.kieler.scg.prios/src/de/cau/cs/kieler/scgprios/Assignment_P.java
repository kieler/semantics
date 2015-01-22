/**
 */
package de.cau.cs.kieler.scgprios;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.Assignment_P#getNext <em>Next</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.Assignment_P#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.Assignment_P#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.Assignment_P#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getAssignment_P()
 * @model
 * @generated
 */
public interface Assignment_P extends Node_P {
    /**
     * Returns the value of the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Next</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Next</em>' containment reference.
     * @see #setNext(ControlFlow_P)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getAssignment_P_Next()
     * @model containment="true"
     * @generated
     */
    ControlFlow_P getNext();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Assignment_P#getNext <em>Next</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Next</em>' containment reference.
     * @see #getNext()
     * @generated
     */
    void setNext(ControlFlow_P value);

    /**
     * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignment</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assignment</em>' containment reference.
     * @see #setAssignment(Expression)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getAssignment_P_Assignment()
     * @model containment="true"
     * @generated
     */
    Expression getAssignment();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Assignment_P#getAssignment <em>Assignment</em>}' containment reference.
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
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getAssignment_P_ValuedObject()
     * @model
     * @generated
     */
    ValuedObject getValuedObject();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Assignment_P#getValuedObject <em>Valued Object</em>}' reference.
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
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getAssignment_P_Indices()
     * @model containment="true"
     * @generated
     */
    EList<Expression> getIndices();

} // Assignment_P
