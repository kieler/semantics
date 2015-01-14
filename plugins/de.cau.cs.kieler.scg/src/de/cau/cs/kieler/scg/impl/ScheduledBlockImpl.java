/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.impl;

import de.cau.cs.kieler.scg.ScgPackage;
import de.cau.cs.kieler.scg.ScheduledBlock;
import de.cau.cs.kieler.scg.SchedulingBlock;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduled Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.impl.ScheduledBlockImpl#getSchedulingBlock <em>Scheduling Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.ScheduledBlockImpl#isSchizophrenic <em>Schizophrenic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduledBlockImpl extends MinimalEObjectImpl.Container implements ScheduledBlock {
	/**
     * The cached value of the '{@link #getSchedulingBlock() <em>Scheduling Block</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSchedulingBlock()
     * @generated
     * @ordered
     */
	protected SchedulingBlock schedulingBlock;

	/**
     * The default value of the '{@link #isSchizophrenic() <em>Schizophrenic</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSchizophrenic()
     * @generated
     * @ordered
     */
	protected static final boolean SCHIZOPHRENIC_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isSchizophrenic() <em>Schizophrenic</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSchizophrenic()
     * @generated
     * @ordered
     */
	protected boolean schizophrenic = SCHIZOPHRENIC_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ScheduledBlockImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScgPackage.Literals.SCHEDULED_BLOCK;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SchedulingBlock getSchedulingBlock() {
        if (schedulingBlock != null && schedulingBlock.eIsProxy()) {
            InternalEObject oldSchedulingBlock = (InternalEObject)schedulingBlock;
            schedulingBlock = (SchedulingBlock)eResolveProxy(oldSchedulingBlock);
            if (schedulingBlock != oldSchedulingBlock) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.SCHEDULED_BLOCK__SCHEDULING_BLOCK, oldSchedulingBlock, schedulingBlock));
            }
        }
        return schedulingBlock;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SchedulingBlock basicGetSchedulingBlock() {
        return schedulingBlock;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSchedulingBlock(SchedulingBlock newSchedulingBlock) {
        SchedulingBlock oldSchedulingBlock = schedulingBlock;
        schedulingBlock = newSchedulingBlock;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.SCHEDULED_BLOCK__SCHEDULING_BLOCK, oldSchedulingBlock, schedulingBlock));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSchizophrenic() {
        return schizophrenic;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSchizophrenic(boolean newSchizophrenic) {
        boolean oldSchizophrenic = schizophrenic;
        schizophrenic = newSchizophrenic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.SCHEDULED_BLOCK__SCHIZOPHRENIC, oldSchizophrenic, schizophrenic));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScgPackage.SCHEDULED_BLOCK__SCHEDULING_BLOCK:
                if (resolve) return getSchedulingBlock();
                return basicGetSchedulingBlock();
            case ScgPackage.SCHEDULED_BLOCK__SCHIZOPHRENIC:
                return isSchizophrenic();
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
            case ScgPackage.SCHEDULED_BLOCK__SCHEDULING_BLOCK:
                setSchedulingBlock((SchedulingBlock)newValue);
                return;
            case ScgPackage.SCHEDULED_BLOCK__SCHIZOPHRENIC:
                setSchizophrenic((Boolean)newValue);
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
            case ScgPackage.SCHEDULED_BLOCK__SCHEDULING_BLOCK:
                setSchedulingBlock((SchedulingBlock)null);
                return;
            case ScgPackage.SCHEDULED_BLOCK__SCHIZOPHRENIC:
                setSchizophrenic(SCHIZOPHRENIC_EDEFAULT);
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
            case ScgPackage.SCHEDULED_BLOCK__SCHEDULING_BLOCK:
                return schedulingBlock != null;
            case ScgPackage.SCHEDULED_BLOCK__SCHIZOPHRENIC:
                return schizophrenic != SCHIZOPHRENIC_EDEFAULT;
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
        result.append(" (schizophrenic: ");
        result.append(schizophrenic);
        result.append(')');
        return result.toString();
    }

} //ScheduledBlockImpl
