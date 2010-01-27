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

package de.cau.cs.kieler.sim.kiem.execution;

import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent;

import org.json.JSONObject;

/**
 * The Class ObserverExecution. This implements the behavior of an observer worker thread that
 * operates on one dedicated DataComponenet that is a pure observer. <BR>
 * <BR>
 * An observer not needs to get finished during one execution step but may be skipped when it not
 * finishes until it should be called in a consecutive execution step. <BR>
 * <BR>
 * It sleeps until it is called and indicates that it is ready for the next step with its done flag.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 proposed yellow
 * 
 */
public class ObserverExecution implements Runnable {

    /**
     * The done flag indicates that the DataComponent successfully finished its step.
     */
    private boolean done;

    /** The stop flag indicates that the thread should terminate. */
    private boolean stop;

    /** The data component that is affected. */
    private AbstractDataComponent dataComponent;

    /** The input data for the observer DataComponent. */
    private JSONObject data;

    /** The parent execution needed in case of raising errors. */
    private Execution parent;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new observer execution worker thread.
     * 
     * @param dataComponentParam
     *            the affected DataComponent
     * @param parentParam
     *            the parent execution
     */
    public ObserverExecution(final AbstractDataComponent dataComponentParam,
            final Execution parentParam) {
        this.stop = false;
        this.done = true;
        this.data = null;
        this.parent = parentParam;
        this.dataComponent = dataComponentParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Schedules a new step of the observer DataComponent. If the component is not ready yet then
     * false is returned. Otherwise the worker thread is awakened and true is returned.
     * 
     * @return true, if step is successfully scheduled
     */
    public synchronized boolean step() {
        // check if we already done
        if (!done) {
            // deadline missed
            // System.out.println("  SKIPPED - NOT READY YET");
            return false;
        } else {
            // System.out.println("  START - READY");
            // deadline met
            this.done = false;
            // awake this thread
            this.notify();
            return true;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the input JSON data for the observer DataComponent.
     * 
     * @param dataParam
     *            the input data
     */
    public void setData(final JSONObject dataParam) {
        this.data = dataParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Terminates the execution of this thread.
     */
    public void stopExecution() {
        this.stop = true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void run() {
        while (!this.stop) {
            // go to sleep
            try {
                synchronized (this) {
                    // now we got the result and are done
                    this.done = true;
                    // System.out.println("  "+dataComponent.getName() +
                    // " (Pure Observer) calc end");
                    if (done) {
                        this.wait();
                    }
                }
            } catch (Exception e) {
                parent.showError(null, this.dataComponent.getPluginId(), e);
            }

            try {
                // System.out.println("  "+dataComponent.getName() + " (Pure Observer) calc start");
                // do asynchronous call
                if (this.dataComponent instanceof JSONObjectDataComponent) {
                    JSONObjectDataComponent compJSON = (JSONObjectDataComponent) dataComponent;
                    // do not use any response data cause this is an
                    // observer only
                    try {
                        compJSON.step(this.data);
                    } catch (KiemExecutionException e) {
                        KiemPlugin.handleComponentError(dataComponent, e);
                    }
                } else {
                    JSONStringDataComponent compString = (JSONStringDataComponent) dataComponent;
                    // do not use any response data cause this is an
                    // observer only
                    try {
                        if (this.data != null) {
                            compString.step(this.data.toString());
                        } else {
                            compString.step(null);
                        }
                    } catch (KiemExecutionException e) {
                        KiemPlugin.handleComponentError(dataComponent, e);
                    }
                }
            } catch (Exception e) {
                parent.showWarning(null, this.dataComponent.getPluginId(), e);
            }

        } // next while not stop
    }

}
