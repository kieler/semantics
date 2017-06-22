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
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Annotation is an Object that can be attached to an Annotatable. It
 * extends NamedObject and therefore it has a String name which is used
 * as a key to identify the Annotation within the list of Annotations in
 * the Annotatable.
 * <p>
 * A pure Annotatable Object can be used to specify some kind of
 * boolean property that an Annotatable can carry or not.
 * However, usually additional information is attached by subclassing
 * the Annotation and add some additional value to the subclass.
 * <!-- end-model-doc -->
 *
 *
 * @see de.cau.cs.kieler.annotations.AnnotationsPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends NamedObject {
} // Annotation
