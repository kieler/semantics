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
package de.cau.cs.kieler.sim.trace;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IAutomatedComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeBool;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;

/**
 * Data-component to read traces in esi format.
 * 
 * @author ctr
 */
public class TraceReader extends JSONObjectDataComponent implements IAutomatedComponent {

    private static final String[] SUPPORTED_FILES = {};

    private static final String REMAINING = "_Trace Remaining";
    
    
    private KiemPropertyTypeFile fileProperty;

    private List<? extends ITrace> tracelist;
    ITrace current;

    private int iteration = 0, pos = 0;

    private String traceFile = null;

    private HashMap<String, ITraceProvider> provider = new HashMap<String, ITraceProvider>();

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject input) throws KiemExecutionException {

        JSONObject res = new JSONObject();
        if (current != null) {
            if (current.hasNext()) {
                current.next();
            }
            ITick tick = current.current();
            try {
                for (Signal s : tick.getInputs()) {
                    if (s.isValued()) {
                        res.accumulate(s.getName(), JSONSignalValues.newValue(s.getValue(), true));
                    } else {
                        res.accumulate(s.getName(), JSONSignalValues.newValue(true));
                    }
                }
                res.accumulate(REMAINING, current.getRemaining());
            } catch (JSONException e) {
                throw new KiemExecutionException("Error building JSON Object", false, e);
            }
        }

        return res;
    }

    // --------------------------------------------------------------------------
    // additional methods

    /**
     * {@inheritDoc}
     * 
     * @throws KiemInitializationException
     */
    public void initialize() throws KiemInitializationException {
        IExtensionRegistry reg = Platform.getExtensionRegistry();
        for (IConfigurationElement bundle : reg
                .getConfigurationElementsFor("de.cau.cs.kieler.sim.trace.traceprovider")) {
            try {
                ITraceProvider p = (ITraceProvider) bundle.createExecutableExtension("class");
                for (String s : p.getExtensions()) {
                    provider.put(s, p);

                }
            } catch (InvalidRegistryObjectException e) {
                throw new KiemInitializationException("Trace Error", true, e);
            } catch (CoreException e) {
                throw new KiemInitializationException("Trace Error", true, e);
            }
        }
        if (fileProperty != null) {
            fileProperty.setFilterNames(provider.keySet().toArray(
                    new String[provider.keySet().size()]));
        }

    }

    /** {@inheritDoc} */
    public boolean isProducer() {
        return true;
    }

    /** {@inheritDoc} */
    public boolean isObserver() {
        return false;
    }

    @Override
    public KiemProperty[] provideProperties() {
        KiemProperty[] properties = new KiemProperty[1];

        fileProperty = new KiemPropertyTypeFile();
        properties[0] = new KiemProperty("Input File", fileProperty, traceFile);
        return properties;
    }

    /** {@inheritDoc} */
    public void wrapup() {
        iteration = 0;
    }

    @Override
    public JSONObject provideInitialVariables() throws KiemInitializationException {
        JSONObject signals = new JSONObject();
        if (iteration == 0 || tracelist == null) {
            tracelist = null;
            // load new trace
            try {
                String name = getProperties()[0].getValue();
                if (traceFile != null) { // Automated run
                    name = traceFile;
                }

                if (name != null && (new File(name)).exists()) {
                    for (Entry<String, ITraceProvider> i : provider.entrySet()) {
                        if (name.endsWith(i.getKey())) {
                            tracelist = i.getValue().loadTrace(name);
                            current = tracelist.get(0);
                            break;
                        }
                    }
                }
                if (tracelist == null) {// try to find trace file for active editor
                    IWorkbench workbench = PlatformUI.getWorkbench();
                    IWorkbenchPage page = null;
                    if (workbench != null) {
                        IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
                        if (window != null) {
                            page = window.getActivePage();

                            IEditorPart editor = page.getActiveEditor();
                            if (editor != null) {

                                if (editor.getEditorInput().exists()
                                        && editor.getEditorInput() instanceof FileEditorInput) {
                                    FileEditorInput input = (FileEditorInput) editor
                                            .getEditorInput();

                                    IPath file = input.getFile().getLocation();
                                    file = file.removeFileExtension();
                                    name = file.toFile().getAbsolutePath();// .toOSString(); //
                                    // editor.getEditorInput().getName();

                                    for (Entry<String, ITraceProvider> i : provider.entrySet()) {
                                        if (new File(name + "." + i.getKey()).exists()) {
                                            tracelist = i.getValue().loadTrace(
                                                    name + "." + i.getKey());
                                            current = tracelist.get(0);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            } catch (Exception e) {
                throw new KiemInitializationException("Cannot open trace file", true, e);
            }
        }

        // if (tracelist.hasNext()) {
        // tracelist.next();
        try {
            if (tracelist != null) {

                HashSet<String> sigs = new HashSet<String>();
                for (ITrace trace : tracelist) {
                    sigs.addAll(trace.getSignals());
                }
                for (String s : sigs) {
                    signals.accumulate(s, JSONSignalValues.newValue(false));
                }

                signals.accumulate(REMAINING, current.getRemaining());
            }
        } catch (JSONException e) { //
            // ignore
        }

        return signals;
    }

    /**
     * {@inheritDoc}
     * 
     * @throws KiemInitializationException
     */
    public void setParameters(final List<KiemProperty> properties)
            throws KiemInitializationException {
        String model = null;
        for (KiemProperty p : properties) {
            if (p.getKey().equals(MODEL_FILE)) {
                model = p.getValue();
            } else if (p.getKey().equals(ITERATION)) {
                iteration = Integer.parseInt(p.getValue());
            }
        }
        if (model != null) {
            IPath path = Path.fromOSString(model);
            path = path.removeFileExtension();
            path = path.addFileExtension("esi");

            // IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);

            // traceFile = file.getLocation().toOSString();
            // properties.add(new KiemProperty("TRACE", traceFile));

            if (iteration == 0 || tracelist == null) {
                // FIXME: tracelist has to be available before
                // initExecution() is called
                // load new trace
                try {
                    String name = getProperties()[0].getValue();
                    if (traceFile != null) { // Automated run
                        name = traceFile;
                    }
                    // tracelist = new EsiFile(getClass(), name);
                } catch (Exception e) {
                    throw new KiemInitializationException("Can't find trace file", false, e);

                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public int wantsMoreRuns() {
        if (tracelist == null) {
            return 0;
        }
        return tracelist.size() - pos;
    }

    /**
     * {@inheritDoc}
     */
    public int wantsMoreSteps() {

        if (current == null) {
            return 0;
        } else {
            return current.getRemaining();
        }
    }

    /**
     * {@inheritDoc}
     */
    public String[] getSupportedExtensions() {
        return SUPPORTED_FILES;
    }

}
