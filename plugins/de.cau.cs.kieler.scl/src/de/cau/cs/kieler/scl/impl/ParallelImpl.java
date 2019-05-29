/**
 */
package de.cau.cs.kieler.scl.impl;

import de.cau.cs.kieler.scl.Parallel;
import de.cau.cs.kieler.scl.SCLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.impl.ParallelImpl#getThreads <em>Threads</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParallelImpl extends StatementImpl implements Parallel {
    /**
     * The cached value of the '{@link #getThreads() <em>Threads</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThreads()
     * @generated
     * @ordered
     */
    protected EList<de.cau.cs.kieler.scl.Thread> threads;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParallelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCLPackage.Literals.PARALLEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<de.cau.cs.kieler.scl.Thread> getThreads() {
        if (threads == null) {
            threads = new EObjectContainmentEList<de.cau.cs.kieler.scl.Thread>(de.cau.cs.kieler.scl.Thread.class, this, SCLPackage.PARALLEL__THREADS);
        }
        return threads;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCLPackage.PARALLEL__THREADS:
                return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
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
            case SCLPackage.PARALLEL__THREADS:
                return getThreads();
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
            case SCLPackage.PARALLEL__THREADS:
                getThreads().clear();
                getThreads().addAll((Collection<? extends de.cau.cs.kieler.scl.Thread>)newValue);
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
            case SCLPackage.PARALLEL__THREADS:
                getThreads().clear();
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
            case SCLPackage.PARALLEL__THREADS:
                return threads != null && !threads.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ParallelImpl
