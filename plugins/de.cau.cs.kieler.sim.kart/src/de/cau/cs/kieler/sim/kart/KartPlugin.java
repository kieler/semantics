/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kart;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.core.runtime.IPath;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.sim.kiem.util.KiemUtil;

/**
 * This activator class controls the lifecycle of the KartPlugin.
 * 
 * @author ssc, cmot
 * @kieler.design 2012-02-23 cmot
 * @kieler.rating 2012-02-23 yellow cmot
 * 
 */
public class KartPlugin implements BundleActivator {

    /**
     * The id used to separate traces within ESO files is used to count the number of available
     * traces.
     */
    private static final String ESO_FILE_RESET_TRACE_ID1 = "!";
    private static final String ESO_FILE_RESET_TRACE_ID2 = "reset;";
    
    // ---------------------------------------------------------------------

    /**
     * Start.
     * 
     * @param bundleContext
     *            the bundle context
     * @throws Exception
     *             the exception
     * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
     */
    public void start(final BundleContext bundleContext) throws Exception {
    }

    // ---------------------------------------------------------------------

    /**
     * Stop.
     * 
     * @param bundleContext
     *            the bundle context
     * @throws Exception
     *             the exception
     * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    public void stop(final BundleContext bundleContext) throws Exception {
    }

    // ---------------------------------------------------------------------

    /**
     * Gets the number of traces of an eso file.
     * 
     * @param esoFilePath
     *            the ESO file path
     * @return the number of traces
     */
    public static int getNumberOfTraces(final IPath esoFilePath) {
        try {
            InputStream inputStream = KiemUtil.openWorkspaceFile(esoFilePath);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            int number = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(ESO_FILE_RESET_TRACE_ID1) && line.contains(ESO_FILE_RESET_TRACE_ID2)) {
                    number++;
                }
            }
            bufferedReader.close();
            inputStream.close();
            return number;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Cannot load ESO file '" + esoFilePath.toString()
                    + "' in order to count the maximum number of traces. (FileNotFoundException)");
        } catch (IOException e) {
            throw new RuntimeException("Cannot load ESO file '" + esoFilePath.toString()
                    + "' in order to count the maximum number of traces. (IOException)");
        }
    }

    // -------------------------------------------------------------------------
}
