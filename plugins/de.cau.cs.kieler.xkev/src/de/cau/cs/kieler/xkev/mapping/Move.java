/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping;

import org.w3c.dom.svg.SVGDocument;

import org.json.JSONObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Move#getX_range <em>Xrange</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Move#getY_range <em>Yrange</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getMove()
 * @model
 * @generated
 */
public interface Move extends Animation {
    /**
     * Returns the value of the '<em><b>Xrange</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xrange</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xrange</em>' attribute.
     * @see #setX_range(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getMove_X_range()
     * @model required="true"
     * @generated
     */
    String getX_range();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Move#getX_range <em>Xrange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xrange</em>' attribute.
     * @see #getX_range()
     * @generated
     */
    void setX_range(String value);

    /**
     * Returns the value of the '<em><b>Yrange</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Yrange</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Yrange</em>' attribute.
     * @see #setY_range(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getMove_Y_range()
     * @model required="true"
     * @generated
     */
    String getY_range();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Move#getY_range <em>Yrange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Yrange</em>' attribute.
     * @see #getY_range()
     * @generated
     */
    void setY_range(String value);
    
} // Move
