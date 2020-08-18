/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.impl;

import de.cau.cs.kieler.sccharts.GenericTypeParameter;
import de.cau.cs.kieler.sccharts.GenericTypeParameterReference;
import de.cau.cs.kieler.sccharts.SCChartsPackage;

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
 * An implementation of the model object '<em><b>Generic Type Parameter Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.GenericTypeParameterReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.GenericTypeParameterReferenceImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericTypeParameterReferenceImpl extends MinimalEObjectImpl.Container implements GenericTypeParameterReference {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected GenericTypeParameter target;

    /**
     * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeParameters()
     * @generated
     * @ordered
     */
    protected EList<GenericTypeParameterReference> typeParameters;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GenericTypeParameterReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCChartsPackage.Literals.GENERIC_TYPE_PARAMETER_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GenericTypeParameter getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject)target;
            target = (GenericTypeParameter)eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.GENERIC_TYPE_PARAMETER_REFERENCE__TARGET, oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericTypeParameter basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTarget(GenericTypeParameter newTarget) {
        GenericTypeParameter oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.GENERIC_TYPE_PARAMETER_REFERENCE__TARGET, oldTarget, target));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<GenericTypeParameterReference> getTypeParameters() {
        if (typeParameters == null) {
            typeParameters = new EObjectContainmentEList<GenericTypeParameterReference>(GenericTypeParameterReference.class, this, SCChartsPackage.GENERIC_TYPE_PARAMETER_REFERENCE__TYPE_PARAMETERS);
        }
        return typeParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_REFERENCE__TYPE_PARAMETERS:
                return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
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
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_REFERENCE__TARGET:
                if (resolve) return getTarget();
                return basicGetTarget();
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_REFERENCE__TYPE_PARAMETERS:
                return getTypeParameters();
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
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_REFERENCE__TARGET:
                setTarget((GenericTypeParameter)newValue);
                return;
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_REFERENCE__TYPE_PARAMETERS:
                getTypeParameters().clear();
                getTypeParameters().addAll((Collection<? extends GenericTypeParameterReference>)newValue);
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
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_REFERENCE__TARGET:
                setTarget((GenericTypeParameter)null);
                return;
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_REFERENCE__TYPE_PARAMETERS:
                getTypeParameters().clear();
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
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_REFERENCE__TARGET:
                return target != null;
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_REFERENCE__TYPE_PARAMETERS:
                return typeParameters != null && !typeParameters.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //GenericTypeParameterReferenceImpl
