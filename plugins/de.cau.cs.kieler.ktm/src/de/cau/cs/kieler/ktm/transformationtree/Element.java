/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.ktm.transformationtree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract representation of a element in a model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.Element#getModel <em>Model</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.Element#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.Element#getTransformedInto <em>Transformed Into</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.Element#getTransformedFrom <em>Transformed From</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.Element#getReferencedObject <em>Referenced Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.ktm.transformationtree.Model#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Model containing this element.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(Model)
     * @see de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage#getElement_Model()
     * @see de.cau.cs.kieler.ktm.transformationtree.Model#getElements
     * @model opposite="elements" required="true" transient="false"
     * @generated
     */
    Model getModel();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.ktm.transformationtree.Element#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
    void setModel(Model value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Display name of the referenced object.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage#getElement_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.ktm.transformationtree.Element#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Transformed Into</b></em>' reference list.
     * The list contents are of type {@link de.cau.cs.kieler.ktm.transformationtree.ElementTransformation}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.ktm.transformationtree.ElementTransformation#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformed Into</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of element-transformations were this element is source element.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Transformed Into</em>' reference list.
     * @see de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage#getElement_TransformedInto()
     * @see de.cau.cs.kieler.ktm.transformationtree.ElementTransformation#getSource
     * @model opposite="source"
     * @generated
     */
    EList<ElementTransformation> getTransformedInto();

    /**
     * Returns the value of the '<em><b>Transformed From</b></em>' reference list.
     * The list contents are of type {@link de.cau.cs.kieler.ktm.transformationtree.ElementTransformation}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.ktm.transformationtree.ElementTransformation#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformed From</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of element-transformations were this element is target element.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Transformed From</em>' reference list.
     * @see de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage#getElement_TransformedFrom()
     * @see de.cau.cs.kieler.ktm.transformationtree.ElementTransformation#getTarget
     * @model opposite="target"
     * @generated
     */
    EList<ElementTransformation> getTransformedFrom();

    /**
     * Returns the value of the '<em><b>Referenced Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referenced Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to a instance of model relement represented by this Element.
     * <p>
     * This reference is mandatory iff transient flag of model owning this element is NOT set.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Referenced Object</em>' reference.
     * @see #setReferencedObject(EObject)
     * @see de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage#getElement_ReferencedObject()
     * @model
     * @generated
     */
    EObject getReferencedObject();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.ktm.transformationtree.Element#getReferencedObject <em>Referenced Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referenced Object</em>' reference.
     * @see #getReferencedObject()
     * @generated
     */
    void setReferencedObject(EObject value);

} // Element
