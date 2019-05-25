/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.Function;
import de.cau.cs.kieler.esterel.Signal;

import de.cau.cs.kieler.kexpressions.ValueType;

import de.cau.cs.kieler.kexpressions.impl.ValuedObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.SignalImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.SignalImpl#getIdType <em>Id Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.SignalImpl#getCombineFunction <em>Combine Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalImpl extends ValuedObjectImpl implements Signal {
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
     * The default value of the '{@link #getIdType() <em>Id Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdType()
     * @generated
     * @ordered
     */
    protected static final String ID_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdType() <em>Id Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdType()
     * @generated
     * @ordered
     */
    protected String idType = ID_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getCombineFunction() <em>Combine Function</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCombineFunction()
     * @generated
     * @ordered
     */
    protected Function combineFunction;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SignalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.SIGNAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValueType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType(ValueType newType) {
        ValueType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.SIGNAL__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIdType() {
        return idType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIdType(String newIdType) {
        String oldIdType = idType;
        idType = newIdType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.SIGNAL__ID_TYPE, oldIdType, idType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Function getCombineFunction() {
        if (combineFunction != null && combineFunction.eIsProxy()) {
            InternalEObject oldCombineFunction = (InternalEObject)combineFunction;
            combineFunction = (Function)eResolveProxy(oldCombineFunction);
            if (combineFunction != oldCombineFunction) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.SIGNAL__COMBINE_FUNCTION, oldCombineFunction, combineFunction));
            }
        }
        return combineFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Function basicGetCombineFunction() {
        return combineFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCombineFunction(Function newCombineFunction) {
        Function oldCombineFunction = combineFunction;
        combineFunction = newCombineFunction;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.SIGNAL__COMBINE_FUNCTION, oldCombineFunction, combineFunction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EsterelPackage.SIGNAL__TYPE:
                return getType();
            case EsterelPackage.SIGNAL__ID_TYPE:
                return getIdType();
            case EsterelPackage.SIGNAL__COMBINE_FUNCTION:
                if (resolve) return getCombineFunction();
                return basicGetCombineFunction();
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
            case EsterelPackage.SIGNAL__TYPE:
                setType((ValueType)newValue);
                return;
            case EsterelPackage.SIGNAL__ID_TYPE:
                setIdType((String)newValue);
                return;
            case EsterelPackage.SIGNAL__COMBINE_FUNCTION:
                setCombineFunction((Function)newValue);
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
            case EsterelPackage.SIGNAL__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case EsterelPackage.SIGNAL__ID_TYPE:
                setIdType(ID_TYPE_EDEFAULT);
                return;
            case EsterelPackage.SIGNAL__COMBINE_FUNCTION:
                setCombineFunction((Function)null);
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
            case EsterelPackage.SIGNAL__TYPE:
                return type != TYPE_EDEFAULT;
            case EsterelPackage.SIGNAL__ID_TYPE:
                return ID_TYPE_EDEFAULT == null ? idType != null : !ID_TYPE_EDEFAULT.equals(idType);
            case EsterelPackage.SIGNAL__COMBINE_FUNCTION:
                return combineFunction != null;
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (type: ");
        result.append(type);
        result.append(", idType: ");
        result.append(idType);
        result.append(')');
        return result.toString();
    }

} //SignalImpl
