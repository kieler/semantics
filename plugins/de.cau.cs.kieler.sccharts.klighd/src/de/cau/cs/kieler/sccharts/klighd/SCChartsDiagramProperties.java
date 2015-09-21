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
package de.cau.cs.kieler.sccharts.klighd;

import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.core.properties.Property;
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter;

/**
 * This class holds the the public properties available for SCCharts diagrams.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@SuppressWarnings("restriction")
public final class SCChartsDiagramProperties {
    /**
     * Prevent Instantiation.
     */
    private SCChartsDiagramProperties() {
    }

    /** The {@link SourceModelTrackingAdapter} set on a diagram when synthesis finished */
    public static final IProperty<SourceModelTrackingAdapter> MODEL_TRACKER =
            new Property<SourceModelTrackingAdapter>("de.cau.cs.kieler.sccharts.klighd.tracker",
                    null);
}
