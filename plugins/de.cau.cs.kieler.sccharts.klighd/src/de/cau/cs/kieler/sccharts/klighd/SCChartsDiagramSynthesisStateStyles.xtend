package de.cau.cs.kieler.sccharts.klighd

import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.KRenderingFactory

class SCChartsDiagramSynthesisStateStyles {
	protected static final KRenderingFactory RENDERING_FACTORY = KRenderingFactory.eINSTANCE;
	
	protected static val KColor KEYWORD = RENDERING_FACTORY.createKColor() => [it.red = 115; it.green = 0; it.blue = 65];
	
    protected static val int MINIMALNODEWIDTH = 40
    protected static val int MINIMALNODEHEIGHT = 40

    protected static val int PORTFONTSIZE = 10
    protected static val int LABELFONTSIZE = 10
	
	
    protected static val KColor STATE_STARTGRADIENTCOLOR = RENDERING_FACTORY.createKColor() =>
        [it.red = 248; it.green = 249; it.blue = 253];
    protected static val KColor STATE_ENDGRADIENTCOLOR = RENDERING_FACTORY.createKColor() =>
        [it.red = 205; it.green = 220; it.blue = 243];	
}