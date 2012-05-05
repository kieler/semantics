/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.codegen.dependencies.dependency;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.StateAndTransitionImpl <em>State And Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.StateAndTransitionImpl
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getStateAndTransition()
	 * @generated
	 */
	int STATE_AND_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_AND_TRANSITION__STATE = 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_AND_TRANSITION__TRANSITION = 1;

	/**
	 * The number of structural features of the '<em>State And Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_AND_TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyImpl
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DESTINATION = 1;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.SignalDependencyImpl <em>Signal Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.SignalDependencyImpl
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getSignalDependency()
	 * @generated
	 */
	int SIGNAL_DEPENDENCY = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DEPENDENCY__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DEPENDENCY__DESTINATION = DEPENDENCY__DESTINATION;

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
	int HIERARCHY_DEPENDENCY = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_DEPENDENCY__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_DEPENDENCY__DESTINATION = DEPENDENCY__DESTINATION;

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
	int CONTROLFLOW_DEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_DEPENDENCY__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_DEPENDENCY__DESTINATION = DEPENDENCY__DESTINATION;

	/**
	 * The number of structural features of the '<em>Controlflow Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.TransitionDependencyImpl <em>Transition Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.TransitionDependencyImpl
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getTransitionDependency()
	 * @generated
	 */
	int TRANSITION_DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DEPENDENCY__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DEPENDENCY__DESTINATION = DEPENDENCY__DESTINATION;

	/**
	 * The number of structural features of the '<em>Transition Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.StateAndTransition <em>State And Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State And Transition</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.StateAndTransition
	 * @generated
	 */
	EClass getStateAndTransition();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.StateAndTransition#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.StateAndTransition#getState()
	 * @see #getStateAndTransition()
	 * @generated
	 */
	EReference getStateAndTransition_State();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.StateAndTransition#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.StateAndTransition#getTransition()
	 * @see #getStateAndTransition()
	 * @generated
	 */
	EReference getStateAndTransition_Transition();

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
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getSource()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Source();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getDestination()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Destination();

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
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.TransitionDependency <em>Transition Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Dependency</em>'.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.TransitionDependency
	 * @generated
	 */
	EClass getTransitionDependency();

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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.StateAndTransitionImpl <em>State And Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.StateAndTransitionImpl
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getStateAndTransition()
		 * @generated
		 */
		EClass STATE_AND_TRANSITION = eINSTANCE.getStateAndTransition();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_AND_TRANSITION__STATE = eINSTANCE.getStateAndTransition_State();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_AND_TRANSITION__TRANSITION = eINSTANCE.getStateAndTransition_Transition();

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
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__SOURCE = eINSTANCE.getDependency_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DESTINATION = eINSTANCE.getDependency_Destination();

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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.TransitionDependencyImpl <em>Transition Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.TransitionDependencyImpl
		 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyPackageImpl#getTransitionDependency()
		 * @generated
		 */
		EClass TRANSITION_DEPENDENCY = eINSTANCE.getTransitionDependency();

	}

} //DependencyPackage
