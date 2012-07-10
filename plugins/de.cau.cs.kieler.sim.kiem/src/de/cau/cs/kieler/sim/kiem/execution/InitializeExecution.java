/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem.execution;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.Messages;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.internal.EventManager;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;

/**
 * This implements the concurrent initialization that can be aborted from outside e.g. by user
 * cancellation.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de, soh
 * @kieler.rating 2009-01-15 proposed yellow
 * 
 */
public class InitializeExecution implements Runnable {

    /** The initializing flag. */
    private boolean initializing;

    /** The cancel initializing flag. */
    private boolean cancelInitialize;

    /** The successful flag. */
    private boolean successful;

    private KiemPlugin kIEMInstance;

    private EventManager eventManager;
    private Execution execution;
    private List<DataComponentWrapper> dataComponentWrapperList;

    // -------------------------------------------------------------------------

    /**
     * The constructor for initializing an execution.
     * 
     * @param kIEMInstanceParam
     *            the kiem instance
     */
    public InitializeExecution(final KiemPlugin kIEMInstanceParam) {
        this.kIEMInstance = kIEMInstanceParam;
        eventManager = this.kIEMInstance.getEventManager();
        execution = this.kIEMInstance.getExecution();
        dataComponentWrapperList = this.kIEMInstance.getDataComponentWrapperList();
        initializing = true;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether initializing is true.
     * 
     * @return true, if is initializing
     */
    public boolean isInitializing() {
        return initializing;
    }

    // -------------------------------------------------------------------------

    /**
     * Cancel the initialization.
     */
    public void cancelInitialization() {
        successful = false;
        initializing = false;
        cancelInitialize = true;
    }

    // -------------------------------------------------------------------------

    /**
     * Returns true, if last initialization was successful.
     * 
     * @return true, if successful
     */
    public boolean wasSuccessful() {
        return successful;
    }

    // -------------------------------------------------------------------------

    /**
     * Clean up before exit.
     */
    private void cleanUpBeforeExit(final boolean wasSucessfull) {
        successful = wasSucessfull;
        if (this.kIEMInstance.getInitializeExecution() == this) {
            // only notify if this is the last (or only) initialize execution
            if (eventManager != null) {
                eventManager.notify(new KiemEvent(KiemEvent.ENABLE_UI));
            }
        }
        initializing = false;
    }

    // -------------------------------------------------------------------------

    /**
     * Initializes the Execution. This is one of the heart-methods of this plug-in. It does the
     * following tasks: <BR>
     * <BR>
     * (1) Check if there are any (enabled) DataProducers or DataConsumers.<BR>
     * (2) Check if all DataComponent's properties are set correctly<BR>
     * (3) Grab all interface variables provided by the DataComponents.<BR>
     * (4) Distribute the union of all the variables to all DataComponents.<BR>
     * (5) Initialize the DataComponents<BR>
     * (6) Create an run the Execution thread<BR>
     * <BR>
     * This method returns true if the execution is successfully initialized or if the execution
     * thread already exists, hence the {@link #execution} is not null.
     * 
     */
    public void run() {
        this.cancelInitialize = false;
        this.initializing = true;

        if (eventManager != null) {
            eventManager.notify(new KiemEvent(KiemEvent.DISABLE_UI));
        }

        if (!testNumberOfProducersObservers()) {
            cleanUpBeforeExit(false);
            return;
        }

        if (!this.cancelInitialize && (!testForKiemPropertyError())) {
            cleanUpBeforeExit(false);
            return;
        }

        JSONObject globalInitialVariables = new JSONObject();
        try {
            globalInitialVariables = distributeInitialKeys();
        } catch (Exception e) {
            cleanUpBeforeExit(false);
            return;
        }

        if (!this.cancelInitialize && !initializeDataComponents()) {
            cleanUpBeforeExit(false);
            return;
        }

        if (!this.cancelInitialize) {
            // now create and run the execution thread
            try {
                Execution newExecution = new Execution(dataComponentWrapperList, eventManager);
                if (newExecution != null) {
                    this.kIEMInstance.setExecution(newExecution);
                }
            } catch (Exception e) {
                // non-successful exit
                cleanUpBeforeExit(false);
                return;
            }
            // get the new set execution (if previously there where no errors)
            execution = this.kIEMInstance.getExecution();
            // take the last set delay
            execution.setAimedStepDuration(this.kIEMInstance.getAimedStepDuration());
            // initialize the dataPool with this data
            try {
                execution.getDataPool().putData(globalInitialVariables);
            } catch (JSONException e) {
                // this should not happen
                e.printStackTrace();
            }

            execution.schedule();
        }

        cleanUpBeforeExit(true);
        return;
    }

    // -------------------------------------------------------------------------

    private boolean testNumberOfProducersObservers() {
        // count all (enabled) data producer and observer
        int countEnabledProducer = 0;
        int countEnabledObserver = 0;
        for (int c = 0; c < dataComponentWrapperList.size(); c++) {
            DataComponentWrapper dataComponentWrapper = dataComponentWrapperList.get(c);
            if (dataComponentWrapper.isEnabled()) {
                if (dataComponentWrapper.isProducer()) {
                    countEnabledProducer++;
                }
                if (dataComponentWrapper.isObserver()) {
                    countEnabledObserver++;
                }
            } // end if enabled
        } // next c
        if (countEnabledProducer < 1) {
            if (eventManager != null) {
                eventManager.notify(new KiemEvent(KiemEvent.ENABLE_UI));
            }
            this.kIEMInstance.showError(Messages.mErrorNoDataProducer, KiemPlugin.PLUGIN_ID, null,
                    false);
            return false;
        } else if (countEnabledObserver < 1) {
            if (eventManager != null) {
                eventManager.notify(new KiemEvent(KiemEvent.ENABLE_UI));
            }
            this.kIEMInstance.showError(Messages.mErrorNoDataObserver, KiemPlugin.PLUGIN_ID, null,
                    false);
            return false;
        }
        return true;
    }

    // -------------------------------------------------------------------------

    private boolean testForKiemPropertyError() {
        // now check if properties are OK hence no KiemPropertyError is thrown
        for (int c = 0; c < dataComponentWrapperList.size(); c++) {
            DataComponentWrapper dataComponentWrapper = dataComponentWrapperList.get(c);
            KiemProperty[] properties = dataComponentWrapper.getProperties();
            try {
                if (dataComponentWrapper.isEnabled()) {
                    dataComponentWrapper.checkProperties(properties);
                }
            } catch (Exception e) {
                boolean silent = false;
                if (e instanceof KiemPropertyException) {
                    silent = ((KiemPropertyException) e).isSilent();
                }
                this.kIEMInstance.showError(null, dataComponentWrapper.getDataComponent()
                        .getConfigurationElement().getContributor().getName(), e, silent);
                return false;
            }
        }
        return true;
    }

    // -------------------------------------------------------------------------

    private JSONObject distributeInitialKeys() throws Exception {
        JSONObject globalInitialVariables = new JSONObject();
        // get all InitialValues from (enabled) data producer
        // and combine them into globalInitialVariables
        for (int c = 0; c < dataComponentWrapperList.size(); c++) {
            DataComponentWrapper dataComponentWrapper = dataComponentWrapperList.get(c);
            if (dataComponentWrapper.isEnabled()) {
                try {
                    JSONObject localInitialVariables = dataComponentWrapper
                            .provideInitialVariables();
                    if (localInitialVariables != null) {
                        JSONMerger jsonMerger = new JSONMerger();
                        JSONObject merged = jsonMerger.mergeObjects(globalInitialVariables,
                                localInitialVariables);
                        globalInitialVariables = merged;
                    } // end if not null
                } catch (Exception e) {
                    KiemPlugin.handleComponentError(dataComponentWrapper.getDataComponent(), e);
                    throw e;
                }
            } // if enabled
        } // next c

        // distribute union of globalInitialVariables to all enabled components
        for (int c = 0; c < dataComponentWrapperList.size(); c++) {
            DataComponentWrapper dataComponentWrapper = dataComponentWrapperList.get(c);
            if (dataComponentWrapper.isEnabled()) {
                dataComponentWrapper.setInitialVariables(globalInitialVariables);
            } // end if enabled
        } // next c

        return globalInitialVariables;
    }

    // -------------------------------------------------------------------------

    private boolean initializeDataComponents() {
        // initialize all (enabled) data producer and Observer
        for (int c = 0; c < dataComponentWrapperList.size(); c++) {
            // if canceled from outside
            if (this.cancelInitialize) {
                return false;
            }
            DataComponentWrapper dataComponentWrapper = dataComponentWrapperList.get(c);
            if (dataComponentWrapper.isEnabled()) {
                try {
                    dataComponentWrapper.getDataComponent().initialize();
                } catch (Exception e) {
                    e.printStackTrace();
                    KiemPlugin.handleComponentError(dataComponentWrapper.getDataComponent(), e);
                    return false;
                }
            } // end if enabled
        } // next c
        return true;
    }

}
