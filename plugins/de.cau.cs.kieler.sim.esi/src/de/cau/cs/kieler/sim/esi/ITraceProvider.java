/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.esi;

import java.util.List;

import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

/**
 * Interface for all generic trace providers, which can load a trace from some resource.
 * 
 * @author ctr
 * 
 */
public interface ITraceProvider {
    /**
     * load a trace from a file
     * 
     * @param fileName
     *            name of the trace file
     * @return List of traces
     * @throws KiemInitializationException
     *             thrown for any parse error
     */
    List<ITrace> loadTrace(String fileName) throws KiemInitializationException;

    /**
     * 
     * @return file extensions for all trace files that can be handled by the trace provider.
     */
    String[] getExtensions();
}
