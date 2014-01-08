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
package de.cau.cs.kieler.scgsched;

import de.cau.cs.kieler.scgbb.ScgbbPackage;
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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.scgsched.ScgschedFactory
 * @model kind="package"
 * @generated
 */
public interface ScgschedPackage extends EPackage {
    /**
	 * The package name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "scgsched";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "http://kieler.cs.cau.de/scgsched/0.1.0";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "scgsched";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    ScgschedPackage eINSTANCE = de.cau.cs.kieler.scgsched.impl.ScgschedPackageImpl.init();

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scgsched.impl.SCGraphSchedImpl <em>SC Graph Sched</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scgsched.impl.SCGraphSchedImpl
	 * @see de.cau.cs.kieler.scgsched.impl.ScgschedPackageImpl#getSCGraphSched()
	 * @generated
	 */
    int SC_GRAPH_SCHED = 0;

    /**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_SCHED__NODES = ScgbbPackage.SC_GRAPH_BB__NODES;

    /**
	 * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_SCHED__VALUED_OBJECTS = ScgbbPackage.SC_GRAPH_BB__VALUED_OBJECTS;

    /**
	 * The feature id for the '<em><b>Basic Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_SCHED__BASIC_BLOCKS = ScgbbPackage.SC_GRAPH_BB__BASIC_BLOCKS;

    /**
	 * The feature id for the '<em><b>Unschedulable</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_SCHED__UNSCHEDULABLE = ScgbbPackage.SC_GRAPH_BB_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Schedules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_SCHED__SCHEDULES = ScgbbPackage.SC_GRAPH_BB_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_GRAPH_SCHED__GUARDS = ScgbbPackage.SC_GRAPH_BB_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Analyses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_GRAPH_SCHED__ANALYSES = ScgbbPackage.SC_GRAPH_BB_FEATURE_COUNT + 3;

				/**
	 * The number of structural features of the '<em>SC Graph Sched</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_SCHED_FEATURE_COUNT = ScgbbPackage.SC_GRAPH_BB_FEATURE_COUNT + 4;

    /**
	 * The number of operations of the '<em>SC Graph Sched</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_SCHED_OPERATION_COUNT = ScgbbPackage.SC_GRAPH_BB_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scgsched.impl.EmptyExpressionsImpl <em>Empty Expressions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scgsched.impl.EmptyExpressionsImpl
	 * @see de.cau.cs.kieler.scgsched.impl.ScgschedPackageImpl#getEmptyExpressions()
	 * @generated
	 */
	int EMPTY_EXPRESSIONS = 1;

				/**
	 * The feature id for the '<em><b>Valued Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_EXPRESSIONS__VALUED_OBJECT = 0;

				/**
	 * The feature id for the '<em><b>Thread Exit Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_EXPRESSIONS__THREAD_EXIT_OBJECT = 1;

				/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_EXPRESSIONS__EXPRESSION = 2;

				/**
	 * The number of structural features of the '<em>Empty Expressions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_EXPRESSIONS_FEATURE_COUNT = 3;

				/**
	 * The number of operations of the '<em>Empty Expressions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_EXPRESSIONS_OPERATION_COUNT = 0;

				/**
	 * The meta object id for the '{@link de.cau.cs.kieler.scgsched.impl.GuardExpressionImpl <em>Guard Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scgsched.impl.GuardExpressionImpl
	 * @see de.cau.cs.kieler.scgsched.impl.ScgschedPackageImpl#getGuardExpression()
	 * @generated
	 */
	int GUARD_EXPRESSION = 2;

				/**
	 * The feature id for the '<em><b>Valued Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_EXPRESSION__VALUED_OBJECT = 0;

				/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_EXPRESSION__EXPRESSION = 1;

				/**
	 * The feature id for the '<em><b>Empty Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_EXPRESSION__EMPTY_EXPRESSIONS = 2;

				/**
	 * The number of structural features of the '<em>Guard Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_EXPRESSION_FEATURE_COUNT = 3;

				/**
	 * The number of operations of the '<em>Guard Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_EXPRESSION_OPERATION_COUNT = 0;

				/**
	 * The meta object id for the '{@link de.cau.cs.kieler.scgsched.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scgsched.impl.ScheduleImpl
	 * @see de.cau.cs.kieler.scgsched.impl.ScgschedPackageImpl#getSchedule()
	 * @generated
	 */
    int SCHEDULE = 3;

    /**
	 * The feature id for the '<em><b>Scheduling Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCHEDULE__SCHEDULING_BLOCKS = 0;

    /**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCHEDULE_FEATURE_COUNT = 1;

    /**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCHEDULE_OPERATION_COUNT = 0;


    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scgsched.impl.AnalysisImpl <em>Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scgsched.impl.AnalysisImpl
	 * @see de.cau.cs.kieler.scgsched.impl.ScgschedPackageImpl#getAnalysis()
	 * @generated
	 */
	int ANALYSIS = 4;

				/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__ID = 0;

				/**
	 * The feature id for the '<em><b>Object References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__OBJECT_REFERENCES = 1;

				/**
	 * The number of structural features of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FEATURE_COUNT = 2;

				/**
	 * The number of operations of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION_COUNT = 0;

				/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scgsched.SCGraphSched <em>SC Graph Sched</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SC Graph Sched</em>'.
	 * @see de.cau.cs.kieler.scgsched.SCGraphSched
	 * @generated
	 */
    EClass getSCGraphSched();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgsched.SCGraphSched#isUnschedulable <em>Unschedulable</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unschedulable</em>'.
	 * @see de.cau.cs.kieler.scgsched.SCGraphSched#isUnschedulable()
	 * @see #getSCGraphSched()
	 * @generated
	 */
    EAttribute getSCGraphSched_Unschedulable();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgsched.SCGraphSched#getSchedules <em>Schedules</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schedules</em>'.
	 * @see de.cau.cs.kieler.scgsched.SCGraphSched#getSchedules()
	 * @see #getSCGraphSched()
	 * @generated
	 */
    EReference getSCGraphSched_Schedules();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgsched.SCGraphSched#getGuards <em>Guards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guards</em>'.
	 * @see de.cau.cs.kieler.scgsched.SCGraphSched#getGuards()
	 * @see #getSCGraphSched()
	 * @generated
	 */
	EReference getSCGraphSched_Guards();

				/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgsched.SCGraphSched#getAnalyses <em>Analyses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analyses</em>'.
	 * @see de.cau.cs.kieler.scgsched.SCGraphSched#getAnalyses()
	 * @see #getSCGraphSched()
	 * @generated
	 */
	EReference getSCGraphSched_Analyses();

				/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scgsched.EmptyExpressions <em>Empty Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Expressions</em>'.
	 * @see de.cau.cs.kieler.scgsched.EmptyExpressions
	 * @generated
	 */
	EClass getEmptyExpressions();

				/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgsched.EmptyExpressions#getValuedObject <em>Valued Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valued Object</em>'.
	 * @see de.cau.cs.kieler.scgsched.EmptyExpressions#getValuedObject()
	 * @see #getEmptyExpressions()
	 * @generated
	 */
	EReference getEmptyExpressions_ValuedObject();

				/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgsched.EmptyExpressions#getThreadExitObject <em>Thread Exit Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thread Exit Object</em>'.
	 * @see de.cau.cs.kieler.scgsched.EmptyExpressions#getThreadExitObject()
	 * @see #getEmptyExpressions()
	 * @generated
	 */
	EReference getEmptyExpressions_ThreadExitObject();

				/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scgsched.EmptyExpressions#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see de.cau.cs.kieler.scgsched.EmptyExpressions#getExpression()
	 * @see #getEmptyExpressions()
	 * @generated
	 */
	EReference getEmptyExpressions_Expression();

				/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scgsched.GuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard Expression</em>'.
	 * @see de.cau.cs.kieler.scgsched.GuardExpression
	 * @generated
	 */
	EClass getGuardExpression();

				/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgsched.GuardExpression#getValuedObject <em>Valued Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valued Object</em>'.
	 * @see de.cau.cs.kieler.scgsched.GuardExpression#getValuedObject()
	 * @see #getGuardExpression()
	 * @generated
	 */
	EReference getGuardExpression_ValuedObject();

				/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scgsched.GuardExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see de.cau.cs.kieler.scgsched.GuardExpression#getExpression()
	 * @see #getGuardExpression()
	 * @generated
	 */
	EReference getGuardExpression_Expression();

				/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgsched.GuardExpression#getEmptyExpressions <em>Empty Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Empty Expressions</em>'.
	 * @see de.cau.cs.kieler.scgsched.GuardExpression#getEmptyExpressions()
	 * @see #getGuardExpression()
	 * @generated
	 */
	EReference getGuardExpression_EmptyExpressions();

				/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scgsched.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see de.cau.cs.kieler.scgsched.Schedule
	 * @generated
	 */
    EClass getSchedule();

    /**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scgsched.Schedule#getSchedulingBlocks <em>Scheduling Blocks</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scheduling Blocks</em>'.
	 * @see de.cau.cs.kieler.scgsched.Schedule#getSchedulingBlocks()
	 * @see #getSchedule()
	 * @generated
	 */
    EReference getSchedule_SchedulingBlocks();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scgsched.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis</em>'.
	 * @see de.cau.cs.kieler.scgsched.Analysis
	 * @generated
	 */
	EClass getAnalysis();

				/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgsched.Analysis#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.cau.cs.kieler.scgsched.Analysis#getId()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_Id();

				/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scgsched.Analysis#getObjectReferences <em>Object References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object References</em>'.
	 * @see de.cau.cs.kieler.scgsched.Analysis#getObjectReferences()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_ObjectReferences();

				/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    ScgschedFactory getScgschedFactory();

    /**
	 * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
	 * @generated
	 */
    interface Literals {
        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scgsched.impl.SCGraphSchedImpl <em>SC Graph Sched</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scgsched.impl.SCGraphSchedImpl
		 * @see de.cau.cs.kieler.scgsched.impl.ScgschedPackageImpl#getSCGraphSched()
		 * @generated
		 */
        EClass SC_GRAPH_SCHED = eINSTANCE.getSCGraphSched();

        /**
		 * The meta object literal for the '<em><b>Unschedulable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SC_GRAPH_SCHED__UNSCHEDULABLE = eINSTANCE.getSCGraphSched_Unschedulable();

        /**
		 * The meta object literal for the '<em><b>Schedules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SC_GRAPH_SCHED__SCHEDULES = eINSTANCE.getSCGraphSched_Schedules();

        /**
		 * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_GRAPH_SCHED__GUARDS = eINSTANCE.getSCGraphSched_Guards();

								/**
		 * The meta object literal for the '<em><b>Analyses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_GRAPH_SCHED__ANALYSES = eINSTANCE.getSCGraphSched_Analyses();

								/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scgsched.impl.EmptyExpressionsImpl <em>Empty Expressions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scgsched.impl.EmptyExpressionsImpl
		 * @see de.cau.cs.kieler.scgsched.impl.ScgschedPackageImpl#getEmptyExpressions()
		 * @generated
		 */
		EClass EMPTY_EXPRESSIONS = eINSTANCE.getEmptyExpressions();

								/**
		 * The meta object literal for the '<em><b>Valued Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPTY_EXPRESSIONS__VALUED_OBJECT = eINSTANCE.getEmptyExpressions_ValuedObject();

								/**
		 * The meta object literal for the '<em><b>Thread Exit Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPTY_EXPRESSIONS__THREAD_EXIT_OBJECT = eINSTANCE.getEmptyExpressions_ThreadExitObject();

								/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPTY_EXPRESSIONS__EXPRESSION = eINSTANCE.getEmptyExpressions_Expression();

								/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scgsched.impl.GuardExpressionImpl <em>Guard Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scgsched.impl.GuardExpressionImpl
		 * @see de.cau.cs.kieler.scgsched.impl.ScgschedPackageImpl#getGuardExpression()
		 * @generated
		 */
		EClass GUARD_EXPRESSION = eINSTANCE.getGuardExpression();

								/**
		 * The meta object literal for the '<em><b>Valued Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD_EXPRESSION__VALUED_OBJECT = eINSTANCE.getGuardExpression_ValuedObject();

								/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD_EXPRESSION__EXPRESSION = eINSTANCE.getGuardExpression_Expression();

								/**
		 * The meta object literal for the '<em><b>Empty Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD_EXPRESSION__EMPTY_EXPRESSIONS = eINSTANCE.getGuardExpression_EmptyExpressions();

								/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scgsched.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scgsched.impl.ScheduleImpl
		 * @see de.cau.cs.kieler.scgsched.impl.ScgschedPackageImpl#getSchedule()
		 * @generated
		 */
        EClass SCHEDULE = eINSTANCE.getSchedule();

        /**
		 * The meta object literal for the '<em><b>Scheduling Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SCHEDULE__SCHEDULING_BLOCKS = eINSTANCE.getSchedule_SchedulingBlocks();

								/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scgsched.impl.AnalysisImpl <em>Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scgsched.impl.AnalysisImpl
		 * @see de.cau.cs.kieler.scgsched.impl.ScgschedPackageImpl#getAnalysis()
		 * @generated
		 */
		EClass ANALYSIS = eINSTANCE.getAnalysis();

								/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__ID = eINSTANCE.getAnalysis_Id();

								/**
		 * The meta object literal for the '<em><b>Object References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__OBJECT_REFERENCES = eINSTANCE.getAnalysis_ObjectReferences();

    }

} //ScgschedPackage
