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
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Rotate#getAnchor_point <em>Anchor point</em>}</li>
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
	 * Returns the value of the '<em><b>Anchor point</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Anchor point</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor point</em>' attribute.
	 * @see #setAnchor_point(String)
	 * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getRotate_Anchor_point()
	 * @model
	 * @generated
	 */
    String getAnchor_point();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Rotate#getAnchor_point <em>Anchor point</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor point</em>' attribute.
	 * @see #getAnchor_point()
	 * @generated
	 */
    void setAnchor_point(String value);

} // Rotate
