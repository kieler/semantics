package de.cau.cs.kieler.scg.klighd;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import de.cau.cs.kieler.scg.klighd.simulation.SCGDiagramHighlighter;

public class SCGUIModule implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        // FIXME magic registration
        SCGDiagramHighlighter.create();
    }

    @Override
    public void stop(BundleContext context) throws Exception {
    }

}
