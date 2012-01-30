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
 * @author ssc
 *
 */
public class Constants {
    public static final String ESOFILE = "ESI/ESO trace file";
    public static final String TRACENUM = "Trace number to replay";
    public static final String IGNOREEXTRA = "Ignore additionally generated signals";
    public static final String TRAINMODE = "Training mode";
    public static final String CONFIGVAR = "Configuration variable";
    public static final String OUTPUTVAR = "Output signals/variables variable name";
    public static final String PREVINVAR = "Previous input signals variable name";
    public static final String VALVAR = "Names of variables to validate and their respective error variable names";
    
    public static final String[] FILEEXTS = { "*.eso", "*.esi" };
    public static final String[] FILEEXTNAMES = { "ESO", "ESI" };
    
    public static final String ERR_NOTESO = "The replay file provided is not an .esi or .eso file";
    public static final String ERR_NOTRACE = "The trace file does not contain a trace number ";
    public static final String ERR_JSON = "Could not build JSON object with signals read from ESO file";
    public static final String ERR_EMPTYESO = "Trace file is empty or does not exist.";
    public static final String ERR_WRITE = "An error occurred when writing the ESO trace file";
    public static final String ERR_READ = "An error occurred when reading the ESO trace file";
    
    public static final String VAL_TITLE = "Validation error";
    
    public static final String VAR_TRAINMODE = "trainmode";
    public static final String VAR_ESOFILE = "esofile";
    
    public static final String DEF_CONFIGVAR = "kartConfig";
    public static final String DEF_OUTPUTVAR = "kartOutput";
    public static final String DEF_VALVAR = "(state, errorStates)";
    public static final String DEF_PREVINVAR = "kartPrevInput";
}
