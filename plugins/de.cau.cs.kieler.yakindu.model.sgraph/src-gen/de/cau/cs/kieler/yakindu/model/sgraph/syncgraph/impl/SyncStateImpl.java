/**
 *  KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *  http://www.informatik.uni-kiel.de/rtsys/kieler/
 *   
 *  Copyright 2012 by
 *   + Christian-Albrechts-University of Kiel
 *    + Department of Computer Science
 *       + Real-Time and Embedded Systems Group
 *   
 *   This code is provided under the terms of the Eclipse Public License (EPL).
 *   See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl;

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yakindu.sct.model.sgraph.impl.StateImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sync State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncStateImpl#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncStateImpl#isIsFinal <em>Is Final</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SyncStateImpl extends StateImpl implements SyncState {
	/**
     * The default value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isIsInitial()
     * @generated
     * @ordered
     */
	protected static final boolean IS_INITIAL_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isIsInitial()
     * @generated
     * @ordered
     */
	protected boolean isInitial = IS_INITIAL_EDEFAULT;

	/**
     * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isIsFinal()
     * @generated
     * @ordered
     */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isIsFinal()
     * @generated
     * @ordered
     */
	protected boolean isFinal = IS_FINAL_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SyncStateImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SyncgraphPackage.Literals.SYNC_STATE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isIsInitial() {
        return isInitial;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIsInitial(boolean newIsInitial) {
        boolean oldIsInitial = isInitial;
        isInitial = newIsInitial;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncgraphPackage.SYNC_STATE__IS_INITIAL, oldIsInitial, isInitial));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isIsFinal() {
        return isFinal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIsFinal(boolean newIsFinal) {
        boolean oldIsFinal = isFinal;
        isFinal = newIsFinal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncgraphPackage.SYNC_STATE__IS_FINAL, oldIsFinal, isFinal));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SyncgraphPackage.SYNC_STATE__IS_INITIAL:
                return isIsInitial();
            case SyncgraphPackage.SYNC_STATE__IS_FINAL:
                return isIsFinal();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SyncgraphPackage.SYNC_STATE__IS_INITIAL:
                setIsInitial((Boolean)newValue);
                return;
            case SyncgraphPackage.SYNC_STATE__IS_FINAL:
                setIsFinal((Boolean)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case SyncgraphPackage.SYNC_STATE__IS_INITIAL:
                setIsInitial(IS_INITIAL_EDEFAULT);
                return;
            case SyncgraphPackage.SYNC_STATE__IS_FINAL:
                setIsFinal(IS_FINAL_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SyncgraphPackage.SYNC_STATE__IS_INITIAL:
                return isInitial != IS_INITIAL_EDEFAULT;
            case SyncgraphPackage.SYNC_STATE__IS_FINAL:
                return isFinal != IS_FINAL_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (isInitial: ");
        result.append(isInitial);
        result.append(", isFinal: ");
        result.append(isFinal);
        result.append(')');
        return result.toString();
    }

} //SyncStateImpl
