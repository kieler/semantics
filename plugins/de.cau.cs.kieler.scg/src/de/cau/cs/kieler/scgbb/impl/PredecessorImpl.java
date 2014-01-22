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

import de.cau.cs.kieler.scg.Conditional;

import de.cau.cs.kieler.scgbb.BasicBlock;
import de.cau.cs.kieler.scgbb.BlockType;
import de.cau.cs.kieler.scgbb.Predecessor;
import de.cau.cs.kieler.scgbb.ScgbbPackage;

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
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.PredecessorImpl#getBasicBlock <em>Basic Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.PredecessorImpl#getBlockType <em>Block Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.PredecessorImpl#getConditional <em>Conditional</em>}</li>
 * </ul>
 * </p>
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
        return ScgbbPackage.Literals.PREDECESSOR;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgbbPackage.PREDECESSOR__BASIC_BLOCK, oldBasicBlock, basicBlock));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgbbPackage.PREDECESSOR__BASIC_BLOCK, oldBasicBlock, basicBlock));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgbbPackage.PREDECESSOR__BLOCK_TYPE, oldBlockType, blockType));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgbbPackage.PREDECESSOR__CONDITIONAL, oldConditional, conditional));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgbbPackage.PREDECESSOR__CONDITIONAL, oldConditional, conditional));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScgbbPackage.PREDECESSOR__BASIC_BLOCK:
                if (resolve) return getBasicBlock();
                return basicGetBasicBlock();
            case ScgbbPackage.PREDECESSOR__BLOCK_TYPE:
                return getBlockType();
            case ScgbbPackage.PREDECESSOR__CONDITIONAL:
                if (resolve) return getConditional();
                return basicGetConditional();
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
            case ScgbbPackage.PREDECESSOR__BASIC_BLOCK:
                setBasicBlock((BasicBlock)newValue);
                return;
            case ScgbbPackage.PREDECESSOR__BLOCK_TYPE:
                setBlockType((BlockType)newValue);
                return;
            case ScgbbPackage.PREDECESSOR__CONDITIONAL:
                setConditional((Conditional)newValue);
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
            case ScgbbPackage.PREDECESSOR__BASIC_BLOCK:
                setBasicBlock((BasicBlock)null);
                return;
            case ScgbbPackage.PREDECESSOR__BLOCK_TYPE:
                setBlockType(BLOCK_TYPE_EDEFAULT);
                return;
            case ScgbbPackage.PREDECESSOR__CONDITIONAL:
                setConditional((Conditional)null);
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
            case ScgbbPackage.PREDECESSOR__BASIC_BLOCK:
                return basicBlock != null;
            case ScgbbPackage.PREDECESSOR__BLOCK_TYPE:
                return blockType != BLOCK_TYPE_EDEFAULT;
            case ScgbbPackage.PREDECESSOR__CONDITIONAL:
                return conditional != null;
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
        result.append(" (blockType: ");
        result.append(blockType);
        result.append(')');
        return result.toString();
    }

} //PredecessorImpl
