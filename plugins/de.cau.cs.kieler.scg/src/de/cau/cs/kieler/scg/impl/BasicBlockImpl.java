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
package de.cau.cs.kieler.scg.impl;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import de.cau.cs.kieler.scg.BasicBlock;
import de.cau.cs.kieler.scg.BlockType;
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
 *   <li>{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl#isGoBlock <em>Go Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl#isDeadBlock <em>Dead Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.BasicBlockImpl#getBlockType <em>Block Type</em>}</li>
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
     * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGuard()
     * @generated
     * @ordered
     */
    protected ValuedObject guard;

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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.BASIC_BLOCK__GUARD, oldGuard, newGuard);
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
                msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgPackage.BASIC_BLOCK__GUARD, null, msgs);
            if (newGuard != null)
                msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgPackage.BASIC_BLOCK__GUARD, null, msgs);
            msgs = basicSetGuard(newGuard, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.BASIC_BLOCK__GUARD, newGuard, newGuard));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.BASIC_BLOCK__BLOCK_TYPE, oldBlockType, blockType));
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
            case ScgPackage.BASIC_BLOCK__GUARD:
                return basicSetGuard(null, msgs);
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
            case ScgPackage.BASIC_BLOCK__GUARD:
                return getGuard();
            case ScgPackage.BASIC_BLOCK__PREDECESSORS:
                return getPredecessors();
            case ScgPackage.BASIC_BLOCK__GO_BLOCK:
                return isGoBlock();
            case ScgPackage.BASIC_BLOCK__DEAD_BLOCK:
                return isDeadBlock();
            case ScgPackage.BASIC_BLOCK__BLOCK_TYPE:
                return getBlockType();
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
            case ScgPackage.BASIC_BLOCK__GUARD:
                setGuard((ValuedObject)newValue);
                return;
            case ScgPackage.BASIC_BLOCK__PREDECESSORS:
                getPredecessors().clear();
                getPredecessors().addAll((Collection<? extends Predecessor>)newValue);
                return;
            case ScgPackage.BASIC_BLOCK__GO_BLOCK:
                setGoBlock((Boolean)newValue);
                return;
            case ScgPackage.BASIC_BLOCK__DEAD_BLOCK:
                setDeadBlock((Boolean)newValue);
                return;
            case ScgPackage.BASIC_BLOCK__BLOCK_TYPE:
                setBlockType((BlockType)newValue);
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
            case ScgPackage.BASIC_BLOCK__GUARD:
                setGuard((ValuedObject)null);
                return;
            case ScgPackage.BASIC_BLOCK__PREDECESSORS:
                getPredecessors().clear();
                return;
            case ScgPackage.BASIC_BLOCK__GO_BLOCK:
                setGoBlock(GO_BLOCK_EDEFAULT);
                return;
            case ScgPackage.BASIC_BLOCK__DEAD_BLOCK:
                setDeadBlock(DEAD_BLOCK_EDEFAULT);
                return;
            case ScgPackage.BASIC_BLOCK__BLOCK_TYPE:
                setBlockType(BLOCK_TYPE_EDEFAULT);
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
            case ScgPackage.BASIC_BLOCK__GUARD:
                return guard != null;
            case ScgPackage.BASIC_BLOCK__PREDECESSORS:
                return predecessors != null && !predecessors.isEmpty();
            case ScgPackage.BASIC_BLOCK__GO_BLOCK:
                return goBlock != GO_BLOCK_EDEFAULT;
            case ScgPackage.BASIC_BLOCK__DEAD_BLOCK:
                return deadBlock != DEAD_BLOCK_EDEFAULT;
            case ScgPackage.BASIC_BLOCK__BLOCK_TYPE:
                return blockType != BLOCK_TYPE_EDEFAULT;
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
        result.append(", deadBlock: ");
        result.append(deadBlock);
        result.append(", blockType: ");
        result.append(blockType);
        result.append(')');
        return result.toString();
    }

} //BasicBlockImpl
