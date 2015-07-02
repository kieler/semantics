/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage
 * @generated
 */
public interface SCChartsFactory extends EFactory {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    SCChartsFactory eINSTANCE = de.cau.cs.kieler.sccharts.impl.SCChartsFactoryImpl.init();

    /**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
    Action createAction();

    /**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
    Assignment createAssignment();

    /**
	 * Returns a new object of class '<em>Emission</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emission</em>'.
	 * @generated
	 */
    Emission createEmission();

    /**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
    Node createNode();

    /**
	 * Returns a new object of class '<em>Reference Node</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Node</em>'.
	 * @generated
	 */
    ReferenceNode createReferenceNode();

    /**
	 * Returns a new object of class '<em>Call Node</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Node</em>'.
	 * @generated
	 */
    CallNode createCallNode();

    /**
	 * Returns a new object of class '<em>Define Node</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Define Node</em>'.
	 * @generated
	 */
    DefineNode createDefineNode();

    /**
	 * Returns a new object of class '<em>Equation</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equation</em>'.
	 * @generated
	 */
    Equation createEquation();

    /**
	 * Returns a new object of class '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding</em>'.
	 * @generated
	 */
    Binding createBinding();

    /**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
    State createState();

    /**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	Region createRegion();

				/**
	 * Returns a new object of class '<em>Controlflow Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controlflow Region</em>'.
	 * @generated
	 */
	ControlflowRegion createControlflowRegion();

				/**
	 * Returns a new object of class '<em>Dataflow Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataflow Region</em>'.
	 * @generated
	 */
	DataflowRegion createDataflowRegion();

				/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
    Transition createTransition();

    /**
	 * Returns a new object of class '<em>Text Effect</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Effect</em>'.
	 * @generated
	 */
    TextEffect createTextEffect();

    /**
	 * Returns a new object of class '<em>Function Call Effect</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Call Effect</em>'.
	 * @generated
	 */
    FunctionCallEffect createFunctionCallEffect();

    /**
	 * Returns a new object of class '<em>Entry Action</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Action</em>'.
	 * @generated
	 */
    EntryAction createEntryAction();

    /**
	 * Returns a new object of class '<em>During Action</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>During Action</em>'.
	 * @generated
	 */
    DuringAction createDuringAction();

    /**
	 * Returns a new object of class '<em>Exit Action</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Action</em>'.
	 * @generated
	 */
    ExitAction createExitAction();

    /**
	 * Returns a new object of class '<em>Suspend Action</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suspend Action</em>'.
	 * @generated
	 */
    SuspendAction createSuspendAction();

    /**
	 * Returns a new object of class '<em>Iterate Action</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterate Action</em>'.
	 * @generated
	 */
    IterateAction createIterateAction();

    /**
	 * Returns a new object of class '<em>For</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>For</em>'.
	 * @generated
	 */
    For createFor();

    /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    SCChartsPackage getSCChartsPackage();

} //SCChartsFactory
