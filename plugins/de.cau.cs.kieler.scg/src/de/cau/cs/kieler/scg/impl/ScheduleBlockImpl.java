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

import de.cau.cs.kieler.scg.Guard;
import de.cau.cs.kieler.scg.ScgPackage;
import de.cau.cs.kieler.scg.ScheduleBlock;
import de.cau.cs.kieler.scg.SchedulingBlock;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.impl.ScheduleBlockImpl#getSchedulingBlock <em>Scheduling Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.ScheduleBlockImpl#getAdditionalGuards <em>Additional Guards</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduleBlockImpl extends MinimalEObjectImpl.Container implements ScheduleBlock {
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
	 * The cached value of the '{@link #getAdditionalGuards() <em>Additional Guards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalGuards()
	 * @generated
	 * @ordered
	 */
	protected EList<Guard> additionalGuards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScgPackage.Literals.SCHEDULE_BLOCK;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.SCHEDULE_BLOCK__SCHEDULING_BLOCK, oldSchedulingBlock, schedulingBlock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.SCHEDULE_BLOCK__SCHEDULING_BLOCK, oldSchedulingBlock, schedulingBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guard> getAdditionalGuards() {
		if (additionalGuards == null) {
			additionalGuards = new EObjectResolvingEList<Guard>(Guard.class, this, ScgPackage.SCHEDULE_BLOCK__ADDITIONAL_GUARDS);
		}
		return additionalGuards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScgPackage.SCHEDULE_BLOCK__SCHEDULING_BLOCK:
				if (resolve) return getSchedulingBlock();
				return basicGetSchedulingBlock();
			case ScgPackage.SCHEDULE_BLOCK__ADDITIONAL_GUARDS:
				return getAdditionalGuards();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScgPackage.SCHEDULE_BLOCK__SCHEDULING_BLOCK:
				setSchedulingBlock((SchedulingBlock)newValue);
				return;
			case ScgPackage.SCHEDULE_BLOCK__ADDITIONAL_GUARDS:
				getAdditionalGuards().clear();
				getAdditionalGuards().addAll((Collection<? extends Guard>)newValue);
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
			case ScgPackage.SCHEDULE_BLOCK__SCHEDULING_BLOCK:
				setSchedulingBlock((SchedulingBlock)null);
				return;
			case ScgPackage.SCHEDULE_BLOCK__ADDITIONAL_GUARDS:
				getAdditionalGuards().clear();
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
			case ScgPackage.SCHEDULE_BLOCK__SCHEDULING_BLOCK:
				return schedulingBlock != null;
			case ScgPackage.SCHEDULE_BLOCK__ADDITIONAL_GUARDS:
				return additionalGuards != null && !additionalGuards.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScheduleBlockImpl
