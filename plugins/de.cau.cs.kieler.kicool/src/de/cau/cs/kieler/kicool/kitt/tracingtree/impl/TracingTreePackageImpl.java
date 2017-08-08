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
package de.cau.cs.kieler.kicool.kitt.tracingtree.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.cau.cs.kieler.kicool.kitt.tracingtree.EObjectTransformation;
import de.cau.cs.kieler.kicool.kitt.tracingtree.EObjectWrapper;
import de.cau.cs.kieler.kicool.kitt.tracingtree.ModelTransformation;
import de.cau.cs.kieler.kicool.kitt.tracingtree.ModelWrapper;
import de.cau.cs.kieler.kicool.kitt.tracingtree.TracingTreeFactory;
import de.cau.cs.kieler.kicool.kitt.tracingtree.TracingTreePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TracingTreePackageImpl extends EPackageImpl implements TracingTreePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modelWrapperEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eObjectWrapperEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modelTransformationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eObjectTransformationEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.cau.cs.kieler.kicool.kitt.tracingtree.TracingTreePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TracingTreePackageImpl() {
        super(eNS_URI, TracingTreeFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link TracingTreePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TracingTreePackage init() {
        if (isInited) return (TracingTreePackage)EPackage.Registry.INSTANCE.getEPackage(TracingTreePackage.eNS_URI);

        // Obtain or create and register package
        TracingTreePackageImpl theTracingTreePackage = (TracingTreePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TracingTreePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TracingTreePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theTracingTreePackage.createPackageContents();

        // Initialize created meta-data
        theTracingTreePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTracingTreePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TracingTreePackage.eNS_URI, theTracingTreePackage);
        return theTracingTreePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModelWrapper() {
        return modelWrapperEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelWrapper_ModelTypeID() {
        return (EAttribute)modelWrapperEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModelWrapper_ModelObjects() {
        return (EReference)modelWrapperEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModelWrapper_TargetTransformations() {
        return (EReference)modelWrapperEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModelWrapper_SourceTransformation() {
        return (EReference)modelWrapperEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelWrapper_Transient() {
        return (EAttribute)modelWrapperEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModelWrapper_RootObject() {
        return (EReference)modelWrapperEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEObjectWrapper() {
        return eObjectWrapperEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEObjectWrapper_Model() {
        return (EReference)eObjectWrapperEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEObjectWrapper_DisplayName() {
        return (EAttribute)eObjectWrapperEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEObjectWrapper_TargetTransformations() {
        return (EReference)eObjectWrapperEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEObjectWrapper_SourceTransformations() {
        return (EReference)eObjectWrapperEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEObjectWrapper_EObject() {
        return (EReference)eObjectWrapperEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModelTransformation() {
        return modelTransformationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelTransformation_TransformationID() {
        return (EAttribute)modelTransformationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModelTransformation_Source() {
        return (EReference)modelTransformationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModelTransformation_Target() {
        return (EReference)modelTransformationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModelTransformation_ObjectTransformations() {
        return (EReference)modelTransformationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEObjectTransformation() {
        return eObjectTransformationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEObjectTransformation_ModelTransformation() {
        return (EReference)eObjectTransformationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEObjectTransformation_Source() {
        return (EReference)eObjectTransformationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEObjectTransformation_Target() {
        return (EReference)eObjectTransformationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TracingTreeFactory getTracingTreeFactory() {
        return (TracingTreeFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        modelWrapperEClass = createEClass(MODEL_WRAPPER);
        createEAttribute(modelWrapperEClass, MODEL_WRAPPER__MODEL_TYPE_ID);
        createEReference(modelWrapperEClass, MODEL_WRAPPER__MODEL_OBJECTS);
        createEReference(modelWrapperEClass, MODEL_WRAPPER__TARGET_TRANSFORMATIONS);
        createEReference(modelWrapperEClass, MODEL_WRAPPER__SOURCE_TRANSFORMATION);
        createEAttribute(modelWrapperEClass, MODEL_WRAPPER__TRANSIENT);
        createEReference(modelWrapperEClass, MODEL_WRAPPER__ROOT_OBJECT);

        eObjectWrapperEClass = createEClass(EOBJECT_WRAPPER);
        createEReference(eObjectWrapperEClass, EOBJECT_WRAPPER__MODEL);
        createEAttribute(eObjectWrapperEClass, EOBJECT_WRAPPER__DISPLAY_NAME);
        createEReference(eObjectWrapperEClass, EOBJECT_WRAPPER__TARGET_TRANSFORMATIONS);
        createEReference(eObjectWrapperEClass, EOBJECT_WRAPPER__SOURCE_TRANSFORMATIONS);
        createEReference(eObjectWrapperEClass, EOBJECT_WRAPPER__EOBJECT);

        modelTransformationEClass = createEClass(MODEL_TRANSFORMATION);
        createEAttribute(modelTransformationEClass, MODEL_TRANSFORMATION__TRANSFORMATION_ID);
        createEReference(modelTransformationEClass, MODEL_TRANSFORMATION__SOURCE);
        createEReference(modelTransformationEClass, MODEL_TRANSFORMATION__TARGET);
        createEReference(modelTransformationEClass, MODEL_TRANSFORMATION__OBJECT_TRANSFORMATIONS);

        eObjectTransformationEClass = createEClass(EOBJECT_TRANSFORMATION);
        createEReference(eObjectTransformationEClass, EOBJECT_TRANSFORMATION__MODEL_TRANSFORMATION);
        createEReference(eObjectTransformationEClass, EOBJECT_TRANSFORMATION__SOURCE);
        createEReference(eObjectTransformationEClass, EOBJECT_TRANSFORMATION__TARGET);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes and features; add operations and parameters
        initEClass(modelWrapperEClass, ModelWrapper.class, "ModelWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getModelWrapper_ModelTypeID(), ecorePackage.getEString(), "modelTypeID", null, 1, 1, ModelWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getModelWrapper_ModelObjects(), this.getEObjectWrapper(), this.getEObjectWrapper_Model(), "modelObjects", null, 1, -1, ModelWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getModelWrapper_TargetTransformations(), this.getModelTransformation(), this.getModelTransformation_Source(), "targetTransformations", null, 0, -1, ModelWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getModelWrapper_SourceTransformation(), this.getModelTransformation(), this.getModelTransformation_Target(), "sourceTransformation", null, 0, 1, ModelWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelWrapper_Transient(), theEcorePackage.getEBoolean(), "transient", null, 1, 1, ModelWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getModelWrapper_RootObject(), this.getEObjectWrapper(), null, "rootObject", null, 1, 1, ModelWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eObjectWrapperEClass, EObjectWrapper.class, "EObjectWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEObjectWrapper_Model(), this.getModelWrapper(), this.getModelWrapper_ModelObjects(), "model", null, 1, 1, EObjectWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEObjectWrapper_DisplayName(), ecorePackage.getEString(), "displayName", null, 1, 1, EObjectWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEObjectWrapper_TargetTransformations(), this.getEObjectTransformation(), this.getEObjectTransformation_Source(), "targetTransformations", null, 0, -1, EObjectWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEObjectWrapper_SourceTransformations(), this.getEObjectTransformation(), this.getEObjectTransformation_Target(), "sourceTransformations", null, 0, -1, EObjectWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEObjectWrapper_EObject(), theEcorePackage.getEObject(), null, "eObject", null, 0, 1, EObjectWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(modelTransformationEClass, ModelTransformation.class, "ModelTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getModelTransformation_TransformationID(), theEcorePackage.getEString(), "transformationID", "", 1, 1, ModelTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getModelTransformation_Source(), this.getModelWrapper(), this.getModelWrapper_TargetTransformations(), "source", null, 1, 1, ModelTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getModelTransformation_Target(), this.getModelWrapper(), this.getModelWrapper_SourceTransformation(), "target", null, 1, 1, ModelTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getModelTransformation_ObjectTransformations(), this.getEObjectTransformation(), this.getEObjectTransformation_ModelTransformation(), "objectTransformations", null, 1, -1, ModelTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eObjectTransformationEClass, EObjectTransformation.class, "EObjectTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEObjectTransformation_ModelTransformation(), this.getModelTransformation(), this.getModelTransformation_ObjectTransformations(), "modelTransformation", null, 1, 1, EObjectTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEObjectTransformation_Source(), this.getEObjectWrapper(), this.getEObjectWrapper_TargetTransformations(), "source", null, 1, 1, EObjectTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEObjectTransformation_Target(), this.getEObjectWrapper(), this.getEObjectWrapper_SourceTransformations(), "target", null, 1, 1, EObjectTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //TracingTreePackageImpl
