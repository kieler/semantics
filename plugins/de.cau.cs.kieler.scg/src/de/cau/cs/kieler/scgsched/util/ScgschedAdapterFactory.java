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
package de.cau.cs.kieler.scgsched.util;

import de.cau.cs.kieler.scg.SCGraph;

import de.cau.cs.kieler.scgbb.SCGraphBB;

import de.cau.cs.kieler.scgdep.SCGraphDep;

import de.cau.cs.kieler.scgsched.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.scgsched.ScgschedPackage
 * @generated
 */
public class ScgschedAdapterFactory extends AdapterFactoryImpl {
    /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static ScgschedPackage modelPackage;

    /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ScgschedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScgschedPackage.eINSTANCE;
		}
	}

    /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
    @Override
    public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

    /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ScgschedSwitch<Adapter> modelSwitch =
        new ScgschedSwitch<Adapter>() {
			@Override
			public Adapter caseSCGraphSched(SCGraphSched object) {
				return createSCGraphSchedAdapter();
			}
			@Override
			public Adapter caseEmptyExpressions(EmptyExpressions object) {
				return createEmptyExpressionsAdapter();
			}
			@Override
			public Adapter caseGuardExpression(GuardExpression object) {
				return createGuardExpressionAdapter();
			}
			@Override
			public Adapter caseSchedule(Schedule object) {
				return createScheduleAdapter();
			}
			@Override
			public Adapter caseProblem(Problem object) {
				return createProblemAdapter();
			}
			@Override
			public Adapter casePotentialInstantaneousLoopProblem(PotentialInstantaneousLoopProblem object) {
				return createPotentialInstantaneousLoopProblemAdapter();
			}
			@Override
			public Adapter caseSCGraph(SCGraph object) {
				return createSCGraphAdapter();
			}
			@Override
			public Adapter caseSCGraphDep(SCGraphDep object) {
				return createSCGraphDepAdapter();
			}
			@Override
			public Adapter caseSCGraphBB(SCGraphBB object) {
				return createSCGraphBBAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

    /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
    @Override
    public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgsched.SCGraphSched <em>SC Graph Sched</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.scgsched.SCGraphSched
	 * @generated
	 */
    public Adapter createSCGraphSchedAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgsched.EmptyExpressions <em>Empty Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.scgsched.EmptyExpressions
	 * @generated
	 */
	public Adapter createEmptyExpressionsAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgsched.GuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.scgsched.GuardExpression
	 * @generated
	 */
	public Adapter createGuardExpressionAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgsched.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.scgsched.Schedule
	 * @generated
	 */
    public Adapter createScheduleAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgsched.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.scgsched.Problem
	 * @generated
	 */
	public Adapter createProblemAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgsched.PotentialInstantaneousLoopProblem <em>Potential Instantaneous Loop Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.scgsched.PotentialInstantaneousLoopProblem
	 * @generated
	 */
	public Adapter createPotentialInstantaneousLoopProblemAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scg.SCGraph <em>SC Graph</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.scg.SCGraph
	 * @generated
	 */
    public Adapter createSCGraphAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgdep.SCGraphDep <em>SC Graph Dep</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.scgdep.SCGraphDep
	 * @generated
	 */
    public Adapter createSCGraphDepAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.scgbb.SCGraphBB <em>SC Graph BB</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.scgbb.SCGraphBB
	 * @generated
	 */
    public Adapter createSCGraphBBAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
    public Adapter createEObjectAdapter() {
		return null;
	}

} //ScgschedAdapterFactory
