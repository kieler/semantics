/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.util;

import de.cau.cs.kieler.core.annotations.Annotatable;

import de.cau.cs.kieler.core.kexpressions.TextualCode;

import de.cau.cs.kieler.synccharts.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage
 * @generated
 */
public class SyncchartsAdapterFactory extends AdapterFactoryImpl {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2009 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static SyncchartsPackage modelPackage;

    /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SyncchartsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SyncchartsPackage.eINSTANCE;
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
    protected SyncchartsSwitch<Adapter> modelSwitch =
        new SyncchartsSwitch<Adapter>() {
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter caseEffect(Effect object) {
				return createEffectAdapter();
			}
			@Override
			public Adapter caseEmission(Emission object) {
				return createEmissionAdapter();
			}
			@Override
			public Adapter caseRegion(Region object) {
				return createRegionAdapter();
			}
			@Override
			public Adapter caseSubstitution(Substitution object) {
				return createSubstitutionAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseScope(Scope object) {
				return createScopeAdapter();
			}
			@Override
			public Adapter caseTextEffect(TextEffect object) {
				return createTextEffectAdapter();
			}
			@Override
			public Adapter caseAnnotatable(Annotatable object) {
				return createAnnotatableAdapter();
			}
			@Override
			public Adapter caseTextualCode(TextualCode object) {
				return createTextualCodeAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.Action
	 * @generated
	 */
    public Adapter createActionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.Assignment
	 * @generated
	 */
    public Adapter createAssignmentAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.Effect
	 * @generated
	 */
    public Adapter createEffectAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.Emission <em>Emission</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.Emission
	 * @generated
	 */
    public Adapter createEmissionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.Region
	 * @generated
	 */
    public Adapter createRegionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.Substitution <em>Substitution</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.Substitution
	 * @generated
	 */
    public Adapter createSubstitutionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.State
	 * @generated
	 */
    public Adapter createStateAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.Transition
	 * @generated
	 */
    public Adapter createTransitionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.Scope
	 * @generated
	 */
    public Adapter createScopeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.TextEffect <em>Text Effect</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.TextEffect
	 * @generated
	 */
    public Adapter createTextEffectAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.annotations.Annotatable <em>Annotatable</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.core.annotations.Annotatable
	 * @generated
	 */
    public Adapter createAnnotatableAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.kexpressions.TextualCode <em>Textual Code</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.core.kexpressions.TextualCode
	 * @generated
	 */
    public Adapter createTextualCodeAdapter() {
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

} //SyncchartsAdapterFactory
