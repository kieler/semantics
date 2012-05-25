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

package de.cau.cs.kieler.sim.kiem;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//import org.eclipse.osgi.service.debug.DebugOptions;
//import org.eclipse.osgi.framework.debug.FrameworkDebugOptions;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISaveablePart2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.statushandlers.IStatusAdapterConstants;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Bundle;
import org.eclipse.core.runtime.FileLocator;
import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.execution.InitializeExecution;
import de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.internal.EventManager;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;

/**
 * This activator class controls the life cycle of the KiemPlugin. It also provides the access to
 * the one and only instance of this class and hence a way to access the execution thread. For the
 * execution thread it allows to access the KiemView for updating or refreshing the table or the
 * step information text field.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de, soh
 * @kieler.rating 2009-01-15 yellow
 * 
 */
public class KiemPlugin extends AbstractUIPlugin {

    /** The Constant DEBUG. */
    public static final boolean DEBUG = !System.getProperty("java.vm.info", "").contains("sharing");

    /**
     * The Constant AIMED_STEP_DURATION_DEFAULT. Default value of the AimedStepDuration text field
     * in ms.
     */
    public static final int AIMED_STEP_DURATION_DEFAULT = 2000;

    /**
     * The Constant AIMED_STEP_DURATION_MIN. Minimum value of the AimedStepDuration text field in
     * ms.
     */
    public static final int AIMED_STEP_DURATION_MIN = 1;

    /**
     * The Constant AIMED_STEP_DURATION_MAX. Maximum value of the AimedStepDuration text field in
     * ms.
     */
    public static final int AIMED_STEP_DURATION_MAX = 3600000;

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.kiem";

    /** The identifier for the aimed step duration. */
    public static final String AIMED_STEP_DURATION_ID = "AIMED_STEP_DURATION";

    /** The identifier for the timeout. */
    public static final String TIMEOUT_ID = "TIMEOUT";

    /** The Constant SLEEPTIME for a sync method spinlock. */
    public static final int SLEEPTIME = 100;

    /** The shared instance. */
    private static KiemPlugin plugin;

    /**
     * The parent shell iff a GUI is used. This shell may be used to prompt a save-dialog to save
     * execution files. UI's should listen to the KiemEvent CALL_FOR_SHELL and then call the method
     * setShell() of KiemPlugin.
     */
    private static Shell parentShell;

    /** List of available dataProducers and dataObservers. */
    private List<AbstractDataComponent> dataComponentList;

    /** List of selected dataComponentWrapper's (modified by KiemView). */
    private List<DataComponentWrapper> dataComponentWrapperList;

    /** Execution object. */
    private Execution execution;

    /** Current value of the aimed step duration in ms. */
    private int aimedStepDuration;

    /** The event manager to handle notification of DataComponents. */
    private EventManager eventManager;

    /** The current master DataComponent if any. */
    private DataComponentWrapper currentMaster;

    /** True iff table or properties where modified. */
    private boolean isDirty;

    /** The currently opened file if any, null otherwise. */
    private IPath currentFile;

    /** The initialize execution task. */
    private InitializeExecution initializeExecution;

    /** The no error output. */
    private boolean forceNoErrorOutput = false;

    // -------------------------------------------------------------------------

    /**
     * The constructor if the KIEM plug-in. A default DataComponentWrapperList is created. It
     * contains all DataComponents in the default order ( {@link #getDefaultComponentWrapperList()}
     * ). The execution is null by default. The KIEMViewInstance is set, in the constructor of the.
     * 
     * @see de.cau.cs.kieler.sim.kiem.ui.views.KiemView
     */
    public KiemPlugin() {
        // dataComponentList = this.getRegisteredDataComponentList();
        // By default an empty list
        // dataComponentWrapperList = getDefaultComponentWrapperList();
        dataComponentWrapperList = new LinkedList<DataComponentWrapper>();
        updateEventManager();
        execution = null;
        aimedStepDuration = AIMED_STEP_DURATION_DEFAULT;
        this.currentMaster = null;
        this.currentFile = null;
        initializeExecution = null;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the parent shell that KIEM shoudl use to display user dialogs.
     * 
     * @param parentShellParam
     *            the new shell
     */
    public void setShell(final Shell parentShellParam) {
        if (parentShellParam != null) {
            KiemPlugin.parentShell = parentShellParam;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Update event manager's DataComponentWrapper list.
     */
    public void updateEventManager() {
        if (eventManager == null) {
            // create and fill the event manager
            eventManager = new EventManager();
        }
        for (int c = 0; c < this.dataComponentWrapperList.size(); c++) {
            DataComponentWrapper dataComponentWrapper = this.dataComponentWrapperList.get(c);
            eventManager.add(dataComponentWrapper);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the execution. The use of this method is only recommended for remote controlling KIEM.
     * 
     * @return the execution
     */
    public Execution getExecution() {
        return this.execution;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the execution. The use of this method is only recommended for remote controlling KIEM.
     * 
     * @param executionParam
     *            the execution param
     */
    public void setExecution(final Execution executionParam) {
        this.execution = executionParam;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // -------------------------------------------------------------------------

    /**
     * Returns the shared instance of the KIEM plug-in. This is mainly used by the execution thread
     * to access the view of the KIELER Execution Manager or the other way round.
     * 
     * @return the one and only shared instance of this KIEM plug-in
     */
    public static KiemPlugin getDefault() {
        return plugin;
    }

    // -------------------------------------------------------------------------

    /**
     * Opens an Execution File (*.execution) and tries to update the dataComponentWrapperList
     * according to this file. If the components or properties loaded do not exist in the
     * environment (e.g., the according plug-ins where not loaded) then an error message will bring
     * this to the user's attention. <BR>
     * <BR>
     * This method can be called from another plug-in and is part of the KIEM API.
     * 
     * @param executionFile
     *            the execution file to open
     * @param pluginID
     *            the id of the plugin where the file is located
     * @param readOnly
     *            the readonly flag indicates that the file is locked for writing
     * 
     * @throws IOException
     *             if the file was not found
     */
    public void openFile(final IPath executionFile, final String pluginID, final boolean readOnly)
            throws IOException {
        Bundle bundle = Platform.getBundle(pluginID);
        if (bundle != null) {
            String path = executionFile.toOSString();
            path = path.substring(path.indexOf("."));
            path = path.substring(path.indexOf(System.getProperty("file.separator")));
            IPath execFile = Path.fromOSString(path);

            URL url = FileLocator.find(bundle, execFile, null);
            url = FileLocator.resolve(url);
            if (url != null) {
                openFile(execFile, readOnly, url.openStream());
            } else {
                throw new IOException("File " + executionFile.toOSString() + " not found.");
            }
        } else {
            throw new IOException("Bundle " + pluginID + " not found.");
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Opens an Execution File (*.execution) and tries to update the dataComponentWrapperList
     * according to this file. If the components or properties loaded do not exist in the
     * environment (e.g., the according plug-ins where not loaded) then an error message will bring
     * this to the user's attention. <BR>
     * <BR>
     * This method is called from the KiemProxyEditor that acts as a proxy for passing the
     * editoInput from the Workbench to the KiemView.
     * 
     * @param editorInput
     *            the file editor input to open
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public void openFile(final IEditorInput editorInput) throws IOException {
        if (!(editorInput instanceof IFileEditorInput)) {
            throw new IOException("Invalid Input: Must be IFileEditorInput");
        }

        IPath executionFile = ((IFileEditorInput) editorInput).getFile().getFullPath();
        try {
            openFile(executionFile, false);
        } catch (IOException e0) {
            // most likely can't happen
            e0.printStackTrace();
        }
    }

    /**
     * Opens an Execution File (*.execution) and tries to update the dataComponentWrapperList
     * according to this file. If the components or properties loaded do not exist in the
     * environment (e.g., the according plug-ins where not loaded) then an error message will bring
     * this to the user's attention. <BR>
     * <BR>
     * This method can be called from another plug-in and is part of the KIEM API.
     * 
     * @param executionFile
     *            the execution file to open
     * @param readOnly
     *            the readonly flag indicates that the file is locked for writing
     * 
     * @throws IOException
     *             if the file was not found
     */
    public void openFile(final IPath executionFile, final boolean readOnly) throws IOException {
        String fileString = executionFile.toOSString();

        if (fileString.contains("bundleentry")) {
            String urlPath = fileString.replaceFirst("bundleentry:/", "bundleentry://");
            URL pathUrl = new URL(urlPath);
            URL url2 = FileLocator.resolve(pathUrl);
            openFile(executionFile, readOnly, url2.openStream());
        } else {
            URI fileURI = URI.createPlatformResourceURI(fileString, true);
            // resolve relative workspace paths
            URIConverter uriConverter = new ExtensibleURIConverterImpl();
            openFile(executionFile, readOnly, uriConverter.createInputStream(fileURI));
        }
    }

    /**
     * Opens an Execution File (*.execution) and tries to update the dataComponentWrapperList
     * according to this file. If the components or properties loaded do not exist in the
     * environment (e.g., the according plug-ins where not loaded) then an error message will bring
     * this to the user's attention. <BR>
     * <BR>
     * This method can be called from another plug-in and is part of the KIEM API.
     * 
     * @param executionFile
     *            the execution file to open
     * @param readOnly
     *            the readonly flag indicates that the file is locked for writing
     * @param inputStream
     *            the input stream
     */
    /**
     * Open a file from a given InputStream.
     * 
     * @param executionFile
     *            the path to the file
     * @param readOnly
     *            true if the file is read only
     * @param inputStream
     *            the input stream to the file
     */
    private void openFile(final IPath executionFile, final boolean readOnly,
            final InputStream inputStream) {
        Display.getDefault().syncExec(new Runnable() {
            @SuppressWarnings("unchecked")
            public void run() {
                // probe if execution is running
                if (execution != null) {
                    (new Thread(new Runnable() {
                        public void run() {
                            // stop any running execution
                            KiemPlugin.getDefault().execution.abortExecutionAsync();
                        }
                    })).start();
                    showError(Messages.mErrorOpenDuringExecution, PLUGIN_ID, null, true);
                    // return;
                }

                // ask for a shell
                if (eventManager != null) {
                    eventManager.notify(new KiemEvent(KiemEvent.CALL_FOR_SHELL));
                }

                // FIXME: scheduling problem, race condition possible!

                // if no one provided a shell or the user does'nt have changes to save...
                if (KiemPlugin.parentShell == null
                        || promptToSaveOnClose(KiemPlugin.parentShell) == ISaveablePart2.NO) {
                    boolean loadSuccessful = false;
                    // safely clear (w/ calling DataComponent destructors)
                    clearDataComponentWrapperList();
                    // temporary list only
                    List<DataComponentWrapper> dataComponentWrapperListTemp = null;
                    // try to load the components into a temporary list
                    try {
                        ObjectInputStream in = new ObjectInputStream(inputStream);
                        Object object;
                        try {
                            object = in.readObject();
                            if (object instanceof List<?>) {
                                dataComponentWrapperListTemp = (List<DataComponentWrapper>) object;
                            }
                        } catch (ClassNotFoundException e) {
                            showError(null, null, e, false);
                            // e.printStackTrace();
                        }
                        in.close();

                        inputStream.close();

                        // restore (full) DataComponentWrapperList from
                        // temporary list, this for example contains
                        // no component because these are transient
                        // and not serializable
                        if (dataComponentWrapperListTemp != null) {
                            restoreDataComponentWrapperList(dataComponentWrapperListTemp);
                        }
                        loadSuccessful = true;
                    } catch (IOException e) {
                        showError(null, null, e, false);
                        e.printStackTrace();
                    }
                    if (eventManager != null) {
                        // update the KiemView table
                        eventManager.notify(new KiemEvent(KiemEvent.VIEW_REFRESH));
                        // reset the KIEM view (in cases it hangs because
                        // of faulty components)
                        eventManager.notify(new KiemEvent(KiemEvent.ENABLE_UI));
                    }
                    // update the current file, dirty flag
                    setCurrentFile(executionFile);
                    checkForSingleEnabledMaster(false);
                    setDirty(false);
                    if (loadSuccessful) {
                        if (eventManager != null) {
                            eventManager.notify(new KiemEvent(KiemEvent.LOAD, executionFile));
                        }
                        // if the file is read-only, then set current file to
                        // null
                        // this ensures that the save-as dialog will popup
                        // whenever the
                        // user clicks to save the schedule
                        if (readOnly) {
                            setCurrentFile(null);
                        }
                    }
                }
            }
        });
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the file name (without possible extension) of the currently opened file, if any, or
     * "noname" otherwise.
     * 
     * @return the active project name
     */
    public String getActiveProjectName() {
        try {
            IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getActivePage();
            String name = page.getActiveEditor().getEditorInput().getName();
            int i = name.indexOf(".");
            if (i > -1) {
                name = name.substring(0, i);
            }
            return name;
        } catch (Exception e) {
            return "noname";
        }
    }

    // -------------------------------------------------------------------------
    /**
     * Sets the current file.
     * 
     * @param currentFileParam
     *            the new currently opened file
     */
    public void setCurrentFile(final IPath currentFileParam) {
        this.currentFile = currentFileParam;
    }

    // -------------------------------------------------------------------------
    /**
     * Prompt to save on close if the current file was modified (is dirty).
     * 
     * @param parentShellParam
     *            the parent shell
     * @return an int value indicating the users decision
     */
    public int promptToSaveOnClose(final Shell parentShellParam) {
        this.setShell(parentShellParam);
        if (this.isDirty()) {
            String fileName = "noname.execution";
            if (KiemPlugin.getDefault().getCurrentFile() != null) {
                fileName = KiemPlugin.getDefault().getCurrentFile().toFile().getName();
            }

            // FIXME: Is there a default dialog for this?
            String[] buttons = { "Yes", "No", "Cancel" };

            MessageDialog dlg = new MessageDialog(parentShell, "Save Execution", null, "'"
                    + fileName + "' has been modified. Save changes?", MessageDialog.QUESTION,
                    buttons, 2);

            int answer = -1;
            try {
                answer = dlg.open();
            } catch (Exception e) {
                answer = -1; // implicit NO on exception
            }

            if (answer == 0) { // YES
                // try to save or open saveas dialog
                this.doSave(null, parentShellParam);
                // check is saved
                if (this.isDirty()) {
                    // user has not saved (e.g. canceled saving)
                    return ISaveablePart2.CANCEL;
                } else {
                    // user has saved, its safe to close view
                    return ISaveablePart2.NO;
                }
            } else if (answer == 1) { // NO
                return ISaveablePart2.NO;
            }
            // CANCEL
            return ISaveablePart2.CANCEL;
        } else {
            return ISaveablePart2.NO;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the current file.
     * 
     * @return the current file
     */
    public IPath getCurrentFile() {
        return this.currentFile;
    }

    // -------------------------------------------------------------------------
    /**
     * Gets the current master.
     * 
     * @return the current file
     */
    public DataComponentWrapper getCurrentMaster() {
        return this.currentMaster;
    }

    // -------------------------------------------------------------------------

    /**
     * Check for single enabled master. This is just a wrapper for the method
     * 
     * @param silent
     *            if true, the warning dialog will be suppressed
     *            {@link #checkForSingleEnabledMaster(boolean, DataComponentWrapper)}.
     */
    public void checkForSingleEnabledMaster(final boolean silent) {
        checkForSingleEnabledMaster(silent, null);
    }

    // -------------------------------------------------------------------------

    /**
     * Check the current selection (enabled DataComponentWrappers) for a just a single enabled
     * master. If any second enabled master is found it will be disabled and the user is notified
     * with a warning dialog - depending on the silent-flag.
     * 
     * @param silent
     *            if true, the warning dialog will be suppressed
     * @param dataComponentWrapper
     *            the DataComponentWrapper that is allowed to be the master or null
     */
    public void checkForSingleEnabledMaster(final boolean silent,
            final DataComponentWrapper dataComponentWrapper) {
        currentMaster = null;
        if (dataComponentWrapper != null && dataComponentWrapper.isMaster()
                && dataComponentWrapper.isEnabled()) {
            // preset NEW selection
            currentMaster = dataComponentWrapper;
        }

        for (int c = 0; c < getDataComponentWrapperList().size(); c++) {
            DataComponentWrapper dataComponentTemp = this.getDataComponentWrapperList().get(c);
            dataComponentTemp.getDataComponent().masterSetKIEMInstance(null);

            if (dataComponentTemp.isMaster() && dataComponentTemp.isEnabled()
                    && dataComponentTemp != currentMaster) {
                if (currentMaster == null) {
                    currentMaster = dataComponentTemp;
                } else {
                    if (!silent) {
                        showWarning(Messages.mWarningAtMostOneMaster.replace("%COMPONENTNAME",
                                dataComponentTemp.getName()));
                    }
                    // disable it//
                    dataComponentTemp.setEnabled(false);
                    // if this method is called during initial loading
                    // then we do not want to set the dirty flag
                    if (!silent) {
                        setDirty(true);
                    }
                    this.updateViewAsync();
                }
            }
        }
        if (currentMaster != null) {
            currentMaster.getDataComponent().masterSetKIEMInstance(this);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Notify all configuration providers that a property in the currently loaded configuration has
     * changed.
     * 
     * author: soh
     * 
     * @param propertyId
     *            the id of the property.
     * @param value
     *            the value of the property.
     */
    public void notifyConfigurationProviders(final String propertyId, final String value) {
        IConfigurationElement[] contributors = Platform.getExtensionRegistry()
                .getConfigurationElementsFor("de.cau.cs.kieler.sim.kiem.configurationProvider");

        for (IConfigurationElement element : contributors) {
            try {
                IKiemConfigurationProvider contributor = (IKiemConfigurationProvider) (element
                        .createExecutableExtension("class"));

                contributor.propertyChanged(propertyId, value);
            } catch (CoreException e0) {
                // class attribute not found, throw exception and
                // proceed with next listener
                e0.printStackTrace();
            }
        }
    }

    /**
     * Get a new property value from one of the configuration providers. Will get the first value of
     * any provider that doesn't throw an exception when the request is made.
     * 
     * author: soh
     * 
     * @param propertyId
     *            the id of the property to look for
     * @return the new value of the property
     */
    public String getPropertyValueFromProviders(final String propertyId) {
        IConfigurationElement[] contributors = Platform.getExtensionRegistry()
                .getConfigurationElementsFor("de.cau.cs.kieler.sim.kiem.configurationProvider");

        String result = null;
        for (IConfigurationElement element : contributors) {
            try {
                IKiemConfigurationProvider contributor = (IKiemConfigurationProvider) (element
                        .createExecutableExtension("class"));

                result = contributor.changeProperty(propertyId);
                break;
            } catch (CoreException e0) {
                // class attribute not found, throw exception and
                // proceed with next listener
                e0.printStackTrace();
            } catch (KiemPropertyException e0) {
                // property not found, skip to next contributor
                break;
            }
        }

        return result;
    }

    /**
     * Get a new property value from one of the configuration providers. Will get the first value of
     * any provider that doesn't throw an exception when the request is made.
     * 
     * author: soh
     * 
     * @param propertyId
     *            the id of the property to look for
     * @return the new value of the property
     */
    public Integer getIntegerValueFromProviders(final String propertyId) {
        Integer result = null;
        String value = getPropertyValueFromProviders(propertyId);
        if (value != null) {
            try {
                result = Integer.parseInt(value);
            } catch (NumberFormatException e0) {
                // do nothing
            }
        }
        return result;
    }

    /**
     * Get a new property value from one of the configuration providers. Will get the first value of
     * any provider that doesn't throw an exception when the request is made.
     * 
     * author: soh
     * 
     * @param propertyId
     *            the id of the property to look for
     * @return the new value of the property
     */
    public Boolean getBooleanValueFromProviders(final String propertyId) {
        Boolean result = null;
        String value = getPropertyValueFromProviders(propertyId);
        if (value != null) {
            try {
                result = Boolean.parseBoolean(value);
            } catch (RuntimeException e0) {
                // do nothing
            }
        }
        return result;
    }

    // -------------------------------------------------------------------------

    /**
     * Updates the view of the KiemView table asynchronously. This method is used to update the
     * KiemView table from within the execution thread.
     */
    public void updateViewAsync() {
        if (eventManager != null) {
            // update the KiemView table
            eventManager.notify(new KiemEvent(KiemEvent.VIEW_REFRESH));
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the currently set aimed step duration.
     * 
     * author: soh
     * 
     * @return the aimed step duration
     */
    public int getAimedStepDuration() {
        int result = this.aimedStepDuration;
        Integer value = getIntegerValueFromProviders(AIMED_STEP_DURATION_ID);
        if (value != null) {
            result = value;
        }
        return result;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the aimed step duration. This method sets the aimed step duration and also passes-on the
     * value to the execution thread if that exists.
     * 
     * author: soh
     * 
     * @param aimedStepDurationi
     *            the new aimed step duration
     */
    public void setAimedStepDuration(final int aimedStepDurationi) {
        this.aimedStepDuration = aimedStepDurationi;
        // if executing, also update current delay
        if (execution != null) {
            this.execution.setAimedStepDuration(aimedStepDuration);
        }
        this.updateViewAsync();
        notifyConfigurationProviders(AIMED_STEP_DURATION_ID, aimedStepDurationi + "");
    }

    // -------------------------------------------------------------------------

    // /**
    // * Extracts the selection of the Project Explorer. This method is not
    // * used in the current implementation but may be used in the future.
    // *
    // */
    // public IResource extractSelection(ISelection sel) {
    // if (!(sel instanceof IStructuredSelection))
    // return null;
    // IStructuredSelection ss = (IStructuredSelection) sel;
    // Object element = ss.getFirstElement();
    // if (element instanceof IResource)
    // return (IResource) element;
    // if (!(element instanceof IAdaptable))
    // return null;
    // IAdaptable adaptable = (IAdaptable)element;
    // Object adapter = adaptable.getAdapter(IResource.class);
    // return (IResource) adapter;
    // }

    // -------------------------------------------------------------------------

    /**
     * Tries to restore the data component list. If an item was not found it will be deleted and an
     * error message is shown.
     * 
     * @param dataComponentWrapperListParam
     *            a temporary (partial) DataComponentWrapperList to restore the full one from
     */
    private void restoreDataComponentWrapperList(
            final List<DataComponentWrapper> dataComponentWrapperListParam) {
        List<AbstractDataComponent> dataComponentListTmp = getRegisteredDataComponentList();

        for (int c = 0; c < dataComponentWrapperListParam.size(); c++) {
            DataComponentWrapper dataComponentWrapper = dataComponentWrapperListParam.get(c);
            String componentId = dataComponentWrapper.getComponentId();
            KiemProperty[] properties = dataComponentWrapper.getProperties();

            boolean componentRestored = false;

            for (int cc = 0; cc < dataComponentListTmp.size(); cc++) {
                AbstractDataComponent dataComponent = dataComponentListTmp.get(cc);
                String vglComponentId = dataComponent.getDataComponentId();

                if (vglComponentId.equals(componentId)) {
                    // restore KIEM property type first
                    if (properties != null) {
                        KiemProperty[] defaultProperties = dataComponent.getProperties();
                        for (int ccc = 0; ccc < properties.length; ccc++) {
                            try {
                                if (ccc < dataComponent.getProperties().length) {
                                    properties[ccc].setType(defaultProperties[ccc].getType());
                                    // if a property asks for restoring its default value
                                    // then omit the loaded value for this property
                                    if (properties[ccc].isRestoreToDefaultOnLoad()) {
                                        properties[ccc].setValue(defaultProperties[ccc].getValue());
                                    }
                                }
                            } catch (Exception e) {
                                // warnings with unusable properties can
                                // only occur if this is intended, i.e., the
                                // component id calculation was modified!
                                e.printStackTrace();
                            }
                        }
                    }
                    // we found the component ... now restore it
                    DataComponentWrapper addedDataComponentWrapper = this
                            .addTodataComponentWrapperList(dataComponent);
                    // set the loaded properties
                    addedDataComponentWrapper.setProperties(properties);
                    // set enabled disabled
                    addedDataComponentWrapper.setEnabled(dataComponentWrapper.isEnabled());
                    // everything restored correctly
                    componentRestored = true;
                    break;
                } // end if
            } // next cc

            if (!componentRestored) {
                this.showWarning(Messages.mWarningLoadingDataComponentProperty.replace(
                        "%COMPONENTNAME", componentId), null, null, false);
            } // end if - failed

        } // next c

        // Update the event managers wrapper list
        updateEventManager();
    }

    // -------------------------------------------------------------------------

    /**
     * This initializes the DataComponentList with all registered and loaded plug-ins that extend
     * the following two extension points:<BR>
     * - {@link de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent}<BR>
     * - {@link de.cau.cs.kieler.sim.kiem.JSONStringDataComponent}<BR>
     * If a DataComponent is registered but cannot be instantiated because of an error this will
     * result in a warning only so that all other fully functional DataComponents are still loaded.
     * This method remembers its list thru the whole life-cycle of this plug-in and always returns
     * the same list. All DataComponents that cannot be instantiated due to errors will not occur in
     * the list.
     * 
     * @return the DataComponentList
     */
    public List<AbstractDataComponent> getRegisteredDataComponentList() {
        if (dataComponentList != null) {
            // return a cached version of the list
            // it is only built the first time
            return dataComponentList;
        }
        // suggest calling the garbage collector: this may
        // remove any DataComponent threads still running (but not
        // linked==needed any more)
        System.gc();
        // get the available interfaces and initialize them
        IConfigurationElement[] jsonComponents = Platform.getExtensionRegistry()
                .getConfigurationElementsFor(Messages.extensionPointIDjsoncomponent);

        IConfigurationElement[] stringComponents = Platform.getExtensionRegistry()
                .getConfigurationElementsFor(Messages.extensionPointIDstringcomponent);

        dataComponentList = new ArrayList<AbstractDataComponent>(jsonComponents.length
                + stringComponents.length);

        for (int i = 0; i < jsonComponents.length; i++) {
            try {
                if (DEBUG) {
                    System.out.println("KIEM loading component: "
                            + jsonComponents[i].getContributor().getName());
                }
                JSONObjectDataComponent dataComponent = (JSONObjectDataComponent) jsonComponents[i]
                        .createExecutableExtension("class");
                dataComponent.setConfigurationElemenet(jsonComponents[i]);
                dataComponentList.add(dataComponent);
                String currentComponentID = jsonComponents[i].getAttribute("id");
                if (currentComponentID != null) {
                    dataComponent.setCurrentComponentID(currentComponentID);
                } else {
                    showWarning("Extension id not configured for component: "
                            + jsonComponents[i].getContributor().getName(), KiemPlugin.PLUGIN_ID,
                            null, true);
                }
            } catch (Exception e) {
                // throw new RuntimeException
                // ("Error at loading a KIEM data component plugin");
                this.showWarning(Messages.mWarningLoadingDataComponent.replace("%COMPONENTNAME",
                        jsonComponents[i].getContributor().getName()), null, e, true);
            }
        }
        for (int i = 0; i < stringComponents.length; i++) {
            try {
                if (DEBUG) {
                    System.out.println("KIEM loading component: "
                            + stringComponents[i].getContributor().getName());
                }
                JSONStringDataComponent dataComponent = (JSONStringDataComponent) stringComponents[i]
                        .createExecutableExtension("class");
                dataComponent.setConfigurationElemenet(stringComponents[i]);
                dataComponentList.add(dataComponent);
                String currentComponentID = stringComponents[i].getAttribute("id");
                if (currentComponentID != null) {
                    dataComponent.setCurrentComponentID(currentComponentID);
                } else {
                    showWarning("Extension id not configured for component: "
                            + jsonComponents[i].getContributor().getName(), KiemPlugin.PLUGIN_ID,
                            null, true);
                }
                // System.out.println(dataComponent.getName());
            } catch (Exception e) {
                // throw new RuntimeException
                // ("Error at loading a KIEM data component plugin");
                this.showWarning(Messages.mWarningLoadingDataComponent.replace("%COMPONENTNAME",
                        stringComponents[i].getContributor().getName()), null, e, true);
            }
        }
        return dataComponentList;
    }

    // -------------------------------------------------------------------------

    /**
     * Do save method that can be called from outside (e.g., a user interface view).
     * 
     * @param monitor
     *            the monitor
     * @param parentShellParam
     *            the parent shell
     */
    public void doSave(final IProgressMonitor monitor, final Shell parentShellParam) {
        KiemPlugin.getDefault().setShell(parentShellParam);
        if (KiemPlugin.getDefault().getCurrentFile() == null) {
            this.doSaveAs(parentShell);
            return;
        }
        try {
            URI fileURI = URI.createPlatformResourceURI(KiemPlugin.getDefault().getCurrentFile()
                    .toOSString(), true);

            // resolve relative workspace paths
            URIConverter uriConverter = new ExtensibleURIConverterImpl();
            OutputStream outputStream = uriConverter.createOutputStream(fileURI);
            ObjectOutputStream out = new ObjectOutputStream(outputStream);

            out.writeObject(KiemPlugin.getDefault().getDataComponentWrapperList());

            out.close();
            outputStream.close();

            if (KiemPlugin.getDefault().getEventManager() != null) {
                KiemPlugin.getDefault().getEventManager()
                        .notify(new KiemEvent(KiemEvent.SAVE, getCurrentFile()));
            }
        } catch (IOException e) {
            // TODO: error behavior
            e.printStackTrace();
        }
        setDirty(false);
    }

    /**
     * Do save as method that can be called from outside (e.g., a user interface view).
     * 
     * @param parentShellParam
     *            the parent shell to open the save dialog in
     */
    public void doSaveAs(final Shell parentShellParam) {
        KiemPlugin.getDefault().setShell(parentShellParam);
        SaveAsDialog dlg = new SaveAsDialog(parentShell);
        dlg.setBlockOnOpen(true);
        dlg.setOriginalName(this.getActiveProjectName() + ".execution");
        if (dlg.open() == SaveAsDialog.OK) {
            this.currentFile = dlg.getResult();
            this.doSave(null, parentShell);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether dirty flag is true. Dirty means that the currentFile has been modified since
     * the last save/load action.
     * 
     * @return true, if is dirty
     */
    public boolean isDirty() {
        return this.isDirty;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the dirty flag. Dirty means that the currentFile has been modified since the last
     * save/load action.
     * 
     * @param isDirtyParam
     *            the new dirty
     */
    public void setDirty(final boolean isDirtyParam) {
        this.isDirty = isDirtyParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Cancel the initialization.
     */
    public void cancelInitialization() {
        if (this.initializeExecution != null) {
            this.initializeExecution.cancelInitialization();
        }
        // enable user interface
        if (eventManager != null) {
            eventManager.notify(new KiemEvent(KiemEvent.ENABLE_UI));
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the execution is currently initializing.
     * 
     * @return true, if is initializing execution
     */
    public boolean isInitializingExecution() {
        // true if there exists an execution but it is not running yet or initializing flag is set
        // to true
        boolean returnValue = false;
        if (initializeExecution != null) {
            returnValue = this.initializeExecution.isInitializing();
        }
        return returnValue;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the initialize execution.
     * 
     * @return the initialize execution
     */
    public InitializeExecution getInitializeExecution() {
        return this.initializeExecution;
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
     * @return true, if successful
     */
    public boolean initExecution() {
        // if old initialize task still running, stop it now
        if ((initializeExecution != null) && (initializeExecution.isInitializing())) {
            initializeExecution.cancelInitialization();
        }

        if (this.execution == null) {
            // make a new task
            initializeExecution = new InitializeExecution(this);
            (new Thread(initializeExecution)).start();

            // spin lock while initializing
            while (initializeExecution != null && initializeExecution.isInitializing()) {
                try {
                    Thread.sleep(SLEEPTIME);
                } catch (InterruptedException e) {
                    // noting
                }
            }
        }

        if (this.initializeExecution == null || !this.initializeExecution.wasSuccessful()) {
            return false;
        }
        // update the depending views
        eventManager.notify(new KiemEvent(KiemEvent.VIEW_REFRESH));
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * Add a DataComponent instance to the {@link #dataComponentWrapperList}. This will clone the
     * DataComponent and add an executable extension. It then creates a new DataComponentWrapper
     * instance that encapsulates the just created DataComponent (and offers additional information
     * and methods). The latter will be added then to the DataComponentList.
     * 
     * @param component
     *            the component
     * 
     * @return the added dataComponentWrapper component
     */
    public DataComponentWrapper addTodataComponentWrapperList(final AbstractDataComponent component) {
        IConfigurationElement componentConfigEle = component.getConfigurationElement();
        AbstractDataComponent componentClone;
        try {
            componentClone = (AbstractDataComponent) componentConfigEle
                    .createExecutableExtension("class");
            componentClone.setConfigurationElemenet(componentConfigEle);

            // clone the component ID (set e.g. by some configuration extension)
            String currentComponentID = component.getCurrentComponentID();
            componentClone.setCurrentComponentID(currentComponentID);

            DataComponentWrapper dataComponentWrapper = new DataComponentWrapper(componentClone);
            this.dataComponentWrapperList.add(dataComponentWrapper);

            // possibly refresh UI
            if (eventManager != null) {
                eventManager.notify(new KiemEvent(KiemEvent.VIEW_REFRESH));
            }

            return dataComponentWrapper;
        } catch (CoreException e) {
            e.printStackTrace();
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Returns the default ComponentWrapperList. This will contain all registered DataComponents
     * that extend one the following extension points:<BR>
     * - {@link de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent}<BR>
     * - {@link de.cau.cs.kieler.sim.kiem.JSONStringDataComponent}<BR>
     * They will be ordered in the "natural" way, meaning that the (pure) data producers are
     * scheduled before the data observer & producers which are themselves scheduled before the
     * (pure) data observers. Although DataComponents may be multiple instantiable, by default,
     * there will be exactly one instance per DataComponent in the list.
     * 
     * @return the default DataComponentWrapperList
     */
    public List<DataComponentWrapper> getDefaultComponentWrapperList() {
        // suggest calling the garbage collector: this may
        // remove any DataComponent threads still running (but not
        // linked==needed any more)
        System.gc();
        List<AbstractDataComponent> list = this.getRegisteredDataComponentList();
        List<DataComponentWrapper> returnList = new LinkedList<DataComponentWrapper>();
        // first add initialization components
        for (int c = 0; c < list.size(); c++) {
            AbstractDataComponent dataComponent = list.get(c);
            DataComponentWrapper dataComponentWrapper = new DataComponentWrapper(dataComponent);
            if ((!dataComponentWrapper.isProducer()) && !dataComponentWrapper.isObserver()) {
                returnList.add(dataComponentWrapper);
            }
        }
        // then add pure producer
        for (int c = 0; c < list.size(); c++) {
            AbstractDataComponent dataComponent = list.get(c);
            DataComponentWrapper dataComponentWrapper = new DataComponentWrapper(dataComponent);
            if (dataComponentWrapper.isProducerOnly()) {
                returnList.add(dataComponentWrapper);
            }
        }
        // then add observer & producer
        for (int c = 0; c < list.size(); c++) {
            AbstractDataComponent dataComponent = list.get(c);
            DataComponentWrapper dataComponentWrapper = new DataComponentWrapper(dataComponent);
            if (dataComponentWrapper.isProducerObserver()) {
                returnList.add(dataComponentWrapper);
            }
        }
        // then add pure observer
        for (int c = 0; c < list.size(); c++) {
            AbstractDataComponent dataComponent = list.get(c);
            DataComponentWrapper dataComponentWrapper = new DataComponentWrapper(dataComponent);
            if (dataComponentWrapper.isObserverOnly()) {
                returnList.add(dataComponentWrapper);
            }
        }
        return returnList;
    }

    // -------------------------------------------------------------------------

    /**
     * Safely clear DataComponentWrapperList and call DataComponent destructors.
     */
    public void clearDataComponentWrapperList() {
        if (this.dataComponentWrapperList == null) {
            return;
        }
        while (this.dataComponentWrapperList.size() > 0) {
            DataComponentWrapper dataComponentWrapper = dataComponentWrapperList.get(0);
            dataComponentWrapper.getDataComponent().finalize();
            dataComponentWrapperList.remove(dataComponentWrapper);
            // remove from event manager
            this.eventManager.remove(dataComponentWrapper);
        }
        // suggest calling the garbage collector: this may
        // remove any DataComponent threads still running (but not
        // linked==needed any more)
        System.gc();
    }

    // -------------------------------------------------------------------------

    /**
     * Returns the current DataComponentWrapper-List that is held by the KIEM plug-in directly. Any
     * modification on this list is persistent in this one and only plug-in instance. The
     * DataComponentWrapperList holds a list of DataComponents, selected from all registered (and
     * loaded) plug-ins that extend the following extension points:<BR>
     * - {@link de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent}<BR>
     * - {@link de.cau.cs.kieler.sim.kiem.JSONStringDataComponent}<BR>
     * 
     * @return the DataComponentWrapperList
     */
    public List<DataComponentWrapper> getDataComponentWrapperList() {
        return this.dataComponentWrapperList;
    }

    // -------------------------------------------------------------------------

    /**
     * This method handles errors or warnings within the execution of DataComponents. It
     * specifically handles the following two types or errors:<BR>
     * - {@link KiemExecutionException}<BR>
     * - {@link KiemExecutionException}<BR>
     * If the mustStop flag is set, then the execution is immediately stopped. Note that all threads
     * will be advised to stop in the
     * 
     * @param dataComponent
     *            the DataComponent that caused the error or warning
     * @param exception
     *            the Exception if any, or null
     *            {@link de.cau.cs.kieler.sim.kiem.execution.Execution#errorTerminate()} method. But
     *            there is no guarantee that they really stop. The links to these threads will be
     *            cut down, so that there is the possibility of zombie threads.
     */
    public static void handleComponentError(final AbstractDataComponent dataComponent,
            final Exception exception) {

        boolean mustStop = false;
        boolean mustPause = false;
        boolean silent = false;

        // check if mustStop flag is set
        if (exception instanceof KiemExecutionException) {
            mustStop = ((KiemExecutionException) exception).isMustStop();
            mustPause = ((KiemExecutionException) exception).isMustPause();
            silent = ((KiemExecutionException) exception).isSilent();
        } else if (exception instanceof KiemInitializationException) {
            mustStop = ((KiemInitializationException) exception).isMustStop();
            silent = ((KiemInitializationException) exception).isSilent();
        }

        // show error or warning message dialog
        if (mustStop) {
            // notify components
            KiemPlugin.getDefault().getEventManager().notify(new KiemEvent(KiemEvent.ERROR_STOP));

            // first terminate the execution
            if (KiemPlugin.getDefault().execution != null) {
                KiemPlugin.getDefault().execution.errorTerminate();
            }
            // then show modal error dialog
            KiemPlugin.getDefault().showError(null, dataComponent.getPluginId(), exception, silent);
        } else {
            // show non modal warning dialog
            KiemPlugin.getDefault().showWarning(null, dataComponent.getPluginId(), exception,
                    silent);
            // must pause makes only sense for running executions!
            if (mustPause) {
                // notify components
                KiemPlugin.getDefault().getEventManager()
                        .notify(new KiemEvent(KiemEvent.ERROR_PAUSE));
                // pause execution
                KiemPlugin.getDefault().getExecution().pauseExecutionSync();
            } // end if
        }

    }

    // -------------------------------------------------------------------------

    /**
     * Gets the single EventManager that handles notification of DataComponents when KiemEvents
     * occur.
     * 
     * @return the event manager
     */
    public EventManager getEventManager() {
        return eventManager;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the error warning message.
     * 
     * @param textMessage
     *            the text message
     * @param pluginID
     *            the plugin id
     * @param exception
     *            the exception
     * @return the error warning message
     */
    private String getErrorWarningMessage(final String textMessage, final String pluginID,
            final Exception exception) {
        String message = "";

        if (textMessage != null) {
            message = textMessage + message;
            // exception = null;
        } else if (exception != null) {
            message = exception.getMessage() + message;
            // exception = null;
        }

        // do not post the same message twice
        if ((exception != null) && (textMessage != null)
                && (exception.getMessage().startsWith(textMessage))) {
            message = "" + pluginID + "";
        } else {
            message += " (" + pluginID + ")";
        }
        return message;
    }

    /**
     * Gets the plugin id.
     * 
     * @param textMessage
     *            the text message
     * @param pluginID
     *            the plugin id
     * @param exception
     *            the exception
     * @return the plugin id
     */
    private String getPluginID(final String textMessage, final String pluginID,
            final Exception exception) {
        String pluginID2 = null;
        if (pluginID == null) {
            pluginID2 = KiemPlugin.PLUGIN_ID;
        } else {
            pluginID2 = pluginID;
        }
        return pluginID2;
    }

    // -------------------------------------------------------------------------
    /**
     * Show warning dialog with the message.
     * 
     * @param message
     *            the message to present
     */
    private void showWarning(final String message) {
        if (parentShell != null) {
            MessageDialog.openWarning(parentShell, Messages.mViewTitle, message);
        } else {
            showWarning(message, KiemPlugin.PLUGIN_ID, null, true);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Show error dialog with the message.
     * 
     * @param message
     *            the message to present
     */
    @SuppressWarnings("unused")
    private void showError(final String message) {
        if (parentShell != null) {
            MessageDialog.openError(parentShell, Messages.mViewTitle, message);
        } else {
            showError(message, KiemPlugin.PLUGIN_ID, null, true);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Shows a warning dialog using the StatusAdapter. This dialog will *NOT* be modal, so that the
     * user is notified but the current work is not interrupted. <BR>
     * Additionally the information will be logged in the error log so that the user has the
     * opportunity to e.g., access the error stack trace. The plug-in id is required, textMessage
     * and exception are optional.
     * 
     * @param textMessage
     *            the text message
     * @param pluginID
     *            the plug-in id
     * @param exception
     *            the exception
     * @param silent
     *            the silent tag indicates that only logging occurs, no message dialog is displayed
     */
    public void showWarning(final String textMessage, final String pluginID,
            final Exception exception, final boolean silent) {
        if (forceNoErrorOutput) {
            return;
        }
        try {
            String message = getErrorWarningMessage(textMessage, pluginID, exception);
            String pluginID2 = getPluginID(textMessage, pluginID, exception);

            IStatus status;
            if ((exception == null) || (exception instanceof RuntimeException)) {
                status = new Status(IStatus.WARNING, pluginID2, IStatus.WARNING, message, exception);
            } else {
                try {
                    status = new Status(IStatus.WARNING, pluginID2, IStatus.WARNING, message,
                            exception.getCause());
                } catch (Exception e) {
                    status = new Status(IStatus.WARNING, pluginID2, IStatus.WARNING, message,
                            exception);
                }
            }

            StatusAdapter statusAdapter = new StatusAdapter(status);
            statusAdapter.setProperty(IStatusAdapterConstants.TIMESTAMP_PROPERTY,
                    System.currentTimeMillis());

            // use status manager (log and (optionally) show)
            if (!silent) {
                StatusManager.getManager().handle(statusAdapter,
                        StatusManager.LOG | StatusManager.SHOW);
            } else {
                StatusManager.getManager().handle(statusAdapter, StatusManager.LOG);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Shows an error dialog using the StatusAdapter. This dialog will be modal, so that the user
     * has to click OK to end it. Additionally the information will be logged in the error log so
     * that the user has the opportunity to e.g., access the error stack trace. The plug-in id is
     * required, textMessage and exception are optional.
     * 
     * @param textMessage
     *            the optional text message
     * @param pluginID
     *            the plug-in id
     * @param exception
     *            the exception if any, null otherwise
     * @param silent
     *            the silent tag indicates that only logging occurs, no message dialog is displayed
     */
    // StatusAdapter statusAdapter;

    public void showError(final String textMessage, final String pluginID,
            final Exception exception, final boolean silent) {
        if (isForceNoErrorOutput()) {
            return;
        }
        try {
            String message = getErrorWarningMessage(textMessage, pluginID, exception);
            String pluginID2 = getPluginID(textMessage, pluginID, exception);

            IStatus status;
            if ((exception == null) || (exception instanceof RuntimeException)) {
                status = new Status(IStatus.ERROR, pluginID2, IStatus.ERROR, message, exception);
            } else {
                try {
                    status = new Status(IStatus.ERROR, pluginID2, IStatus.ERROR, message,
                            exception.getCause());
                } catch (Exception e) {
                    status = new Status(IStatus.ERROR, pluginID2, IStatus.ERROR, message, exception);
                }
            }

            StatusAdapter statusAdapter = new StatusAdapter(status);
            statusAdapter.setProperty(IStatusAdapterConstants.TIMESTAMP_PROPERTY,
                    System.currentTimeMillis());

            // use status manager (log and show)
            // BLOCK = modal window, force the user to act!
            // use status manager (log and (optionally) show)
            if (!silent) {
                // Display.getDefault().asyncExec(new Runnable() {
                // public void run() {
                StatusManager.getManager().handle(statusAdapter,
                        StatusManager.BLOCK | StatusManager.LOG | StatusManager.SHOW);
                // }
                // });
            } else {
                StatusManager.getManager().handle(statusAdapter, StatusManager.LOG);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is force no error output.
     *
     * @return true, if is force no error output
     */
    public boolean isForceNoErrorOutput() {
        return forceNoErrorOutput;
    }


    // -------------------------------------------------------------------------

    /**
     * Sets the force no error output.
     *
     * @param forceNoErrorOutput the new force no error output
     */
    public void setForceNoErrorOutput(final boolean forceNoErrorOutput) {
        this.forceNoErrorOutput = forceNoErrorOutput;
    }

}
