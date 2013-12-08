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

import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.scgbb.ActivationExpression;
import de.cau.cs.kieler.scgbb.BasicBlock;
import de.cau.cs.kieler.scgbb.ScgbbPackage;
import de.cau.cs.kieler.scgbb.SchedulingBlock;
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
 * An implementation of the model object '<em><b>Basic Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.BasicBlockImpl#getSchedulingBlocks <em>Scheduling Blocks</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.BasicBlockImpl#getActivationExpressions <em>Activation Expressions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.BasicBlockImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.BasicBlockImpl#getSubGuards <em>Sub Guards</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.BasicBlockImpl#getEmptyGuards <em>Empty Guards</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicBlockImpl extends MinimalEObjectImpl.Container implements BasicBlock {
    /**
	 * The cached value of the '{@link #getSchedulingBlocks() <em>Scheduling Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSchedulingBlocks()
	 * @generated
	 * @ordered
	 */
    protected EList<SchedulingBlock> schedulingBlocks;

    /**
	 * The cached value of the '{@link #getActivationExpressions() <em>Activation Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getActivationExpressions()
	 * @generated
	 * @ordered
	 */
    protected EList<ActivationExpression> activationExpressions;

    /**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected ValuedObject guard;

				/**
	 * The cached value of the '{@link #getSubGuards() <em>Sub Guards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGuards()
	 * @generated
	 * @ordered
	 */
	protected EList<ValuedObject> subGuards;

				/**
	 * The cached value of the '{@link #getEmptyGuards() <em>Empty Guards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyGuards()
	 * @generated
	 * @ordered
	 */
	protected EList<ValuedObject> emptyGuards;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected BasicBlockImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ScgbbPackage.Literals.BASIC_BLOCK;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SchedulingBlock> getSchedulingBlocks() {
		if (schedulingBlocks == null) {
			schedulingBlocks = new EObjectContainmentEList<SchedulingBlock>(SchedulingBlock.class, this, ScgbbPackage.BASIC_BLOCK__SCHEDULING_BLOCKS);
		}
		return schedulingBlocks;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ActivationExpression> getActivationExpressions() {
		if (activationExpressions == null) {
			activationExpressions = new EObjectContainmentEList<ActivationExpression>(ActivationExpression.class, this, ScgbbPackage.BASIC_BLOCK__ACTIVATION_EXPRESSIONS);
		}
		return activationExpressions;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuedObject getGuard() {
		return guard;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(ValuedObject newGuard, NotificationChain msgs) {
		ValuedObject oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgbbPackage.BASIC_BLOCK__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(ValuedObject newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgbbPackage.BASIC_BLOCK__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgbbPackage.BASIC_BLOCK__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgbbPackage.BASIC_BLOCK__GUARD, newGuard, newGuard));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValuedObject> getSubGuards() {
		if (subGuards == null) {
			subGuards = new EObjectContainmentEList<ValuedObject>(ValuedObject.class, this, ScgbbPackage.BASIC_BLOCK__SUB_GUARDS);
		}
		return subGuards;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValuedObject> getEmptyGuards() {
		if (emptyGuards == null) {
			emptyGuards = new EObjectContainmentEList<ValuedObject>(ValuedObject.class, this, ScgbbPackage.BASIC_BLOCK__EMPTY_GUARDS);
		}
		return emptyGuards;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScgbbPackage.BASIC_BLOCK__SCHEDULING_BLOCKS:
				return ((InternalEList<?>)getSchedulingBlocks()).basicRemove(otherEnd, msgs);
			case ScgbbPackage.BASIC_BLOCK__ACTIVATION_EXPRESSIONS:
				return ((InternalEList<?>)getActivationExpressions()).basicRemove(otherEnd, msgs);
			case ScgbbPackage.BASIC_BLOCK__GUARD:
				return basicSetGuard(null, msgs);
			case ScgbbPackage.BASIC_BLOCK__SUB_GUARDS:
				return ((InternalEList<?>)getSubGuards()).basicRemove(otherEnd, msgs);
			case ScgbbPackage.BASIC_BLOCK__EMPTY_GUARDS:
				return ((InternalEList<?>)getEmptyGuards()).basicRemove(otherEnd, msgs);
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
			case ScgbbPackage.BASIC_BLOCK__SCHEDULING_BLOCKS:
				return getSchedulingBlocks();
			case ScgbbPackage.BASIC_BLOCK__ACTIVATION_EXPRESSIONS:
				return getActivationExpressions();
			case ScgbbPackage.BASIC_BLOCK__GUARD:
				return getGuard();
			case ScgbbPackage.BASIC_BLOCK__SUB_GUARDS:
				return getSubGuards();
			case ScgbbPackage.BASIC_BLOCK__EMPTY_GUARDS:
				return getEmptyGuards();
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
			case ScgbbPackage.BASIC_BLOCK__SCHEDULING_BLOCKS:
				getSchedulingBlocks().clear();
				getSchedulingBlocks().addAll((Collection<? extends SchedulingBlock>)newValue);
				return;
			case ScgbbPackage.BASIC_BLOCK__ACTIVATION_EXPRESSIONS:
				getActivationExpressions().clear();
				getActivationExpressions().addAll((Collection<? extends ActivationExpression>)newValue);
				return;
			case ScgbbPackage.BASIC_BLOCK__GUARD:
				setGuard((ValuedObject)newValue);
				return;
			case ScgbbPackage.BASIC_BLOCK__SUB_GUARDS:
				getSubGuards().clear();
				getSubGuards().addAll((Collection<? extends ValuedObject>)newValue);
				return;
			case ScgbbPackage.BASIC_BLOCK__EMPTY_GUARDS:
				getEmptyGuards().clear();
				getEmptyGuards().addAll((Collection<? extends ValuedObject>)newValue);
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
			case ScgbbPackage.BASIC_BLOCK__SCHEDULING_BLOCKS:
				getSchedulingBlocks().clear();
				return;
			case ScgbbPackage.BASIC_BLOCK__ACTIVATION_EXPRESSIONS:
				getActivationExpressions().clear();
				return;
			case ScgbbPackage.BASIC_BLOCK__GUARD:
				setGuard((ValuedObject)null);
				return;
			case ScgbbPackage.BASIC_BLOCK__SUB_GUARDS:
				getSubGuards().clear();
				return;
			case ScgbbPackage.BASIC_BLOCK__EMPTY_GUARDS:
				getEmptyGuards().clear();
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
			case ScgbbPackage.BASIC_BLOCK__SCHEDULING_BLOCKS:
				return schedulingBlocks != null && !schedulingBlocks.isEmpty();
			case ScgbbPackage.BASIC_BLOCK__ACTIVATION_EXPRESSIONS:
				return activationExpressions != null && !activationExpressions.isEmpty();
			case ScgbbPackage.BASIC_BLOCK__GUARD:
				return guard != null;
			case ScgbbPackage.BASIC_BLOCK__SUB_GUARDS:
				return subGuards != null && !subGuards.isEmpty();
			case ScgbbPackage.BASIC_BLOCK__EMPTY_GUARDS:
				return emptyGuards != null && !emptyGuards.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BasicBlockImpl
