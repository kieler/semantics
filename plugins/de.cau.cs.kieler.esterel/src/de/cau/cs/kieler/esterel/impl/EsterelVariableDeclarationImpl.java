/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.EsterelVariableDeclaration;
import de.cau.cs.kieler.esterel.TypeIdentifier;
import de.cau.cs.kieler.esterel.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.EsterelVariableDeclarationImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.EsterelVariableDeclarationImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EsterelVariableDeclarationImpl extends MinimalEObjectImpl.Container implements EsterelVariableDeclaration {
    /**
     * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariables()
     * @generated
     * @ordered
     */
    protected EList<Variable> variables;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected TypeIdentifier type;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EsterelVariableDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.ESTEREL_VARIABLE_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Variable> getVariables() {
        if (variables == null) {
            variables = new EObjectContainmentEList<Variable>(Variable.class, this, EsterelPackage.ESTEREL_VARIABLE_DECLARATION__VARIABLES);
        }
        return variables;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeIdentifier getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType(TypeIdentifier newType, NotificationChain msgs) {
        TypeIdentifier oldType = type;
        type = newType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.ESTEREL_VARIABLE_DECLARATION__TYPE, oldType, newType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(TypeIdentifier newType) {
        if (newType != type) {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.ESTEREL_VARIABLE_DECLARATION__TYPE, null, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.ESTEREL_VARIABLE_DECLARATION__TYPE, null, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.ESTEREL_VARIABLE_DECLARATION__TYPE, newType, newType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.ESTEREL_VARIABLE_DECLARATION__VARIABLES:
                return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
            case EsterelPackage.ESTEREL_VARIABLE_DECLARATION__TYPE:
                return basicSetType(null, msgs);
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
            case EsterelPackage.ESTEREL_VARIABLE_DECLARATION__VARIABLES:
                return getVariables();
            case EsterelPackage.ESTEREL_VARIABLE_DECLARATION__TYPE:
                return getType();
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
            case EsterelPackage.ESTEREL_VARIABLE_DECLARATION__VARIABLES:
                getVariables().clear();
                getVariables().addAll((Collection<? extends Variable>)newValue);
                return;
            case EsterelPackage.ESTEREL_VARIABLE_DECLARATION__TYPE:
                setType((TypeIdentifier)newValue);
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
            case EsterelPackage.ESTEREL_VARIABLE_DECLARATION__VARIABLES:
                getVariables().clear();
                return;
            case EsterelPackage.ESTEREL_VARIABLE_DECLARATION__TYPE:
                setType((TypeIdentifier)null);
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
            case EsterelPackage.ESTEREL_VARIABLE_DECLARATION__VARIABLES:
                return variables != null && !variables.isEmpty();
            case EsterelPackage.ESTEREL_VARIABLE_DECLARATION__TYPE:
                return type != null;
        }
        return super.eIsSet(featureID);
    }

} //EsterelVariableDeclarationImpl
