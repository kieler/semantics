/**
 *  KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *  http://www.informatik.uni-kiel.de/rtsys/kieler/
 *   
 *  Copyright 2012 by
 *   + Kiel University
 *    + Department of Computer Science
 *       + Real-Time and Embedded Systems Group
 *   
 *   This code is provided under the terms of the Eclipse Public License (EPL).
 *   See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl;

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yakindu.sct.model.sgraph.impl.TransitionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sync Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncTransitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncTransitionImpl#isIsHistory <em>Is History</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncTransitionImpl#isIsImmediate <em>Is Immediate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SyncTransitionImpl extends TransitionImpl implements SyncTransition {
	/**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected static final TransitionType TYPE_EDEFAULT = TransitionType.WEAKABORT;

	/**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected TransitionType type = TYPE_EDEFAULT;

	/**
     * The default value of the '{@link #isIsHistory() <em>Is History</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isIsHistory()
     * @generated
     * @ordered
     */
	protected static final boolean IS_HISTORY_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isIsHistory() <em>Is History</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isIsHistory()
     * @generated
     * @ordered
     */
	protected boolean isHistory = IS_HISTORY_EDEFAULT;

	/**
     * The default value of the '{@link #isIsImmediate() <em>Is Immediate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsImmediate()
     * @generated
     * @ordered
     */
    protected static final boolean IS_IMMEDIATE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsImmediate() <em>Is Immediate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsImmediate()
     * @generated
     * @ordered
     */
    protected boolean isImmediate = IS_IMMEDIATE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SyncTransitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SyncgraphPackage.Literals.SYNC_TRANSITION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TransitionType getType() {
        return type;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setType(TransitionType newType) {
        TransitionType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncgraphPackage.SYNC_TRANSITION__TYPE, oldType, type));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isIsHistory() {
        return isHistory;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIsHistory(boolean newIsHistory) {
        boolean oldIsHistory = isHistory;
        isHistory = newIsHistory;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncgraphPackage.SYNC_TRANSITION__IS_HISTORY, oldIsHistory, isHistory));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsImmediate() {
        return isImmediate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsImmediate(boolean newIsImmediate) {
        boolean oldIsImmediate = isImmediate;
        isImmediate = newIsImmediate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncgraphPackage.SYNC_TRANSITION__IS_IMMEDIATE, oldIsImmediate, isImmediate));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SyncgraphPackage.SYNC_TRANSITION__TYPE:
                return getType();
            case SyncgraphPackage.SYNC_TRANSITION__IS_HISTORY:
                return isIsHistory();
            case SyncgraphPackage.SYNC_TRANSITION__IS_IMMEDIATE:
                return isIsImmediate();
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
            case SyncgraphPackage.SYNC_TRANSITION__TYPE:
                setType((TransitionType)newValue);
                return;
            case SyncgraphPackage.SYNC_TRANSITION__IS_HISTORY:
                setIsHistory((Boolean)newValue);
                return;
            case SyncgraphPackage.SYNC_TRANSITION__IS_IMMEDIATE:
                setIsImmediate((Boolean)newValue);
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
            case SyncgraphPackage.SYNC_TRANSITION__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case SyncgraphPackage.SYNC_TRANSITION__IS_HISTORY:
                setIsHistory(IS_HISTORY_EDEFAULT);
                return;
            case SyncgraphPackage.SYNC_TRANSITION__IS_IMMEDIATE:
                setIsImmediate(IS_IMMEDIATE_EDEFAULT);
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
            case SyncgraphPackage.SYNC_TRANSITION__TYPE:
                return type != TYPE_EDEFAULT;
            case SyncgraphPackage.SYNC_TRANSITION__IS_HISTORY:
                return isHistory != IS_HISTORY_EDEFAULT;
            case SyncgraphPackage.SYNC_TRANSITION__IS_IMMEDIATE:
                return isImmediate != IS_IMMEDIATE_EDEFAULT;
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
        result.append(" (type: ");
        result.append(type);
        result.append(", isHistory: ");
        result.append(isHistory);
        result.append(", isImmediate: ");
        result.append(isImmediate);
        result.append(')');
        return result.toString();
    }

} //SyncTransitionImpl
