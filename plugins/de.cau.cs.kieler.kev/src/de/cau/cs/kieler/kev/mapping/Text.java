/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.Text#getTextValue <em>Text Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.Text#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.Text#getFontFamily <em>Font Family</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getText()
 * @model
 * @generated
 */
public interface Text extends Animation {
    /**
     * Returns the value of the '<em><b>Text Value</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text Value</em>' attribute.
     * @see #setTextValue(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getText_TextValue()
     * @model default=""
     * @generated
     */
    String getTextValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.Text#getTextValue <em>Text Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text Value</em>' attribute.
     * @see #getTextValue()
     * @generated
     */
    void setTextValue(String value);

    /**
     * Returns the value of the '<em><b>Font Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font Size</em>' attribute.
     * @see #setFontSize(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getText_FontSize()
     * @model
     * @generated
     */
    String getFontSize();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.Text#getFontSize <em>Font Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Size</em>' attribute.
     * @see #getFontSize()
     * @generated
     */
    void setFontSize(String value);

    /**
     * Returns the value of the '<em><b>Font Family</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font Family</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font Family</em>' attribute.
     * @see #setFontFamily(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getText_FontFamily()
     * @model
     * @generated
     */
    String getFontFamily();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.Text#getFontFamily <em>Font Family</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Family</em>' attribute.
     * @see #getFontFamily()
     * @generated
     */
    void setFontFamily(String value);

} // Text
