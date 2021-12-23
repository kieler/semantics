package de.cau.cs.kieler.scg.klighd;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import de.cau.cs.kieler.scg.klighd.simulation.SCGDiagramHighlighter;
import de.cau.cs.kieler.simulation.ui.visualization.KlighdPiccoloDiagramHighlightingHandler;

public class SCGUIModule implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        // FIXME magic registration
        KlighdPiccoloDiagramHighlightingHandler.createAndStartHighlighter(SCGDiagramHighlighter.class);
    }

    @Override
    public void stop(BundleContext context) throws Exception {
    }

}
