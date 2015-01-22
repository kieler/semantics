/**
 */
package de.cau.cs.kieler.scgprios;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage
 * @generated
 */
public interface ScgpriosFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ScgpriosFactory eINSTANCE = de.cau.cs.kieler.scgprios.impl.ScgpriosFactoryImpl.init();

    /**
     * Returns a new object of class '<em>SC Graph P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SC Graph P</em>'.
     * @generated
     */
    SCGraph_P createSCGraph_P();

    /**
     * Returns a new object of class '<em>Node P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Node P</em>'.
     * @generated
     */
    Node_P createNode_P();

    /**
     * Returns a new object of class '<em>Conditional P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conditional P</em>'.
     * @generated
     */
    Conditional_P createConditional_P();

    /**
     * Returns a new object of class '<em>Surface P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Surface P</em>'.
     * @generated
     */
    Surface_P createSurface_P();

    /**
     * Returns a new object of class '<em>Depth P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Depth P</em>'.
     * @generated
     */
    Depth_P createDepth_P();

    /**
     * Returns a new object of class '<em>Assignment P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assignment P</em>'.
     * @generated
     */
    Assignment_P createAssignment_P();

    /**
     * Returns a new object of class '<em>Fork P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fork P</em>'.
     * @generated
     */
    Fork_P createFork_P();

    /**
     * Returns a new object of class '<em>Join P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Join P</em>'.
     * @generated
     */
    Join_P createJoin_P();

    /**
     * Returns a new object of class '<em>Link P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Link P</em>'.
     * @generated
     */
    Link_P createLink_P();

    /**
     * Returns a new object of class '<em>Entry P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entry P</em>'.
     * @generated
     */
    Entry_P createEntry_P();

    /**
     * Returns a new object of class '<em>Exit P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exit P</em>'.
     * @generated
     */
    Exit_P createExit_P();

    /**
     * Returns a new object of class '<em>Control Flow P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Control Flow P</em>'.
     * @generated
     */
    ControlFlow_P createControlFlow_P();

    /**
     * Returns a new object of class '<em>Dependency P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dependency P</em>'.
     * @generated
     */
    Dependency_P createDependency_P();

    /**
     * Returns a new object of class '<em>Absolute Write Read P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Absolute Write Read P</em>'.
     * @generated
     */
    AbsoluteWrite_Read_P createAbsoluteWrite_Read_P();

    /**
     * Returns a new object of class '<em>Relative Write Read P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relative Write Read P</em>'.
     * @generated
     */
    RelativeWrite_Read_P createRelativeWrite_Read_P();

    /**
     * Returns a new object of class '<em>Absolute Write Relative Write P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Absolute Write Relative Write P</em>'.
     * @generated
     */
    AbsoluteWrite_RelativeWrite_P createAbsoluteWrite_RelativeWrite_P();

    /**
     * Returns a new object of class '<em>Write Write P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Write Write P</em>'.
     * @generated
     */
    Write_Write_P createWrite_Write_P();

    /**
     * Returns a new object of class '<em>Basic Block P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Basic Block P</em>'.
     * @generated
     */
    BasicBlock_P createBasicBlock_P();

    /**
     * Returns a new object of class '<em>Scheduling Block P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Scheduling Block P</em>'.
     * @generated
     */
    SchedulingBlock_P createSchedulingBlock_P();

    /**
     * Returns a new object of class '<em>Predecessor P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Predecessor P</em>'.
     * @generated
     */
    Predecessor_P createPredecessor_P();

    /**
     * Returns a new object of class '<em>Schedule P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Schedule P</em>'.
     * @generated
     */
    Schedule_P createSchedule_P();

    /**
     * Returns a new object of class '<em>Scheduled Block P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Scheduled Block P</em>'.
     * @generated
     */
    ScheduledBlock_P createScheduledBlock_P();

    /**
     * Returns a new object of class '<em>Guard P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Guard P</em>'.
     * @generated
     */
    Guard_P createGuard_P();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ScgpriosPackage getScgpriosPackage();

} //ScgpriosFactory
