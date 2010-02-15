///*
// * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
// *
// * http://www.informatik.uni-kiel.de/rtsys/kieler/
// * 
// * Copyright 2009 by
// * + Christian-Albrechts-University of Kiel
// *   + Department of Computer Science
// *     + Real-Time and Embedded Systems Group
// * 
// * This code is provided under the terms of the Eclipse Public License (EPL).
// * See the file epl-v10.html for the license text.
// */
//package de.cau.cs.kieler.krep.editors.rif;
//
//import java.util.List;
//
//import org.eclipse.core.resources.IFile;
//import org.eclipse.core.resources.ResourcesPlugin;
//import org.eclipse.core.runtime.IPath;
//import org.eclipse.core.runtime.Path;
//import org.eclipse.ui.IEditorPart;
//import org.eclipse.ui.IEditorReference;
//import org.eclipse.ui.IWorkbenchPage;
//import org.eclipse.ui.PlatformUI;
//import org.eclipse.xtext.ui.core.editor.XtextEditor;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import de.cau.cs.kieler.sim.esi.ITraceProvider;
//import de.cau.cs.kieler.sim.esi.esi.signal;
//import de.cau.cs.kieler.sim.esi.esi.tick;
//import de.cau.cs.kieler.sim.esi.trace.ITraceList;
//import de.cau.cs.kieler.sim.kiem.IAutomatedComponent;
//import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
//import de.cau.cs.kieler.sim.kiem.JSONSignalValues;
//import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
//import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
//import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
//import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeEditor;
//import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
//
///**
// * Data-component to read traces in esi format.
// * 
// * @author ctr
// */
//public class RifComponent extends JSONObjectDataComponent implements IAutomatedComponent,
//        ITraceProvider {
//
//    private static final String[] SUPPORTED_FILES = {  };
//
//    private ITraceList tracelist;
//
//    private int iteration = 0;
//
//    private String traceFile = null;
//
//    /**
//     * {@inheritDoc}
//     */
//    public JSONObject step(final JSONObject input) throws KiemExecutionException {
//
//        JSONObject res = new JSONObject();
//        if (tracelist != null) {
//            if (tracelist.current() == null && tracelist.hasNext()) {
//                tracelist.next();
//            } else if (!tracelist.current().hasNext() && tracelist.hasNext()) {
//                // pos += "! reset".length();
//                tracelist.next();
//            } 
//            if (tracelist.current().hasNext()) {
//                tracelist.current().next();
//            }
//            tick tick = tracelist.current().current();
//            try {
//                for (signal s : tick.getInput()) {
//                    if (s.isValued()) {
//                        res.accumulate(s.getName(), JSONSignalValues.newValue(s.getVal(), true));
//                    } else {
//                        res.accumulate(s.getName(), JSONSignalValues.newValue(true));
//                    }
//                }
//            } catch (JSONException e) {
//                throw new KiemExecutionException("Error building JSON Object", false, e);
//            }
//        }
//
//        return res;
//    }
//
//    // --------------------------------------------------------------------------
//    // additional methods
//
//    /** {@inheritDoc} */
//    public void initialize() {
//    }
//
//    /** {@inheritDoc} */
//    public boolean isProducer() {
//        return true;
//    }
//
//    /** {@inheritDoc} */
//    public boolean isObserver() {
//        return false;
//    }
//
//    @Override
//    public KiemProperty[] provideProperties() {
//        String editorName = "";
//        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
//        if (page != null) {
//            IEditorReference[] editors = page.getEditorReferences();
//            if (editors != null) {
//                for (IEditorReference e : editors) {
//                    IEditorPart ed = e.getEditor(false);
//                    if (ed instanceof XtextEditor) {
//                        editorName = e.getTitle() + " (" + e.getId() + ")";
//                        break;
//                    }
//
//                }
//            }
//        }
//
//        KiemProperty[] properties = new KiemProperty[2];
//        properties[0] = new KiemProperty("Input File", new KiemPropertyTypeFile(), traceFile);
//        properties[1] = new KiemProperty("Input Editor", new KiemPropertyTypeEditor(), editorName);
//        return properties;
//    }
//
//    /** {@inheritDoc} */
//    public void wrapup() {
//        iteration = 0;
//    }
//
//    @Override
//    public JSONObject provideInitialVariables() throws KiemInitializationException {
//        JSONObject signals = new JSONObject();
//        if (iteration == 0 || tracelist == null) {
//            // load new trace
//            try {
//                String name = getProperties()[0].getValue();
//                if (traceFile != null) { // Automated run
//                    name = traceFile;
//                }
//                tracelist = new RifFile(getClass(), name);
//            } catch (Exception e) {
//                throw new KiemInitializationException("Cannot open trace file", true, e);
//            }
//        }
//
//        // if (tracelist.hasNext()) {
//        // tracelist.next();
//
//        try {
//
//            for (String s : tracelist.getInputs()) {
//                signals.accumulate(s, JSONSignalValues.newValue(false));
//            }
//            for (String s : tracelist.getOutputs()) {
//                signals.accumulate(s, JSONSignalValues.newValue(false));
//            }
//        } catch (JSONException e) {
//            // ignore
//            // }
//        }
//        return signals;
//    }
//
//    /**
//     * {@inheritDoc}
//     * 
//     * @throws KiemInitializationException
//     */
//    public void setParameters(final List<KiemProperty> properties)
//            throws KiemInitializationException {
//        String model = null;
//        for (KiemProperty p : properties) {
//            if (p.getKey().equals(MODEL_FILE)) {
//                model = p.getValue();
//            } else if (p.getKey().equals(ITERATION)) {
//                iteration = Integer.parseInt(p.getValue());
//            }
//        }
//        if (model != null) {
//            IPath path = Path.fromOSString(model);
//            path = path.removeFileExtension();
//            path = path.addFileExtension("esi");
//
//            IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
//
//            traceFile = file.getLocation().toOSString();
//            properties.add(new KiemProperty("TRACE", traceFile));
//
//            if (iteration == 0 || tracelist == null) {
//                // FIXME: tracelist has to be available before
//                // initExecution() is called
//                // load new trace
//                try {
//                    String name = getProperties()[0].getValue();
//                    if (traceFile != null) { // Automated run
//                        name = traceFile;
//                    }
//                    tracelist = new RifFile(getClass(), name);
//                } catch (Exception e) {
//                    throw new KiemInitializationException("Can't find trace file", false, e);
//
//                }
//            }
//        }
//    }
//
//    /**
//     * {@inheritDoc}
//     */
//    public int wantsMoreRuns() {
//        if (tracelist == null) {
//            return 0;
//        }
//        return tracelist.getRemaining();
//    }
//
//    /**
//     * {@inheritDoc}
//     */
//    public int wantsMoreSteps() {
//
//        if (tracelist == null || tracelist.current() == null) {
//            return 0;
//        } else {
//            return tracelist.current().getRemaining();
//        }
//    }
//
//    /**
//     * {@inheritDoc}
//     */
//    public String[] getSupportedExtensions() {
//        return SUPPORTED_FILES;
//    }
//
//    /**
//     * {@inheritDoc}
//     */
//    public ITraceList getTrace() {
//        return tracelist;
//    }
//}
