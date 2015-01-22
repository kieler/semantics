/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.scgprios.BasicBlock_P;
import de.cau.cs.kieler.scgprios.BranchType_P;
import de.cau.cs.kieler.scgprios.Conditional_P;
import de.cau.cs.kieler.scgprios.Predecessor_P;
import de.cau.cs.kieler.scgprios.ScgpriosPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predecessor P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Predecessor_PImpl#getBasicBlock <em>Basic Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Predecessor_PImpl#getConditional <em>Conditional</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Predecessor_PImpl#getBranchType <em>Branch Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Predecessor_PImpl extends MinimalEObjectImpl.Container implements Predecessor_P {
    /**
     * The cached value of the '{@link #getBasicBlock() <em>Basic Block</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBasicBlock()
     * @generated
     * @ordered
     */
    protected BasicBlock_P basicBlock;

    /**
     * The cached value of the '{@link #getConditional() <em>Conditional</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConditional()
     * @generated
     * @ordered
     */
    protected Conditional_P conditional;

    /**
     * The default value of the '{@link #getBranchType() <em>Branch Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBranchType()
     * @generated
     * @ordered
     */
    protected static final BranchType_P BRANCH_TYPE_EDEFAULT = BranchType_P.NORMAL;

    /**
     * The cached value of the '{@link #getBranchType() <em>Branch Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBranchType()
     * @generated
     * @ordered
     */
    protected BranchType_P branchType = BRANCH_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Predecessor_PImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgpriosPackage.Literals.PREDECESSOR_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BasicBlock_P getBasicBlock() {
        if (basicBlock != null && basicBlock.eIsProxy()) {
            InternalEObject oldBasicBlock = (InternalEObject)basicBlock;
            basicBlock = (BasicBlock_P)eResolveProxy(oldBasicBlock);
            if (basicBlock != oldBasicBlock) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgpriosPackage.PREDECESSOR_P__BASIC_BLOCK, oldBasicBlock, basicBlock));
            }
        }
        return basicBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BasicBlock_P basicGetBasicBlock() {
        return basicBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBasicBlock(BasicBlock_P newBasicBlock) {
        BasicBlock_P oldBasicBlock = basicBlock;
        basicBlock = newBasicBlock;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.PREDECESSOR_P__BASIC_BLOCK, oldBasicBlock, basicBlock));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Conditional_P getConditional() {
        if (conditional != null && conditional.eIsProxy()) {
            InternalEObject oldConditional = (InternalEObject)conditional;
            conditional = (Conditional_P)eResolveProxy(oldConditional);
            if (conditional != oldConditional) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgpriosPackage.PREDECESSOR_P__CONDITIONAL, oldConditional, conditional));
            }
        }
        return conditional;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Conditional_P basicGetConditional() {
        return conditional;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConditional(Conditional_P newConditional) {
        Conditional_P oldConditional = conditional;
        conditional = newConditional;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.PREDECESSOR_P__CONDITIONAL, oldConditional, conditional));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BranchType_P getBranchType() {
        return branchType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBranchType(BranchType_P newBranchType) {
        BranchType_P oldBranchType = branchType;
        branchType = newBranchType == null ? BRANCH_TYPE_EDEFAULT : newBranchType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.PREDECESSOR_P__BRANCH_TYPE, oldBranchType, branchType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScgpriosPackage.PREDECESSOR_P__BASIC_BLOCK:
                if (resolve) return getBasicBlock();
                return basicGetBasicBlock();
            case ScgpriosPackage.PREDECESSOR_P__CONDITIONAL:
                if (resolve) return getConditional();
                return basicGetConditional();
            case ScgpriosPackage.PREDECESSOR_P__BRANCH_TYPE:
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
            case ScgpriosPackage.PREDECESSOR_P__BASIC_BLOCK:
                setBasicBlock((BasicBlock_P)newValue);
                return;
            case ScgpriosPackage.PREDECESSOR_P__CONDITIONAL:
                setConditional((Conditional_P)newValue);
                return;
            case ScgpriosPackage.PREDECESSOR_P__BRANCH_TYPE:
                setBranchType((BranchType_P)newValue);
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
            case ScgpriosPackage.PREDECESSOR_P__BASIC_BLOCK:
                setBasicBlock((BasicBlock_P)null);
                return;
            case ScgpriosPackage.PREDECESSOR_P__CONDITIONAL:
                setConditional((Conditional_P)null);
                return;
            case ScgpriosPackage.PREDECESSOR_P__BRANCH_TYPE:
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
            case ScgpriosPackage.PREDECESSOR_P__BASIC_BLOCK:
                return basicBlock != null;
            case ScgpriosPackage.PREDECESSOR_P__CONDITIONAL:
                return conditional != null;
            case ScgpriosPackage.PREDECESSOR_P__BRANCH_TYPE:
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

} //Predecessor_PImpl
