/**
 */
package de.cau.cs.kieler.kicool.impl;

import de.cau.cs.kieler.kicool.KVPair;
import de.cau.cs.kieler.kicool.KiCoolPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KV Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.KVPairImpl#getKey <em>Key</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.KVPairImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.KVPairImpl#isIsKeyValue <em>Is Key Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KVPairImpl extends MinimalEObjectImpl.Container implements KVPair {
    /**
     * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKey()
     * @generated
     * @ordered
     */
    protected static final String KEY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKey()
     * @generated
     * @ordered
     */
    protected String key = KEY_EDEFAULT;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #isIsKeyValue() <em>Is Key Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsKeyValue()
     * @generated
     * @ordered
     */
    protected static final boolean IS_KEY_VALUE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsKeyValue() <em>Is Key Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsKeyValue()
     * @generated
     * @ordered
     */
    protected boolean isKeyValue = IS_KEY_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KVPairImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KiCoolPackage.Literals.KV_PAIR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getKey() {
        return key;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKey(String newKey) {
        String oldKey = key;
        key = newKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.KV_PAIR__KEY, oldKey, key));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(String newValue) {
        String oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.KV_PAIR__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsKeyValue() {
        return isKeyValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsKeyValue(boolean newIsKeyValue) {
        boolean oldIsKeyValue = isKeyValue;
        isKeyValue = newIsKeyValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.KV_PAIR__IS_KEY_VALUE, oldIsKeyValue, isKeyValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case KiCoolPackage.KV_PAIR__KEY:
                return getKey();
            case KiCoolPackage.KV_PAIR__VALUE:
                return getValue();
            case KiCoolPackage.KV_PAIR__IS_KEY_VALUE:
                return isIsKeyValue();
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
            case KiCoolPackage.KV_PAIR__KEY:
                setKey((String)newValue);
                return;
            case KiCoolPackage.KV_PAIR__VALUE:
                setValue((String)newValue);
                return;
            case KiCoolPackage.KV_PAIR__IS_KEY_VALUE:
                setIsKeyValue((Boolean)newValue);
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
            case KiCoolPackage.KV_PAIR__KEY:
                setKey(KEY_EDEFAULT);
                return;
            case KiCoolPackage.KV_PAIR__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case KiCoolPackage.KV_PAIR__IS_KEY_VALUE:
                setIsKeyValue(IS_KEY_VALUE_EDEFAULT);
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
            case KiCoolPackage.KV_PAIR__KEY:
                return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
            case KiCoolPackage.KV_PAIR__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
            case KiCoolPackage.KV_PAIR__IS_KEY_VALUE:
                return isKeyValue != IS_KEY_VALUE_EDEFAULT;
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
        result.append(" (key: ");
        result.append(key);
        result.append(", value: ");
        result.append(value);
        result.append(", isKeyValue: ");
        result.append(isKeyValue);
        result.append(')');
        return result.toString();
    }

} //KVPairImpl
