/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.MovePath#getPath <em>Path</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.MovePath#getAnchor_point <em>Anchor point</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.MovePath#getAuto_orientation <em>Auto orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getMovePath()
 * @model
 * @generated
 */
public interface MovePath extends Animation {
    /**
     * Returns the value of the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Path</em>' attribute.
     * @see #setPath(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getMovePath_Path()
     * @model
     * @generated
     */
    String getPath();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.MovePath#getPath <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Path</em>' attribute.
     * @see #getPath()
     * @generated
     */
    void setPath(String value);

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
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getMovePath_Anchor_point()
     * @model
     * @generated
     */
    String getAnchor_point();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.MovePath#getAnchor_point <em>Anchor point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Anchor point</em>' attribute.
     * @see #getAnchor_point()
     * @generated
     */
    void setAnchor_point(String value);

    /**
     * Returns the value of the '<em><b>Auto orientation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Auto orientation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Auto orientation</em>' attribute.
     * @see #setAuto_orientation(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getMovePath_Auto_orientation()
     * @model
     * @generated
     */
    String getAuto_orientation();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.MovePath#getAuto_orientation <em>Auto orientation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Auto orientation</em>' attribute.
     * @see #getAuto_orientation()
     * @generated
     */
    void setAuto_orientation(String value);

} // MovePath
