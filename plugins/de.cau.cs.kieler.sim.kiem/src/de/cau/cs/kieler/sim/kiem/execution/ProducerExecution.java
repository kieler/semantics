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

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.extension.DataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

/**
 * The Class ProducerExecution. This implements the behavior of a producer worker thread that
 * operates on one dedicated DataComponenet that is a pure producer. <BR>
 * <BR>
 * A producer needs no input data and hence is called in the beginning of a step so that it has the
 * maximum time to concurrently compute its results. <BR>
 * <BR>
 * If a {@link #blockingStep()} is scheduled then the producer worker thread is awaked and can start
 * to compute data. When the method {@link #blockingWaitUntilDone()} is called, then this blocks
 * until the data is computed. <BR>
 * Note that this could also trigger a time out in the execution thread.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class ProducerExecution implements Runnable {

    /**
     * The done flag indicates that the DataComponent successfully finished its step.
     */
    private boolean done;

    /** The stop flag indicates that the thrad should terminate. */
    private boolean stop;

    /** The data component that is affected. */
    private DataComponent dataComponent;

    /** The output data of the producer DataComponent. */
    private JSONObject data;

    /** The parent execution needed in case of raising errors. */
    private Execution parent;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new producer execution worker thread.
     * 
     * @param dataComponentParam
     *            the affected DataComponent
     * @param parentParam
     *            the parent execution
     */
    public ProducerExecution(final DataComponent dataComponentParam, 
                             final Execution parentParam) {
        this.stop = false;
        this.done = false;
        this.data = null;
        this.parent = parentParam;
        this.dataComponent = dataComponentParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Schedule a (blocking) step. This will awake the execution ({@link #blockingWaitUntilDone()})
     * <B>AND</B> the waiting producer thread but only the producer thread will proceed, cause done
     * is guaranteed to be false!<BR>
     * The execution will fall asleep until the producer has finished doing its step.
     */
    public void blockingStep() {
        synchronized (this) {
            done = false;
            // this will awake the execution (blockinWaitUntilDone())
            // AND
            // the waiting producer thread
            // but only the producer thread will proceed, cause done
            // is guaranteed to be false!
            // the execution will fall asleep until the producer has
            // finished doing its step
            this.notifyAll();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Blocking wait until done. This method resumes only if the producer DataComponent is done (and
     * sleeping again).
     */
    public void blockingWaitUntilDone() {
        synchronized (this) {
            while (!this.done) {
                try {
                    // we pass the lock to someone else because
                    // we are still waiting for done to become true
                    this.notifyAll();
                    this.wait();
                } catch (Exception e) {
                    parent.showWarning(null, this.dataComponent.getPluginId(), e);
                }
            } // end while
        } // end synchronized
        // at this point done is true and we may reap the results now
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the JSON data that was produced by the producer DataComponent.
     * 
     * @return the produced data
     */
    public JSONObject getData() {
        return this.data;
    }

    // -------------------------------------------------------------------------

    /**
     * Terminates the execution of this thread.
     */
    public void stopExecution() {
        this.stop = true;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        while (!this.stop) {
            // caller step() must ensure that done == false (before)
            if (!done) {
                try {
                    synchronized (this) {
                        // now we got the result and are done
                        // so we set done to true to indicate that the results
                        // can be reaped
                        // while done is true we sleep and awake the
                        // execution (blockingWaitUntilDone()) possibly waiting
                        // it will return if done==true and being awakened
                        this.done = true;
                        // only proceed if done == false
                        // (hence blockingStep() was called)
                        while (this.done) {
                            this.notifyAll();
                            // at this point blockingWaitUntilDone() can return
                            this.wait();
                        }
                        // at this point we know that someone wants us
                        // to make a step and done is false
                    }
                } catch (Exception e) {
                    parent.showWarning(e.getMessage(), this.dataComponent.getConfigurationElement()
                            .getContributor().getName(), e);
                }

                // System.out.println("  "+dataComponent.getName() + " (Pure Producer) calc start");
                // do asynchronous call
                if (this.dataComponent instanceof JSONObjectDataComponent) {
                    JSONObjectDataComponent compJSON = (JSONObjectDataComponent) dataComponent;
                    // do not send any data cause this is a producer only
                    try {
                        this.data = compJSON.step(null);
                    } catch (KiemExecutionException e) {
                        KiemPlugin.getDefault().handleComponentError(dataComponent, e);
                    }
                } else {
                    JSONStringDataComponent compString = (JSONStringDataComponent) dataComponent;
                    // do not send any data cause this is a producer only
                    String jSONString = null;
                    try {
                        jSONString = compString.step(null);
                    } catch (KiemExecutionException e) {
                        KiemPlugin.getDefault().handleComponentError(dataComponent, e);
                    }
                    this.data = null;
                    if (jSONString != null && !jSONString.equals("")) {
                        try {
                            this.data = new JSONObject(jSONString);
                        } catch (Exception e) {
                            parent.showWarning(null, this.dataComponent.getPluginId(), e);
                        }
                    } // not null
                }
            } // end if not done

            // System.out.println("  "+dataComponent.getName() + " (Pure Producer) calc end");

        } // next while not stop
    }

}
