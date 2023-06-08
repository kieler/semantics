/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
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

import de.cau.cs.kieler.klighd.kgraph.KNode;

/**
 * Relative scale discrepancy looks at the max scale differences
 * between children of a node.
 * @author mka
 *
 */
public class RelativeScaleDiscrepancyEvaluator {
    
    private static double relativeScaleDiscrepancy(KNode parentNode) {
        double discrepancy;
        if (parentNode.getChildren().size() > 0) {
            double min_scale = Double.POSITIVE_INFINITY;
            double max_scale = Double.NEGATIVE_INFINITY;
            for (KNode child : parentNode.getChildren()) {
                // if child has own children, skip it
                if (child.getChildren().size() > 0) {
                    double scale = child.getProperty(CoreOptions.TOPDOWN_SCALE_FACTOR);
                    if (scale > max_scale) {
                        max_scale = scale;
                    }
                    if (scale < min_scale) {
                        min_scale = scale;
                    }
                }
            }
            if (min_scale > max_scale) {
                discrepancy = 0;
            } else {
                discrepancy = (max_scale / min_scale) - 1;
            }
        } else {
            discrepancy = 0;
        }
        return discrepancy;
    }
    
    public static List<Double> computeDiscrepancies(KNode root) {
        List<Double> result = new ArrayList<>();
        result.add(relativeScaleDiscrepancy(root));
        for (KNode child : root.getChildren()) {
            result.addAll(computeDiscrepancies(child));
        }
        return result;
    }

}
