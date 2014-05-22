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
    int NODE = 0;

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
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;


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
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.ConditionalImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getConditional()
	 * @generated
	 */
    int CONDITIONAL = 1;

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
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONDITIONAL___GET_ANNOTATION__STRING = NODE___GET_ANNOTATION__STRING;

    /**
	 * The operation id for the '<em>Get All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONDITIONAL___GET_ALL_ANNOTATIONS__STRING = NODE___GET_ALL_ANNOTATIONS__STRING;

    /**
	 * The operation id for the '<em>Remove All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONDITIONAL___REMOVE_ALL_ANNOTATIONS__STRING = NODE___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
	 * The number of operations of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONDITIONAL_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.SurfaceImpl <em>Surface</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.SurfaceImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSurface()
	 * @generated
	 */
    int SURFACE = 2;

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
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SURFACE___GET_ANNOTATION__STRING = NODE___GET_ANNOTATION__STRING;

    /**
	 * The operation id for the '<em>Get All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SURFACE___GET_ALL_ANNOTATIONS__STRING = NODE___GET_ALL_ANNOTATIONS__STRING;

    /**
	 * The operation id for the '<em>Remove All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SURFACE___REMOVE_ALL_ANNOTATIONS__STRING = NODE___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
	 * The number of operations of the '<em>Surface</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SURFACE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.DepthImpl <em>Depth</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.DepthImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getDepth()
	 * @generated
	 */
    int DEPTH = 3;

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
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPTH___GET_ANNOTATION__STRING = NODE___GET_ANNOTATION__STRING;

    /**
	 * The operation id for the '<em>Get All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPTH___GET_ALL_ANNOTATIONS__STRING = NODE___GET_ALL_ANNOTATIONS__STRING;

    /**
	 * The operation id for the '<em>Remove All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPTH___REMOVE_ALL_ANNOTATIONS__STRING = NODE___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
	 * The number of operations of the '<em>Depth</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPTH_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.AssignmentImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getAssignment()
	 * @generated
	 */
    int ASSIGNMENT = 4;

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
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT___GET_ANNOTATION__STRING = NODE___GET_ANNOTATION__STRING;

    /**
	 * The operation id for the '<em>Get All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT___GET_ALL_ANNOTATIONS__STRING = NODE___GET_ALL_ANNOTATIONS__STRING;

    /**
	 * The operation id for the '<em>Remove All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT___REMOVE_ALL_ANNOTATIONS__STRING = NODE___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.ForkImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getFork()
	 * @generated
	 */
    int FORK = 5;

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
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FORK___GET_ANNOTATION__STRING = NODE___GET_ANNOTATION__STRING;

    /**
	 * The operation id for the '<em>Get All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FORK___GET_ALL_ANNOTATIONS__STRING = NODE___GET_ALL_ANNOTATIONS__STRING;

    /**
	 * The operation id for the '<em>Remove All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FORK___REMOVE_ALL_ANNOTATIONS__STRING = NODE___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
	 * The number of operations of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FORK_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.JoinImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getJoin()
	 * @generated
	 */
    int JOIN = 6;

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
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JOIN___GET_ANNOTATION__STRING = NODE___GET_ANNOTATION__STRING;

    /**
	 * The operation id for the '<em>Get All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JOIN___GET_ALL_ANNOTATIONS__STRING = NODE___GET_ALL_ANNOTATIONS__STRING;

    /**
	 * The operation id for the '<em>Remove All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JOIN___REMOVE_ALL_ANNOTATIONS__STRING = NODE___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JOIN_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.LinkImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getLink()
	 * @generated
	 */
    int LINK = 7;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.scg.impl.SCGraphImpl <em>SC Graph</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scg.impl.SCGraphImpl
	 * @see de.cau.cs.kieler.scg.impl.ScgPackageImpl#getSCGraph()
	 * @generated
	 */
    int SC_GRAPH = 8;

    /**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH__NODES = 0;

    /**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH__DECLARATIONS = 1;

    /**
	 * The number of structural features of the '<em>SC Graph</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_FEATURE_COUNT = 2;

    /**
	 * The number of operations of the '<em>SC Graph</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_OPERATION_COUNT = 0;

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
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENTRY___GET_ANNOTATION__STRING = NODE___GET_ANNOTATION__STRING;

    /**
	 * The operation id for the '<em>Get All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENTRY___GET_ALL_ANNOTATIONS__STRING = NODE___GET_ALL_ANNOTATIONS__STRING;

    /**
	 * The operation id for the '<em>Remove All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENTRY___REMOVE_ALL_ANNOTATIONS__STRING = NODE___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENTRY_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

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
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXIT___GET_ANNOTATION__STRING = NODE___GET_ANNOTATION__STRING;

    /**
	 * The operation id for the '<em>Get All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXIT___GET_ALL_ANNOTATIONS__STRING = NODE___GET_ALL_ANNOTATIONS__STRING;

    /**
	 * The operation id for the '<em>Remove All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXIT___REMOVE_ALL_ANNOTATIONS__STRING = NODE___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
	 * The number of operations of the '<em>Exit</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXIT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;


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
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTROL_FLOW___GET_ANNOTATION__STRING = LINK___GET_ANNOTATION__STRING;

    /**
	 * The operation id for the '<em>Get All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTROL_FLOW___GET_ALL_ANNOTATIONS__STRING = LINK___GET_ALL_ANNOTATIONS__STRING;

    /**
	 * The operation id for the '<em>Remove All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTROL_FLOW___REMOVE_ALL_ANNOTATIONS__STRING = LINK___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
	 * The number of operations of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTROL_FLOW_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;


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

    }

} //ScgPackage
