/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.annotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.annotations.IntAnnotation#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.annotations.AnnotationsPackage#getIntAnnotation()
 * @model
 * @generated
 */
public interface IntAnnotation extends Annotation {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(int)
     * @see de.cau.cs.kieler.annotations.AnnotationsPackage#getIntAnnotation_Value()
     * @model required="true"
     * @generated
     */
    int getValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.annotations.IntAnnotation#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(int value);

} // IntAnnotation
