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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.BasicBlockImpl#getGuards <em>Guards</em>}</li>
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
	 * The cached value of the '{@link #getGuards() <em>Guards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuards()
	 * @generated
	 * @ordered
	 */
	protected EList<ValuedObject> guards;

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
	public EList<ValuedObject> getGuards() {
		if (guards == null) {
			guards = new EObjectContainmentEList<ValuedObject>(ValuedObject.class, this, ScgbbPackage.BASIC_BLOCK__GUARDS);
		}
		return guards;
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
			case ScgbbPackage.BASIC_BLOCK__GUARDS:
				return ((InternalEList<?>)getGuards()).basicRemove(otherEnd, msgs);
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
			case ScgbbPackage.BASIC_BLOCK__GUARDS:
				return getGuards();
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
			case ScgbbPackage.BASIC_BLOCK__GUARDS:
				getGuards().clear();
				getGuards().addAll((Collection<? extends ValuedObject>)newValue);
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
			case ScgbbPackage.BASIC_BLOCK__GUARDS:
				getGuards().clear();
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
			case ScgbbPackage.BASIC_BLOCK__GUARDS:
				return guards != null && !guards.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BasicBlockImpl
