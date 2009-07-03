/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage
 * @generated
 */
public interface SyncchartsFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	SyncchartsFactory eINSTANCE = de.cau.cs.kieler.synccharts.impl.SyncchartsFactoryImpl.init();

	/**
     * Returns a new object of class '<em>State</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>State</em>'.
     * @generated
     */
	State createState();

	/**
     * Returns a new object of class '<em>Signal</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Signal</em>'.
     * @generated
     */
	Signal createSignal();

	/**
     * Returns a new object of class '<em>Valued Object</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Valued Object</em>'.
     * @generated
     */
	ValuedObject createValuedObject();

	/**
     * Returns a new object of class '<em>Emission</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Emission</em>'.
     * @generated
     */
	Emission createEmission();

	/**
     * Returns a new object of class '<em>Transition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Transition</em>'.
     * @generated
     */
	Transition createTransition();

	/**
     * Returns a new object of class '<em>Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Expression</em>'.
     * @generated
     */
	Expression createExpression();

	/**
     * Returns a new object of class '<em>Signal Renaming</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Signal Renaming</em>'.
     * @generated
     */
	SignalRenaming createSignalRenaming();

	/**
     * Returns a new object of class '<em>Operator</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Operator</em>'.
     * @generated
     */
	Operator createOperator();

	/**
     * Returns a new object of class '<em>Action</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Action</em>'.
     * @generated
     */
	Action createAction();

	/**
     * Returns a new object of class '<em>Suspension Trigger</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Suspension Trigger</em>'.
     * @generated
     */
	SuspensionTrigger createSuspensionTrigger();

	/**
     * Returns a new object of class '<em>Assignment</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Assignment</em>'.
     * @generated
     */
	Assignment createAssignment();

	/**
     * Returns a new object of class '<em>Variable</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable</em>'.
     * @generated
     */
	Variable createVariable();

	/**
     * Returns a new object of class '<em>Region</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Region</em>'.
     * @generated
     */
	Region createRegion();

	/**
     * Returns a new object of class '<em>Complex Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Complex Expression</em>'.
     * @generated
     */
	ComplexExpression createComplexExpression();

	/**
     * Returns a new object of class '<em>Signal Reference</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Signal Reference</em>'.
     * @generated
     */
	SignalReference createSignalReference();

	/**
     * Returns a new object of class '<em>Variable Reference</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable Reference</em>'.
     * @generated
     */
	VariableReference createVariableReference();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	SyncchartsPackage getSyncchartsPackage();

} //SyncchartsFactory
