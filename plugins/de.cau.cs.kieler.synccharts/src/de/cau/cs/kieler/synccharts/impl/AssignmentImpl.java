/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.impl;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Assignment;
import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.AssignmentImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.AssignmentImpl#getParentAction <em>Parent Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.AssignmentImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends EObjectImpl implements Assignment {
	/**
     * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVariable()
     * @generated
     * @ordered
     */
	protected Variable variable;

	/**
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
	protected Expression expression;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AssignmentImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SyncchartsPackage.Literals.ASSIGNMENT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Variable getVariable() {
        if (variable != null && variable.eIsProxy()) {
            InternalEObject oldVariable = (InternalEObject)variable;
            variable = (Variable)eResolveProxy(oldVariable);
            if (variable != oldVariable) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SyncchartsPackage.ASSIGNMENT__VARIABLE, oldVariable, variable));
            }
        }
        return variable;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Variable basicGetVariable() {
        return variable;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setVariable(Variable newVariable) {
        Variable oldVariable = variable;
        variable = newVariable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.ASSIGNMENT__VARIABLE, oldVariable, variable));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Action getParentAction() {
        if (eContainerFeatureID() != SyncchartsPackage.ASSIGNMENT__PARENT_ACTION) return null;
        return (Action)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetParentAction(Action newParentAction, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentAction, SyncchartsPackage.ASSIGNMENT__PARENT_ACTION, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setParentAction(Action newParentAction) {
        if (newParentAction != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.ASSIGNMENT__PARENT_ACTION && newParentAction != null)) {
            if (EcoreUtil.isAncestor(this, newParentAction))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentAction != null)
                msgs = ((InternalEObject)newParentAction).eInverseAdd(this, SyncchartsPackage.ACTION__ASSIGNMENTS, Action.class, msgs);
            msgs = basicSetParentAction(newParentAction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.ASSIGNMENT__PARENT_ACTION, newParentAction, newParentAction));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Expression getExpression() {
        return expression;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
        Expression oldExpression = expression;
        expression = newExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SyncchartsPackage.ASSIGNMENT__EXPRESSION, oldExpression, newExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setExpression(Expression newExpression) {
        if (newExpression != expression) {
            NotificationChain msgs = null;
            if (expression != null)
                msgs = ((InternalEObject)expression).eInverseRemove(this, SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT, Expression.class, msgs);
            if (newExpression != null)
                msgs = ((InternalEObject)newExpression).eInverseAdd(this, SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT, Expression.class, msgs);
            msgs = basicSetExpression(newExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.ASSIGNMENT__EXPRESSION, newExpression, newExpression));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SyncchartsPackage.ASSIGNMENT__PARENT_ACTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentAction((Action)otherEnd, msgs);
            case SyncchartsPackage.ASSIGNMENT__EXPRESSION:
                if (expression != null)
                    msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SyncchartsPackage.ASSIGNMENT__EXPRESSION, null, msgs);
                return basicSetExpression((Expression)otherEnd, msgs);
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
            case SyncchartsPackage.ASSIGNMENT__PARENT_ACTION:
                return basicSetParentAction(null, msgs);
            case SyncchartsPackage.ASSIGNMENT__EXPRESSION:
                return basicSetExpression(null, msgs);
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
            case SyncchartsPackage.ASSIGNMENT__PARENT_ACTION:
                return eInternalContainer().eInverseRemove(this, SyncchartsPackage.ACTION__ASSIGNMENTS, Action.class, msgs);
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
            case SyncchartsPackage.ASSIGNMENT__VARIABLE:
                if (resolve) return getVariable();
                return basicGetVariable();
            case SyncchartsPackage.ASSIGNMENT__PARENT_ACTION:
                return getParentAction();
            case SyncchartsPackage.ASSIGNMENT__EXPRESSION:
                return getExpression();
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
            case SyncchartsPackage.ASSIGNMENT__VARIABLE:
                setVariable((Variable)newValue);
                return;
            case SyncchartsPackage.ASSIGNMENT__PARENT_ACTION:
                setParentAction((Action)newValue);
                return;
            case SyncchartsPackage.ASSIGNMENT__EXPRESSION:
                setExpression((Expression)newValue);
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
            case SyncchartsPackage.ASSIGNMENT__VARIABLE:
                setVariable((Variable)null);
                return;
            case SyncchartsPackage.ASSIGNMENT__PARENT_ACTION:
                setParentAction((Action)null);
                return;
            case SyncchartsPackage.ASSIGNMENT__EXPRESSION:
                setExpression((Expression)null);
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
            case SyncchartsPackage.ASSIGNMENT__VARIABLE:
                return variable != null;
            case SyncchartsPackage.ASSIGNMENT__PARENT_ACTION:
                return getParentAction() != null;
            case SyncchartsPackage.ASSIGNMENT__EXPRESSION:
                return expression != null;
        }
        return super.eIsSet(featureID);
    }

} //AssignmentImpl
