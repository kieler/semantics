/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.ExpansionNode;
import uml.ExpansionRegion;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ExpansionNodeImpl#getRegionAsOutput <em>Region As Output</em>}</li>
 *   <li>{@link uml.impl.ExpansionNodeImpl#getRegionAsInput <em>Region As Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionNodeImpl extends ObjectNodeImpl implements ExpansionNode {
    /**
     * The cached value of the '{@link #getRegionAsOutput() <em>Region As Output</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegionAsOutput()
     * @generated
     * @ordered
     */
    protected ExpansionRegion regionAsOutput;

    /**
     * The cached value of the '{@link #getRegionAsInput() <em>Region As Input</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegionAsInput()
     * @generated
     * @ordered
     */
    protected ExpansionRegion regionAsInput;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExpansionNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getExpansionNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpansionRegion getRegionAsOutput() {
        if (regionAsOutput != null && regionAsOutput.eIsProxy()) {
            InternalEObject oldRegionAsOutput = (InternalEObject)regionAsOutput;
            regionAsOutput = (ExpansionRegion)eResolveProxy(oldRegionAsOutput);
            if (regionAsOutput != oldRegionAsOutput) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT, oldRegionAsOutput, regionAsOutput));
            }
        }
        return regionAsOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpansionRegion basicGetRegionAsOutput() {
        return regionAsOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRegionAsOutput(ExpansionRegion newRegionAsOutput, NotificationChain msgs) {
        ExpansionRegion oldRegionAsOutput = regionAsOutput;
        regionAsOutput = newRegionAsOutput;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT, oldRegionAsOutput, newRegionAsOutput);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRegionAsOutput(ExpansionRegion newRegionAsOutput) {
        if (newRegionAsOutput != regionAsOutput) {
            NotificationChain msgs = null;
            if (regionAsOutput != null)
                msgs = ((InternalEObject)regionAsOutput).eInverseRemove(this, UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT, ExpansionRegion.class, msgs);
            if (newRegionAsOutput != null)
                msgs = ((InternalEObject)newRegionAsOutput).eInverseAdd(this, UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT, ExpansionRegion.class, msgs);
            msgs = basicSetRegionAsOutput(newRegionAsOutput, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT, newRegionAsOutput, newRegionAsOutput));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpansionRegion getRegionAsInput() {
        if (regionAsInput != null && regionAsInput.eIsProxy()) {
            InternalEObject oldRegionAsInput = (InternalEObject)regionAsInput;
            regionAsInput = (ExpansionRegion)eResolveProxy(oldRegionAsInput);
            if (regionAsInput != oldRegionAsInput) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.EXPANSION_NODE__REGION_AS_INPUT, oldRegionAsInput, regionAsInput));
            }
        }
        return regionAsInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpansionRegion basicGetRegionAsInput() {
        return regionAsInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRegionAsInput(ExpansionRegion newRegionAsInput, NotificationChain msgs) {
        ExpansionRegion oldRegionAsInput = regionAsInput;
        regionAsInput = newRegionAsInput;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.EXPANSION_NODE__REGION_AS_INPUT, oldRegionAsInput, newRegionAsInput);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRegionAsInput(ExpansionRegion newRegionAsInput) {
        if (newRegionAsInput != regionAsInput) {
            NotificationChain msgs = null;
            if (regionAsInput != null)
                msgs = ((InternalEObject)regionAsInput).eInverseRemove(this, UmlPackage.EXPANSION_REGION__INPUT_ELEMENT, ExpansionRegion.class, msgs);
            if (newRegionAsInput != null)
                msgs = ((InternalEObject)newRegionAsInput).eInverseAdd(this, UmlPackage.EXPANSION_REGION__INPUT_ELEMENT, ExpansionRegion.class, msgs);
            msgs = basicSetRegionAsInput(newRegionAsInput, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXPANSION_NODE__REGION_AS_INPUT, newRegionAsInput, newRegionAsInput));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
                if (regionAsOutput != null)
                    msgs = ((InternalEObject)regionAsOutput).eInverseRemove(this, UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT, ExpansionRegion.class, msgs);
                return basicSetRegionAsOutput((ExpansionRegion)otherEnd, msgs);
            case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
                if (regionAsInput != null)
                    msgs = ((InternalEObject)regionAsInput).eInverseRemove(this, UmlPackage.EXPANSION_REGION__INPUT_ELEMENT, ExpansionRegion.class, msgs);
                return basicSetRegionAsInput((ExpansionRegion)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
                return basicSetRegionAsOutput(null, msgs);
            case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
                return basicSetRegionAsInput(null, msgs);
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
            case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
                if (resolve) return getRegionAsOutput();
                return basicGetRegionAsOutput();
            case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
                if (resolve) return getRegionAsInput();
                return basicGetRegionAsInput();
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
            case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
                setRegionAsOutput((ExpansionRegion)newValue);
                return;
            case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
                setRegionAsInput((ExpansionRegion)newValue);
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
            case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
                setRegionAsOutput((ExpansionRegion)null);
                return;
            case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
                setRegionAsInput((ExpansionRegion)null);
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
            case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
                return regionAsOutput != null;
            case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
                return regionAsInput != null;
        }
        return super.eIsSet(featureID);
    }

} //ExpansionNodeImpl
