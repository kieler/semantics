/**
 */
package de.cau.cs.kieler.kexpressions.keffects;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.cau.cs.kieler.annotations.AnnotationsPackage;

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
 * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory
 * @model kind="package"
 * @generated
 */
public interface KEffectsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "keffects";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://kieler.cs.cau.de/keffects/0.1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "keffects";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    KEffectsPackage eINSTANCE = de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.keffects.Effect <em>Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.keffects.Effect
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getEffect()
     * @generated
     */
    int EFFECT = 0;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFFECT__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFFECT__SCHEDULE = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFFECT__OUTGOING_LINKS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFFECT__INCOMING_LINKS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Effect</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFFECT_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.AssignmentImpl
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getAssignment()
     * @generated
     */
    int ASSIGNMENT = 1;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__ANNOTATIONS = EFFECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__SCHEDULE = EFFECT__SCHEDULE;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__OUTGOING_LINKS = EFFECT__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__INCOMING_LINKS = EFFECT__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__REFERENCE = EFFECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__EXPRESSION = EFFECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__OPERATOR = EFFECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Sub Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__SUB_REFERENCE = EFFECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.EmissionImpl <em>Emission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.EmissionImpl
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getEmission()
     * @generated
     */
    int EMISSION = 2;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMISSION__ANNOTATIONS = EFFECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMISSION__SCHEDULE = EFFECT__SCHEDULE;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMISSION__OUTGOING_LINKS = EFFECT__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMISSION__INCOMING_LINKS = EFFECT__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMISSION__REFERENCE = EFFECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>New Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMISSION__NEW_VALUE = EFFECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Emission</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMISSION_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.HostcodeEffectImpl <em>Hostcode Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.HostcodeEffectImpl
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getHostcodeEffect()
     * @generated
     */
    int HOSTCODE_EFFECT = 3;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOSTCODE_EFFECT__ANNOTATIONS = EFFECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOSTCODE_EFFECT__SCHEDULE = EFFECT__SCHEDULE;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOSTCODE_EFFECT__OUTGOING_LINKS = EFFECT__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOSTCODE_EFFECT__INCOMING_LINKS = EFFECT__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOSTCODE_EFFECT__TEXT = EFFECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Hostcode Effect</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOSTCODE_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.ReferenceCallEffectImpl <em>Reference Call Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.ReferenceCallEffectImpl
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getReferenceCallEffect()
     * @generated
     */
    int REFERENCE_CALL_EFFECT = 4;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_CALL_EFFECT__ANNOTATIONS = EFFECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_CALL_EFFECT__SCHEDULE = EFFECT__SCHEDULE;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_CALL_EFFECT__OUTGOING_LINKS = EFFECT__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_CALL_EFFECT__INCOMING_LINKS = EFFECT__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Valued Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_CALL_EFFECT__VALUED_OBJECT = EFFECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Indices</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_CALL_EFFECT__INDICES = EFFECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Sub Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_CALL_EFFECT__SUB_REFERENCE = EFFECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_CALL_EFFECT__PARAMETERS = EFFECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Reference Call Effect</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_CALL_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.FunctionCallEffectImpl <em>Function Call Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.FunctionCallEffectImpl
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getFunctionCallEffect()
     * @generated
     */
    int FUNCTION_CALL_EFFECT = 5;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL_EFFECT__ANNOTATIONS = EFFECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL_EFFECT__SCHEDULE = EFFECT__SCHEDULE;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL_EFFECT__OUTGOING_LINKS = EFFECT__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL_EFFECT__INCOMING_LINKS = EFFECT__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL_EFFECT__PARAMETERS = EFFECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Function Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL_EFFECT__FUNCTION_NAME = EFFECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Function Call Effect</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.PrintCallEffectImpl <em>Print Call Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.PrintCallEffectImpl
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getPrintCallEffect()
     * @generated
     */
    int PRINT_CALL_EFFECT = 6;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRINT_CALL_EFFECT__ANNOTATIONS = EFFECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRINT_CALL_EFFECT__SCHEDULE = EFFECT__SCHEDULE;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRINT_CALL_EFFECT__OUTGOING_LINKS = EFFECT__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRINT_CALL_EFFECT__INCOMING_LINKS = EFFECT__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRINT_CALL_EFFECT__PARAMETERS = EFFECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Print Call Effect</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRINT_CALL_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.RandomizeCallEffectImpl <em>Randomize Call Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.RandomizeCallEffectImpl
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getRandomizeCallEffect()
     * @generated
     */
    int RANDOMIZE_CALL_EFFECT = 7;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANDOMIZE_CALL_EFFECT__ANNOTATIONS = EFFECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANDOMIZE_CALL_EFFECT__SCHEDULE = EFFECT__SCHEDULE;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANDOMIZE_CALL_EFFECT__OUTGOING_LINKS = EFFECT__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANDOMIZE_CALL_EFFECT__INCOMING_LINKS = EFFECT__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANDOMIZE_CALL_EFFECT__PARAMETERS = EFFECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Randomize Call Effect</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANDOMIZE_CALL_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.LinkableImpl <em>Linkable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.LinkableImpl
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getLinkable()
     * @generated
     */
    int LINKABLE = 8;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKABLE__OUTGOING_LINKS = 0;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKABLE__INCOMING_LINKS = 1;

    /**
     * The number of structural features of the '<em>Linkable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKABLE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.LinkImpl
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getLink()
     * @generated
     */
    int LINK = 9;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__TARGET = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Tag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__TAG = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__REFERENCE = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.DependencyImpl
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getDependency()
     * @generated
     */
    int DEPENDENCY = 10;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY__ANNOTATIONS = LINK__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY__TARGET = LINK__TARGET;

    /**
     * The feature id for the '<em><b>Tag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY__TAG = LINK__TAG;

    /**
     * The feature id for the '<em><b>Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY__REFERENCE = LINK__REFERENCE;

    /**
     * The number of structural features of the '<em>Dependency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.DataDependencyImpl <em>Data Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.DataDependencyImpl
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getDataDependency()
     * @generated
     */
    int DATA_DEPENDENCY = 11;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DEPENDENCY__ANNOTATIONS = DEPENDENCY__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DEPENDENCY__TARGET = DEPENDENCY__TARGET;

    /**
     * The feature id for the '<em><b>Tag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DEPENDENCY__TAG = DEPENDENCY__TAG;

    /**
     * The feature id for the '<em><b>Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DEPENDENCY__REFERENCE = DEPENDENCY__REFERENCE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DEPENDENCY__TYPE = DEPENDENCY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Concurrent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DEPENDENCY__CONCURRENT = DEPENDENCY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Confluent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DEPENDENCY__CONFLUENT = DEPENDENCY_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Data Dependency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.keffects.AssignOperator <em>Assign Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.keffects.AssignOperator
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getAssignOperator()
     * @generated
     */
    int ASSIGN_OPERATOR = 12;


    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.keffects.DataDependencyType <em>Data Dependency Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.keffects.DataDependencyType
     * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getDataDependencyType()
     * @generated
     */
    int DATA_DEPENDENCY_TYPE = 13;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.keffects.Effect <em>Effect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Effect</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Effect
     * @generated
     */
    EClass getEffect();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.keffects.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Assignment
     * @generated
     */
    EClass getAssignment();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Reference</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Assignment#getReference()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_Reference();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Assignment#getExpression()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_Expression();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Assignment#getOperator()
     * @see #getAssignment()
     * @generated
     */
    EAttribute getAssignment_Operator();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getSubReference <em>Sub Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sub Reference</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Assignment#getSubReference()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_SubReference();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.keffects.Emission <em>Emission</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Emission</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Emission
     * @generated
     */
    EClass getEmission();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kexpressions.keffects.Emission#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Reference</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Emission#getReference()
     * @see #getEmission()
     * @generated
     */
    EReference getEmission_Reference();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kexpressions.keffects.Emission#getNewValue <em>New Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>New Value</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Emission#getNewValue()
     * @see #getEmission()
     * @generated
     */
    EReference getEmission_NewValue();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.keffects.HostcodeEffect <em>Hostcode Effect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hostcode Effect</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.HostcodeEffect
     * @generated
     */
    EClass getHostcodeEffect();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.keffects.ReferenceCallEffect <em>Reference Call Effect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference Call Effect</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.ReferenceCallEffect
     * @generated
     */
    EClass getReferenceCallEffect();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.keffects.FunctionCallEffect <em>Function Call Effect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function Call Effect</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.FunctionCallEffect
     * @generated
     */
    EClass getFunctionCallEffect();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.keffects.PrintCallEffect <em>Print Call Effect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Print Call Effect</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.PrintCallEffect
     * @generated
     */
    EClass getPrintCallEffect();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.keffects.RandomizeCallEffect <em>Randomize Call Effect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Randomize Call Effect</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.RandomizeCallEffect
     * @generated
     */
    EClass getRandomizeCallEffect();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.keffects.Linkable <em>Linkable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Linkable</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Linkable
     * @generated
     */
    EClass getLinkable();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kexpressions.keffects.Linkable#getOutgoingLinks <em>Outgoing Links</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Outgoing Links</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Linkable#getOutgoingLinks()
     * @see #getLinkable()
     * @generated
     */
    EReference getLinkable_OutgoingLinks();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.kexpressions.keffects.Linkable#getIncomingLinks <em>Incoming Links</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming Links</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Linkable#getIncomingLinks()
     * @see #getLinkable()
     * @generated
     */
    EReference getLinkable_IncomingLinks();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.keffects.Link <em>Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Link
     * @generated
     */
    EClass getLink();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.kexpressions.keffects.Link#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Link#getTarget()
     * @see #getLink()
     * @generated
     */
    EReference getLink_Target();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.keffects.Link#getTag <em>Tag</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tag</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Link#getTag()
     * @see #getLink()
     * @generated
     */
    EAttribute getLink_Tag();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.kexpressions.keffects.Link#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Reference</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Link#getReference()
     * @see #getLink()
     * @generated
     */
    EReference getLink_Reference();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.keffects.Dependency <em>Dependency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dependency</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.Dependency
     * @generated
     */
    EClass getDependency();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.keffects.DataDependency <em>Data Dependency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Dependency</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.DataDependency
     * @generated
     */
    EClass getDataDependency();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.keffects.DataDependency#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.DataDependency#getType()
     * @see #getDataDependency()
     * @generated
     */
    EAttribute getDataDependency_Type();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.keffects.DataDependency#isConcurrent <em>Concurrent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Concurrent</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.DataDependency#isConcurrent()
     * @see #getDataDependency()
     * @generated
     */
    EAttribute getDataDependency_Concurrent();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.keffects.DataDependency#isConfluent <em>Confluent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Confluent</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.DataDependency#isConfluent()
     * @see #getDataDependency()
     * @generated
     */
    EAttribute getDataDependency_Confluent();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.kexpressions.keffects.AssignOperator <em>Assign Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Assign Operator</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.AssignOperator
     * @generated
     */
    EEnum getAssignOperator();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.kexpressions.keffects.DataDependencyType <em>Data Dependency Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Data Dependency Type</em>'.
     * @see de.cau.cs.kieler.kexpressions.keffects.DataDependencyType
     * @generated
     */
    EEnum getDataDependencyType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    KEffectsFactory getKEffectsFactory();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.keffects.Effect <em>Effect</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.keffects.Effect
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getEffect()
         * @generated
         */
        EClass EFFECT = eINSTANCE.getEffect();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.AssignmentImpl <em>Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.AssignmentImpl
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getAssignment()
         * @generated
         */
        EClass ASSIGNMENT = eINSTANCE.getAssignment();

        /**
         * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT__REFERENCE = eINSTANCE.getAssignment_Reference();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT__EXPRESSION = eINSTANCE.getAssignment_Expression();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSIGNMENT__OPERATOR = eINSTANCE.getAssignment_Operator();

        /**
         * The meta object literal for the '<em><b>Sub Reference</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT__SUB_REFERENCE = eINSTANCE.getAssignment_SubReference();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.EmissionImpl <em>Emission</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.EmissionImpl
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getEmission()
         * @generated
         */
        EClass EMISSION = eINSTANCE.getEmission();

        /**
         * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMISSION__REFERENCE = eINSTANCE.getEmission_Reference();

        /**
         * The meta object literal for the '<em><b>New Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMISSION__NEW_VALUE = eINSTANCE.getEmission_NewValue();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.HostcodeEffectImpl <em>Hostcode Effect</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.HostcodeEffectImpl
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getHostcodeEffect()
         * @generated
         */
        EClass HOSTCODE_EFFECT = eINSTANCE.getHostcodeEffect();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.ReferenceCallEffectImpl <em>Reference Call Effect</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.ReferenceCallEffectImpl
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getReferenceCallEffect()
         * @generated
         */
        EClass REFERENCE_CALL_EFFECT = eINSTANCE.getReferenceCallEffect();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.FunctionCallEffectImpl <em>Function Call Effect</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.FunctionCallEffectImpl
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getFunctionCallEffect()
         * @generated
         */
        EClass FUNCTION_CALL_EFFECT = eINSTANCE.getFunctionCallEffect();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.PrintCallEffectImpl <em>Print Call Effect</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.PrintCallEffectImpl
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getPrintCallEffect()
         * @generated
         */
        EClass PRINT_CALL_EFFECT = eINSTANCE.getPrintCallEffect();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.RandomizeCallEffectImpl <em>Randomize Call Effect</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.RandomizeCallEffectImpl
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getRandomizeCallEffect()
         * @generated
         */
        EClass RANDOMIZE_CALL_EFFECT = eINSTANCE.getRandomizeCallEffect();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.LinkableImpl <em>Linkable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.LinkableImpl
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getLinkable()
         * @generated
         */
        EClass LINKABLE = eINSTANCE.getLinkable();

        /**
         * The meta object literal for the '<em><b>Outgoing Links</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINKABLE__OUTGOING_LINKS = eINSTANCE.getLinkable_OutgoingLinks();

        /**
         * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINKABLE__INCOMING_LINKS = eINSTANCE.getLinkable_IncomingLinks();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.LinkImpl <em>Link</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.LinkImpl
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getLink()
         * @generated
         */
        EClass LINK = eINSTANCE.getLink();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINK__TARGET = eINSTANCE.getLink_Target();

        /**
         * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINK__TAG = eINSTANCE.getLink_Tag();

        /**
         * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINK__REFERENCE = eINSTANCE.getLink_Reference();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.DependencyImpl <em>Dependency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.DependencyImpl
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getDependency()
         * @generated
         */
        EClass DEPENDENCY = eINSTANCE.getDependency();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.keffects.impl.DataDependencyImpl <em>Data Dependency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.DataDependencyImpl
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getDataDependency()
         * @generated
         */
        EClass DATA_DEPENDENCY = eINSTANCE.getDataDependency();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_DEPENDENCY__TYPE = eINSTANCE.getDataDependency_Type();

        /**
         * The meta object literal for the '<em><b>Concurrent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_DEPENDENCY__CONCURRENT = eINSTANCE.getDataDependency_Concurrent();

        /**
         * The meta object literal for the '<em><b>Confluent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_DEPENDENCY__CONFLUENT = eINSTANCE.getDataDependency_Confluent();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.keffects.AssignOperator <em>Assign Operator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.keffects.AssignOperator
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getAssignOperator()
         * @generated
         */
        EEnum ASSIGN_OPERATOR = eINSTANCE.getAssignOperator();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.keffects.DataDependencyType <em>Data Dependency Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.keffects.DataDependencyType
         * @see de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsPackageImpl#getDataDependencyType()
         * @generated
         */
        EEnum DATA_DEPENDENCY_TYPE = eINSTANCE.getDataDependencyType();

    }

} //KEffectsPackage
