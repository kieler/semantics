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

import de.cau.cs.kieler.scg.BasicBlock;
import de.cau.cs.kieler.scg.BranchType;
import de.cau.cs.kieler.scg.Conditional;
import de.cau.cs.kieler.scg.Predecessor;
import de.cau.cs.kieler.scg.ScgPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predecessor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.impl.PredecessorImpl#getBasicBlock <em>Basic Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.PredecessorImpl#getConditional <em>Conditional</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.PredecessorImpl#getBranchType <em>Branch Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredecessorImpl extends MinimalEObjectImpl.Container implements Predecessor {
    /**
	 * The cached value of the '{@link #getBasicBlock() <em>Basic Block</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBasicBlock()
	 * @generated
	 * @ordered
	 */
    protected BasicBlock basicBlock;

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
	 * The default value of the '{@link #getBranchType() <em>Branch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchType()
	 * @generated
	 * @ordered
	 */
	protected static final BranchType BRANCH_TYPE_EDEFAULT = BranchType.NORMAL;

				/**
	 * The cached value of the '{@link #getBranchType() <em>Branch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchType()
	 * @generated
	 * @ordered
	 */
	protected BranchType branchType = BRANCH_TYPE_EDEFAULT;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected PredecessorImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ScgPackage.Literals.PREDECESSOR;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BasicBlock getBasicBlock() {
		if (basicBlock != null && basicBlock.eIsProxy()) {
			InternalEObject oldBasicBlock = (InternalEObject)basicBlock;
			basicBlock = (BasicBlock)eResolveProxy(oldBasicBlock);
			if (basicBlock != oldBasicBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.PREDECESSOR__BASIC_BLOCK, oldBasicBlock, basicBlock));
			}
		}
		return basicBlock;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BasicBlock basicGetBasicBlock() {
		return basicBlock;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBasicBlock(BasicBlock newBasicBlock) {
		BasicBlock oldBasicBlock = basicBlock;
		basicBlock = newBasicBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.PREDECESSOR__BASIC_BLOCK, oldBasicBlock, basicBlock));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.PREDECESSOR__CONDITIONAL, oldConditional, conditional));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.PREDECESSOR__CONDITIONAL, oldConditional, conditional));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchType getBranchType() {
		return branchType;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranchType(BranchType newBranchType) {
		BranchType oldBranchType = branchType;
		branchType = newBranchType == null ? BRANCH_TYPE_EDEFAULT : newBranchType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.PREDECESSOR__BRANCH_TYPE, oldBranchType, branchType));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScgPackage.PREDECESSOR__BASIC_BLOCK:
				if (resolve) return getBasicBlock();
				return basicGetBasicBlock();
			case ScgPackage.PREDECESSOR__CONDITIONAL:
				if (resolve) return getConditional();
				return basicGetConditional();
			case ScgPackage.PREDECESSOR__BRANCH_TYPE:
				return getBranchType();
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
			case ScgPackage.PREDECESSOR__BASIC_BLOCK:
				setBasicBlock((BasicBlock)newValue);
				return;
			case ScgPackage.PREDECESSOR__CONDITIONAL:
				setConditional((Conditional)newValue);
				return;
			case ScgPackage.PREDECESSOR__BRANCH_TYPE:
				setBranchType((BranchType)newValue);
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
			case ScgPackage.PREDECESSOR__BASIC_BLOCK:
				setBasicBlock((BasicBlock)null);
				return;
			case ScgPackage.PREDECESSOR__CONDITIONAL:
				setConditional((Conditional)null);
				return;
			case ScgPackage.PREDECESSOR__BRANCH_TYPE:
				setBranchType(BRANCH_TYPE_EDEFAULT);
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
			case ScgPackage.PREDECESSOR__BASIC_BLOCK:
				return basicBlock != null;
			case ScgPackage.PREDECESSOR__CONDITIONAL:
				return conditional != null;
			case ScgPackage.PREDECESSOR__BRANCH_TYPE:
				return branchType != BRANCH_TYPE_EDEFAULT;
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
		result.append(" (branchType: ");
		result.append(branchType);
		result.append(')');
		return result.toString();
	}

} //PredecessorImpl
