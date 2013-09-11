/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.core.kexpressions.impl;

import de.cau.cs.kieler.core.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.core.kexpressions.CombineOperator;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#isIsOutput <em>Is Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#isIsSignal <em>Is Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#getCombineOperator <em>Combine Operator</em>}</li>
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
     * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialValue()
     * @generated
     * @ordered
     */
    protected static final String INITIAL_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialValue()
     * @generated
     * @ordered
     */
    protected String initialValue = INITIAL_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsInput()
     * @generated
     * @ordered
     */
    protected static final boolean IS_INPUT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsInput()
     * @generated
     * @ordered
     */
    protected boolean isInput = IS_INPUT_EDEFAULT;

    /**
     * The default value of the '{@link #isIsOutput() <em>Is Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsOutput()
     * @generated
     * @ordered
     */
    protected static final boolean IS_OUTPUT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsOutput() <em>Is Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsOutput()
     * @generated
     * @ordered
     */
    protected boolean isOutput = IS_OUTPUT_EDEFAULT;

    /**
     * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsStatic()
     * @generated
     * @ordered
     */
    protected static final boolean IS_STATIC_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsStatic()
     * @generated
     * @ordered
     */
    protected boolean isStatic = IS_STATIC_EDEFAULT;

    /**
     * The default value of the '{@link #isIsSignal() <em>Is Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSignal()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SIGNAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsSignal() <em>Is Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSignal()
     * @generated
     * @ordered
     */
    protected boolean isSignal = IS_SIGNAL_EDEFAULT;

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
    public String getInitialValue() {
        return initialValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitialValue(String newInitialValue) {
        String oldInitialValue = initialValue;
        initialValue = newInitialValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE, oldInitialValue, initialValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsInput() {
        return isInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsInput(boolean newIsInput) {
        boolean oldIsInput = isInput;
        isInput = newIsInput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__IS_INPUT, oldIsInput, isInput));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsOutput() {
        return isOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsOutput(boolean newIsOutput) {
        boolean oldIsOutput = isOutput;
        isOutput = newIsOutput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__IS_OUTPUT, oldIsOutput, isOutput));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsStatic() {
        return isStatic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsStatic(boolean newIsStatic) {
        boolean oldIsStatic = isStatic;
        isStatic = newIsStatic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__IS_STATIC, oldIsStatic, isStatic));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsSignal() {
        return isSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsSignal(boolean newIsSignal) {
        boolean oldIsSignal = isSignal;
        isSignal = newIsSignal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__IS_SIGNAL, oldIsSignal, isSignal));
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
            case KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE:
                return getInitialValue();
            case KExpressionsPackage.VALUED_OBJECT__IS_INPUT:
                return isIsInput();
            case KExpressionsPackage.VALUED_OBJECT__IS_OUTPUT:
                return isIsOutput();
            case KExpressionsPackage.VALUED_OBJECT__IS_STATIC:
                return isIsStatic();
            case KExpressionsPackage.VALUED_OBJECT__IS_SIGNAL:
                return isIsSignal();
            case KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR:
                return getCombineOperator();
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
            case KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE:
                setInitialValue((String)newValue);
                return;
            case KExpressionsPackage.VALUED_OBJECT__IS_INPUT:
                setIsInput((Boolean)newValue);
                return;
            case KExpressionsPackage.VALUED_OBJECT__IS_OUTPUT:
                setIsOutput((Boolean)newValue);
                return;
            case KExpressionsPackage.VALUED_OBJECT__IS_STATIC:
                setIsStatic((Boolean)newValue);
                return;
            case KExpressionsPackage.VALUED_OBJECT__IS_SIGNAL:
                setIsSignal((Boolean)newValue);
                return;
            case KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR:
                setCombineOperator((CombineOperator)newValue);
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
            case KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE:
                setInitialValue(INITIAL_VALUE_EDEFAULT);
                return;
            case KExpressionsPackage.VALUED_OBJECT__IS_INPUT:
                setIsInput(IS_INPUT_EDEFAULT);
                return;
            case KExpressionsPackage.VALUED_OBJECT__IS_OUTPUT:
                setIsOutput(IS_OUTPUT_EDEFAULT);
                return;
            case KExpressionsPackage.VALUED_OBJECT__IS_STATIC:
                setIsStatic(IS_STATIC_EDEFAULT);
                return;
            case KExpressionsPackage.VALUED_OBJECT__IS_SIGNAL:
                setIsSignal(IS_SIGNAL_EDEFAULT);
                return;
            case KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR:
                setCombineOperator(COMBINE_OPERATOR_EDEFAULT);
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
            case KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE:
                return INITIAL_VALUE_EDEFAULT == null ? initialValue != null : !INITIAL_VALUE_EDEFAULT.equals(initialValue);
            case KExpressionsPackage.VALUED_OBJECT__IS_INPUT:
                return isInput != IS_INPUT_EDEFAULT;
            case KExpressionsPackage.VALUED_OBJECT__IS_OUTPUT:
                return isOutput != IS_OUTPUT_EDEFAULT;
            case KExpressionsPackage.VALUED_OBJECT__IS_STATIC:
                return isStatic != IS_STATIC_EDEFAULT;
            case KExpressionsPackage.VALUED_OBJECT__IS_SIGNAL:
                return isSignal != IS_SIGNAL_EDEFAULT;
            case KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR:
                return combineOperator != COMBINE_OPERATOR_EDEFAULT;
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
        result.append(", initialValue: ");
        result.append(initialValue);
        result.append(", isInput: ");
        result.append(isInput);
        result.append(", isOutput: ");
        result.append(isOutput);
        result.append(", isStatic: ");
        result.append(isStatic);
        result.append(", isSignal: ");
        result.append(isSignal);
        result.append(", combineOperator: ");
        result.append(combineOperator);
        result.append(')');
        return result.toString();
    }

} //ValuedObjectImpl
