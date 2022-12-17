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
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SCChartsFactory eINSTANCE = de.cau.cs.kieler.sccharts.impl.SCChartsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>SC Charts</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SC Charts</em>'.
     * @generated
     */
    SCCharts createSCCharts();

    /**
     * Returns a new object of class '<em>Scope Call</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Scope Call</em>'.
     * @generated
     */
    ScopeCall createScopeCall();

    /**
     * Returns a new object of class '<em>State</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>State</em>'.
     * @generated
     */
    State createState();

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
     * Returns a new object of class '<em>Period Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Period Action</em>'.
     * @generated
     */
    PeriodAction createPeriodAction();

    /**
     * Returns a new object of class '<em>Policy Class Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Policy Class Declaration</em>'.
     * @generated
     */
    PolicyClassDeclaration createPolicyClassDeclaration();

    /**
     * Returns a new object of class '<em>Policy Region</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Policy Region</em>'.
     * @generated
     */
    PolicyRegion createPolicyRegion();

    /**
     * Returns a new object of class '<em>Code Effect</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Code Effect</em>'.
     * @generated
     */
    CodeEffect createCodeEffect();

    /**
     * Returns a new object of class '<em>Dataflow Assignment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dataflow Assignment</em>'.
     * @generated
     */
    DataflowAssignment createDataflowAssignment();

    /**
     * Returns a new object of class '<em>Dataflow Reference Call</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dataflow Reference Call</em>'.
     * @generated
     */
    DataflowReferenceCall createDataflowReferenceCall();

    /**
     * Returns a new object of class '<em>Base State Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Base State Reference</em>'.
     * @generated
     */
    BaseStateReference createBaseStateReference();

    /**
     * Returns a new object of class '<em>Ode Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ode Action</em>'.
     * @generated
     */
    OdeAction createOdeAction();

    /**
     * Returns a new object of class '<em>Module Scope Call</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Module Scope Call</em>'.
     * @generated
     */
    ModuleScopeCall createModuleScopeCall();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SCChartsPackage getSCChartsPackage();

} //SCChartsFactory
