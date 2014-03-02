/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.text.sct.scoping;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.OperatorExpression;
import de.cau.cs.kieler.core.kexpressions.OperatorType;
import de.cau.cs.kieler.core.kexpressions.TypeGroup;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;
import de.cau.cs.kieler.sccharts.Emission;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.Scope;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.Transition;

/**
 * This class contains custom scoping descriptions.
 *
 * @author chsch ssm
 */
public class SctScopeProvider extends AbstractDeclarativeScopeProvider {

    /**
     * A implementation of scoping for transitions' targets.
     * Won't be called directly but via reflection by the Xtext runtime.
     *
     * @param trans
     * @param reference
     * @return
     */
    public IScope scope_Transition_targetState(Transition trans, EReference reference) {
        List<IEObjectDescription> l = new LinkedList<IEObjectDescription>();
        HashSet<String> m = new HashSet<String>();
        String key = null;
        for (State s : ((Region) trans.eContainer().eContainer()).getStates()) {
            key = s.getId();
            if (m.contains(key)) {
                key = s.getId();
            }
            l.add(new EObjectDescription(QualifiedName.create(key), s,
                    Collections.<String, String> emptyMap()));
            m.add(key);

        }
        return new SimpleScope(l);
    }


    /**
     * A implementation of scoping for scopes' body references.
     * Won't be called directly but via reflection by the Xtext runtime.
     *
     * @param trans
     * @param reference
     * @return
     */
    public IScope scope_Scope_bodyReference(State state, EReference reference) {
        Resource theResource = state.eResource();
        EList<Resource> set = state.eResource().getResourceSet().getResources();
        List<IEObjectDescription> l = new LinkedList<IEObjectDescription>();
        for (Resource r : set) {
            if (r != theResource) {
                EObject obj = null;
                for (Iterator<EObject> it = r.getAllContents(); it.hasNext();) {
                    obj = it.next();
                    if (!((InternalEObject) obj).eIsProxy()
                            && SCChartsPackage.eINSTANCE.getState().isInstance(obj)) {
                        l.add(new EObjectDescription(QualifiedName.create(((State) obj).getId()), obj,
                                Collections.<String, String> emptyMap()));
                    }
                }
            }
        }

        return new SimpleScope(l);
    }


    /**
     * A implementation of scoping for valuedObject and variable references.
     * Won't be called directly but via reflection by the Xtext runtime.
     * Delegates to {@link SctScopeProvider#scope_ValuedObject(EObject, EReference, State)}.
     *
     * @param trans
     * @param reference
     * @return
     */
	public IScope scope_ValuedObjectReference_valuedObject(final EObject obj,
			final EReference reference) {
    	return new SimpleScope(this.scope_ValuedObject(obj, reference, null));
    }

    /**
     * More generic scoping implementation that can be re-used.
     *
     * @param obj
     * @param reference
     * @param logicalContainer
     * @return
     */
    protected List<IEObjectDescription> scope_ValuedObject(final EObject obj,
            final EReference reference, final Scope logicalContainer) {

        // include all available valuedObjects
        List<IEObjectDescription> l = this.scope_ValuedObject2(obj, reference, logicalContainer);

        // this branch will be entered during linking if the valuedObjectReference
        // is contained by a '?' OperatorExpression
        if (KExpressionsPackage.eINSTANCE.getOperatorExpression().isInstance(obj.eContainer())
                && (((OperatorExpression) obj.eContainer()).getOperator() == OperatorType.VAL || ((OperatorExpression) obj
                        .eContainer()).getOperator() == OperatorType.PRE)) {
            return l;
        }

        // this branch will be entered computing the content assist proposals
        // if the text input leads to a valid model!
        // otherwise used context is nearly unpredictable
        if (KExpressionsPackage.eINSTANCE.getOperatorExpression().isInstance(obj)
                && (((OperatorExpression) obj).getOperator() == OperatorType.VAL || ((OperatorExpression) obj)
                        .getOperator() == OperatorType.PRE)) {
            return l;
        }

        // add all available variables
        l.addAll(this.scope_Variable(obj, reference, logicalContainer));
        return l;
    }

    /**
     * A implementation of scoping for valuedObject emissions.
     * Won't be called directly but via reflection by the Xtext runtime.
     * Delegates to {@link SctScopeProvider#scope_ValuedObject(EObject, EReference, State)}.
     *
     * @param obj
     * @param reference
     * @return
     */
	public IScope scope_Emission_valuedObject(final EObject obj,
			final EReference reference) {
		return new SimpleScope(this.scope_ValuedObject(obj, reference, null));
    }

	/**
	 * More generic scoping implementation that can be re-used.
	 *
	 * @param obj
	 * @param reference
	 * @param logicalContainer
	 * @return
	 */
	protected List<IEObjectDescription> scope_ValuedObject2(final EObject obj,
			final EReference reference, final Scope logicalContainer) {

        List<IEObjectDescription> l = new LinkedList<IEObjectDescription>();
        EObject container = obj;
        while (true) {
            if (SCChartsPackage.eINSTANCE.getScope().isInstance(container)) {
                break;
            }
            container = container.eContainer();
        }

        boolean inLogicalContainer = false;
        Scope scope = (Scope) container;
        do {
            
            List<ValuedObject> m = Lists.newArrayList();
            for (TypeGroup g : scope.getTypeGroups()) {
                m.addAll(g.getValuedObjects());
            }
            
// TODO: Verify!            
//            for (ValuedObject s : Iterables.concat(scope.getValuedObjects(), m)) {
//                l.add(new EObjectDescription(QualifiedName.create(s.getName()), s,
//                        Collections.<String, String> emptyMap()));
//            }

            scope = (Scope) scope.eContainer();
            if (scope == null && !inLogicalContainer && container != null) {
            	scope = logicalContainer;
            	inLogicalContainer = true;
            }
        } while (scope != null);

        /*
         * FIXME this is very problematic code introduced to enable textual representations of not
         * completely transformed sccharts models from esterel models, which may refer to valuedObjects
         * of the esterel model
         */
        if (KExpressionsPackage.eINSTANCE.getValuedObjectReference().isInstance(obj)
                && ((ValuedObjectReference) obj).getValuedObject() != null
                && KExpressionsPackage.eINSTANCE.getValuedObject().isInstance(((ValuedObjectReference) obj).getValuedObject())
                && ((ValuedObjectReference) obj).getValuedObject().eResource() != obj.eResource()) {
            ValuedObject vObj = ((ValuedObjectReference) obj).getValuedObject();
            l.add(new EObjectDescription(QualifiedName.create(vObj.getName()), vObj,
                   Collections.<String, String> emptyMap()));
        } else if (SCChartsPackage.eINSTANCE.getEmission().isInstance(obj)
                && ((Emission) obj).getValuedObject() != null
                && ((Emission) obj).getValuedObject().eResource() != obj.eResource()) {
            ValuedObject s = ((Emission) obj).getValuedObject();
            l.add(new EObjectDescription(QualifiedName.create(s.getName()), s,
                   Collections.<String, String> emptyMap()));
        }

        return l;
    }


    /**
     * A implementation of scoping for variable assignments.
     * Won't be called directly but via reflection by the Xtext runtime.
     * Delegates to {@link SctScopeProvider#scope_Variable(EObject, EReference, State)}.
     *
     * @param obj
     * @param reference
     * @return
     */
	public IScope scope_Assignment_variable(final EObject obj,
			final EReference reference) {
    	return new SimpleScope(this.scope_Variable(obj, reference, null));
    }

	/**
	 * More generic scoping implementation that can be re-used.
	 *
	 * @param obj
	 * @param reference
	 * @param logicalContainer
	 * @return
	 */
	protected List<IEObjectDescription> scope_Variable(final EObject obj,
			final EReference reference, final Scope logicalContainer) {

        List<IEObjectDescription> l = new LinkedList<IEObjectDescription>();
        EObject container = obj;
        while (true) {
            if (SCChartsPackage.eINSTANCE.getScope().isInstance(container)) {
                break;
            }
            container = container.eContainer();
        }

        boolean inLogicalContainer = false;
        Scope scope = (Scope) container;
        do {
//            for (Variable v : scope.getVariables()) {
//                l.add(new EObjectDescription(QualifiedName.create(v.getName()), v,
//                        Collections.<String, String> emptyMap()));
//            }

            scope = (Scope) scope.eContainer();
            if (scope == null && !inLogicalContainer && container != null) {
            	scope = logicalContainer;
            	inLogicalContainer = true;
            }
        } while (scope != null);

        /*
         * FIXME this is very problematic code introduced to enable textual representations of not
         * completely transformed sccharts models from esterel models, which may refer to valuedObjects
         * of the esterel model
         */
        if (KExpressionsPackage.eINSTANCE.getValuedObjectReference().isInstance(obj)
                && ((ValuedObjectReference) obj).getValuedObject() != null
                //&& KExpressionsPackage.eINSTANCE.getVariable().isInstance(((ValuedObjectReference) obj).getValuedObject())
                && ((ValuedObjectReference) obj).getValuedObject().eResource() != obj.eResource()) {
            ValuedObject vObj = ((ValuedObjectReference) obj).getValuedObject();
            l.add(new EObjectDescription(QualifiedName.create(vObj.getName()), vObj,
                    Collections.<String, String> emptyMap()));
        } 
//        else if (SCChartsPackage.eINSTANCE.getAssignment().isInstance(obj)
//                && ((Assignment) obj).getVariable() != null
//                && ((Assignment) obj).getVariable().eResource() != obj.eResource()) {
//            Variable v = ((Assignment) obj).getVariable();
//            l.add(new EObjectDescription(QualifiedName.create(v.getName()), v,
//                   Collections.<String, String> emptyMap()));
//        }
        return l;
    }
}
