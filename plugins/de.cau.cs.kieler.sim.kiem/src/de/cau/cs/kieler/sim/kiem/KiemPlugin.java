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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISaveablePart2;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.statushandlers.IStatusAdapterConstants;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.execution.JSONMerger;
import de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.internal.EventManager;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.ui.views.KiemView;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * This activator class controls the life cycle of the KiemPlugin. It also provides the access to
 * the one and only instance of this class and hence a way to access the execution thread. For the
 * execution thread it allows to access the KiemView for updating or refreshing the table or the
 * step information text field.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de, soh
 * 
 */
public class KiemPlugin extends AbstractUIPlugin {

    /**
     * The Constant AIMED_STEP_DURATION_DEFAULT. Default value of the AimedStepDuration text field
     * in ms.
     */
    public static final int AIMED_STEP_DURATION_DEFAULT = 500;

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

    /** The shared instance. */
    private static KiemPlugin plugin;

    /** List of available dataProducers and dataObservers. */
    private List<AbstractDataComponent> dataComponentList;

    /** List of selected dataComponentWrapper's (modified by KiemView). */
    private List<DataComponentWrapper> dataComponentWrapperList;

    /** Execution object. */
    private Execution execution;

    /** Execution thread. */
    private Thread executionThread;

    /** Current value of the aimed step duration in ms. */
    private int aimedStepDuration;

    /** The KIEM view instance. */
    private KiemView kIEMViewInstance;

    /** The event manager to handle notification of DataComponents. */
    private EventManager eventManager;

    // -------------------------------------------------------------------------

    /**
     * The constructor if the KIEM plug-in. A default DataComponentWrapperList is created. It
     * contains all DataComponents in the default order ({@link #getDefaultComponentWrapperList()}).
     * The execution is null by default. The KIEMViewInstance is set, in the constructor of the.
     * 
     * @see de.cau.cs.kieler.sim.kiem.ui.views.KiemView
     */
    public KiemPlugin() {
        dataComponentList = this.getRegisteredDataComponentList();
        dataComponentWrapperList = getDefaultComponentWrapperList();
        updateEventManager();
        execution = null;
        aimedStepDuration = AIMED_STEP_DURATION_DEFAULT;
        kIEMViewInstance = null;
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
     * This method is called from the KiemProxyEditor that acts as a proxy for passing the
     * editoInput from the Workbench to the KiemView.
     * 
     * @param editorInput
     *            the file editor input to open
     */
    public void openFile(final IEditorInput editorInput) {
        if (!(editorInput instanceof IFileEditorInput)) {
            throw new RuntimeException("Invalid Input: Must be IFileEditorInput");
        }

        IPath executionFile = ((IFileEditorInput) editorInput).getFile().getFullPath();
        try {
            openFile(executionFile);
        } catch (IOException e0) {
            // TODO Auto-generated catch block
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
     * @throws IOException
     *             if the file was not found
     */
    public void openFile(final IPath executionFile) throws IOException {

        String fileString = executionFile.toOSString();

        URI fileURI = URI.createPlatformResourceURI(fileString, true);
        // resolve relative workspace paths
        URIConverter uriConverter = new ExtensibleURIConverterImpl();
        final InputStream inputStream = uriConverter.createInputStream(fileURI);

        Display.getDefault().syncExec(new Runnable() {
            @SuppressWarnings("unchecked")
            public void run() {
                // probe if execution is running
                if (execution != null) {
                    // stop any running execution
                    KiemPlugin.getDefault().execution.stopExecutionSync();
                    showError(Messages.mErrorOpenDuringExecution, PLUGIN_ID, null, false);
                    return;
                }

                if (kIEMViewInstance.promptToSaveOnClose() == ISaveablePart2.NO) {
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
                    // update the KiemView table
                    kIEMViewInstance.updateViewAsync();
                    // reset the KIEM view (in cases it hangs because
                    // of faulty components)
                    kIEMViewInstance.setAllEnabled(true);
                    kIEMViewInstance.updateEnabledEnabledDisabledUpDownAddDelete();
                    kIEMViewInstance.updateViewAsync();
                    // update the current file, dirty flag
                    kIEMViewInstance.setCurrentFile(executionFile);
                    kIEMViewInstance.setDirty(false);
                    kIEMViewInstance.checkForSingleEnabledMaster(false);
                    kIEMViewInstance.getAimedStepDurationTextField().update();
                    if (loadSuccessful) {
                        if (eventManager != null) {
                            eventManager.notify(new KiemEvent(KiemEvent.LOAD, executionFile));
                        }
                    }
                }
            }
        });
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
        if (this.kIEMViewInstance != null) {
            this.kIEMViewInstance.updateViewAsync();

        }
    }

    /**
     * Updates the steps in the Step text field asynchronously. This method is used to update the
     * KiemView steps from within the execution thread.
     */
    public void updateStepsAsync() {
        if (this.kIEMViewInstance != null) {
            this.kIEMViewInstance.updateStepsAsync();

        }
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the view focus to the KiemView instance. This method is called by the AimedStepDuration
     * text field if the used wants to leave its focus by pressing [ENTER].
     */
    public void setViewFocus() {
        if (this.kIEMViewInstance != null) {
            this.kIEMViewInstance.setFocus();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the KiemView instance.
     * 
     * @return the KiemView instance
     */
    public KiemView getKIEMViewInstance() {
        return this.kIEMViewInstance;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the KIEM view instance. This method is called by the constructor of the Class
     * {@link de.cau.cs.kieler.sim.kiem.ui.views.KiemView} so that this plug-in (or the execution
     * thread) is able to trigger updates on the view.
     * 
     * @param kIEMViewInstanceParam
     *            the one and only KiemView instance
     */
    public void setKIEMViewInstance(final KiemView kIEMViewInstanceParam) {
        this.kIEMViewInstance = kIEMViewInstanceParam;
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
        this.getKIEMViewInstance().updateViewAsync();
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
                        for (int ccc = 0; ccc < properties.length; ccc++) {
                            try {
                                properties[ccc].setType(dataComponent.getProperties()[ccc]
                                        .getType());
                            } catch (Exception e) {
                                // warnings with unusable properties can
                                // only occur if this is intended, i.e., the
                                // component id calculation was modified!
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

            updateEventManager();
            if (!componentRestored) {
                this.showWarning(Messages.mWarningLoadingDataComponent.replace("%COMPONENTNAME",
                        componentId), null, null, false);
            } // end if - failed

        } // next c
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
        // remove any DataComponent threads still running (but not linked==needed any more)
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
                System.out.println("KIEM loading component: "
                        + jsonComponents[i].getContributor().getName());
                JSONObjectDataComponent dataComponent = (JSONObjectDataComponent) jsonComponents[i]
                        .createExecutableExtension("class");
                dataComponent.setConfigurationElemenet(jsonComponents[i]);
                dataComponentList.add(dataComponent);
            } catch (Exception e) {
                // throw new RuntimeException
                // ("Error at loading a KIEM data component plugin");
                this.showWarning(Messages.mWarningLoadingDataComponent.replace("%COMPONENTNAME",
                        jsonComponents[i].getContributor().getName()), null, e, false);
            }
        }
        for (int i = 0; i < stringComponents.length; i++) {
            try {
                System.out.println("KIEM loading component: "
                        + stringComponents[i].getContributor().getName());
                JSONStringDataComponent dataComponent = (JSONStringDataComponent) stringComponents[i]
                        .createExecutableExtension("class");
                dataComponent.setConfigurationElemenet(stringComponents[i]);
                dataComponentList.add(dataComponent);
                // System.out.println(dataComponent.getName());
            } catch (Exception e) {
                // throw new RuntimeException
                // ("Error at loading a KIEM data component plugin");
                this.showWarning(Messages.mWarningLoadingDataComponent.replace("%COMPONENTNAME",
                        stringComponents[i].getContributor().getName()), null, e, false);
            }
        }
        return dataComponentList;
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
            this.kIEMViewInstance.setAllEnabled(true);
            this.showError(Messages.mErrorNoDataProducer, KiemPlugin.PLUGIN_ID, null, false);
            return false;
        } else if (countEnabledObserver < 1) {
            this.kIEMViewInstance.setAllEnabled(true);
            showError(Messages.mErrorNoDataObserver, KiemPlugin.PLUGIN_ID, null, false);
            return false;
        }
        return true;
    }

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
                this.showError(null, dataComponentWrapper.getDataComponent()
                        .getConfigurationElement().getContributor().getName(), e, false);
                return false;
            }
        }
        return true;
    }

    private boolean distributeInterfaceKeys() {
        // DEPRECATED PART FOLLOWING -------------------------------------------
        // Handling interface keys as a list of strings turned out to be not sufficient
        // for example when data components want to provide variables with special
        // initial values (e.g., mark variables as signals using a convention on their
        // values).
        // This part may be removed in future releases. Do not use interface key methods
        // in DataComponent implementations any further!

        // get all InterfaceKeys from (enabled) data producer
        // and combine them into globalInterfaceKeys
        List<String> globalInterfaceKeys = new LinkedList<String>();
        for (int c = 0; c < dataComponentWrapperList.size(); c++) {
            DataComponentWrapper dataComponentWrapper = dataComponentWrapperList.get(c);
            if (dataComponentWrapper.isEnabled()) {
                try {
                    String[] localInterfaceKeys = dataComponentWrapper.provideInterfaceKeys();
                    if (localInterfaceKeys != null) {
                        for (int cc = 0; cc < localInterfaceKeys.length; cc++) {
                            String localInterfaceVariable = localInterfaceKeys[cc];
                            globalInterfaceKeys.add(localInterfaceVariable);
                        } // next cc
                    } // end if not null
                } catch (Exception e) {
                    KiemPlugin.getDefault().handleComponentError(
                            dataComponentWrapper.getDataComponent(), e);
                    return false;
                }
            } // if enabled
        } // next c

        // distribute union of InterfaceKeys to all enabled components
        for (int c = 0; c < dataComponentWrapperList.size(); c++) {
            DataComponentWrapper dataComponentWrapper = dataComponentWrapperList.get(c);
            if (dataComponentWrapper.isEnabled()) {
                dataComponentWrapper.setInterfaceKeys((String[]) globalInterfaceKeys
                        .toArray(new String[0]));
            } // end if enabled
        } // next c

        // DEPRECATED PART END -------------------------------------------------
        return true;
    }

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
                    KiemPlugin.getDefault().handleComponentError(
                            dataComponentWrapper.getDataComponent(), e);
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

    private boolean initializeDataComponents() {
        // initialize all (enabled) data producer and Observer
        for (int c = 0; c < dataComponentWrapperList.size(); c++) {
            DataComponentWrapper dataComponentWrapper = dataComponentWrapperList.get(c);
            if (dataComponentWrapper.isEnabled()) {
                try {
                    dataComponentWrapper.getDataComponent().initialize();
                } catch (Exception e) {
                    e.printStackTrace();
                    KiemPlugin.getDefault().handleComponentError(
                            dataComponentWrapper.getDataComponent(), e);
                    return false;
                }
            } // end if enabled
        } // next c
        return true;
    }

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
        if (this.execution != null) {
            return true;
        }

        this.kIEMViewInstance.setAllEnabled(false);

        if (!testNumberOfProducersObservers()) {
            this.kIEMViewInstance.setAllEnabled(true);
            return false;
        }

        if (!testForKiemPropertyError()) {
            this.kIEMViewInstance.setAllEnabled(true);
            return false;
        }

        if (!distributeInterfaceKeys()) {
            this.kIEMViewInstance.setAllEnabled(true);
            return false;
        }

        JSONObject globalInitialVariables = new JSONObject();
        try {
            globalInitialVariables = distributeInitialKeys();
        } catch (Exception e) {
            this.kIEMViewInstance.setAllEnabled(true);
            return false;
        }

        if (!initializeDataComponents()) {
            this.kIEMViewInstance.setAllEnabled(true);
            return false;
        }

        // now create and run the execution thread
        this.execution = new Execution(dataComponentWrapperList, eventManager);
        // take the last set delay
        this.execution.setAimedStepDuration(this.getAimedStepDuration());
        // initialize the dataPool with this data
        try {
            this.execution.getDataPool().putData(globalInitialVariables);
        } catch (JSONException e) {
            // this should not happen
            e.printStackTrace();
        }

        this.executionThread = new Thread(this.execution);
        this.executionThread.start();

        this.kIEMViewInstance.setAllEnabled(true);
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

            DataComponentWrapper dataComponentWrapper = new DataComponentWrapper(componentClone);
            this.dataComponentWrapperList.add(dataComponentWrapper);
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
        // remove any DataComponent threads still running (but not linked==needed any more)
        System.gc();
        List<AbstractDataComponent> list = this.getRegisteredDataComponentList();
        List<DataComponentWrapper> returnList = new LinkedList<DataComponentWrapper>();
        // first add initialization components
        for (int c = 0; c < list.size(); c++) {
            AbstractDataComponent dataComponent = (AbstractDataComponent) list.get(c);
            DataComponentWrapper dataComponentWrapper = new DataComponentWrapper(dataComponent);
            if ((!dataComponentWrapper.isProducer()) && !dataComponentWrapper.isObserver()) {
                returnList.add(dataComponentWrapper);
            }
        }
        // then add pure producer
        for (int c = 0; c < list.size(); c++) {
            AbstractDataComponent dataComponent = (AbstractDataComponent) list.get(c);
            DataComponentWrapper dataComponentWrapper = new DataComponentWrapper(dataComponent);
            if (dataComponentWrapper.isProducerOnly()) {
                returnList.add(dataComponentWrapper);
            }
        }
        // then add observer & producer
        for (int c = 0; c < list.size(); c++) {
            AbstractDataComponent dataComponent = (AbstractDataComponent) list.get(c);
            DataComponentWrapper dataComponentWrapper = new DataComponentWrapper(dataComponent);
            if (dataComponentWrapper.isProducerObserver()) {
                returnList.add(dataComponentWrapper);
            }
        }
        // then add pure observer
        for (int c = 0; c < list.size(); c++) {
            AbstractDataComponent dataComponent = (AbstractDataComponent) list.get(c);
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
        // remove any DataComponent threads still running (but not linked==needed any more)
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
     * {@link de.cau.cs.kieler.sim.kiem.execution.Execution#errorTerminate()} method. But there is
     * no guarantee that they really stop. The links to these threads will be cut down, so that
     * there is the possibility of zombie threads.
     * 
     * @param dataComponent
     *            the DataComponent that caused the error or warning
     * @param exception
     *            the Exception if any, or null
     */
    public void handleComponentError(final AbstractDataComponent dataComponent,
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
        }

        // show error or warning message dialog
        if (mustStop) {
            // notify components
            this.getEventManager().notify(new KiemEvent(KiemEvent.ERROR_STOP));

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
                this.getEventManager().notify(new KiemEvent(KiemEvent.ERROR_PAUSE));
                // pause execution
                this.execution.pauseExecutionSync();
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
        try {
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

            String pluginID2 = null;
            if (pluginID == null) {
                pluginID2 = KiemPlugin.PLUGIN_ID;
            } else {
                pluginID2 = pluginID;
            }

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
            statusAdapter.setProperty(IStatusAdapterConstants.TIMESTAMP_PROPERTY, System
                    .currentTimeMillis());

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
    public void showError(final String textMessage, final String pluginID,
            final Exception exception, final boolean silent) {
        try {
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

            String pluginID2 = null;
            if (pluginID == null) {
                pluginID2 = KiemPlugin.PLUGIN_ID;
            } else {
                pluginID2 = pluginID;
            }

            IStatus status;
            if ((exception == null) || (exception instanceof RuntimeException)) {
                status = new Status(IStatus.ERROR, pluginID2, IStatus.ERROR, message, exception);
            } else {
                try {
                    status = new Status(IStatus.ERROR, pluginID2, IStatus.ERROR, message, exception
                            .getCause());
                } catch (Exception e) {
                    status = new Status(IStatus.ERROR, pluginID2, IStatus.ERROR, message, exception);
                }
            }

            StatusAdapter statusAdapter = new StatusAdapter(status);
            statusAdapter.setProperty(IStatusAdapterConstants.TIMESTAMP_PROPERTY, System
                    .currentTimeMillis());

            // use status manager (log and show)
            // BLOCK = modal window, force the user to act!
            // use status manager (log and (optionally) show)
            if (!silent) {
                StatusManager.getManager().handle(statusAdapter,
                        StatusManager.BLOCK | StatusManager.LOG | StatusManager.SHOW);
            } else {
                StatusManager.getManager().handle(statusAdapter, StatusManager.LOG);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
