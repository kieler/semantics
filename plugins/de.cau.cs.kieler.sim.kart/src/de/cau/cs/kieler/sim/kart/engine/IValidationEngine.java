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
package de.cau.cs.kieler.sim.kart.engine;

import java.util.Map;
import org.json.JSONObject;
import de.cau.cs.kieler.core.util.Pair;

/**
 * Interface to define an API for validation engines that can check the validity
 * of a simulation run. Engines can check for validity of variables or signals or both.
 * A default example implementation is given in DefaultValidationEngine.
 * 
 * @see DefaultValidationEngine
 * @author Sebastian Schäfer - ssc AT informatik.uni-kiel.de
 * @kieler.rating 2012-01-24 red
 * 
 */
public interface IValidationEngine {
    /**
     * Validate a single variable. A variable is generally seen as valid when
     * simValue equals recValue.
     * 
     * @param variable the names of the variable and the respective error variable
     * @param recValue the recorded value of the variable, taken from an ESO file
     * @param simValue the simulated value of the variable
     * @param isHistoryStep flag to indicate that the user is stepping through history
     * @param retval the JSON object that will be injected into the data pool
     */
    public void validateVariable(Pair<String,String> variable, Object recValue, String simValue, boolean isHistoryStep, JSONObject retval);

    /**
     * Validate a set of signals. The lists only contain present signals and also their value,
     * should they be valued signals.
     * 
     * @param recSignals a list of recorded signals, taken from an ESO file
     * @param simSignals the JSON object representing the data pool
     * @param isHistoryStep flag to indicate that the user is stepping through history
     * @param errSignalVar the name of the variable informing about erroneous signals
     * @param retval the JSON object that will be injected into the simulation
     */
    public void validateSignals(Map<String,Object> recSignals, Map<String,String> simSignals,
            boolean isHistoryStep, String errSignalVar, JSONObject retval);
}
