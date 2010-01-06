/*
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
 */

package de.cau.cs.kieler.krep.evalbench;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

//import de.cau.cs.kieler.krep.evalbench.comm.CommonLayer;
import de.cau.cs.kieler.krep.evalbench.trace.TraceList;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author ctr
 */
public final class Activator extends Plugin {

    /** The plug-in ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.krep.evalbench.base";

    /** The shared instance. */
    private static Activator plugin;

    /** The common layer for data exchange. */
 //   private CommonLayer commonLayer = new CommonLayer();

    /** current execution Trace. */
    private TraceList traces = new TraceList();

    /**
     * The constructor.
     */
    public Activator() {
        super();
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

    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        // initialize the common layer
 //       getCommonLayer().initialize();
    }

    @Override
    public void stop(final BundleContext context) throws Exception {
        // dispose the common layer
  //      getCommonLayer().dispose();
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

//    /**
//     * @param theCommonLayer
//     *            the commonLayer to set
//     */
//    public void setCommonLayer(final CommonLayer theCommonLayer) {
//        this.commonLayer = theCommonLayer;
//    }
//
//    /**
//     * @return the commonLayer
//     */
//    public CommonLayer getCommonLayer() {
//        return commonLayer;
//    }

}
