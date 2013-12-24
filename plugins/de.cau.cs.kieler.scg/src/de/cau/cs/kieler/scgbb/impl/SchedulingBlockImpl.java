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
import de.cau.cs.kieler.scg.Node;

import de.cau.cs.kieler.scgbb.ScgbbPackage;
import de.cau.cs.kieler.scgbb.SchedulingBlock;

import de.cau.cs.kieler.scgdep.Dependency;

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
 * An implementation of the model object '<em><b>Scheduling Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.SchedulingBlockImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.SchedulingBlockImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.SchedulingBlockImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.SchedulingBlockImpl#isDepthBlock <em>Depth Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.SchedulingBlockImpl#isSynchronizerBlock <em>Synchronizer Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.SchedulingBlockImpl#isGoBlock <em>Go Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchedulingBlockImpl extends MinimalEObjectImpl.Container implements SchedulingBlock {
    /**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
    protected EList<Node> nodes;

    /**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
    protected EList<Dependency> dependencies;

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
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SchedulingBlockImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ScgbbPackage.Literals.SCHEDULING_BLOCK;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectResolvingEList<Node>(Node.class, this, ScgbbPackage.SCHEDULING_BLOCK__NODES);
		}
		return nodes;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Dependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, ScgbbPackage.SCHEDULING_BLOCK__DEPENDENCIES);
		}
		return dependencies;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgbbPackage.SCHEDULING_BLOCK__GUARD, oldGuard, guard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScgbbPackage.SCHEDULING_BLOCK__GUARD, oldGuard, guard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScgbbPackage.SCHEDULING_BLOCK__DEPTH_BLOCK, oldDepthBlock, depthBlock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScgbbPackage.SCHEDULING_BLOCK__SYNCHRONIZER_BLOCK, oldSynchronizerBlock, synchronizerBlock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScgbbPackage.SCHEDULING_BLOCK__GO_BLOCK, oldGoBlock, goBlock));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScgbbPackage.SCHEDULING_BLOCK__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
			case ScgbbPackage.SCHEDULING_BLOCK__NODES:
				return getNodes();
			case ScgbbPackage.SCHEDULING_BLOCK__DEPENDENCIES:
				return getDependencies();
			case ScgbbPackage.SCHEDULING_BLOCK__GUARD:
				if (resolve) return getGuard();
				return basicGetGuard();
			case ScgbbPackage.SCHEDULING_BLOCK__DEPTH_BLOCK:
				return isDepthBlock();
			case ScgbbPackage.SCHEDULING_BLOCK__SYNCHRONIZER_BLOCK:
				return isSynchronizerBlock();
			case ScgbbPackage.SCHEDULING_BLOCK__GO_BLOCK:
				return isGoBlock();
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
			case ScgbbPackage.SCHEDULING_BLOCK__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case ScgbbPackage.SCHEDULING_BLOCK__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Dependency>)newValue);
				return;
			case ScgbbPackage.SCHEDULING_BLOCK__GUARD:
				setGuard((ValuedObject)newValue);
				return;
			case ScgbbPackage.SCHEDULING_BLOCK__DEPTH_BLOCK:
				setDepthBlock((Boolean)newValue);
				return;
			case ScgbbPackage.SCHEDULING_BLOCK__SYNCHRONIZER_BLOCK:
				setSynchronizerBlock((Boolean)newValue);
				return;
			case ScgbbPackage.SCHEDULING_BLOCK__GO_BLOCK:
				setGoBlock((Boolean)newValue);
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
			case ScgbbPackage.SCHEDULING_BLOCK__NODES:
				getNodes().clear();
				return;
			case ScgbbPackage.SCHEDULING_BLOCK__DEPENDENCIES:
				getDependencies().clear();
				return;
			case ScgbbPackage.SCHEDULING_BLOCK__GUARD:
				setGuard((ValuedObject)null);
				return;
			case ScgbbPackage.SCHEDULING_BLOCK__DEPTH_BLOCK:
				setDepthBlock(DEPTH_BLOCK_EDEFAULT);
				return;
			case ScgbbPackage.SCHEDULING_BLOCK__SYNCHRONIZER_BLOCK:
				setSynchronizerBlock(SYNCHRONIZER_BLOCK_EDEFAULT);
				return;
			case ScgbbPackage.SCHEDULING_BLOCK__GO_BLOCK:
				setGoBlock(GO_BLOCK_EDEFAULT);
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
			case ScgbbPackage.SCHEDULING_BLOCK__NODES:
				return nodes != null && !nodes.isEmpty();
			case ScgbbPackage.SCHEDULING_BLOCK__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case ScgbbPackage.SCHEDULING_BLOCK__GUARD:
				return guard != null;
			case ScgbbPackage.SCHEDULING_BLOCK__DEPTH_BLOCK:
				return depthBlock != DEPTH_BLOCK_EDEFAULT;
			case ScgbbPackage.SCHEDULING_BLOCK__SYNCHRONIZER_BLOCK:
				return synchronizerBlock != SYNCHRONIZER_BLOCK_EDEFAULT;
			case ScgbbPackage.SCHEDULING_BLOCK__GO_BLOCK:
				return goBlock != GO_BLOCK_EDEFAULT;
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
		result.append(" (depthBlock: ");
		result.append(depthBlock);
		result.append(", synchronizerBlock: ");
		result.append(synchronizerBlock);
		result.append(", goBlock: ");
		result.append(goBlock);
		result.append(')');
		return result.toString();
	}

} //SchedulingBlockImpl
