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
package de.cau.cs.kieler.sim.kiem.automated.execution;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.ui.errorhandler.GenericErrorHandler.StatusListener;
import de.cau.cs.kieler.sim.kiem.IAutomatedComponent;
import de.cau.cs.kieler.sim.kiem.IAutomatedProducer;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.automated.KiemAutomatedPlugin;
import de.cau.cs.kieler.sim.kiem.automated.data.AbstractResult;
import de.cau.cs.kieler.sim.kiem.automated.data.IterationResult;
import de.cau.cs.kieler.sim.kiem.automated.data.IterationResult.ComponentResult;
import de.cau.cs.kieler.sim.kiem.automated.data.IterationResult.IterationStatus;
import de.cau.cs.kieler.sim.kiem.automated.execution.CancelManager.MonitorChecker;
import de.cau.cs.kieler.sim.kiem.automated.views.AutomatedEvalView;
import de.cau.cs.kieler.sim.kiem.automated.views.ExecutionFilePanel;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.data.Tools;
import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.ui.StepTextField;

/**
 * The manager for handling the actual execution. It dispatches the execution
 * job, sets up the result list and execution, initializes the DataComponents
 * and the execution, steps through until all components are finished and then
 * gathers results and terminates the execution.
 * 
 * @author soh
 * @kieler.rating 2010-02-01 proposed yellow
 */
public final class AutomationManager implements StatusListener {

    /** The singleton instance of the AutomationManager. */
    private static AutomationManager instance = null;

    /**
     * The panel where the currently running execution should display its
     * results.
     */
    private ExecutionFilePanel currentPanel;
    /** The results of the currently running execution. */
    private IterationResult currentResult;
    /** Holds the list of faulty results at the beginning of the execution file. */
    private List<IterationResult> cachedResults;

    /**
     * The list of all components that want to be notified when something
     * happens during the automated run.
     */
    private List<ExecutionListener> listeners;

    /**
     * The currently active worker thread for checking on timeout and monitor
     * status.
     */
    private MonitorChecker monitorChecker;

    /** The mutex for waiting while a step is processed. */
    private Semaphore stepDoneMutex;

    /** True if the execution is running, false if not. */
    private boolean running = false;

    /** The field for displaying the current step. */
    private StepTextField stepTextField;

    /** The monitor that is monitoring the progress of the current execution. */
    private IProgressMonitor monitor;

    /** Indicates that an error has occurred. */
    private boolean error = false;

    // --------------------------------------------------------------------------

    /** Singleton pattern. */
    private AutomationManager() {
        stepTextField = new StepTextField();
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the instance.
     * 
     * @return the instance.
     */
    public static synchronized AutomationManager getInstance() {
        if (instance == null) {
            instance = new AutomationManager();
        }
        return instance;
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the step text field.
     * 
     * @return the step text field
     */
    public StepTextField getStepTextField() {
        return stepTextField;
    }

    // --------------------------------------------------------------------------

    /**
     * Ask all components for the list of file extensions that they support.
     * 
     * @return the list of extensions
     */
    private List<String> askForSupportedFiles() {
        List<String> result = new LinkedList<String>();

        for (IAutomatedComponent comp : getRelevantComponents()) {
            String[] extensions = comp.getSupportedExtensions();

            if (extensions != null && !(extensions.length == 0)) {
                for (String extension : extensions) {
                    String s = (extension.startsWith(".") ? extension
                            .substring(1) : extension).trim();
                    if (!result.contains(s)) {
                        result.add(s);
                    }
                }
            }

        }

        return result;
    }

    /**
     * Ask all components if they want to perform more runs.
     * 
     * @return the number of additional runs
     */
    private int askForMoreRuns() {
        int result = 0;

        for (IAutomatedComponent comp : getRelevantComponents()) {
            result = Math.max(result, comp.wantsMoreRuns());
        }

        return result;
    }

    /**
     * Ask all components if they want to perform more steps.
     * 
     * @return the number of additional steps
     */
    private int askForMoreSteps() {
        int result = 0;

        for (IAutomatedComponent comp : getRelevantComponents()) {
            result = Math.max(result, comp.wantsMoreSteps());
        }

        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * Determine whether or not the execution manager is currently running an
     * automated execution.
     * 
     * @return true if the manager is running.
     */
    public boolean isRunning() {
        return running;
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Automated execution of a list of predefined schedules.
     * 
     * @param executionFiles
     *            the list of execution files
     * @param modelFiles
     *            the list of model files for which to run the execution
     * @param properties
     *            the list of properties that should be set
     * @param monitorParam
     *            the progress monitor
     * @return the list of results
     */
    protected List<IterationResult> doAutomatedExecution(
            final IPath[] executionFiles, final List<IPath> modelFiles,
            final List<KiemProperty> properties,
            final IProgressMonitor monitorParam) {
        // list of results for returning to calls by other plugins
        List<IterationResult> results = new LinkedList<IterationResult>();
        // set monitor
        this.monitor = monitorParam;
        CancelManager.getInstance().setMonitor(monitorParam);

        // set up monitor
        String taskName = "Performing automated execution.";
        int executionlength = executionFiles.length * modelFiles.size();
        if (executionlength == 1) {
            // can't show meaningful progress: show unknown
            monitor.beginTask(taskName, IProgressMonitor.UNKNOWN);
        } else {
            monitor.beginTask(taskName, executionlength);
        }

        // store the currently opened file.
        IPath currentFile = KiemPlugin.getDefault().getKIEMViewInstance()
                .getCurrentFile();

        // register as error listener to avoid pop-ups during run
        KiemAutomatedPlugin.addErrorListener(this);
        try {
            running = true;

            for (final IPath execution : executionFiles) {

                executeExecutionFile(modelFiles, properties, results, execution);

                if (CancelManager.getInstance().isExecutionCanceled()) {
                    CancelManager.getInstance().resetExecutionCancel();
                    break;
                }
            }

        } catch (RuntimeException e0) {
            // catch and throw exception, necessary to do wrap up
            throw e0;
        } finally {
            running = false;
            KiemAutomatedPlugin.removeErrorListener(this);
            monitor.done();
            if (currentFile != null) {
                try {
                    KiemPlugin.getDefault().openFile(currentFile, false);
                } catch (IOException e0) {
                    // couldn't restore file
                    Tools.showWarning("Couldn't restore file.", e0, false);
                }
            }

            refreshView();
        }
        return results;
    }

    /**
     * Execute one specific execution file.
     * 
     * @param modelFiles
     *            the list of model files
     * @param properties
     *            the list of properties
     * @param results
     *            the list of results
     * @param execution
     *            the path to the execution file
     */
    private void executeExecutionFile(final List<IPath> modelFiles,
            final List<KiemProperty> properties,
            final List<IterationResult> results, final IPath execution) {
        try {
            KiemPlugin.getDefault().openFile(execution, true);
        } catch (IOException e0) {
            // execution file not found, write to error log
            KiemPlugin.getDefault().showError("Execution file missing.",
                    KiemAutomatedPlugin.PLUGIN_ID, e0, true);
            return; // continue with next file
        }

        // load timeout here as execution file might carry his own timeout
        CancelManager.loadTimeout();
        // create a new table on the panel
        addExecutionFileToPanel(execution);

        // set up adding of results to the table
        cachedResults = new LinkedList<IterationResult>();
        boolean firstModelFirstRun = true;

        List<String> supportedFiles = askForSupportedFiles();

        for (IPath model : modelFiles) {

            if (supportedFiles.contains(model.getFileExtension().trim())) {
                firstModelFirstRun = executeModelFile(properties, results,
                        execution, firstModelFirstRun, model);
            }
            CancelManager.getInstance().resetModelFileCancel();

            // update progress
            monitor.worked(1);
            if (CancelManager.getInstance().isExecutionFileCanceled()) {
                CancelManager.getInstance().resetExecutionFileCancel();
                break;
            }
        }

        flushCachedResults();
    }

    // --------------------------------------------------------------------------

    /**
     * Execute one model file.
     * 
     * @param properties
     *            the list of properties
     * @param results
     *            the list of results
     * @param execution
     *            the execution file
     * @param firstModelFirstRun
     *            true if it is the first valid run on the first valid model
     * @param model
     *            the model file
     * @return true if the run was not valid
     */
    private boolean executeModelFile(final List<KiemProperty> properties,
            final List<IterationResult> results, final IPath execution,
            final boolean firstModelFirstRun, final IPath model) {
        boolean result = firstModelFirstRun;

        // the index of the current iteration
        int iteration = 0;

        // call to data components, notify once before first iteration
        notifyObservers(model, iteration, properties);
        int remainingRuns = askForMoreRuns();

        if (remainingRuns == 0) {
            // model didn't want any runs at all, cache the result
            IterationResult noRunsResult = new IterationResult(model
                    .toOSString(), 0);
            noRunsResult.setStatus(IterationStatus.DONE);
            cachedResults.add(noRunsResult);
        }

        while (remainingRuns-- > 0
                && !CancelManager.getInstance().isModelFileCanceled()) {

            // update progress
            monitor.subTask(execution.toOSString() + " : " + model.toOSString()
                    + " Iteration No. " + iteration + " ( at least "
                    + remainingRuns + " remaining )");
            currentResult = new IterationResult(model.toOSString(), iteration);
            results.add(currentResult);

            if (!result) {
                // add result to panel unless first run where table columns have
                // to be initialized
                addResultToPanel();
            }

            notifyObservers(model, iteration, properties);
            // execute
            executeIteration();

            if (currentResult.getStatus() != IterationStatus.ERROR) {
                if (CancelManager.getInstance().isIterationCanceled()) {
                    // user canceled the iteration
                    currentResult.setStatus(IterationStatus.ABORTED);
                    CancelManager.getInstance().resetIterationCancel();
                } else {
                    // iteration completed normally
                    currentResult.setStatus(IterationStatus.DONE);
                }
                if (result) {
                    // add after run to ensure that all columns
                    // contributed by producers are filled
                    addResultToPanel();
                    result = false;
                }
            } else {
                if (result) {
                    cachedResults.add(currentResult);
                }
            }

            // update the view through the display thread
            refreshView();

            if (remainingRuns == 0
                    && !CancelManager.getInstance().isModelFileCanceled()) {
                // estimated number of runs finished, ask again
                remainingRuns = askForMoreRuns();
            }

            iteration++;
        }

        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * Handles the execution of a single iteration.
     */
    private void executeIteration() {
        Execution exec = null;
        stepDoneMutex = new Semaphore(0);
        error = false;
        // start the thread for checking for timeouts, monitor canceling,...
        monitorChecker = new MonitorChecker();
        monitorChecker.start();

        try {
            KiemPlugin kIEMInstance = KiemPlugin.getDefault();

            // call to KIEM to initialize
            if (kIEMInstance.initExecution()) {
                waitForErrorHandler();

                currentResult.setStatus(IterationStatus.RUNNING);
                refreshView();
                exec = kIEMInstance.getExecution();

                // step until no component wants another step
                int remainingSteps = askForMoreSteps();
                while (remainingSteps-- > 0
                        && !CancelManager.getInstance().isIterationCanceled()) {
                    try {
                        // reset the timeout
                        monitorChecker.reset();

                        // call to KIEM for stepping
                        exec.stepExecutionSync();
                        waitForErrorHandler();
                        // wait for step done event to be dispatched
                        stepDoneMutex.acquire();
                    } catch (InterruptedException e0) {
                        e0.printStackTrace();
                    }

                    if (remainingSteps == 0
                            && !CancelManager.getInstance()
                                    .isIterationCanceled()) {
                        // ask components for another step or abort
                        remainingSteps = askForMoreSteps();
                    }
                }
            }
        } catch (RuntimeException e0) {
            // something bad happened, try to continue
            e0.printStackTrace();
            currentResult.setStatus(IterationStatus.ERROR);
        } catch (KiemExecutionException e0) {
            currentResult.setStatus(IterationStatus.ERROR);
        } finally {
            // setup results
            Execution execution = KiemAutomatedPlugin.getKiemExecution();

            if (execution != null) {
                currentResult.addResult(new KiemProperty("Finished on step",
                        execution.getSteps() + ""));
                getResultsFromProducers(currentResult);

                execution.stopExecutionSync();
            } else {
                // the execution somehow was terminated
                currentResult.setStatus(IterationStatus.ERROR);
            }
            monitorChecker.cancel();
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Add the execution file to the panel through the use of the display
     * thread.
     * 
     * @param executionFile
     *            the execution file to add
     */
    private void addExecutionFileToPanel(final IPath executionFile) {
        KiemAutomatedPlugin.getDisplay().syncExec(new Runnable() {

            /**
             * {@inheritDoc}
             */
            public void run() {
                AutomatedEvalView automatedView = KiemAutomatedPlugin
                        .getAutomatedEvalView();
                currentPanel = automatedView.addExecutionFile(executionFile);
            }
        });
    }

    /**
     * Add the result current Result to the panel by use of the display thread.
     */
    private void addResultToPanel() {
        flushCachedResults();
        KiemAutomatedPlugin.getDisplay().syncExec(new Runnable() {
            /**
             * {@inheritDoc}
             */
            public void run() {
                currentPanel.addResult(currentResult);
            }
        });
    }

    /**
     * Add any results that were not yet added to the results panel.
     */
    private void flushCachedResults() {
        KiemAutomatedPlugin.getDisplay().syncExec(new Runnable() {
            /**
             * {@inheritDoc}
             */
            public void run() {
                if (cachedResults != null && !cachedResults.isEmpty()) {
                    if (!cachedResults.contains(currentResult)) {
                        cachedResults.add(currentResult);
                    }
                    currentPanel.addResult(cachedResults);
                    cachedResults = new LinkedList<IterationResult>();
                }
            }
        });
    }

    // --------------------------------------------------------------------------

    /**
     * Automated execution of a list of predefined schedules.
     * 
     * @param schedules
     *            the list of schedules.
     * @param modelFiles
     *            the list of model files for which to run the execution
     * @param properties
     *            the list of properties that should be set
     * @param monitorParam
     *            the progress monitor
     * @return the list of results
     */
    protected List<IterationResult> doAutomatedExecution(
            final List<ScheduleData> schedules, final List<IPath> modelFiles,
            final List<KiemProperty> properties,
            final IProgressMonitor monitorParam) {

        // convert schedules to paths
        IPath[] paths = new IPath[schedules.size()];
        for (int i = 0; i < paths.length; i++) {
            paths[i] = schedules.get(i).getLocation();
        }

        return doAutomatedExecution(paths, modelFiles, properties, monitorParam);
    }

    // --------------------------------------------------------------------------

    /**
     * <p>
     * Trigger an execution with a list of execution files, a list of model
     * files and a list of properties. Each combination of execution and model
     * file will be stepped through until no component requests another step.
     * After that the execution will be stopped and move on to the next
     * combination unless one of the component requests that this combination is
     * run again.
     * </p>
     * <p>
     * This method is part of the KIEMAutos API and can be accessed from any
     * plugin.
     * </p>
     * <p>
     * The method will return asynchronously. Callers that want to be notified
     * of the results must register themselves as a listener on the instance of
     * the execution manager.
     * </p>
     * 
     * @param executionFiles
     *            the selected locations
     * @param modelFiles
     *            the model files
     * @param properties
     *            the properties
     */
    public void executeAsync(final IPath[] executionFiles,
            final List<IPath> modelFiles, final List<KiemProperty> properties) {

        AutomationJob job = new AutomationJob(executionFiles, modelFiles,
                properties);
        job.schedule();
    }

    /**
     * <p>
     * Trigger an execution with a list of schedules, a list of model files and
     * a list of properties. Each combination of execution and model file will
     * be stepped through until no component requests another step. After that
     * the execution will be stopped and move on to the next combination unless
     * one of the component requests that this combination is run again.
     * </p>
     * <p>
     * This method is part of the KIEMAutos API and can be accessed from any
     * plugin.
     * </p>
     * <p>
     * The method will return asynchronously. Callers that want to be notified
     * of the results must register themselves as a listener on the instance of
     * the execution manager.
     * </p>
     * 
     * @param selected
     *            the selected schedules
     * @param modelFiles
     *            the model files
     * @param properties
     *            the properties
     */
    public void executeAsync(final List<ScheduleData> selected,
            final List<IPath> modelFiles, final List<KiemProperty> properties) {

        // convert schedules to paths
        IPath[] array = new IPath[selected.size()];
        for (int i = 0; i < selected.size(); i++) {
            array[i] = selected.get(i).getLocation();
        }

        executeAsync(array, modelFiles, properties);
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the list of IAutomatedComponents that are currently registered
     * in the KIEM, enabled and want to interact with the automated execution.
     * 
     * @return the list of components
     */
    private List<IAutomatedComponent> getRelevantComponents() {
        List<IAutomatedComponent> result = new LinkedList<IAutomatedComponent>();

        for (DataComponentWrapper wrapper : KiemPlugin.getDefault()
                .getDataComponentWrapperList()) {
            if (wrapper.isEnabled()) {
                // only enabled components since others won't execute
                AbstractDataComponent comp = wrapper.getDataComponent();

                if (comp instanceof IAutomatedComponent) {
                    // only components that can actually interact with KIEMAuto
                    IAutomatedComponent autoComp = (IAutomatedComponent) comp;
                    result.add(autoComp);
                }
            }
        }

        return result;
    }

    /**
     * Provide the observers with all they information they need.
     * 
     * @param modelFile
     *            the model file
     * @param iteration
     *            the index of the current iteration
     * @param properties
     *            the list of custom properties
     */
    private void notifyObservers(final IPath modelFile, final int iteration,
            final List<KiemProperty> properties) {

        List<KiemProperty> list = new LinkedList<KiemProperty>();

        // add information to the property list
        list.add(new KiemProperty(IAutomatedComponent.MODEL_FILE, modelFile
                .toOSString()));
        list
                .add(new KiemProperty(IAutomatedComponent.ITERATION, iteration
                        + ""));

        for (KiemProperty prop : properties) {
            list.add(prop);
        }

        int size = list.size();

        // notify observers
        for (IAutomatedComponent comp : getRelevantComponents()) {
            try {
                comp.setParameters(list);
            } catch (KiemInitializationException e0) {
                // ignore and try to continue anyway with the rest of the
                // components
            }

        }

        if (list.size() > size) {
            // notify again in case one of the observers wrote something
            // into the list
            for (IAutomatedComponent comp : getRelevantComponents()) {
                try {
                    comp.setParameters(list);
                } catch (KiemInitializationException e0) {
                    // ignore and try to continue anyway with the rest of the
                    // components
                }
            }
        }

    }

    /**
     * Get the execution results from the list of IAutomatedProducers.
     * 
     * @param execResult
     *            the results of the execution run.
     */
    private void getResultsFromProducers(final AbstractResult execResult) {

        for (IAutomatedComponent comp : getRelevantComponents()) {

            if (comp instanceof IAutomatedProducer) {
                // filter out all producers
                IAutomatedProducer producer = (IAutomatedProducer) comp;
                // producers should be data components, get the name
                String name = ((AbstractDataComponent) comp).getName();

                ComponentResult result = new ComponentResult(name);
                execResult.addChild(result);

                result.setResults(producer.produceInformation());
            }
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Tell the execution manager that the execution was paused due to an error.
     */
    public void notifyOnErrorPause() {
        // TODO: determine semantics
    }

    /**
     * Tell the execution manager that the execution was stopped due to an
     * error.
     */
    public void notifyOnErrorStop() {
        // TODO: determine semantics
    }

    /**
     * Tell the execution manager that a step was processed and that the
     * execution can resume.
     */
    public void notifyOnStepFinished() {
        KiemAutomatedPlugin.getDisplay().asyncExec(new Runnable() {

            public void run() {
                Execution exec = KiemAutomatedPlugin.getKiemExecution();
                if (exec != null) {
                    stepTextField.updateTextfield(exec.getSteps() + "");
                } else {
                    stepTextField.updateTextfield(null);
                }
            }
        });

        // release the thread waiting in executeIteration()
        stepDoneMutex.release();
    }

    /**
     * Tell the execution manager that the user paused the execution.
     */
    public void notifyOnUserPause() {
        // TODO: determine semantics
    }

    /**
     * Tell the execution manager that the user stopped the execution.
     */
    public void notifyOnUserStop() {
        // TODO: determine semantics
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Refresh the view.
     */
    private void refreshView() {
        KiemAutomatedPlugin.getDisplay().syncExec(new Runnable() {
            /**
             * {@inheritDoc}
             */
            public void run() {
                currentPanel.refresh();
            }
        });
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public int reroute(final StatusAdapter statusAdapter, final int style) {
        String pluginId = statusAdapter.getStatus().getPlugin();

        // those are probably really bad... don't want to filter
        // furthermore those hopefully were not triggered due to the execution
        if (!pluginId.contains("org.eclipse")) {
            error = true;
            return StatusManager.LOG;
        }
        return StatusListener.DONT_CARE;
    }

    /**
     * Wait a few milliseconds in order for the error handler to catch up and
     * transmit an error if it happened.
     * 
     * @throws KiemExecutionException
     *             if an error happened
     */
    private void waitForErrorHandler() throws KiemExecutionException {
        try {
            Thread.sleep(CancelManager.DISPLACEMENT);
        } catch (InterruptedException e0) {
            e0.printStackTrace();
        }
        if (error) {
            error = false;
            throw new KiemExecutionException("Error", false, null);
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Add a new listener.
     * 
     * @param listener
     *            the listener to add
     */
    public void addListener(final ExecutionListener listener) {
        if (listeners == null) {
            listeners = new LinkedList<ExecutionListener>();
        }
        if (!listeners.contains(listener)) {
            listeners.add(listener);
        }
    }

    /**
     * Notify all observers that the execution has finished.
     * 
     * @param results
     *            the results of the execution
     */
    public void notifyExecutionFinished(final List<IterationResult> results) {
        if (listeners != null) {
            for (ExecutionListener listener : listeners) {
                listener.executionDone(results);
            }
        }
    }

    /**
     * Remove a listener.
     * 
     * @param listener
     *            the listener to remove
     */
    public void removeListener(final ExecutionListener listener) {
        if (listeners != null) {
            listeners.remove(listener);
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Interface for all components that are interested in the state of the
     * current execution.
     * 
     * @author soh
     * @kieler.rating 2010-02-08 proposed yellow
     */
    public static interface ExecutionListener {

        /**
         * This method is called as soon as the automated run finishes.
         * 
         * @param results
         *            the results of the run
         */
        void executionDone(List<IterationResult> results);

    }
}
