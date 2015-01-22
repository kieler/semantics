/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.scgprios.Dependency_P;
import de.cau.cs.kieler.scgprios.Guard_P;
import de.cau.cs.kieler.scgprios.Node_P;
import de.cau.cs.kieler.scgprios.ScgpriosPackage;
import de.cau.cs.kieler.scgprios.SchedulingBlock_P;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling Block P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.SchedulingBlock_PImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.SchedulingBlock_PImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.SchedulingBlock_PImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchedulingBlock_PImpl extends MinimalEObjectImpl.Container implements SchedulingBlock_P {
    /**
     * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNodes()
     * @generated
     * @ordered
     */
    protected EList<Node_P> nodes;

    /**
     * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDependencies()
     * @generated
     * @ordered
     */
    protected EList<Dependency_P> dependencies;

    /**
     * The cached value of the '{@link #getGuard() <em>Guard</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGuard()
     * @generated
     * @ordered
     */
    protected Guard_P guard;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SchedulingBlock_PImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgpriosPackage.Literals.SCHEDULING_BLOCK_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Node_P> getNodes() {
        if (nodes == null) {
            nodes = new EObjectResolvingEList<Node_P>(Node_P.class, this, ScgpriosPackage.SCHEDULING_BLOCK_P__NODES);
        }
        return nodes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Dependency_P> getDependencies() {
        if (dependencies == null) {
            dependencies = new EObjectResolvingEList<Dependency_P>(Dependency_P.class, this, ScgpriosPackage.SCHEDULING_BLOCK_P__DEPENDENCIES);
        }
        return dependencies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Guard_P getGuard() {
        if (guard != null && guard.eIsProxy()) {
            InternalEObject oldGuard = (InternalEObject)guard;
            guard = (Guard_P)eResolveProxy(oldGuard);
            if (guard != oldGuard) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgpriosPackage.SCHEDULING_BLOCK_P__GUARD, oldGuard, guard));
            }
        }
        return guard;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Guard_P basicGetGuard() {
        return guard;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGuard(Guard_P newGuard) {
        Guard_P oldGuard = guard;
        guard = newGuard;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.SCHEDULING_BLOCK_P__GUARD, oldGuard, guard));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScgpriosPackage.SCHEDULING_BLOCK_P__NODES:
                return getNodes();
            case ScgpriosPackage.SCHEDULING_BLOCK_P__DEPENDENCIES:
                return getDependencies();
            case ScgpriosPackage.SCHEDULING_BLOCK_P__GUARD:
                if (resolve) return getGuard();
                return basicGetGuard();
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
            case ScgpriosPackage.SCHEDULING_BLOCK_P__NODES:
                getNodes().clear();
                getNodes().addAll((Collection<? extends Node_P>)newValue);
                return;
            case ScgpriosPackage.SCHEDULING_BLOCK_P__DEPENDENCIES:
                getDependencies().clear();
                getDependencies().addAll((Collection<? extends Dependency_P>)newValue);
                return;
            case ScgpriosPackage.SCHEDULING_BLOCK_P__GUARD:
                setGuard((Guard_P)newValue);
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
            case ScgpriosPackage.SCHEDULING_BLOCK_P__NODES:
                getNodes().clear();
                return;
            case ScgpriosPackage.SCHEDULING_BLOCK_P__DEPENDENCIES:
                getDependencies().clear();
                return;
            case ScgpriosPackage.SCHEDULING_BLOCK_P__GUARD:
                setGuard((Guard_P)null);
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
            case ScgpriosPackage.SCHEDULING_BLOCK_P__NODES:
                return nodes != null && !nodes.isEmpty();
            case ScgpriosPackage.SCHEDULING_BLOCK_P__DEPENDENCIES:
                return dependencies != null && !dependencies.isEmpty();
            case ScgpriosPackage.SCHEDULING_BLOCK_P__GUARD:
                return guard != null;
        }
        return super.eIsSet(featureID);
    }

} //SchedulingBlock_PImpl
