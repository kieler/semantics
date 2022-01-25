/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.eso;

import java.io.FileNotFoundException;
import java.util.List;

import org.eclipse.core.runtime.IPath;

import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

/**
 * Interface for all generic trace providers, which can load a trace from some resource.
 * 
 * @author ctr
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 * 
 */
public interface ITraceProvider {
    /**
     * load a trace from a file
     * 
     * @param fileName
     *            the trace file
     * @return List of traces
     * @throws KiemInitializationException
     *             thrown for any parse error
     */
    List<ITrace> loadTrace(IPath file) throws KiemInitializationException, FileNotFoundException;

    /**
     * 
     * @return file extensions for all trace files that can be handled by the trace provider.
     */
    String[] getExtensions();
}
