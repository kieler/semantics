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
package de.cau.cs.kieler.ktm.transformationmappinggraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Transformation relation between two models.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationmappinggraph.ModelTransformation#getId <em>Id</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationmappinggraph.ModelTransformation#getSource <em>Source</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationmappinggraph.ModelTransformation#getTarget <em>Target</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationmappinggraph.ModelTransformation#getElementTransformations <em>Element Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.ktm.transformationmappinggraph.TransformationMappingGraphPackage#getModelTransformation()
 * @model
 * @generated
 */
public interface ModelTransformation extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unique identifier of this {@link ModelTransformation}
     * <!-- end-model-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see de.cau.cs.kieler.ktm.transformationmappinggraph.TransformationMappingGraphPackage#getModelTransformation_Id()
     * @model required="true"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.ktm.transformationmappinggraph.ModelTransformation#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.ktm.transformationmappinggraph.Model#getTransformedInto <em>Transformed Into</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(Model)
     * @see de.cau.cs.kieler.ktm.transformationmappinggraph.TransformationMappingGraphPackage#getModelTransformation_Source()
     * @see de.cau.cs.kieler.ktm.transformationmappinggraph.Model#getTransformedInto
     * @model opposite="transformedInto" required="true"
     * @generated
     */
    Model getSource();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.ktm.transformationmappinggraph.ModelTransformation#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(Model value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.ktm.transformationmappinggraph.Model#getTransformedFrom <em>Transformed From</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(Model)
     * @see de.cau.cs.kieler.ktm.transformationmappinggraph.TransformationMappingGraphPackage#getModelTransformation_Target()
     * @see de.cau.cs.kieler.ktm.transformationmappinggraph.Model#getTransformedFrom
     * @model opposite="transformedFrom" required="true"
     * @generated
     */
    Model getTarget();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.ktm.transformationmappinggraph.ModelTransformation#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(Model value);

    /**
     * Returns the value of the '<em><b>Element Transformations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.ktm.transformationmappinggraph.ElementTransformation}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.ktm.transformationmappinggraph.ElementTransformation#getModelTransformation <em>Model Transformation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element Transformations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element Transformations</em>' containment reference list.
     * @see de.cau.cs.kieler.ktm.transformationmappinggraph.TransformationMappingGraphPackage#getModelTransformation_ElementTransformations()
     * @see de.cau.cs.kieler.ktm.transformationmappinggraph.ElementTransformation#getModelTransformation
     * @model opposite="modelTransformation" containment="true" required="true"
     * @generated
     */
    EList<ElementTransformation> getElementTransformations();

} // ModelTransformation
