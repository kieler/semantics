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

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.PolicyClassDeclarationImpl#getPolicies <em>Policies</em>}</li>
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
     * The cached value of the '{@link #getPolicies() <em>Policies</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPolicies()
     * @generated
     * @ordered
     */
    protected EList<PolicyRegion> policies;

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
    public EList<PolicyRegion> getPolicies() {
        if (policies == null) {
            policies = new EObjectContainmentEList<PolicyRegion>(PolicyRegion.class, this, SCChartsPackage.POLICY_CLASS_DECLARATION__POLICIES);
        }
        return policies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCChartsPackage.POLICY_CLASS_DECLARATION__POLICIES:
                return ((InternalEList<?>)getPolicies()).basicRemove(otherEnd, msgs);
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
            case SCChartsPackage.POLICY_CLASS_DECLARATION__POLICIES:
                return getPolicies();
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
            case SCChartsPackage.POLICY_CLASS_DECLARATION__POLICIES:
                getPolicies().clear();
                getPolicies().addAll((Collection<? extends PolicyRegion>)newValue);
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
            case SCChartsPackage.POLICY_CLASS_DECLARATION__POLICIES:
                getPolicies().clear();
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
            case SCChartsPackage.POLICY_CLASS_DECLARATION__POLICIES:
                return policies != null && !policies.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PolicyClassDeclarationImpl
