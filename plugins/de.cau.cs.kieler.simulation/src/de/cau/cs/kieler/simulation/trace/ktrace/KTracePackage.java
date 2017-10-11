/**
 */
package de.cau.cs.kieler.simulation.trace.ktrace;

import de.cau.cs.kieler.annotations.AnnotationsPackage;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.simulation.trace.ktrace.KTraceFactory
 * @model kind="package"
 * @generated
 */
public interface KTracePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "ktrace";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://kieler.cs.cau.de/simulation/ktrace";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "ktrace";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    KTracePackage eINSTANCE = de.cau.cs.kieler.simulation.trace.ktrace.impl.KTracePackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simulation.trace.ktrace.impl.TraceFileImpl <em>Trace File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simulation.trace.ktrace.impl.TraceFileImpl
     * @see de.cau.cs.kieler.simulation.trace.ktrace.impl.KTracePackageImpl#getTraceFile()
     * @generated
     */
    int TRACE_FILE = 0;

    /**
     * The feature id for the '<em><b>Pragmas</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRACE_FILE__PRAGMAS = AnnotationsPackage.PRAGMATABLE__PRAGMAS;

    /**
     * The feature id for the '<em><b>Traces</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRACE_FILE__TRACES = AnnotationsPackage.PRAGMATABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Aggregated Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRACE_FILE__AGGREGATED_VALUED_OBJECTS = AnnotationsPackage.PRAGMATABLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Trace File</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRACE_FILE_FEATURE_COUNT = AnnotationsPackage.PRAGMATABLE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simulation.trace.ktrace.impl.TraceImpl <em>Trace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simulation.trace.ktrace.impl.TraceImpl
     * @see de.cau.cs.kieler.simulation.trace.ktrace.impl.KTracePackageImpl#getTrace()
     * @generated
     */
    int TRACE = 1;

    /**
     * The feature id for the '<em><b>Pragmas</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRACE__PRAGMAS = AnnotationsPackage.PRAGMATABLE__PRAGMAS;

    /**
     * The feature id for the '<em><b>Ticks</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRACE__TICKS = AnnotationsPackage.PRAGMATABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Trace</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRACE_FEATURE_COUNT = AnnotationsPackage.PRAGMATABLE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simulation.trace.ktrace.impl.TickImpl <em>Tick</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simulation.trace.ktrace.impl.TickImpl
     * @see de.cau.cs.kieler.simulation.trace.ktrace.impl.KTracePackageImpl#getTick()
     * @generated
     */
    int TICK = 2;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TICK__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TICK__INPUTS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TICK__OUTPUTS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Tick</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TICK_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.simulation.trace.ktrace.TraceFile <em>Trace File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Trace File</em>'.
     * @see de.cau.cs.kieler.simulation.trace.ktrace.TraceFile
     * @generated
     */
    EClass getTraceFile();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.simulation.trace.ktrace.TraceFile#getTraces <em>Traces</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Traces</em>'.
     * @see de.cau.cs.kieler.simulation.trace.ktrace.TraceFile#getTraces()
     * @see #getTraceFile()
     * @generated
     */
    EReference getTraceFile_Traces();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.simulation.trace.ktrace.TraceFile#getAggregatedValuedObjects <em>Aggregated Valued Objects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Aggregated Valued Objects</em>'.
     * @see de.cau.cs.kieler.simulation.trace.ktrace.TraceFile#getAggregatedValuedObjects()
     * @see #getTraceFile()
     * @generated
     */
    EReference getTraceFile_AggregatedValuedObjects();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.simulation.trace.ktrace.Trace <em>Trace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Trace</em>'.
     * @see de.cau.cs.kieler.simulation.trace.ktrace.Trace
     * @generated
     */
    EClass getTrace();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.simulation.trace.ktrace.Trace#getTicks <em>Ticks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Ticks</em>'.
     * @see de.cau.cs.kieler.simulation.trace.ktrace.Trace#getTicks()
     * @see #getTrace()
     * @generated
     */
    EReference getTrace_Ticks();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.simulation.trace.ktrace.Tick <em>Tick</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Tick</em>'.
     * @see de.cau.cs.kieler.simulation.trace.ktrace.Tick
     * @generated
     */
    EClass getTick();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.simulation.trace.ktrace.Tick#getInputs <em>Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Inputs</em>'.
     * @see de.cau.cs.kieler.simulation.trace.ktrace.Tick#getInputs()
     * @see #getTick()
     * @generated
     */
    EReference getTick_Inputs();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.simulation.trace.ktrace.Tick#getOutputs <em>Outputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Outputs</em>'.
     * @see de.cau.cs.kieler.simulation.trace.ktrace.Tick#getOutputs()
     * @see #getTick()
     * @generated
     */
    EReference getTick_Outputs();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    KTraceFactory getKTraceFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simulation.trace.ktrace.impl.TraceFileImpl <em>Trace File</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simulation.trace.ktrace.impl.TraceFileImpl
         * @see de.cau.cs.kieler.simulation.trace.ktrace.impl.KTracePackageImpl#getTraceFile()
         * @generated
         */
        EClass TRACE_FILE = eINSTANCE.getTraceFile();

        /**
         * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRACE_FILE__TRACES = eINSTANCE.getTraceFile_Traces();

        /**
         * The meta object literal for the '<em><b>Aggregated Valued Objects</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRACE_FILE__AGGREGATED_VALUED_OBJECTS = eINSTANCE.getTraceFile_AggregatedValuedObjects();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simulation.trace.ktrace.impl.TraceImpl <em>Trace</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simulation.trace.ktrace.impl.TraceImpl
         * @see de.cau.cs.kieler.simulation.trace.ktrace.impl.KTracePackageImpl#getTrace()
         * @generated
         */
        EClass TRACE = eINSTANCE.getTrace();

        /**
         * The meta object literal for the '<em><b>Ticks</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRACE__TICKS = eINSTANCE.getTrace_Ticks();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simulation.trace.ktrace.impl.TickImpl <em>Tick</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simulation.trace.ktrace.impl.TickImpl
         * @see de.cau.cs.kieler.simulation.trace.ktrace.impl.KTracePackageImpl#getTick()
         * @generated
         */
        EClass TICK = eINSTANCE.getTick();

        /**
         * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TICK__INPUTS = eINSTANCE.getTick_Inputs();

        /**
         * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TICK__OUTPUTS = eINSTANCE.getTick_Outputs();

    }

} //KTracePackage
