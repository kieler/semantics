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
 * A representation of the model object '<em><b>Valued Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.ValuedObject#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.ValuedObject#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.ValuedObject#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.ValuedObject#getHostType <em>Host Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getValuedObject()
 * @model
 * @generated
 */
public interface ValuedObject extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getValuedObject_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.ValuedObject#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.ValueType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.synccharts.ValueType
     * @see #setType(ValueType)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getValuedObject_Type()
     * @model required="true"
     * @generated
     */
    ValueType getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.ValuedObject#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.synccharts.ValueType
     * @see #getType()
     * @generated
     */
    void setType(ValueType value);

    /**
     * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial Value</em>' attribute.
     * @see #setInitialValue(String)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getValuedObject_InitialValue()
     * @model required="true"
     * @generated
     */
    String getInitialValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.ValuedObject#getInitialValue <em>Initial Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Value</em>' attribute.
     * @see #getInitialValue()
     * @generated
     */
    void setInitialValue(String value);

    /**
     * Returns the value of the '<em><b>Host Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Host Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Host Type</em>' attribute.
     * @see #setHostType(String)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getValuedObject_HostType()
     * @model
     * @generated
     */
    String getHostType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.ValuedObject#getHostType <em>Host Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Host Type</em>' attribute.
     * @see #getHostType()
     * @generated
     */
    void setHostType(String value);

} // ValuedObject
