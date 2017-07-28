/**
 */
package de.cau.cs.kieler.kicool.impl;

import de.cau.cs.kieler.annotations.AnnotationsPackage;
import de.cau.cs.kieler.kicool.IntermediateReference;
import de.cau.cs.kieler.kicool.KVPair;
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass kvPairEClass = null;

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
        KiCoolPackageImpl theKiCoolPackage = (KiCoolPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KiCoolPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KiCoolPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        AnnotationsPackage.eINSTANCE.eClass();

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
    public EClass getSystem() {
        return systemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSystem_Id() {
        return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSystem_Version() {
        return (EAttribute)systemEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSystem_Label() {
        return (EAttribute)systemEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystem_Processors() {
        return (EReference)systemEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystem_Intermediates() {
        return (EReference)systemEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSystem_InputClass() {
        return (EAttribute)systemEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcessorEntry() {
        return processorEntryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcessorEntry_Id() {
        return (EAttribute)processorEntryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcessorReference() {
        return processorReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcessorReference_Presets() {
        return (EReference)processorReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcessorReference_Postsets() {
        return (EReference)processorReferenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcessorReference_Metric() {
        return (EReference)processorReferenceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcessorSystem() {
        return processorSystemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcessorGroup() {
        return processorGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcessorGroup_Processors() {
        return (EReference)processorGroupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcessorGroup_Label() {
        return (EAttribute)processorGroupEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcessorAlternativeGroup() {
        return processorAlternativeGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntermediateReference() {
        return intermediateReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIntermediateReference_Alias() {
        return (EAttribute)intermediateReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKVPair() {
        return kvPairEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKVPair_Key() {
        return (EAttribute)kvPairEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKVPair_Value() {
        return (EAttribute)kvPairEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKVPair_IsKeyValue() {
        return (EAttribute)kvPairEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
        createEAttribute(systemEClass, SYSTEM__VERSION);
        createEAttribute(systemEClass, SYSTEM__LABEL);
        createEReference(systemEClass, SYSTEM__PROCESSORS);
        createEReference(systemEClass, SYSTEM__INTERMEDIATES);
        createEAttribute(systemEClass, SYSTEM__INPUT_CLASS);

        processorEntryEClass = createEClass(PROCESSOR_ENTRY);
        createEAttribute(processorEntryEClass, PROCESSOR_ENTRY__ID);

        processorReferenceEClass = createEClass(PROCESSOR_REFERENCE);
        createEReference(processorReferenceEClass, PROCESSOR_REFERENCE__PRESETS);
        createEReference(processorReferenceEClass, PROCESSOR_REFERENCE__POSTSETS);
        createEReference(processorReferenceEClass, PROCESSOR_REFERENCE__METRIC);

        processorSystemEClass = createEClass(PROCESSOR_SYSTEM);

        processorGroupEClass = createEClass(PROCESSOR_GROUP);
        createEReference(processorGroupEClass, PROCESSOR_GROUP__PROCESSORS);
        createEAttribute(processorGroupEClass, PROCESSOR_GROUP__LABEL);

        processorAlternativeGroupEClass = createEClass(PROCESSOR_ALTERNATIVE_GROUP);

        intermediateReferenceEClass = createEClass(INTERMEDIATE_REFERENCE);
        createEAttribute(intermediateReferenceEClass, INTERMEDIATE_REFERENCE__ALIAS);

        kvPairEClass = createEClass(KV_PAIR);
        createEAttribute(kvPairEClass, KV_PAIR__KEY);
        createEAttribute(kvPairEClass, KV_PAIR__VALUE);
        createEAttribute(kvPairEClass, KV_PAIR__IS_KEY_VALUE);
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
        processorReferenceEClass.getESuperTypes().add(this.getProcessorEntry());
        processorSystemEClass.getESuperTypes().add(this.getProcessorEntry());
        processorGroupEClass.getESuperTypes().add(this.getProcessorEntry());
        processorAlternativeGroupEClass.getESuperTypes().add(this.getProcessorGroup());
        intermediateReferenceEClass.getESuperTypes().add(this.getProcessorReference());

        // Initialize classes, features, and operations; add parameters
        initEClass(systemEClass, de.cau.cs.kieler.kicool.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSystem_Id(), ecorePackage.getEString(), "id", null, 0, 1, de.cau.cs.kieler.kicool.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSystem_Version(), ecorePackage.getEInt(), "version", null, 0, 1, de.cau.cs.kieler.kicool.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSystem_Label(), ecorePackage.getEString(), "label", null, 0, 1, de.cau.cs.kieler.kicool.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystem_Processors(), this.getProcessorEntry(), null, "processors", null, 0, 1, de.cau.cs.kieler.kicool.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystem_Intermediates(), this.getIntermediateReference(), null, "intermediates", null, 0, -1, de.cau.cs.kieler.kicool.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSystem_InputClass(), ecorePackage.getEString(), "inputClass", null, 0, 1, de.cau.cs.kieler.kicool.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processorEntryEClass, ProcessorEntry.class, "ProcessorEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProcessorEntry_Id(), ecorePackage.getEString(), "id", null, 0, 1, ProcessorEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processorReferenceEClass, ProcessorReference.class, "ProcessorReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProcessorReference_Presets(), this.getKVPair(), null, "presets", null, 0, -1, ProcessorReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcessorReference_Postsets(), this.getKVPair(), null, "postsets", null, 0, -1, ProcessorReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcessorReference_Metric(), this.getIntermediateReference(), null, "metric", null, 0, 1, ProcessorReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processorSystemEClass, ProcessorSystem.class, "ProcessorSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(processorGroupEClass, ProcessorGroup.class, "ProcessorGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProcessorGroup_Processors(), this.getProcessorEntry(), null, "processors", null, 0, -1, ProcessorGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessorGroup_Label(), ecorePackage.getEString(), "label", null, 0, 1, ProcessorGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processorAlternativeGroupEClass, ProcessorAlternativeGroup.class, "ProcessorAlternativeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(intermediateReferenceEClass, IntermediateReference.class, "IntermediateReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntermediateReference_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, IntermediateReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(kvPairEClass, KVPair.class, "KVPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getKVPair_Key(), ecorePackage.getEString(), "key", null, 0, 1, KVPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKVPair_Value(), ecorePackage.getEString(), "value", null, 0, 1, KVPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKVPair_IsKeyValue(), ecorePackage.getEBoolean(), "isKeyValue", null, 0, 1, KVPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //KiCoolPackageImpl
