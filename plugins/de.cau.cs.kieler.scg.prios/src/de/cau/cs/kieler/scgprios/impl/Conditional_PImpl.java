/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.core.kexpressions.Expression;

import de.cau.cs.kieler.scgprios.Conditional_P;
import de.cau.cs.kieler.scgprios.ControlFlow_P;
import de.cau.cs.kieler.scgprios.ScgpriosPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Conditional_PImpl#getThen <em>Then</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Conditional_PImpl#getElse <em>Else</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Conditional_PImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Conditional_PImpl extends Node_PImpl implements Conditional_P {
    /**
     * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThen()
     * @generated
     * @ordered
     */
    protected ControlFlow_P then;

    /**
     * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElse()
     * @generated
     * @ordered
     */
    protected ControlFlow_P else_;

    /**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected Expression condition;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Conditional_PImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgpriosPackage.Literals.CONDITIONAL_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlFlow_P getThen() {
        return then;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetThen(ControlFlow_P newThen, NotificationChain msgs) {
        ControlFlow_P oldThen = then;
        then = newThen;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgpriosPackage.CONDITIONAL_P__THEN, oldThen, newThen);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setThen(ControlFlow_P newThen) {
        if (newThen != then) {
            NotificationChain msgs = null;
            if (then != null)
                msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.CONDITIONAL_P__THEN, null, msgs);
            if (newThen != null)
                msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.CONDITIONAL_P__THEN, null, msgs);
            msgs = basicSetThen(newThen, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.CONDITIONAL_P__THEN, newThen, newThen));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlFlow_P getElse() {
        return else_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElse(ControlFlow_P newElse, NotificationChain msgs) {
        ControlFlow_P oldElse = else_;
        else_ = newElse;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgpriosPackage.CONDITIONAL_P__ELSE, oldElse, newElse);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setElse(ControlFlow_P newElse) {
        if (newElse != else_) {
            NotificationChain msgs = null;
            if (else_ != null)
                msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.CONDITIONAL_P__ELSE, null, msgs);
            if (newElse != null)
                msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.CONDITIONAL_P__ELSE, null, msgs);
            msgs = basicSetElse(newElse, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.CONDITIONAL_P__ELSE, newElse, newElse));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
        Expression oldCondition = condition;
        condition = newCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgpriosPackage.CONDITIONAL_P__CONDITION, oldCondition, newCondition);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCondition(Expression newCondition) {
        if (newCondition != condition) {
            NotificationChain msgs = null;
            if (condition != null)
                msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.CONDITIONAL_P__CONDITION, null, msgs);
            if (newCondition != null)
                msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.CONDITIONAL_P__CONDITION, null, msgs);
            msgs = basicSetCondition(newCondition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.CONDITIONAL_P__CONDITION, newCondition, newCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgpriosPackage.CONDITIONAL_P__THEN:
                return basicSetThen(null, msgs);
            case ScgpriosPackage.CONDITIONAL_P__ELSE:
                return basicSetElse(null, msgs);
            case ScgpriosPackage.CONDITIONAL_P__CONDITION:
                return basicSetCondition(null, msgs);
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
            case ScgpriosPackage.CONDITIONAL_P__THEN:
                return getThen();
            case ScgpriosPackage.CONDITIONAL_P__ELSE:
                return getElse();
            case ScgpriosPackage.CONDITIONAL_P__CONDITION:
                return getCondition();
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
            case ScgpriosPackage.CONDITIONAL_P__THEN:
                setThen((ControlFlow_P)newValue);
                return;
            case ScgpriosPackage.CONDITIONAL_P__ELSE:
                setElse((ControlFlow_P)newValue);
                return;
            case ScgpriosPackage.CONDITIONAL_P__CONDITION:
                setCondition((Expression)newValue);
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
            case ScgpriosPackage.CONDITIONAL_P__THEN:
                setThen((ControlFlow_P)null);
                return;
            case ScgpriosPackage.CONDITIONAL_P__ELSE:
                setElse((ControlFlow_P)null);
                return;
            case ScgpriosPackage.CONDITIONAL_P__CONDITION:
                setCondition((Expression)null);
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
            case ScgpriosPackage.CONDITIONAL_P__THEN:
                return then != null;
            case ScgpriosPackage.CONDITIONAL_P__ELSE:
                return else_ != null;
            case ScgpriosPackage.CONDITIONAL_P__CONDITION:
                return condition != null;
        }
        return super.eIsSet(featureID);
    }

} //Conditional_PImpl
