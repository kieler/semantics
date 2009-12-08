/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.impl;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Assignment;
import de.cau.cs.kieler.synccharts.ComplexExpression;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.HostCode;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.HostCodeImpl#getParentAction <em>Parent Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.HostCodeImpl#getParentEmisson <em>Parent Emisson</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.HostCodeImpl#getParentAssignment <em>Parent Assignment</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.HostCodeImpl#getParentExpression <em>Parent Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.HostCodeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.HostCodeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HostCodeImpl extends EffectImpl implements HostCode {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyncchartsPackage.Literals.HOST_CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getParentAction() {
		if (eContainerFeatureID() != SyncchartsPackage.HOST_CODE__PARENT_ACTION) return null;
		return (Action)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentAction(Action newParentAction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentAction, SyncchartsPackage.HOST_CODE__PARENT_ACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAction(Action newParentAction) {
		if (newParentAction != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.HOST_CODE__PARENT_ACTION && newParentAction != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.HOST_CODE__PARENT_ACTION, newParentAction, newParentAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emission getParentEmisson() {
		if (eContainerFeatureID() != SyncchartsPackage.HOST_CODE__PARENT_EMISSON) return null;
		return (Emission)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentEmisson(Emission newParentEmisson, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentEmisson, SyncchartsPackage.HOST_CODE__PARENT_EMISSON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentEmisson(Emission newParentEmisson) {
		if (newParentEmisson != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.HOST_CODE__PARENT_EMISSON && newParentEmisson != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.HOST_CODE__PARENT_EMISSON, newParentEmisson, newParentEmisson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment getParentAssignment() {
		if (eContainerFeatureID() != SyncchartsPackage.HOST_CODE__PARENT_ASSIGNMENT) return null;
		return (Assignment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentAssignment(Assignment newParentAssignment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentAssignment, SyncchartsPackage.HOST_CODE__PARENT_ASSIGNMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAssignment(Assignment newParentAssignment) {
		if (newParentAssignment != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.HOST_CODE__PARENT_ASSIGNMENT && newParentAssignment != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.HOST_CODE__PARENT_ASSIGNMENT, newParentAssignment, newParentAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexExpression getParentExpression() {
		if (eContainerFeatureID() != SyncchartsPackage.HOST_CODE__PARENT_EXPRESSION) return null;
		return (ComplexExpression)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentExpression(ComplexExpression newParentExpression, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentExpression, SyncchartsPackage.HOST_CODE__PARENT_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentExpression(ComplexExpression newParentExpression) {
		if (newParentExpression != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.HOST_CODE__PARENT_EXPRESSION && newParentExpression != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.HOST_CODE__PARENT_EXPRESSION, newParentExpression, newParentExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.HOST_CODE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.HOST_CODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SyncchartsPackage.HOST_CODE__PARENT_ACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentAction((Action)otherEnd, msgs);
			case SyncchartsPackage.HOST_CODE__PARENT_EMISSON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentEmisson((Emission)otherEnd, msgs);
			case SyncchartsPackage.HOST_CODE__PARENT_ASSIGNMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentAssignment((Assignment)otherEnd, msgs);
			case SyncchartsPackage.HOST_CODE__PARENT_EXPRESSION:
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
			case SyncchartsPackage.HOST_CODE__PARENT_ACTION:
				return basicSetParentAction(null, msgs);
			case SyncchartsPackage.HOST_CODE__PARENT_EMISSON:
				return basicSetParentEmisson(null, msgs);
			case SyncchartsPackage.HOST_CODE__PARENT_ASSIGNMENT:
				return basicSetParentAssignment(null, msgs);
			case SyncchartsPackage.HOST_CODE__PARENT_EXPRESSION:
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
			case SyncchartsPackage.HOST_CODE__PARENT_ACTION:
				return eInternalContainer().eInverseRemove(this, SyncchartsPackage.ACTION__TRIGGER, Action.class, msgs);
			case SyncchartsPackage.HOST_CODE__PARENT_EMISSON:
				return eInternalContainer().eInverseRemove(this, SyncchartsPackage.EMISSION__NEW_VALUE, Emission.class, msgs);
			case SyncchartsPackage.HOST_CODE__PARENT_ASSIGNMENT:
				return eInternalContainer().eInverseRemove(this, SyncchartsPackage.ASSIGNMENT__EXPRESSION, Assignment.class, msgs);
			case SyncchartsPackage.HOST_CODE__PARENT_EXPRESSION:
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
			case SyncchartsPackage.HOST_CODE__PARENT_ACTION:
				return getParentAction();
			case SyncchartsPackage.HOST_CODE__PARENT_EMISSON:
				return getParentEmisson();
			case SyncchartsPackage.HOST_CODE__PARENT_ASSIGNMENT:
				return getParentAssignment();
			case SyncchartsPackage.HOST_CODE__PARENT_EXPRESSION:
				return getParentExpression();
			case SyncchartsPackage.HOST_CODE__CODE:
				return getCode();
			case SyncchartsPackage.HOST_CODE__TYPE:
				return getType();
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
			case SyncchartsPackage.HOST_CODE__PARENT_ACTION:
				setParentAction((Action)newValue);
				return;
			case SyncchartsPackage.HOST_CODE__PARENT_EMISSON:
				setParentEmisson((Emission)newValue);
				return;
			case SyncchartsPackage.HOST_CODE__PARENT_ASSIGNMENT:
				setParentAssignment((Assignment)newValue);
				return;
			case SyncchartsPackage.HOST_CODE__PARENT_EXPRESSION:
				setParentExpression((ComplexExpression)newValue);
				return;
			case SyncchartsPackage.HOST_CODE__CODE:
				setCode((String)newValue);
				return;
			case SyncchartsPackage.HOST_CODE__TYPE:
				setType((String)newValue);
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
			case SyncchartsPackage.HOST_CODE__PARENT_ACTION:
				setParentAction((Action)null);
				return;
			case SyncchartsPackage.HOST_CODE__PARENT_EMISSON:
				setParentEmisson((Emission)null);
				return;
			case SyncchartsPackage.HOST_CODE__PARENT_ASSIGNMENT:
				setParentAssignment((Assignment)null);
				return;
			case SyncchartsPackage.HOST_CODE__PARENT_EXPRESSION:
				setParentExpression((ComplexExpression)null);
				return;
			case SyncchartsPackage.HOST_CODE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case SyncchartsPackage.HOST_CODE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case SyncchartsPackage.HOST_CODE__PARENT_ACTION:
				return getParentAction() != null;
			case SyncchartsPackage.HOST_CODE__PARENT_EMISSON:
				return getParentEmisson() != null;
			case SyncchartsPackage.HOST_CODE__PARENT_ASSIGNMENT:
				return getParentAssignment() != null;
			case SyncchartsPackage.HOST_CODE__PARENT_EXPRESSION:
				return getParentExpression() != null;
			case SyncchartsPackage.HOST_CODE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case SyncchartsPackage.HOST_CODE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Expression.class) {
			switch (derivedFeatureID) {
				case SyncchartsPackage.HOST_CODE__PARENT_ACTION: return SyncchartsPackage.EXPRESSION__PARENT_ACTION;
				case SyncchartsPackage.HOST_CODE__PARENT_EMISSON: return SyncchartsPackage.EXPRESSION__PARENT_EMISSON;
				case SyncchartsPackage.HOST_CODE__PARENT_ASSIGNMENT: return SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT;
				case SyncchartsPackage.HOST_CODE__PARENT_EXPRESSION: return SyncchartsPackage.EXPRESSION__PARENT_EXPRESSION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Expression.class) {
			switch (baseFeatureID) {
				case SyncchartsPackage.EXPRESSION__PARENT_ACTION: return SyncchartsPackage.HOST_CODE__PARENT_ACTION;
				case SyncchartsPackage.EXPRESSION__PARENT_EMISSON: return SyncchartsPackage.HOST_CODE__PARENT_EMISSON;
				case SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT: return SyncchartsPackage.HOST_CODE__PARENT_ASSIGNMENT;
				case SyncchartsPackage.EXPRESSION__PARENT_EXPRESSION: return SyncchartsPackage.HOST_CODE__PARENT_EXPRESSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (code: ");
		result.append(code);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //HostCodeImpl
