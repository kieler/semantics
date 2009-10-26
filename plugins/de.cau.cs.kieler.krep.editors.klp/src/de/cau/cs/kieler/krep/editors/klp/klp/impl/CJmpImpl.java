/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp.impl;

import de.cau.cs.kieler.krep.editors.klp.klp.CJmp;
import de.cau.cs.kieler.krep.editors.klp.klp.JumpKind;
import de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage;
import de.cau.cs.kieler.krep.editors.klp.klp.Label;
import de.cau.cs.kieler.krep.editors.klp.klp.Read;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CJmp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.CJmpImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.CJmpImpl#getReg <em>Reg</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.CJmpImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CJmpImpl extends InstructionImpl implements CJmp {
	/**
	 * The default value of the '{@link #getCond() <em>Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected static final JumpKind COND_EDEFAULT = JumpKind.JT;

	/**
	 * The cached value of the '{@link #getCond() <em>Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected JumpKind cond = COND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReg() <em>Reg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReg()
	 * @generated
	 * @ordered
	 */
	protected Read reg;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected Label label;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CJmpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlpPackage.Literals.CJMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpKind getCond() {
		return cond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCond(JumpKind newCond) {
		JumpKind oldCond = cond;
		cond = newCond == null ? COND_EDEFAULT : newCond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlpPackage.CJMP__COND, oldCond, cond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Read getReg() {
		return reg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReg(Read newReg, NotificationChain msgs) {
		Read oldReg = reg;
		reg = newReg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KlpPackage.CJMP__REG, oldReg, newReg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReg(Read newReg) {
		if (newReg != reg) {
			NotificationChain msgs = null;
			if (reg != null)
				msgs = ((InternalEObject)reg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KlpPackage.CJMP__REG, null, msgs);
			if (newReg != null)
				msgs = ((InternalEObject)newReg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KlpPackage.CJMP__REG, null, msgs);
			msgs = basicSetReg(newReg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlpPackage.CJMP__REG, newReg, newReg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs) {
		Label oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KlpPackage.CJMP__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(Label newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KlpPackage.CJMP__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KlpPackage.CJMP__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlpPackage.CJMP__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KlpPackage.CJMP__REG:
				return basicSetReg(null, msgs);
			case KlpPackage.CJMP__LABEL:
				return basicSetLabel(null, msgs);
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
			case KlpPackage.CJMP__COND:
				return getCond();
			case KlpPackage.CJMP__REG:
				return getReg();
			case KlpPackage.CJMP__LABEL:
				return getLabel();
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
			case KlpPackage.CJMP__COND:
				setCond((JumpKind)newValue);
				return;
			case KlpPackage.CJMP__REG:
				setReg((Read)newValue);
				return;
			case KlpPackage.CJMP__LABEL:
				setLabel((Label)newValue);
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
			case KlpPackage.CJMP__COND:
				setCond(COND_EDEFAULT);
				return;
			case KlpPackage.CJMP__REG:
				setReg((Read)null);
				return;
			case KlpPackage.CJMP__LABEL:
				setLabel((Label)null);
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
			case KlpPackage.CJMP__COND:
				return cond != COND_EDEFAULT;
			case KlpPackage.CJMP__REG:
				return reg != null;
			case KlpPackage.CJMP__LABEL:
				return label != null;
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
		result.append(" (cond: ");
		result.append(cond);
		result.append(')');
		return result.toString();
	}

} //CJmpImpl
