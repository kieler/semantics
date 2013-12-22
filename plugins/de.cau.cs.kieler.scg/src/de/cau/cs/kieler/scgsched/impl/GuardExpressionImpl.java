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
package de.cau.cs.kieler.scgsched.impl;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import de.cau.cs.kieler.scgsched.EmptyExpressions;
import de.cau.cs.kieler.scgsched.GuardExpression;
import de.cau.cs.kieler.scgsched.ScgschedPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.GuardExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.GuardExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.GuardExpressionImpl#getEmptyExpressions <em>Empty Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardExpressionImpl extends MinimalEObjectImpl.Container implements GuardExpression {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected ValuedObject name;

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
	 * The cached value of the '{@link #getEmptyExpressions() <em>Empty Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyExpressions()
	 * @generated
	 * @ordered
	 */
	protected EmptyExpressions emptyExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuardExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScgschedPackage.Literals.GUARD_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuedObject getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (ValuedObject)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgschedPackage.GUARD_EXPRESSION__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuedObject basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(ValuedObject newName) {
		ValuedObject oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.GUARD_EXPRESSION__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgschedPackage.GUARD_EXPRESSION__EXPRESSION, oldExpression, newExpression);
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
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgschedPackage.GUARD_EXPRESSION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgschedPackage.GUARD_EXPRESSION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.GUARD_EXPRESSION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyExpressions getEmptyExpressions() {
		return emptyExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmptyExpressions(EmptyExpressions newEmptyExpressions, NotificationChain msgs) {
		EmptyExpressions oldEmptyExpressions = emptyExpressions;
		emptyExpressions = newEmptyExpressions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgschedPackage.GUARD_EXPRESSION__EMPTY_EXPRESSIONS, oldEmptyExpressions, newEmptyExpressions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmptyExpressions(EmptyExpressions newEmptyExpressions) {
		if (newEmptyExpressions != emptyExpressions) {
			NotificationChain msgs = null;
			if (emptyExpressions != null)
				msgs = ((InternalEObject)emptyExpressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgschedPackage.GUARD_EXPRESSION__EMPTY_EXPRESSIONS, null, msgs);
			if (newEmptyExpressions != null)
				msgs = ((InternalEObject)newEmptyExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgschedPackage.GUARD_EXPRESSION__EMPTY_EXPRESSIONS, null, msgs);
			msgs = basicSetEmptyExpressions(newEmptyExpressions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.GUARD_EXPRESSION__EMPTY_EXPRESSIONS, newEmptyExpressions, newEmptyExpressions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScgschedPackage.GUARD_EXPRESSION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case ScgschedPackage.GUARD_EXPRESSION__EMPTY_EXPRESSIONS:
				return basicSetEmptyExpressions(null, msgs);
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
			case ScgschedPackage.GUARD_EXPRESSION__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ScgschedPackage.GUARD_EXPRESSION__EXPRESSION:
				return getExpression();
			case ScgschedPackage.GUARD_EXPRESSION__EMPTY_EXPRESSIONS:
				return getEmptyExpressions();
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
			case ScgschedPackage.GUARD_EXPRESSION__NAME:
				setName((ValuedObject)newValue);
				return;
			case ScgschedPackage.GUARD_EXPRESSION__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case ScgschedPackage.GUARD_EXPRESSION__EMPTY_EXPRESSIONS:
				setEmptyExpressions((EmptyExpressions)newValue);
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
			case ScgschedPackage.GUARD_EXPRESSION__NAME:
				setName((ValuedObject)null);
				return;
			case ScgschedPackage.GUARD_EXPRESSION__EXPRESSION:
				setExpression((Expression)null);
				return;
			case ScgschedPackage.GUARD_EXPRESSION__EMPTY_EXPRESSIONS:
				setEmptyExpressions((EmptyExpressions)null);
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
			case ScgschedPackage.GUARD_EXPRESSION__NAME:
				return name != null;
			case ScgschedPackage.GUARD_EXPRESSION__EXPRESSION:
				return expression != null;
			case ScgschedPackage.GUARD_EXPRESSION__EMPTY_EXPRESSIONS:
				return emptyExpressions != null;
		}
		return super.eIsSet(featureID);
	}

} //GuardExpressionImpl
