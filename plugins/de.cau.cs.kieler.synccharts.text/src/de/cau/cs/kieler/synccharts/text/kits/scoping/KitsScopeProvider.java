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
package de.cau.cs.kieler.synccharts.text.kits.scoping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import de.cau.cs.kieler.core.expressions.Expression;
import de.cau.cs.kieler.core.expressions.ExpressionsPackage;
import de.cau.cs.kieler.core.expressions.OperatorExpression;
import de.cau.cs.kieler.core.expressions.OperatorType;
import de.cau.cs.kieler.core.expressions.Signal;
import de.cau.cs.kieler.core.expressions.Variable;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Scope;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * This class contains custom scoping description.
 * 
 * @author chsch
 */
public class KitsScopeProvider extends AbstractDeclarativeScopeProvider {

	
	/**
	 * A implementation of scoping for transitions' targets.
	 * Won't be called directly but via reflection by the Xtext runtime.
	 * @param trans
	 * @param reference
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public IScope scope_Transition_targetState(Transition trans, EReference reference) {
		List<IEObjectDescription> l = new LinkedList<IEObjectDescription>();
		HashSet<String> m = new HashSet<String>();
		String key = null;
		for (State s : ((Region) trans.eContainer().eContainer()).getStates()) {
			key = s.getId();
			if (m.contains(key)) {
				key = s.getId();
			}
			l.add(new EObjectDescription(key, s, Collections.EMPTY_MAP));
			m.add(key);
			
		}
		return new SimpleScope(l);
	}

	/**
	 * A implementation of scoping for signals and variables.
	 * Won't be called directly but via reflection by the Xtext runtime.
	 * @param trans
	 * @param reference
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public IScope scope_ValuedObjectReference_valuedObject(EObject obj, EReference reference) {
		List<IEObjectDescription> l = new LinkedList<IEObjectDescription>();
		EObject container = obj;
		while (true) {
			if (SyncchartsPackage.eINSTANCE.getScope().isInstance(container)) {
				break;
			}
			container = container.eContainer();
		}
		
		Scope scope = (Scope) container;
		do {
			for (Signal s : scope.getSignals()) {
				l.add(new EObjectDescription(s.getName(), s, (Map<String, String>) Collections.EMPTY_MAP));			
			}
			scope = (Scope) scope.eContainer();
		} while (scope != null);
		
		
		// this branch will be entered during linking if the valuedObjectReference
		// is contained by a '?' OperatorExpression
		if (ExpressionsPackage.eINSTANCE.getOperatorExpression().isInstance(
				obj.eContainer())
				&& (((OperatorExpression) obj.eContainer()).getOperator() == OperatorType.VAL
						|| ((OperatorExpression) obj.eContainer()).getOperator() == OperatorType.PRE)) {
			return new SimpleScope(l);
		}
		
		// this branch will be entered computing the content assist proposals
		// if the text input leads to a valid model!
		// otherwise used context is nearly unpredictable 
		if (ExpressionsPackage.eINSTANCE.getOperatorExpression().isInstance(obj)
				&& (((OperatorExpression) obj).getOperator() == OperatorType.VAL
						|| ((OperatorExpression) obj).getOperator() == OperatorType.PRE)) {
			return new SimpleScope(l);
		}
		
		scope = (Scope) container;
		do {
			for (Variable v : scope.getVariables()) {
				l.add(new EObjectDescription(v.getName(), v, Collections.EMPTY_MAP));
			}
			scope = (Scope) scope.eContainer();
		} while (scope != null);
		return new SimpleScope(l);
	}

	
	/** old stuff */
    @SuppressWarnings("unchecked")
	public IScope getScopeOld(EObject context, EReference reference) {
		
    	if (context instanceof Transition) {
    		List<State> states = ((Region) ((Transition) context).eContainer().eContainer()).getStates();
    		List<IEObjectDescription> stateDescriptions = new LinkedList<IEObjectDescription>(); 
    		for(State state : states) {
    			stateDescriptions.add(new EObjectDescription(state.getLabel(), state, Collections.EMPTY_MAP));
    		}
    		return new SimpleScope(stateDescriptions);
    	}
    	
    	if (context instanceof Expression) {
    		return createHierarchicScope(((Expression) context));
    	}
    	return super.getScope(context, reference);
    }
    
    private IScope createHierarchicScope(EObject child){
    	if(child.eContainer()!=null){
    		IScope parentScope = createHierarchicScope(child.eContainer());
    		SimpleScope scope = new SimpleScope(parentScope, this.getElements(child));
    		return scope;
    	}
    	else{
    		return new SimpleScope(this.getElements(child));
    	}
    }
    
    @SuppressWarnings("unchecked")
	private Iterable<IEObjectDescription> getElements(EObject parent){
    	ArrayList<IEObjectDescription> elements = new ArrayList<IEObjectDescription>();
		if (parent != null && parent instanceof Region) {
			List<Signal> signals = ((Region) parent).getSignals();
			for (Signal signal : signals) {
				elements.add(new EObjectDescription(signal.getName(), signal, (Map<String, String>) Collections.EMPTY_MAP));
			}
			List<Variable> variables = ((Region) parent).getVariables();
			for (Variable variable : variables) {
				elements.add(new EObjectDescription(variable.getName(), variable, (Map<String, String>) Collections.EMPTY_MAP));
			}
		} else if (parent != null && parent instanceof State) {
			List<Signal> signals = ((State) parent).getSignals();
			for (Signal signal : signals) {
				elements.add(new EObjectDescription(signal.getName(), signal, (Map<String, String>) Collections.EMPTY_MAP));
			}
		}
		return elements;
    }   
}
