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
 * Contains nearly all Strings KART uses internally for configuration or to interact with the user.
 * 
 * @author ssc, cmot
 * @kieler.rating 2012-02-23 red
 */
public final class KartConstants {

    /** The Constant PLUGINID. */
    public static final String PLUGINID = "de.cau.cs.kieler.sim.kart";

    /** The Constant KART_REPLAY_DATACOMPONENT_ID_START. */
    public static final String KART_REPLAY_DATACOMPONENT_ID_START = "de.cau.cs.kieler.sim.kart.replay";

    /** The Constant KART_VALIDATION_DATACOMPONENT_ID_START. */
    public static final String KART_VALIDATION_DATACOMPONENT_ID_START = "de.cau.cs.kieler.sim.kart"
            + ".validation";

    /** The Constant KART_EXTENSION_MESSAGEDIALOG. */
    public static final String KART_EXTENSION_MESSAGEDIALOG = "de.cau.cs.kieler.sim.kart.MessageDialog";

    /** The Constant KIEM_PROPERTY_REPLAY_NUMBER. */
    public static final int KIEM_PROPERTY_REPLAY_NUMBER = 6;

    /** The Constant KIEM_PROPERTY_REPLAY_TRACENUM. */
    public static final int KIEM_PROPERTY_REPLAY_TRACENUM = 0;

    /** The Constant KIEM_PROPERTY_REPLAY_TRAINMODE. */
    public static final int KIEM_PROPERTY_REPLAY_TRAINMODE = 1;

    /** The Constant KIEM_PROPERTY_REPLAY_CONFIGVAR. */
    public static final int KIEM_PROPERTY_REPLAY_CONFIGVAR = 2;

    /** The Constant KIEM_PROPERTY_REPLAY_OUTPUTVAR. */
    public static final int KIEM_PROPERTY_REPLAY_OUTPUTVAR = 3;

    /** The Constant KIEM_PROPERTY_REPLAY_PREVINVAR. */
    public static final int KIEM_PROPERTY_REPLAY_PREVINVAR = 4;

    /** The Constant KIEM_PROPERTY_REPLAY_STOPEXECUTION. */
    public static final int KIEM_PROPERTY_REPLAY_STOPEXECUTION = 5;

    /** The Constant KIEM_PROPERTY_VALIDATION_NUMBER. */
    public static final int KIEM_PROPERTY_VALIDATION_NUMBER = 6;

    /** The Constant KIEM_PROPERTY_VALIDATION_CONFIGVAR. */
    public static final int KIEM_PROPERTY_VALIDATION_CONFIGVAR = 0;

    /** The Constant KIEM_PROPERTY_VALIDATION_OUTPUTVAR. */
    public static final int KIEM_PROPERTY_VALIDATION_OUTPUTVAR = 1;

    /** The Constant KIEM_PROPERTY_VALIDATION_PREVINVAR. */
    public static final int KIEM_PROPERTY_VALIDATION_PREVINVAR = 2;

    /** The Constant KIEM_PROPERTY_VALIDATION_VALVAR. */
    public static final int KIEM_PROPERTY_VALIDATION_VALVAR = 3;

    /** The Constant KIEM_PROPERTY_VALIDATION_SIGNALVAR. */
    public static final int KIEM_PROPERTY_VALIDATION_SIGNALVAR = 4;

    /** The Constant KIEM_PROPERTY_VALIDATION_IGNOREEXTRA. */
    public static final int KIEM_PROPERTY_VALIDATION_IGNOREEXTRA = 5;

    /** The Constant ESO_FILEEXTENSION. */
    public static final String ESO_FILEEXTENSION = "eso";

    /** The Constant TRACENUM. */
    public static final String TRACENUM = "Trace number to replay";

    /** The Constant IGNOREEXTRA. */
    public static final String IGNOREEXTRA = "Ignore additionally generated signals";

    /** The Constant TRAINMODE. */
    public static final String TRAINMODE = "Training mode";

    /** The Constant CONFIGVAR. */
    public static final String CONFIGVAR = "Configuration variable";

    /** The Constant OUTPUTVAR. */
    public static final String OUTPUTVAR = "Output signals/variables variable name";

    /** The Constant PREVINVAR. */
    public static final String PREVINVAR = "Previous input signals variable name";

    /** The Constant VALVAR. */
    public static final String VALVAR = "Names of variables to validate and their respective "
            + "error variable names";

    /** The Constant SIGNALVAR. */
    public static final String SIGNALVAR = "Erroneous signals variable";

    /** The Constant STOPEXECUTION. */
    public static final String STOPEXECUTION = "Stop execution upon end of ESO file";

    /** The Constant FILEEXTS. */
    public static final String[] FILEEXTS = { "*.eso", "*.esi" };

    /** The Constant FILEEXTNAMES. */
    public static final String[] FILEEXTNAMES = { "ESO", "ESI" };

    /** The Constant ERR_NOTEXISTESO. */
    public static final String ERR_NOTEXISTESO = "The replay ESO file to the provided "
            + "model does not exist!";

    /** The Constant ERR_NEEDESO. */
    public static final String ERR_NEEDESO = "You must set an ESO filename!";

    /** The Constant ERR_NOTRACE. */
    public static final String ERR_NOTRACE = "The trace file does not contain a trace number ";

    /** The Constant ERR_JSON. */
    public static final String ERR_JSON = "Could not build JSON object with signals read from ESO file";

    /** The Constant ERR_EMPTYESO. */
    public static final String ERR_EMPTYESO = "Trace file is empty or does not exist.";

    /** The Constant ERR_WRITE. */
    public static final String ERR_WRITE = "An error occurred when writing the ESO trace file";

    /** The Constant ERR_READ. */
    public static final String ERR_READ = "An error occurred when reading the ESO trace file, "
            + "maybe the file is empty or corrupted. Please check the file and maybe record fresh.";

    /** The Constant ERR_NOTFOUND_TITLE. */
    public static final String ERR_NOTFOUND_TITLE = "Trace file could not be found";

    /** The Constant ERR_NOTFOUND. */
    public static final String ERR_NOTFOUND = "The trace file could not be found. Do you want to"
            + " switch to training mode?";

    /** The Constant OVERWRITE_TITLE. */
    public static final String OVERWRITE_TITLE = "Overwrite trace file?";

    /** The Constant OVERWRITE. */
    public static final String OVERWRITE = "Do you want to replace the current trace file with this "
            + "trace? If not, the current trace will be appended to the existing trace file";

    /** The Constant ERR_SILENT. */
    public static final boolean ERR_SILENT = true;

    /** The Constant VAL_TITLE. */
    public static final String VAL_TITLE = "Validation error";

    /** The Constant VAR_TRAINMODE. */
    public static final String VAR_TRAINMODE = "trainmode";

    /** The Constant VAR_ESOFILE. */
    public static final String VAR_ESOFILE = "esofile";

    /** The Constant VAR_EOT. */
    public static final String VAR_EOT = "eot";

    /** The Constant DEF_CONFIGVAR. */
    public static final String DEF_CONFIGVAR = "kartConfig";

    /** The Constant DEF_OUTPUTVAR. */
    public static final String DEF_OUTPUTVAR = "kartOutput";

    /** The Constant DEF_VAL_STATE. */
    public static final String DEF_VAL_STATE = "state";

    /** The Constant DEF_VAL_ERRORSTATE. */
    public static final String DEF_VAL_ERRORSTATE = "errorState";

    /** The Constant DEF_VALVAR. */
    public static final String DEF_VALVAR = "(" + DEF_VAL_STATE + ", " + DEF_VAL_ERRORSTATE + ")";

    /** The Constant DEF_PREVINVAR. */
    public static final String DEF_PREVINVAR = "kartPrevInput";

    /** The Constant DEF_SIGNALVAR. */
    public static final String DEF_SIGNALVAR = "errorSignal";

    // -------------------------------------------------------------------------

    /**
     * Utility class should not be instantiated.
     */
    private KartConstants() {
    }
}
