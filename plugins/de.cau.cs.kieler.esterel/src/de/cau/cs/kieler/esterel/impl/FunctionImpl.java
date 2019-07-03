/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.Function;
import de.cau.cs.kieler.esterel.TypeIdentifier;

import de.cau.cs.kieler.kexpressions.impl.ValuedObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.FunctionImpl#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.FunctionImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends ValuedObjectImpl implements Function {
    /**
     * The cached value of the '{@link #getParameterTypes() <em>Parameter Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameterTypes()
     * @generated
     * @ordered
     */
    protected EList<TypeIdentifier> parameterTypes;

    /**
     * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReturnType()
     * @generated
     * @ordered
     */
    protected TypeIdentifier returnType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.FUNCTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<TypeIdentifier> getParameterTypes() {
        if (parameterTypes == null) {
            parameterTypes = new EObjectContainmentEList<TypeIdentifier>(TypeIdentifier.class, this, EsterelPackage.FUNCTION__PARAMETER_TYPES);
        }
        return parameterTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TypeIdentifier getReturnType() {
        return returnType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReturnType(TypeIdentifier newReturnType, NotificationChain msgs) {
        TypeIdentifier oldReturnType = returnType;
        returnType = newReturnType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.FUNCTION__RETURN_TYPE, oldReturnType, newReturnType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReturnType(TypeIdentifier newReturnType) {
        if (newReturnType != returnType) {
            NotificationChain msgs = null;
            if (returnType != null)
                msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.FUNCTION__RETURN_TYPE, null, msgs);
            if (newReturnType != null)
                msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.FUNCTION__RETURN_TYPE, null, msgs);
            msgs = basicSetReturnType(newReturnType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.FUNCTION__RETURN_TYPE, newReturnType, newReturnType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.FUNCTION__PARAMETER_TYPES:
                return ((InternalEList<?>)getParameterTypes()).basicRemove(otherEnd, msgs);
            case EsterelPackage.FUNCTION__RETURN_TYPE:
                return basicSetReturnType(null, msgs);
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
            case EsterelPackage.FUNCTION__PARAMETER_TYPES:
                return getParameterTypes();
            case EsterelPackage.FUNCTION__RETURN_TYPE:
                return getReturnType();
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
            case EsterelPackage.FUNCTION__PARAMETER_TYPES:
                getParameterTypes().clear();
                getParameterTypes().addAll((Collection<? extends TypeIdentifier>)newValue);
                return;
            case EsterelPackage.FUNCTION__RETURN_TYPE:
                setReturnType((TypeIdentifier)newValue);
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
            case EsterelPackage.FUNCTION__PARAMETER_TYPES:
                getParameterTypes().clear();
                return;
            case EsterelPackage.FUNCTION__RETURN_TYPE:
                setReturnType((TypeIdentifier)null);
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
            case EsterelPackage.FUNCTION__PARAMETER_TYPES:
                return parameterTypes != null && !parameterTypes.isEmpty();
            case EsterelPackage.FUNCTION__RETURN_TYPE:
                return returnType != null;
        }
        return super.eIsSet(featureID);
    }

} //FunctionImpl
