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
package de.cau.cs.kieler.core.annotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.annotations.ImportAnnotation#getImportURI <em>Import URI</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.core.annotations.AnnotationsPackage#getImportAnnotation()
 * @model
 * @generated
 */
public interface ImportAnnotation extends Annotation {
    /**
     * Returns the value of the '<em><b>Import URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Import URI</em>' attribute.
     * @see #setImportURI(String)
     * @see de.cau.cs.kieler.core.annotations.AnnotationsPackage#getImportAnnotation_ImportURI()
     * @model
     * @generated
     */
    String getImportURI();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.annotations.ImportAnnotation#getImportURI <em>Import URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Import URI</em>' attribute.
     * @see #getImportURI()
     * @generated
     */
    void setImportURI(String value);

} // ImportAnnotation
