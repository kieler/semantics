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

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.scg.ScgPackage;
import de.cau.cs.kieler.scgbb.ScgbbPackage;
import de.cau.cs.kieler.scgsched.Alteration;
import de.cau.cs.kieler.scgsched.Analysis;
import de.cau.cs.kieler.scgsched.AssignmentAddition;
import de.cau.cs.kieler.scgsched.ConditionalAddition;
import de.cau.cs.kieler.scgsched.EmptyExpression;
import de.cau.cs.kieler.scgsched.GuardExpression;
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
    private EClass emptyExpressionEClass = null;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardExpressionEClass = null;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass scheduleEClass = null;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisEClass = null;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alterationEClass = null;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentAdditionEClass = null;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalAdditionEClass = null;

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
	public EReference getSCGraphSched_Guards() {
		return (EReference)scGraphSchedEClass.getEStructuralFeatures().get(2);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSCGraphSched_Analyses() {
		return (EReference)scGraphSchedEClass.getEStructuralFeatures().get(3);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSCGraphSched_Alterations() {
		return (EReference)scGraphSchedEClass.getEStructuralFeatures().get(4);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getEmptyExpression() {
		return emptyExpressionEClass;
	}

                /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEmptyExpression_ValuedObject() {
		return (EReference)emptyExpressionEClass.getEStructuralFeatures().get(0);
	}

                /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEmptyExpression_ThreadExitObject() {
		return (EReference)emptyExpressionEClass.getEStructuralFeatures().get(1);
	}

                /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEmptyExpression_Expression() {
		return (EReference)emptyExpressionEClass.getEStructuralFeatures().get(2);
	}

                /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuardExpression() {
		return guardExpressionEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardExpression_ValuedObject() {
		return (EReference)guardExpressionEClass.getEStructuralFeatures().get(0);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardExpression_Expression() {
		return (EReference)guardExpressionEClass.getEStructuralFeatures().get(1);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardExpression_EmptyExpressions() {
		return (EReference)guardExpressionEClass.getEStructuralFeatures().get(2);
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
	public EClass getAnalysis() {
		return analysisEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysis_Id() {
		return (EAttribute)analysisEClass.getEStructuralFeatures().get(0);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysis_ObjectReferences() {
		return (EReference)analysisEClass.getEStructuralFeatures().get(1);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlteration() {
		return alterationEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentAddition() {
		return assignmentAdditionEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentAddition_Position() {
		return (EReference)assignmentAdditionEClass.getEStructuralFeatures().get(0);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentAddition_ValuedObject() {
		return (EReference)assignmentAdditionEClass.getEStructuralFeatures().get(1);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentAddition_Expression() {
		return (EReference)assignmentAdditionEClass.getEStructuralFeatures().get(2);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalAddition() {
		return conditionalAdditionEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalAddition_BeforeNode() {
		return (EReference)conditionalAdditionEClass.getEStructuralFeatures().get(0);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalAddition_UntilNode() {
		return (EReference)conditionalAdditionEClass.getEStructuralFeatures().get(1);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalAddition_Condition() {
		return (EReference)conditionalAdditionEClass.getEStructuralFeatures().get(2);
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
		createEReference(scGraphSchedEClass, SC_GRAPH_SCHED__GUARDS);
		createEReference(scGraphSchedEClass, SC_GRAPH_SCHED__ANALYSES);
		createEReference(scGraphSchedEClass, SC_GRAPH_SCHED__ALTERATIONS);

		emptyExpressionEClass = createEClass(EMPTY_EXPRESSION);
		createEReference(emptyExpressionEClass, EMPTY_EXPRESSION__VALUED_OBJECT);
		createEReference(emptyExpressionEClass, EMPTY_EXPRESSION__THREAD_EXIT_OBJECT);
		createEReference(emptyExpressionEClass, EMPTY_EXPRESSION__EXPRESSION);

		guardExpressionEClass = createEClass(GUARD_EXPRESSION);
		createEReference(guardExpressionEClass, GUARD_EXPRESSION__VALUED_OBJECT);
		createEReference(guardExpressionEClass, GUARD_EXPRESSION__EXPRESSION);
		createEReference(guardExpressionEClass, GUARD_EXPRESSION__EMPTY_EXPRESSIONS);

		scheduleEClass = createEClass(SCHEDULE);
		createEReference(scheduleEClass, SCHEDULE__SCHEDULING_BLOCKS);

		analysisEClass = createEClass(ANALYSIS);
		createEAttribute(analysisEClass, ANALYSIS__ID);
		createEReference(analysisEClass, ANALYSIS__OBJECT_REFERENCES);

		alterationEClass = createEClass(ALTERATION);

		assignmentAdditionEClass = createEClass(ASSIGNMENT_ADDITION);
		createEReference(assignmentAdditionEClass, ASSIGNMENT_ADDITION__POSITION);
		createEReference(assignmentAdditionEClass, ASSIGNMENT_ADDITION__VALUED_OBJECT);
		createEReference(assignmentAdditionEClass, ASSIGNMENT_ADDITION__EXPRESSION);

		conditionalAdditionEClass = createEClass(CONDITIONAL_ADDITION);
		createEReference(conditionalAdditionEClass, CONDITIONAL_ADDITION__BEFORE_NODE);
		createEReference(conditionalAdditionEClass, CONDITIONAL_ADDITION__UNTIL_NODE);
		createEReference(conditionalAdditionEClass, CONDITIONAL_ADDITION__CONDITION);
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
		KExpressionsPackage theKExpressionsPackage = (KExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(KExpressionsPackage.eNS_URI);
		ScgPackage theScgPackage = (ScgPackage)EPackage.Registry.INSTANCE.getEPackage(ScgPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scGraphSchedEClass.getESuperTypes().add(theScgbbPackage.getSCGraphBB());
		assignmentAdditionEClass.getESuperTypes().add(this.getAlteration());
		conditionalAdditionEClass.getESuperTypes().add(this.getAlteration());

		// Initialize classes, features, and operations; add parameters
		initEClass(scGraphSchedEClass, SCGraphSched.class, "SCGraphSched", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSCGraphSched_Unschedulable(), ecorePackage.getEBoolean(), "unschedulable", null, 0, 1, SCGraphSched.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCGraphSched_Schedules(), this.getSchedule(), null, "schedules", null, 0, -1, SCGraphSched.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCGraphSched_Guards(), this.getGuardExpression(), null, "guards", null, 0, -1, SCGraphSched.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCGraphSched_Analyses(), this.getAnalysis(), null, "analyses", null, 0, -1, SCGraphSched.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCGraphSched_Alterations(), this.getAlteration(), null, "alterations", null, 0, -1, SCGraphSched.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emptyExpressionEClass, EmptyExpression.class, "EmptyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmptyExpression_ValuedObject(), theKExpressionsPackage.getValuedObject(), null, "valuedObject", null, 1, 1, EmptyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmptyExpression_ThreadExitObject(), theKExpressionsPackage.getValuedObject(), null, "threadExitObject", null, 1, 1, EmptyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmptyExpression_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 1, 1, EmptyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guardExpressionEClass, GuardExpression.class, "GuardExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuardExpression_ValuedObject(), theKExpressionsPackage.getValuedObject(), null, "valuedObject", null, 1, 1, GuardExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuardExpression_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 1, 1, GuardExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuardExpression_EmptyExpressions(), this.getEmptyExpression(), null, "emptyExpressions", null, 0, -1, GuardExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedule_SchedulingBlocks(), theScgbbPackage.getSchedulingBlock(), null, "schedulingBlocks", null, 0, -1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisEClass, Analysis.class, "Analysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalysis_Id(), ecorePackage.getEString(), "id", null, 0, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysis_ObjectReferences(), ecorePackage.getEObject(), null, "objectReferences", null, 0, -1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alterationEClass, Alteration.class, "Alteration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignmentAdditionEClass, AssignmentAddition.class, "AssignmentAddition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignmentAddition_Position(), theScgPackage.getNode(), null, "position", null, 1, 1, AssignmentAddition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignmentAddition_ValuedObject(), theKExpressionsPackage.getValuedObject(), null, "valuedObject", null, 1, 1, AssignmentAddition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignmentAddition_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 1, 1, AssignmentAddition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalAdditionEClass, ConditionalAddition.class, "ConditionalAddition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalAddition_BeforeNode(), theScgPackage.getNode(), null, "beforeNode", null, 1, 1, ConditionalAddition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalAddition_UntilNode(), theScgPackage.getNode(), null, "untilNode", null, 1, 1, ConditionalAddition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalAddition_Condition(), theKExpressionsPackage.getExpression(), null, "condition", null, 1, 1, ConditionalAddition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ScgschedPackageImpl
