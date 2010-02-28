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
 *   <li>{@link de.cau.cs.kieler.kev.mapping.MovePath#getAnchorPoint <em>Anchor Point</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.MovePath#getAutoOrientation <em>Auto Orientation</em>}</li>
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
     * Returns the value of the '<em><b>Anchor Point</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Anchor Point</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Anchor Point</em>' attribute.
     * @see #setAnchorPoint(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getMovePath_AnchorPoint()
     * @model
     * @generated
     */
    String getAnchorPoint();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.MovePath#getAnchorPoint <em>Anchor Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Anchor Point</em>' attribute.
     * @see #getAnchorPoint()
     * @generated
     */
    void setAnchorPoint(String value);

    /**
     * Returns the value of the '<em><b>Auto Orientation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Auto Orientation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Auto Orientation</em>' attribute.
     * @see #setAutoOrientation(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getMovePath_AutoOrientation()
     * @model
     * @generated
     */
    String getAutoOrientation();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.MovePath#getAutoOrientation <em>Auto Orientation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Auto Orientation</em>' attribute.
     * @see #getAutoOrientation()
     * @generated
     */
    void setAutoOrientation(String value);

} // MovePath
