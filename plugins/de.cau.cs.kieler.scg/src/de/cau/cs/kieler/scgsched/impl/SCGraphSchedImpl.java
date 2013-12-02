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
package de.cau.cs.kieler.scgsched.impl;

import de.cau.cs.kieler.scgbb.impl.SCGraphBBImpl;
import de.cau.cs.kieler.scgsched.Problem;
import de.cau.cs.kieler.scgsched.SCGraphSched;
import de.cau.cs.kieler.scgsched.ScgschedPackage;
import de.cau.cs.kieler.scgsched.Schedule;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SC Graph Sched</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.SCGraphSchedImpl#isUnschedulable <em>Unschedulable</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.SCGraphSchedImpl#getSchedules <em>Schedules</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.SCGraphSchedImpl#getProblems <em>Problems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SCGraphSchedImpl extends SCGraphBBImpl implements SCGraphSched {
    /**
	 * The default value of the '{@link #isUnschedulable() <em>Unschedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isUnschedulable()
	 * @generated
	 * @ordered
	 */
    protected static final boolean UNSCHEDULABLE_EDEFAULT = false;

    /**
	 * The cached value of the '{@link #isUnschedulable() <em>Unschedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isUnschedulable()
	 * @generated
	 * @ordered
	 */
    protected boolean unschedulable = UNSCHEDULABLE_EDEFAULT;

    /**
	 * The cached value of the '{@link #getSchedules() <em>Schedules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSchedules()
	 * @generated
	 * @ordered
	 */
    protected EList<Schedule> schedules;

    /**
	 * The cached value of the '{@link #getProblems() <em>Problems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblems()
	 * @generated
	 * @ordered
	 */
	protected EList<Problem> problems;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SCGraphSchedImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ScgschedPackage.Literals.SC_GRAPH_SCHED;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isUnschedulable() {
		return unschedulable;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setUnschedulable(boolean newUnschedulable) {
		boolean oldUnschedulable = unschedulable;
		unschedulable = newUnschedulable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.SC_GRAPH_SCHED__UNSCHEDULABLE, oldUnschedulable, unschedulable));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Schedule> getSchedules() {
		if (schedules == null) {
			schedules = new EObjectContainmentEList<Schedule>(Schedule.class, this, ScgschedPackage.SC_GRAPH_SCHED__SCHEDULES);
		}
		return schedules;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Problem> getProblems() {
		if (problems == null) {
			problems = new EObjectContainmentEList<Problem>(Problem.class, this, ScgschedPackage.SC_GRAPH_SCHED__PROBLEMS);
		}
		return problems;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScgschedPackage.SC_GRAPH_SCHED__SCHEDULES:
				return ((InternalEList<?>)getSchedules()).basicRemove(otherEnd, msgs);
			case ScgschedPackage.SC_GRAPH_SCHED__PROBLEMS:
				return ((InternalEList<?>)getProblems()).basicRemove(otherEnd, msgs);
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
			case ScgschedPackage.SC_GRAPH_SCHED__UNSCHEDULABLE:
				return isUnschedulable();
			case ScgschedPackage.SC_GRAPH_SCHED__SCHEDULES:
				return getSchedules();
			case ScgschedPackage.SC_GRAPH_SCHED__PROBLEMS:
				return getProblems();
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
			case ScgschedPackage.SC_GRAPH_SCHED__UNSCHEDULABLE:
				setUnschedulable((Boolean)newValue);
				return;
			case ScgschedPackage.SC_GRAPH_SCHED__SCHEDULES:
				getSchedules().clear();
				getSchedules().addAll((Collection<? extends Schedule>)newValue);
				return;
			case ScgschedPackage.SC_GRAPH_SCHED__PROBLEMS:
				getProblems().clear();
				getProblems().addAll((Collection<? extends Problem>)newValue);
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
			case ScgschedPackage.SC_GRAPH_SCHED__UNSCHEDULABLE:
				setUnschedulable(UNSCHEDULABLE_EDEFAULT);
				return;
			case ScgschedPackage.SC_GRAPH_SCHED__SCHEDULES:
				getSchedules().clear();
				return;
			case ScgschedPackage.SC_GRAPH_SCHED__PROBLEMS:
				getProblems().clear();
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
			case ScgschedPackage.SC_GRAPH_SCHED__UNSCHEDULABLE:
				return unschedulable != UNSCHEDULABLE_EDEFAULT;
			case ScgschedPackage.SC_GRAPH_SCHED__SCHEDULES:
				return schedules != null && !schedules.isEmpty();
			case ScgschedPackage.SC_GRAPH_SCHED__PROBLEMS:
				return problems != null && !problems.isEmpty();
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
		result.append(" (unschedulable: ");
		result.append(unschedulable);
		result.append(')');
		return result.toString();
	}

} //SCGraphSchedImpl
