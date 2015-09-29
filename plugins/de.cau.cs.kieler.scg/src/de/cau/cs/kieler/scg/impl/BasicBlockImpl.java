/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.impl;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.scg.BasicBlock;
import de.cau.cs.kieler.scg.Predecessor;
import de.cau.cs.kieler.scg.ScgPackage;
import de.cau.cs.kieler.scg.SchedulingBlock;
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
 *   <li>{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl#getSchedulingBlocks <em>Scheduling Blocks</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl#isGoBlock <em>Go Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl#isDepthBlock <em>Depth Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl#isSynchronizerBlock <em>Synchronizer Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl#isEntryBlock <em>Entry Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl#isDeadBlock <em>Dead Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl#getPreGuard <em>Pre Guard</em>}</li>
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
	 * The cached value of the '{@link #getPredecessors() <em>Predecessors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPredecessors()
	 * @generated
	 * @ordered
	 */
    protected EList<Predecessor> predecessors;

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
	 * The default value of the '{@link #isDepthBlock() <em>Depth Block</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isDepthBlock()
	 * @generated
	 * @ordered
	 */
    protected static final boolean DEPTH_BLOCK_EDEFAULT = false;

    /**
	 * The cached value of the '{@link #isDepthBlock() <em>Depth Block</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isDepthBlock()
	 * @generated
	 * @ordered
	 */
    protected boolean depthBlock = DEPTH_BLOCK_EDEFAULT;

    /**
	 * The default value of the '{@link #isSynchronizerBlock() <em>Synchronizer Block</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSynchronizerBlock()
	 * @generated
	 * @ordered
	 */
    protected static final boolean SYNCHRONIZER_BLOCK_EDEFAULT = false;

    /**
	 * The cached value of the '{@link #isSynchronizerBlock() <em>Synchronizer Block</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSynchronizerBlock()
	 * @generated
	 * @ordered
	 */
    protected boolean synchronizerBlock = SYNCHRONIZER_BLOCK_EDEFAULT;

    /**
	 * The default value of the '{@link #isEntryBlock() <em>Entry Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntryBlock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENTRY_BLOCK_EDEFAULT = false;

				/**
	 * The cached value of the '{@link #isEntryBlock() <em>Entry Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntryBlock()
	 * @generated
	 * @ordered
	 */
	protected boolean entryBlock = ENTRY_BLOCK_EDEFAULT;

				/**
	 * The default value of the '{@link #isDeadBlock() <em>Dead Block</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isDeadBlock()
	 * @generated
	 * @ordered
	 */
    protected static final boolean DEAD_BLOCK_EDEFAULT = false;

    /**
	 * The cached value of the '{@link #isDeadBlock() <em>Dead Block</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isDeadBlock()
	 * @generated
	 * @ordered
	 */
    protected boolean deadBlock = DEAD_BLOCK_EDEFAULT;

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
		return ScgPackage.Literals.BASIC_BLOCK;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SchedulingBlock> getSchedulingBlocks() {
		if (schedulingBlocks == null) {
			schedulingBlocks = new EObjectContainmentEList<SchedulingBlock>(SchedulingBlock.class, this, ScgPackage.BASIC_BLOCK__SCHEDULING_BLOCKS);
		}
		return schedulingBlocks;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Predecessor> getPredecessors() {
		if (predecessors == null) {
			predecessors = new EObjectContainmentEList<Predecessor>(Predecessor.class, this, ScgPackage.BASIC_BLOCK__PREDECESSORS);
		}
		return predecessors;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.BASIC_BLOCK__GO_BLOCK, oldGoBlock, goBlock));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isDepthBlock() {
		return depthBlock;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDepthBlock(boolean newDepthBlock) {
		boolean oldDepthBlock = depthBlock;
		depthBlock = newDepthBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.BASIC_BLOCK__DEPTH_BLOCK, oldDepthBlock, depthBlock));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSynchronizerBlock() {
		return synchronizerBlock;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSynchronizerBlock(boolean newSynchronizerBlock) {
		boolean oldSynchronizerBlock = synchronizerBlock;
		synchronizerBlock = newSynchronizerBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.BASIC_BLOCK__SYNCHRONIZER_BLOCK, oldSynchronizerBlock, synchronizerBlock));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEntryBlock() {
		return entryBlock;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryBlock(boolean newEntryBlock) {
		boolean oldEntryBlock = entryBlock;
		entryBlock = newEntryBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.BASIC_BLOCK__ENTRY_BLOCK, oldEntryBlock, entryBlock));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isDeadBlock() {
		return deadBlock;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDeadBlock(boolean newDeadBlock) {
		boolean oldDeadBlock = deadBlock;
		deadBlock = newDeadBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.BASIC_BLOCK__DEAD_BLOCK, oldDeadBlock, deadBlock));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.BASIC_BLOCK__PRE_GUARD, oldPreGuard, preGuard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.BASIC_BLOCK__PRE_GUARD, oldPreGuard, preGuard));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScgPackage.BASIC_BLOCK__SCHEDULING_BLOCKS:
				return ((InternalEList<?>)getSchedulingBlocks()).basicRemove(otherEnd, msgs);
			case ScgPackage.BASIC_BLOCK__PREDECESSORS:
				return ((InternalEList<?>)getPredecessors()).basicRemove(otherEnd, msgs);
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
			case ScgPackage.BASIC_BLOCK__SCHEDULING_BLOCKS:
				return getSchedulingBlocks();
			case ScgPackage.BASIC_BLOCK__PREDECESSORS:
				return getPredecessors();
			case ScgPackage.BASIC_BLOCK__GO_BLOCK:
				return isGoBlock();
			case ScgPackage.BASIC_BLOCK__DEPTH_BLOCK:
				return isDepthBlock();
			case ScgPackage.BASIC_BLOCK__SYNCHRONIZER_BLOCK:
				return isSynchronizerBlock();
			case ScgPackage.BASIC_BLOCK__ENTRY_BLOCK:
				return isEntryBlock();
			case ScgPackage.BASIC_BLOCK__DEAD_BLOCK:
				return isDeadBlock();
			case ScgPackage.BASIC_BLOCK__PRE_GUARD:
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
			case ScgPackage.BASIC_BLOCK__SCHEDULING_BLOCKS:
				getSchedulingBlocks().clear();
				getSchedulingBlocks().addAll((Collection<? extends SchedulingBlock>)newValue);
				return;
			case ScgPackage.BASIC_BLOCK__PREDECESSORS:
				getPredecessors().clear();
				getPredecessors().addAll((Collection<? extends Predecessor>)newValue);
				return;
			case ScgPackage.BASIC_BLOCK__GO_BLOCK:
				setGoBlock((Boolean)newValue);
				return;
			case ScgPackage.BASIC_BLOCK__DEPTH_BLOCK:
				setDepthBlock((Boolean)newValue);
				return;
			case ScgPackage.BASIC_BLOCK__SYNCHRONIZER_BLOCK:
				setSynchronizerBlock((Boolean)newValue);
				return;
			case ScgPackage.BASIC_BLOCK__ENTRY_BLOCK:
				setEntryBlock((Boolean)newValue);
				return;
			case ScgPackage.BASIC_BLOCK__DEAD_BLOCK:
				setDeadBlock((Boolean)newValue);
				return;
			case ScgPackage.BASIC_BLOCK__PRE_GUARD:
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
			case ScgPackage.BASIC_BLOCK__SCHEDULING_BLOCKS:
				getSchedulingBlocks().clear();
				return;
			case ScgPackage.BASIC_BLOCK__PREDECESSORS:
				getPredecessors().clear();
				return;
			case ScgPackage.BASIC_BLOCK__GO_BLOCK:
				setGoBlock(GO_BLOCK_EDEFAULT);
				return;
			case ScgPackage.BASIC_BLOCK__DEPTH_BLOCK:
				setDepthBlock(DEPTH_BLOCK_EDEFAULT);
				return;
			case ScgPackage.BASIC_BLOCK__SYNCHRONIZER_BLOCK:
				setSynchronizerBlock(SYNCHRONIZER_BLOCK_EDEFAULT);
				return;
			case ScgPackage.BASIC_BLOCK__ENTRY_BLOCK:
				setEntryBlock(ENTRY_BLOCK_EDEFAULT);
				return;
			case ScgPackage.BASIC_BLOCK__DEAD_BLOCK:
				setDeadBlock(DEAD_BLOCK_EDEFAULT);
				return;
			case ScgPackage.BASIC_BLOCK__PRE_GUARD:
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
			case ScgPackage.BASIC_BLOCK__SCHEDULING_BLOCKS:
				return schedulingBlocks != null && !schedulingBlocks.isEmpty();
			case ScgPackage.BASIC_BLOCK__PREDECESSORS:
				return predecessors != null && !predecessors.isEmpty();
			case ScgPackage.BASIC_BLOCK__GO_BLOCK:
				return goBlock != GO_BLOCK_EDEFAULT;
			case ScgPackage.BASIC_BLOCK__DEPTH_BLOCK:
				return depthBlock != DEPTH_BLOCK_EDEFAULT;
			case ScgPackage.BASIC_BLOCK__SYNCHRONIZER_BLOCK:
				return synchronizerBlock != SYNCHRONIZER_BLOCK_EDEFAULT;
			case ScgPackage.BASIC_BLOCK__ENTRY_BLOCK:
				return entryBlock != ENTRY_BLOCK_EDEFAULT;
			case ScgPackage.BASIC_BLOCK__DEAD_BLOCK:
				return deadBlock != DEAD_BLOCK_EDEFAULT;
			case ScgPackage.BASIC_BLOCK__PRE_GUARD:
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
		result.append(", depthBlock: ");
		result.append(depthBlock);
		result.append(", synchronizerBlock: ");
		result.append(synchronizerBlock);
		result.append(", entryBlock: ");
		result.append(entryBlock);
		result.append(", deadBlock: ");
		result.append(deadBlock);
		result.append(')');
		return result.toString();
	}

} //BasicBlockImpl
