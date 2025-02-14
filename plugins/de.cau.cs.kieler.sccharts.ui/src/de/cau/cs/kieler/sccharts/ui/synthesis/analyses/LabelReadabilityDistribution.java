/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2025 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.analyses;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.elk.core.options.CoreOptions;

import de.cau.cs.kieler.klighd.kgraph.KGraphData;
import de.cau.cs.kieler.klighd.kgraph.KNode;
import de.cau.cs.kieler.klighd.krendering.KContainerRendering;
import de.cau.cs.kieler.klighd.krendering.KText;

/**
 * Computes the inverse absolute scales for each label.
 * This is the magnification that is required to make the label
 * readable i.e. to render it at scale 1.
 */
public class LabelReadabilityDistribution {
    
    private static List<Double> inverseLabelScales(KNode node, double absoluteScale) {
        // collect number of KTexts that are at the current scale
        List<Double> labels = new ArrayList<>();
        for (KGraphData datum : node.getData()) {
            if (datum instanceof KText) {
                labels.add(1/absoluteScale);
            }
            if (datum instanceof KContainerRendering) {
                labels.addAll(traverseKGraphData((KContainerRendering) datum, absoluteScale));
            }
        }
        return labels;
    }
    
    private static List<Double> traverseKGraphData(KContainerRendering container, double absoluteScale) {
        List<Double> labels = new ArrayList<>();
        for (KGraphData datum : container.getChildren()) {
            if (datum instanceof KText) {
                labels.add(1/absoluteScale);
            }
            if (datum instanceof KContainerRendering) {
                labels.addAll(traverseKGraphData((KContainerRendering) datum, absoluteScale));
            }
        }
        return labels;
    }
    
    public static List<Double> computeScaleDistribution(KNode root) {
        return computeScaleDistribution(root, 1.0);
    }
    
    private static List<Double> computeScaleDistribution(KNode node, double absoluteScale) {
        List<Double> result = new ArrayList<>();
        result.addAll(inverseLabelScales(node, absoluteScale));
        for (KNode child : node.getChildren()) {
            result.addAll(computeScaleDistribution(child, absoluteScale * child.getProperty(CoreOptions.TOPDOWN_SCALE_FACTOR)));
        }
        return result;
    }

}
