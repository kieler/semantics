/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.scgprios.ScgpriosPackage;
import de.cau.cs.kieler.scgprios.Schedule_P;
import de.cau.cs.kieler.scgprios.ScheduledBlock_P;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Schedule_PImpl#getScheduledBlocks <em>Scheduled Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Schedule_PImpl extends MinimalEObjectImpl.Container implements Schedule_P {
    /**
     * The cached value of the '{@link #getScheduledBlocks() <em>Scheduled Blocks</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScheduledBlocks()
     * @generated
     * @ordered
     */
    protected EList<ScheduledBlock_P> scheduledBlocks;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Schedule_PImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgpriosPackage.Literals.SCHEDULE_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScheduledBlock_P> getScheduledBlocks() {
        if (scheduledBlocks == null) {
            scheduledBlocks = new EObjectContainmentEList<ScheduledBlock_P>(ScheduledBlock_P.class, this, ScgpriosPackage.SCHEDULE_P__SCHEDULED_BLOCKS);
        }
        return scheduledBlocks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgpriosPackage.SCHEDULE_P__SCHEDULED_BLOCKS:
                return ((InternalEList<?>)getScheduledBlocks()).basicRemove(otherEnd, msgs);
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
            case ScgpriosPackage.SCHEDULE_P__SCHEDULED_BLOCKS:
                return getScheduledBlocks();
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
            case ScgpriosPackage.SCHEDULE_P__SCHEDULED_BLOCKS:
                getScheduledBlocks().clear();
                getScheduledBlocks().addAll((Collection<? extends ScheduledBlock_P>)newValue);
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
            case ScgpriosPackage.SCHEDULE_P__SCHEDULED_BLOCKS:
                getScheduledBlocks().clear();
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
            case ScgpriosPackage.SCHEDULE_P__SCHEDULED_BLOCKS:
                return scheduledBlocks != null && !scheduledBlocks.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //Schedule_PImpl
