/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.impl;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.ValueType;
import de.cau.cs.kieler.synccharts.ValuedObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valued Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ValuedObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ValuedObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ValuedObjectImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ValuedObjectImpl#getHostType <em>Host Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValuedObjectImpl extends EObjectImpl implements ValuedObject {
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
     * The default value of the '{@link #getHostType() <em>Host Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHostType()
     * @generated
     * @ordered
     */
    protected static final String HOST_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHostType() <em>Host Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHostType()
     * @generated
     * @ordered
     */
    protected String hostType = HOST_TYPE_EDEFAULT;

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
        return SyncchartsPackage.Literals.VALUED_OBJECT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.VALUED_OBJECT__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.VALUED_OBJECT__TYPE, oldType, type));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.VALUED_OBJECT__INITIAL_VALUE, oldInitialValue, initialValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHostType() {
        return hostType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHostType(String newHostType) {
        String oldHostType = hostType;
        hostType = newHostType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.VALUED_OBJECT__HOST_TYPE, oldHostType, hostType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SyncchartsPackage.VALUED_OBJECT__NAME:
                return getName();
            case SyncchartsPackage.VALUED_OBJECT__TYPE:
                return getType();
            case SyncchartsPackage.VALUED_OBJECT__INITIAL_VALUE:
                return getInitialValue();
            case SyncchartsPackage.VALUED_OBJECT__HOST_TYPE:
                return getHostType();
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
            case SyncchartsPackage.VALUED_OBJECT__NAME:
                setName((String)newValue);
                return;
            case SyncchartsPackage.VALUED_OBJECT__TYPE:
                setType((ValueType)newValue);
                return;
            case SyncchartsPackage.VALUED_OBJECT__INITIAL_VALUE:
                setInitialValue((String)newValue);
                return;
            case SyncchartsPackage.VALUED_OBJECT__HOST_TYPE:
                setHostType((String)newValue);
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
            case SyncchartsPackage.VALUED_OBJECT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case SyncchartsPackage.VALUED_OBJECT__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case SyncchartsPackage.VALUED_OBJECT__INITIAL_VALUE:
                setInitialValue(INITIAL_VALUE_EDEFAULT);
                return;
            case SyncchartsPackage.VALUED_OBJECT__HOST_TYPE:
                setHostType(HOST_TYPE_EDEFAULT);
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
            case SyncchartsPackage.VALUED_OBJECT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case SyncchartsPackage.VALUED_OBJECT__TYPE:
                return type != TYPE_EDEFAULT;
            case SyncchartsPackage.VALUED_OBJECT__INITIAL_VALUE:
                return INITIAL_VALUE_EDEFAULT == null ? initialValue != null : !INITIAL_VALUE_EDEFAULT.equals(initialValue);
            case SyncchartsPackage.VALUED_OBJECT__HOST_TYPE:
                return HOST_TYPE_EDEFAULT == null ? hostType != null : !HOST_TYPE_EDEFAULT.equals(hostType);
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
        result.append(", hostType: ");
        result.append(hostType);
        result.append(')');
        return result.toString();
    }

} //ValuedObjectImpl
