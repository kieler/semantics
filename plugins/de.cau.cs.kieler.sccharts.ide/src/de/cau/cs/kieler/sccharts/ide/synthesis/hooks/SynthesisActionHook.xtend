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
package de.cau.cs.kieler.sccharts.ide.synthesis.hooks

import com.google.inject.Binder
import com.google.inject.Guice
import com.google.inject.Scopes
import com.google.inject.TypeLiteral
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.IAction.ActionContext
import de.cau.cs.kieler.klighd.IAction.ActionResult
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.ISynthesis
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.syntheses.ReinitializingDiagramSynthesisProxy

/** 
 * Normal {@link SynthesisHook} with additional {@link IAction} capability. If the action
 * should handle dynamic updates for {@link SynthesisOption} the ID must be set as in{@link SynthesisOption.setUpdateAction}.
 * <p>
 * Any extending class must be double registered in the extension points. A klighd.action and sccharts.hook.
 * 
 * @author als ssm
 */
@SuppressWarnings("restriction")
abstract class SynthesisActionHook extends SynthesisHook implements IAction {
    
    // -------------------------------------------------------------------------
    // Action
    /** 
     * This method performs the intended action on a diagram.
     * @param rootNodethe root node of the diagram.
     * @return an {@link ActionResult} providing {@link ILayoutConfig layout config(s)} to be
     * incorporated while updating the layout after the action has been performed, as well
     * as configurations of 'animateLayout', 'zoomToFit', etc.<br>
     * Use {@link ActionResult#createResult(boolean, ILayoutConfig)} for creation.
     */
    def abstract ActionResult executeAction(KNode rootNode)

    /** 
     * {@inheritDoc}
     */
    override ActionResult execute(ActionContext context) {
        // inject members
        if (parent === null) {
            Guice.createInjector([ Binder binder |
                var ISynthesis synthesis = context.getViewContext().getDiagramSynthesis() // als magic
                if (synthesis instanceof ReinitializingDiagramSynthesisProxy<?>) {
                    binder.bind(new TypeLiteral<AbstractDiagramSynthesis<?>>() {
                    }).to(
                        (((synthesis as ReinitializingDiagramSynthesisProxy<?>)).getDelegate().
                            getClass() as Class<? extends AbstractDiagramSynthesis<?>>))
                } else {
                    binder.bind(new TypeLiteral<AbstractDiagramSynthesis<?>>() {
                    }).to((synthesis.getClass() as Class<? extends AbstractDiagramSynthesis<?>>))
                }
                binder.bindScope(ViewSynthesisShared, Scopes.SINGLETON)
            ]).injectMembers(this)
        }
        // set used view context
        parent.use(context.getViewContext())
        // invoke execution
        if (context.getKNode() !== null) {
            return executeAction(context.getKNode())
        }
        return ActionResult.createResult(false)
    }
}
