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

import de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl;

import de.cau.cs.kieler.sccharts.PolicyClassDeclaration;
import de.cau.cs.kieler.sccharts.PolicyRegion;
import de.cau.cs.kieler.sccharts.SCChartsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.PolicyClassDeclarationImpl#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicyClassDeclarationImpl extends ClassDeclarationImpl implements PolicyClassDeclaration {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * The cached value of the '{@link #getPolicy() <em>Policy</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPolicy()
     * @generated
     * @ordered
     */
    protected PolicyRegion policy;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PolicyClassDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCChartsPackage.Literals.POLICY_CLASS_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PolicyRegion getPolicy() {
        return policy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPolicy(PolicyRegion newPolicy, NotificationChain msgs) {
        PolicyRegion oldPolicy = policy;
        policy = newPolicy;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsPackage.POLICY_CLASS_DECLARATION__POLICY, oldPolicy, newPolicy);
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
    public void setPolicy(PolicyRegion newPolicy) {
        if (newPolicy != policy) {
            NotificationChain msgs = null;
            if (policy != null)
                msgs = ((InternalEObject)policy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.POLICY_CLASS_DECLARATION__POLICY, null, msgs);
            if (newPolicy != null)
                msgs = ((InternalEObject)newPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.POLICY_CLASS_DECLARATION__POLICY, null, msgs);
            msgs = basicSetPolicy(newPolicy, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.POLICY_CLASS_DECLARATION__POLICY, newPolicy, newPolicy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCChartsPackage.POLICY_CLASS_DECLARATION__POLICY:
                return basicSetPolicy(null, msgs);
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
            case SCChartsPackage.POLICY_CLASS_DECLARATION__POLICY:
                return getPolicy();
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
            case SCChartsPackage.POLICY_CLASS_DECLARATION__POLICY:
                setPolicy((PolicyRegion)newValue);
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
            case SCChartsPackage.POLICY_CLASS_DECLARATION__POLICY:
                setPolicy((PolicyRegion)null);
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
            case SCChartsPackage.POLICY_CLASS_DECLARATION__POLICY:
                return policy != null;
        }
        return super.eIsSet(featureID);
    }

} //PolicyClassDeclarationImpl
