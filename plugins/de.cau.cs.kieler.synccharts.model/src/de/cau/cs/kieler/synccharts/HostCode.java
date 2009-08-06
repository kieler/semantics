/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.HostCode#getCode <em>Code</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.HostCode#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getHostCode()
 * @model
 * @generated
 */
public interface HostCode extends Effect, Expression {
    /**
     * Returns the value of the '<em><b>Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Code</em>' attribute.
     * @see #setCode(String)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getHostCode_Code()
     * @model required="true"
     * @generated
     */
    String getCode();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.HostCode#getCode <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Code</em>' attribute.
     * @see #getCode()
     * @generated
     */
    void setCode(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getHostCode_Type()
     * @model
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.HostCode#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

} // HostCode
