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

import de.cau.cs.kieler.scg.ControlFlow;

import de.cau.cs.kieler.scgsched.PotentialInstantaneousLoopProblem;
import de.cau.cs.kieler.scgsched.ScgschedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Potential Instantaneous Loop Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.PotentialInstantaneousLoopProblemImpl#getControlFlows <em>Control Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PotentialInstantaneousLoopProblemImpl extends ProblemImpl implements PotentialInstantaneousLoopProblem {
	/**
	 * The cached value of the '{@link #getControlFlows() <em>Control Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlFlow> controlFlows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PotentialInstantaneousLoopProblemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScgschedPackage.Literals.POTENTIAL_INSTANTANEOUS_LOOP_PROBLEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlFlow> getControlFlows() {
		if (controlFlows == null) {
			controlFlows = new EObjectResolvingEList<ControlFlow>(ControlFlow.class, this, ScgschedPackage.POTENTIAL_INSTANTANEOUS_LOOP_PROBLEM__CONTROL_FLOWS);
		}
		return controlFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScgschedPackage.POTENTIAL_INSTANTANEOUS_LOOP_PROBLEM__CONTROL_FLOWS:
				return getControlFlows();
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
			case ScgschedPackage.POTENTIAL_INSTANTANEOUS_LOOP_PROBLEM__CONTROL_FLOWS:
				getControlFlows().clear();
				getControlFlows().addAll((Collection<? extends ControlFlow>)newValue);
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
			case ScgschedPackage.POTENTIAL_INSTANTANEOUS_LOOP_PROBLEM__CONTROL_FLOWS:
				getControlFlows().clear();
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
			case ScgschedPackage.POTENTIAL_INSTANTANEOUS_LOOP_PROBLEM__CONTROL_FLOWS:
				return controlFlows != null && !controlFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PotentialInstantaneousLoopProblemImpl
