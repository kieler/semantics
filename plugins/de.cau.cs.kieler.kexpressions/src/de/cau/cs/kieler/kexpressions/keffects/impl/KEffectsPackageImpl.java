/**
 */
package de.cau.cs.kieler.kexpressions.keffects.impl;

import de.cau.cs.kieler.annotations.AnnotationsPackage;

import de.cau.cs.kieler.kexpressions.KExpressionsPackage;

import de.cau.cs.kieler.kexpressions.keffects.AssignOperator;
import de.cau.cs.kieler.kexpressions.keffects.Assignment;
import de.cau.cs.kieler.kexpressions.keffects.Effect;
import de.cau.cs.kieler.kexpressions.keffects.Emission;
import de.cau.cs.kieler.kexpressions.keffects.FunctionCallEffect;
import de.cau.cs.kieler.kexpressions.keffects.HostcodeEffect;
import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory;
import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;

import de.cau.cs.kieler.kexpressions.keffects.ReferenceCallEffect;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KEffectsPackageImpl extends EPackageImpl implements KEffectsPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass effectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass emissionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hostcodeEffectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceCallEffectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionCallEffectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum assignOperatorEEnum = null;

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
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private KEffectsPackageImpl() {
        super(eNS_URI, KEffectsFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link KEffectsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static KEffectsPackage init() {
        if (isInited) return (KEffectsPackage)EPackage.Registry.INSTANCE.getEPackage(KEffectsPackage.eNS_URI);

        // Obtain or create and register package
        KEffectsPackageImpl theKEffectsPackage = (KEffectsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KEffectsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KEffectsPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        KExpressionsPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theKEffectsPackage.createPackageContents();

        // Initialize created meta-data
        theKEffectsPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theKEffectsPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(KEffectsPackage.eNS_URI, theKEffectsPackage);
        return theKEffectsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEffect() {
        return effectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssignment() {
        return assignmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssignment_ValuedObject() {
        return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssignment_Expression() {
        return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssignment_Indices() {
        return (EReference)assignmentEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAssignment_Operator() {
        return (EAttribute)assignmentEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssignment_SubReference() {
        return (EReference)assignmentEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEmission() {
        return emissionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEmission_ValuedObject() {
        return (EReference)emissionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEmission_NewValue() {
        return (EReference)emissionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHostcodeEffect() {
        return hostcodeEffectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReferenceCallEffect() {
        return referenceCallEffectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFunctionCallEffect() {
        return functionCallEffectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAssignOperator() {
        return assignOperatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KEffectsFactory getKEffectsFactory() {
        return (KEffectsFactory)getEFactoryInstance();
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
        effectEClass = createEClass(EFFECT);

        assignmentEClass = createEClass(ASSIGNMENT);
        createEReference(assignmentEClass, ASSIGNMENT__VALUED_OBJECT);
        createEReference(assignmentEClass, ASSIGNMENT__EXPRESSION);
        createEReference(assignmentEClass, ASSIGNMENT__INDICES);
        createEAttribute(assignmentEClass, ASSIGNMENT__OPERATOR);
        createEReference(assignmentEClass, ASSIGNMENT__SUB_REFERENCE);

        emissionEClass = createEClass(EMISSION);
        createEReference(emissionEClass, EMISSION__VALUED_OBJECT);
        createEReference(emissionEClass, EMISSION__NEW_VALUE);

        hostcodeEffectEClass = createEClass(HOSTCODE_EFFECT);

        referenceCallEffectEClass = createEClass(REFERENCE_CALL_EFFECT);

        functionCallEffectEClass = createEClass(FUNCTION_CALL_EFFECT);

        // Create enums
        assignOperatorEEnum = createEEnum(ASSIGN_OPERATOR);
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
        AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
        KExpressionsPackage theKExpressionsPackage = (KExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(KExpressionsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        effectEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        assignmentEClass.getESuperTypes().add(this.getEffect());
        emissionEClass.getESuperTypes().add(this.getEffect());
        hostcodeEffectEClass.getESuperTypes().add(this.getEffect());
        hostcodeEffectEClass.getESuperTypes().add(theKExpressionsPackage.getTextExpression());
        referenceCallEffectEClass.getESuperTypes().add(this.getEffect());
        referenceCallEffectEClass.getESuperTypes().add(theKExpressionsPackage.getReferenceCall());
        functionCallEffectEClass.getESuperTypes().add(this.getEffect());
        functionCallEffectEClass.getESuperTypes().add(theKExpressionsPackage.getFunctionCall());

        // Initialize classes and features; add operations and parameters
        initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssignment_ValuedObject(), theKExpressionsPackage.getValuedObject(), null, "valuedObject", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssignment_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssignment_Indices(), theKExpressionsPackage.getExpression(), null, "indices", null, 0, -1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssignment_Operator(), this.getAssignOperator(), "operator", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssignment_SubReference(), theKExpressionsPackage.getValuedObjectReference(), null, "subReference", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(emissionEClass, Emission.class, "Emission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEmission_ValuedObject(), theKExpressionsPackage.getValuedObject(), null, "valuedObject", null, 1, 1, Emission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEmission_NewValue(), theKExpressionsPackage.getExpression(), null, "newValue", null, 0, 1, Emission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(hostcodeEffectEClass, HostcodeEffect.class, "HostcodeEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(referenceCallEffectEClass, ReferenceCallEffect.class, "ReferenceCallEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(functionCallEffectEClass, FunctionCallEffect.class, "FunctionCallEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(assignOperatorEEnum, AssignOperator.class, "AssignOperator");
        addEEnumLiteral(assignOperatorEEnum, AssignOperator.ASSIGN);
        addEEnumLiteral(assignOperatorEEnum, AssignOperator.ASSIGNADD);
        addEEnumLiteral(assignOperatorEEnum, AssignOperator.ASSIGNSUB);
        addEEnumLiteral(assignOperatorEEnum, AssignOperator.ASSIGNMUL);
        addEEnumLiteral(assignOperatorEEnum, AssignOperator.ASSIGNDIV);
        addEEnumLiteral(assignOperatorEEnum, AssignOperator.ASSIGNMOD);
        addEEnumLiteral(assignOperatorEEnum, AssignOperator.ASSIGNAND);
        addEEnumLiteral(assignOperatorEEnum, AssignOperator.ASSIGNOR);
        addEEnumLiteral(assignOperatorEEnum, AssignOperator.ASSIGNXOR);
        addEEnumLiteral(assignOperatorEEnum, AssignOperator.POSTFIXADD);
        addEEnumLiteral(assignOperatorEEnum, AssignOperator.POSTFIXSUB);

        // Create resource
        createResource(eNS_URI);
    }

} //KEffectsPackageImpl
