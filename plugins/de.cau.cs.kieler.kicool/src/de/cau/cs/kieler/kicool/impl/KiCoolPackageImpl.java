/**
 */
package de.cau.cs.kieler.kicool.impl;

import de.cau.cs.kieler.annotations.AnnotationsPackage;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;
import de.cau.cs.kieler.kexpressions.kext.KExtPackage;
import de.cau.cs.kieler.kicool.IntermediateReference;
import de.cau.cs.kieler.kicool.KiCoolFactory;
import de.cau.cs.kieler.kicool.KiCoolPackage;
import de.cau.cs.kieler.kicool.ProcessorAlternativeGroup;
import de.cau.cs.kieler.kicool.ProcessorEntry;
import de.cau.cs.kieler.kicool.ProcessorGroup;

import de.cau.cs.kieler.kicool.ProcessorReference;
import de.cau.cs.kieler.kicool.ProcessorSystem;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KiCoolPackageImpl extends EPackageImpl implements KiCoolPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass systemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processorEntryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processorReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processorSystemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processorGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processorAlternativeGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intermediateReferenceEClass = null;

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
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private KiCoolPackageImpl() {
        super(eNS_URI, KiCoolFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link KiCoolPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static KiCoolPackage init() {
        if (isInited) return (KiCoolPackage)EPackage.Registry.INSTANCE.getEPackage(KiCoolPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredKiCoolPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        KiCoolPackageImpl theKiCoolPackage = registeredKiCoolPackage instanceof KiCoolPackageImpl ? (KiCoolPackageImpl)registeredKiCoolPackage : new KiCoolPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        AnnotationsPackage.eINSTANCE.eClass();
        KEffectsPackage.eINSTANCE.eClass();
        KExpressionsPackage.eINSTANCE.eClass();
        KExtPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theKiCoolPackage.createPackageContents();

        // Initialize created meta-data
        theKiCoolPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theKiCoolPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(KiCoolPackage.eNS_URI, theKiCoolPackage);
        return theKiCoolPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSystem() {
        return systemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSystem_Id() {
        return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSystem_Label() {
        return (EAttribute)systemEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSystem_Processors() {
        return (EReference)systemEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSystem_Intermediates() {
        return (EReference)systemEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSystem_Config() {
        return (EReference)systemEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSystem_StartConfig() {
        return (EReference)systemEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSystem_Public() {
        return (EAttribute)systemEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSystem_Developer() {
        return (EAttribute)systemEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSystem_Simulation() {
        return (EAttribute)systemEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProcessorEntry() {
        return processorEntryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessorEntry_Id() {
        return (EAttribute)processorEntryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProcessorReference() {
        return processorReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessorReference_Label() {
        return (EAttribute)processorReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessorReference_Preconfig() {
        return (EReference)processorReferenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessorReference_Postconfig() {
        return (EReference)processorReferenceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessorReference_Metric() {
        return (EReference)processorReferenceEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessorReference_Preprocesses() {
        return (EReference)processorReferenceEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessorReference_Postprocesses() {
        return (EReference)processorReferenceEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessorReference_Silent() {
        return (EAttribute)processorReferenceEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProcessorSystem() {
        return processorSystemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProcessorGroup() {
        return processorGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessorGroup_Processors() {
        return (EReference)processorGroupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessorGroup_Label() {
        return (EAttribute)processorGroupEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProcessorAlternativeGroup() {
        return processorAlternativeGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIntermediateReference() {
        return intermediateReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIntermediateReference_Alias() {
        return (EAttribute)intermediateReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public KiCoolFactory getKiCoolFactory() {
        return (KiCoolFactory)getEFactoryInstance();
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
        systemEClass = createEClass(SYSTEM);
        createEAttribute(systemEClass, SYSTEM__ID);
        createEAttribute(systemEClass, SYSTEM__LABEL);
        createEReference(systemEClass, SYSTEM__PROCESSORS);
        createEReference(systemEClass, SYSTEM__INTERMEDIATES);
        createEReference(systemEClass, SYSTEM__CONFIG);
        createEReference(systemEClass, SYSTEM__START_CONFIG);
        createEAttribute(systemEClass, SYSTEM__PUBLIC);
        createEAttribute(systemEClass, SYSTEM__DEVELOPER);
        createEAttribute(systemEClass, SYSTEM__SIMULATION);

        processorEntryEClass = createEClass(PROCESSOR_ENTRY);
        createEAttribute(processorEntryEClass, PROCESSOR_ENTRY__ID);

        processorReferenceEClass = createEClass(PROCESSOR_REFERENCE);
        createEAttribute(processorReferenceEClass, PROCESSOR_REFERENCE__LABEL);
        createEReference(processorReferenceEClass, PROCESSOR_REFERENCE__PRECONFIG);
        createEReference(processorReferenceEClass, PROCESSOR_REFERENCE__POSTCONFIG);
        createEReference(processorReferenceEClass, PROCESSOR_REFERENCE__METRIC);
        createEReference(processorReferenceEClass, PROCESSOR_REFERENCE__PREPROCESSES);
        createEReference(processorReferenceEClass, PROCESSOR_REFERENCE__POSTPROCESSES);
        createEAttribute(processorReferenceEClass, PROCESSOR_REFERENCE__SILENT);

        processorSystemEClass = createEClass(PROCESSOR_SYSTEM);

        processorGroupEClass = createEClass(PROCESSOR_GROUP);
        createEReference(processorGroupEClass, PROCESSOR_GROUP__PROCESSORS);
        createEAttribute(processorGroupEClass, PROCESSOR_GROUP__LABEL);

        processorAlternativeGroupEClass = createEClass(PROCESSOR_ALTERNATIVE_GROUP);

        intermediateReferenceEClass = createEClass(INTERMEDIATE_REFERENCE);
        createEAttribute(intermediateReferenceEClass, INTERMEDIATE_REFERENCE__ALIAS);
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
        systemEClass.getESuperTypes().add(theAnnotationsPackage.getPragmatable());
        systemEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        processorReferenceEClass.getESuperTypes().add(this.getProcessorEntry());
        processorSystemEClass.getESuperTypes().add(this.getProcessorEntry());
        processorGroupEClass.getESuperTypes().add(this.getProcessorEntry());
        processorAlternativeGroupEClass.getESuperTypes().add(this.getProcessorGroup());
        intermediateReferenceEClass.getESuperTypes().add(this.getProcessorReference());

        // Initialize classes and features; add operations and parameters
        initEClass(systemEClass, de.cau.cs.kieler.kicool.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSystem_Id(), ecorePackage.getEString(), "id", null, 0, 1, de.cau.cs.kieler.kicool.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSystem_Label(), ecorePackage.getEString(), "label", null, 0, 1, de.cau.cs.kieler.kicool.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystem_Processors(), this.getProcessorEntry(), null, "processors", null, 0, 1, de.cau.cs.kieler.kicool.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystem_Intermediates(), this.getIntermediateReference(), null, "intermediates", null, 0, -1, de.cau.cs.kieler.kicool.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystem_Config(), theKExpressionsPackage.getJsonObjectValue(), null, "config", null, 0, 1, de.cau.cs.kieler.kicool.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystem_StartConfig(), theKExpressionsPackage.getJsonObjectValue(), null, "startConfig", null, 0, 1, de.cau.cs.kieler.kicool.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSystem_Public(), ecorePackage.getEBoolean(), "public", null, 0, 1, de.cau.cs.kieler.kicool.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSystem_Developer(), ecorePackage.getEBoolean(), "developer", null, 0, 1, de.cau.cs.kieler.kicool.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSystem_Simulation(), ecorePackage.getEBoolean(), "simulation", null, 0, 1, de.cau.cs.kieler.kicool.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processorEntryEClass, ProcessorEntry.class, "ProcessorEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProcessorEntry_Id(), ecorePackage.getEString(), "id", null, 0, 1, ProcessorEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processorReferenceEClass, ProcessorReference.class, "ProcessorReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProcessorReference_Label(), ecorePackage.getEString(), "label", null, 0, 1, ProcessorReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcessorReference_Preconfig(), theKExpressionsPackage.getJsonObjectValue(), null, "preconfig", null, 0, 1, ProcessorReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcessorReference_Postconfig(), theKExpressionsPackage.getJsonObjectValue(), null, "postconfig", null, 0, 1, ProcessorReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcessorReference_Metric(), this.getIntermediateReference(), null, "metric", null, 0, 1, ProcessorReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcessorReference_Preprocesses(), this.getProcessorReference(), null, "preprocesses", null, 0, -1, ProcessorReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcessorReference_Postprocesses(), this.getProcessorReference(), null, "postprocesses", null, 0, -1, ProcessorReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessorReference_Silent(), ecorePackage.getEBoolean(), "silent", null, 0, 1, ProcessorReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processorSystemEClass, ProcessorSystem.class, "ProcessorSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(processorGroupEClass, ProcessorGroup.class, "ProcessorGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProcessorGroup_Processors(), this.getProcessorEntry(), null, "processors", null, 0, -1, ProcessorGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessorGroup_Label(), ecorePackage.getEString(), "label", null, 0, 1, ProcessorGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processorAlternativeGroupEClass, ProcessorAlternativeGroup.class, "ProcessorAlternativeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(intermediateReferenceEClass, IntermediateReference.class, "IntermediateReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntermediateReference_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, IntermediateReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //KiCoolPackageImpl
