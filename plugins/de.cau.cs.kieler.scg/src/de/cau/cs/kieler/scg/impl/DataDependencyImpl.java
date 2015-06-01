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

import de.cau.cs.kieler.scg.DataDependency;
import de.cau.cs.kieler.scg.ScgPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.impl.DataDependencyImpl#isConcurrent <em>Concurrent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.DataDependencyImpl#isConfluent <em>Confluent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataDependencyImpl extends DependencyImpl implements DataDependency {
    /**
	 * The default value of the '{@link #isConcurrent() <em>Concurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isConcurrent()
	 * @generated
	 * @ordered
	 */
    protected static final boolean CONCURRENT_EDEFAULT = false;

    /**
	 * The cached value of the '{@link #isConcurrent() <em>Concurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isConcurrent()
	 * @generated
	 * @ordered
	 */
    protected boolean concurrent = CONCURRENT_EDEFAULT;

    /**
	 * The default value of the '{@link #isConfluent() <em>Confluent</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isConfluent()
	 * @generated
	 * @ordered
	 */
    protected static final boolean CONFLUENT_EDEFAULT = false;

    /**
	 * The cached value of the '{@link #isConfluent() <em>Confluent</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isConfluent()
	 * @generated
	 * @ordered
	 */
    protected boolean confluent = CONFLUENT_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DataDependencyImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ScgPackage.Literals.DATA_DEPENDENCY;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isConcurrent() {
		return concurrent;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConcurrent(boolean newConcurrent) {
		boolean oldConcurrent = concurrent;
		concurrent = newConcurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.DATA_DEPENDENCY__CONCURRENT, oldConcurrent, concurrent));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isConfluent() {
		return confluent;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConfluent(boolean newConfluent) {
		boolean oldConfluent = confluent;
		confluent = newConfluent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.DATA_DEPENDENCY__CONFLUENT, oldConfluent, confluent));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScgPackage.DATA_DEPENDENCY__CONCURRENT:
				return isConcurrent();
			case ScgPackage.DATA_DEPENDENCY__CONFLUENT:
				return isConfluent();
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
			case ScgPackage.DATA_DEPENDENCY__CONCURRENT:
				setConcurrent((Boolean)newValue);
				return;
			case ScgPackage.DATA_DEPENDENCY__CONFLUENT:
				setConfluent((Boolean)newValue);
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
			case ScgPackage.DATA_DEPENDENCY__CONCURRENT:
				setConcurrent(CONCURRENT_EDEFAULT);
				return;
			case ScgPackage.DATA_DEPENDENCY__CONFLUENT:
				setConfluent(CONFLUENT_EDEFAULT);
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
			case ScgPackage.DATA_DEPENDENCY__CONCURRENT:
				return concurrent != CONCURRENT_EDEFAULT;
			case ScgPackage.DATA_DEPENDENCY__CONFLUENT:
				return confluent != CONFLUENT_EDEFAULT;
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
		result.append(" (concurrent: ");
		result.append(concurrent);
		result.append(", confluent: ");
		result.append(confluent);
		result.append(')');
		return result.toString();
	}

} //DataDependencyImpl
