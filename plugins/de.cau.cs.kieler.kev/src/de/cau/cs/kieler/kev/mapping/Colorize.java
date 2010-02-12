/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping;

import org.w3c.dom.svg.SVGDocument;

import org.json.JSONObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colorize</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.Colorize#getFill_color <em>Fill color</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.Colorize#getStroke_color <em>Stroke color</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.Colorize#getStroke_width <em>Stroke width</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getColorize()
 * @model
 * @generated
 */
public interface Colorize extends Animation {
    /**
     * Returns the value of the '<em><b>Fill color</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fill color</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fill color</em>' attribute.
     * @see #setFill_color(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getColorize_Fill_color()
     * @model
     * @generated
     */
    String getFill_color();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.Colorize#getFill_color <em>Fill color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fill color</em>' attribute.
     * @see #getFill_color()
     * @generated
     */
    void setFill_color(String value);

    /**
     * Returns the value of the '<em><b>Stroke color</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stroke color</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stroke color</em>' attribute.
     * @see #setStroke_color(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getColorize_Stroke_color()
     * @model default=""
     * @generated
     */
    String getStroke_color();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.Colorize#getStroke_color <em>Stroke color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stroke color</em>' attribute.
     * @see #getStroke_color()
     * @generated
     */
    void setStroke_color(String value);

    /**
     * Returns the value of the '<em><b>Stroke width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stroke width</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stroke width</em>' attribute.
     * @see #setStroke_width(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getColorize_Stroke_width()
     * @model
     * @generated
     */
    String getStroke_width();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.Colorize#getStroke_width <em>Stroke width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stroke width</em>' attribute.
     * @see #getStroke_width()
     * @generated
     */
    void setStroke_width(String value);


} // Colorize
