/**
 */
package de.cau.cs.kieler.core.kexpressions.impl;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.PrimitiveType;
import de.cau.cs.kieler.core.kexpressions.PrimitiveTypeReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.PrimitiveTypeReferenceImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveTypeReferenceImpl extends TypeImpl implements PrimitiveTypeReference {
    /**
     * The cached value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrimitiveType()
     * @generated
     * @ordered
     */
    protected PrimitiveType primitiveType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PrimitiveTypeReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExpressionsPackage.Literals.PRIMITIVE_TYPE_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrimitiveType getPrimitiveType() {
        if (primitiveType != null && primitiveType.eIsProxy()) {
            InternalEObject oldPrimitiveType = (InternalEObject)primitiveType;
            primitiveType = (PrimitiveType)eResolveProxy(oldPrimitiveType);
            if (primitiveType != oldPrimitiveType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, KExpressionsPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE, oldPrimitiveType, primitiveType));
            }
        }
        return primitiveType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrimitiveType basicGetPrimitiveType() {
        return primitiveType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrimitiveType(PrimitiveType newPrimitiveType) {
        PrimitiveType oldPrimitiveType = primitiveType;
        primitiveType = newPrimitiveType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE, oldPrimitiveType, primitiveType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case KExpressionsPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE:
                if (resolve) return getPrimitiveType();
                return basicGetPrimitiveType();
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
            case KExpressionsPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE:
                setPrimitiveType((PrimitiveType)newValue);
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
            case KExpressionsPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE:
                setPrimitiveType((PrimitiveType)null);
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
            case KExpressionsPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE:
                return primitiveType != null;
        }
        return super.eIsSet(featureID);
    }

} //PrimitiveTypeReferenceImpl
