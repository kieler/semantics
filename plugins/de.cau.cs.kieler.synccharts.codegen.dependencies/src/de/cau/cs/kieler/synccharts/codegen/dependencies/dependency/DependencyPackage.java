/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.codegen.dependencies.dependency;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyFactory
 * @model kind="package"
 * @generated
 */
public interface DependencyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dependency";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://kieler.cs.cau.de/dependency/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dependency";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DependencyPackage eINSTANCE = de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyImpl
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 0;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TARGET_STATE = 0;

	/**
	 * The feature id for the '<em><b>Source Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SOURCE_NODE = 1;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TARGET_NODE = 2;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.SignalDependencyImpl <em>Signal Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.SignalDependencyImpl
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getSignalDependency()
	 * @generated
	 */
	int SIGNAL_DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DEPENDENCY__TARGET_STATE = DEPENDENCY__TARGET_STATE;

	/**
	 * The feature id for the '<em><b>Source Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DEPENDENCY__SOURCE_NODE = DEPENDENCY__SOURCE_NODE;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DEPENDENCY__TARGET_NODE = DEPENDENCY__TARGET_NODE;

	/**
	 * The number of structural features of the '<em>Signal Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.HierarchyDependencyImpl <em>Hierarchy Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.HierarchyDependencyImpl
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getHierarchyDependency()
	 * @generated
	 */
	int HIERARCHY_DEPENDENCY = 2;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_DEPENDENCY__TARGET_STATE = DEPENDENCY__TARGET_STATE;

	/**
	 * The feature id for the '<em><b>Source Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_DEPENDENCY__SOURCE_NODE = DEPENDENCY__SOURCE_NODE;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_DEPENDENCY__TARGET_NODE = DEPENDENCY__TARGET_NODE;

	/**
	 * The number of structural features of the '<em>Hierarchy Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.ControlflowDependencyImpl <em>Controlflow Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.ControlflowDependencyImpl
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getControlflowDependency()
	 * @generated
	 */
	int CONTROLFLOW_DEPENDENCY = 3;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_DEPENDENCY__TARGET_STATE = DEPENDENCY__TARGET_STATE;

	/**
	 * The feature id for the '<em><b>Source Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_DEPENDENCY__SOURCE_NODE = DEPENDENCY__SOURCE_NODE;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_DEPENDENCY__TARGET_NODE = DEPENDENCY__TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_DEPENDENCY__IMMEDIATE = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Controlflow Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.TransitionDependencyImpl <em>Transition Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.TransitionDependencyImpl
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getTransitionDependency()
	 * @generated
	 */
	int TRANSITION_DEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DEPENDENCY__TARGET_STATE = DEPENDENCY__TARGET_STATE;

	/**
	 * The feature id for the '<em><b>Source Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DEPENDENCY__SOURCE_NODE = DEPENDENCY__SOURCE_NODE;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DEPENDENCY__TARGET_NODE = DEPENDENCY__TARGET_NODE;

	/**
	 * The number of structural features of the '<em>Transition Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependenciesImpl <em>Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependenciesImpl
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getDependencies()
	 * @generated
	 */
	int DEPENDENCIES = 5;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES__DEPENDENCIES = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES__NODES = 1;

	/**
	 * The number of structural features of the '<em>Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.NodeImpl
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING_DEPENDENCIES = 3;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING_DEPENDENCIES = 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__STATE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DEPENDENCYTYPE <em>DEPENDENCYTYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DEPENDENCYTYPE
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getDEPENDENCYTYPE()
	 * @generated
	 */
	int DEPENDENCYTYPE = 7;


	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target State</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getTargetState()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_TargetState();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getSourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Node</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getSourceNode()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_SourceNode();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getTargetNode <em>Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Node</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getTargetNode()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_TargetNode();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.SignalDependency <em>Signal Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Dependency</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.SignalDependency
	 * @generated
	 */
	EClass getSignalDependency();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.HierarchyDependency <em>Hierarchy Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchy Dependency</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.HierarchyDependency
	 * @generated
	 */
	EClass getHierarchyDependency();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.ControlflowDependency <em>Controlflow Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controlflow Dependency</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.ControlflowDependency
	 * @generated
	 */
	EClass getControlflowDependency();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.ControlflowDependency#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.ControlflowDependency#isImmediate()
	 * @see #getControlflowDependency()
	 * @generated
	 */
	EAttribute getControlflowDependency_Immediate();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.TransitionDependency <em>Transition Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Dependency</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.TransitionDependency
	 * @generated
	 */
	EClass getTransitionDependency();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependencies
	 * @generated
	 */
	EClass getDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependencies#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependencies#getDependencies()
	 * @see #getDependencies()
	 * @generated
	 */
	EReference getDependencies_Dependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependencies#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependencies#getNodes()
	 * @see #getDependencies()
	 * @generated
	 */
	EReference getDependencies_Nodes();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Type();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getTransition()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Transition();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getPriority()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Priority();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getOutgoingDependencies <em>Outgoing Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Dependencies</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getOutgoingDependencies()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_OutgoingDependencies();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getIncomingDependencies <em>Incoming Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Dependencies</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getIncomingDependencies()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_IncomingDependencies();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getState()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_State();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Id();

	/**
	 * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DEPENDENCYTYPE <em>DEPENDENCYTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DEPENDENCYTYPE</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DEPENDENCYTYPE
	 * @generated
	 */
	EEnum getDEPENDENCYTYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DependencyFactory getDependencyFactory();

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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyImpl
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__TARGET_STATE = eINSTANCE.getDependency_TargetState();

		/**
		 * The meta object literal for the '<em><b>Source Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__SOURCE_NODE = eINSTANCE.getDependency_SourceNode();

		/**
		 * The meta object literal for the '<em><b>Target Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__TARGET_NODE = eINSTANCE.getDependency_TargetNode();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.SignalDependencyImpl <em>Signal Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.SignalDependencyImpl
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getSignalDependency()
		 * @generated
		 */
		EClass SIGNAL_DEPENDENCY = eINSTANCE.getSignalDependency();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.HierarchyDependencyImpl <em>Hierarchy Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.HierarchyDependencyImpl
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getHierarchyDependency()
		 * @generated
		 */
		EClass HIERARCHY_DEPENDENCY = eINSTANCE.getHierarchyDependency();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.ControlflowDependencyImpl <em>Controlflow Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.ControlflowDependencyImpl
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getControlflowDependency()
		 * @generated
		 */
		EClass CONTROLFLOW_DEPENDENCY = eINSTANCE.getControlflowDependency();

		/**
		 * The meta object literal for the '<em><b>Immediate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLFLOW_DEPENDENCY__IMMEDIATE = eINSTANCE.getControlflowDependency_Immediate();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.TransitionDependencyImpl <em>Transition Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.TransitionDependencyImpl
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getTransitionDependency()
		 * @generated
		 */
		EClass TRANSITION_DEPENDENCY = eINSTANCE.getTransitionDependency();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependenciesImpl <em>Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependenciesImpl
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getDependencies()
		 * @generated
		 */
		EClass DEPENDENCIES = eINSTANCE.getDependencies();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCIES__DEPENDENCIES = eINSTANCE.getDependencies_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCIES__NODES = eINSTANCE.getDependencies_Nodes();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.NodeImpl
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TRANSITION = eINSTANCE.getNode_Transition();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PRIORITY = eINSTANCE.getNode_Priority();

		/**
		 * The meta object literal for the '<em><b>Outgoing Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTGOING_DEPENDENCIES = eINSTANCE.getNode_OutgoingDependencies();

		/**
		 * The meta object literal for the '<em><b>Incoming Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INCOMING_DEPENDENCIES = eINSTANCE.getNode_IncomingDependencies();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__STATE = eINSTANCE.getNode_State();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_Id();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DEPENDENCYTYPE <em>DEPENDENCYTYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DEPENDENCYTYPE
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getDEPENDENCYTYPE()
		 * @generated
		 */
		EEnum DEPENDENCYTYPE = eINSTANCE.getDEPENDENCYTYPE();

	}

} //DependencyPackage
