/**
 */
package de.cau.cs.kieler.yakindu.sccharts.ui.editor.syncgraph;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.yakindu.sccharts.ui.editor.syncgraph.SyncgraphPackage
 * @generated
 */
public interface SyncgraphFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SyncgraphFactory eINSTANCE = de.cau.cs.kieler.yakindu.sccharts.ui.editor.syncgraph.impl.SyncgraphFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sync Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sync Transition</em>'.
	 * @generated
	 */
	SyncTransition createSyncTransition();

	/**
	 * Returns a new object of class '<em>Sync State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sync State</em>'.
	 * @generated
	 */
	SyncState createSyncState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SyncgraphPackage getSyncgraphPackage();

} //SyncgraphFactory
