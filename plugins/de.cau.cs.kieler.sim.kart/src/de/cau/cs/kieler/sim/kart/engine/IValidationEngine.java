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

import java.util.List;
import java.util.Map;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.esi.ISignal;

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
     * @param key the name of the variable
     * @param recValue the recorded value of the variable, taken from an ESO file
     * @param simValue the simulated value of the variable
     * @param isHistoryStep flag to indicate that the user is stepping through history
     * @throws KiemExecutionException if the variable is invalid
     */
    public void validateVariable(String key, String recValue, String simValue, boolean isHistoryStep)
            throws KiemExecutionException;

    /**
     * Validate a set of signals. The lists only contain present signals and also their value,
     * should they be valued signals.
     * 
     * @param recSignals a list of recorded signals, taken from an ESO file
     * @param simSignals a list of simulated signals
     * @param isHistoryStep flag to indicate that the user is stepping through history
     * @param step the step number these signals were generated
     * @throws KiemExecutionException if one or more signals are invalid
     */
    public void validateSignals(List<ISignal> recSignals, Map<String, Object> simSignals,
            boolean isHistoryStep, long step) throws KiemExecutionException;
}
