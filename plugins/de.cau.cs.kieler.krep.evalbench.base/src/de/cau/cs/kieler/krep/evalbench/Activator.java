/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/

package de.cau.cs.kieler.krep.evalbench;

import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.krep.evalbench.comm.CommonLayer;
import de.cau.cs.kieler.krep.evalbench.trace.TraceList;
import de.cau.cs.kieler.krep.evalbench.ui.views.AssemblerView;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author ctr
 */
public final class Activator extends AbstractUIPlugin implements IPageListener {

    /** The plug-in ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.krep.evalbench.base";

    /** The shared instance. */
    private static Activator plugin;

    /** The common layer for data exchange. */
    public CommonLayer commonLayer = new CommonLayer();

    /** The viewer to show the current program. */
    private AssemblerView viewer = null;

    /** current execution Trace. */
    private TraceList traces = new TraceList();

    /**
     * The constructor.
     */
    public Activator() {
        super();
    }

    /**
     * @return Viewer to display the current assembler.
     */
    public AssemblerView getViewer() {
        return viewer;
    }

    /**
     * @param v
     *            to display the assembler
     */
    public void setViewer(final AssemblerView v) {
        this.viewer = v;
    }

    /**
     * @return currently loaded traces
     */
    public TraceList getTraces() {
        return traces;
    }

    /**
     * @param t
     *            new list of traces
     */
    public void setTraces(final TraceList t) {
        this.traces = t;

    }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
     * )
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        // initialize the common layer
        commonLayer.initialize();
        // register as page listener
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().addPageListener(
                this);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
     * )
     */
    @Override
    public void stop(final BundleContext context) throws Exception {
        // dispose the common layer
        commonLayer.dispose();
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.ui.IPageListener#pageActivated(org.eclipse.ui.IWorkbenchPage)
     */
    public void pageActivated(final IWorkbenchPage page) {
        page.addPartListener(commonLayer);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.ui.IPageListener#pageClosed(org.eclipse.ui.IWorkbenchPage)
     */
    public void pageClosed(final IWorkbenchPage page) {
        // Nothing to do
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.ui.IPageListener#pageOpened(org.eclipse.ui.IWorkbenchPage)
     */
    public void pageOpened(final IWorkbenchPage page) {
        // Nothing to do
    }

}
