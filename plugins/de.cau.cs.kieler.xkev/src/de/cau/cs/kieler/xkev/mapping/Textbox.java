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
 * A representation of the model object '<em><b>Textbox</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Textbox#getInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Textbox#isVisible <em>Visible</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Textbox#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Textbox#getBorder <em>Border</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Textbox#getBorder_style <em>Border style</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Textbox#getBorder_color <em>Border color</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getTextbox()
 * @model
 * @generated
 */
public interface Textbox extends Animation {
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
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getTextbox_Input()
     * @model
     * @generated
     */
    String getInput();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Textbox#getInput <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input</em>' attribute.
     * @see #getInput()
     * @generated
     */
    void setInput(String value);

    /**
     * Returns the value of the '<em><b>Visible</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Visible</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Visible</em>' attribute.
     * @see #setVisible(boolean)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getTextbox_Visible()
     * @model default="true"
     * @generated
     */
    boolean isVisible();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Textbox#isVisible <em>Visible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Visible</em>' attribute.
     * @see #isVisible()
     * @generated
     */
    void setVisible(boolean value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getTextbox_Value()
     * @model required="true"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Textbox#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>Border</b></em>' attribute.
     * The default value is <code>"none"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Border</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Border</em>' attribute.
     * @see #setBorder(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getTextbox_Border()
     * @model default="none"
     * @generated
     */
    String getBorder();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Textbox#getBorder <em>Border</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Border</em>' attribute.
     * @see #getBorder()
     * @generated
     */
    void setBorder(String value);

    /**
     * Returns the value of the '<em><b>Border style</b></em>' attribute.
     * The default value is <code>"solid"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Border style</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Border style</em>' attribute.
     * @see #setBorder_style(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getTextbox_Border_style()
     * @model default="solid"
     * @generated
     */
    String getBorder_style();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Textbox#getBorder_style <em>Border style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Border style</em>' attribute.
     * @see #getBorder_style()
     * @generated
     */
    void setBorder_style(String value);

    /**
     * Returns the value of the '<em><b>Border color</b></em>' attribute.
     * The default value is <code>"#ffffff"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Border color</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Border color</em>' attribute.
     * @see #setBorder_color(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getTextbox_Border_color()
     * @model default="#ffffff"
     * @generated
     */
    String getBorder_color();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Textbox#getBorder_color <em>Border color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Border color</em>' attribute.
     * @see #getBorder_color()
     * @generated
     */
    void setBorder_color(String value);

    /**
     * 
     * @param svgDoc
     * @param elementId
     * @param textValue
     */
    void applyAnimation(SVGDocument svgDoc, String elementId, String textValue);
    
} // Textbox
