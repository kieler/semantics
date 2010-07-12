/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.Behavior;
import uml.BehaviorExecutionSpecification;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.BehaviorExecutionSpecificationImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorExecutionSpecificationImpl extends ExecutionSpecificationImpl implements BehaviorExecutionSpecification {
    /**
     * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehavior()
     * @generated
     * @ordered
     */
    protected Behavior behavior;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehaviorExecutionSpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getBehaviorExecutionSpecification();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Behavior getBehavior() {
        if (behavior != null && behavior.eIsProxy()) {
            InternalEObject oldBehavior = (InternalEObject)behavior;
            behavior = (Behavior)eResolveProxy(oldBehavior);
            if (behavior != oldBehavior) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR, oldBehavior, behavior));
            }
        }
        return behavior;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Behavior basicGetBehavior() {
        return behavior;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBehavior(Behavior newBehavior) {
        Behavior oldBehavior = behavior;
        behavior = newBehavior;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR, oldBehavior, behavior));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR:
                if (resolve) return getBehavior();
                return basicGetBehavior();
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
            case UmlPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR:
                setBehavior((Behavior)newValue);
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
            case UmlPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR:
                setBehavior((Behavior)null);
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
            case UmlPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR:
                return behavior != null;
        }
        return super.eIsSet(featureID);
    }

} //BehaviorExecutionSpecificationImpl
