/**
 */
package de.cau.cs.kieler.kicool;

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
 * @see de.cau.cs.kieler.kicool.KiCoolFactory
 * @model kind="package"
 * @generated
 */
public interface KiCoolPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "kicool";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://kieler.cs.cau.de/kicool/0.1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "kicool";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    KiCoolPackage eINSTANCE = de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kicool.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kicool.impl.SystemImpl
     * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getSystem()
     * @generated
     */
    int SYSTEM = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__ID = 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__VERSION = 1;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__LABEL = 2;

    /**
     * The feature id for the '<em><b>Processors</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__PROCESSORS = 3;

    /**
     * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__METRICS = 4;

    /**
     * The feature id for the '<em><b>Input Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__INPUT_CLASS = 5;

    /**
     * The number of structural features of the '<em>System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kicool.impl.ProcessorEntryImpl <em>Processor Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kicool.impl.ProcessorEntryImpl
     * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getProcessorEntry()
     * @generated
     */
    int PROCESSOR_ENTRY = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_ENTRY__ID = 0;

    /**
     * The number of structural features of the '<em>Processor Entry</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_ENTRY_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Processor Entry</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_ENTRY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kicool.impl.ProcessorImpl <em>Processor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kicool.impl.ProcessorImpl
     * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getProcessor()
     * @generated
     */
    int PROCESSOR = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__ID = PROCESSOR_ENTRY__ID;

    /**
     * The feature id for the '<em><b>Pre Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__PRE_ANNOTATIONS = PROCESSOR_ENTRY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Post Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__POST_ANNOTATIONS = PROCESSOR_ENTRY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Metric</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__METRIC = PROCESSOR_ENTRY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Context</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__CONTEXT = PROCESSOR_ENTRY_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Processor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_FEATURE_COUNT = PROCESSOR_ENTRY_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Processor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_OPERATION_COUNT = PROCESSOR_ENTRY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kicool.impl.ProcessorSystemImpl <em>Processor System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kicool.impl.ProcessorSystemImpl
     * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getProcessorSystem()
     * @generated
     */
    int PROCESSOR_SYSTEM = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_SYSTEM__ID = PROCESSOR_ENTRY__ID;

    /**
     * The number of structural features of the '<em>Processor System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_SYSTEM_FEATURE_COUNT = PROCESSOR_ENTRY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Processor System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_SYSTEM_OPERATION_COUNT = PROCESSOR_ENTRY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kicool.impl.ProcessorGroupImpl <em>Processor Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kicool.impl.ProcessorGroupImpl
     * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getProcessorGroup()
     * @generated
     */
    int PROCESSOR_GROUP = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_GROUP__ID = PROCESSOR_ENTRY__ID;

    /**
     * The feature id for the '<em><b>Processors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_GROUP__PROCESSORS = PROCESSOR_ENTRY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_GROUP__LABEL = PROCESSOR_ENTRY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Processor Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_GROUP_FEATURE_COUNT = PROCESSOR_ENTRY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Processor Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_GROUP_OPERATION_COUNT = PROCESSOR_ENTRY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kicool.impl.ProcessorAlternativeGroupImpl <em>Processor Alternative Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kicool.impl.ProcessorAlternativeGroupImpl
     * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getProcessorAlternativeGroup()
     * @generated
     */
    int PROCESSOR_ALTERNATIVE_GROUP = 5;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_ALTERNATIVE_GROUP__ID = PROCESSOR_GROUP__ID;

    /**
     * The feature id for the '<em><b>Processors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_ALTERNATIVE_GROUP__PROCESSORS = PROCESSOR_GROUP__PROCESSORS;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_ALTERNATIVE_GROUP__LABEL = PROCESSOR_GROUP__LABEL;

    /**
     * The number of structural features of the '<em>Processor Alternative Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_ALTERNATIVE_GROUP_FEATURE_COUNT = PROCESSOR_GROUP_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Processor Alternative Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_ALTERNATIVE_GROUP_OPERATION_COUNT = PROCESSOR_GROUP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kicool.impl.MetricImpl <em>Metric</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kicool.impl.MetricImpl
     * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getMetric()
     * @generated
     */
    int METRIC = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METRIC__ID = PROCESSOR_ENTRY__ID;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METRIC__ALIAS = PROCESSOR_ENTRY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Metric</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METRIC_FEATURE_COUNT = PROCESSOR_ENTRY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Metric</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METRIC_OPERATION_COUNT = PROCESSOR_ENTRY_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kicool.impl.ProcessorContextImpl <em>Processor Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kicool.impl.ProcessorContextImpl
     * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getProcessorContext()
     * @generated
     */
    int PROCESSOR_CONTEXT = 7;

    /**
     * The feature id for the '<em><b>Environment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_CONTEXT__ENVIRONMENT = 0;

    /**
     * The feature id for the '<em><b>Source Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_CONTEXT__SOURCE_MODEL = 1;

    /**
     * The feature id for the '<em><b>Targets</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_CONTEXT__TARGETS = 2;

    /**
     * The number of structural features of the '<em>Processor Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_CONTEXT_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Processor Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_CONTEXT_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kicool.System <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>System</em>'.
     * @see de.cau.cs.kieler.kicool.System
     * @generated
     */
    EClass getSystem();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kicool.System#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see de.cau.cs.kieler.kicool.System#getId()
     * @see #getSystem()
     * @generated
     */
    EAttribute getSystem_Id();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kicool.System#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see de.cau.cs.kieler.kicool.System#getVersion()
     * @see #getSystem()
     * @generated
     */
    EAttribute getSystem_Version();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kicool.System#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see de.cau.cs.kieler.kicool.System#getLabel()
     * @see #getSystem()
     * @generated
     */
    EAttribute getSystem_Label();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kicool.System#getProcessors <em>Processors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Processors</em>'.
     * @see de.cau.cs.kieler.kicool.System#getProcessors()
     * @see #getSystem()
     * @generated
     */
    EReference getSystem_Processors();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kicool.System#getMetrics <em>Metrics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Metrics</em>'.
     * @see de.cau.cs.kieler.kicool.System#getMetrics()
     * @see #getSystem()
     * @generated
     */
    EReference getSystem_Metrics();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kicool.System#getInputClass <em>Input Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Class</em>'.
     * @see de.cau.cs.kieler.kicool.System#getInputClass()
     * @see #getSystem()
     * @generated
     */
    EAttribute getSystem_InputClass();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kicool.ProcessorEntry <em>Processor Entry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor Entry</em>'.
     * @see de.cau.cs.kieler.kicool.ProcessorEntry
     * @generated
     */
    EClass getProcessorEntry();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kicool.ProcessorEntry#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see de.cau.cs.kieler.kicool.ProcessorEntry#getId()
     * @see #getProcessorEntry()
     * @generated
     */
    EAttribute getProcessorEntry_Id();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kicool.Processor <em>Processor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor</em>'.
     * @see de.cau.cs.kieler.kicool.Processor
     * @generated
     */
    EClass getProcessor();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kicool.Processor#getPreAnnotations <em>Pre Annotations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Pre Annotations</em>'.
     * @see de.cau.cs.kieler.kicool.Processor#getPreAnnotations()
     * @see #getProcessor()
     * @generated
     */
    EReference getProcessor_PreAnnotations();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kicool.Processor#getPostAnnotations <em>Post Annotations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Post Annotations</em>'.
     * @see de.cau.cs.kieler.kicool.Processor#getPostAnnotations()
     * @see #getProcessor()
     * @generated
     */
    EReference getProcessor_PostAnnotations();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.kicool.Processor#getMetric <em>Metric</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Metric</em>'.
     * @see de.cau.cs.kieler.kicool.Processor#getMetric()
     * @see #getProcessor()
     * @generated
     */
    EReference getProcessor_Metric();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kicool.Processor#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context</em>'.
     * @see de.cau.cs.kieler.kicool.Processor#getContext()
     * @see #getProcessor()
     * @generated
     */
    EReference getProcessor_Context();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kicool.ProcessorSystem <em>Processor System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor System</em>'.
     * @see de.cau.cs.kieler.kicool.ProcessorSystem
     * @generated
     */
    EClass getProcessorSystem();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kicool.ProcessorGroup <em>Processor Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor Group</em>'.
     * @see de.cau.cs.kieler.kicool.ProcessorGroup
     * @generated
     */
    EClass getProcessorGroup();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kicool.ProcessorGroup#getProcessors <em>Processors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Processors</em>'.
     * @see de.cau.cs.kieler.kicool.ProcessorGroup#getProcessors()
     * @see #getProcessorGroup()
     * @generated
     */
    EReference getProcessorGroup_Processors();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kicool.ProcessorGroup#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see de.cau.cs.kieler.kicool.ProcessorGroup#getLabel()
     * @see #getProcessorGroup()
     * @generated
     */
    EAttribute getProcessorGroup_Label();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kicool.ProcessorAlternativeGroup <em>Processor Alternative Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor Alternative Group</em>'.
     * @see de.cau.cs.kieler.kicool.ProcessorAlternativeGroup
     * @generated
     */
    EClass getProcessorAlternativeGroup();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kicool.Metric <em>Metric</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Metric</em>'.
     * @see de.cau.cs.kieler.kicool.Metric
     * @generated
     */
    EClass getMetric();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kicool.Metric#getAlias <em>Alias</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Alias</em>'.
     * @see de.cau.cs.kieler.kicool.Metric#getAlias()
     * @see #getMetric()
     * @generated
     */
    EAttribute getMetric_Alias();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kicool.ProcessorContext <em>Processor Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor Context</em>'.
     * @see de.cau.cs.kieler.kicool.ProcessorContext
     * @generated
     */
    EClass getProcessorContext();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kicool.ProcessorContext#getEnvironment <em>Environment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Environment</em>'.
     * @see de.cau.cs.kieler.kicool.ProcessorContext#getEnvironment()
     * @see #getProcessorContext()
     * @generated
     */
    EAttribute getProcessorContext_Environment();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.kicool.ProcessorContext#getSourceModel <em>Source Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Model</em>'.
     * @see de.cau.cs.kieler.kicool.ProcessorContext#getSourceModel()
     * @see #getProcessorContext()
     * @generated
     */
    EReference getProcessorContext_SourceModel();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kicool.ProcessorContext#getTargets <em>Targets</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Targets</em>'.
     * @see de.cau.cs.kieler.kicool.ProcessorContext#getTargets()
     * @see #getProcessorContext()
     * @generated
     */
    EReference getProcessorContext_Targets();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    KiCoolFactory getKiCoolFactory();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.kicool.impl.SystemImpl <em>System</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kicool.impl.SystemImpl
         * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getSystem()
         * @generated
         */
        EClass SYSTEM = eINSTANCE.getSystem();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYSTEM__ID = eINSTANCE.getSystem_Id();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYSTEM__VERSION = eINSTANCE.getSystem_Version();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYSTEM__LABEL = eINSTANCE.getSystem_Label();

        /**
         * The meta object literal for the '<em><b>Processors</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM__PROCESSORS = eINSTANCE.getSystem_Processors();

        /**
         * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM__METRICS = eINSTANCE.getSystem_Metrics();

        /**
         * The meta object literal for the '<em><b>Input Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYSTEM__INPUT_CLASS = eINSTANCE.getSystem_InputClass();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kicool.impl.ProcessorEntryImpl <em>Processor Entry</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kicool.impl.ProcessorEntryImpl
         * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getProcessorEntry()
         * @generated
         */
        EClass PROCESSOR_ENTRY = eINSTANCE.getProcessorEntry();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESSOR_ENTRY__ID = eINSTANCE.getProcessorEntry_Id();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kicool.impl.ProcessorImpl <em>Processor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kicool.impl.ProcessorImpl
         * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getProcessor()
         * @generated
         */
        EClass PROCESSOR = eINSTANCE.getProcessor();

        /**
         * The meta object literal for the '<em><b>Pre Annotations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESSOR__PRE_ANNOTATIONS = eINSTANCE.getProcessor_PreAnnotations();

        /**
         * The meta object literal for the '<em><b>Post Annotations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESSOR__POST_ANNOTATIONS = eINSTANCE.getProcessor_PostAnnotations();

        /**
         * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESSOR__METRIC = eINSTANCE.getProcessor_Metric();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESSOR__CONTEXT = eINSTANCE.getProcessor_Context();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kicool.impl.ProcessorSystemImpl <em>Processor System</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kicool.impl.ProcessorSystemImpl
         * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getProcessorSystem()
         * @generated
         */
        EClass PROCESSOR_SYSTEM = eINSTANCE.getProcessorSystem();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kicool.impl.ProcessorGroupImpl <em>Processor Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kicool.impl.ProcessorGroupImpl
         * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getProcessorGroup()
         * @generated
         */
        EClass PROCESSOR_GROUP = eINSTANCE.getProcessorGroup();

        /**
         * The meta object literal for the '<em><b>Processors</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESSOR_GROUP__PROCESSORS = eINSTANCE.getProcessorGroup_Processors();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESSOR_GROUP__LABEL = eINSTANCE.getProcessorGroup_Label();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kicool.impl.ProcessorAlternativeGroupImpl <em>Processor Alternative Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kicool.impl.ProcessorAlternativeGroupImpl
         * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getProcessorAlternativeGroup()
         * @generated
         */
        EClass PROCESSOR_ALTERNATIVE_GROUP = eINSTANCE.getProcessorAlternativeGroup();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kicool.impl.MetricImpl <em>Metric</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kicool.impl.MetricImpl
         * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getMetric()
         * @generated
         */
        EClass METRIC = eINSTANCE.getMetric();

        /**
         * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METRIC__ALIAS = eINSTANCE.getMetric_Alias();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kicool.impl.ProcessorContextImpl <em>Processor Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kicool.impl.ProcessorContextImpl
         * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getProcessorContext()
         * @generated
         */
        EClass PROCESSOR_CONTEXT = eINSTANCE.getProcessorContext();

        /**
         * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESSOR_CONTEXT__ENVIRONMENT = eINSTANCE.getProcessorContext_Environment();

        /**
         * The meta object literal for the '<em><b>Source Model</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESSOR_CONTEXT__SOURCE_MODEL = eINSTANCE.getProcessorContext_SourceModel();

        /**
         * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESSOR_CONTEXT__TARGETS = eINSTANCE.getProcessorContext_Targets();

    }

} //KiCoolPackage
