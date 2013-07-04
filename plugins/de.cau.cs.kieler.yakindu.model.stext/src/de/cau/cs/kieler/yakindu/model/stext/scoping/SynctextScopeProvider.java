/*
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
package de.cau.cs.kieler.yakindu.model.stext.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.yakindu.sct.model.sgraph.Scope;
import org.yakindu.sct.model.sgraph.State;
import org.yakindu.sct.model.sgraph.Statechart;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.yakindu.sct.model.sgraph.Declaration;
import org.yakindu.sct.model.sgraph.Scope;
import org.yakindu.sct.model.sgraph.State;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.stext.scoping.STextScopeProvider;
import org.yakindu.sct.model.stext.stext.InterfaceScope;
import org.yakindu.sct.model.stext.stext.InternalScope;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.yakindu.model.stext.utils.SyncUtils;
import de.itemis.xtext.utils.jface.viewers.ContextElementAdapter;

/**
 * This class extends the STextScopeProvider in order to load the list of top
 * level declarations. The declarations in the yakindu sct project can be read
 * from the text compartment. In the sync extended yakindu editors, the
 * declarations can be read from the parent regions.
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 * 
 */
public class SynctextScopeProvider extends STextScopeProvider {
	/**
	 * Allow only unnamed top level Scope. It returns a list of top level
	 * declarations (signals and variables of parent states)
	 * 
	 */
	@Override
	public IScope scope_ElementReferenceExpression_reference(
			final EObject context, EReference reference) {
		return new SimpleScope(getUnnamedTopLevelScope(context, reference)
				.getAllElements());
	}
//        public IScope scope_ElementReferenceExpression_reference(
//                final EObject context, EReference reference) {
//          return new SimpleScope(Iterables.concat(
//                  getUnnamedTopLevelScope(context, reference).getAllElements(),
//                  Scopes.scopeFor(typeSystemUtils.getEnumerationTypes(typeSystem)).getAllElements()));
//}	
	
//	    public IScope scope_ElementReferenceExpression_reference(final EObject context,
//	            final EReference reference) {
//	        return null; 
//	    }  	
	
	/**
	 * Returns a scope with all toplevel declarations of parent States
	 */
	@Override
	protected IScope getUnnamedTopLevelScope(final EObject context,
			EReference reference) {
		final ContextElementAdapter provider = (ContextElementAdapter) EcoreUtil
				.getExistingAdapter(context.eResource(),
						ContextElementAdapter.class);
	        Statechart statechart = getStatechart(context);
	        if (statechart == null) {
	                return IScope.NULLSCOPE;
	        }	        
		if (provider == null) {		
		    State state = (State) statechart.getRegions().get(0).getVertices().get(0);
		        EList<Scope> scopes = state.getScopes();
		        List<EObject> scopeCandidates = Lists.newArrayList();
		        for (Scope scope : scopes) {
                                scopeCandidates.addAll(scope.getDeclarations());
		        }
		        return Scopes.scopeFor(scopeCandidates);
		}
		
		List<EObject> scopeCandidates = Lists.newArrayList();
		ArrayList<Declaration> declarations = SyncUtils
				.getAncestorDeclarations(provider.getElement().eContainer());
		if (declarations.size() > 0) {
			scopeCandidates.addAll(declarations);
			return Scopes.scopeFor(scopeCandidates);
		} else {
			return IScope.NULLSCOPE;
		}
	}	
}
