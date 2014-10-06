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
package de.cau.cs.kieler.scg;

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
 * @see de.cau.cs.kieler.scg.ScgFactory
 * @model kind="package"
 * @generated
 */
public interface ScgPackage extends EPackage {
    /**
	 * The package name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "scg";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "http://kieler.cs.cau.de/scg/0.1.0";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "scg";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    ScgPackage eINSTANCE = de.cau.cs.kieler.scg.impl.ScgPackageImpl.init();

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.NodeImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getNode()
	 * @generated
	 */
    int NODE = 1;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.ConditionalImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getConditional()
	 * @generated
	 */
    int CONDITIONAL = 2;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.SurfaceImpl <em>Surface</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.SurfaceImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSurface()
	 * @generated
	 */
    int SURFACE = 3;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.DepthImpl <em>Depth</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.DepthImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getDepth()
	 * @generated
	 */
    int DEPTH = 4;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.AssignmentImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getAssignment()
	 * @generated
	 */
    int ASSIGNMENT = 5;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.ForkImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getFork()
	 * @generated
	 */
    int FORK = 6;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.JoinImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getJoin()
	 * @generated
	 */
    int JOIN = 7;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.LinkImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getLink()
	 * @generated
	 */
    int LINK = 8;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.SCGraphImpl <em>SC Graph</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.SCGraphImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSCGraph()
	 * @generated
	 */
    int SC_GRAPH = 0;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_GRAPH__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

				/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH__NODES = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH__DECLARATIONS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Basic Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH__BASIC_BLOCKS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Schedules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH__SCHEDULES = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH__GUARDS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 4;

    /**
	 * The number of structural features of the '<em>SC Graph</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE__INCOMING = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE__IS_INITIAL = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE__DEPENDENCIES = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     * @ordered
     */
    int NODE___GET_ANNOTATION__STRING = 0;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     * @ordered
     */
    int NODE___GET_ALL_ANNOTATIONS__STRING = 0;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     * @ordered
     */
    int NODE___REMOVE_ALL_ANNOTATIONS__STRING = 0;

    /**
     * The number of operations of the '<em>Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     * @ordered
     */
    int NODE_OPERATION_COUNT = 0 + 0;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONDITIONAL__ANNOTATIONS = NODE__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONDITIONAL__INCOMING = NODE__INCOMING;

    /**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONDITIONAL__IS_INITIAL = NODE__IS_INITIAL;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONDITIONAL__DEPENDENCIES = NODE__DEPENDENCIES;

    /**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONDITIONAL__THEN = NODE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONDITIONAL__ELSE = NODE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONDITIONAL__CONDITION = NODE_FEATURE_COUNT + 2;

    /**
	 * The number of structural features of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONDITIONAL_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SURFACE__ANNOTATIONS = NODE__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SURFACE__INCOMING = NODE__INCOMING;

    /**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SURFACE__IS_INITIAL = NODE__IS_INITIAL;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SURFACE__DEPENDENCIES = NODE__DEPENDENCIES;

    /**
	 * The feature id for the '<em><b>Depth</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SURFACE__DEPTH = NODE_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>Surface</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SURFACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPTH__ANNOTATIONS = NODE__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPTH__INCOMING = NODE__INCOMING;

    /**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPTH__IS_INITIAL = NODE__IS_INITIAL;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPTH__DEPENDENCIES = NODE__DEPENDENCIES;

    /**
	 * The feature id for the '<em><b>Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPTH__SURFACE = NODE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPTH__NEXT = NODE_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Depth</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPTH_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT__ANNOTATIONS = NODE__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT__INCOMING = NODE__INCOMING;

    /**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT__IS_INITIAL = NODE__IS_INITIAL;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT__DEPENDENCIES = NODE__DEPENDENCIES;

    /**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT__NEXT = NODE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT__ASSIGNMENT = NODE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Valued Object</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT__VALUED_OBJECT = NODE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Indices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__INDICES = NODE_FEATURE_COUNT + 3;

    /**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
   int ASSIGNMENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FORK__ANNOTATIONS = NODE__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FORK__INCOMING = NODE__INCOMING;

    /**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FORK__IS_INITIAL = NODE__IS_INITIAL;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FORK__DEPENDENCIES = NODE__DEPENDENCIES;

    /**
	 * The feature id for the '<em><b>Join</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FORK__JOIN = NODE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FORK__NEXT = NODE_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FORK_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JOIN__ANNOTATIONS = NODE__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JOIN__INCOMING = NODE__INCOMING;

    /**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JOIN__IS_INITIAL = NODE__IS_INITIAL;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JOIN__DEPENDENCIES = NODE__DEPENDENCIES;

    /**
	 * The feature id for the '<em><b>Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JOIN__FORK = NODE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JOIN__NEXT = NODE_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JOIN_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

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
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LINK_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     * @ordered
     */
    int LINK___GET_ANNOTATION__STRING = 0;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     * @ordered
     */
    int LINK___GET_ALL_ANNOTATIONS__STRING = 0;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     * @ordered
     */
    int LINK___REMOVE_ALL_ANNOTATIONS__STRING = 0;

    /**
     * The number of operations of the '<em>Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     * @ordered
     */
    int LINK_OPERATION_COUNT = 0 + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.EntryImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getEntry()
	 * @generated
	 */
    int ENTRY = 9;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENTRY__ANNOTATIONS = NODE__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENTRY__INCOMING = NODE__INCOMING;

    /**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENTRY__IS_INITIAL = NODE__IS_INITIAL;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENTRY__DEPENDENCIES = NODE__DEPENDENCIES;

    /**
	 * The feature id for the '<em><b>Exit</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENTRY__EXIT = NODE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENTRY__NEXT = NODE_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENTRY_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.ExitImpl <em>Exit</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.ExitImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getExit()
	 * @generated
	 */
    int EXIT = 10;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXIT__ANNOTATIONS = NODE__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXIT__INCOMING = NODE__INCOMING;

    /**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXIT__IS_INITIAL = NODE__IS_INITIAL;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXIT__DEPENDENCIES = NODE__DEPENDENCIES;

    /**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXIT__ENTRY = NODE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXIT__NEXT = NODE_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Exit</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXIT_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.ControlFlowImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getControlFlow()
	 * @generated
	 */
    int CONTROL_FLOW = 11;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTROL_FLOW__ANNOTATIONS = LINK__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTROL_FLOW__TARGET = LINK__TARGET;

    /**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTROL_FLOW_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.DependencyImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getDependency()
	 * @generated
	 */
    int DEPENDENCY = 12;

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
	 * The feature id for the '<em><b>Concurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPENDENCY__CONCURRENT = LINK_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Confluent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPENDENCY__CONFLUENT = LINK_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPENDENCY_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.AbsoluteWrite_ReadImpl <em>Absolute Write Read</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.AbsoluteWrite_ReadImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getAbsoluteWrite_Read()
	 * @generated
	 */
    int ABSOLUTE_WRITE_READ = 13;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_WRITE_READ__ANNOTATIONS = DEPENDENCY__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_WRITE_READ__TARGET = DEPENDENCY__TARGET;

    /**
	 * The feature id for the '<em><b>Concurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_WRITE_READ__CONCURRENT = DEPENDENCY__CONCURRENT;

    /**
	 * The feature id for the '<em><b>Confluent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_WRITE_READ__CONFLUENT = DEPENDENCY__CONFLUENT;

    /**
	 * The number of structural features of the '<em>Absolute Write Read</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_WRITE_READ_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.RelativeWrite_ReadImpl <em>Relative Write Read</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.RelativeWrite_ReadImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getRelativeWrite_Read()
	 * @generated
	 */
    int RELATIVE_WRITE_READ = 14;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIVE_WRITE_READ__ANNOTATIONS = DEPENDENCY__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIVE_WRITE_READ__TARGET = DEPENDENCY__TARGET;

    /**
	 * The feature id for the '<em><b>Concurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIVE_WRITE_READ__CONCURRENT = DEPENDENCY__CONCURRENT;

    /**
	 * The feature id for the '<em><b>Confluent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIVE_WRITE_READ__CONFLUENT = DEPENDENCY__CONFLUENT;

    /**
	 * The number of structural features of the '<em>Relative Write Read</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIVE_WRITE_READ_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.AbsoluteWrite_RelativeWriteImpl <em>Absolute Write Relative Write</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.AbsoluteWrite_RelativeWriteImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getAbsoluteWrite_RelativeWrite()
	 * @generated
	 */
    int ABSOLUTE_WRITE_RELATIVE_WRITE = 15;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_WRITE_RELATIVE_WRITE__ANNOTATIONS = DEPENDENCY__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_WRITE_RELATIVE_WRITE__TARGET = DEPENDENCY__TARGET;

    /**
	 * The feature id for the '<em><b>Concurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_WRITE_RELATIVE_WRITE__CONCURRENT = DEPENDENCY__CONCURRENT;

    /**
	 * The feature id for the '<em><b>Confluent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_WRITE_RELATIVE_WRITE__CONFLUENT = DEPENDENCY__CONFLUENT;

    /**
	 * The number of structural features of the '<em>Absolute Write Relative Write</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_WRITE_RELATIVE_WRITE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.Write_WriteImpl <em>Write Write</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.Write_WriteImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getWrite_Write()
	 * @generated
	 */
    int WRITE_WRITE = 16;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WRITE_WRITE__ANNOTATIONS = DEPENDENCY__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WRITE_WRITE__TARGET = DEPENDENCY__TARGET;

    /**
	 * The feature id for the '<em><b>Concurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WRITE_WRITE__CONCURRENT = DEPENDENCY__CONCURRENT;

    /**
	 * The feature id for the '<em><b>Confluent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WRITE_WRITE__CONFLUENT = DEPENDENCY__CONFLUENT;

    /**
	 * The number of structural features of the '<em>Write Write</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WRITE_WRITE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl <em>Basic Block</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.BasicBlockImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getBasicBlock()
	 * @generated
	 */
    int BASIC_BLOCK = 17;

    /**
	 * The feature id for the '<em><b>Scheduling Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASIC_BLOCK__SCHEDULING_BLOCKS = 0;

    /**
	 * The feature id for the '<em><b>Predecessors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASIC_BLOCK__PREDECESSORS = 1;

    /**
	 * The feature id for the '<em><b>Go Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASIC_BLOCK__GO_BLOCK = 2;

    /**
	 * The feature id for the '<em><b>Depth Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASIC_BLOCK__DEPTH_BLOCK = 3;

    /**
	 * The feature id for the '<em><b>Synchronizer Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASIC_BLOCK__SYNCHRONIZER_BLOCK = 4;

    /**
	 * The feature id for the '<em><b>Entry Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__ENTRY_BLOCK = 5;

				/**
	 * The feature id for the '<em><b>Dead Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASIC_BLOCK__DEAD_BLOCK = 6;

    /**
	 * The feature id for the '<em><b>Pre Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASIC_BLOCK__PRE_GUARD = 7;

    /**
	 * The number of structural features of the '<em>Basic Block</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASIC_BLOCK_FEATURE_COUNT = 8;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.SchedulingBlockImpl <em>Scheduling Block</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.SchedulingBlockImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSchedulingBlock()
	 * @generated
	 */
    int SCHEDULING_BLOCK = 18;

    /**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCHEDULING_BLOCK__NODES = 0;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCHEDULING_BLOCK__DEPENDENCIES = 1;

    /**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCHEDULING_BLOCK__GUARD = 2;

    /**
	 * The number of structural features of the '<em>Scheduling Block</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCHEDULING_BLOCK_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.PredecessorImpl <em>Predecessor</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.PredecessorImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getPredecessor()
	 * @generated
	 */
    int PREDECESSOR = 19;

    /**
	 * The feature id for the '<em><b>Basic Block</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PREDECESSOR__BASIC_BLOCK = 0;

    /**
	 * The feature id for the '<em><b>Conditional</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PREDECESSOR__CONDITIONAL = 1;

    /**
	 * The feature id for the '<em><b>Branch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__BRANCH_TYPE = 2;

				/**
	 * The number of structural features of the '<em>Predecessor</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PREDECESSOR_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.ScheduleImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSchedule()
	 * @generated
	 */
    int SCHEDULE = 20;

    /**
	 * The feature id for the '<em><b>Scheduled Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__SCHEDULED_BLOCKS = 0;

				/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCHEDULE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.ScheduledBlockImpl <em>Scheduled Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.ScheduledBlockImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getScheduledBlock()
	 * @generated
	 */
	int SCHEDULED_BLOCK = 21;

				/**
	 * The feature id for the '<em><b>Scheduling Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_BLOCK__SCHEDULING_BLOCK = 0;

				/**
	 * The feature id for the '<em><b>Schizophrenic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_BLOCK__SCHIZOPHRENIC = 1;

				/**
	 * The number of structural features of the '<em>Scheduled Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_BLOCK_FEATURE_COUNT = 2;

				/**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.GuardImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getGuard()
	 * @generated
	 */
    int GUARD = 22;

                /**
	 * The feature id for the '<em><b>Valued Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GUARD__VALUED_OBJECT = 0;

                /**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GUARD__EXPRESSION = 1;

                /**
	 * The feature id for the '<em><b>Schizophrenic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__SCHIZOPHRENIC = 2;

																/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GUARD_FEATURE_COUNT = 3;

                /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.BranchType <em>Branch Type</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.BranchType
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getBranchType()
	 * @generated
	 */
    int BRANCH_TYPE = 23;

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.cau.cs.kieler.scg.Node
	 * @generated
	 */
    EClass getNode();

    /**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scg.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see de.cau.cs.kieler.scg.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
    EReference getNode_Incoming();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.Node#isIsInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see de.cau.cs.kieler.scg.Node#isIsInitial()
	 * @see #getNode()
	 * @generated
	 */
    EAttribute getNode_IsInitial();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.Node#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see de.cau.cs.kieler.scg.Node#getDependencies()
	 * @see #getNode()
	 * @generated
	 */
    EReference getNode_Dependencies();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see de.cau.cs.kieler.scg.Conditional
	 * @generated
	 */
    EClass getConditional();

    /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Conditional#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see de.cau.cs.kieler.scg.Conditional#getThen()
	 * @see #getConditional()
	 * @generated
	 */
    EReference getConditional_Then();

    /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Conditional#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see de.cau.cs.kieler.scg.Conditional#getElse()
	 * @see #getConditional()
	 * @generated
	 */
    EReference getConditional_Else();

    /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Conditional#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see de.cau.cs.kieler.scg.Conditional#getCondition()
	 * @see #getConditional()
	 * @generated
	 */
    EReference getConditional_Condition();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Surface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface</em>'.
	 * @see de.cau.cs.kieler.scg.Surface
	 * @generated
	 */
    EClass getSurface();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Surface#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depth</em>'.
	 * @see de.cau.cs.kieler.scg.Surface#getDepth()
	 * @see #getSurface()
	 * @generated
	 */
    EReference getSurface_Depth();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Depth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depth</em>'.
	 * @see de.cau.cs.kieler.scg.Depth
	 * @generated
	 */
    EClass getDepth();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Depth#getSurface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Surface</em>'.
	 * @see de.cau.cs.kieler.scg.Depth#getSurface()
	 * @see #getDepth()
	 * @generated
	 */
    EReference getDepth_Surface();

    /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Depth#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see de.cau.cs.kieler.scg.Depth#getNext()
	 * @see #getDepth()
	 * @generated
	 */
    EReference getDepth_Next();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see de.cau.cs.kieler.scg.Assignment
	 * @generated
	 */
    EClass getAssignment();

    /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Assignment#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see de.cau.cs.kieler.scg.Assignment#getNext()
	 * @see #getAssignment()
	 * @generated
	 */
    EReference getAssignment_Next();

    /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Assignment#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignment</em>'.
	 * @see de.cau.cs.kieler.scg.Assignment#getAssignment()
	 * @see #getAssignment()
	 * @generated
	 */
    EReference getAssignment_Assignment();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Assignment#getValuedObject <em>Valued Object</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valued Object</em>'.
	 * @see de.cau.cs.kieler.scg.Assignment#getValuedObject()
	 * @see #getAssignment()
	 * @generated
	 */
    EReference getAssignment_ValuedObject();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.Assignment#getIndices <em>Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indices</em>'.
	 * @see de.cau.cs.kieler.scg.Assignment#getIndices()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Indices();

				/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see de.cau.cs.kieler.scg.Fork
	 * @generated
	 */
    EClass getFork();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Fork#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Join</em>'.
	 * @see de.cau.cs.kieler.scg.Fork#getJoin()
	 * @see #getFork()
	 * @generated
	 */
    EReference getFork_Join();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.Fork#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next</em>'.
	 * @see de.cau.cs.kieler.scg.Fork#getNext()
	 * @see #getFork()
	 * @generated
	 */
    EReference getFork_Next();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see de.cau.cs.kieler.scg.Join
	 * @generated
	 */
    EClass getJoin();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Join#getFork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fork</em>'.
	 * @see de.cau.cs.kieler.scg.Join#getFork()
	 * @see #getJoin()
	 * @generated
	 */
    EReference getJoin_Fork();

    /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Join#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see de.cau.cs.kieler.scg.Join#getNext()
	 * @see #getJoin()
	 * @generated
	 */
    EReference getJoin_Next();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see de.cau.cs.kieler.scg.Link
	 * @generated
	 */
    EClass getLink();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.cau.cs.kieler.scg.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
    EReference getLink_Target();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.SCGraph <em>SC Graph</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SC Graph</em>'.
	 * @see de.cau.cs.kieler.scg.SCGraph
	 * @generated
	 */
    EClass getSCGraph();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.SCGraph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see de.cau.cs.kieler.scg.SCGraph#getNodes()
	 * @see #getSCGraph()
	 * @generated
	 */
    EReference getSCGraph_Nodes();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.SCGraph#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.cau.cs.kieler.scg.SCGraph#getDeclarations()
	 * @see #getSCGraph()
	 * @generated
	 */
    EReference getSCGraph_Declarations();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.SCGraph#getBasicBlocks <em>Basic Blocks</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Blocks</em>'.
	 * @see de.cau.cs.kieler.scg.SCGraph#getBasicBlocks()
	 * @see #getSCGraph()
	 * @generated
	 */
    EReference getSCGraph_BasicBlocks();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.SCGraph#getSchedules <em>Schedules</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schedules</em>'.
	 * @see de.cau.cs.kieler.scg.SCGraph#getSchedules()
	 * @see #getSCGraph()
	 * @generated
	 */
    EReference getSCGraph_Schedules();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.SCGraph#getGuards <em>Guards</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guards</em>'.
	 * @see de.cau.cs.kieler.scg.SCGraph#getGuards()
	 * @see #getSCGraph()
	 * @generated
	 */
    EReference getSCGraph_Guards();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see de.cau.cs.kieler.scg.Entry
	 * @generated
	 */
    EClass getEntry();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Entry#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exit</em>'.
	 * @see de.cau.cs.kieler.scg.Entry#getExit()
	 * @see #getEntry()
	 * @generated
	 */
    EReference getEntry_Exit();

    /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Entry#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see de.cau.cs.kieler.scg.Entry#getNext()
	 * @see #getEntry()
	 * @generated
	 */
    EReference getEntry_Next();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Exit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit</em>'.
	 * @see de.cau.cs.kieler.scg.Exit
	 * @generated
	 */
    EClass getExit();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Exit#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry</em>'.
	 * @see de.cau.cs.kieler.scg.Exit#getEntry()
	 * @see #getExit()
	 * @generated
	 */
    EReference getExit_Entry();

    /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Exit#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see de.cau.cs.kieler.scg.Exit#getNext()
	 * @see #getExit()
	 * @generated
	 */
    EReference getExit_Next();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see de.cau.cs.kieler.scg.ControlFlow
	 * @generated
	 */
    EClass getControlFlow();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see de.cau.cs.kieler.scg.Dependency
	 * @generated
	 */
    EClass getDependency();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.Dependency#isConcurrent <em>Concurrent</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrent</em>'.
	 * @see de.cau.cs.kieler.scg.Dependency#isConcurrent()
	 * @see #getDependency()
	 * @generated
	 */
    EAttribute getDependency_Concurrent();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.Dependency#isConfluent <em>Confluent</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confluent</em>'.
	 * @see de.cau.cs.kieler.scg.Dependency#isConfluent()
	 * @see #getDependency()
	 * @generated
	 */
    EAttribute getDependency_Confluent();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.AbsoluteWrite_Read <em>Absolute Write Read</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Write Read</em>'.
	 * @see de.cau.cs.kieler.scg.AbsoluteWrite_Read
	 * @generated
	 */
    EClass getAbsoluteWrite_Read();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.RelativeWrite_Read <em>Relative Write Read</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Write Read</em>'.
	 * @see de.cau.cs.kieler.scg.RelativeWrite_Read
	 * @generated
	 */
    EClass getRelativeWrite_Read();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.AbsoluteWrite_RelativeWrite <em>Absolute Write Relative Write</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Write Relative Write</em>'.
	 * @see de.cau.cs.kieler.scg.AbsoluteWrite_RelativeWrite
	 * @generated
	 */
    EClass getAbsoluteWrite_RelativeWrite();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Write_Write <em>Write Write</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Write</em>'.
	 * @see de.cau.cs.kieler.scg.Write_Write
	 * @generated
	 */
    EClass getWrite_Write();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.BasicBlock <em>Basic Block</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Block</em>'.
	 * @see de.cau.cs.kieler.scg.BasicBlock
	 * @generated
	 */
    EClass getBasicBlock();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.BasicBlock#getSchedulingBlocks <em>Scheduling Blocks</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduling Blocks</em>'.
	 * @see de.cau.cs.kieler.scg.BasicBlock#getSchedulingBlocks()
	 * @see #getBasicBlock()
	 * @generated
	 */
    EReference getBasicBlock_SchedulingBlocks();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.BasicBlock#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predecessors</em>'.
	 * @see de.cau.cs.kieler.scg.BasicBlock#getPredecessors()
	 * @see #getBasicBlock()
	 * @generated
	 */
    EReference getBasicBlock_Predecessors();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.BasicBlock#isGoBlock <em>Go Block</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Go Block</em>'.
	 * @see de.cau.cs.kieler.scg.BasicBlock#isGoBlock()
	 * @see #getBasicBlock()
	 * @generated
	 */
    EAttribute getBasicBlock_GoBlock();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.BasicBlock#isDepthBlock <em>Depth Block</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth Block</em>'.
	 * @see de.cau.cs.kieler.scg.BasicBlock#isDepthBlock()
	 * @see #getBasicBlock()
	 * @generated
	 */
    EAttribute getBasicBlock_DepthBlock();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.BasicBlock#isSynchronizerBlock <em>Synchronizer Block</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronizer Block</em>'.
	 * @see de.cau.cs.kieler.scg.BasicBlock#isSynchronizerBlock()
	 * @see #getBasicBlock()
	 * @generated
	 */
    EAttribute getBasicBlock_SynchronizerBlock();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.BasicBlock#isEntryBlock <em>Entry Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Block</em>'.
	 * @see de.cau.cs.kieler.scg.BasicBlock#isEntryBlock()
	 * @see #getBasicBlock()
	 * @generated
	 */
	EAttribute getBasicBlock_EntryBlock();

				/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.BasicBlock#isDeadBlock <em>Dead Block</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dead Block</em>'.
	 * @see de.cau.cs.kieler.scg.BasicBlock#isDeadBlock()
	 * @see #getBasicBlock()
	 * @generated
	 */
    EAttribute getBasicBlock_DeadBlock();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.BasicBlock#getPreGuard <em>Pre Guard</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre Guard</em>'.
	 * @see de.cau.cs.kieler.scg.BasicBlock#getPreGuard()
	 * @see #getBasicBlock()
	 * @generated
	 */
    EReference getBasicBlock_PreGuard();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.SchedulingBlock <em>Scheduling Block</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Block</em>'.
	 * @see de.cau.cs.kieler.scg.SchedulingBlock
	 * @generated
	 */
    EClass getSchedulingBlock();

    /**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scg.SchedulingBlock#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see de.cau.cs.kieler.scg.SchedulingBlock#getNodes()
	 * @see #getSchedulingBlock()
	 * @generated
	 */
    EReference getSchedulingBlock_Nodes();

    /**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scg.SchedulingBlock#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see de.cau.cs.kieler.scg.SchedulingBlock#getDependencies()
	 * @see #getSchedulingBlock()
	 * @generated
	 */
    EReference getSchedulingBlock_Dependencies();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.SchedulingBlock#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see de.cau.cs.kieler.scg.SchedulingBlock#getGuard()
	 * @see #getSchedulingBlock()
	 * @generated
	 */
    EReference getSchedulingBlock_Guard();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Predecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predecessor</em>'.
	 * @see de.cau.cs.kieler.scg.Predecessor
	 * @generated
	 */
    EClass getPredecessor();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Predecessor#getBasicBlock <em>Basic Block</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Basic Block</em>'.
	 * @see de.cau.cs.kieler.scg.Predecessor#getBasicBlock()
	 * @see #getPredecessor()
	 * @generated
	 */
    EReference getPredecessor_BasicBlock();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.Predecessor#getConditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conditional</em>'.
	 * @see de.cau.cs.kieler.scg.Predecessor#getConditional()
	 * @see #getPredecessor()
	 * @generated
	 */
    EReference getPredecessor_Conditional();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.Predecessor#getBranchType <em>Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch Type</em>'.
	 * @see de.cau.cs.kieler.scg.Predecessor#getBranchType()
	 * @see #getPredecessor()
	 * @generated
	 */
	EAttribute getPredecessor_BranchType();

				/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see de.cau.cs.kieler.scg.Schedule
	 * @generated
	 */
    EClass getSchedule();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scg.Schedule#getScheduledBlocks <em>Scheduled Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduled Blocks</em>'.
	 * @see de.cau.cs.kieler.scg.Schedule#getScheduledBlocks()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_ScheduledBlocks();

				/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.ScheduledBlock <em>Scheduled Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduled Block</em>'.
	 * @see de.cau.cs.kieler.scg.ScheduledBlock
	 * @generated
	 */
	EClass getScheduledBlock();

				/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scg.ScheduledBlock#getSchedulingBlock <em>Scheduling Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduling Block</em>'.
	 * @see de.cau.cs.kieler.scg.ScheduledBlock#getSchedulingBlock()
	 * @see #getScheduledBlock()
	 * @generated
	 */
	EReference getScheduledBlock_SchedulingBlock();

				/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.ScheduledBlock#isSchizophrenic <em>Schizophrenic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schizophrenic</em>'.
	 * @see de.cau.cs.kieler.scg.ScheduledBlock#isSchizophrenic()
	 * @see #getScheduledBlock()
	 * @generated
	 */
	EAttribute getScheduledBlock_Schizophrenic();

				/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scg.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see de.cau.cs.kieler.scg.Guard
	 * @generated
	 */
    EClass getGuard();

                /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Guard#getValuedObject <em>Valued Object</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valued Object</em>'.
	 * @see de.cau.cs.kieler.scg.Guard#getValuedObject()
	 * @see #getGuard()
	 * @generated
	 */
    EReference getGuard_ValuedObject();

                /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scg.Guard#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see de.cau.cs.kieler.scg.Guard#getExpression()
	 * @see #getGuard()
	 * @generated
	 */
    EReference getGuard_Expression();

                /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scg.Guard#isSchizophrenic <em>Schizophrenic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schizophrenic</em>'.
	 * @see de.cau.cs.kieler.scg.Guard#isSchizophrenic()
	 * @see #getGuard()
	 * @generated
	 */
	EAttribute getGuard_Schizophrenic();

																/**
	 * Returns the meta object for enum '{@link de.cau.cs.kieler.scg.BranchType <em>Branch Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Branch Type</em>'.
	 * @see de.cau.cs.kieler.scg.BranchType
	 * @generated
	 */
    EEnum getBranchType();

    /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    ScgFactory getScgFactory();

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
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.NodeImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getNode()
		 * @generated
		 */
        EClass NODE = eINSTANCE.getNode();

        /**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

        /**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NODE__IS_INITIAL = eINSTANCE.getNode_IsInitial();

        /**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NODE__DEPENDENCIES = eINSTANCE.getNode_Dependencies();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.ConditionalImpl <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.ConditionalImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getConditional()
		 * @generated
		 */
        EClass CONDITIONAL = eINSTANCE.getConditional();

        /**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CONDITIONAL__THEN = eINSTANCE.getConditional_Then();

        /**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CONDITIONAL__ELSE = eINSTANCE.getConditional_Else();

        /**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CONDITIONAL__CONDITION = eINSTANCE.getConditional_Condition();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.SurfaceImpl <em>Surface</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.SurfaceImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSurface()
		 * @generated
		 */
        EClass SURFACE = eINSTANCE.getSurface();

        /**
		 * The meta object literal for the '<em><b>Depth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SURFACE__DEPTH = eINSTANCE.getSurface_Depth();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.DepthImpl <em>Depth</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.DepthImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getDepth()
		 * @generated
		 */
        EClass DEPTH = eINSTANCE.getDepth();

        /**
		 * The meta object literal for the '<em><b>Surface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DEPTH__SURFACE = eINSTANCE.getDepth_Surface();

        /**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DEPTH__NEXT = eINSTANCE.getDepth_Next();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.AssignmentImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getAssignment()
		 * @generated
		 */
        EClass ASSIGNMENT = eINSTANCE.getAssignment();

        /**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ASSIGNMENT__NEXT = eINSTANCE.getAssignment_Next();

        /**
		 * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ASSIGNMENT__ASSIGNMENT = eINSTANCE.getAssignment_Assignment();

        /**
		 * The meta object literal for the '<em><b>Valued Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ASSIGNMENT__VALUED_OBJECT = eINSTANCE.getAssignment_ValuedObject();

        /**
		 * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__INDICES = eINSTANCE.getAssignment_Indices();

								/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.ForkImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getFork()
		 * @generated
		 */
        EClass FORK = eINSTANCE.getFork();

        /**
		 * The meta object literal for the '<em><b>Join</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference FORK__JOIN = eINSTANCE.getFork_Join();

        /**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference FORK__NEXT = eINSTANCE.getFork_Next();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.JoinImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getJoin()
		 * @generated
		 */
        EClass JOIN = eINSTANCE.getJoin();

        /**
		 * The meta object literal for the '<em><b>Fork</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference JOIN__FORK = eINSTANCE.getJoin_Fork();

        /**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference JOIN__NEXT = eINSTANCE.getJoin_Next();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.LinkImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getLink()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.SCGraphImpl <em>SC Graph</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.SCGraphImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSCGraph()
		 * @generated
		 */
        EClass SC_GRAPH = eINSTANCE.getSCGraph();

        /**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SC_GRAPH__NODES = eINSTANCE.getSCGraph_Nodes();

        /**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SC_GRAPH__DECLARATIONS = eINSTANCE.getSCGraph_Declarations();

        /**
		 * The meta object literal for the '<em><b>Basic Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SC_GRAPH__BASIC_BLOCKS = eINSTANCE.getSCGraph_BasicBlocks();

        /**
		 * The meta object literal for the '<em><b>Schedules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SC_GRAPH__SCHEDULES = eINSTANCE.getSCGraph_Schedules();

        /**
		 * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SC_GRAPH__GUARDS = eINSTANCE.getSCGraph_Guards();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.EntryImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getEntry()
		 * @generated
		 */
        EClass ENTRY = eINSTANCE.getEntry();

        /**
		 * The meta object literal for the '<em><b>Exit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ENTRY__EXIT = eINSTANCE.getEntry_Exit();

        /**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ENTRY__NEXT = eINSTANCE.getEntry_Next();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.ExitImpl <em>Exit</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.ExitImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getExit()
		 * @generated
		 */
        EClass EXIT = eINSTANCE.getExit();

        /**
		 * The meta object literal for the '<em><b>Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EXIT__ENTRY = eINSTANCE.getExit_Entry();

        /**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EXIT__NEXT = eINSTANCE.getExit_Next();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.ControlFlowImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getControlFlow()
		 * @generated
		 */
        EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.DependencyImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getDependency()
		 * @generated
		 */
        EClass DEPENDENCY = eINSTANCE.getDependency();

        /**
		 * The meta object literal for the '<em><b>Concurrent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute DEPENDENCY__CONCURRENT = eINSTANCE.getDependency_Concurrent();

        /**
		 * The meta object literal for the '<em><b>Confluent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute DEPENDENCY__CONFLUENT = eINSTANCE.getDependency_Confluent();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.AbsoluteWrite_ReadImpl <em>Absolute Write Read</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.AbsoluteWrite_ReadImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getAbsoluteWrite_Read()
		 * @generated
		 */
        EClass ABSOLUTE_WRITE_READ = eINSTANCE.getAbsoluteWrite_Read();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.RelativeWrite_ReadImpl <em>Relative Write Read</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.RelativeWrite_ReadImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getRelativeWrite_Read()
		 * @generated
		 */
        EClass RELATIVE_WRITE_READ = eINSTANCE.getRelativeWrite_Read();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.AbsoluteWrite_RelativeWriteImpl <em>Absolute Write Relative Write</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.AbsoluteWrite_RelativeWriteImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getAbsoluteWrite_RelativeWrite()
		 * @generated
		 */
        EClass ABSOLUTE_WRITE_RELATIVE_WRITE = eINSTANCE.getAbsoluteWrite_RelativeWrite();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.Write_WriteImpl <em>Write Write</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.Write_WriteImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getWrite_Write()
		 * @generated
		 */
        EClass WRITE_WRITE = eINSTANCE.getWrite_Write();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl <em>Basic Block</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.BasicBlockImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getBasicBlock()
		 * @generated
		 */
        EClass BASIC_BLOCK = eINSTANCE.getBasicBlock();

        /**
		 * The meta object literal for the '<em><b>Scheduling Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference BASIC_BLOCK__SCHEDULING_BLOCKS = eINSTANCE.getBasicBlock_SchedulingBlocks();

        /**
		 * The meta object literal for the '<em><b>Predecessors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference BASIC_BLOCK__PREDECESSORS = eINSTANCE.getBasicBlock_Predecessors();

        /**
		 * The meta object literal for the '<em><b>Go Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute BASIC_BLOCK__GO_BLOCK = eINSTANCE.getBasicBlock_GoBlock();

        /**
		 * The meta object literal for the '<em><b>Depth Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute BASIC_BLOCK__DEPTH_BLOCK = eINSTANCE.getBasicBlock_DepthBlock();

        /**
		 * The meta object literal for the '<em><b>Synchronizer Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute BASIC_BLOCK__SYNCHRONIZER_BLOCK = eINSTANCE.getBasicBlock_SynchronizerBlock();

        /**
		 * The meta object literal for the '<em><b>Entry Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_BLOCK__ENTRY_BLOCK = eINSTANCE.getBasicBlock_EntryBlock();

								/**
		 * The meta object literal for the '<em><b>Dead Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute BASIC_BLOCK__DEAD_BLOCK = eINSTANCE.getBasicBlock_DeadBlock();

        /**
		 * The meta object literal for the '<em><b>Pre Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference BASIC_BLOCK__PRE_GUARD = eINSTANCE.getBasicBlock_PreGuard();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.SchedulingBlockImpl <em>Scheduling Block</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.SchedulingBlockImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSchedulingBlock()
		 * @generated
		 */
        EClass SCHEDULING_BLOCK = eINSTANCE.getSchedulingBlock();

        /**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SCHEDULING_BLOCK__NODES = eINSTANCE.getSchedulingBlock_Nodes();

        /**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SCHEDULING_BLOCK__DEPENDENCIES = eINSTANCE.getSchedulingBlock_Dependencies();

        /**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SCHEDULING_BLOCK__GUARD = eINSTANCE.getSchedulingBlock_Guard();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.PredecessorImpl <em>Predecessor</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.PredecessorImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getPredecessor()
		 * @generated
		 */
        EClass PREDECESSOR = eINSTANCE.getPredecessor();

        /**
		 * The meta object literal for the '<em><b>Basic Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PREDECESSOR__BASIC_BLOCK = eINSTANCE.getPredecessor_BasicBlock();

        /**
		 * The meta object literal for the '<em><b>Conditional</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PREDECESSOR__CONDITIONAL = eINSTANCE.getPredecessor_Conditional();

        /**
		 * The meta object literal for the '<em><b>Branch Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDECESSOR__BRANCH_TYPE = eINSTANCE.getPredecessor_BranchType();

								/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.ScheduleImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSchedule()
		 * @generated
		 */
        EClass SCHEDULE = eINSTANCE.getSchedule();

        /**
		 * The meta object literal for the '<em><b>Scheduled Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__SCHEDULED_BLOCKS = eINSTANCE.getSchedule_ScheduledBlocks();

								/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.ScheduledBlockImpl <em>Scheduled Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.ScheduledBlockImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getScheduledBlock()
		 * @generated
		 */
		EClass SCHEDULED_BLOCK = eINSTANCE.getScheduledBlock();

								/**
		 * The meta object literal for the '<em><b>Scheduling Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULED_BLOCK__SCHEDULING_BLOCK = eINSTANCE.getScheduledBlock_SchedulingBlock();

								/**
		 * The meta object literal for the '<em><b>Schizophrenic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_BLOCK__SCHIZOPHRENIC = eINSTANCE.getScheduledBlock_Schizophrenic();

								/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.impl.GuardImpl
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getGuard()
		 * @generated
		 */
        EClass GUARD = eINSTANCE.getGuard();

                                /**
		 * The meta object literal for the '<em><b>Valued Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference GUARD__VALUED_OBJECT = eINSTANCE.getGuard_ValuedObject();

                                /**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference GUARD__EXPRESSION = eINSTANCE.getGuard_Expression();

                                /**
		 * The meta object literal for the '<em><b>Schizophrenic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD__SCHIZOPHRENIC = eINSTANCE.getGuard_Schizophrenic();

																																/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scg.BranchType <em>Branch Type</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scg.BranchType
		 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getBranchType()
		 * @generated
		 */
        EEnum BRANCH_TYPE = eINSTANCE.getBranchType();

    }

} //ScgPackage
