/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.Move#getXRange <em>XRange</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.Move#getYRange <em>YRange</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getMove()
 * @model
 * @generated
 */
public interface Move extends Animation {
    /**
     * Returns the value of the '<em><b>XRange</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XRange</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XRange</em>' attribute.
     * @see #setXRange(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getMove_XRange()
     * @model
     * @generated
     */
    String getXRange();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.Move#getXRange <em>XRange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XRange</em>' attribute.
     * @see #getXRange()
     * @generated
     */
    void setXRange(String value);

    /**
     * Returns the value of the '<em><b>YRange</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>YRange</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>YRange</em>' attribute.
     * @see #setYRange(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getMove_YRange()
     * @model
     * @generated
     */
    String getYRange();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.Move#getYRange <em>YRange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>YRange</em>' attribute.
     * @see #getYRange()
     * @generated
     */
    void setYRange(String value);
    
} // Move
