/**
 */
package de.cau.cs.kieler.core.kexpressions.impl;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.TypeGroup;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.TypeGroupImpl#getValuedObjects <em>Valued Objects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.TypeGroupImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.TypeGroupImpl#isInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.TypeGroupImpl#isOutput <em>Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.TypeGroupImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.TypeGroupImpl#isSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.TypeGroupImpl#isConstant <em>Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeGroupImpl extends EObjectImpl implements TypeGroup {
	/**
	 * The cached value of the '{@link #getValuedObjects() <em>Valued Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuedObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<ValuedObject> valuedObjects;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ValueType TYPE_EDEFAULT = ValueType.PURE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ValueType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInput()
	 * @generated
	 * @ordered
	 */
	protected boolean input = INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutput()
	 * @generated
	 * @ordered
	 */
	protected boolean output = OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isSignal() <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIGNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSignal() <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignal()
	 * @generated
	 * @ordered
	 */
	protected boolean signal = SIGNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected boolean constant = CONSTANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KExpressionsPackage.Literals.TYPE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValuedObject> getValuedObjects() {
		if (valuedObjects == null) {
			valuedObjects = new EObjectContainmentEList<ValuedObject>(ValuedObject.class, this, KExpressionsPackage.TYPE_GROUP__VALUED_OBJECTS);
		}
		return valuedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ValueType newType) {
		ValueType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.TYPE_GROUP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(boolean newInput) {
		boolean oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.TYPE_GROUP__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(boolean newOutput) {
		boolean oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.TYPE_GROUP__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.TYPE_GROUP__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSignal() {
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(boolean newSignal) {
		boolean oldSignal = signal;
		signal = newSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.TYPE_GROUP__SIGNAL, oldSignal, signal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(boolean newConstant) {
		boolean oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.TYPE_GROUP__CONSTANT, oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KExpressionsPackage.TYPE_GROUP__VALUED_OBJECTS:
				return ((InternalEList<?>)getValuedObjects()).basicRemove(otherEnd, msgs);
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
			case KExpressionsPackage.TYPE_GROUP__VALUED_OBJECTS:
				return getValuedObjects();
			case KExpressionsPackage.TYPE_GROUP__TYPE:
				return getType();
			case KExpressionsPackage.TYPE_GROUP__INPUT:
				return isInput();
			case KExpressionsPackage.TYPE_GROUP__OUTPUT:
				return isOutput();
			case KExpressionsPackage.TYPE_GROUP__STATIC:
				return isStatic();
			case KExpressionsPackage.TYPE_GROUP__SIGNAL:
				return isSignal();
			case KExpressionsPackage.TYPE_GROUP__CONSTANT:
				return isConstant();
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
			case KExpressionsPackage.TYPE_GROUP__VALUED_OBJECTS:
				getValuedObjects().clear();
				getValuedObjects().addAll((Collection<? extends ValuedObject>)newValue);
				return;
			case KExpressionsPackage.TYPE_GROUP__TYPE:
				setType((ValueType)newValue);
				return;
			case KExpressionsPackage.TYPE_GROUP__INPUT:
				setInput((Boolean)newValue);
				return;
			case KExpressionsPackage.TYPE_GROUP__OUTPUT:
				setOutput((Boolean)newValue);
				return;
			case KExpressionsPackage.TYPE_GROUP__STATIC:
				setStatic((Boolean)newValue);
				return;
			case KExpressionsPackage.TYPE_GROUP__SIGNAL:
				setSignal((Boolean)newValue);
				return;
			case KExpressionsPackage.TYPE_GROUP__CONSTANT:
				setConstant((Boolean)newValue);
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
			case KExpressionsPackage.TYPE_GROUP__VALUED_OBJECTS:
				getValuedObjects().clear();
				return;
			case KExpressionsPackage.TYPE_GROUP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case KExpressionsPackage.TYPE_GROUP__INPUT:
				setInput(INPUT_EDEFAULT);
				return;
			case KExpressionsPackage.TYPE_GROUP__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
				return;
			case KExpressionsPackage.TYPE_GROUP__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case KExpressionsPackage.TYPE_GROUP__SIGNAL:
				setSignal(SIGNAL_EDEFAULT);
				return;
			case KExpressionsPackage.TYPE_GROUP__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
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
			case KExpressionsPackage.TYPE_GROUP__VALUED_OBJECTS:
				return valuedObjects != null && !valuedObjects.isEmpty();
			case KExpressionsPackage.TYPE_GROUP__TYPE:
				return type != TYPE_EDEFAULT;
			case KExpressionsPackage.TYPE_GROUP__INPUT:
				return input != INPUT_EDEFAULT;
			case KExpressionsPackage.TYPE_GROUP__OUTPUT:
				return output != OUTPUT_EDEFAULT;
			case KExpressionsPackage.TYPE_GROUP__STATIC:
				return static_ != STATIC_EDEFAULT;
			case KExpressionsPackage.TYPE_GROUP__SIGNAL:
				return signal != SIGNAL_EDEFAULT;
			case KExpressionsPackage.TYPE_GROUP__CONSTANT:
				return constant != CONSTANT_EDEFAULT;
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
		result.append(", input: ");
		result.append(input);
		result.append(", output: ");
		result.append(output);
		result.append(", static: ");
		result.append(static_);
		result.append(", signal: ");
		result.append(signal);
		result.append(", constant: ");
		result.append(constant);
		result.append(')');
		return result.toString();
	}

} //TypeGroupImpl
