/**
 */
package de.cau.cs.kieler.kexpressions.impl;

import de.cau.cs.kieler.annotations.NamedObject;

import de.cau.cs.kieler.kexpressions.GenericParameterDeclaration;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.ValueType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.GenericParameterDeclarationImpl#isReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.GenericParameterDeclarationImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.GenericParameterDeclarationImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericParameterDeclarationImpl extends DeclarationImpl implements GenericParameterDeclaration {
    /**
     * The default value of the '{@link #isReference() <em>Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isReference()
     * @generated
     * @ordered
     */
    protected static final boolean REFERENCE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isReference() <em>Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isReference()
     * @generated
     * @ordered
     */
    protected boolean reference = REFERENCE_EDEFAULT;

    /**
     * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueType()
     * @generated
     * @ordered
     */
    protected static final ValueType VALUE_TYPE_EDEFAULT = ValueType.UNKNOWN;

    /**
     * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueType()
     * @generated
     * @ordered
     */
    protected ValueType valueType = VALUE_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected NamedObject type;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GenericParameterDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExpressionsPackage.Literals.GENERIC_PARAMETER_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isReference() {
        return reference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReference(boolean newReference) {
        boolean oldReference = reference;
        reference = newReference;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.GENERIC_PARAMETER_DECLARATION__REFERENCE, oldReference, reference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValueType getValueType() {
        return valueType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValueType(ValueType newValueType) {
        ValueType oldValueType = valueType;
        valueType = newValueType == null ? VALUE_TYPE_EDEFAULT : newValueType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.GENERIC_PARAMETER_DECLARATION__VALUE_TYPE, oldValueType, valueType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NamedObject getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (NamedObject)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, KExpressionsPackage.GENERIC_PARAMETER_DECLARATION__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedObject basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType(NamedObject newType) {
        NamedObject oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.GENERIC_PARAMETER_DECLARATION__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case KExpressionsPackage.GENERIC_PARAMETER_DECLARATION__REFERENCE:
                return isReference();
            case KExpressionsPackage.GENERIC_PARAMETER_DECLARATION__VALUE_TYPE:
                return getValueType();
            case KExpressionsPackage.GENERIC_PARAMETER_DECLARATION__TYPE:
                if (resolve) return getType();
                return basicGetType();
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
            case KExpressionsPackage.GENERIC_PARAMETER_DECLARATION__REFERENCE:
                setReference((Boolean)newValue);
                return;
            case KExpressionsPackage.GENERIC_PARAMETER_DECLARATION__VALUE_TYPE:
                setValueType((ValueType)newValue);
                return;
            case KExpressionsPackage.GENERIC_PARAMETER_DECLARATION__TYPE:
                setType((NamedObject)newValue);
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
            case KExpressionsPackage.GENERIC_PARAMETER_DECLARATION__REFERENCE:
                setReference(REFERENCE_EDEFAULT);
                return;
            case KExpressionsPackage.GENERIC_PARAMETER_DECLARATION__VALUE_TYPE:
                setValueType(VALUE_TYPE_EDEFAULT);
                return;
            case KExpressionsPackage.GENERIC_PARAMETER_DECLARATION__TYPE:
                setType((NamedObject)null);
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
            case KExpressionsPackage.GENERIC_PARAMETER_DECLARATION__REFERENCE:
                return reference != REFERENCE_EDEFAULT;
            case KExpressionsPackage.GENERIC_PARAMETER_DECLARATION__VALUE_TYPE:
                return valueType != VALUE_TYPE_EDEFAULT;
            case KExpressionsPackage.GENERIC_PARAMETER_DECLARATION__TYPE:
                return type != null;
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
        result.append(" (reference: ");
        result.append(reference);
        result.append(", valueType: ");
        result.append(valueType);
        result.append(')');
        return result.toString();
    }

} //GenericParameterDeclarationImpl
