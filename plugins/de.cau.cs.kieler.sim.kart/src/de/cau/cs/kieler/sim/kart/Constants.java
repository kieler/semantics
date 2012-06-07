/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kart;

/**
 * Contains nearly all Strings KART uses internally for configuration or to interact with the user
 * 
 * @author Sebastian Schäfer - ssc AT informatik.uni-kiel.de
 * @kieler.rating 2012-02-23 red
 */
public class Constants {
    public static final String PLUGINID = "de.cau.cs.kieler.sim.kart";
    public static final String ESO_FILEEXTENSION = "eso";
    public static final String TRACENUM = "Trace number to replay";
    public static final String IGNOREEXTRA = "Ignore additionally generated signals";
    public static final String TRAINMODE = "Training mode";
    public static final String CONFIGVAR = "Configuration variable";
    public static final String OUTPUTVAR = "Output signals/variables variable name";
    public static final String PREVINVAR = "Previous input signals variable name";
    public static final String VALVAR = "Names of variables to validate and their respective error variable names";
    public static final String SIGNALVAR = "Erroneous signals variable";
    public static final String STOPEXECUTION = "Stop execution upon end of ESO file";
    
    public static final String[] FILEEXTS = { "*.eso", "*.esi" };
    public static final String[] FILEEXTNAMES = { "ESO", "ESI" };
    
    public static final String ERR_NOTEXISTESO = "The replay ESO file to the provided model does not exist!";
    public static final String ERR_NEEDESO = "You must set an ESO filename!";
    public static final String ERR_NOTRACE = "The trace file does not contain a trace number ";
    public static final String ERR_JSON = "Could not build JSON object with signals read from ESO file";
    public static final String ERR_EMPTYESO = "Trace file is empty or does not exist.";
    public static final String ERR_WRITE = "An error occurred when writing the ESO trace file";
    public static final String ERR_READ = "An error occurred when reading the ESO trace file, maybe the file is empty or corrupted. Please check the file and maybe record fresh.";
    public static final String ERR_NOTFOUND_TITLE = "Trace file could not be found";
    public static final String ERR_NOTFOUND = "The trace file could not be found. Do you want to switch to training mode?";
    public static final String OVERWRITE_TITLE = "Overwrite trace file?";
    public static final String OVERWRITE = "Do you want to replace the current trace file with this trace? If not, the current trace will be appended to the existing trace file";
    public static final boolean ERR_SILENT = true;
    
    public static final String VAL_TITLE = "Validation error";
    
    public static final String VAR_TRAINMODE = "trainmode";
    public static final String VAR_ESOFILE = "esofile";
    public static final String VAR_EOT = "eot";
    
    public static final String DEF_CONFIGVAR = "kartConfig";
    public static final String DEF_OUTPUTVAR = "kartOutput";
    public static final String DEF_VALVAR = "(state, errorState)";
    public static final String DEF_PREVINVAR = "kartPrevInput";
    public static final String DEF_SIGNALVAR = "errorSignal";
}
