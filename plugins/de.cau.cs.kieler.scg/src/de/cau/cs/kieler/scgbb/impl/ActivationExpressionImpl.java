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
package de.cau.cs.kieler.scgbb.impl;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.scgbb.ActivationExpression;
import de.cau.cs.kieler.scgbb.BasicBlock;
import de.cau.cs.kieler.scgbb.ScgbbPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activation Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.ActivationExpressionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.ActivationExpressionImpl#getBasicBlocks <em>Basic Blocks</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.ActivationExpressionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.ActivationExpressionImpl#getEmptyExpressions <em>Empty Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivationExpressionImpl extends MinimalEObjectImpl.Container implements ActivationExpression {
    /**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression guardExpression;

				/**
	 * The cached value of the '{@link #getBasicBlocks() <em>Basic Blocks</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBasicBlocks()
	 * @generated
	 * @ordered
	 */
    protected EList<BasicBlock> basicBlocks;

    /**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected ValuedObject guard;

				/**
	 * The cached value of the '{@link #getEmptyExpressions() <em>Empty Expressions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivationExpression> emptyExpressions;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ActivationExpressionImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ScgbbPackage.Literals.ACTIVATION_EXPRESSION;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getGuardExpression() {
		return guardExpression;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuardExpression(Expression newGuardExpression, NotificationChain msgs) {
		Expression oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgbbPackage.ACTIVATION_EXPRESSION__GUARD_EXPRESSION, oldGuardExpression, newGuardExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(Expression newGuardExpression) {
		if (newGuardExpression != guardExpression) {
			NotificationChain msgs = null;
			if (guardExpression != null)
				msgs = ((InternalEObject)guardExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgbbPackage.ACTIVATION_EXPRESSION__GUARD_EXPRESSION, null, msgs);
			if (newGuardExpression != null)
				msgs = ((InternalEObject)newGuardExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgbbPackage.ACTIVATION_EXPRESSION__GUARD_EXPRESSION, null, msgs);
			msgs = basicSetGuardExpression(newGuardExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgbbPackage.ACTIVATION_EXPRESSION__GUARD_EXPRESSION, newGuardExpression, newGuardExpression));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<BasicBlock> getBasicBlocks() {
		if (basicBlocks == null) {
			basicBlocks = new EObjectResolvingEList<BasicBlock>(BasicBlock.class, this, ScgbbPackage.ACTIVATION_EXPRESSION__BASIC_BLOCKS);
		}
		return basicBlocks;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuedObject getGuard() {
		if (guard != null && guard.eIsProxy()) {
			InternalEObject oldGuard = (InternalEObject)guard;
			guard = (ValuedObject)eResolveProxy(oldGuard);
			if (guard != oldGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgbbPackage.ACTIVATION_EXPRESSION__GUARD, oldGuard, guard));
			}
		}
		return guard;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuedObject basicGetGuard() {
		return guard;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(ValuedObject newGuard) {
		ValuedObject oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgbbPackage.ACTIVATION_EXPRESSION__GUARD, oldGuard, guard));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivationExpression> getEmptyExpressions() {
		if (emptyExpressions == null) {
			emptyExpressions = new EObjectResolvingEList<ActivationExpression>(ActivationExpression.class, this, ScgbbPackage.ACTIVATION_EXPRESSION__EMPTY_EXPRESSIONS);
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
			case ScgbbPackage.ACTIVATION_EXPRESSION__GUARD_EXPRESSION:
				return basicSetGuardExpression(null, msgs);
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
			case ScgbbPackage.ACTIVATION_EXPRESSION__GUARD_EXPRESSION:
				return getGuardExpression();
			case ScgbbPackage.ACTIVATION_EXPRESSION__BASIC_BLOCKS:
				return getBasicBlocks();
			case ScgbbPackage.ACTIVATION_EXPRESSION__GUARD:
				if (resolve) return getGuard();
				return basicGetGuard();
			case ScgbbPackage.ACTIVATION_EXPRESSION__EMPTY_EXPRESSIONS:
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
			case ScgbbPackage.ACTIVATION_EXPRESSION__GUARD_EXPRESSION:
				setGuardExpression((Expression)newValue);
				return;
			case ScgbbPackage.ACTIVATION_EXPRESSION__BASIC_BLOCKS:
				getBasicBlocks().clear();
				getBasicBlocks().addAll((Collection<? extends BasicBlock>)newValue);
				return;
			case ScgbbPackage.ACTIVATION_EXPRESSION__GUARD:
				setGuard((ValuedObject)newValue);
				return;
			case ScgbbPackage.ACTIVATION_EXPRESSION__EMPTY_EXPRESSIONS:
				getEmptyExpressions().clear();
				getEmptyExpressions().addAll((Collection<? extends ActivationExpression>)newValue);
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
			case ScgbbPackage.ACTIVATION_EXPRESSION__GUARD_EXPRESSION:
				setGuardExpression((Expression)null);
				return;
			case ScgbbPackage.ACTIVATION_EXPRESSION__BASIC_BLOCKS:
				getBasicBlocks().clear();
				return;
			case ScgbbPackage.ACTIVATION_EXPRESSION__GUARD:
				setGuard((ValuedObject)null);
				return;
			case ScgbbPackage.ACTIVATION_EXPRESSION__EMPTY_EXPRESSIONS:
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
			case ScgbbPackage.ACTIVATION_EXPRESSION__GUARD_EXPRESSION:
				return guardExpression != null;
			case ScgbbPackage.ACTIVATION_EXPRESSION__BASIC_BLOCKS:
				return basicBlocks != null && !basicBlocks.isEmpty();
			case ScgbbPackage.ACTIVATION_EXPRESSION__GUARD:
				return guard != null;
			case ScgbbPackage.ACTIVATION_EXPRESSION__EMPTY_EXPRESSIONS:
				return emptyExpressions != null && !emptyExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivationExpressionImpl
