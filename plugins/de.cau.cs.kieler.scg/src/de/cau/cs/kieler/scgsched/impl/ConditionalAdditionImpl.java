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
import de.cau.cs.kieler.scgbb.SchedulingBlock;
import de.cau.cs.kieler.scgsched.ConditionalAddition;
import de.cau.cs.kieler.scgsched.ScgschedPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Addition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.ConditionalAdditionImpl#getBeforeBlock <em>Before Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.ConditionalAdditionImpl#getUntilBlock <em>Until Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.ConditionalAdditionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalAdditionImpl extends AlterationImpl implements ConditionalAddition {
	/**
	 * The cached value of the '{@link #getBeforeBlock() <em>Before Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeBlock()
	 * @generated
	 * @ordered
	 */
	protected SchedulingBlock beforeBlock;

	/**
	 * The cached value of the '{@link #getUntilBlock() <em>Until Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilBlock()
	 * @generated
	 * @ordered
	 */
	protected SchedulingBlock untilBlock;

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
	protected ConditionalAdditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScgschedPackage.Literals.CONDITIONAL_ADDITION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgschedPackage.CONDITIONAL_ADDITION__CONDITION, oldCondition, newCondition);
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
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgschedPackage.CONDITIONAL_ADDITION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgschedPackage.CONDITIONAL_ADDITION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.CONDITIONAL_ADDITION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingBlock getBeforeBlock() {
		if (beforeBlock != null && beforeBlock.eIsProxy()) {
			InternalEObject oldBeforeBlock = (InternalEObject)beforeBlock;
			beforeBlock = (SchedulingBlock)eResolveProxy(oldBeforeBlock);
			if (beforeBlock != oldBeforeBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgschedPackage.CONDITIONAL_ADDITION__BEFORE_BLOCK, oldBeforeBlock, beforeBlock));
			}
		}
		return beforeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingBlock basicGetBeforeBlock() {
		return beforeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeBlock(SchedulingBlock newBeforeBlock) {
		SchedulingBlock oldBeforeBlock = beforeBlock;
		beforeBlock = newBeforeBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.CONDITIONAL_ADDITION__BEFORE_BLOCK, oldBeforeBlock, beforeBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingBlock getUntilBlock() {
		if (untilBlock != null && untilBlock.eIsProxy()) {
			InternalEObject oldUntilBlock = (InternalEObject)untilBlock;
			untilBlock = (SchedulingBlock)eResolveProxy(oldUntilBlock);
			if (untilBlock != oldUntilBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgschedPackage.CONDITIONAL_ADDITION__UNTIL_BLOCK, oldUntilBlock, untilBlock));
			}
		}
		return untilBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingBlock basicGetUntilBlock() {
		return untilBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntilBlock(SchedulingBlock newUntilBlock) {
		SchedulingBlock oldUntilBlock = untilBlock;
		untilBlock = newUntilBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.CONDITIONAL_ADDITION__UNTIL_BLOCK, oldUntilBlock, untilBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScgschedPackage.CONDITIONAL_ADDITION__CONDITION:
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
			case ScgschedPackage.CONDITIONAL_ADDITION__BEFORE_BLOCK:
				if (resolve) return getBeforeBlock();
				return basicGetBeforeBlock();
			case ScgschedPackage.CONDITIONAL_ADDITION__UNTIL_BLOCK:
				if (resolve) return getUntilBlock();
				return basicGetUntilBlock();
			case ScgschedPackage.CONDITIONAL_ADDITION__CONDITION:
				return getCondition();
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
			case ScgschedPackage.CONDITIONAL_ADDITION__BEFORE_BLOCK:
				setBeforeBlock((SchedulingBlock)newValue);
				return;
			case ScgschedPackage.CONDITIONAL_ADDITION__UNTIL_BLOCK:
				setUntilBlock((SchedulingBlock)newValue);
				return;
			case ScgschedPackage.CONDITIONAL_ADDITION__CONDITION:
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
			case ScgschedPackage.CONDITIONAL_ADDITION__BEFORE_BLOCK:
				setBeforeBlock((SchedulingBlock)null);
				return;
			case ScgschedPackage.CONDITIONAL_ADDITION__UNTIL_BLOCK:
				setUntilBlock((SchedulingBlock)null);
				return;
			case ScgschedPackage.CONDITIONAL_ADDITION__CONDITION:
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
			case ScgschedPackage.CONDITIONAL_ADDITION__BEFORE_BLOCK:
				return beforeBlock != null;
			case ScgschedPackage.CONDITIONAL_ADDITION__UNTIL_BLOCK:
				return untilBlock != null;
			case ScgschedPackage.CONDITIONAL_ADDITION__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalAdditionImpl
