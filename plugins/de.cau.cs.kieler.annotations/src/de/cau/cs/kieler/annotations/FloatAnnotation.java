/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.annotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A FloatAnnotation carries a float value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.annotations.FloatAnnotation#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.annotations.AnnotationsPackage#getFloatAnnotation()
 * @model
 * @generated
 */
public interface FloatAnnotation extends Annotation {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(double)
     * @see de.cau.cs.kieler.annotations.AnnotationsPackage#getFloatAnnotation_Value()
     * @model required="true"
     * @generated
     */
    double getValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.annotations.FloatAnnotation#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(double value);

} // FloatAnnotation
