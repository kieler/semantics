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
package scg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import scg.Conditional;
import scg.Link;
import scg.ScgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scg.impl.ConditionalImpl#getThen <em>Then</em>}</li>
 *   <li>{@link scg.impl.ConditionalImpl#getElse <em>Else</em>}</li>
 *   <li>{@link scg.impl.ConditionalImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalImpl extends NodeImpl implements Conditional {
    /**
     * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThen()
     * @generated
     * @ordered
     */
    protected Link then;

    /**
     * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElse()
     * @generated
     * @ordered
     */
    protected Link else_;

    /**
     * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected static final String CONDITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected String condition = CONDITION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConditionalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgPackage.Literals.CONDITIONAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Link getThen() {
        return then;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetThen(Link newThen, NotificationChain msgs) {
        Link oldThen = then;
        then = newThen;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.CONDITIONAL__THEN, oldThen, newThen);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setThen(Link newThen) {
        if (newThen != then) {
            NotificationChain msgs = null;
            if (then != null)
                msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgPackage.CONDITIONAL__THEN, null, msgs);
            if (newThen != null)
                msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgPackage.CONDITIONAL__THEN, null, msgs);
            msgs = basicSetThen(newThen, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.CONDITIONAL__THEN, newThen, newThen));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Link getElse() {
        return else_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElse(Link newElse, NotificationChain msgs) {
        Link oldElse = else_;
        else_ = newElse;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.CONDITIONAL__ELSE, oldElse, newElse);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setElse(Link newElse) {
        if (newElse != else_) {
            NotificationChain msgs = null;
            if (else_ != null)
                msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgPackage.CONDITIONAL__ELSE, null, msgs);
            if (newElse != null)
                msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgPackage.CONDITIONAL__ELSE, null, msgs);
            msgs = basicSetElse(newElse, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.CONDITIONAL__ELSE, newElse, newElse));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCondition() {
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCondition(String newCondition) {
        String oldCondition = condition;
        condition = newCondition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.CONDITIONAL__CONDITION, oldCondition, condition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgPackage.CONDITIONAL__THEN:
                return basicSetThen(null, msgs);
            case ScgPackage.CONDITIONAL__ELSE:
                return basicSetElse(null, msgs);
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
            case ScgPackage.CONDITIONAL__THEN:
                return getThen();
            case ScgPackage.CONDITIONAL__ELSE:
                return getElse();
            case ScgPackage.CONDITIONAL__CONDITION:
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
            case ScgPackage.CONDITIONAL__THEN:
                setThen((Link)newValue);
                return;
            case ScgPackage.CONDITIONAL__ELSE:
                setElse((Link)newValue);
                return;
            case ScgPackage.CONDITIONAL__CONDITION:
                setCondition((String)newValue);
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
            case ScgPackage.CONDITIONAL__THEN:
                setThen((Link)null);
                return;
            case ScgPackage.CONDITIONAL__ELSE:
                setElse((Link)null);
                return;
            case ScgPackage.CONDITIONAL__CONDITION:
                setCondition(CONDITION_EDEFAULT);
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
            case ScgPackage.CONDITIONAL__THEN:
                return then != null;
            case ScgPackage.CONDITIONAL__ELSE:
                return else_ != null;
            case ScgPackage.CONDITIONAL__CONDITION:
                return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
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
        result.append(" (Condition: ");
        result.append(condition);
        result.append(')');
        return result.toString();
    }

} //ConditionalImpl
