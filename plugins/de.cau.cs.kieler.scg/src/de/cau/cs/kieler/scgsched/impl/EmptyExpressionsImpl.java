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
import de.cau.cs.kieler.scgsched.ScgschedPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empty Expressions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.EmptyExpressionsImpl#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.EmptyExpressionsImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmptyExpressionsImpl extends MinimalEObjectImpl.Container implements EmptyExpressions {
	/**
	 * The cached value of the '{@link #getValuedObject() <em>Valued Object</em>}' containment reference.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmptyExpressionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScgschedPackage.Literals.EMPTY_EXPRESSIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuedObject getValuedObject() {
		return valuedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuedObject(ValuedObject newValuedObject, NotificationChain msgs) {
		ValuedObject oldValuedObject = valuedObject;
		valuedObject = newValuedObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgschedPackage.EMPTY_EXPRESSIONS__VALUED_OBJECT, oldValuedObject, newValuedObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuedObject(ValuedObject newValuedObject) {
		if (newValuedObject != valuedObject) {
			NotificationChain msgs = null;
			if (valuedObject != null)
				msgs = ((InternalEObject)valuedObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgschedPackage.EMPTY_EXPRESSIONS__VALUED_OBJECT, null, msgs);
			if (newValuedObject != null)
				msgs = ((InternalEObject)newValuedObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgschedPackage.EMPTY_EXPRESSIONS__VALUED_OBJECT, null, msgs);
			msgs = basicSetValuedObject(newValuedObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.EMPTY_EXPRESSIONS__VALUED_OBJECT, newValuedObject, newValuedObject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgschedPackage.EMPTY_EXPRESSIONS__EXPRESSION, oldExpression, newExpression);
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
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgschedPackage.EMPTY_EXPRESSIONS__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgschedPackage.EMPTY_EXPRESSIONS__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.EMPTY_EXPRESSIONS__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScgschedPackage.EMPTY_EXPRESSIONS__VALUED_OBJECT:
				return basicSetValuedObject(null, msgs);
			case ScgschedPackage.EMPTY_EXPRESSIONS__EXPRESSION:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScgschedPackage.EMPTY_EXPRESSIONS__VALUED_OBJECT:
				return getValuedObject();
			case ScgschedPackage.EMPTY_EXPRESSIONS__EXPRESSION:
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
			case ScgschedPackage.EMPTY_EXPRESSIONS__VALUED_OBJECT:
				setValuedObject((ValuedObject)newValue);
				return;
			case ScgschedPackage.EMPTY_EXPRESSIONS__EXPRESSION:
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
			case ScgschedPackage.EMPTY_EXPRESSIONS__VALUED_OBJECT:
				setValuedObject((ValuedObject)null);
				return;
			case ScgschedPackage.EMPTY_EXPRESSIONS__EXPRESSION:
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
			case ScgschedPackage.EMPTY_EXPRESSIONS__VALUED_OBJECT:
				return valuedObject != null;
			case ScgschedPackage.EMPTY_EXPRESSIONS__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

} //EmptyExpressionsImpl
