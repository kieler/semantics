/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.legacy.klighd.actions

import de.cau.cs.kieler.klighd.IAction.ActionContext
import de.cau.cs.kieler.klighd.actions.CollapseExpandAction
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.sccharts.legacy.sccharts.State

/**
 * This Action provides the normal collapse expand behavior for a reference {@link State} and
 * synthesizes the referenced diagram on the first expansion of the node.
 * 
 * @author ssm als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
class LegacyReferenceExpandAction extends CollapseExpandAction {

    /** The action id */
    public static val String ID = "de.cau.cs.kieler.sccharts.legacy.klighd.actions.ReferenceExpandAction"

    override execute(ActionContext context) {
        if (context.KNode.children.empty) {
            val modelElement = context.getDomainElement(context.KNode);
            if (modelElement instanceof State) {
                val state = modelElement as State;
                if (state.referencedScope != null) {
                    val diagram = LightDiagramServices.translateModel(
                        state.referencedScope,
                        context.viewContext
                    );
                    context.getKNode.children += diagram.children;
                }
            }

        }
        super.execute(context)
    }
}