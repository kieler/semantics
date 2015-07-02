/**
 *  KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *  http://www.informatik.uni-kiel.de/rtsys/kieler/
 *   
 *  Copyright 2012 by
 *   + Kiel University
 *    + Department of Computer Science
 *       + Real-Time and Embedded Systems Group
 *   
 *   This code is provided under the terms of the Eclipse Public License (EPL).
 *   See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.util;

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.yakindu.base.base.DocumentedElement;
import org.yakindu.base.base.NamedElement;

import org.yakindu.sct.model.sgraph.CompositeElement;
import org.yakindu.sct.model.sgraph.Reaction;
import org.yakindu.sct.model.sgraph.ReactiveElement;
import org.yakindu.sct.model.sgraph.RegularState;
import org.yakindu.sct.model.sgraph.ScopedElement;
import org.yakindu.sct.model.sgraph.SpecificationElement;
import org.yakindu.sct.model.sgraph.State;
import org.yakindu.sct.model.sgraph.Transition;
import org.yakindu.sct.model.sgraph.Vertex;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage
 * @generated
 */
public class SyncgraphAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static SyncgraphPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SyncgraphAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SyncgraphPackage.eINSTANCE;
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
	protected SyncgraphSwitch<Adapter> modelSwitch =
		new SyncgraphSwitch<Adapter>() {
            @Override
            public Adapter caseSyncTransition(SyncTransition object) {
                return createSyncTransitionAdapter();
            }
            @Override
            public Adapter caseSyncState(SyncState object) {
                return createSyncStateAdapter();
            }
            @Override
            public Adapter caseSpecificationElement(SpecificationElement object) {
                return createSpecificationElementAdapter();
            }
            @Override
            public Adapter caseReaction(Reaction object) {
                return createReactionAdapter();
            }
            @Override
            public Adapter caseDocumentedElement(DocumentedElement object) {
                return createDocumentedElementAdapter();
            }
            @Override
            public Adapter caseTransition(Transition object) {
                return createTransitionAdapter();
            }
            @Override
            public Adapter caseReactiveElement(ReactiveElement object) {
                return createReactiveElementAdapter();
            }
            @Override
            public Adapter caseScopedElement(ScopedElement object) {
                return createScopedElementAdapter();
            }
            @Override
            public Adapter caseNamedElement(NamedElement object) {
                return createNamedElementAdapter();
            }
            @Override
            public Adapter caseVertex(Vertex object) {
                return createVertexAdapter();
            }
            @Override
            public Adapter caseRegularState(RegularState object) {
                return createRegularStateAdapter();
            }
            @Override
            public Adapter caseCompositeElement(CompositeElement object) {
                return createCompositeElementAdapter();
            }
            @Override
            public Adapter caseState(State object) {
                return createStateAdapter();
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
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition <em>Sync Transition</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition
     * @generated
     */
	public Adapter createSyncTransitionAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState <em>Sync State</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
     * @generated
     */
	public Adapter createSyncStateAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.sgraph.SpecificationElement <em>Specification Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.yakindu.sct.model.sgraph.SpecificationElement
     * @generated
     */
	public Adapter createSpecificationElementAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.sgraph.Reaction <em>Reaction</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.yakindu.sct.model.sgraph.Reaction
     * @generated
     */
	public Adapter createReactionAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.yakindu.base.base.DocumentedElement <em>Documented Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.yakindu.base.base.DocumentedElement
     * @generated
     */
	public Adapter createDocumentedElementAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.sgraph.Transition <em>Transition</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.yakindu.sct.model.sgraph.Transition
     * @generated
     */
	public Adapter createTransitionAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.sgraph.ReactiveElement <em>Reactive Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.yakindu.sct.model.sgraph.ReactiveElement
     * @generated
     */
	public Adapter createReactiveElementAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.sgraph.ScopedElement <em>Scoped Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.yakindu.sct.model.sgraph.ScopedElement
     * @generated
     */
	public Adapter createScopedElementAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.yakindu.base.base.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.yakindu.base.base.NamedElement
     * @generated
     */
	public Adapter createNamedElementAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.sgraph.Vertex <em>Vertex</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.yakindu.sct.model.sgraph.Vertex
     * @generated
     */
	public Adapter createVertexAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.sgraph.RegularState <em>Regular State</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.yakindu.sct.model.sgraph.RegularState
     * @generated
     */
	public Adapter createRegularStateAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.sgraph.CompositeElement <em>Composite Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.yakindu.sct.model.sgraph.CompositeElement
     * @generated
     */
	public Adapter createCompositeElementAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.sgraph.State <em>State</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.yakindu.sct.model.sgraph.State
     * @generated
     */
	public Adapter createStateAdapter() {
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

} //SyncgraphAdapterFactory
