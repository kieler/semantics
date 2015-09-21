/*  * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
package de.cau.cs.kieler.sccharts.klighd.deprecated

import com.google.inject.Inject
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.sccharts.Scope

/**
 * Main diagram synthesis for SCCharts.
 * 
 * @author als
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
@ViewSynthesisShared
class ComparisonSynthesis extends AbstractDiagramSynthesis<Scope> {
    
    @Inject 
    extension KNodeExtensions
           
    // -------------------------------------------------------------------------
    // The main entry transform function   
    override transform(Scope root) {
        val rootNode = createNode();
        
        //OLD
        val properties = new KlighdSynthesisProperties();
        properties.copyProperties(usedContext);
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS, "de.cau.cs.kieler.sccharts.klighd.DeprecatedSCChartsSynthesis");
        rootNode.children += LightDiagramServices::translateModel(root, usedContext, properties).children;

        //NEW
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS, "de.cau.cs.kieler.sccharts.klighd.synthesis.SCChartsSynthesis");
        rootNode.children += LightDiagramServices::translateModel(root, usedContext, properties).children;
        
        return rootNode;
    }
    
}
