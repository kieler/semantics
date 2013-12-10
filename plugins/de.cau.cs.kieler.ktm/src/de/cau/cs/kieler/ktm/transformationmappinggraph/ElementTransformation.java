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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Transformation relation between two elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationmappinggraph.ElementTransformation#getModelTransformation <em>Model Transformation</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationmappinggraph.ElementTransformation#getSource <em>Source</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationmappinggraph.ElementTransformation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.ktm.transformationmappinggraph.TransformationMappingGraphPackage#getElementTransformation()
 * @model
 * @generated
 */
public interface ElementTransformation extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Model Transformation</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.ktm.transformationmappinggraph.ModelTransformation#getElementTransformations <em>Element Transformations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model Transformation</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model Transformation</em>' container reference.
     * @see #setModelTransformation(ModelTransformation)
     * @see de.cau.cs.kieler.ktm.transformationmappinggraph.TransformationMappingGraphPackage#getElementTransformation_ModelTransformation()
     * @see de.cau.cs.kieler.ktm.transformationmappinggraph.ModelTransformation#getElementTransformations
     * @model opposite="elementTransformations" required="true" transient="false"
     * @generated
     */
    ModelTransformation getModelTransformation();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.ktm.transformationmappinggraph.ElementTransformation#getModelTransformation <em>Model Transformation</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model Transformation</em>' container reference.
     * @see #getModelTransformation()
     * @generated
     */
    void setModelTransformation(ModelTransformation value);

    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.ktm.transformationmappinggraph.Element#getTransformedInto <em>Transformed Into</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(Element)
     * @see de.cau.cs.kieler.ktm.transformationmappinggraph.TransformationMappingGraphPackage#getElementTransformation_Source()
     * @see de.cau.cs.kieler.ktm.transformationmappinggraph.Element#getTransformedInto
     * @model opposite="transformedInto" required="true"
     * @generated
     */
    Element getSource();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.ktm.transformationmappinggraph.ElementTransformation#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(Element value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.ktm.transformationmappinggraph.Element#getTransformedFrom <em>Transformed From</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(Element)
     * @see de.cau.cs.kieler.ktm.transformationmappinggraph.TransformationMappingGraphPackage#getElementTransformation_Target()
     * @see de.cau.cs.kieler.ktm.transformationmappinggraph.Element#getTransformedFrom
     * @model opposite="transformedFrom" required="true"
     * @generated
     */
    Element getTarget();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.ktm.transformationmappinggraph.ElementTransformation#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(Element value);

} // ElementTransformation
