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
     * The feature id for the '<em><b>Intermediates</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__INTERMEDIATES = 4;

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
     * The meta object id for the '{@link de.cau.cs.kieler.kicool.impl.ProcessorReferenceImpl <em>Processor Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kicool.impl.ProcessorReferenceImpl
     * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getProcessorReference()
     * @generated
     */
    int PROCESSOR_REFERENCE = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_REFERENCE__ID = PROCESSOR_ENTRY__ID;

    /**
     * The feature id for the '<em><b>Presets</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_REFERENCE__PRESETS = PROCESSOR_ENTRY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Postsets</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_REFERENCE__POSTSETS = PROCESSOR_ENTRY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Metric</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_REFERENCE__METRIC = PROCESSOR_ENTRY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Context</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_REFERENCE__CONTEXT = PROCESSOR_ENTRY_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Processor Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_REFERENCE_FEATURE_COUNT = PROCESSOR_ENTRY_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Processor Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_REFERENCE_OPERATION_COUNT = PROCESSOR_ENTRY_OPERATION_COUNT + 0;

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
     * The meta object id for the '{@link de.cau.cs.kieler.kicool.impl.IntermediateReferenceImpl <em>Intermediate Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kicool.impl.IntermediateReferenceImpl
     * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getIntermediateReference()
     * @generated
     */
    int INTERMEDIATE_REFERENCE = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_REFERENCE__ID = PROCESSOR_ENTRY__ID;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_REFERENCE__ALIAS = PROCESSOR_ENTRY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Intermediate Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_REFERENCE_FEATURE_COUNT = PROCESSOR_ENTRY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Intermediate Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_REFERENCE_OPERATION_COUNT = PROCESSOR_ENTRY_OPERATION_COUNT + 0;

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
     * The meta object id for the '{@link de.cau.cs.kieler.kicool.impl.KVPairImpl <em>KV Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kicool.impl.KVPairImpl
     * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getKVPair()
     * @generated
     */
    int KV_PAIR = 8;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KV_PAIR__KEY = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KV_PAIR__VALUE = 1;

    /**
     * The feature id for the '<em><b>Is Key Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KV_PAIR__IS_KEY_VALUE = 2;

    /**
     * The number of structural features of the '<em>KV Pair</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KV_PAIR_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>KV Pair</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KV_PAIR_OPERATION_COUNT = 0;


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
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kicool.System#getIntermediates <em>Intermediates</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Intermediates</em>'.
     * @see de.cau.cs.kieler.kicool.System#getIntermediates()
     * @see #getSystem()
     * @generated
     */
    EReference getSystem_Intermediates();

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
     * Returns the meta object for class '{@link de.cau.cs.kieler.kicool.ProcessorReference <em>Processor Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor Reference</em>'.
     * @see de.cau.cs.kieler.kicool.ProcessorReference
     * @generated
     */
    EClass getProcessorReference();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kicool.ProcessorReference#getPresets <em>Presets</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Presets</em>'.
     * @see de.cau.cs.kieler.kicool.ProcessorReference#getPresets()
     * @see #getProcessorReference()
     * @generated
     */
    EReference getProcessorReference_Presets();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kicool.ProcessorReference#getPostsets <em>Postsets</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Postsets</em>'.
     * @see de.cau.cs.kieler.kicool.ProcessorReference#getPostsets()
     * @see #getProcessorReference()
     * @generated
     */
    EReference getProcessorReference_Postsets();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.kicool.ProcessorReference#getMetric <em>Metric</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Metric</em>'.
     * @see de.cau.cs.kieler.kicool.ProcessorReference#getMetric()
     * @see #getProcessorReference()
     * @generated
     */
    EReference getProcessorReference_Metric();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kicool.ProcessorReference#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context</em>'.
     * @see de.cau.cs.kieler.kicool.ProcessorReference#getContext()
     * @see #getProcessorReference()
     * @generated
     */
    EReference getProcessorReference_Context();

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
     * Returns the meta object for class '{@link de.cau.cs.kieler.kicool.IntermediateReference <em>Intermediate Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intermediate Reference</em>'.
     * @see de.cau.cs.kieler.kicool.IntermediateReference
     * @generated
     */
    EClass getIntermediateReference();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kicool.IntermediateReference#getAlias <em>Alias</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Alias</em>'.
     * @see de.cau.cs.kieler.kicool.IntermediateReference#getAlias()
     * @see #getIntermediateReference()
     * @generated
     */
    EAttribute getIntermediateReference_Alias();

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
     * Returns the meta object for class '{@link de.cau.cs.kieler.kicool.KVPair <em>KV Pair</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KV Pair</em>'.
     * @see de.cau.cs.kieler.kicool.KVPair
     * @generated
     */
    EClass getKVPair();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kicool.KVPair#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see de.cau.cs.kieler.kicool.KVPair#getKey()
     * @see #getKVPair()
     * @generated
     */
    EAttribute getKVPair_Key();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kicool.KVPair#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.cau.cs.kieler.kicool.KVPair#getValue()
     * @see #getKVPair()
     * @generated
     */
    EAttribute getKVPair_Value();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kicool.KVPair#isIsKeyValue <em>Is Key Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Key Value</em>'.
     * @see de.cau.cs.kieler.kicool.KVPair#isIsKeyValue()
     * @see #getKVPair()
     * @generated
     */
    EAttribute getKVPair_IsKeyValue();

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
         * The meta object literal for the '<em><b>Intermediates</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM__INTERMEDIATES = eINSTANCE.getSystem_Intermediates();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.kicool.impl.ProcessorReferenceImpl <em>Processor Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kicool.impl.ProcessorReferenceImpl
         * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getProcessorReference()
         * @generated
         */
        EClass PROCESSOR_REFERENCE = eINSTANCE.getProcessorReference();

        /**
         * The meta object literal for the '<em><b>Presets</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESSOR_REFERENCE__PRESETS = eINSTANCE.getProcessorReference_Presets();

        /**
         * The meta object literal for the '<em><b>Postsets</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESSOR_REFERENCE__POSTSETS = eINSTANCE.getProcessorReference_Postsets();

        /**
         * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESSOR_REFERENCE__METRIC = eINSTANCE.getProcessorReference_Metric();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESSOR_REFERENCE__CONTEXT = eINSTANCE.getProcessorReference_Context();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.kicool.impl.IntermediateReferenceImpl <em>Intermediate Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kicool.impl.IntermediateReferenceImpl
         * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getIntermediateReference()
         * @generated
         */
        EClass INTERMEDIATE_REFERENCE = eINSTANCE.getIntermediateReference();

        /**
         * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERMEDIATE_REFERENCE__ALIAS = eINSTANCE.getIntermediateReference_Alias();

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

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kicool.impl.KVPairImpl <em>KV Pair</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kicool.impl.KVPairImpl
         * @see de.cau.cs.kieler.kicool.impl.KiCoolPackageImpl#getKVPair()
         * @generated
         */
        EClass KV_PAIR = eINSTANCE.getKVPair();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KV_PAIR__KEY = eINSTANCE.getKVPair_Key();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KV_PAIR__VALUE = eINSTANCE.getKVPair_Value();

        /**
         * The meta object literal for the '<em><b>Is Key Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KV_PAIR__IS_KEY_VALUE = eINSTANCE.getKVPair_IsKeyValue();

    }

} //KiCoolPackage
