/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd

import de.cau.cs.kieler.klighd.IAction.ActionContext
import de.cau.cs.kieler.klighd.actions.CollapseExpandAction
import de.cau.cs.kieler.klighd.LightDiagramServices

/**
 * @author ssm
 *
 */
class SCChartsReferenceExpandAction extends CollapseExpandAction {
    
    public static val String ID = "de.cau.cs.kieler.sccharts.klighd.SCChartsReferenceExpandAction"
    
    override execute(ActionContext context) {
        if (context.KNode.children.empty) {
            val regionVM = LightDiagramServices.translateModel(
                context.getDomainElement(context.KNode), context.viewContext
            );
            
            context.getKNode.children += regionVM.children;
        }
        super.execute(context)
    }
}