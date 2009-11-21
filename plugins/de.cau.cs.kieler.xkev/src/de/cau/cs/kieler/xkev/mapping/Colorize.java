/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping;

import org.w3c.dom.svg.SVGDocument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colorize</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Colorize#getInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Colorize#getColor <em>Color</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Colorize#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getColorize()
 * @model
 * @generated
 */
public interface Colorize extends Animation {
    /**
     * Returns the value of the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input</em>' attribute.
     * @see #setInput(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getColorize_Input()
     * @model
     * @generated
     */
    String getInput();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Colorize#getInput <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input</em>' attribute.
     * @see #getInput()
     * @generated
     */
    void setInput(String value);

    /**
     * Returns the value of the '<em><b>Color</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Color</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Color</em>' attribute.
     * @see #setColor(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getColorize_Color()
     * @model required="true"
     * @generated
     */
    String getColor();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Colorize#getColor <em>Color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Color</em>' attribute.
     * @see #getColor()
     * @generated
     */
    void setColor(String value);

    /**
     * Returns the value of the '<em><b>Style</b></em>' attribute.
     * The default value is <code>"solid"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Style</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Style</em>' attribute.
     * @see #setStyle(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getColorize_Style()
     * @model default="solid"
     * @generated
     */
    String getStyle();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Colorize#getStyle <em>Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Style</em>' attribute.
     * @see #getStyle()
     * @generated
     */
    void setStyle(String value);

    /**
     * @param svgDocument
     * @param id
     * @param color
     */
    void applyAnimation(SVGDocument svgDocument, String id, String color);

} // Colorize
