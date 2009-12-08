package de.cau.cs.kieler.synccharts.labelparser.scoping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopedElement;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Variable;

public class ValuedObjectScope implements IScope {

	EObject parent;
	List<IScopedElement> scopedElements;

	public ValuedObjectScope(EObject parent) {
		this.parent = parent;
		this.scopedElements = new ArrayList<IScopedElement>();
		// State scopedState = parentState;
		// while(scopedState != null){
		if (this.parent != null && this.parent instanceof Region) {
			List<Signal> signals = ((Region) parent).getSignals();
			for (Signal signal : signals) {
				scopedElements.add(new ExternalScopedElement(signal, signal
						.getName()));
			}
			List<Variable> variables = ((Region) parent).getVariables();
			for (Variable variable : variables) {
				scopedElements.add(new ExternalScopedElement(variable, variable
						.getName()));
			}
		} else if (this.parent != null && this.parent instanceof State) {
			List<Signal> signals = ((State) parent).getSignals();
			for (Signal signal : signals) {
				scopedElements.add(new ExternalScopedElement(signal, signal
						.getName()));
			}
		}
		// if(scopedState.getParentRegion() != null)
		// scopedState = scopedState.getParentRegion().getParentState();
		// }
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtext.scoping.IScope#getAllContents()
	 */
	public Iterable<IScopedElement> getAllContents() {
		List<IScopedElement> elements = new ArrayList<IScopedElement>();
		elements.addAll(scopedElements);
		IScope outerScope = this.getOuterScope();
		while (!outerScope.equals(IScope.NULLSCOPE)) {
			elements.addAll((Collection<? extends IScopedElement>) outerScope
					.getContents());
			outerScope = outerScope.getOuterScope();
		}
		return elements;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtext.scoping.IScope#getContents()
	 */
	public Iterable<IScopedElement> getContents() {
		return scopedElements;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtext.scoping.IScope#getOuterScope()
	 */
	public IScope getOuterScope() {
		if (parent instanceof Region) {
			if (((Region) parent).getParentState() != null)
				return new ValuedObjectScope(((Region) parent).getParentState());
		} else if (parent instanceof State) {
			if (((State) parent).getParentRegion() != null)
				return new ValuedObjectScope(((State) parent).getParentRegion());
		}
		return IScope.NULLSCOPE;
	}

	class ExternalScopedElement implements IScopedElement {

		EObject object;
		String name;

		public ExternalScopedElement(EObject o, String n) {
			object = o;
			name = n;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.xtext.scoping.IScopedElement#additionalInformation()
		 */
		public Object additionalInformation() {
			return null;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.xtext.scoping.IScopedElement#element()
		 */
		public EObject element() {
			return object;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.xtext.scoping.IScopedElement#name()
		 */
		public String name() {
			return name;
		}

	}

	
	@Override
	public IScopedElement getContentByEObject(EObject object) {
		return null;
	}

	@Override
	public IScopedElement getContentByName(String name) {
		Iterable<IScopedElement> scopedElements =  this.getAllContents();
		for(IScopedElement item : scopedElements){
			if(item.name().equals(name)){
				return item;
			}
		}
		return null;
	}

}
