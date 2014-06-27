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
package de.cau.cs.kieler.sccharts.impl;

import de.cau.cs.kieler.sccharts.ReferencedNode;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.Scope;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenced Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ReferencedNodeImpl#getReferencedScope <em>Referenced Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferencedNodeImpl extends NodeImpl implements ReferencedNode {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * The cached value of the '{@link #getReferencedScope() <em>Referenced Scope</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReferencedScope()
	 * @generated
	 * @ordered
	 */
    protected Scope referencedScope;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ReferencedNodeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SCChartsPackage.Literals.REFERENCED_NODE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Scope getReferencedScope() {
		if (referencedScope != null && referencedScope.eIsProxy()) {
			InternalEObject oldReferencedScope = (InternalEObject)referencedScope;
			referencedScope = (Scope)eResolveProxy(oldReferencedScope);
			if (referencedScope != oldReferencedScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.REFERENCED_NODE__REFERENCED_SCOPE, oldReferencedScope, referencedScope));
			}
		}
		return referencedScope;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Scope basicGetReferencedScope() {
		return referencedScope;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setReferencedScope(Scope newReferencedScope) {
		Scope oldReferencedScope = referencedScope;
		referencedScope = newReferencedScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.REFERENCED_NODE__REFERENCED_SCOPE, oldReferencedScope, referencedScope));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SCChartsPackage.REFERENCED_NODE__REFERENCED_SCOPE:
				if (resolve) return getReferencedScope();
				return basicGetReferencedScope();
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
			case SCChartsPackage.REFERENCED_NODE__REFERENCED_SCOPE:
				setReferencedScope((Scope)newValue);
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
			case SCChartsPackage.REFERENCED_NODE__REFERENCED_SCOPE:
				setReferencedScope((Scope)null);
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
			case SCChartsPackage.REFERENCED_NODE__REFERENCED_SCOPE:
				return referencedScope != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferencedNodeImpl
