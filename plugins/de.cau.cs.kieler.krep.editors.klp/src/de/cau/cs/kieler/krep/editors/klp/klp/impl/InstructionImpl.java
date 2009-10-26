/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp.impl;

import de.cau.cs.kieler.krep.editors.klp.klp.Instruction;
import de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.InstructionImpl#getOpcode0 <em>Opcode0</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.InstructionImpl#getOpcode1 <em>Opcode1</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.InstructionImpl#getOpcode2 <em>Opcode2</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.InstructionImpl#getOpcode3 <em>Opcode3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InstructionImpl extends MinimalEObjectImpl.Container implements Instruction {
	/**
	 * The default value of the '{@link #getOpcode0() <em>Opcode0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpcode0()
	 * @generated
	 * @ordered
	 */
	protected static final int OPCODE0_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getOpcode0() <em>Opcode0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpcode0()
	 * @generated
	 * @ordered
	 */
	protected int opcode0 = OPCODE0_EDEFAULT;
	/**
	 * The default value of the '{@link #getOpcode1() <em>Opcode1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpcode1()
	 * @generated
	 * @ordered
	 */
	protected static final int OPCODE1_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getOpcode1() <em>Opcode1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpcode1()
	 * @generated
	 * @ordered
	 */
	protected int opcode1 = OPCODE1_EDEFAULT;
	/**
	 * The default value of the '{@link #getOpcode2() <em>Opcode2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpcode2()
	 * @generated
	 * @ordered
	 */
	protected static final int OPCODE2_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getOpcode2() <em>Opcode2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpcode2()
	 * @generated
	 * @ordered
	 */
	protected int opcode2 = OPCODE2_EDEFAULT;
	/**
	 * The default value of the '{@link #getOpcode3() <em>Opcode3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpcode3()
	 * @generated
	 * @ordered
	 */
	protected static final int OPCODE3_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getOpcode3() <em>Opcode3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpcode3()
	 * @generated
	 * @ordered
	 */
	protected int opcode3 = OPCODE3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlpPackage.Literals.INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOpcode0() {
		return opcode0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpcode0(int newOpcode0) {
		int oldOpcode0 = opcode0;
		opcode0 = newOpcode0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlpPackage.INSTRUCTION__OPCODE0, oldOpcode0, opcode0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOpcode1() {
		return opcode1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpcode1(int newOpcode1) {
		int oldOpcode1 = opcode1;
		opcode1 = newOpcode1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlpPackage.INSTRUCTION__OPCODE1, oldOpcode1, opcode1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOpcode2() {
		return opcode2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpcode2(int newOpcode2) {
		int oldOpcode2 = opcode2;
		opcode2 = newOpcode2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlpPackage.INSTRUCTION__OPCODE2, oldOpcode2, opcode2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOpcode3() {
		return opcode3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpcode3(int newOpcode3) {
		int oldOpcode3 = opcode3;
		opcode3 = newOpcode3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlpPackage.INSTRUCTION__OPCODE3, oldOpcode3, opcode3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KlpPackage.INSTRUCTION__OPCODE0:
				return getOpcode0();
			case KlpPackage.INSTRUCTION__OPCODE1:
				return getOpcode1();
			case KlpPackage.INSTRUCTION__OPCODE2:
				return getOpcode2();
			case KlpPackage.INSTRUCTION__OPCODE3:
				return getOpcode3();
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
			case KlpPackage.INSTRUCTION__OPCODE0:
				setOpcode0((Integer)newValue);
				return;
			case KlpPackage.INSTRUCTION__OPCODE1:
				setOpcode1((Integer)newValue);
				return;
			case KlpPackage.INSTRUCTION__OPCODE2:
				setOpcode2((Integer)newValue);
				return;
			case KlpPackage.INSTRUCTION__OPCODE3:
				setOpcode3((Integer)newValue);
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
			case KlpPackage.INSTRUCTION__OPCODE0:
				setOpcode0(OPCODE0_EDEFAULT);
				return;
			case KlpPackage.INSTRUCTION__OPCODE1:
				setOpcode1(OPCODE1_EDEFAULT);
				return;
			case KlpPackage.INSTRUCTION__OPCODE2:
				setOpcode2(OPCODE2_EDEFAULT);
				return;
			case KlpPackage.INSTRUCTION__OPCODE3:
				setOpcode3(OPCODE3_EDEFAULT);
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
			case KlpPackage.INSTRUCTION__OPCODE0:
				return opcode0 != OPCODE0_EDEFAULT;
			case KlpPackage.INSTRUCTION__OPCODE1:
				return opcode1 != OPCODE1_EDEFAULT;
			case KlpPackage.INSTRUCTION__OPCODE2:
				return opcode2 != OPCODE2_EDEFAULT;
			case KlpPackage.INSTRUCTION__OPCODE3:
				return opcode3 != OPCODE3_EDEFAULT;
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
		result.append(" (opcode0: ");
		result.append(opcode0);
		result.append(", opcode1: ");
		result.append(opcode1);
		result.append(", opcode2: ");
		result.append(opcode2);
		result.append(", opcode3: ");
		result.append(opcode3);
		result.append(')');
		return result.toString();
	}

} //InstructionImpl
