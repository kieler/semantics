/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp.impl;

import de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage;
import de.cau.cs.kieler.krep.editors.klp.klp.Prio;

import de.cau.cs.kieler.krep.editors.klp.klp.Reg;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.PrioImpl#getPrio <em>Prio</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.PrioImpl#getReg <em>Reg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrioImpl extends InstructionImpl implements Prio {
	/**
	 * The default value of the '{@link #getPrio() <em>Prio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrio()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrio() <em>Prio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrio()
	 * @generated
	 * @ordered
	 */
	protected int prio = PRIO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReg() <em>Reg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReg()
	 * @generated
	 * @ordered
	 */
	protected Reg reg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlpPackage.Literals.PRIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reg getReg() {
		if (reg != null && reg.eIsProxy()) {
			InternalEObject oldReg = (InternalEObject)reg;
			reg = (Reg)eResolveProxy(oldReg);
			if (reg != oldReg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KlpPackage.PRIO__REG, oldReg, reg));
			}
		}
		return reg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reg basicGetReg() {
		return reg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReg(Reg newReg) {
		Reg oldReg = reg;
		reg = newReg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlpPackage.PRIO__REG, oldReg, reg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrio() {
		return prio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrio(int newPrio) {
		int oldPrio = prio;
		prio = newPrio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlpPackage.PRIO__PRIO, oldPrio, prio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KlpPackage.PRIO__PRIO:
				return getPrio();
			case KlpPackage.PRIO__REG:
				if (resolve) return getReg();
				return basicGetReg();
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
			case KlpPackage.PRIO__PRIO:
				setPrio((Integer)newValue);
				return;
			case KlpPackage.PRIO__REG:
				setReg((Reg)newValue);
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
			case KlpPackage.PRIO__PRIO:
				setPrio(PRIO_EDEFAULT);
				return;
			case KlpPackage.PRIO__REG:
				setReg((Reg)null);
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
			case KlpPackage.PRIO__PRIO:
				return prio != PRIO_EDEFAULT;
			case KlpPackage.PRIO__REG:
				return reg != null;
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
		result.append(" (prio: ");
		result.append(prio);
		result.append(')');
		return result.toString();
	}

} //PrioImpl
