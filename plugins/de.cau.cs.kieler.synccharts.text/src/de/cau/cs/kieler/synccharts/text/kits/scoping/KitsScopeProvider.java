package de.cau.cs.kieler.synccharts.text.kits.scoping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import de.cau.cs.kieler.core.expressions.Expression;
import de.cau.cs.kieler.core.expressions.Signal;
import de.cau.cs.kieler.core.expressions.Variable;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class KitsScopeProvider extends AbstractDeclarativeScopeProvider {

    @SuppressWarnings("unchecked")
	public IScope getScope(EObject context, EReference reference) {
//		System.out.println(context.eClass().getName() + "  " + reference.getName());
		
    	if (context instanceof Transition) {
    		List<State> states = ((Region) ((Transition) context).eContainer().eContainer()).getInnerStates();
    		List<IEObjectDescription> stateDescriptions = new LinkedList<IEObjectDescription>(); 
    		for(State state : states) {
    			stateDescriptions.add(new EObjectDescription(state.getLabel(), state, Collections.EMPTY_MAP));
    		}
    		return new SimpleScope(stateDescriptions);
    	}
    	
    	if (context instanceof Expression) {
    		return createHierarchicScope(((Expression) context));
    	}
//    	if (context instanceof SignalReference) {
//    		return createHierarchicScope(((SignalReference) context));
//    	}
//		if (context instanceof Emission) {
//			return createHierarchicScope(((Emission) context));
//    	}

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
    
    private Iterable<IEObjectDescription> getElements(EObject parent){
    	ArrayList<IEObjectDescription> elements = new ArrayList<IEObjectDescription>();
		if (parent != null && parent instanceof Region) {
			List<Signal> signals = ((Region) parent).getSignals();
			for (Signal signal : signals) {
				elements.add(new EObjectDescription(signal.getName(), signal, Collections.EMPTY_MAP));
			}
			List<Variable> variables = ((Region) parent).getVariables();
			for (Variable variable : variables) {
				elements.add(new EObjectDescription(variable.getName(), variable, Collections.EMPTY_MAP));
			}
		} else if (parent != null && parent instanceof State) {
			List<Signal> signals = ((State) parent).getSignals();
			for (Signal signal : signals) {
				elements.add(new EObjectDescription(signal.getName(), signal, Collections.EMPTY_MAP));
			}
		}
		return elements;
    }   
}
