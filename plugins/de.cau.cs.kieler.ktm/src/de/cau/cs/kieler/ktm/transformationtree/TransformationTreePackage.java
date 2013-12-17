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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.ktm.transformationtree.TransformationTreeFactory
 * @model kind="package"
 * @generated
 */
public interface TransformationTreePackage extends EPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "transformationtree";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://kieler.cs.cau.de/transformationtree/0.1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "transformationtree";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TransformationTreePackage eINSTANCE = de.cau.cs.kieler.ktm.transformationtree.impl.TransformationTreePackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.ktm.transformationtree.impl.ModelImpl
     * @see de.cau.cs.kieler.ktm.transformationtree.impl.TransformationTreePackageImpl#getModel()
     * @generated
     */
    int MODEL = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__NAME = 0;

    /**
     * The feature id for the '<em><b>Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__ELEMENTS = 1;

    /**
     * The feature id for the '<em><b>Transformed Into</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__TRANSFORMED_INTO = 2;

    /**
     * The feature id for the '<em><b>Transformed From</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__TRANSFORMED_FROM = 3;

    /**
     * The feature id for the '<em><b>Transient</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__TRANSIENT = 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__TYPE = 5;

    /**
     * The feature id for the '<em><b>Root Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__ROOT_ELEMENT = 6;

    /**
     * The number of structural features of the '<em>Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.ktm.transformationtree.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.ktm.transformationtree.impl.ElementImpl
     * @see de.cau.cs.kieler.ktm.transformationtree.impl.TransformationTreePackageImpl#getElement()
     * @generated
     */
    int ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__MODEL = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__NAME = 1;

    /**
     * The feature id for the '<em><b>Transformed Into</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__TRANSFORMED_INTO = 2;

    /**
     * The feature id for the '<em><b>Transformed From</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__TRANSFORMED_FROM = 3;

    /**
     * The feature id for the '<em><b>Referenced Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__REFERENCED_OBJECT = 4;

    /**
     * The number of structural features of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelTransformationImpl <em>Model Transformation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.ktm.transformationtree.impl.ModelTransformationImpl
     * @see de.cau.cs.kieler.ktm.transformationtree.impl.TransformationTreePackageImpl#getModelTransformation()
     * @generated
     */
    int MODEL_TRANSFORMATION = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TRANSFORMATION__ID = 0;

    /**
     * The feature id for the '<em><b>Source</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TRANSFORMATION__SOURCE = 1;

    /**
     * The feature id for the '<em><b>Target</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TRANSFORMATION__TARGET = 2;

    /**
     * The feature id for the '<em><b>Element Transformations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TRANSFORMATION__ELEMENT_TRANSFORMATIONS = 3;

    /**
     * The number of structural features of the '<em>Model Transformation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TRANSFORMATION_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.ktm.transformationtree.impl.ElementTransformationImpl <em>Element Transformation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.ktm.transformationtree.impl.ElementTransformationImpl
     * @see de.cau.cs.kieler.ktm.transformationtree.impl.TransformationTreePackageImpl#getElementTransformation()
     * @generated
     */
    int ELEMENT_TRANSFORMATION = 3;

    /**
     * The feature id for the '<em><b>Model Transformation</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TRANSFORMATION__MODEL_TRANSFORMATION = 0;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TRANSFORMATION__SOURCE = 1;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TRANSFORMATION__TARGET = 2;

    /**
     * The number of structural features of the '<em>Element Transformation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TRANSFORMATION_FEATURE_COUNT = 3;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.ktm.transformationtree.Model <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.Model
     * @generated
     */
    EClass getModel();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.ktm.transformationtree.Model#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.Model#getName()
     * @see #getModel()
     * @generated
     */
    EAttribute getModel_Name();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.ktm.transformationtree.Model#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Elements</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.Model#getElements()
     * @see #getModel()
     * @generated
     */
    EReference getModel_Elements();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.ktm.transformationtree.Model#getTransformedInto <em>Transformed Into</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Transformed Into</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.Model#getTransformedInto()
     * @see #getModel()
     * @generated
     */
    EReference getModel_TransformedInto();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.ktm.transformationtree.Model#getTransformedFrom <em>Transformed From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Transformed From</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.Model#getTransformedFrom()
     * @see #getModel()
     * @generated
     */
    EReference getModel_TransformedFrom();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.ktm.transformationtree.Model#isTransient <em>Transient</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transient</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.Model#isTransient()
     * @see #getModel()
     * @generated
     */
    EAttribute getModel_Transient();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.ktm.transformationtree.Model#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.Model#getType()
     * @see #getModel()
     * @generated
     */
    EReference getModel_Type();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.ktm.transformationtree.Model#getRootElement <em>Root Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Root Element</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.Model#getRootElement()
     * @see #getModel()
     * @generated
     */
    EReference getModel_RootElement();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.ktm.transformationtree.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.Element
     * @generated
     */
    EClass getElement();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.ktm.transformationtree.Element#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.Element#getModel()
     * @see #getElement()
     * @generated
     */
    EReference getElement_Model();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.ktm.transformationtree.Element#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.Element#getName()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Name();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.ktm.transformationtree.Element#getTransformedInto <em>Transformed Into</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Transformed Into</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.Element#getTransformedInto()
     * @see #getElement()
     * @generated
     */
    EReference getElement_TransformedInto();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.ktm.transformationtree.Element#getTransformedFrom <em>Transformed From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Transformed From</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.Element#getTransformedFrom()
     * @see #getElement()
     * @generated
     */
    EReference getElement_TransformedFrom();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.ktm.transformationtree.Element#getReferencedObject <em>Referenced Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referenced Object</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.Element#getReferencedObject()
     * @see #getElement()
     * @generated
     */
    EReference getElement_ReferencedObject();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.ktm.transformationtree.ModelTransformation <em>Model Transformation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model Transformation</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ModelTransformation
     * @generated
     */
    EClass getModelTransformation();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.ktm.transformationtree.ModelTransformation#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ModelTransformation#getId()
     * @see #getModelTransformation()
     * @generated
     */
    EAttribute getModelTransformation_Id();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.ktm.transformationtree.ModelTransformation#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Source</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ModelTransformation#getSource()
     * @see #getModelTransformation()
     * @generated
     */
    EReference getModelTransformation_Source();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.ktm.transformationtree.ModelTransformation#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Target</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ModelTransformation#getTarget()
     * @see #getModelTransformation()
     * @generated
     */
    EReference getModelTransformation_Target();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.ktm.transformationtree.ModelTransformation#getElementTransformations <em>Element Transformations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Element Transformations</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ModelTransformation#getElementTransformations()
     * @see #getModelTransformation()
     * @generated
     */
    EReference getModelTransformation_ElementTransformations();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.ktm.transformationtree.ElementTransformation <em>Element Transformation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element Transformation</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ElementTransformation
     * @generated
     */
    EClass getElementTransformation();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.ktm.transformationtree.ElementTransformation#getModelTransformation <em>Model Transformation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model Transformation</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ElementTransformation#getModelTransformation()
     * @see #getElementTransformation()
     * @generated
     */
    EReference getElementTransformation_ModelTransformation();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.ktm.transformationtree.ElementTransformation#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ElementTransformation#getSource()
     * @see #getElementTransformation()
     * @generated
     */
    EReference getElementTransformation_Source();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.ktm.transformationtree.ElementTransformation#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ElementTransformation#getTarget()
     * @see #getElementTransformation()
     * @generated
     */
    EReference getElementTransformation_Target();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TransformationTreeFactory getTransformationTreeFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelImpl <em>Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.ktm.transformationtree.impl.ModelImpl
         * @see de.cau.cs.kieler.ktm.transformationtree.impl.TransformationTreePackageImpl#getModel()
         * @generated
         */
        EClass MODEL = eINSTANCE.getModel();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

        /**
         * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

        /**
         * The meta object literal for the '<em><b>Transformed Into</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL__TRANSFORMED_INTO = eINSTANCE.getModel_TransformedInto();

        /**
         * The meta object literal for the '<em><b>Transformed From</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL__TRANSFORMED_FROM = eINSTANCE.getModel_TransformedFrom();

        /**
         * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL__TRANSIENT = eINSTANCE.getModel_Transient();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL__TYPE = eINSTANCE.getModel_Type();

        /**
         * The meta object literal for the '<em><b>Root Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL__ROOT_ELEMENT = eINSTANCE.getModel_RootElement();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.ktm.transformationtree.impl.ElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.ktm.transformationtree.impl.ElementImpl
         * @see de.cau.cs.kieler.ktm.transformationtree.impl.TransformationTreePackageImpl#getElement()
         * @generated
         */
        EClass ELEMENT = eINSTANCE.getElement();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__MODEL = eINSTANCE.getElement_Model();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

        /**
         * The meta object literal for the '<em><b>Transformed Into</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__TRANSFORMED_INTO = eINSTANCE.getElement_TransformedInto();

        /**
         * The meta object literal for the '<em><b>Transformed From</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__TRANSFORMED_FROM = eINSTANCE.getElement_TransformedFrom();

        /**
         * The meta object literal for the '<em><b>Referenced Object</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__REFERENCED_OBJECT = eINSTANCE.getElement_ReferencedObject();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelTransformationImpl <em>Model Transformation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.ktm.transformationtree.impl.ModelTransformationImpl
         * @see de.cau.cs.kieler.ktm.transformationtree.impl.TransformationTreePackageImpl#getModelTransformation()
         * @generated
         */
        EClass MODEL_TRANSFORMATION = eINSTANCE.getModelTransformation();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_TRANSFORMATION__ID = eINSTANCE.getModelTransformation_Id();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_TRANSFORMATION__SOURCE = eINSTANCE.getModelTransformation_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_TRANSFORMATION__TARGET = eINSTANCE.getModelTransformation_Target();

        /**
         * The meta object literal for the '<em><b>Element Transformations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_TRANSFORMATION__ELEMENT_TRANSFORMATIONS = eINSTANCE.getModelTransformation_ElementTransformations();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.ktm.transformationtree.impl.ElementTransformationImpl <em>Element Transformation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.ktm.transformationtree.impl.ElementTransformationImpl
         * @see de.cau.cs.kieler.ktm.transformationtree.impl.TransformationTreePackageImpl#getElementTransformation()
         * @generated
         */
        EClass ELEMENT_TRANSFORMATION = eINSTANCE.getElementTransformation();

        /**
         * The meta object literal for the '<em><b>Model Transformation</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT_TRANSFORMATION__MODEL_TRANSFORMATION = eINSTANCE.getElementTransformation_ModelTransformation();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT_TRANSFORMATION__SOURCE = eINSTANCE.getElementTransformation_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT_TRANSFORMATION__TARGET = eINSTANCE.getElementTransformation_Target();

    }

} //TransformationTreePackage
