/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.impl;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Assignment;
import de.cau.cs.kieler.synccharts.ComplexExpression;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ExpressionImpl#getParentAction <em>Parent Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ExpressionImpl#getParentEmisson <em>Parent Emisson</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ExpressionImpl#getParentAssignment <em>Parent Assignment</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ExpressionImpl#getParentExpression <em>Parent Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends EObjectImpl implements Expression {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SyncchartsPackage.Literals.EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Action getParentAction() {
        if (eContainerFeatureID() != SyncchartsPackage.EXPRESSION__PARENT_ACTION) return null;
        return (Action)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAction(Action newParentAction, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentAction, SyncchartsPackage.EXPRESSION__PARENT_ACTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAction(Action newParentAction) {
        if (newParentAction != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.EXPRESSION__PARENT_ACTION && newParentAction != null)) {
            if (EcoreUtil.isAncestor(this, newParentAction))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentAction != null)
                msgs = ((InternalEObject)newParentAction).eInverseAdd(this, SyncchartsPackage.ACTION__TRIGGER, Action.class, msgs);
            msgs = basicSetParentAction(newParentAction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.EXPRESSION__PARENT_ACTION, newParentAction, newParentAction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Emission getParentEmisson() {
        if (eContainerFeatureID() != SyncchartsPackage.EXPRESSION__PARENT_EMISSON) return null;
        return (Emission)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentEmisson(Emission newParentEmisson, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentEmisson, SyncchartsPackage.EXPRESSION__PARENT_EMISSON, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentEmisson(Emission newParentEmisson) {
        if (newParentEmisson != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.EXPRESSION__PARENT_EMISSON && newParentEmisson != null)) {
            if (EcoreUtil.isAncestor(this, newParentEmisson))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentEmisson != null)
                msgs = ((InternalEObject)newParentEmisson).eInverseAdd(this, SyncchartsPackage.EMISSION__NEW_VALUE, Emission.class, msgs);
            msgs = basicSetParentEmisson(newParentEmisson, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.EXPRESSION__PARENT_EMISSON, newParentEmisson, newParentEmisson));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Assignment getParentAssignment() {
        if (eContainerFeatureID() != SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT) return null;
        return (Assignment)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAssignment(Assignment newParentAssignment, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentAssignment, SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAssignment(Assignment newParentAssignment) {
        if (newParentAssignment != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT && newParentAssignment != null)) {
            if (EcoreUtil.isAncestor(this, newParentAssignment))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentAssignment != null)
                msgs = ((InternalEObject)newParentAssignment).eInverseAdd(this, SyncchartsPackage.ASSIGNMENT__EXPRESSION, Assignment.class, msgs);
            msgs = basicSetParentAssignment(newParentAssignment, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT, newParentAssignment, newParentAssignment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexExpression getParentExpression() {
        if (eContainerFeatureID() != SyncchartsPackage.EXPRESSION__PARENT_EXPRESSION) return null;
        return (ComplexExpression)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentExpression(ComplexExpression newParentExpression, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentExpression, SyncchartsPackage.EXPRESSION__PARENT_EXPRESSION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentExpression(ComplexExpression newParentExpression) {
        if (newParentExpression != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.EXPRESSION__PARENT_EXPRESSION && newParentExpression != null)) {
            if (EcoreUtil.isAncestor(this, newParentExpression))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentExpression != null)
                msgs = ((InternalEObject)newParentExpression).eInverseAdd(this, SyncchartsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS, ComplexExpression.class, msgs);
            msgs = basicSetParentExpression(newParentExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.EXPRESSION__PARENT_EXPRESSION, newParentExpression, newParentExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SyncchartsPackage.EXPRESSION__PARENT_ACTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentAction((Action)otherEnd, msgs);
            case SyncchartsPackage.EXPRESSION__PARENT_EMISSON:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentEmisson((Emission)otherEnd, msgs);
            case SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentAssignment((Assignment)otherEnd, msgs);
            case SyncchartsPackage.EXPRESSION__PARENT_EXPRESSION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentExpression((ComplexExpression)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SyncchartsPackage.EXPRESSION__PARENT_ACTION:
                return basicSetParentAction(null, msgs);
            case SyncchartsPackage.EXPRESSION__PARENT_EMISSON:
                return basicSetParentEmisson(null, msgs);
            case SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT:
                return basicSetParentAssignment(null, msgs);
            case SyncchartsPackage.EXPRESSION__PARENT_EXPRESSION:
                return basicSetParentExpression(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case SyncchartsPackage.EXPRESSION__PARENT_ACTION:
                return eInternalContainer().eInverseRemove(this, SyncchartsPackage.ACTION__TRIGGER, Action.class, msgs);
            case SyncchartsPackage.EXPRESSION__PARENT_EMISSON:
                return eInternalContainer().eInverseRemove(this, SyncchartsPackage.EMISSION__NEW_VALUE, Emission.class, msgs);
            case SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT:
                return eInternalContainer().eInverseRemove(this, SyncchartsPackage.ASSIGNMENT__EXPRESSION, Assignment.class, msgs);
            case SyncchartsPackage.EXPRESSION__PARENT_EXPRESSION:
                return eInternalContainer().eInverseRemove(this, SyncchartsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS, ComplexExpression.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SyncchartsPackage.EXPRESSION__PARENT_ACTION:
                return getParentAction();
            case SyncchartsPackage.EXPRESSION__PARENT_EMISSON:
                return getParentEmisson();
            case SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT:
                return getParentAssignment();
            case SyncchartsPackage.EXPRESSION__PARENT_EXPRESSION:
                return getParentExpression();
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
            case SyncchartsPackage.EXPRESSION__PARENT_ACTION:
                setParentAction((Action)newValue);
                return;
            case SyncchartsPackage.EXPRESSION__PARENT_EMISSON:
                setParentEmisson((Emission)newValue);
                return;
            case SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT:
                setParentAssignment((Assignment)newValue);
                return;
            case SyncchartsPackage.EXPRESSION__PARENT_EXPRESSION:
                setParentExpression((ComplexExpression)newValue);
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
            case SyncchartsPackage.EXPRESSION__PARENT_ACTION:
                setParentAction((Action)null);
                return;
            case SyncchartsPackage.EXPRESSION__PARENT_EMISSON:
                setParentEmisson((Emission)null);
                return;
            case SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT:
                setParentAssignment((Assignment)null);
                return;
            case SyncchartsPackage.EXPRESSION__PARENT_EXPRESSION:
                setParentExpression((ComplexExpression)null);
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
            case SyncchartsPackage.EXPRESSION__PARENT_ACTION:
                return getParentAction() != null;
            case SyncchartsPackage.EXPRESSION__PARENT_EMISSON:
                return getParentEmisson() != null;
            case SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT:
                return getParentAssignment() != null;
            case SyncchartsPackage.EXPRESSION__PARENT_EXPRESSION:
                return getParentExpression() != null;
        }
        return super.eIsSet(featureID);
    }

} //ExpressionImpl
