/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scgdep.impl;

import de.cau.cs.kieler.scg.Link;

import de.cau.cs.kieler.scg.impl.AssignmentImpl;

import de.cau.cs.kieler.scgdep.AssignmentDep;
import de.cau.cs.kieler.scgdep.NodeDep;
import de.cau.cs.kieler.scgdep.ScgdepPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Dep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgdep.impl.AssignmentDepImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentDepImpl extends AssignmentImpl implements AssignmentDep {
    /**
     * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDependencies()
     * @generated
     * @ordered
     */
    protected EList<Link> dependencies;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssignmentDepImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgdepPackage.Literals.ASSIGNMENT_DEP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Link> getDependencies() {
        if (dependencies == null) {
            dependencies = new EObjectContainmentEList<Link>(Link.class, this, ScgdepPackage.ASSIGNMENT_DEP__DEPENDENCIES);
        }
        return dependencies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgdepPackage.ASSIGNMENT_DEP__DEPENDENCIES:
                return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
            case ScgdepPackage.ASSIGNMENT_DEP__DEPENDENCIES:
                return getDependencies();
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
            case ScgdepPackage.ASSIGNMENT_DEP__DEPENDENCIES:
                getDependencies().clear();
                getDependencies().addAll((Collection<? extends Link>)newValue);
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
            case ScgdepPackage.ASSIGNMENT_DEP__DEPENDENCIES:
                getDependencies().clear();
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
            case ScgdepPackage.ASSIGNMENT_DEP__DEPENDENCIES:
                return dependencies != null && !dependencies.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == NodeDep.class) {
            switch (derivedFeatureID) {
                case ScgdepPackage.ASSIGNMENT_DEP__DEPENDENCIES: return ScgdepPackage.NODE_DEP__DEPENDENCIES;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == NodeDep.class) {
            switch (baseFeatureID) {
                case ScgdepPackage.NODE_DEP__DEPENDENCIES: return ScgdepPackage.ASSIGNMENT_DEP__DEPENDENCIES;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //AssignmentDepImpl
