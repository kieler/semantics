/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp.impl;

import de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage;
import de.cau.cs.kieler.krep.editors.klp.klp.Reg;
import de.cau.cs.kieler.krep.editors.klp.klp.SetClk;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Clk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.SetClkImpl#getClk <em>Clk</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.SetClkImpl#getReg <em>Reg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetClkImpl extends InstructionImpl implements SetClk {
	/**
	 * The cached value of the '{@link #getClk() <em>Clk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClk()
	 * @generated
	 * @ordered
	 */
	protected Reg clk;

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
	protected SetClkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlpPackage.Literals.SET_CLK;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KlpPackage.SET_CLK__REG, oldReg, reg));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KlpPackage.SET_CLK__REG, oldReg, reg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reg getClk() {
		return clk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClk(Reg newClk, NotificationChain msgs) {
		Reg oldClk = clk;
		clk = newClk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KlpPackage.SET_CLK__CLK, oldClk, newClk);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClk(Reg newClk) {
		if (newClk != clk) {
			NotificationChain msgs = null;
			if (clk != null)
				msgs = ((InternalEObject)clk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KlpPackage.SET_CLK__CLK, null, msgs);
			if (newClk != null)
				msgs = ((InternalEObject)newClk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KlpPackage.SET_CLK__CLK, null, msgs);
			msgs = basicSetClk(newClk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlpPackage.SET_CLK__CLK, newClk, newClk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KlpPackage.SET_CLK__CLK:
				return basicSetClk(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KlpPackage.SET_CLK__CLK:
				return getClk();
			case KlpPackage.SET_CLK__REG:
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
			case KlpPackage.SET_CLK__CLK:
				setClk((Reg)newValue);
				return;
			case KlpPackage.SET_CLK__REG:
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
			case KlpPackage.SET_CLK__CLK:
				setClk((Reg)null);
				return;
			case KlpPackage.SET_CLK__REG:
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
			case KlpPackage.SET_CLK__CLK:
				return clk != null;
			case KlpPackage.SET_CLK__REG:
				return reg != null;
		}
		return super.eIsSet(featureID);
	}

} //SetClkImpl
