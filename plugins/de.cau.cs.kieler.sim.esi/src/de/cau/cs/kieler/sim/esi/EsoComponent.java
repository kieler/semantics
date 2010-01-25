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
package de.cau.cs.kieler.sim.esi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.core.editor.XtextEditor;

import com.google.inject.Injector;

import de.cau.cs.kieler.sim.esi.esi.signal;
import de.cau.cs.kieler.sim.esi.esi.tick;
import de.cau.cs.kieler.sim.esi.esi.trace;
import de.cau.cs.kieler.sim.esi.esi.tracelist;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeEditor;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Data-component to read traces in esi format.
 * 
 * @author ctr
 */
public class EsoComponent extends JSONObjectDataComponent {

    private tracelist tracelist = null;
    private Iterator<trace> iTrace;
    private Iterator<tick> iTick;

    private int pos = 0;

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject input) throws KiemExecutionException {
        trace trace;
        tick tick;
        JSONObject res = new JSONObject();
        if (tracelist != null) {

            if (!iTick.hasNext() && iTrace.hasNext()) {
                trace = iTrace.next();
                iTick = trace.getTicks().iterator();
            }
            if (iTick.hasNext()) {
                tick = iTick.next();

                boolean valid = true;
                try {
                    // Everything in the trace is emitted
                    for (signal sig : tick.getInput()) {
                        if (input.has(sig.getName())) {
                            Object obj = input.get(sig.getName());
                            if (!JSONSignalValues.isPresent(obj)) {
                                valid = false;
                                break;
                            }
                            if (sig.isValued()) {
                                if ((Integer) (JSONSignalValues.getSignalValue(obj)) != sig
                                        .getVal()) {
                                    valid = false;
                                    break;
                                }
                            }
                        } else {
                            valid = false;
                            break;
                        }
                    }

                    /** TODO:Everything emitted is in the trace */
                    // Iterator<String> key = input.keys();
                    // while (key.hasNext()) {
                    //                     
                    // JSONObject obj = input.getJSONObject(key.next());
                    // if (JSONSignalValues.isSignalValue(obj)) {
                    // if (JSONSignalValues.isPresent(obj) && !tick.getInput().contains(key)) {
                    // valid = false;
                    // break;
                    // } else {
                    // if (tick.getInput().contains(key)) {
                    // valid = false;
                    // break;
                    // }
                    //
                    // }
                    // }
                    // }
                    res.accumulate("valid", JSONSignalValues.newValue(pos, valid));

                } catch (JSONException e) {
                    throw new KiemExecutionException("Error building JSON Object", false, e);
                }
            }
            pos++;
        }

        return res;
    }

    // --------------------------------------------------------------------------
    // additional methods
    /** {@inheritDoc} */
    @Override
    public JSONObject provideInitialVariables() throws KiemInitializationException {
        JSONObject res = new JSONObject();
        try {
            res.accumulate("valid", JSONSignalValues.newValue(true));
        } catch (JSONException e) {
            throw new KiemInitializationException("JSON error", true, e);
        }
        return res;
    }

    /** {@inheritDoc} */
    public void initialize() throws KiemInitializationException {
        pos = 0;
        tracelist = Helper.loadTrace(getClass(), getProperties()[0].getValue(), getProperties()[1]
                .getValue());
        iTrace = tracelist.getTraces().iterator();
        iTick = iTrace.next().getTicks().iterator();
    }

    /** {@inheritDoc} */
    public boolean isProducer() {
        return true;
    }

    /** {@inheritDoc} */
    public boolean isObserver() {
        return true;
    }

    @Override
    public KiemProperty[] provideProperties() {
        String editorName = "";
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        if (page != null) {
            IEditorReference[] editors = page.getEditorReferences();
            if (editors != null) {
                for (IEditorReference e : editors) {
                    IEditorPart ed = e.getEditor(false);
                    if (ed instanceof XtextEditor) {
                        editorName = e.getTitle() + " (" + e.getId() + ")";
                        break;
                    }

                }
            }
        }

        KiemProperty[] properties = new KiemProperty[2];
        properties[0] = new KiemProperty("Input File", new KiemPropertyTypeFile(),
                "/home/ctr/runtime-EclipseApplication/test/abro.esi");
        properties[1] = new KiemProperty("Input Editor", new KiemPropertyTypeEditor(), editorName);
        return properties;
    }

    /** {@inheritDoc} */
    public void wrapup() {
        tracelist = null;
    }
}
