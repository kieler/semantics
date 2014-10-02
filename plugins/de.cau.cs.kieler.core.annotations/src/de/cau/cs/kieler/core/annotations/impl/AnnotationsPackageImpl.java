/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.annotations.impl;

import de.cau.cs.kieler.core.annotations.Annotatable;
import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.AnnotationsFactory;
import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.annotations.BooleanAnnotation;
import de.cau.cs.kieler.core.annotations.ContainmentAnnotation;
import de.cau.cs.kieler.core.annotations.FloatAnnotation;
import de.cau.cs.kieler.core.annotations.ImportAnnotation;
import de.cau.cs.kieler.core.annotations.IntAnnotation;
import de.cau.cs.kieler.core.annotations.NamedObject;
import de.cau.cs.kieler.core.annotations.ReferenceAnnotation;
import de.cau.cs.kieler.core.annotations.StringAnnotation;

import de.cau.cs.kieler.core.annotations.TypedStringAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationsPackageImpl extends EPackageImpl implements AnnotationsPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass namedObjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotatableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stringAnnotationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceAnnotationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass booleanAnnotationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intAnnotationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass floatAnnotationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass containmentAnnotationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass importAnnotationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typedStringAnnotationEClass = null;

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
     * @see de.cau.cs.kieler.core.annotations.AnnotationsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private AnnotationsPackageImpl() {
        super(eNS_URI, AnnotationsFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link AnnotationsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static AnnotationsPackage init() {
        if (isInited) return (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);

        // Obtain or create and register package
        AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnnotationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnnotationsPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theAnnotationsPackage.createPackageContents();

        // Initialize created meta-data
        theAnnotationsPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theAnnotationsPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(AnnotationsPackage.eNS_URI, theAnnotationsPackage);
        return theAnnotationsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNamedObject() {
        return namedObjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNamedObject_Name() {
        return (EAttribute)namedObjectEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAnnotatable() {
        return annotatableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnnotatable_Annotations() {
        return (EReference)annotatableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAnnotation() {
        return annotationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStringAnnotation() {
        return stringAnnotationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringAnnotation_Value() {
        return (EAttribute)stringAnnotationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReferenceAnnotation() {
        return referenceAnnotationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getReferenceAnnotation_Object() {
        return (EReference)referenceAnnotationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBooleanAnnotation() {
        return booleanAnnotationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBooleanAnnotation_Value() {
        return (EAttribute)booleanAnnotationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntAnnotation() {
        return intAnnotationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIntAnnotation_Value() {
        return (EAttribute)intAnnotationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFloatAnnotation() {
        return floatAnnotationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFloatAnnotation_Value() {
        return (EAttribute)floatAnnotationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContainmentAnnotation() {
        return containmentAnnotationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContainmentAnnotation_Object() {
        return (EReference)containmentAnnotationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getImportAnnotation() {
        return importAnnotationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImportAnnotation_ImportURI() {
        return (EAttribute)importAnnotationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTypedStringAnnotation() {
        return typedStringAnnotationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypedStringAnnotation_Type() {
        return (EAttribute)typedStringAnnotationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnnotationsFactory getAnnotationsFactory() {
        return (AnnotationsFactory)getEFactoryInstance();
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
        namedObjectEClass = createEClass(NAMED_OBJECT);
        createEAttribute(namedObjectEClass, NAMED_OBJECT__NAME);

        annotatableEClass = createEClass(ANNOTATABLE);
        createEReference(annotatableEClass, ANNOTATABLE__ANNOTATIONS);

        annotationEClass = createEClass(ANNOTATION);

        stringAnnotationEClass = createEClass(STRING_ANNOTATION);
        createEAttribute(stringAnnotationEClass, STRING_ANNOTATION__VALUE);

        referenceAnnotationEClass = createEClass(REFERENCE_ANNOTATION);
        createEReference(referenceAnnotationEClass, REFERENCE_ANNOTATION__OBJECT);

        booleanAnnotationEClass = createEClass(BOOLEAN_ANNOTATION);
        createEAttribute(booleanAnnotationEClass, BOOLEAN_ANNOTATION__VALUE);

        intAnnotationEClass = createEClass(INT_ANNOTATION);
        createEAttribute(intAnnotationEClass, INT_ANNOTATION__VALUE);

        floatAnnotationEClass = createEClass(FLOAT_ANNOTATION);
        createEAttribute(floatAnnotationEClass, FLOAT_ANNOTATION__VALUE);

        containmentAnnotationEClass = createEClass(CONTAINMENT_ANNOTATION);
        createEReference(containmentAnnotationEClass, CONTAINMENT_ANNOTATION__OBJECT);

        importAnnotationEClass = createEClass(IMPORT_ANNOTATION);
        createEAttribute(importAnnotationEClass, IMPORT_ANNOTATION__IMPORT_URI);

        typedStringAnnotationEClass = createEClass(TYPED_STRING_ANNOTATION);
        createEAttribute(typedStringAnnotationEClass, TYPED_STRING_ANNOTATION__TYPE);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        namedObjectEClass.getESuperTypes().add(this.getAnnotatable());
        annotationEClass.getESuperTypes().add(this.getNamedObject());
        stringAnnotationEClass.getESuperTypes().add(this.getAnnotation());
        referenceAnnotationEClass.getESuperTypes().add(this.getAnnotation());
        booleanAnnotationEClass.getESuperTypes().add(this.getAnnotation());
        intAnnotationEClass.getESuperTypes().add(this.getAnnotation());
        floatAnnotationEClass.getESuperTypes().add(this.getAnnotation());
        containmentAnnotationEClass.getESuperTypes().add(this.getAnnotation());
        importAnnotationEClass.getESuperTypes().add(this.getAnnotation());
        typedStringAnnotationEClass.getESuperTypes().add(this.getStringAnnotation());

        // Initialize classes and features; add operations and parameters
        initEClass(namedObjectEClass, NamedObject.class, "NamedObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNamedObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(annotatableEClass, Annotatable.class, "Annotatable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAnnotatable_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, Annotatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = addEOperation(annotatableEClass, this.getAnnotation(), "getAnnotation", 1, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(annotatableEClass, null, "getAllAnnotations", 1, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEEList());
        EGenericType g2 = createEGenericType(this.getAnnotation());
        g1.getETypeArguments().add(g2);
        initEOperation(op, g1);

        op = addEOperation(annotatableEClass, null, "removeAllAnnotations", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(stringAnnotationEClass, StringAnnotation.class, "StringAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStringAnnotation_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(referenceAnnotationEClass, ReferenceAnnotation.class, "ReferenceAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getReferenceAnnotation_Object(), ecorePackage.getEObject(), null, "object", null, 1, 1, ReferenceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(booleanAnnotationEClass, BooleanAnnotation.class, "BooleanAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBooleanAnnotation_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(intAnnotationEClass, IntAnnotation.class, "IntAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntAnnotation_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(floatAnnotationEClass, FloatAnnotation.class, "FloatAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFloatAnnotation_Value(), ecorePackage.getEFloat(), "value", null, 1, 1, FloatAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(containmentAnnotationEClass, ContainmentAnnotation.class, "ContainmentAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContainmentAnnotation_Object(), ecorePackage.getEObject(), null, "object", null, 1, 1, ContainmentAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(importAnnotationEClass, ImportAnnotation.class, "ImportAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getImportAnnotation_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, ImportAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(typedStringAnnotationEClass, TypedStringAnnotation.class, "TypedStringAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTypedStringAnnotation_Type(), ecorePackage.getEString(), "type", null, 0, 1, TypedStringAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //AnnotationsPackageImpl
