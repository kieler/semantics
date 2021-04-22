/**
 */
package de.cau.cs.kieler.scl.impl;

import de.cau.cs.kieler.scl.ForkType;
import de.cau.cs.kieler.scl.Parallel;
import de.cau.cs.kieler.scl.SCLPackage;

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
 * An implementation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.impl.ParallelImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.impl.ParallelImpl#isJoinAny <em>Join Any</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.impl.ParallelImpl#getForkType <em>Fork Type</em>}</li>
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
     * The default value of the '{@link #isJoinAny() <em>Join Any</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isJoinAny()
     * @generated
     * @ordered
     */
    protected static final boolean JOIN_ANY_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isJoinAny() <em>Join Any</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isJoinAny()
     * @generated
     * @ordered
     */
    protected boolean joinAny = JOIN_ANY_EDEFAULT;
    /**
     * The default value of the '{@link #getForkType() <em>Fork Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getForkType()
     * @generated
     * @ordered
     */
    protected static final ForkType FORK_TYPE_EDEFAULT = ForkType.PARALLEL;
    /**
     * The cached value of the '{@link #getForkType() <em>Fork Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getForkType()
     * @generated
     * @ordered
     */
    protected ForkType forkType = FORK_TYPE_EDEFAULT;

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
    public boolean isJoinAny() {
        return joinAny;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setJoinAny(boolean newJoinAny) {
        boolean oldJoinAny = joinAny;
        joinAny = newJoinAny;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCLPackage.PARALLEL__JOIN_ANY, oldJoinAny, joinAny));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ForkType getForkType() {
        return forkType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setForkType(ForkType newForkType) {
        ForkType oldForkType = forkType;
        forkType = newForkType == null ? FORK_TYPE_EDEFAULT : newForkType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCLPackage.PARALLEL__FORK_TYPE, oldForkType, forkType));
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
            case SCLPackage.PARALLEL__JOIN_ANY:
                return isJoinAny();
            case SCLPackage.PARALLEL__FORK_TYPE:
                return getForkType();
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
            case SCLPackage.PARALLEL__JOIN_ANY:
                setJoinAny((Boolean)newValue);
                return;
            case SCLPackage.PARALLEL__FORK_TYPE:
                setForkType((ForkType)newValue);
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
            case SCLPackage.PARALLEL__JOIN_ANY:
                setJoinAny(JOIN_ANY_EDEFAULT);
                return;
            case SCLPackage.PARALLEL__FORK_TYPE:
                setForkType(FORK_TYPE_EDEFAULT);
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
            case SCLPackage.PARALLEL__JOIN_ANY:
                return joinAny != JOIN_ANY_EDEFAULT;
            case SCLPackage.PARALLEL__FORK_TYPE:
                return forkType != FORK_TYPE_EDEFAULT;
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
        result.append(" (joinAny: ");
        result.append(joinAny);
        result.append(", forkType: ");
        result.append(forkType);
        result.append(')');
        return result.toString();
    }

} //ParallelImpl
