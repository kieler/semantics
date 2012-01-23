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
 * @author ssc
 * 
 */
public interface IValidationEngine {
    public void validateVariable(String key, String recValue, String simValue, boolean isHistoryStep)
            throws KiemExecutionException;

    public void validateSignals(List<ISignal> recSignals, Map<String, Object> simSignals,
            boolean isHistoryStep, long step) throws KiemExecutionException;
}
