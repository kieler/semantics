/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.impl;

import de.cau.cs.kieler.synccharts.ComplexExpression;
import de.cau.cs.kieler.synccharts.Operator;
import de.cau.cs.kieler.synccharts.OperatorKind;
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
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.OperatorImpl#getOperatorKind <em>Operator Kind</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.OperatorImpl#getParentExpression <em>Parent Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatorImpl extends EObjectImpl implements Operator {
	/**
	 * The default value of the '{@link #getOperatorKind() <em>Operator Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorKind()
	 * @generated
	 * @ordered
	 */
	protected static final OperatorKind OPERATOR_KIND_EDEFAULT = OperatorKind.NOT;

	/**
	 * The cached value of the '{@link #getOperatorKind() <em>Operator Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorKind()
	 * @generated
	 * @ordered
	 */
	protected OperatorKind operatorKind = OPERATOR_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyncchartsPackage.Literals.OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorKind getOperatorKind() {
		return operatorKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatorKind(OperatorKind newOperatorKind) {
		OperatorKind oldOperatorKind = operatorKind;
		operatorKind = newOperatorKind == null ? OPERATOR_KIND_EDEFAULT : newOperatorKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.OPERATOR__OPERATOR_KIND, oldOperatorKind, operatorKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexExpression getParentExpression() {
		if (eContainerFeatureID != SyncchartsPackage.OPERATOR__PARENT_EXPRESSION) return null;
		return (ComplexExpression)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentExpression(ComplexExpression newParentExpression, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentExpression, SyncchartsPackage.OPERATOR__PARENT_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentExpression(ComplexExpression newParentExpression) {
		if (newParentExpression != eInternalContainer() || (eContainerFeatureID != SyncchartsPackage.OPERATOR__PARENT_EXPRESSION && newParentExpression != null)) {
			if (EcoreUtil.isAncestor(this, newParentExpression))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentExpression != null)
				msgs = ((InternalEObject)newParentExpression).eInverseAdd(this, SyncchartsPackage.COMPLEX_EXPRESSION__OPERATOR, ComplexExpression.class, msgs);
			msgs = basicSetParentExpression(newParentExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.OPERATOR__PARENT_EXPRESSION, newParentExpression, newParentExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SyncchartsPackage.OPERATOR__PARENT_EXPRESSION:
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
			case SyncchartsPackage.OPERATOR__PARENT_EXPRESSION:
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
		switch (eContainerFeatureID) {
			case SyncchartsPackage.OPERATOR__PARENT_EXPRESSION:
				return eInternalContainer().eInverseRemove(this, SyncchartsPackage.COMPLEX_EXPRESSION__OPERATOR, ComplexExpression.class, msgs);
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
			case SyncchartsPackage.OPERATOR__OPERATOR_KIND:
				return getOperatorKind();
			case SyncchartsPackage.OPERATOR__PARENT_EXPRESSION:
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
			case SyncchartsPackage.OPERATOR__OPERATOR_KIND:
				setOperatorKind((OperatorKind)newValue);
				return;
			case SyncchartsPackage.OPERATOR__PARENT_EXPRESSION:
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
			case SyncchartsPackage.OPERATOR__OPERATOR_KIND:
				setOperatorKind(OPERATOR_KIND_EDEFAULT);
				return;
			case SyncchartsPackage.OPERATOR__PARENT_EXPRESSION:
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
			case SyncchartsPackage.OPERATOR__OPERATOR_KIND:
				return operatorKind != OPERATOR_KIND_EDEFAULT;
			case SyncchartsPackage.OPERATOR__PARENT_EXPRESSION:
				return getParentExpression() != null;
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
		result.append(" (operatorKind: ");
		result.append(operatorKind);
		result.append(')');
		return result.toString();
	}

} //OperatorImpl
