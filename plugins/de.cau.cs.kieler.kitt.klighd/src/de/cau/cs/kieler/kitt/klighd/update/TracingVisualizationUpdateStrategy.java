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
package de.cau.cs.kieler.kitt.klighd.update;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.kitt.klighd.tracing.TracingProperties;
import de.cau.cs.kieler.kitt.klighd.tracing.TracingSynthesisOption;
import de.cau.cs.kieler.kitt.klighd.tracing.TracingSynthesisOption.TracingMode;
import de.cau.cs.kieler.kitt.klighd.tracing.internal.TracingVisualizer;
import de.cau.cs.kieler.klighd.IUpdateStrategy;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy;

/**
 * @author als
 * @kieler.design 2014-08-19 proposed
 * @kieler.rating 2014-08-19 proposed yellow
 * 
 */
public class TracingVisualizationUpdateStrategy implements IUpdateStrategy {

    private SimpleUpdateStrategy simpleDelegate = new SimpleUpdateStrategy();

    /**
     * {@inheritDoc}
     */
    public int getPriority() {
        return 100;
    }

    /**
     * {@inheritDoc}
     */
    public boolean requiresDiagramSynthesisReRun(ViewContext viewContext) {
        SynthesisOption option = TracingSynthesisOption.getSynthesisOption();
        // Assumption: DisplayedSynthesisOptions are already loaded into ViewContext on configuring
        if (viewContext.getDisplayedSynthesisOptions().contains(option)) {
            // Assumption: SynthesisOptions are preset earlier and there is at most one option
            // changed to its previous state
            TracingMode mode =
                    TracingSynthesisOption.getOptionMode(viewContext.getOptionValue(option));
            if (mode != viewContext.getProperty(TracingProperties.TRACING_VISUALAIZATION_MODE)) {
                return false;
            } else {
                return true;
            }
        } else {
            return simpleDelegate.requiresDiagramSynthesisReRun(viewContext);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void update(KNode baseModel, KNode newModel, ViewContext viewContext) {
        if (baseModel != newModel) {
            simpleDelegate.update(baseModel, newModel, viewContext);
        }
        
        SynthesisOption option = TracingSynthesisOption.getSynthesisOption();
        // Assumption: DisplayedSynthesisOptions are already loaded into ViewContext on configuring
        if (viewContext.getDisplayedSynthesisOptions().contains(option)) {
            // Assumption: SynthesisOptions are preset earlier and there is at most one option
            // changed to its previous state
            TracingMode mode =
                    TracingSynthesisOption.getOptionMode(viewContext.getOptionValue(option));
            TracingVisualizer.enableVisualization(mode, baseModel, viewContext);
            viewContext.setProperty(TracingProperties.TRACING_VISUALAIZATION_MODE, mode);
        } else {
            viewContext.setProperty(TracingProperties.TRACING_MAP, null);
        }
    }
}
