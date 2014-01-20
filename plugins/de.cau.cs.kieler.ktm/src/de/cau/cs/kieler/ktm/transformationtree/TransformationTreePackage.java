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
     * The meta object id for the '{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelWrapperImpl <em>Model Wrapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.ktm.transformationtree.impl.ModelWrapperImpl
     * @see de.cau.cs.kieler.ktm.transformationtree.impl.TransformationTreePackageImpl#getModelWrapper()
     * @generated
     */
    int MODEL_WRAPPER = 0;

    /**
     * The feature id for the '<em><b>Model Type ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_WRAPPER__MODEL_TYPE_ID = 0;

    /**
     * The feature id for the '<em><b>Model Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_WRAPPER__MODEL_OBJECTS = 1;

    /**
     * The feature id for the '<em><b>Target Transformations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_WRAPPER__TARGET_TRANSFORMATIONS = 2;

    /**
     * The feature id for the '<em><b>Source Transformation</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_WRAPPER__SOURCE_TRANSFORMATION = 3;

    /**
     * The feature id for the '<em><b>Transient</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_WRAPPER__TRANSIENT = 4;

    /**
     * The feature id for the '<em><b>Root Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_WRAPPER__ROOT_OBJECT = 5;

    /**
     * The number of structural features of the '<em>Model Wrapper</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_WRAPPER_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.ktm.transformationtree.impl.EObjectWrapperImpl <em>EObject Wrapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.ktm.transformationtree.impl.EObjectWrapperImpl
     * @see de.cau.cs.kieler.ktm.transformationtree.impl.TransformationTreePackageImpl#getEObjectWrapper()
     * @generated
     */
    int EOBJECT_WRAPPER = 1;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOBJECT_WRAPPER__MODEL = 0;

    /**
     * The feature id for the '<em><b>Display Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOBJECT_WRAPPER__DISPLAY_NAME = 1;

    /**
     * The feature id for the '<em><b>Target Transformations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOBJECT_WRAPPER__TARGET_TRANSFORMATIONS = 2;

    /**
     * The feature id for the '<em><b>Source Transformations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOBJECT_WRAPPER__SOURCE_TRANSFORMATIONS = 3;

    /**
     * The feature id for the '<em><b>EObject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOBJECT_WRAPPER__EOBJECT = 4;

    /**
     * The number of structural features of the '<em>EObject Wrapper</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOBJECT_WRAPPER_FEATURE_COUNT = 5;

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
     * The feature id for the '<em><b>Transformation ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TRANSFORMATION__TRANSFORMATION_ID = 0;

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
     * The feature id for the '<em><b>Object Transformations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TRANSFORMATION__OBJECT_TRANSFORMATIONS = 3;

    /**
     * The number of structural features of the '<em>Model Transformation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TRANSFORMATION_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.ktm.transformationtree.impl.EObjectTransformationImpl <em>EObject Transformation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.ktm.transformationtree.impl.EObjectTransformationImpl
     * @see de.cau.cs.kieler.ktm.transformationtree.impl.TransformationTreePackageImpl#getEObjectTransformation()
     * @generated
     */
    int EOBJECT_TRANSFORMATION = 3;

    /**
     * The feature id for the '<em><b>Model Transformation</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOBJECT_TRANSFORMATION__MODEL_TRANSFORMATION = 0;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOBJECT_TRANSFORMATION__SOURCE = 1;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOBJECT_TRANSFORMATION__TARGET = 2;

    /**
     * The number of structural features of the '<em>EObject Transformation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOBJECT_TRANSFORMATION_FEATURE_COUNT = 3;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.ktm.transformationtree.ModelWrapper <em>Model Wrapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model Wrapper</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ModelWrapper
     * @generated
     */
    EClass getModelWrapper();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.ktm.transformationtree.ModelWrapper#getModelTypeID <em>Model Type ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Model Type ID</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ModelWrapper#getModelTypeID()
     * @see #getModelWrapper()
     * @generated
     */
    EAttribute getModelWrapper_ModelTypeID();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.ktm.transformationtree.ModelWrapper#getModelObjects <em>Model Objects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Model Objects</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ModelWrapper#getModelObjects()
     * @see #getModelWrapper()
     * @generated
     */
    EReference getModelWrapper_ModelObjects();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.ktm.transformationtree.ModelWrapper#getTargetTransformations <em>Target Transformations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Target Transformations</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ModelWrapper#getTargetTransformations()
     * @see #getModelWrapper()
     * @generated
     */
    EReference getModelWrapper_TargetTransformations();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.ktm.transformationtree.ModelWrapper#getSourceTransformation <em>Source Transformation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Source Transformation</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ModelWrapper#getSourceTransformation()
     * @see #getModelWrapper()
     * @generated
     */
    EReference getModelWrapper_SourceTransformation();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.ktm.transformationtree.ModelWrapper#isTransient <em>Transient</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transient</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ModelWrapper#isTransient()
     * @see #getModelWrapper()
     * @generated
     */
    EAttribute getModelWrapper_Transient();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.ktm.transformationtree.ModelWrapper#getRootObject <em>Root Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Root Object</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ModelWrapper#getRootObject()
     * @see #getModelWrapper()
     * @generated
     */
    EReference getModelWrapper_RootObject();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper <em>EObject Wrapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EObject Wrapper</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper
     * @generated
     */
    EClass getEObjectWrapper();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper#getModel()
     * @see #getEObjectWrapper()
     * @generated
     */
    EReference getEObjectWrapper_Model();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper#getDisplayName <em>Display Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Display Name</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper#getDisplayName()
     * @see #getEObjectWrapper()
     * @generated
     */
    EAttribute getEObjectWrapper_DisplayName();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper#getTargetTransformations <em>Target Transformations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Target Transformations</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper#getTargetTransformations()
     * @see #getEObjectWrapper()
     * @generated
     */
    EReference getEObjectWrapper_TargetTransformations();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper#getSourceTransformations <em>Source Transformations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Source Transformations</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper#getSourceTransformations()
     * @see #getEObjectWrapper()
     * @generated
     */
    EReference getEObjectWrapper_SourceTransformations();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper#getEObject <em>EObject</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>EObject</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper#getEObject()
     * @see #getEObjectWrapper()
     * @generated
     */
    EReference getEObjectWrapper_EObject();

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
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.ktm.transformationtree.ModelTransformation#getTransformationID <em>Transformation ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transformation ID</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ModelTransformation#getTransformationID()
     * @see #getModelTransformation()
     * @generated
     */
    EAttribute getModelTransformation_TransformationID();

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
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.ktm.transformationtree.ModelTransformation#getObjectTransformations <em>Object Transformations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Object Transformations</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.ModelTransformation#getObjectTransformations()
     * @see #getModelTransformation()
     * @generated
     */
    EReference getModelTransformation_ObjectTransformations();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.ktm.transformationtree.EObjectTransformation <em>EObject Transformation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EObject Transformation</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.EObjectTransformation
     * @generated
     */
    EClass getEObjectTransformation();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.ktm.transformationtree.EObjectTransformation#getModelTransformation <em>Model Transformation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model Transformation</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.EObjectTransformation#getModelTransformation()
     * @see #getEObjectTransformation()
     * @generated
     */
    EReference getEObjectTransformation_ModelTransformation();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.ktm.transformationtree.EObjectTransformation#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.EObjectTransformation#getSource()
     * @see #getEObjectTransformation()
     * @generated
     */
    EReference getEObjectTransformation_Source();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.ktm.transformationtree.EObjectTransformation#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see de.cau.cs.kieler.ktm.transformationtree.EObjectTransformation#getTarget()
     * @see #getEObjectTransformation()
     * @generated
     */
    EReference getEObjectTransformation_Target();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelWrapperImpl <em>Model Wrapper</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.ktm.transformationtree.impl.ModelWrapperImpl
         * @see de.cau.cs.kieler.ktm.transformationtree.impl.TransformationTreePackageImpl#getModelWrapper()
         * @generated
         */
        EClass MODEL_WRAPPER = eINSTANCE.getModelWrapper();

        /**
         * The meta object literal for the '<em><b>Model Type ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_WRAPPER__MODEL_TYPE_ID = eINSTANCE.getModelWrapper_ModelTypeID();

        /**
         * The meta object literal for the '<em><b>Model Objects</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_WRAPPER__MODEL_OBJECTS = eINSTANCE.getModelWrapper_ModelObjects();

        /**
         * The meta object literal for the '<em><b>Target Transformations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_WRAPPER__TARGET_TRANSFORMATIONS = eINSTANCE.getModelWrapper_TargetTransformations();

        /**
         * The meta object literal for the '<em><b>Source Transformation</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_WRAPPER__SOURCE_TRANSFORMATION = eINSTANCE.getModelWrapper_SourceTransformation();

        /**
         * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_WRAPPER__TRANSIENT = eINSTANCE.getModelWrapper_Transient();

        /**
         * The meta object literal for the '<em><b>Root Object</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_WRAPPER__ROOT_OBJECT = eINSTANCE.getModelWrapper_RootObject();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.ktm.transformationtree.impl.EObjectWrapperImpl <em>EObject Wrapper</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.ktm.transformationtree.impl.EObjectWrapperImpl
         * @see de.cau.cs.kieler.ktm.transformationtree.impl.TransformationTreePackageImpl#getEObjectWrapper()
         * @generated
         */
        EClass EOBJECT_WRAPPER = eINSTANCE.getEObjectWrapper();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EOBJECT_WRAPPER__MODEL = eINSTANCE.getEObjectWrapper_Model();

        /**
         * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EOBJECT_WRAPPER__DISPLAY_NAME = eINSTANCE.getEObjectWrapper_DisplayName();

        /**
         * The meta object literal for the '<em><b>Target Transformations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EOBJECT_WRAPPER__TARGET_TRANSFORMATIONS = eINSTANCE.getEObjectWrapper_TargetTransformations();

        /**
         * The meta object literal for the '<em><b>Source Transformations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EOBJECT_WRAPPER__SOURCE_TRANSFORMATIONS = eINSTANCE.getEObjectWrapper_SourceTransformations();

        /**
         * The meta object literal for the '<em><b>EObject</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EOBJECT_WRAPPER__EOBJECT = eINSTANCE.getEObjectWrapper_EObject();

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
         * The meta object literal for the '<em><b>Transformation ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_TRANSFORMATION__TRANSFORMATION_ID = eINSTANCE.getModelTransformation_TransformationID();

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
         * The meta object literal for the '<em><b>Object Transformations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_TRANSFORMATION__OBJECT_TRANSFORMATIONS = eINSTANCE.getModelTransformation_ObjectTransformations();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.ktm.transformationtree.impl.EObjectTransformationImpl <em>EObject Transformation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.ktm.transformationtree.impl.EObjectTransformationImpl
         * @see de.cau.cs.kieler.ktm.transformationtree.impl.TransformationTreePackageImpl#getEObjectTransformation()
         * @generated
         */
        EClass EOBJECT_TRANSFORMATION = eINSTANCE.getEObjectTransformation();

        /**
         * The meta object literal for the '<em><b>Model Transformation</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EOBJECT_TRANSFORMATION__MODEL_TRANSFORMATION = eINSTANCE.getEObjectTransformation_ModelTransformation();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EOBJECT_TRANSFORMATION__SOURCE = eINSTANCE.getEObjectTransformation_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EOBJECT_TRANSFORMATION__TARGET = eINSTANCE.getEObjectTransformation_Target();

    }

} //TransformationTreePackage
