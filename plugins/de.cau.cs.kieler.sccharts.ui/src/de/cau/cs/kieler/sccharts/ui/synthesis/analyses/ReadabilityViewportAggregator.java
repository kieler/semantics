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

import java.util.List;

/**
 * @author mka
 *
 */
public class ReadabilityViewportAggregator implements IZLevelAggregator<Readability, Double, Double> {

    private double viewportArea;
    private double diagramArea;
    private double scaleLimit;
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Double aggregate(List<Readability> sampleables, double z) {
        int count = 0;
        for (Readability sampleable : sampleables) {
            if (sampleable.getZSample(z) >= 1.0) {
                count++;
            }
        }
        double readableProportion = (double) count / (double) sampleables.size();
//        System.out.println("z: " + z + " -> " + count + " / " + sampleables.size() + " = " + readableProportion);
        return readableProportion * viewportProportion(z);
    }
    
    private double viewportProportion(double z) {
        // proportions larger than 1 are meaningless, as it just means that the diagram is small, but the amount of
        // visible stuff remains the same
        double prop = Math.min(1.0, viewportArea / (diagramArea * zLevelToScale(z)));
        return prop;
    }
    
    private double zLevelToScale(double z) {
        if (scaleLimit > 1) {
            return z - scaleLimit * z + scaleLimit;
        } else {
            return -z + scaleLimit * z + 1;
        }
    }
    
    public ReadabilityViewportAggregator(double viewportArea, double diagramArea, double scaleLimit) {
        this.viewportArea = viewportArea;
        this.diagramArea = diagramArea;
        this.scaleLimit = scaleLimit;
    }
    
}
