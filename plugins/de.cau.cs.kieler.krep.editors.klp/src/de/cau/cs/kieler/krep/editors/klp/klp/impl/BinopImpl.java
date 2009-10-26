/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp.impl;

import de.cau.cs.kieler.krep.editors.klp.klp.Binop;
import de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage;
import de.cau.cs.kieler.krep.editors.klp.klp.Operator;
import de.cau.cs.kieler.krep.editors.klp.klp.Read;

import de.cau.cs.kieler.krep.editors.klp.klp.Reg;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.BinopImpl#getOp <em>Op</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.BinopImpl#getArg1 <em>Arg1</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.BinopImpl#getArg2 <em>Arg2</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.BinopImpl#getVal <em>Val</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.BinopImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinopImpl extends InstructionImpl implements Binop {
	/**
	 * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected static final Operator OP_EDEFAULT = Operator.ADD;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected Operator op = OP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArg1() <em>Arg1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArg1()
	 * @generated
	 * @ordered
	 */
	protected Read arg1;

	/**
	 * The cached value of the '{@link #getArg2() <em>Arg2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArg2()
	 * @generated
	 * @ordered
	 */
	protected Read arg2;

	/**
	 * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal()
	 * @generated
	 * @ordered
	 */
	protected static final int VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal()
	 * @generated
	 * @ordered
	 */
	protected int val = VAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Reg to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlpPackage.Literals.BINOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(Operator newOp) {
		Operator oldOp = op;
		op = newOp == null ? OP_EDEFAULT : newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlpPackage.BINOP__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reg getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Reg)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KlpPackage.BINOP__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reg basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Reg newTo) {
		Reg oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlpPackage.BINOP__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Read getArg1() {
		return arg1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArg1(Read newArg1, NotificationChain msgs) {
		Read oldArg1 = arg1;
		arg1 = newArg1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KlpPackage.BINOP__ARG1, oldArg1, newArg1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArg1(Read newArg1) {
		if (newArg1 != arg1) {
			NotificationChain msgs = null;
			if (arg1 != null)
				msgs = ((InternalEObject)arg1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KlpPackage.BINOP__ARG1, null, msgs);
			if (newArg1 != null)
				msgs = ((InternalEObject)newArg1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KlpPackage.BINOP__ARG1, null, msgs);
			msgs = basicSetArg1(newArg1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlpPackage.BINOP__ARG1, newArg1, newArg1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Read getArg2() {
		return arg2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArg2(Read newArg2, NotificationChain msgs) {
		Read oldArg2 = arg2;
		arg2 = newArg2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KlpPackage.BINOP__ARG2, oldArg2, newArg2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArg2(Read newArg2) {
		if (newArg2 != arg2) {
			NotificationChain msgs = null;
			if (arg2 != null)
				msgs = ((InternalEObject)arg2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KlpPackage.BINOP__ARG2, null, msgs);
			if (newArg2 != null)
				msgs = ((InternalEObject)newArg2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KlpPackage.BINOP__ARG2, null, msgs);
			msgs = basicSetArg2(newArg2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlpPackage.BINOP__ARG2, newArg2, newArg2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVal() {
		return val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVal(int newVal) {
		int oldVal = val;
		val = newVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlpPackage.BINOP__VAL, oldVal, val));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KlpPackage.BINOP__ARG1:
				return basicSetArg1(null, msgs);
			case KlpPackage.BINOP__ARG2:
				return basicSetArg2(null, msgs);
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
			case KlpPackage.BINOP__OP:
				return getOp();
			case KlpPackage.BINOP__ARG1:
				return getArg1();
			case KlpPackage.BINOP__ARG2:
				return getArg2();
			case KlpPackage.BINOP__VAL:
				return getVal();
			case KlpPackage.BINOP__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case KlpPackage.BINOP__OP:
				setOp((Operator)newValue);
				return;
			case KlpPackage.BINOP__ARG1:
				setArg1((Read)newValue);
				return;
			case KlpPackage.BINOP__ARG2:
				setArg2((Read)newValue);
				return;
			case KlpPackage.BINOP__VAL:
				setVal((Integer)newValue);
				return;
			case KlpPackage.BINOP__TO:
				setTo((Reg)newValue);
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
			case KlpPackage.BINOP__OP:
				setOp(OP_EDEFAULT);
				return;
			case KlpPackage.BINOP__ARG1:
				setArg1((Read)null);
				return;
			case KlpPackage.BINOP__ARG2:
				setArg2((Read)null);
				return;
			case KlpPackage.BINOP__VAL:
				setVal(VAL_EDEFAULT);
				return;
			case KlpPackage.BINOP__TO:
				setTo((Reg)null);
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
			case KlpPackage.BINOP__OP:
				return op != OP_EDEFAULT;
			case KlpPackage.BINOP__ARG1:
				return arg1 != null;
			case KlpPackage.BINOP__ARG2:
				return arg2 != null;
			case KlpPackage.BINOP__VAL:
				return val != VAL_EDEFAULT;
			case KlpPackage.BINOP__TO:
				return to != null;
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
		result.append(" (op: ");
		result.append(op);
		result.append(", val: ");
		result.append(val);
		result.append(')');
		return result.toString();
	}

} //BinopImpl
