/**
 */
package de.cau.cs.kieler.scgprios;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.cau.cs.kieler.scgprios.ScgpriosFactory
 * @model kind="package"
 * @generated
 */
public interface ScgpriosPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "scgprios";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://kieler.cs.cau.de/scgprios/0.1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "scgprios";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ScgpriosPackage eINSTANCE = de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.SCGraph_PImpl <em>SC Graph P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.SCGraph_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getSCGraph_P()
     * @generated
     */
    int SC_GRAPH_P = 0;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_GRAPH_P__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_GRAPH_P__NODES = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_GRAPH_P__DECLARATIONS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Basic Blocks</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_GRAPH_P__BASIC_BLOCKS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Schedules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_GRAPH_P__SCHEDULES = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Guards</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_GRAPH_P__GUARDS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_GRAPH_P__LABEL = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>SC Graph P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_GRAPH_P_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 6;

   
    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.Node_PImpl <em>Node P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.Node_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getNode_P()
     * @generated
     */
    int NODE_P = 1;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_P__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_P__INCOMING = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_P__IS_INITIAL = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_P__DEPENDENCIES = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Node Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_P__NODE_PRIORITY = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Node P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_P_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     * @ordered
     */
    int NODE_P___GET_ANNOTATION__STRING = 0;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     * @ordered
     */
    int NODE_P___GET_ALL_ANNOTATIONS__STRING = 0;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     * @ordered
     */
    int NODE_P___REMOVE_ALL_ANNOTATIONS__STRING = 0;

    /**
     * The number of operations of the '<em>Node P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     * @ordered
     */
    int NODE_P_OPERATION_COUNT = 0 + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.Conditional_PImpl <em>Conditional P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.Conditional_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getConditional_P()
     * @generated
     */
    int CONDITIONAL_P = 2;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_P__ANNOTATIONS = NODE_P__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_P__INCOMING = NODE_P__INCOMING;

    /**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_P__IS_INITIAL = NODE_P__IS_INITIAL;

    /**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_P__DEPENDENCIES = NODE_P__DEPENDENCIES;

    /**
     * The feature id for the '<em><b>Node Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_P__NODE_PRIORITY = NODE_P__NODE_PRIORITY;

    /**
     * The feature id for the '<em><b>Then</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_P__THEN = NODE_P_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Else</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_P__ELSE = NODE_P_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_P__CONDITION = NODE_P_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Conditional P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_P_FEATURE_COUNT = NODE_P_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_P___GET_ANNOTATION__STRING = NODE_P___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_P___GET_ALL_ANNOTATIONS__STRING = NODE_P___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_P___REMOVE_ALL_ANNOTATIONS__STRING = NODE_P___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Conditional P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_P_OPERATION_COUNT = NODE_P_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.Surface_PImpl <em>Surface P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.Surface_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getSurface_P()
     * @generated
     */
    int SURFACE_P = 3;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SURFACE_P__ANNOTATIONS = NODE_P__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SURFACE_P__INCOMING = NODE_P__INCOMING;

    /**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SURFACE_P__IS_INITIAL = NODE_P__IS_INITIAL;

    /**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SURFACE_P__DEPENDENCIES = NODE_P__DEPENDENCIES;

    /**
     * The feature id for the '<em><b>Node Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SURFACE_P__NODE_PRIORITY = NODE_P__NODE_PRIORITY;

    /**
     * The feature id for the '<em><b>Depth</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SURFACE_P__DEPTH = NODE_P_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Surface P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SURFACE_P_FEATURE_COUNT = NODE_P_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SURFACE_P___GET_ANNOTATION__STRING = NODE_P___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SURFACE_P___GET_ALL_ANNOTATIONS__STRING = NODE_P___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SURFACE_P___REMOVE_ALL_ANNOTATIONS__STRING = NODE_P___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Surface P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SURFACE_P_OPERATION_COUNT = NODE_P_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.Depth_PImpl <em>Depth P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.Depth_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getDepth_P()
     * @generated
     */
    int DEPTH_P = 4;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPTH_P__ANNOTATIONS = NODE_P__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPTH_P__INCOMING = NODE_P__INCOMING;

    /**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPTH_P__IS_INITIAL = NODE_P__IS_INITIAL;

    /**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPTH_P__DEPENDENCIES = NODE_P__DEPENDENCIES;

    /**
     * The feature id for the '<em><b>Node Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPTH_P__NODE_PRIORITY = NODE_P__NODE_PRIORITY;

    /**
     * The feature id for the '<em><b>Surface</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPTH_P__SURFACE = NODE_P_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPTH_P__NEXT = NODE_P_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Depth P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPTH_P_FEATURE_COUNT = NODE_P_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPTH_P___GET_ANNOTATION__STRING = NODE_P___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPTH_P___GET_ALL_ANNOTATIONS__STRING = NODE_P___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPTH_P___REMOVE_ALL_ANNOTATIONS__STRING = NODE_P___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Depth P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPTH_P_OPERATION_COUNT = NODE_P_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.Assignment_PImpl <em>Assignment P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.Assignment_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getAssignment_P()
     * @generated
     */
    int ASSIGNMENT_P = 5;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_P__ANNOTATIONS = NODE_P__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_P__INCOMING = NODE_P__INCOMING;

    /**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_P__IS_INITIAL = NODE_P__IS_INITIAL;

    /**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_P__DEPENDENCIES = NODE_P__DEPENDENCIES;

    /**
     * The feature id for the '<em><b>Node Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_P__NODE_PRIORITY = NODE_P__NODE_PRIORITY;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_P__NEXT = NODE_P_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_P__ASSIGNMENT = NODE_P_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Valued Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_P__VALUED_OBJECT = NODE_P_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Indices</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_P__INDICES = NODE_P_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Assignment P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_P_FEATURE_COUNT = NODE_P_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_P___GET_ANNOTATION__STRING = NODE_P___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_P___GET_ALL_ANNOTATIONS__STRING = NODE_P___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_P___REMOVE_ALL_ANNOTATIONS__STRING = NODE_P___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Assignment P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_P_OPERATION_COUNT = NODE_P_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.Fork_PImpl <em>Fork P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.Fork_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getFork_P()
     * @generated
     */
    int FORK_P = 6;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORK_P__ANNOTATIONS = NODE_P__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORK_P__INCOMING = NODE_P__INCOMING;

    /**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORK_P__IS_INITIAL = NODE_P__IS_INITIAL;

    /**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORK_P__DEPENDENCIES = NODE_P__DEPENDENCIES;

    /**
     * The feature id for the '<em><b>Node Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORK_P__NODE_PRIORITY = NODE_P__NODE_PRIORITY;

    /**
     * The feature id for the '<em><b>Join</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORK_P__JOIN = NODE_P_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORK_P__NEXT = NODE_P_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Fork P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORK_P_FEATURE_COUNT = NODE_P_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORK_P___GET_ANNOTATION__STRING = NODE_P___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORK_P___GET_ALL_ANNOTATIONS__STRING = NODE_P___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORK_P___REMOVE_ALL_ANNOTATIONS__STRING = NODE_P___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Fork P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORK_P_OPERATION_COUNT = NODE_P_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.Join_PImpl <em>Join P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.Join_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getJoin_P()
     * @generated
     */
    int JOIN_P = 7;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOIN_P__ANNOTATIONS = NODE_P__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOIN_P__INCOMING = NODE_P__INCOMING;

    /**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOIN_P__IS_INITIAL = NODE_P__IS_INITIAL;

    /**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOIN_P__DEPENDENCIES = NODE_P__DEPENDENCIES;

    /**
     * The feature id for the '<em><b>Node Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOIN_P__NODE_PRIORITY = NODE_P__NODE_PRIORITY;

    /**
     * The feature id for the '<em><b>Fork</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOIN_P__FORK = NODE_P_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOIN_P__NEXT = NODE_P_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Join P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOIN_P_FEATURE_COUNT = NODE_P_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOIN_P___GET_ANNOTATION__STRING = NODE_P___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOIN_P___GET_ALL_ANNOTATIONS__STRING = NODE_P___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOIN_P___REMOVE_ALL_ANNOTATIONS__STRING = NODE_P___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Join P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOIN_P_OPERATION_COUNT = NODE_P_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.Link_PImpl <em>Link P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.Link_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getLink_P()
     * @generated
     */
    int LINK_P = 8;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_P__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_P__TARGET = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Link P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_P_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     * @ordered
     */
    int LINK_P___GET_ANNOTATION__STRING = 0;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     * @ordered
     */
    int LINK_P___GET_ALL_ANNOTATIONS__STRING = 0;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     * @ordered
     */
    int LINK_P___REMOVE_ALL_ANNOTATIONS__STRING = 0;

    /**
     * The number of operations of the '<em>Link P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     * @ordered
     */
    int LINK_P_OPERATION_COUNT = 0 + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.Entry_PImpl <em>Entry P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.Entry_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getEntry_P()
     * @generated
     */
    int ENTRY_P = 9;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_P__ANNOTATIONS = NODE_P__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_P__INCOMING = NODE_P__INCOMING;

    /**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_P__IS_INITIAL = NODE_P__IS_INITIAL;

    /**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_P__DEPENDENCIES = NODE_P__DEPENDENCIES;

    /**
     * The feature id for the '<em><b>Node Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_P__NODE_PRIORITY = NODE_P__NODE_PRIORITY;

    /**
     * The feature id for the '<em><b>Exit</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_P__EXIT = NODE_P_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_P__NEXT = NODE_P_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Entry P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_P_FEATURE_COUNT = NODE_P_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_P___GET_ANNOTATION__STRING = NODE_P___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_P___GET_ALL_ANNOTATIONS__STRING = NODE_P___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_P___REMOVE_ALL_ANNOTATIONS__STRING = NODE_P___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Entry P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_P_OPERATION_COUNT = NODE_P_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.Exit_PImpl <em>Exit P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.Exit_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getExit_P()
     * @generated
     */
    int EXIT_P = 10;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_P__ANNOTATIONS = NODE_P__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_P__INCOMING = NODE_P__INCOMING;

    /**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_P__IS_INITIAL = NODE_P__IS_INITIAL;

    /**
     * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_P__DEPENDENCIES = NODE_P__DEPENDENCIES;

    /**
     * The feature id for the '<em><b>Node Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_P__NODE_PRIORITY = NODE_P__NODE_PRIORITY;

    /**
     * The feature id for the '<em><b>Entry</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_P__ENTRY = NODE_P_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_P__NEXT = NODE_P_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Exit P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_P_FEATURE_COUNT = NODE_P_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_P___GET_ANNOTATION__STRING = NODE_P___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_P___GET_ALL_ANNOTATIONS__STRING = NODE_P___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_P___REMOVE_ALL_ANNOTATIONS__STRING = NODE_P___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Exit P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_P_OPERATION_COUNT = NODE_P_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.ControlFlow_PImpl <em>Control Flow P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.ControlFlow_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getControlFlow_P()
     * @generated
     */
    int CONTROL_FLOW_P = 11;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_FLOW_P__ANNOTATIONS = LINK_P__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_FLOW_P__TARGET = LINK_P__TARGET;

    /**
     * The number of structural features of the '<em>Control Flow P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_FLOW_P_FEATURE_COUNT = LINK_P_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_FLOW_P___GET_ANNOTATION__STRING = LINK_P___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_FLOW_P___GET_ALL_ANNOTATIONS__STRING = LINK_P___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_FLOW_P___REMOVE_ALL_ANNOTATIONS__STRING = LINK_P___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Control Flow P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_FLOW_P_OPERATION_COUNT = LINK_P_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.Dependency_PImpl <em>Dependency P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.Dependency_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getDependency_P()
     * @generated
     */
    int DEPENDENCY_P = 12;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_P__ANNOTATIONS = LINK_P__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_P__TARGET = LINK_P__TARGET;

    /**
     * The feature id for the '<em><b>Concurrent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_P__CONCURRENT = LINK_P_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Confluent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_P__CONFLUENT = LINK_P_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Dependency P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_P_FEATURE_COUNT = LINK_P_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_P___GET_ANNOTATION__STRING = LINK_P___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_P___GET_ALL_ANNOTATIONS__STRING = LINK_P___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_P___REMOVE_ALL_ANNOTATIONS__STRING = LINK_P___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Dependency P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_P_OPERATION_COUNT = LINK_P_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.AbsoluteWrite_Read_PImpl <em>Absolute Write Read P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.AbsoluteWrite_Read_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getAbsoluteWrite_Read_P()
     * @generated
     */
    int ABSOLUTE_WRITE_READ_P = 13;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_READ_P__ANNOTATIONS = DEPENDENCY_P__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_READ_P__TARGET = DEPENDENCY_P__TARGET;

    /**
     * The feature id for the '<em><b>Concurrent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_READ_P__CONCURRENT = DEPENDENCY_P__CONCURRENT;

    /**
     * The feature id for the '<em><b>Confluent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_READ_P__CONFLUENT = DEPENDENCY_P__CONFLUENT;

    /**
     * The number of structural features of the '<em>Absolute Write Read P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_READ_P_FEATURE_COUNT = DEPENDENCY_P_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_READ_P___GET_ANNOTATION__STRING = DEPENDENCY_P___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_READ_P___GET_ALL_ANNOTATIONS__STRING = DEPENDENCY_P___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_READ_P___REMOVE_ALL_ANNOTATIONS__STRING = DEPENDENCY_P___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Absolute Write Read P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_READ_P_OPERATION_COUNT = DEPENDENCY_P_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.RelativeWrite_Read_PImpl <em>Relative Write Read P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.RelativeWrite_Read_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getRelativeWrite_Read_P()
     * @generated
     */
    int RELATIVE_WRITE_READ_P = 14;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_WRITE_READ_P__ANNOTATIONS = DEPENDENCY_P__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_WRITE_READ_P__TARGET = DEPENDENCY_P__TARGET;

    /**
     * The feature id for the '<em><b>Concurrent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_WRITE_READ_P__CONCURRENT = DEPENDENCY_P__CONCURRENT;

    /**
     * The feature id for the '<em><b>Confluent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_WRITE_READ_P__CONFLUENT = DEPENDENCY_P__CONFLUENT;

    /**
     * The number of structural features of the '<em>Relative Write Read P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_WRITE_READ_P_FEATURE_COUNT = DEPENDENCY_P_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_WRITE_READ_P___GET_ANNOTATION__STRING = DEPENDENCY_P___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_WRITE_READ_P___GET_ALL_ANNOTATIONS__STRING = DEPENDENCY_P___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_WRITE_READ_P___REMOVE_ALL_ANNOTATIONS__STRING = DEPENDENCY_P___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Relative Write Read P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_WRITE_READ_P_OPERATION_COUNT = DEPENDENCY_P_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.AbsoluteWrite_RelativeWrite_PImpl <em>Absolute Write Relative Write P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.AbsoluteWrite_RelativeWrite_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getAbsoluteWrite_RelativeWrite_P()
     * @generated
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE_P = 15;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE_P__ANNOTATIONS = DEPENDENCY_P__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE_P__TARGET = DEPENDENCY_P__TARGET;

    /**
     * The feature id for the '<em><b>Concurrent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE_P__CONCURRENT = DEPENDENCY_P__CONCURRENT;

    /**
     * The feature id for the '<em><b>Confluent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE_P__CONFLUENT = DEPENDENCY_P__CONFLUENT;

    /**
     * The number of structural features of the '<em>Absolute Write Relative Write P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE_P_FEATURE_COUNT = DEPENDENCY_P_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE_P___GET_ANNOTATION__STRING = DEPENDENCY_P___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE_P___GET_ALL_ANNOTATIONS__STRING = DEPENDENCY_P___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE_P___REMOVE_ALL_ANNOTATIONS__STRING = DEPENDENCY_P___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Absolute Write Relative Write P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE_P_OPERATION_COUNT = DEPENDENCY_P_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.Write_Write_PImpl <em>Write Write P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.Write_Write_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getWrite_Write_P()
     * @generated
     */
    int WRITE_WRITE_P = 16;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_WRITE_P__ANNOTATIONS = DEPENDENCY_P__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_WRITE_P__TARGET = DEPENDENCY_P__TARGET;

    /**
     * The feature id for the '<em><b>Concurrent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_WRITE_P__CONCURRENT = DEPENDENCY_P__CONCURRENT;

    /**
     * The feature id for the '<em><b>Confluent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_WRITE_P__CONFLUENT = DEPENDENCY_P__CONFLUENT;

    /**
     * The number of structural features of the '<em>Write Write P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_WRITE_P_FEATURE_COUNT = DEPENDENCY_P_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_WRITE_P___GET_ANNOTATION__STRING = DEPENDENCY_P___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_WRITE_P___GET_ALL_ANNOTATIONS__STRING = DEPENDENCY_P___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_WRITE_P___REMOVE_ALL_ANNOTATIONS__STRING = DEPENDENCY_P___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Write Write P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_WRITE_P_OPERATION_COUNT = DEPENDENCY_P_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.BasicBlock_PImpl <em>Basic Block P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.BasicBlock_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getBasicBlock_P()
     * @generated
     */
    int BASIC_BLOCK_P = 17;

    /**
     * The feature id for the '<em><b>Scheduling Blocks</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_BLOCK_P__SCHEDULING_BLOCKS = 0;

    /**
     * The feature id for the '<em><b>Predecessors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_BLOCK_P__PREDECESSORS = 1;

    /**
     * The feature id for the '<em><b>Go Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_BLOCK_P__GO_BLOCK = 2;

    /**
     * The feature id for the '<em><b>Depth Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_BLOCK_P__DEPTH_BLOCK = 3;

    /**
     * The feature id for the '<em><b>Synchronizer Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_BLOCK_P__SYNCHRONIZER_BLOCK = 4;

    /**
     * The feature id for the '<em><b>Entry Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_BLOCK_P__ENTRY_BLOCK = 5;

    /**
     * The feature id for the '<em><b>Dead Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_BLOCK_P__DEAD_BLOCK = 6;

    /**
     * The feature id for the '<em><b>Pre Guard</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_BLOCK_P__PRE_GUARD = 7;

    /**
     * The number of structural features of the '<em>Basic Block P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_BLOCK_P_FEATURE_COUNT = 8;

    /**
     * The number of operations of the '<em>Basic Block P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_BLOCK_P_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.SchedulingBlock_PImpl <em>Scheduling Block P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.SchedulingBlock_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getSchedulingBlock_P()
     * @generated
     */
    int SCHEDULING_BLOCK_P = 18;

    /**
     * The feature id for the '<em><b>Nodes</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULING_BLOCK_P__NODES = 0;

    /**
     * The feature id for the '<em><b>Dependencies</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULING_BLOCK_P__DEPENDENCIES = 1;

    /**
     * The feature id for the '<em><b>Guard</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULING_BLOCK_P__GUARD = 2;

    /**
     * The number of structural features of the '<em>Scheduling Block P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULING_BLOCK_P_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Scheduling Block P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULING_BLOCK_P_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.Predecessor_PImpl <em>Predecessor P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.Predecessor_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getPredecessor_P()
     * @generated
     */
    int PREDECESSOR_P = 19;

    /**
     * The feature id for the '<em><b>Basic Block</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREDECESSOR_P__BASIC_BLOCK = 0;

    /**
     * The feature id for the '<em><b>Conditional</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREDECESSOR_P__CONDITIONAL = 1;

    /**
     * The feature id for the '<em><b>Branch Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREDECESSOR_P__BRANCH_TYPE = 2;

    /**
     * The number of structural features of the '<em>Predecessor P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREDECESSOR_P_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Predecessor P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREDECESSOR_P_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.Schedule_PImpl <em>Schedule P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.Schedule_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getSchedule_P()
     * @generated
     */
    int SCHEDULE_P = 20;

    /**
     * The feature id for the '<em><b>Scheduled Blocks</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_P__SCHEDULED_BLOCKS = 0;

    /**
     * The number of structural features of the '<em>Schedule P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_P_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Schedule P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_P_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.ScheduledBlock_PImpl <em>Scheduled Block P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.ScheduledBlock_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getScheduledBlock_P()
     * @generated
     */
    int SCHEDULED_BLOCK_P = 21;

    /**
     * The feature id for the '<em><b>Scheduling Block</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BLOCK_P__SCHEDULING_BLOCK = 0;

    /**
     * The feature id for the '<em><b>Schizophrenic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BLOCK_P__SCHIZOPHRENIC = 1;

    /**
     * The number of structural features of the '<em>Scheduled Block P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BLOCK_P_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Scheduled Block P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BLOCK_P_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.impl.Guard_PImpl <em>Guard P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.impl.Guard_PImpl
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getGuard_P()
     * @generated
     */
    int GUARD_P = 22;

    /**
     * The feature id for the '<em><b>Valued Object</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GUARD_P__VALUED_OBJECT = 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GUARD_P__EXPRESSION = 1;

    /**
     * The number of structural features of the '<em>Guard P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GUARD_P_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Guard P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GUARD_P_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgprios.BranchType_P <em>Branch Type P</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgprios.BranchType_P
     * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getBranchType_P()
     * @generated
     */
    int BRANCH_TYPE_P = 23;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.SCGraph_P <em>SC Graph P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SC Graph P</em>'.
     * @see de.cau.cs.kieler.scgprios.SCGraph_P
     * @generated
     */
    EClass getSCGraph_P();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgprios.SCGraph_P#getNodes <em>Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Nodes</em>'.
     * @see de.cau.cs.kieler.scgprios.SCGraph_P#getNodes()
     * @see #getSCGraph_P()
     * @generated
     */
    EReference getSCGraph_P_Nodes();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgprios.SCGraph_P#getDeclarations <em>Declarations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Declarations</em>'.
     * @see de.cau.cs.kieler.scgprios.SCGraph_P#getDeclarations()
     * @see #getSCGraph_P()
     * @generated
     */
    EReference getSCGraph_P_Declarations();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgprios.SCGraph_P#getBasicBlocks <em>Basic Blocks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Basic Blocks</em>'.
     * @see de.cau.cs.kieler.scgprios.SCGraph_P#getBasicBlocks()
     * @see #getSCGraph_P()
     * @generated
     */
    EReference getSCGraph_P_BasicBlocks();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgprios.SCGraph_P#getSchedules <em>Schedules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Schedules</em>'.
     * @see de.cau.cs.kieler.scgprios.SCGraph_P#getSchedules()
     * @see #getSCGraph_P()
     * @generated
     */
    EReference getSCGraph_P_Schedules();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgprios.SCGraph_P#getGuards <em>Guards</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Guards</em>'.
     * @see de.cau.cs.kieler.scgprios.SCGraph_P#getGuards()
     * @see #getSCGraph_P()
     * @generated
     */
    EReference getSCGraph_P_Guards();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgprios.SCGraph_P#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see de.cau.cs.kieler.scgprios.SCGraph_P#getLabel()
     * @see #getSCGraph_P()
     * @generated
     */
    EAttribute getSCGraph_P_Label();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.Node_P <em>Node P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node P</em>'.
     * @see de.cau.cs.kieler.scgprios.Node_P
     * @generated
     */
    EClass getNode_P();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scgprios.Node_P#getIncoming <em>Incoming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming</em>'.
     * @see de.cau.cs.kieler.scgprios.Node_P#getIncoming()
     * @see #getNode_P()
     * @generated
     */
    EReference getNode_P_Incoming();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgprios.Node_P#isIsInitial <em>Is Initial</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Initial</em>'.
     * @see de.cau.cs.kieler.scgprios.Node_P#isIsInitial()
     * @see #getNode_P()
     * @generated
     */
    EAttribute getNode_P_IsInitial();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgprios.Node_P#getDependencies <em>Dependencies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Dependencies</em>'.
     * @see de.cau.cs.kieler.scgprios.Node_P#getDependencies()
     * @see #getNode_P()
     * @generated
     */
    EReference getNode_P_Dependencies();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgprios.Node_P#getNodePriority <em>Node Priority</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Node Priority</em>'.
     * @see de.cau.cs.kieler.scgprios.Node_P#getNodePriority()
     * @see #getNode_P()
     * @generated
     */
    EAttribute getNode_P_NodePriority();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.Conditional_P <em>Conditional P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conditional P</em>'.
     * @see de.cau.cs.kieler.scgprios.Conditional_P
     * @generated
     */
    EClass getConditional_P();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scgprios.Conditional_P#getThen <em>Then</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Then</em>'.
     * @see de.cau.cs.kieler.scgprios.Conditional_P#getThen()
     * @see #getConditional_P()
     * @generated
     */
    EReference getConditional_P_Then();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scgprios.Conditional_P#getElse <em>Else</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Else</em>'.
     * @see de.cau.cs.kieler.scgprios.Conditional_P#getElse()
     * @see #getConditional_P()
     * @generated
     */
    EReference getConditional_P_Else();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scgprios.Conditional_P#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see de.cau.cs.kieler.scgprios.Conditional_P#getCondition()
     * @see #getConditional_P()
     * @generated
     */
    EReference getConditional_P_Condition();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.Surface_P <em>Surface P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Surface P</em>'.
     * @see de.cau.cs.kieler.scgprios.Surface_P
     * @generated
     */
    EClass getSurface_P();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgprios.Surface_P#getDepth <em>Depth</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Depth</em>'.
     * @see de.cau.cs.kieler.scgprios.Surface_P#getDepth()
     * @see #getSurface_P()
     * @generated
     */
    EReference getSurface_P_Depth();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.Depth_P <em>Depth P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Depth P</em>'.
     * @see de.cau.cs.kieler.scgprios.Depth_P
     * @generated
     */
    EClass getDepth_P();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgprios.Depth_P#getSurface <em>Surface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Surface</em>'.
     * @see de.cau.cs.kieler.scgprios.Depth_P#getSurface()
     * @see #getDepth_P()
     * @generated
     */
    EReference getDepth_P_Surface();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scgprios.Depth_P#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Next</em>'.
     * @see de.cau.cs.kieler.scgprios.Depth_P#getNext()
     * @see #getDepth_P()
     * @generated
     */
    EReference getDepth_P_Next();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.Assignment_P <em>Assignment P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment P</em>'.
     * @see de.cau.cs.kieler.scgprios.Assignment_P
     * @generated
     */
    EClass getAssignment_P();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scgprios.Assignment_P#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Next</em>'.
     * @see de.cau.cs.kieler.scgprios.Assignment_P#getNext()
     * @see #getAssignment_P()
     * @generated
     */
    EReference getAssignment_P_Next();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scgprios.Assignment_P#getAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Assignment</em>'.
     * @see de.cau.cs.kieler.scgprios.Assignment_P#getAssignment()
     * @see #getAssignment_P()
     * @generated
     */
    EReference getAssignment_P_Assignment();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgprios.Assignment_P#getValuedObject <em>Valued Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Valued Object</em>'.
     * @see de.cau.cs.kieler.scgprios.Assignment_P#getValuedObject()
     * @see #getAssignment_P()
     * @generated
     */
    EReference getAssignment_P_ValuedObject();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgprios.Assignment_P#getIndices <em>Indices</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Indices</em>'.
     * @see de.cau.cs.kieler.scgprios.Assignment_P#getIndices()
     * @see #getAssignment_P()
     * @generated
     */
    EReference getAssignment_P_Indices();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.Fork_P <em>Fork P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Fork P</em>'.
     * @see de.cau.cs.kieler.scgprios.Fork_P
     * @generated
     */
    EClass getFork_P();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgprios.Fork_P#getJoin <em>Join</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Join</em>'.
     * @see de.cau.cs.kieler.scgprios.Fork_P#getJoin()
     * @see #getFork_P()
     * @generated
     */
    EReference getFork_P_Join();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgprios.Fork_P#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Next</em>'.
     * @see de.cau.cs.kieler.scgprios.Fork_P#getNext()
     * @see #getFork_P()
     * @generated
     */
    EReference getFork_P_Next();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.Join_P <em>Join P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Join P</em>'.
     * @see de.cau.cs.kieler.scgprios.Join_P
     * @generated
     */
    EClass getJoin_P();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgprios.Join_P#getFork <em>Fork</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Fork</em>'.
     * @see de.cau.cs.kieler.scgprios.Join_P#getFork()
     * @see #getJoin_P()
     * @generated
     */
    EReference getJoin_P_Fork();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scgprios.Join_P#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Next</em>'.
     * @see de.cau.cs.kieler.scgprios.Join_P#getNext()
     * @see #getJoin_P()
     * @generated
     */
    EReference getJoin_P_Next();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.Link_P <em>Link P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link P</em>'.
     * @see de.cau.cs.kieler.scgprios.Link_P
     * @generated
     */
    EClass getLink_P();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgprios.Link_P#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see de.cau.cs.kieler.scgprios.Link_P#getTarget()
     * @see #getLink_P()
     * @generated
     */
    EReference getLink_P_Target();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.Entry_P <em>Entry P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entry P</em>'.
     * @see de.cau.cs.kieler.scgprios.Entry_P
     * @generated
     */
    EClass getEntry_P();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgprios.Entry_P#getExit <em>Exit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Exit</em>'.
     * @see de.cau.cs.kieler.scgprios.Entry_P#getExit()
     * @see #getEntry_P()
     * @generated
     */
    EReference getEntry_P_Exit();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scgprios.Entry_P#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Next</em>'.
     * @see de.cau.cs.kieler.scgprios.Entry_P#getNext()
     * @see #getEntry_P()
     * @generated
     */
    EReference getEntry_P_Next();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.Exit_P <em>Exit P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exit P</em>'.
     * @see de.cau.cs.kieler.scgprios.Exit_P
     * @generated
     */
    EClass getExit_P();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgprios.Exit_P#getEntry <em>Entry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entry</em>'.
     * @see de.cau.cs.kieler.scgprios.Exit_P#getEntry()
     * @see #getExit_P()
     * @generated
     */
    EReference getExit_P_Entry();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scgprios.Exit_P#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Next</em>'.
     * @see de.cau.cs.kieler.scgprios.Exit_P#getNext()
     * @see #getExit_P()
     * @generated
     */
    EReference getExit_P_Next();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.ControlFlow_P <em>Control Flow P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Control Flow P</em>'.
     * @see de.cau.cs.kieler.scgprios.ControlFlow_P
     * @generated
     */
    EClass getControlFlow_P();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.Dependency_P <em>Dependency P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dependency P</em>'.
     * @see de.cau.cs.kieler.scgprios.Dependency_P
     * @generated
     */
    EClass getDependency_P();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgprios.Dependency_P#isConcurrent <em>Concurrent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Concurrent</em>'.
     * @see de.cau.cs.kieler.scgprios.Dependency_P#isConcurrent()
     * @see #getDependency_P()
     * @generated
     */
    EAttribute getDependency_P_Concurrent();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgprios.Dependency_P#isConfluent <em>Confluent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Confluent</em>'.
     * @see de.cau.cs.kieler.scgprios.Dependency_P#isConfluent()
     * @see #getDependency_P()
     * @generated
     */
    EAttribute getDependency_P_Confluent();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.AbsoluteWrite_Read_P <em>Absolute Write Read P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Absolute Write Read P</em>'.
     * @see de.cau.cs.kieler.scgprios.AbsoluteWrite_Read_P
     * @generated
     */
    EClass getAbsoluteWrite_Read_P();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.RelativeWrite_Read_P <em>Relative Write Read P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relative Write Read P</em>'.
     * @see de.cau.cs.kieler.scgprios.RelativeWrite_Read_P
     * @generated
     */
    EClass getRelativeWrite_Read_P();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.AbsoluteWrite_RelativeWrite_P <em>Absolute Write Relative Write P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Absolute Write Relative Write P</em>'.
     * @see de.cau.cs.kieler.scgprios.AbsoluteWrite_RelativeWrite_P
     * @generated
     */
    EClass getAbsoluteWrite_RelativeWrite_P();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.Write_Write_P <em>Write Write P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Write Write P</em>'.
     * @see de.cau.cs.kieler.scgprios.Write_Write_P
     * @generated
     */
    EClass getWrite_Write_P();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.BasicBlock_P <em>Basic Block P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Basic Block P</em>'.
     * @see de.cau.cs.kieler.scgprios.BasicBlock_P
     * @generated
     */
    EClass getBasicBlock_P();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgprios.BasicBlock_P#getSchedulingBlocks <em>Scheduling Blocks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Scheduling Blocks</em>'.
     * @see de.cau.cs.kieler.scgprios.BasicBlock_P#getSchedulingBlocks()
     * @see #getBasicBlock_P()
     * @generated
     */
    EReference getBasicBlock_P_SchedulingBlocks();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgprios.BasicBlock_P#getPredecessors <em>Predecessors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Predecessors</em>'.
     * @see de.cau.cs.kieler.scgprios.BasicBlock_P#getPredecessors()
     * @see #getBasicBlock_P()
     * @generated
     */
    EReference getBasicBlock_P_Predecessors();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgprios.BasicBlock_P#isGoBlock <em>Go Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Go Block</em>'.
     * @see de.cau.cs.kieler.scgprios.BasicBlock_P#isGoBlock()
     * @see #getBasicBlock_P()
     * @generated
     */
    EAttribute getBasicBlock_P_GoBlock();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgprios.BasicBlock_P#isDepthBlock <em>Depth Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Depth Block</em>'.
     * @see de.cau.cs.kieler.scgprios.BasicBlock_P#isDepthBlock()
     * @see #getBasicBlock_P()
     * @generated
     */
    EAttribute getBasicBlock_P_DepthBlock();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgprios.BasicBlock_P#isSynchronizerBlock <em>Synchronizer Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Synchronizer Block</em>'.
     * @see de.cau.cs.kieler.scgprios.BasicBlock_P#isSynchronizerBlock()
     * @see #getBasicBlock_P()
     * @generated
     */
    EAttribute getBasicBlock_P_SynchronizerBlock();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgprios.BasicBlock_P#isEntryBlock <em>Entry Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Entry Block</em>'.
     * @see de.cau.cs.kieler.scgprios.BasicBlock_P#isEntryBlock()
     * @see #getBasicBlock_P()
     * @generated
     */
    EAttribute getBasicBlock_P_EntryBlock();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgprios.BasicBlock_P#isDeadBlock <em>Dead Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dead Block</em>'.
     * @see de.cau.cs.kieler.scgprios.BasicBlock_P#isDeadBlock()
     * @see #getBasicBlock_P()
     * @generated
     */
    EAttribute getBasicBlock_P_DeadBlock();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgprios.BasicBlock_P#getPreGuard <em>Pre Guard</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Pre Guard</em>'.
     * @see de.cau.cs.kieler.scgprios.BasicBlock_P#getPreGuard()
     * @see #getBasicBlock_P()
     * @generated
     */
    EReference getBasicBlock_P_PreGuard();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.SchedulingBlock_P <em>Scheduling Block P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scheduling Block P</em>'.
     * @see de.cau.cs.kieler.scgprios.SchedulingBlock_P
     * @generated
     */
    EClass getSchedulingBlock_P();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scgprios.SchedulingBlock_P#getNodes <em>Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Nodes</em>'.
     * @see de.cau.cs.kieler.scgprios.SchedulingBlock_P#getNodes()
     * @see #getSchedulingBlock_P()
     * @generated
     */
    EReference getSchedulingBlock_P_Nodes();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scgprios.SchedulingBlock_P#getDependencies <em>Dependencies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Dependencies</em>'.
     * @see de.cau.cs.kieler.scgprios.SchedulingBlock_P#getDependencies()
     * @see #getSchedulingBlock_P()
     * @generated
     */
    EReference getSchedulingBlock_P_Dependencies();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgprios.SchedulingBlock_P#getGuard <em>Guard</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Guard</em>'.
     * @see de.cau.cs.kieler.scgprios.SchedulingBlock_P#getGuard()
     * @see #getSchedulingBlock_P()
     * @generated
     */
    EReference getSchedulingBlock_P_Guard();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.Predecessor_P <em>Predecessor P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Predecessor P</em>'.
     * @see de.cau.cs.kieler.scgprios.Predecessor_P
     * @generated
     */
    EClass getPredecessor_P();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgprios.Predecessor_P#getBasicBlock <em>Basic Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Basic Block</em>'.
     * @see de.cau.cs.kieler.scgprios.Predecessor_P#getBasicBlock()
     * @see #getPredecessor_P()
     * @generated
     */
    EReference getPredecessor_P_BasicBlock();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgprios.Predecessor_P#getConditional <em>Conditional</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Conditional</em>'.
     * @see de.cau.cs.kieler.scgprios.Predecessor_P#getConditional()
     * @see #getPredecessor_P()
     * @generated
     */
    EReference getPredecessor_P_Conditional();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgprios.Predecessor_P#getBranchType <em>Branch Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Branch Type</em>'.
     * @see de.cau.cs.kieler.scgprios.Predecessor_P#getBranchType()
     * @see #getPredecessor_P()
     * @generated
     */
    EAttribute getPredecessor_P_BranchType();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.Schedule_P <em>Schedule P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Schedule P</em>'.
     * @see de.cau.cs.kieler.scgprios.Schedule_P
     * @generated
     */
    EClass getSchedule_P();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgprios.Schedule_P#getScheduledBlocks <em>Scheduled Blocks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Scheduled Blocks</em>'.
     * @see de.cau.cs.kieler.scgprios.Schedule_P#getScheduledBlocks()
     * @see #getSchedule_P()
     * @generated
     */
    EReference getSchedule_P_ScheduledBlocks();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.ScheduledBlock_P <em>Scheduled Block P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scheduled Block P</em>'.
     * @see de.cau.cs.kieler.scgprios.ScheduledBlock_P
     * @generated
     */
    EClass getScheduledBlock_P();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgprios.ScheduledBlock_P#getSchedulingBlock <em>Scheduling Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Scheduling Block</em>'.
     * @see de.cau.cs.kieler.scgprios.ScheduledBlock_P#getSchedulingBlock()
     * @see #getScheduledBlock_P()
     * @generated
     */
    EReference getScheduledBlock_P_SchedulingBlock();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgprios.ScheduledBlock_P#isSchizophrenic <em>Schizophrenic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schizophrenic</em>'.
     * @see de.cau.cs.kieler.scgprios.ScheduledBlock_P#isSchizophrenic()
     * @see #getScheduledBlock_P()
     * @generated
     */
    EAttribute getScheduledBlock_P_Schizophrenic();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgprios.Guard_P <em>Guard P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Guard P</em>'.
     * @see de.cau.cs.kieler.scgprios.Guard_P
     * @generated
     */
    EClass getGuard_P();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scgprios.Guard_P#getValuedObject <em>Valued Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Valued Object</em>'.
     * @see de.cau.cs.kieler.scgprios.Guard_P#getValuedObject()
     * @see #getGuard_P()
     * @generated
     */
    EReference getGuard_P_ValuedObject();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scgprios.Guard_P#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.scgprios.Guard_P#getExpression()
     * @see #getGuard_P()
     * @generated
     */
    EReference getGuard_P_Expression();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.scgprios.BranchType_P <em>Branch Type P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Branch Type P</em>'.
     * @see de.cau.cs.kieler.scgprios.BranchType_P
     * @generated
     */
    EEnum getBranchType_P();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ScgpriosFactory getScgpriosFactory();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.SCGraph_PImpl <em>SC Graph P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.SCGraph_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getSCGraph_P()
         * @generated
         */
        EClass SC_GRAPH_P = eINSTANCE.getSCGraph_P();

        /**
         * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SC_GRAPH_P__NODES = eINSTANCE.getSCGraph_P_Nodes();

        /**
         * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SC_GRAPH_P__DECLARATIONS = eINSTANCE.getSCGraph_P_Declarations();

        /**
         * The meta object literal for the '<em><b>Basic Blocks</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SC_GRAPH_P__BASIC_BLOCKS = eINSTANCE.getSCGraph_P_BasicBlocks();

        /**
         * The meta object literal for the '<em><b>Schedules</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SC_GRAPH_P__SCHEDULES = eINSTANCE.getSCGraph_P_Schedules();

        /**
         * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SC_GRAPH_P__GUARDS = eINSTANCE.getSCGraph_P_Guards();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SC_GRAPH_P__LABEL = eINSTANCE.getSCGraph_P_Label();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.Node_PImpl <em>Node P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.Node_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getNode_P()
         * @generated
         */
        EClass NODE_P = eINSTANCE.getNode_P();

        /**
         * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_P__INCOMING = eINSTANCE.getNode_P_Incoming();

        /**
         * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_P__IS_INITIAL = eINSTANCE.getNode_P_IsInitial();

        /**
         * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_P__DEPENDENCIES = eINSTANCE.getNode_P_Dependencies();

        /**
         * The meta object literal for the '<em><b>Node Priority</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_P__NODE_PRIORITY = eINSTANCE.getNode_P_NodePriority();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.Conditional_PImpl <em>Conditional P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.Conditional_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getConditional_P()
         * @generated
         */
        EClass CONDITIONAL_P = eINSTANCE.getConditional_P();

        /**
         * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONDITIONAL_P__THEN = eINSTANCE.getConditional_P_Then();

        /**
         * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONDITIONAL_P__ELSE = eINSTANCE.getConditional_P_Else();

        /**
         * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONDITIONAL_P__CONDITION = eINSTANCE.getConditional_P_Condition();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.Surface_PImpl <em>Surface P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.Surface_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getSurface_P()
         * @generated
         */
        EClass SURFACE_P = eINSTANCE.getSurface_P();

        /**
         * The meta object literal for the '<em><b>Depth</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SURFACE_P__DEPTH = eINSTANCE.getSurface_P_Depth();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.Depth_PImpl <em>Depth P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.Depth_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getDepth_P()
         * @generated
         */
        EClass DEPTH_P = eINSTANCE.getDepth_P();

        /**
         * The meta object literal for the '<em><b>Surface</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEPTH_P__SURFACE = eINSTANCE.getDepth_P_Surface();

        /**
         * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEPTH_P__NEXT = eINSTANCE.getDepth_P_Next();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.Assignment_PImpl <em>Assignment P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.Assignment_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getAssignment_P()
         * @generated
         */
        EClass ASSIGNMENT_P = eINSTANCE.getAssignment_P();

        /**
         * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT_P__NEXT = eINSTANCE.getAssignment_P_Next();

        /**
         * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT_P__ASSIGNMENT = eINSTANCE.getAssignment_P_Assignment();

        /**
         * The meta object literal for the '<em><b>Valued Object</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT_P__VALUED_OBJECT = eINSTANCE.getAssignment_P_ValuedObject();

        /**
         * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT_P__INDICES = eINSTANCE.getAssignment_P_Indices();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.Fork_PImpl <em>Fork P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.Fork_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getFork_P()
         * @generated
         */
        EClass FORK_P = eINSTANCE.getFork_P();

        /**
         * The meta object literal for the '<em><b>Join</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FORK_P__JOIN = eINSTANCE.getFork_P_Join();

        /**
         * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FORK_P__NEXT = eINSTANCE.getFork_P_Next();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.Join_PImpl <em>Join P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.Join_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getJoin_P()
         * @generated
         */
        EClass JOIN_P = eINSTANCE.getJoin_P();

        /**
         * The meta object literal for the '<em><b>Fork</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JOIN_P__FORK = eINSTANCE.getJoin_P_Fork();

        /**
         * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JOIN_P__NEXT = eINSTANCE.getJoin_P_Next();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.Link_PImpl <em>Link P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.Link_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getLink_P()
         * @generated
         */
        EClass LINK_P = eINSTANCE.getLink_P();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINK_P__TARGET = eINSTANCE.getLink_P_Target();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.Entry_PImpl <em>Entry P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.Entry_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getEntry_P()
         * @generated
         */
        EClass ENTRY_P = eINSTANCE.getEntry_P();

        /**
         * The meta object literal for the '<em><b>Exit</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTRY_P__EXIT = eINSTANCE.getEntry_P_Exit();

        /**
         * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTRY_P__NEXT = eINSTANCE.getEntry_P_Next();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.Exit_PImpl <em>Exit P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.Exit_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getExit_P()
         * @generated
         */
        EClass EXIT_P = eINSTANCE.getExit_P();

        /**
         * The meta object literal for the '<em><b>Entry</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXIT_P__ENTRY = eINSTANCE.getExit_P_Entry();

        /**
         * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXIT_P__NEXT = eINSTANCE.getExit_P_Next();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.ControlFlow_PImpl <em>Control Flow P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.ControlFlow_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getControlFlow_P()
         * @generated
         */
        EClass CONTROL_FLOW_P = eINSTANCE.getControlFlow_P();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.Dependency_PImpl <em>Dependency P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.Dependency_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getDependency_P()
         * @generated
         */
        EClass DEPENDENCY_P = eINSTANCE.getDependency_P();

        /**
         * The meta object literal for the '<em><b>Concurrent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEPENDENCY_P__CONCURRENT = eINSTANCE.getDependency_P_Concurrent();

        /**
         * The meta object literal for the '<em><b>Confluent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEPENDENCY_P__CONFLUENT = eINSTANCE.getDependency_P_Confluent();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.AbsoluteWrite_Read_PImpl <em>Absolute Write Read P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.AbsoluteWrite_Read_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getAbsoluteWrite_Read_P()
         * @generated
         */
        EClass ABSOLUTE_WRITE_READ_P = eINSTANCE.getAbsoluteWrite_Read_P();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.RelativeWrite_Read_PImpl <em>Relative Write Read P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.RelativeWrite_Read_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getRelativeWrite_Read_P()
         * @generated
         */
        EClass RELATIVE_WRITE_READ_P = eINSTANCE.getRelativeWrite_Read_P();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.AbsoluteWrite_RelativeWrite_PImpl <em>Absolute Write Relative Write P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.AbsoluteWrite_RelativeWrite_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getAbsoluteWrite_RelativeWrite_P()
         * @generated
         */
        EClass ABSOLUTE_WRITE_RELATIVE_WRITE_P = eINSTANCE.getAbsoluteWrite_RelativeWrite_P();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.Write_Write_PImpl <em>Write Write P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.Write_Write_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getWrite_Write_P()
         * @generated
         */
        EClass WRITE_WRITE_P = eINSTANCE.getWrite_Write_P();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.BasicBlock_PImpl <em>Basic Block P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.BasicBlock_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getBasicBlock_P()
         * @generated
         */
        EClass BASIC_BLOCK_P = eINSTANCE.getBasicBlock_P();

        /**
         * The meta object literal for the '<em><b>Scheduling Blocks</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASIC_BLOCK_P__SCHEDULING_BLOCKS = eINSTANCE.getBasicBlock_P_SchedulingBlocks();

        /**
         * The meta object literal for the '<em><b>Predecessors</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASIC_BLOCK_P__PREDECESSORS = eINSTANCE.getBasicBlock_P_Predecessors();

        /**
         * The meta object literal for the '<em><b>Go Block</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_BLOCK_P__GO_BLOCK = eINSTANCE.getBasicBlock_P_GoBlock();

        /**
         * The meta object literal for the '<em><b>Depth Block</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_BLOCK_P__DEPTH_BLOCK = eINSTANCE.getBasicBlock_P_DepthBlock();

        /**
         * The meta object literal for the '<em><b>Synchronizer Block</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_BLOCK_P__SYNCHRONIZER_BLOCK = eINSTANCE.getBasicBlock_P_SynchronizerBlock();

        /**
         * The meta object literal for the '<em><b>Entry Block</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_BLOCK_P__ENTRY_BLOCK = eINSTANCE.getBasicBlock_P_EntryBlock();

        /**
         * The meta object literal for the '<em><b>Dead Block</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_BLOCK_P__DEAD_BLOCK = eINSTANCE.getBasicBlock_P_DeadBlock();

        /**
         * The meta object literal for the '<em><b>Pre Guard</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASIC_BLOCK_P__PRE_GUARD = eINSTANCE.getBasicBlock_P_PreGuard();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.SchedulingBlock_PImpl <em>Scheduling Block P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.SchedulingBlock_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getSchedulingBlock_P()
         * @generated
         */
        EClass SCHEDULING_BLOCK_P = eINSTANCE.getSchedulingBlock_P();

        /**
         * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEDULING_BLOCK_P__NODES = eINSTANCE.getSchedulingBlock_P_Nodes();

        /**
         * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEDULING_BLOCK_P__DEPENDENCIES = eINSTANCE.getSchedulingBlock_P_Dependencies();

        /**
         * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEDULING_BLOCK_P__GUARD = eINSTANCE.getSchedulingBlock_P_Guard();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.Predecessor_PImpl <em>Predecessor P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.Predecessor_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getPredecessor_P()
         * @generated
         */
        EClass PREDECESSOR_P = eINSTANCE.getPredecessor_P();

        /**
         * The meta object literal for the '<em><b>Basic Block</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PREDECESSOR_P__BASIC_BLOCK = eINSTANCE.getPredecessor_P_BasicBlock();

        /**
         * The meta object literal for the '<em><b>Conditional</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PREDECESSOR_P__CONDITIONAL = eINSTANCE.getPredecessor_P_Conditional();

        /**
         * The meta object literal for the '<em><b>Branch Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PREDECESSOR_P__BRANCH_TYPE = eINSTANCE.getPredecessor_P_BranchType();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.Schedule_PImpl <em>Schedule P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.Schedule_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getSchedule_P()
         * @generated
         */
        EClass SCHEDULE_P = eINSTANCE.getSchedule_P();

        /**
         * The meta object literal for the '<em><b>Scheduled Blocks</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEDULE_P__SCHEDULED_BLOCKS = eINSTANCE.getSchedule_P_ScheduledBlocks();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.ScheduledBlock_PImpl <em>Scheduled Block P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.ScheduledBlock_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getScheduledBlock_P()
         * @generated
         */
        EClass SCHEDULED_BLOCK_P = eINSTANCE.getScheduledBlock_P();

        /**
         * The meta object literal for the '<em><b>Scheduling Block</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEDULED_BLOCK_P__SCHEDULING_BLOCK = eINSTANCE.getScheduledBlock_P_SchedulingBlock();

        /**
         * The meta object literal for the '<em><b>Schizophrenic</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULED_BLOCK_P__SCHIZOPHRENIC = eINSTANCE.getScheduledBlock_P_Schizophrenic();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.impl.Guard_PImpl <em>Guard P</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.impl.Guard_PImpl
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getGuard_P()
         * @generated
         */
        EClass GUARD_P = eINSTANCE.getGuard_P();

        /**
         * The meta object literal for the '<em><b>Valued Object</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GUARD_P__VALUED_OBJECT = eINSTANCE.getGuard_P_ValuedObject();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GUARD_P__EXPRESSION = eINSTANCE.getGuard_P_Expression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgprios.BranchType_P <em>Branch Type P</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgprios.BranchType_P
         * @see de.cau.cs.kieler.scgprios.impl.ScgpriosPackageImpl#getBranchType_P()
         * @generated
         */
        EEnum BRANCH_TYPE_P = eINSTANCE.getBranchType_P();

    }

} //ScgpriosPackage
