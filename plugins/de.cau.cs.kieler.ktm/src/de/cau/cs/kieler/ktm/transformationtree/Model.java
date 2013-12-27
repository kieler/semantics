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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract representation of a model used in a transformation.
 * <p>
 * Used as nodes in tree structure.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.Model#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.Model#getElements <em>Elements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.Model#getTransformedInto <em>Transformed Into</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.Model#getTransformedFrom <em>Transformed From</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.Model#isTransient <em>Transient</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.Model#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.Model#getRootElement <em>Root Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Display name of the referenced model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage#getModel_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.ktm.transformationtree.Model#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.ktm.transformationtree.Element}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.ktm.transformationtree.Element#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * All elements contained by this model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Elements</em>' containment reference list.
     * @see de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage#getModel_Elements()
     * @see de.cau.cs.kieler.ktm.transformationtree.Element#getModel
     * @model opposite="model" containment="true" required="true"
     * @generated
     */
    EList<Element> getElements();

    /**
     * Returns the value of the '<em><b>Transformed Into</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.ktm.transformationtree.ModelTransformation}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.ktm.transformationtree.ModelTransformation#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformed Into</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of model-transformations were this model is source model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Transformed Into</em>' containment reference list.
     * @see de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage#getModel_TransformedInto()
     * @see de.cau.cs.kieler.ktm.transformationtree.ModelTransformation#getSource
     * @model opposite="source" containment="true"
     * @generated
     */
    EList<ModelTransformation> getTransformedInto();

    /**
     * Returns the value of the '<em><b>Transformed From</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.ktm.transformationtree.ModelTransformation#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformed From</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Model-transformations were this model is target model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Transformed From</em>' container reference.
     * @see #setTransformedFrom(ModelTransformation)
     * @see de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage#getModel_TransformedFrom()
     * @see de.cau.cs.kieler.ktm.transformationtree.ModelTransformation#getTarget
     * @model opposite="target" transient="false"
     * @generated
     */
    ModelTransformation getTransformedFrom();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.ktm.transformationtree.Model#getTransformedFrom <em>Transformed From</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transformed From</em>' container reference.
     * @see #getTransformedFrom()
     * @generated
     */
    void setTransformedFrom(ModelTransformation value);

    /**
     * Returns the value of the '<em><b>Transient</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This flag is set if model's elemets have no {@link Element#referencedObject referencedObject} entry.
     * <p>
     * Falg status must be consistent with all elements.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Transient</em>' attribute.
     * @see #setTransient(boolean)
     * @see de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage#getModel_Transient()
     * @model required="true"
     * @generated
     */
    boolean isTransient();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.ktm.transformationtree.Model#isTransient <em>Transient</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transient</em>' attribute.
     * @see #isTransient()
     * @generated
     */
    void setTransient(boolean value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type as class of represented model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(EClass)
     * @see de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage#getModel_Type()
     * @model required="true"
     * @generated
     */
    EClass getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.ktm.transformationtree.Model#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(EClass value);

    /**
     * Returns the value of the '<em><b>Root Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to element which represents root element of the model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Root Element</em>' reference.
     * @see #setRootElement(Element)
     * @see de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage#getModel_RootElement()
     * @model required="true"
     * @generated
     */
    Element getRootElement();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.ktm.transformationtree.Model#getRootElement <em>Root Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root Element</em>' reference.
     * @see #getRootElement()
     * @generated
     */
    void setRootElement(Element value);

} // Model
