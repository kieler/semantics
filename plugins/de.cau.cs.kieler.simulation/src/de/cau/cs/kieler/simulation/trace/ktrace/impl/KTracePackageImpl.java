/**
 */
package de.cau.cs.kieler.simulation.trace.ktrace.impl;

import de.cau.cs.kieler.annotations.AnnotationsPackage;

import de.cau.cs.kieler.kexpressions.KExpressionsPackage;

import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;

import de.cau.cs.kieler.kexpressions.kext.KExtPackage;

import de.cau.cs.kieler.simulation.trace.ktrace.KTraceFactory;
import de.cau.cs.kieler.simulation.trace.ktrace.KTracePackage;
import de.cau.cs.kieler.simulation.trace.ktrace.Tick;
import de.cau.cs.kieler.simulation.trace.ktrace.Trace;
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile;

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
public class KTracePackageImpl extends EPackageImpl implements KTracePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass traceFileEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass traceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tickEClass = null;

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
     * @see de.cau.cs.kieler.simulation.trace.ktrace.KTracePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private KTracePackageImpl() {
        super(eNS_URI, KTraceFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link KTracePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static KTracePackage init() {
        if (isInited) return (KTracePackage)EPackage.Registry.INSTANCE.getEPackage(KTracePackage.eNS_URI);

        // Obtain or create and register package
        KTracePackageImpl theKTracePackage = (KTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KTracePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        AnnotationsPackage.eINSTANCE.eClass();
        KEffectsPackage.eINSTANCE.eClass();
        KExpressionsPackage.eINSTANCE.eClass();
        KExtPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theKTracePackage.createPackageContents();

        // Initialize created meta-data
        theKTracePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theKTracePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(KTracePackage.eNS_URI, theKTracePackage);
        return theKTracePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTraceFile() {
        return traceFileEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTraceFile_Traces() {
        return (EReference)traceFileEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTraceFile_AggregatedValuedObjects() {
        return (EReference)traceFileEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTrace() {
        return traceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTrace_Ticks() {
        return (EReference)traceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTick() {
        return tickEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTick_Inputs() {
        return (EReference)tickEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTick_Outputs() {
        return (EReference)tickEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KTraceFactory getKTraceFactory() {
        return (KTraceFactory)getEFactoryInstance();
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
        traceFileEClass = createEClass(TRACE_FILE);
        createEReference(traceFileEClass, TRACE_FILE__TRACES);
        createEReference(traceFileEClass, TRACE_FILE__AGGREGATED_VALUED_OBJECTS);

        traceEClass = createEClass(TRACE);
        createEReference(traceEClass, TRACE__TICKS);

        tickEClass = createEClass(TICK);
        createEReference(tickEClass, TICK__INPUTS);
        createEReference(tickEClass, TICK__OUTPUTS);
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
        KEffectsPackage theKEffectsPackage = (KEffectsPackage)EPackage.Registry.INSTANCE.getEPackage(KEffectsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        traceFileEClass.getESuperTypes().add(theAnnotationsPackage.getPragmatable());
        traceEClass.getESuperTypes().add(theAnnotationsPackage.getPragmatable());
        tickEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());

        // Initialize classes and features; add operations and parameters
        initEClass(traceFileEClass, TraceFile.class, "TraceFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTraceFile_Traces(), this.getTrace(), null, "traces", null, 0, -1, TraceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTraceFile_AggregatedValuedObjects(), theKExpressionsPackage.getValuedObject(), null, "aggregatedValuedObjects", null, 0, -1, TraceFile.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTrace_Ticks(), this.getTick(), null, "ticks", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tickEClass, Tick.class, "Tick", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTick_Inputs(), theKEffectsPackage.getEffect(), null, "inputs", null, 0, -1, Tick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTick_Outputs(), theKEffectsPackage.getEffect(), null, "outputs", null, 0, -1, Tick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //KTracePackageImpl
