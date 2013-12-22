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

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.GuardExpressionImpl#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.GuardExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.GuardExpressionImpl#getEmptyExpressions <em>Empty Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardExpressionImpl extends MinimalEObjectImpl.Container implements GuardExpression {
	/**
	 * The cached value of the '{@link #getValuedObject() <em>Valued Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuedObject()
	 * @generated
	 * @ordered
	 */
	protected ValuedObject valuedObject;

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
	 * The cached value of the '{@link #getEmptyExpressions() <em>Empty Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<EmptyExpressions> emptyExpressions;

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
	public ValuedObject getValuedObject() {
		if (valuedObject != null && valuedObject.eIsProxy()) {
			InternalEObject oldValuedObject = (InternalEObject)valuedObject;
			valuedObject = (ValuedObject)eResolveProxy(oldValuedObject);
			if (valuedObject != oldValuedObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgschedPackage.GUARD_EXPRESSION__VALUED_OBJECT, oldValuedObject, valuedObject));
			}
		}
		return valuedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuedObject basicGetValuedObject() {
		return valuedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuedObject(ValuedObject newValuedObject) {
		ValuedObject oldValuedObject = valuedObject;
		valuedObject = newValuedObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.GUARD_EXPRESSION__VALUED_OBJECT, oldValuedObject, valuedObject));
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
	public EList<EmptyExpressions> getEmptyExpressions() {
		if (emptyExpressions == null) {
			emptyExpressions = new EObjectContainmentEList<EmptyExpressions>(EmptyExpressions.class, this, ScgschedPackage.GUARD_EXPRESSION__EMPTY_EXPRESSIONS);
		}
		return emptyExpressions;
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
				return ((InternalEList<?>)getEmptyExpressions()).basicRemove(otherEnd, msgs);
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
			case ScgschedPackage.GUARD_EXPRESSION__VALUED_OBJECT:
				if (resolve) return getValuedObject();
				return basicGetValuedObject();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScgschedPackage.GUARD_EXPRESSION__VALUED_OBJECT:
				setValuedObject((ValuedObject)newValue);
				return;
			case ScgschedPackage.GUARD_EXPRESSION__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case ScgschedPackage.GUARD_EXPRESSION__EMPTY_EXPRESSIONS:
				getEmptyExpressions().clear();
				getEmptyExpressions().addAll((Collection<? extends EmptyExpressions>)newValue);
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
			case ScgschedPackage.GUARD_EXPRESSION__VALUED_OBJECT:
				setValuedObject((ValuedObject)null);
				return;
			case ScgschedPackage.GUARD_EXPRESSION__EXPRESSION:
				setExpression((Expression)null);
				return;
			case ScgschedPackage.GUARD_EXPRESSION__EMPTY_EXPRESSIONS:
				getEmptyExpressions().clear();
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
			case ScgschedPackage.GUARD_EXPRESSION__VALUED_OBJECT:
				return valuedObject != null;
			case ScgschedPackage.GUARD_EXPRESSION__EXPRESSION:
				return expression != null;
			case ScgschedPackage.GUARD_EXPRESSION__EMPTY_EXPRESSIONS:
				return emptyExpressions != null && !emptyExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GuardExpressionImpl
