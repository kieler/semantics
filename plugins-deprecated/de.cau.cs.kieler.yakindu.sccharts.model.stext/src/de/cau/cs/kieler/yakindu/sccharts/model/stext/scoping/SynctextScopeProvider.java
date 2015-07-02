/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.scoping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.yakindu.sct.model.sgraph.Declaration;
import org.yakindu.sct.model.sgraph.Scope;
import org.yakindu.sct.model.sgraph.State;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.stext.scoping.STextScopeProvider;
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression;

import com.google.common.collect.Lists;
import com.google.inject.Singleton;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.utils.SyncUtils;
import de.itemis.xtext.utils.jface.viewers.ContextElementAdapter;

/**
 * This class extends the STextScopeProvider in order to load the list of top level declarations.
 * The declarations in the yakindu sct project can be read from the text compartment. In the sync
 * extended yakindu editors, the declarations can be read from the parent regions.
 * 
 * @author wah, cmot, chsch
 * @kieler.rating green 2013-04-13
 * 
 */
// It is important to use a Singleton so that every call results in retrieving the same
// objects.
@Singleton
public class SynctextScopeProvider extends STextScopeProvider {

    /**
     * Sets the creates the dummy scopes flag. This can be used to serialize parts of the (xtext
     * based) model such as transition triggers or transition effects.
     * 
     * @param dymmyScope
     *            the new creates the dummy scopes
     */
    public void setCreateDummyScopes(final boolean dymmyScope) {
        this.dummyScope = dymmyScope;
    }

    /** The dymmy scope flag. */
    private boolean dummyScope = false;

    /**
     * Allow only unnamed top level Scope. It returns a list of top level declarations (signals and
     * variables of parent states).
     * 
     */
    @Override
    public IScope scope_ElementReferenceExpression_reference(final EObject context,
            EReference reference) {
        IScope scope;
        if (!dummyScope) {
            // This is the normal case where we fall back to creating a full SimpleScope
            // with all references
            scope = new SimpleScope(getUnnamedTopLevelScope(context, reference).getAllElements());
        } else {
            // This special case is necessary for serializing transition trigger and effects
            // when the serializer tries to find the scopes for the elements within such
            // triggers/effects.
            scope = Scopes.scopeFor(Collections.singleton(((ElementReferenceExpression) context)
                    .getReference()));
        }
        return scope;
    }

    /**
     * Returns a scope with all toplevel declarations of parent States.
     */
    @Override
    protected IScope getUnnamedTopLevelScope(final EObject context, EReference reference) {
        final ContextElementAdapter provider = (ContextElementAdapter) EcoreUtil
                .getExistingAdapter(context.eResource(), ContextElementAdapter.class);
        if (context == null) {
            return IScope.NULLSCOPE;
        }
        // Explicit resolve
        EcoreUtil.resolve(reference, reference.eResource()); 
        EcoreUtil.resolve(context, context.eResource()); 
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
        ArrayList<Declaration> declarations = SyncUtils.getAncestorDeclarations(provider
                .getElement().eContainer());
        if (declarations.size() > 0) {
            scopeCandidates.addAll(declarations);
            return Scopes.scopeFor(scopeCandidates);
        } else {
            return IScope.NULLSCOPE;
        }
    }
}
