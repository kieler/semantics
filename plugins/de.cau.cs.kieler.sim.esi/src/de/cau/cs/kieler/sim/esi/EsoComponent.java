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

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeString;

/**
 * Data-component to read traces in esi format.
 * 
 * @author ctr
 */
public class EsoComponent extends JSONObjectDataComponent {

    private HashSet<String> outputs = new HashSet<String>();
    private HashSet<String> inputs = new HashSet<String>();

    private BufferedWriter eso = null;

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject input) throws KiemExecutionException {
        if (eso != null) {
            try {
                for (String i : inputs) {
                    if (input.has(i)) {
                        JSONObject obj;
                        try {
                            obj = input.getJSONObject(i);
                            if (JSONSignalValues.isPresent(obj)) {
                                eso.write(i);
                                Object val = JSONSignalValues.getSignalValue(obj);
                                if (val != null) {
                                    eso.write("(" + val.toString() + ")");
                                }
                            }
                        } catch (JSONException e) {
                            // ignore
                        }
                    }
                }
                eso.write(" %Output:");
                for (String o : outputs) {
                    if (input.has(o)) {
                        JSONObject obj;
                        try {
                            obj = input.getJSONObject(o);
                            if (JSONSignalValues.isPresent(obj)) {
                                eso.write(o);
                                Object val = JSONSignalValues.getSignalValue(obj);
                                if (val != null) {
                                    eso.write("(" + val.toString() + ")");
                                }
                            }
                        } catch (JSONException e) {
                            // ignore
                        }
                    }
                }
                eso.write("\n;\n");
            } catch (IOException e) {
                throw new KiemExecutionException("Cannot write eso file", true, e);
            }
        }
        return null;
    }

    // --------------------------------------------------------------------------
    // additional methods

    /** {@inheritDoc} */
    public void initialize() throws KiemInitializationException {
        String fileName = this.getProperties()[0].getFilePath();
        if (fileName != null && !fileName.isEmpty()) {
            try {
                eso = new BufferedWriter(new FileWriter(fileName, true));
                eso.write("!reset;\n");
            } catch (IOException e) {
                throw new KiemInitializationException("cannot open file", true, e);
            }
        }

        String in = getProperties()[1].getValue();
        String out = getProperties()[2].getValue();
        for (String s : in.split(" ")) {
            inputs.add(s);
        }
        for (String s : out.split(" ")) {
            outputs.add(s);
        }
    }

    /** {@inheritDoc} */
    public boolean isProducer() {
        return false;
    }

    /** {@inheritDoc} */
    public boolean isObserver() {
        return true;
    }

    @Override
    public KiemProperty[] provideProperties() {
        KiemProperty[] properties = new KiemProperty[3];
        properties[0] = new KiemProperty("Eso File", new KiemPropertyTypeFile(), "test.eso");
        properties[1] = new KiemProperty("Inputs", new KiemPropertyTypeString(), "");
        properties[2] = new KiemProperty("Outputs", new KiemPropertyTypeString(), "");
        return properties;
    }

    /** {@inheritDoc} */
    public void wrapup() {
        if (eso != null) {
            try {
                eso.close();
            } catch (IOException e) {
                // ignore
            }
        }
    }
}
