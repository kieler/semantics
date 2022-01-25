package de.cau.cs.kieler.circuit.ui;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.circuit.ui.simulation.CircuitDiagramHighlighter;

public class CircuitUIModule extends AbstractUIPlugin {

    @Override
    public void start(BundleContext context) throws Exception {
        // FIXME magic registration
        CircuitDiagramHighlighter.create();
    }

}
