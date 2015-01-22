/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import de.cau.cs.kieler.scgprios.BasicBlock_P;
import de.cau.cs.kieler.scgprios.Predecessor_P;
import de.cau.cs.kieler.scgprios.ScgpriosPackage;
import de.cau.cs.kieler.scgprios.SchedulingBlock_P;

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
 * An implementation of the model object '<em><b>Basic Block P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.BasicBlock_PImpl#getSchedulingBlocks <em>Scheduling Blocks</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.BasicBlock_PImpl#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.BasicBlock_PImpl#isGoBlock <em>Go Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.BasicBlock_PImpl#isDepthBlock <em>Depth Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.BasicBlock_PImpl#isSynchronizerBlock <em>Synchronizer Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.BasicBlock_PImpl#isEntryBlock <em>Entry Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.BasicBlock_PImpl#isDeadBlock <em>Dead Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.BasicBlock_PImpl#getPreGuard <em>Pre Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicBlock_PImpl extends MinimalEObjectImpl.Container implements BasicBlock_P {
    /**
     * The cached value of the '{@link #getSchedulingBlocks() <em>Scheduling Blocks</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchedulingBlocks()
     * @generated
     * @ordered
     */
    protected EList<SchedulingBlock_P> schedulingBlocks;

    /**
     * The cached value of the '{@link #getPredecessors() <em>Predecessors</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPredecessors()
     * @generated
     * @ordered
     */
    protected EList<Predecessor_P> predecessors;

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
    protected BasicBlock_PImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgpriosPackage.Literals.BASIC_BLOCK_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SchedulingBlock_P> getSchedulingBlocks() {
        if (schedulingBlocks == null) {
            schedulingBlocks = new EObjectContainmentEList<SchedulingBlock_P>(SchedulingBlock_P.class, this, ScgpriosPackage.BASIC_BLOCK_P__SCHEDULING_BLOCKS);
        }
        return schedulingBlocks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Predecessor_P> getPredecessors() {
        if (predecessors == null) {
            predecessors = new EObjectContainmentEList<Predecessor_P>(Predecessor_P.class, this, ScgpriosPackage.BASIC_BLOCK_P__PREDECESSORS);
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.BASIC_BLOCK_P__GO_BLOCK, oldGoBlock, goBlock));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.BASIC_BLOCK_P__DEPTH_BLOCK, oldDepthBlock, depthBlock));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.BASIC_BLOCK_P__SYNCHRONIZER_BLOCK, oldSynchronizerBlock, synchronizerBlock));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.BASIC_BLOCK_P__ENTRY_BLOCK, oldEntryBlock, entryBlock));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.BASIC_BLOCK_P__DEAD_BLOCK, oldDeadBlock, deadBlock));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgpriosPackage.BASIC_BLOCK_P__PRE_GUARD, oldPreGuard, preGuard));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.BASIC_BLOCK_P__PRE_GUARD, oldPreGuard, preGuard));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgpriosPackage.BASIC_BLOCK_P__SCHEDULING_BLOCKS:
                return ((InternalEList<?>)getSchedulingBlocks()).basicRemove(otherEnd, msgs);
            case ScgpriosPackage.BASIC_BLOCK_P__PREDECESSORS:
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
            case ScgpriosPackage.BASIC_BLOCK_P__SCHEDULING_BLOCKS:
                return getSchedulingBlocks();
            case ScgpriosPackage.BASIC_BLOCK_P__PREDECESSORS:
                return getPredecessors();
            case ScgpriosPackage.BASIC_BLOCK_P__GO_BLOCK:
                return isGoBlock();
            case ScgpriosPackage.BASIC_BLOCK_P__DEPTH_BLOCK:
                return isDepthBlock();
            case ScgpriosPackage.BASIC_BLOCK_P__SYNCHRONIZER_BLOCK:
                return isSynchronizerBlock();
            case ScgpriosPackage.BASIC_BLOCK_P__ENTRY_BLOCK:
                return isEntryBlock();
            case ScgpriosPackage.BASIC_BLOCK_P__DEAD_BLOCK:
                return isDeadBlock();
            case ScgpriosPackage.BASIC_BLOCK_P__PRE_GUARD:
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
            case ScgpriosPackage.BASIC_BLOCK_P__SCHEDULING_BLOCKS:
                getSchedulingBlocks().clear();
                getSchedulingBlocks().addAll((Collection<? extends SchedulingBlock_P>)newValue);
                return;
            case ScgpriosPackage.BASIC_BLOCK_P__PREDECESSORS:
                getPredecessors().clear();
                getPredecessors().addAll((Collection<? extends Predecessor_P>)newValue);
                return;
            case ScgpriosPackage.BASIC_BLOCK_P__GO_BLOCK:
                setGoBlock((Boolean)newValue);
                return;
            case ScgpriosPackage.BASIC_BLOCK_P__DEPTH_BLOCK:
                setDepthBlock((Boolean)newValue);
                return;
            case ScgpriosPackage.BASIC_BLOCK_P__SYNCHRONIZER_BLOCK:
                setSynchronizerBlock((Boolean)newValue);
                return;
            case ScgpriosPackage.BASIC_BLOCK_P__ENTRY_BLOCK:
                setEntryBlock((Boolean)newValue);
                return;
            case ScgpriosPackage.BASIC_BLOCK_P__DEAD_BLOCK:
                setDeadBlock((Boolean)newValue);
                return;
            case ScgpriosPackage.BASIC_BLOCK_P__PRE_GUARD:
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
            case ScgpriosPackage.BASIC_BLOCK_P__SCHEDULING_BLOCKS:
                getSchedulingBlocks().clear();
                return;
            case ScgpriosPackage.BASIC_BLOCK_P__PREDECESSORS:
                getPredecessors().clear();
                return;
            case ScgpriosPackage.BASIC_BLOCK_P__GO_BLOCK:
                setGoBlock(GO_BLOCK_EDEFAULT);
                return;
            case ScgpriosPackage.BASIC_BLOCK_P__DEPTH_BLOCK:
                setDepthBlock(DEPTH_BLOCK_EDEFAULT);
                return;
            case ScgpriosPackage.BASIC_BLOCK_P__SYNCHRONIZER_BLOCK:
                setSynchronizerBlock(SYNCHRONIZER_BLOCK_EDEFAULT);
                return;
            case ScgpriosPackage.BASIC_BLOCK_P__ENTRY_BLOCK:
                setEntryBlock(ENTRY_BLOCK_EDEFAULT);
                return;
            case ScgpriosPackage.BASIC_BLOCK_P__DEAD_BLOCK:
                setDeadBlock(DEAD_BLOCK_EDEFAULT);
                return;
            case ScgpriosPackage.BASIC_BLOCK_P__PRE_GUARD:
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
            case ScgpriosPackage.BASIC_BLOCK_P__SCHEDULING_BLOCKS:
                return schedulingBlocks != null && !schedulingBlocks.isEmpty();
            case ScgpriosPackage.BASIC_BLOCK_P__PREDECESSORS:
                return predecessors != null && !predecessors.isEmpty();
            case ScgpriosPackage.BASIC_BLOCK_P__GO_BLOCK:
                return goBlock != GO_BLOCK_EDEFAULT;
            case ScgpriosPackage.BASIC_BLOCK_P__DEPTH_BLOCK:
                return depthBlock != DEPTH_BLOCK_EDEFAULT;
            case ScgpriosPackage.BASIC_BLOCK_P__SYNCHRONIZER_BLOCK:
                return synchronizerBlock != SYNCHRONIZER_BLOCK_EDEFAULT;
            case ScgpriosPackage.BASIC_BLOCK_P__ENTRY_BLOCK:
                return entryBlock != ENTRY_BLOCK_EDEFAULT;
            case ScgpriosPackage.BASIC_BLOCK_P__DEAD_BLOCK:
                return deadBlock != DEAD_BLOCK_EDEFAULT;
            case ScgpriosPackage.BASIC_BLOCK_P__PRE_GUARD:
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

} //BasicBlock_PImpl
