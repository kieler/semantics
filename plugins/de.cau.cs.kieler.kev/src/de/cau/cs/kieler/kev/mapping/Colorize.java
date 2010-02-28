/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colorize</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.Colorize#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.Colorize#getStrokeColor <em>Stroke Color</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.Colorize#getStrokeWidth <em>Stroke Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getColorize()
 * @model
 * @generated
 */
public interface Colorize extends Animation {
    /**
     * Returns the value of the '<em><b>Fill Color</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fill Color</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fill Color</em>' attribute.
     * @see #setFillColor(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getColorize_FillColor()
     * @model
     * @generated
     */
    String getFillColor();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.Colorize#getFillColor <em>Fill Color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fill Color</em>' attribute.
     * @see #getFillColor()
     * @generated
     */
    void setFillColor(String value);

    /**
     * Returns the value of the '<em><b>Stroke Color</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stroke Color</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stroke Color</em>' attribute.
     * @see #setStrokeColor(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getColorize_StrokeColor()
     * @model default=""
     * @generated
     */
    String getStrokeColor();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.Colorize#getStrokeColor <em>Stroke Color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stroke Color</em>' attribute.
     * @see #getStrokeColor()
     * @generated
     */
    void setStrokeColor(String value);

    /**
     * Returns the value of the '<em><b>Stroke Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stroke Width</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stroke Width</em>' attribute.
     * @see #setStrokeWidth(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getColorize_StrokeWidth()
     * @model
     * @generated
     */
    String getStrokeWidth();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.Colorize#getStrokeWidth <em>Stroke Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stroke Width</em>' attribute.
     * @see #getStrokeWidth()
     * @generated
     */
    void setStrokeWidth(String value);


} // Colorize
