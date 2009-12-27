/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Rotate#getAngle_range <em>Angle range</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Rotate#getPivot <em>Pivot</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getRotate()
 * @model
 * @generated
 */
public interface Rotate extends Animation {
    /**
     * Returns the value of the '<em><b>Angle range</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Angle range</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Angle range</em>' attribute.
     * @see #setAngle_range(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getRotate_Angle_range()
     * @model
     * @generated
     */
    String getAngle_range();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Rotate#getAngle_range <em>Angle range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Angle range</em>' attribute.
     * @see #getAngle_range()
     * @generated
     */
    void setAngle_range(String value);

    /**
     * Returns the value of the '<em><b>Pivot</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pivot</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pivot</em>' attribute.
     * @see #setPivot(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getRotate_Pivot()
     * @model
     * @generated
     */
    String getPivot();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Rotate#getPivot <em>Pivot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pivot</em>' attribute.
     * @see #getPivot()
     * @generated
     */
    void setPivot(String value);

} // Rotate
