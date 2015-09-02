/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd.hooks;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Scopes;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared;
import de.cau.cs.kieler.klighd.IAction;
import de.cau.cs.kieler.sccharts.klighd.synthesis.SCChartsSynthesis;

/**
 * Register as sccharts hook and action in klighd
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 *
 */
public abstract class SCChartsSynthesisActionHook extends SCChartsSynthesisHook implements IAction {

    @Inject
    private SCChartsSynthesis parent;
    
    private static final Injector injector = Guice.createInjector(new Module() {
        
        @Override
        public void configure(Binder binder) {
            binder.bindScope(ViewSynthesisShared.class, Scopes.SINGLETON);
        }
    });

    // -------------------------------------------------------------------------
    // Action

    abstract public ActionResult executeAction(KNode rootNode);

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResult execute(ActionContext context) {
        // inject members
        if (parent == null) {
            injector.injectMembers(this);
        }
        parent.use(context.getViewContext());
        if (context.getKNode() != null) {
            return executeAction(context.getKNode());
        }
        return ActionResult.createResult(false);
    }

}
