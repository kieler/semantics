package de.cau.cs.kieler.scg.klighd;

import java.lang.reflect.Field;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.google.common.collect.Multimap;

import de.cau.cs.kieler.klighd.KlighdDataManager;
import de.cau.cs.kieler.klighd.internal.ISynthesis;
import de.cau.cs.kieler.scg.klighd.simulation.SCGDiagramHighlighter;
import de.cau.cs.kieler.scg.processors.add.ADDCFGWrapper;

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
