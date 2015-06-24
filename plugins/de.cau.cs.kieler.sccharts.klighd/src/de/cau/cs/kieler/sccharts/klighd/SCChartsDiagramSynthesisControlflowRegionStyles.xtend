package de.cau.cs.kieler.sccharts.klighd

import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.KColor

class SCChartsDiagramSynthesisControlflowRegionStyles {
    private static final KRenderingFactory RENDERING_FACTORY = KRenderingFactory.eINSTANCE;
    
    protected static val KColor REGION_BACKGROUNDGRADIENTEND = RENDERING_FACTORY.createKColor() =>
        [it.red = 240; it.green = 240; it.blue = 240];
}