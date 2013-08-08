/**
 */
package scg;

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
 * @see scg.ScgFactory
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
    ScgPackage eINSTANCE = scg.impl.ScgPackageImpl.init();

    /**
     * The meta object id for the '{@link scg.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see scg.impl.NodeImpl
     * @see scg.impl.ScgPackageImpl#getNode()
     * @generated
     */
    int NODE = 0;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__INCOMING = 0;

    /**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__IS_INITIAL = 1;

    /**
     * The number of structural features of the '<em>Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link scg.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see scg.impl.ConditionalImpl
     * @see scg.impl.ScgPackageImpl#getConditional()
     * @generated
     */
    int CONDITIONAL = 1;

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
     * The feature id for the '<em><b>Condition</b></em>' attribute.
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
     * The number of operations of the '<em>Conditional</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link scg.impl.SurfaceImpl <em>Surface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see scg.impl.SurfaceImpl
     * @see scg.impl.ScgPackageImpl#getSurface()
     * @generated
     */
    int SURFACE = 2;

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
     * The number of operations of the '<em>Surface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SURFACE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link scg.impl.DepthImpl <em>Depth</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see scg.impl.DepthImpl
     * @see scg.impl.ScgPackageImpl#getDepth()
     * @generated
     */
    int DEPTH = 3;

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
     * The feature id for the '<em><b>Next</b></em>' reference.
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
     * The number of operations of the '<em>Depth</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPTH_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link scg.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see scg.impl.AssignmentImpl
     * @see scg.impl.ScgPackageImpl#getAssignment()
     * @generated
     */
    int ASSIGNMENT = 4;

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
     * The feature id for the '<em><b>Assignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__ASSIGNMENT = NODE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link scg.impl.ForkImpl <em>Fork</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see scg.impl.ForkImpl
     * @see scg.impl.ScgPackageImpl#getFork()
     * @generated
     */
    int FORK = 5;

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
     * The number of operations of the '<em>Fork</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORK_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link scg.impl.JoinImpl <em>Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see scg.impl.JoinImpl
     * @see scg.impl.ScgPackageImpl#getJoin()
     * @generated
     */
    int JOIN = 6;

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
     * The number of operations of the '<em>Join</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOIN_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '{@link scg.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see scg.impl.LinkImpl
     * @see scg.impl.ScgPackageImpl#getLink()
     * @generated
     */
    int LINK = 7;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__TARGET = 0;

    /**
     * The number of structural features of the '<em>Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link scg.Node <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node</em>'.
     * @see scg.Node
     * @generated
     */
    EClass getNode();

    /**
     * Returns the meta object for the reference list '{@link scg.Node#getIncoming <em>Incoming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming</em>'.
     * @see scg.Node#getIncoming()
     * @see #getNode()
     * @generated
     */
    EReference getNode_Incoming();

    /**
     * Returns the meta object for the attribute '{@link scg.Node#isIsInitial <em>Is Initial</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Initial</em>'.
     * @see scg.Node#isIsInitial()
     * @see #getNode()
     * @generated
     */
    EAttribute getNode_IsInitial();

    /**
     * Returns the meta object for class '{@link scg.Conditional <em>Conditional</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conditional</em>'.
     * @see scg.Conditional
     * @generated
     */
    EClass getConditional();

    /**
     * Returns the meta object for the containment reference '{@link scg.Conditional#getThen <em>Then</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Then</em>'.
     * @see scg.Conditional#getThen()
     * @see #getConditional()
     * @generated
     */
    EReference getConditional_Then();

    /**
     * Returns the meta object for the containment reference '{@link scg.Conditional#getElse <em>Else</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Else</em>'.
     * @see scg.Conditional#getElse()
     * @see #getConditional()
     * @generated
     */
    EReference getConditional_Else();

    /**
     * Returns the meta object for the attribute '{@link scg.Conditional#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Condition</em>'.
     * @see scg.Conditional#getCondition()
     * @see #getConditional()
     * @generated
     */
    EAttribute getConditional_Condition();

    /**
     * Returns the meta object for class '{@link scg.Surface <em>Surface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Surface</em>'.
     * @see scg.Surface
     * @generated
     */
    EClass getSurface();

    /**
     * Returns the meta object for the reference '{@link scg.Surface#getDepth <em>Depth</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Depth</em>'.
     * @see scg.Surface#getDepth()
     * @see #getSurface()
     * @generated
     */
    EReference getSurface_Depth();

    /**
     * Returns the meta object for class '{@link scg.Depth <em>Depth</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Depth</em>'.
     * @see scg.Depth
     * @generated
     */
    EClass getDepth();

    /**
     * Returns the meta object for the reference '{@link scg.Depth#getSurface <em>Surface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Surface</em>'.
     * @see scg.Depth#getSurface()
     * @see #getDepth()
     * @generated
     */
    EReference getDepth_Surface();

    /**
     * Returns the meta object for the reference '{@link scg.Depth#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Next</em>'.
     * @see scg.Depth#getNext()
     * @see #getDepth()
     * @generated
     */
    EReference getDepth_Next();

    /**
     * Returns the meta object for class '{@link scg.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment</em>'.
     * @see scg.Assignment
     * @generated
     */
    EClass getAssignment();

    /**
     * Returns the meta object for the containment reference '{@link scg.Assignment#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Next</em>'.
     * @see scg.Assignment#getNext()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_Next();

    /**
     * Returns the meta object for the attribute '{@link scg.Assignment#getAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Assignment</em>'.
     * @see scg.Assignment#getAssignment()
     * @see #getAssignment()
     * @generated
     */
    EAttribute getAssignment_Assignment();

    /**
     * Returns the meta object for class '{@link scg.Fork <em>Fork</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Fork</em>'.
     * @see scg.Fork
     * @generated
     */
    EClass getFork();

    /**
     * Returns the meta object for the reference '{@link scg.Fork#getJoin <em>Join</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Join</em>'.
     * @see scg.Fork#getJoin()
     * @see #getFork()
     * @generated
     */
    EReference getFork_Join();

    /**
     * Returns the meta object for the containment reference list '{@link scg.Fork#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Next</em>'.
     * @see scg.Fork#getNext()
     * @see #getFork()
     * @generated
     */
    EReference getFork_Next();

    /**
     * Returns the meta object for class '{@link scg.Join <em>Join</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Join</em>'.
     * @see scg.Join
     * @generated
     */
    EClass getJoin();

    /**
     * Returns the meta object for the reference '{@link scg.Join#getFork <em>Fork</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Fork</em>'.
     * @see scg.Join#getFork()
     * @see #getJoin()
     * @generated
     */
    EReference getJoin_Fork();

    /**
     * Returns the meta object for the containment reference '{@link scg.Join#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Next</em>'.
     * @see scg.Join#getNext()
     * @see #getJoin()
     * @generated
     */
    EReference getJoin_Next();

    /**
     * Returns the meta object for class '{@link scg.Link <em>Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link</em>'.
     * @see scg.Link
     * @generated
     */
    EClass getLink();

    /**
     * Returns the meta object for the reference '{@link scg.Link#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see scg.Link#getTarget()
     * @see #getLink()
     * @generated
     */
    EReference getLink_Target();

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
         * The meta object literal for the '{@link scg.impl.NodeImpl <em>Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see scg.impl.NodeImpl
         * @see scg.impl.ScgPackageImpl#getNode()
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
         * The meta object literal for the '{@link scg.impl.ConditionalImpl <em>Conditional</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see scg.impl.ConditionalImpl
         * @see scg.impl.ScgPackageImpl#getConditional()
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
         * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONDITIONAL__CONDITION = eINSTANCE.getConditional_Condition();

        /**
         * The meta object literal for the '{@link scg.impl.SurfaceImpl <em>Surface</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see scg.impl.SurfaceImpl
         * @see scg.impl.ScgPackageImpl#getSurface()
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
         * The meta object literal for the '{@link scg.impl.DepthImpl <em>Depth</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see scg.impl.DepthImpl
         * @see scg.impl.ScgPackageImpl#getDepth()
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
         * The meta object literal for the '<em><b>Next</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEPTH__NEXT = eINSTANCE.getDepth_Next();

        /**
         * The meta object literal for the '{@link scg.impl.AssignmentImpl <em>Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see scg.impl.AssignmentImpl
         * @see scg.impl.ScgPackageImpl#getAssignment()
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
         * The meta object literal for the '<em><b>Assignment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSIGNMENT__ASSIGNMENT = eINSTANCE.getAssignment_Assignment();

        /**
         * The meta object literal for the '{@link scg.impl.ForkImpl <em>Fork</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see scg.impl.ForkImpl
         * @see scg.impl.ScgPackageImpl#getFork()
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
         * The meta object literal for the '{@link scg.impl.JoinImpl <em>Join</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see scg.impl.JoinImpl
         * @see scg.impl.ScgPackageImpl#getJoin()
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
         * The meta object literal for the '{@link scg.impl.LinkImpl <em>Link</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see scg.impl.LinkImpl
         * @see scg.impl.ScgPackageImpl#getLink()
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

    }

} //ScgPackage
