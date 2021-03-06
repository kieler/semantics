/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kart;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;

import de.cau.cs.kieler.core.model.util.ModelUtil;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

/**
 * Implements a service to write ESO files. This class can take a list of maps, containing the input
 * and output variables in each step of a simulation and generates a valid ESO file. If the output
 * file already exists, it is presumed that it already contains one or more traces. In that case, a
 * reset statement is added and the current trace is appended.
 * 
 * @author ssc, cmot
 * @kieler.design 2012-02-23 cmot
 * @kieler.rating 2012-02-23 yellow cmot
 * 
 */
public class TraceWriter {
    /** Stores the input signals of a trace. */
    private List<HashMap<String, Object>> inputs;

    /** Stores the output signals of a trace. */
    private List<HashMap<String, String>> outputs;

    /** Stores the state information generated by the simulation. */
    private List<HashMap<String, String>> variables;

    /** Name of the file the trace shall be written to. */
    private String filename;

    // -------------------------------------------------------------------------

    /**
     * Prepare the writer to write a trace to a specified output file.
     * 
     * @param inputs
     *            the inputs
     * @param outputs
     *            the outputs
     * @param variables
     *            the variables
     * @param filename
     *            The filename the trace shall be written to
     */
    public TraceWriter(final List<HashMap<String, Object>> inputs,
            final List<HashMap<String, String>> outputs,
            final List<HashMap<String, String>> variables, final String filename) {
        this.inputs = inputs;
        this.outputs = outputs;
        this.variables = variables;
        this.filename = filename;
    }

    // -------------------------------------------------------------------------

    /**
     * Actually start writing the output file. If the file already exists, a new trace is appended
     * to it.
     *
     * @param updateTrace the update trace or -1 if just append
     * @throws KiemInitializationException when either the size of the input and out signal lists do not match or when an
     * error during writing the file occurs
     */
    public void doWrite(int updateTrace) throws KiemInitializationException {
        try {
            
            String filenameTmp = filename + ".tmp";
            File originalFile = new File(filename);
            File tmpFile = new File(filenameTmp);
            
            int traceCnt = -1;
            String tail = ""; // everything after the trace!
            PrintWriter outWriter = null;
            if (updateTrace > -1) {
                // copy everything up to updateTrace
                outWriter = new PrintWriter(new BufferedWriter(new FileWriter(filenameTmp,
                        true)));                
                BufferedReader br = new BufferedReader(new FileReader(originalFile));
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.trim().startsWith("!") && line.trim().endsWith("reset;")) {
                        traceCnt++;  
                    }
                    if (traceCnt < updateTrace) {
                        outWriter.println(line);
                    }
                    if (traceCnt > updateTrace) {
                        tail += line + "\n";
                    }
                }
                br.close();
            } else {
                outWriter = new PrintWriter(new BufferedWriter(new FileWriter(filename,
                        true)));                
            }
            

            if (inputs.size() != outputs.size()) {
                outWriter.close();
                throw new KiemInitializationException("The number of steps for input ("
                        + inputs.size() + ") and output (" + outputs.size()
                        + ") signals and state information does not match", true, null);
            }

            outWriter.println("! reset;");
            for (int i = 0; i < inputs.size(); i++) {
                String signalLine = getSignalString(inputs.get(i)).trim();
                if (signalLine.length() > 0) {
                    outWriter.println(signalLine);
                }
                outWriter.println(getOutputSignalString(outputs.get(i)));
                String varLine = getSpecialString(variables.get(i)).trim();
                if (varLine.length() > 0) {
                    outWriter.println(varLine);
                }
                outWriter.println(";");
            }
            
            // append all other traces
            if (updateTrace > -1) {
                outWriter.print(tail);
            }

            outWriter.close();

            if (updateTrace > -1) {
                // delete original file
                originalFile.delete();
                // rename 
                tmpFile.renameTo(originalFile);
            }

            
            IConfigurationElement[] contributors = Platform.getExtensionRegistry()
                    .getConfigurationElementsFor("de.cau.cs.kieler.sim.kart.Refresh");

            if (contributors.length > 0) {
                IRefresh ref;
                try {
                    ref = (IRefresh) (contributors[0].createExecutableExtension("class"));
                    ref.refreshProjectExplorer();
                } catch (CoreException e) {
                    // do nothing, refresh will simply not work
                }
            }
        } catch (IOException e) {
            throw new KiemInitializationException(KartConstants.ERR_WRITE, true, e);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Generate a string representing all variables in a map in ESO format.
     * 
     * @param signals
     *            the signals
     * @return a string representing all variables and their values in the map in ESO format
     */
    private String getSpecialString(final HashMap<String, String> signals) {
        StringBuffer retvalBuf = new StringBuffer();
        Iterator<String> it = signals.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            String value = signals.get(key);

            retvalBuf.append("%% " + key + " : " + value.toString() + "\n");
        }

        return retvalBuf.toString();
    }

    // -------------------------------------------------------------------------

    /**
     * Convert a signal map to a string representation as it is needed for an ESO file.
     * 
     * @param map
     *            the map of input signals
     * @return the String representation of the input signal map
     */
    private String getSignalString(final Map<String, Object> map) {
        StringBuffer retvalBuf = new StringBuffer();

        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Object> entry = it.next();

            if (entry.getValue() == null) {
                retvalBuf.append(entry.getKey() + " ");
            } else {
                retvalBuf.append(entry.getKey() + " (" + entry.getValue().toString() + ") ");
            }
        }
        return retvalBuf.toString();
    }

    // -------------------------------------------------------------------------

    /**
     * Convert an output signal map to a string representation as it is needed for an ESO file.
     * 
     * @param map
     *            the map of output signals
     * @return the String representation of the output signal map
     * @see getSignalString()
     */
    private String getOutputSignalString(final Map<String, String> map) {
        StringBuffer retvalBuf = new StringBuffer("% Output: ");

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();

            if (entry.getValue() == null) {
                retvalBuf.append(entry.getKey() + " ");
            } else {
                retvalBuf.append(entry.getKey() + " (" + entry.getValue().toString() + ") ");
            }
        }
        return retvalBuf.toString();
    }

    // -------------------------------------------------------------------------

}
