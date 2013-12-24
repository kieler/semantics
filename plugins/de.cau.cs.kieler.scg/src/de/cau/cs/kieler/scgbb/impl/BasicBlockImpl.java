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
import de.cau.cs.kieler.scg.Conditional;
import de.cau.cs.kieler.scgbb.BasicBlock;
import de.cau.cs.kieler.scgbb.BlockType;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.BasicBlockImpl#getSchedulingBlocks <em>Scheduling Blocks</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.BasicBlockImpl#getGuards <em>Guards</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.BasicBlockImpl#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.BasicBlockImpl#isGoBlock <em>Go Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.BasicBlockImpl#getBlockType <em>Block Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.BasicBlockImpl#getConditional <em>Conditional</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.BasicBlockImpl#getPreGuard <em>Pre Guard</em>}</li>
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
	 * The cached value of the '{@link #getGuards() <em>Guards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuards()
	 * @generated
	 * @ordered
	 */
	protected EList<ValuedObject> guards;

				/**
	 * The cached value of the '{@link #getPredecessors() <em>Predecessors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessors()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicBlock> predecessors;

				/**
	 * The default value of the '{@link #isGoBlock() <em>Go Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGoBlock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GO_BLOCK_EDEFAULT = false;

				/**
	 * The cached value of the '{@link #isGoBlock() <em>Go Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGoBlock()
	 * @generated
	 * @ordered
	 */
	protected boolean goBlock = GO_BLOCK_EDEFAULT;

				/**
	 * The default value of the '{@link #getBlockType() <em>Block Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockType()
	 * @generated
	 * @ordered
	 */
	protected static final BlockType BLOCK_TYPE_EDEFAULT = BlockType.NORMAL;

				/**
	 * The cached value of the '{@link #getBlockType() <em>Block Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockType()
	 * @generated
	 * @ordered
	 */
	protected BlockType blockType = BLOCK_TYPE_EDEFAULT;

				/**
	 * The cached value of the '{@link #getConditional() <em>Conditional</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditional()
	 * @generated
	 * @ordered
	 */
	protected Conditional conditional;

				/**
	 * The cached value of the '{@link #getPreGuard() <em>Pre Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreGuard()
	 * @generated
	 * @ordered
	 */
	protected ValuedObject preGuard;

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
	public EList<BasicBlock> getPredecessors() {
		if (predecessors == null) {
			predecessors = new EObjectResolvingEList<BasicBlock>(BasicBlock.class, this, ScgbbPackage.BASIC_BLOCK__PREDECESSORS);
		}
		return predecessors;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockType getBlockType() {
		return blockType;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockType(BlockType newBlockType) {
		BlockType oldBlockType = blockType;
		blockType = newBlockType == null ? BLOCK_TYPE_EDEFAULT : newBlockType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgbbPackage.BASIC_BLOCK__BLOCK_TYPE, oldBlockType, blockType));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conditional getConditional() {
		if (conditional != null && conditional.eIsProxy()) {
			InternalEObject oldConditional = (InternalEObject)conditional;
			conditional = (Conditional)eResolveProxy(oldConditional);
			if (conditional != oldConditional) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgbbPackage.BASIC_BLOCK__CONDITIONAL, oldConditional, conditional));
			}
		}
		return conditional;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conditional basicGetConditional() {
		return conditional;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditional(Conditional newConditional) {
		Conditional oldConditional = conditional;
		conditional = newConditional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgbbPackage.BASIC_BLOCK__CONDITIONAL, oldConditional, conditional));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuedObject getPreGuard() {
		if (preGuard != null && preGuard.eIsProxy()) {
			InternalEObject oldPreGuard = (InternalEObject)preGuard;
			preGuard = (ValuedObject)eResolveProxy(oldPreGuard);
			if (preGuard != oldPreGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgbbPackage.BASIC_BLOCK__PRE_GUARD, oldPreGuard, preGuard));
			}
		}
		return preGuard;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuedObject basicGetPreGuard() {
		return preGuard;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreGuard(ValuedObject newPreGuard) {
		ValuedObject oldPreGuard = preGuard;
		preGuard = newPreGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgbbPackage.BASIC_BLOCK__PRE_GUARD, oldPreGuard, preGuard));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGoBlock() {
		return goBlock;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoBlock(boolean newGoBlock) {
		boolean oldGoBlock = goBlock;
		goBlock = newGoBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgbbPackage.BASIC_BLOCK__GO_BLOCK, oldGoBlock, goBlock));
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
			case ScgbbPackage.BASIC_BLOCK__GUARDS:
				return getGuards();
			case ScgbbPackage.BASIC_BLOCK__PREDECESSORS:
				return getPredecessors();
			case ScgbbPackage.BASIC_BLOCK__GO_BLOCK:
				return isGoBlock();
			case ScgbbPackage.BASIC_BLOCK__BLOCK_TYPE:
				return getBlockType();
			case ScgbbPackage.BASIC_BLOCK__CONDITIONAL:
				if (resolve) return getConditional();
				return basicGetConditional();
			case ScgbbPackage.BASIC_BLOCK__PRE_GUARD:
				if (resolve) return getPreGuard();
				return basicGetPreGuard();
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
			case ScgbbPackage.BASIC_BLOCK__GUARDS:
				getGuards().clear();
				getGuards().addAll((Collection<? extends ValuedObject>)newValue);
				return;
			case ScgbbPackage.BASIC_BLOCK__PREDECESSORS:
				getPredecessors().clear();
				getPredecessors().addAll((Collection<? extends BasicBlock>)newValue);
				return;
			case ScgbbPackage.BASIC_BLOCK__GO_BLOCK:
				setGoBlock((Boolean)newValue);
				return;
			case ScgbbPackage.BASIC_BLOCK__BLOCK_TYPE:
				setBlockType((BlockType)newValue);
				return;
			case ScgbbPackage.BASIC_BLOCK__CONDITIONAL:
				setConditional((Conditional)newValue);
				return;
			case ScgbbPackage.BASIC_BLOCK__PRE_GUARD:
				setPreGuard((ValuedObject)newValue);
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
			case ScgbbPackage.BASIC_BLOCK__GUARDS:
				getGuards().clear();
				return;
			case ScgbbPackage.BASIC_BLOCK__PREDECESSORS:
				getPredecessors().clear();
				return;
			case ScgbbPackage.BASIC_BLOCK__GO_BLOCK:
				setGoBlock(GO_BLOCK_EDEFAULT);
				return;
			case ScgbbPackage.BASIC_BLOCK__BLOCK_TYPE:
				setBlockType(BLOCK_TYPE_EDEFAULT);
				return;
			case ScgbbPackage.BASIC_BLOCK__CONDITIONAL:
				setConditional((Conditional)null);
				return;
			case ScgbbPackage.BASIC_BLOCK__PRE_GUARD:
				setPreGuard((ValuedObject)null);
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
			case ScgbbPackage.BASIC_BLOCK__GUARDS:
				return guards != null && !guards.isEmpty();
			case ScgbbPackage.BASIC_BLOCK__PREDECESSORS:
				return predecessors != null && !predecessors.isEmpty();
			case ScgbbPackage.BASIC_BLOCK__GO_BLOCK:
				return goBlock != GO_BLOCK_EDEFAULT;
			case ScgbbPackage.BASIC_BLOCK__BLOCK_TYPE:
				return blockType != BLOCK_TYPE_EDEFAULT;
			case ScgbbPackage.BASIC_BLOCK__CONDITIONAL:
				return conditional != null;
			case ScgbbPackage.BASIC_BLOCK__PRE_GUARD:
				return preGuard != null;
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
		result.append(" (goBlock: ");
		result.append(goBlock);
		result.append(", blockType: ");
		result.append(blockType);
		result.append(')');
		return result.toString();
	}

} //BasicBlockImpl
