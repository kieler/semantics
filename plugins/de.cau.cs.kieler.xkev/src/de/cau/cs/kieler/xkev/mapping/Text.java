/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Text#getText_value <em>Text value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Text#getFont_color <em>Font color</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Text#getFont_size <em>Font size</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Text#getFont_family <em>Font family</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Text#getFont_opacity <em>Font opacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getText()
 * @model
 * @generated
 */
public interface Text extends Animation {
    /**
     * Returns the value of the '<em><b>Text value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text value</em>' attribute.
     * @see #setText_value(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getText_Text_value()
     * @model required="true"
     * @generated
     */
    String getText_value();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Text#getText_value <em>Text value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text value</em>' attribute.
     * @see #getText_value()
     * @generated
     */
    void setText_value(String value);

    /**
     * Returns the value of the '<em><b>Font color</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font color</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font color</em>' attribute.
     * @see #setFont_color(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getText_Font_color()
     * @model
     * @generated
     */
    String getFont_color();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Text#getFont_color <em>Font color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font color</em>' attribute.
     * @see #getFont_color()
     * @generated
     */
    void setFont_color(String value);

    /**
     * Returns the value of the '<em><b>Font size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font size</em>' attribute.
     * @see #setFont_size(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getText_Font_size()
     * @model
     * @generated
     */
    String getFont_size();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Text#getFont_size <em>Font size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font size</em>' attribute.
     * @see #getFont_size()
     * @generated
     */
    void setFont_size(String value);

    /**
     * Returns the value of the '<em><b>Font family</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font family</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font family</em>' attribute.
     * @see #setFont_family(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getText_Font_family()
     * @model
     * @generated
     */
    String getFont_family();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Text#getFont_family <em>Font family</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font family</em>' attribute.
     * @see #getFont_family()
     * @generated
     */
    void setFont_family(String value);

    /**
     * Returns the value of the '<em><b>Font opacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font opacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font opacity</em>' attribute.
     * @see #setFont_opacity(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getText_Font_opacity()
     * @model
     * @generated
     */
    String getFont_opacity();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Text#getFont_opacity <em>Font opacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font opacity</em>' attribute.
     * @see #getFont_opacity()
     * @generated
     */
    void setFont_opacity(String value);

} // Text
