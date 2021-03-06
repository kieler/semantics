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
package de.cau.cs.kieler.sccharts.legacy.klighd.hooks;


import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Scopes;

import de.cau.cs.kieler.klighd.IAction;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.kgraph.KNode;
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared;
import de.cau.cs.kieler.sccharts.legacy.klighd.synthesis.SCChartsSynthesis;

/**
 * Normal {@link SynthesisHook} with additional {@link IAction} capability. If the action
 * should handle dynamic updates for {@link SynthesisOption} the ID must be set as in
 * {@link SynthesisOption.setUpdateAction}.
 * <p>
 * Any extending class must be double registered in the extension points. A klighd.action and
 * sccharts.hook.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 *
 */
public abstract class SynthesisActionHook extends SynthesisHook implements IAction {

    @Inject
    private SCChartsSynthesis parent;

    /** Injector for injecting member if this class was not injected (the action instance) */
    private static final Injector injector = Guice.createInjector(new Module() {

        @Override
        public void configure(Binder binder) {
            binder.bindScope(ViewSynthesisShared.class, Scopes.SINGLETON);
        }
    });

    // -------------------------------------------------------------------------
    // Action

    /**
     * This method performs the intended action on a diagram.
     *
     * @param rootNode
     *            the root node of the diagram.
     * @return an {@link ActionResult} providing {@link ILayoutConfig layout config(s)} to be
     *         incorporated while updating the layout after the action has been performed, as well
     *         as configurations of 'animateLayout', 'zoomToFit', etc.<br>
     *         Use {@link ActionResult#createResult(boolean, ILayoutConfig...)} for creation.
     */
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
        
        // set used view context
        parent.use(context.getViewContext());
        
        // invoke execution
        if (context.getKNode() != null) {
            return executeAction(context.getKNode());
        }
        
        return ActionResult.createResult(false);
    }

}
