/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.simplerailctrl.impl;

import de.cau.cs.kieler.simplerailctrl.Node;
import de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage;
import de.cau.cs.kieler.simplerailctrl.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.impl.NodeImpl#getOutTransitions <em>Out Transitions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.impl.NodeImpl#isInitial <em>Initial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
    /**
     * The cached value of the '{@link #getOutTransitions() <em>Out Transitions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutTransitions()
     * @generated
     * @ordered
     */
    protected EList<Transition> outTransitions;

    /**
     * The default value of the '{@link #isInitial() <em>Initial</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInitial()
     * @generated
     * @ordered
     */
    protected static final boolean INITIAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isInitial() <em>Initial</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInitial()
     * @generated
     * @ordered
     */
    protected boolean initial = INITIAL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SimplerailctrlPackage.Literals.NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Transition> getOutTransitions() {
        if (outTransitions == null) {
            outTransitions = new EObjectContainmentEList<Transition>(Transition.class, this, SimplerailctrlPackage.NODE__OUT_TRANSITIONS);
        }
        return outTransitions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isInitial() {
        return initial;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitial(boolean newInitial) {
        boolean oldInitial = initial;
        initial = newInitial;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SimplerailctrlPackage.NODE__INITIAL, oldInitial, initial));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SimplerailctrlPackage.NODE__OUT_TRANSITIONS:
                return ((InternalEList<?>)getOutTransitions()).basicRemove(otherEnd, msgs);
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
            case SimplerailctrlPackage.NODE__OUT_TRANSITIONS:
                return getOutTransitions();
            case SimplerailctrlPackage.NODE__INITIAL:
                return isInitial();
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
            case SimplerailctrlPackage.NODE__OUT_TRANSITIONS:
                getOutTransitions().clear();
                getOutTransitions().addAll((Collection<? extends Transition>)newValue);
                return;
            case SimplerailctrlPackage.NODE__INITIAL:
                setInitial((Boolean)newValue);
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
            case SimplerailctrlPackage.NODE__OUT_TRANSITIONS:
                getOutTransitions().clear();
                return;
            case SimplerailctrlPackage.NODE__INITIAL:
                setInitial(INITIAL_EDEFAULT);
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
            case SimplerailctrlPackage.NODE__OUT_TRANSITIONS:
                return outTransitions != null && !outTransitions.isEmpty();
            case SimplerailctrlPackage.NODE__INITIAL:
                return initial != INITIAL_EDEFAULT;
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
        result.append(" (initial: ");
        result.append(initial);
        result.append(')');
        return result.toString();
    }

} //NodeImpl
