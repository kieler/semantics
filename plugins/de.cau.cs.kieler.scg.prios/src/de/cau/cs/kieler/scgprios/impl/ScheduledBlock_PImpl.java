/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.scgprios.ScgpriosPackage;
import de.cau.cs.kieler.scgprios.ScheduledBlock_P;
import de.cau.cs.kieler.scgprios.SchedulingBlock_P;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduled Block P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.ScheduledBlock_PImpl#getSchedulingBlock <em>Scheduling Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.ScheduledBlock_PImpl#isSchizophrenic <em>Schizophrenic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduledBlock_PImpl extends MinimalEObjectImpl.Container implements ScheduledBlock_P {
    /**
     * The cached value of the '{@link #getSchedulingBlock() <em>Scheduling Block</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchedulingBlock()
     * @generated
     * @ordered
     */
    protected SchedulingBlock_P schedulingBlock;

    /**
     * The default value of the '{@link #isSchizophrenic() <em>Schizophrenic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSchizophrenic()
     * @generated
     * @ordered
     */
    protected static final boolean SCHIZOPHRENIC_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSchizophrenic() <em>Schizophrenic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSchizophrenic()
     * @generated
     * @ordered
     */
    protected boolean schizophrenic = SCHIZOPHRENIC_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScheduledBlock_PImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgpriosPackage.Literals.SCHEDULED_BLOCK_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchedulingBlock_P getSchedulingBlock() {
        if (schedulingBlock != null && schedulingBlock.eIsProxy()) {
            InternalEObject oldSchedulingBlock = (InternalEObject)schedulingBlock;
            schedulingBlock = (SchedulingBlock_P)eResolveProxy(oldSchedulingBlock);
            if (schedulingBlock != oldSchedulingBlock) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgpriosPackage.SCHEDULED_BLOCK_P__SCHEDULING_BLOCK, oldSchedulingBlock, schedulingBlock));
            }
        }
        return schedulingBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchedulingBlock_P basicGetSchedulingBlock() {
        return schedulingBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSchedulingBlock(SchedulingBlock_P newSchedulingBlock) {
        SchedulingBlock_P oldSchedulingBlock = schedulingBlock;
        schedulingBlock = newSchedulingBlock;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.SCHEDULED_BLOCK_P__SCHEDULING_BLOCK, oldSchedulingBlock, schedulingBlock));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSchizophrenic() {
        return schizophrenic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSchizophrenic(boolean newSchizophrenic) {
        boolean oldSchizophrenic = schizophrenic;
        schizophrenic = newSchizophrenic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.SCHEDULED_BLOCK_P__SCHIZOPHRENIC, oldSchizophrenic, schizophrenic));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScgpriosPackage.SCHEDULED_BLOCK_P__SCHEDULING_BLOCK:
                if (resolve) return getSchedulingBlock();
                return basicGetSchedulingBlock();
            case ScgpriosPackage.SCHEDULED_BLOCK_P__SCHIZOPHRENIC:
                return isSchizophrenic();
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
            case ScgpriosPackage.SCHEDULED_BLOCK_P__SCHEDULING_BLOCK:
                setSchedulingBlock((SchedulingBlock_P)newValue);
                return;
            case ScgpriosPackage.SCHEDULED_BLOCK_P__SCHIZOPHRENIC:
                setSchizophrenic((Boolean)newValue);
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
            case ScgpriosPackage.SCHEDULED_BLOCK_P__SCHEDULING_BLOCK:
                setSchedulingBlock((SchedulingBlock_P)null);
                return;
            case ScgpriosPackage.SCHEDULED_BLOCK_P__SCHIZOPHRENIC:
                setSchizophrenic(SCHIZOPHRENIC_EDEFAULT);
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
            case ScgpriosPackage.SCHEDULED_BLOCK_P__SCHEDULING_BLOCK:
                return schedulingBlock != null;
            case ScgpriosPackage.SCHEDULED_BLOCK_P__SCHIZOPHRENIC:
                return schizophrenic != SCHIZOPHRENIC_EDEFAULT;
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (schizophrenic: ");
        result.append(schizophrenic);
        result.append(')');
        return result.toString();
    }

} //ScheduledBlock_PImpl
