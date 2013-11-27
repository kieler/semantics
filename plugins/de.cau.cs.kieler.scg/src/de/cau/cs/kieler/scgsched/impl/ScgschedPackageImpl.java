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
package de.cau.cs.kieler.scgsched.impl;

import de.cau.cs.kieler.scgbb.ScgbbPackage;

import de.cau.cs.kieler.scgsched.SCGraphSched;
import de.cau.cs.kieler.scgsched.ScgschedFactory;
import de.cau.cs.kieler.scgsched.ScgschedPackage;
import de.cau.cs.kieler.scgsched.Schedule;

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
public class ScgschedPackageImpl extends EPackageImpl implements ScgschedPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scGraphSchedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scheduleEClass = null;

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
     * @see de.cau.cs.kieler.scgsched.ScgschedPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ScgschedPackageImpl() {
        super(eNS_URI, ScgschedFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ScgschedPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ScgschedPackage init() {
        if (isInited) return (ScgschedPackage)EPackage.Registry.INSTANCE.getEPackage(ScgschedPackage.eNS_URI);

        // Obtain or create and register package
        ScgschedPackageImpl theScgschedPackage = (ScgschedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScgschedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScgschedPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ScgbbPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theScgschedPackage.createPackageContents();

        // Initialize created meta-data
        theScgschedPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theScgschedPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ScgschedPackage.eNS_URI, theScgschedPackage);
        return theScgschedPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSCGraphSched() {
        return scGraphSchedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSCGraphSched_Unschedulable() {
        return (EAttribute)scGraphSchedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSCGraphSched_Schedules() {
        return (EReference)scGraphSchedEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSchedule() {
        return scheduleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchedule_SchedulingBlocks() {
        return (EReference)scheduleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScgschedFactory getScgschedFactory() {
        return (ScgschedFactory)getEFactoryInstance();
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
        scGraphSchedEClass = createEClass(SC_GRAPH_SCHED);
        createEAttribute(scGraphSchedEClass, SC_GRAPH_SCHED__UNSCHEDULABLE);
        createEReference(scGraphSchedEClass, SC_GRAPH_SCHED__SCHEDULES);

        scheduleEClass = createEClass(SCHEDULE);
        createEReference(scheduleEClass, SCHEDULE__SCHEDULING_BLOCKS);
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
        ScgbbPackage theScgbbPackage = (ScgbbPackage)EPackage.Registry.INSTANCE.getEPackage(ScgbbPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        scGraphSchedEClass.getESuperTypes().add(theScgbbPackage.getSCGraphBB());

        // Initialize classes, features, and operations; add parameters
        initEClass(scGraphSchedEClass, SCGraphSched.class, "SCGraphSched", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSCGraphSched_Unschedulable(), ecorePackage.getEBoolean(), "unschedulable", null, 0, 1, SCGraphSched.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSCGraphSched_Schedules(), this.getSchedule(), null, "schedules", null, 0, -1, SCGraphSched.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSchedule_SchedulingBlocks(), theScgbbPackage.getSchedulingBlock(), null, "schedulingBlocks", null, 0, -1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //ScgschedPackageImpl
