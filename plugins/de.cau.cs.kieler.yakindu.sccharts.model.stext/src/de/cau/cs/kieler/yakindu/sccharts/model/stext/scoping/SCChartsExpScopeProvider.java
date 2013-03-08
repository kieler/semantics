/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.yakindu.sct.model.sgraph.Declaration;
import org.yakindu.sct.model.stext.scoping.STextScopeProvider;

import com.google.common.collect.Lists;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.utils.SccUtils;
import de.itemis.xtext.utils.jface.viewers.ContextElementAdapter;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on
 * how and when to use it
 * 
 */
public class SCChartsExpScopeProvider extends STextScopeProvider {

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

	/**
	 * Returns a scope with all toplevel declarations of parent States
	 */
	@Override
	protected IScope getUnnamedTopLevelScope(final EObject context,
			EReference reference) {
		final ContextElementAdapter provider = (ContextElementAdapter) EcoreUtil
				.getExistingAdapter(context.eResource(),
						ContextElementAdapter.class);
		List<EObject> scopeCandidates = Lists.newArrayList();
		ArrayList<Declaration> declarations = SccUtils
				.getAncestorDeclarations(provider.getElement().eContainer());
		if (declarations.size() > 0) {
			scopeCandidates.addAll(declarations);
			return Scopes.scopeFor(scopeCandidates);
		} else {
			return IScope.NULLSCOPE;
		}
	}
}
