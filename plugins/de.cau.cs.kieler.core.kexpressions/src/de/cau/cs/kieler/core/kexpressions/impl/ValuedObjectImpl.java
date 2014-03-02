/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.core.kexpressions.impl;

import de.cau.cs.kieler.core.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.core.kexpressions.CombineOperator;
import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valued Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#isInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#isOutput <em>Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#isSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#getCombineOperator <em>Combine Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValuedObjectImpl extends AnnotatableImpl implements ValuedObject {
    /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final String NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getCombineOperator() <em>Combine Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCombineOperator()
	 * @generated
	 * @ordered
	 */
    protected static final CombineOperator COMBINE_OPERATOR_EDEFAULT = CombineOperator.NONE;

    /**
	 * The cached value of the '{@link #getCombineOperator() <em>Combine Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCombineOperator()
	 * @generated
	 * @ordered
	 */
    protected CombineOperator combineOperator = COMBINE_OPERATOR_EDEFAULT;

    /**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
    protected Expression initialValue;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ValuedObjectImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return KExpressionsPackage.Literals.VALUED_OBJECT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__INPUT, oldInput, input));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__OUTPUT, oldOutput, output));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__STATIC, oldStatic, static_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__SIGNAL, oldSignal, signal));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Expression getInitialValue() {
		return initialValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetInitialValue(Expression newInitialValue, NotificationChain msgs) {
		Expression oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE, oldInitialValue, newInitialValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInitialValue(Expression newInitialValue) {
		if (newInitialValue != initialValue) {
			NotificationChain msgs = null;
			if (initialValue != null)
				msgs = ((InternalEObject)initialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE, null, msgs);
			if (newInitialValue != null)
				msgs = ((InternalEObject)newInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE, null, msgs);
			msgs = basicSetInitialValue(newInitialValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE, newInitialValue, newInitialValue));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE:
				return basicSetInitialValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CombineOperator getCombineOperator() {
		return combineOperator;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCombineOperator(CombineOperator newCombineOperator) {
		CombineOperator oldCombineOperator = combineOperator;
		combineOperator = newCombineOperator == null ? COMBINE_OPERATOR_EDEFAULT : newCombineOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR, oldCombineOperator, combineOperator));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KExpressionsPackage.VALUED_OBJECT__NAME:
				return getName();
			case KExpressionsPackage.VALUED_OBJECT__TYPE:
				return getType();
			case KExpressionsPackage.VALUED_OBJECT__INPUT:
				return isInput();
			case KExpressionsPackage.VALUED_OBJECT__OUTPUT:
				return isOutput();
			case KExpressionsPackage.VALUED_OBJECT__STATIC:
				return isStatic();
			case KExpressionsPackage.VALUED_OBJECT__SIGNAL:
				return isSignal();
			case KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR:
				return getCombineOperator();
			case KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE:
				return getInitialValue();
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
			case KExpressionsPackage.VALUED_OBJECT__NAME:
				setName((String)newValue);
				return;
			case KExpressionsPackage.VALUED_OBJECT__TYPE:
				setType((ValueType)newValue);
				return;
			case KExpressionsPackage.VALUED_OBJECT__INPUT:
				setInput((Boolean)newValue);
				return;
			case KExpressionsPackage.VALUED_OBJECT__OUTPUT:
				setOutput((Boolean)newValue);
				return;
			case KExpressionsPackage.VALUED_OBJECT__STATIC:
				setStatic((Boolean)newValue);
				return;
			case KExpressionsPackage.VALUED_OBJECT__SIGNAL:
				setSignal((Boolean)newValue);
				return;
			case KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR:
				setCombineOperator((CombineOperator)newValue);
				return;
			case KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE:
				setInitialValue((Expression)newValue);
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
			case KExpressionsPackage.VALUED_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KExpressionsPackage.VALUED_OBJECT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case KExpressionsPackage.VALUED_OBJECT__INPUT:
				setInput(INPUT_EDEFAULT);
				return;
			case KExpressionsPackage.VALUED_OBJECT__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
				return;
			case KExpressionsPackage.VALUED_OBJECT__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case KExpressionsPackage.VALUED_OBJECT__SIGNAL:
				setSignal(SIGNAL_EDEFAULT);
				return;
			case KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR:
				setCombineOperator(COMBINE_OPERATOR_EDEFAULT);
				return;
			case KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE:
				setInitialValue((Expression)null);
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
			case KExpressionsPackage.VALUED_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KExpressionsPackage.VALUED_OBJECT__TYPE:
				return type != TYPE_EDEFAULT;
			case KExpressionsPackage.VALUED_OBJECT__INPUT:
				return input != INPUT_EDEFAULT;
			case KExpressionsPackage.VALUED_OBJECT__OUTPUT:
				return output != OUTPUT_EDEFAULT;
			case KExpressionsPackage.VALUED_OBJECT__STATIC:
				return static_ != STATIC_EDEFAULT;
			case KExpressionsPackage.VALUED_OBJECT__SIGNAL:
				return signal != SIGNAL_EDEFAULT;
			case KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR:
				return combineOperator != COMBINE_OPERATOR_EDEFAULT;
			case KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE:
				return initialValue != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", input: ");
		result.append(input);
		result.append(", output: ");
		result.append(output);
		result.append(", static: ");
		result.append(static_);
		result.append(", signal: ");
		result.append(signal);
		result.append(", combineOperator: ");
		result.append(combineOperator);
		result.append(')');
		return result.toString();
	}

} //ValuedObjectImpl
