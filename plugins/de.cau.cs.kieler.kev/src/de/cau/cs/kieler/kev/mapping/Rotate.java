/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.Rotate#getAngleRange <em>Angle Range</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.Rotate#getAnchorPoint <em>Anchor Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getRotate()
 * @model
 * @generated
 */
public interface Rotate extends Animation {
    /**
     * Returns the value of the '<em><b>Angle Range</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Angle Range</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Angle Range</em>' attribute.
     * @see #setAngleRange(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getRotate_AngleRange()
     * @model
     * @generated
     */
    String getAngleRange();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.Rotate#getAngleRange <em>Angle Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Angle Range</em>' attribute.
     * @see #getAngleRange()
     * @generated
     */
    void setAngleRange(String value);

    /**
     * Returns the value of the '<em><b>Anchor Point</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Anchor Point</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Anchor Point</em>' attribute.
     * @see #setAnchorPoint(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getRotate_AnchorPoint()
     * @model
     * @generated
     */
    String getAnchorPoint();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.Rotate#getAnchorPoint <em>Anchor Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Anchor Point</em>' attribute.
     * @see #getAnchorPoint()
     * @generated
     */
    void setAnchorPoint(String value);

} // Rotate
