/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kitt.tracingtree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Wrapper</b></em>'.
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
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.ModelWrapper#getModelTypeID <em>Model Type ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.ModelWrapper#getModelObjects <em>Model Objects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.ModelWrapper#getTargetTransformations <em>Target Transformations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.ModelWrapper#getSourceTransformation <em>Source Transformation</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.ModelWrapper#isTransient <em>Transient</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.ModelWrapper#getRootObject <em>Root Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getModelWrapper()
 * @model
 * @generated
 */
public interface ModelWrapper extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Model Type ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unique ID for type of represented model in transformation
     * <!-- end-model-doc -->
     * @return the value of the '<em>Model Type ID</em>' attribute.
     * @see #setModelTypeID(String)
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getModelWrapper_ModelTypeID()
     * @model required="true"
     * @generated
     */
    String getModelTypeID();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kitt.tracingtree.ModelWrapper#getModelTypeID <em>Model Type ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model Type ID</em>' attribute.
     * @see #getModelTypeID()
     * @generated
     */
    void setModelTypeID(String value);

    /**
     * Returns the value of the '<em><b>Model Objects</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * All elements contained byrepresented model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Model Objects</em>' containment reference list.
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getModelWrapper_ModelObjects()
     * @see de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper#getModel
     * @model opposite="model" containment="true" required="true"
     * @generated
     */
    EList<EObjectWrapper> getModelObjects();

    /**
     * Returns the value of the '<em><b>Target Transformations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kitt.tracingtree.ModelTransformation}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.kitt.tracingtree.ModelTransformation#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of model-transformations were this model is source model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target Transformations</em>' containment reference list.
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getModelWrapper_TargetTransformations()
     * @see de.cau.cs.kieler.kitt.tracingtree.ModelTransformation#getSource
     * @model opposite="source" containment="true"
     * @generated
     */
    EList<ModelTransformation> getTargetTransformations();

    /**
     * Returns the value of the '<em><b>Source Transformation</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.kitt.tracingtree.ModelTransformation#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Model-transformations were this model is target model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source Transformation</em>' container reference.
     * @see #setSourceTransformation(ModelTransformation)
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getModelWrapper_SourceTransformation()
     * @see de.cau.cs.kieler.kitt.tracingtree.ModelTransformation#getTarget
     * @model opposite="target" transient="false"
     * @generated
     */
    ModelTransformation getSourceTransformation();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kitt.tracingtree.ModelWrapper#getSourceTransformation <em>Source Transformation</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Transformation</em>' container reference.
     * @see #getSourceTransformation()
     * @generated
     */
    void setSourceTransformation(ModelTransformation value);

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
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getModelWrapper_Transient()
     * @model required="true"
     * @generated
     */
    boolean isTransient();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kitt.tracingtree.ModelWrapper#isTransient <em>Transient</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transient</em>' attribute.
     * @see #isTransient()
     * @generated
     */
    void setTransient(boolean value);

    /**
     * Returns the value of the '<em><b>Root Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to element which represents root element of the represented model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Root Object</em>' reference.
     * @see #setRootObject(EObjectWrapper)
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getModelWrapper_RootObject()
     * @model required="true"
     * @generated
     */
    EObjectWrapper getRootObject();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kitt.tracingtree.ModelWrapper#getRootObject <em>Root Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root Object</em>' reference.
     * @see #getRootObject()
     * @generated
     */
    void setRootObject(EObjectWrapper value);

} // ModelWrapper
