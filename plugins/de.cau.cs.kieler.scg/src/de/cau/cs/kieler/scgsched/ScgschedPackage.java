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
     * The feature id for the '<em><b>Schedule Exists</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_GRAPH_SCHED__SCHEDULE_EXISTS = ScgbbPackage.SC_GRAPH_BB_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Schedules</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_GRAPH_SCHED__SCHEDULES = ScgbbPackage.SC_GRAPH_BB_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>SC Graph Sched</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_GRAPH_SCHED_FEATURE_COUNT = ScgbbPackage.SC_GRAPH_BB_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>SC Graph Sched</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_GRAPH_SCHED_OPERATION_COUNT = ScgbbPackage.SC_GRAPH_BB_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgsched.impl.ScheduleImpl <em>Schedule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgsched.impl.ScheduleImpl
     * @see de.cau.cs.kieler.scgsched.impl.ScgschedPackageImpl#getSchedule()
     * @generated
     */
    int SCHEDULE = 1;

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
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgsched.SCGraphSched <em>SC Graph Sched</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SC Graph Sched</em>'.
     * @see de.cau.cs.kieler.scgsched.SCGraphSched
     * @generated
     */
    EClass getSCGraphSched();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgsched.SCGraphSched#isScheduleExists <em>Schedule Exists</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schedule Exists</em>'.
     * @see de.cau.cs.kieler.scgsched.SCGraphSched#isScheduleExists()
     * @see #getSCGraphSched()
     * @generated
     */
    EAttribute getSCGraphSched_ScheduleExists();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scgsched.SCGraphSched#getSchedules <em>Schedules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Schedules</em>'.
     * @see de.cau.cs.kieler.scgsched.SCGraphSched#getSchedules()
     * @see #getSCGraphSched()
     * @generated
     */
    EReference getSCGraphSched_Schedules();

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
         * The meta object literal for the '<em><b>Schedule Exists</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SC_GRAPH_SCHED__SCHEDULE_EXISTS = eINSTANCE.getSCGraphSched_ScheduleExists();

        /**
         * The meta object literal for the '<em><b>Schedules</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SC_GRAPH_SCHED__SCHEDULES = eINSTANCE.getSCGraphSched_Schedules();

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

    }

} //ScgschedPackage
