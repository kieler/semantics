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

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StringAnnotation carries a String Value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.annotations.StringAnnotation#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.annotations.AnnotationsPackage#getStringAnnotation()
 * @model
 * @generated
 */
public interface StringAnnotation extends Annotation {
    /**
     * Returns the value of the '<em><b>Values</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Values</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Values</em>' attribute list.
     * @see de.cau.cs.kieler.annotations.AnnotationsPackage#getStringAnnotation_Values()
     * @model unique="false"
     * @generated
     */
    EList<String> getValues();

} // StringAnnotation
