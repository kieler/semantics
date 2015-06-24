package de.cau.cs.kieler.sccharts.klighd

import java.util.List
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.KRenderingFactory

class SCChartsDiagramSynthesisTransitionStyles {
    private static final KRenderingFactory RENDERING_FACTORY = KRenderingFactory.eINSTANCE;    
    
    protected static val float TRANSITION_DASH_BLACK = 7;
    protected static val float TRANSITION_DASH_WHITE = 3;
    protected static val List<Float> TRANSITION_DASH_PATTERN = newArrayList(TRANSITION_DASH_BLACK, TRANSITION_DASH_WHITE);
    
    protected static val KColor HISTORYDECORATORCOLOR = RENDERING_FACTORY.createKColor() => [it.red = 60; it.green = 60; it.blue = 60];
}