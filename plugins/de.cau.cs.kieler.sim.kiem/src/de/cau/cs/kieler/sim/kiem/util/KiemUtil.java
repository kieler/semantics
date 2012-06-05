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

package de.cau.cs.kieler.sim.kiem.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;

/**
 * 
 * 
 * @author cmot
 * 
 */
public final class KiemUtil {

    /**
     * KiemUtil should not be instantiate.
     */
    private KiemUtil() {
    }

    /**
     * Open a bundle or workspace file and return an InputStream.
     * 
     * @param fileAbsolute
     *            the file absolute
     * @return the input stream
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    static InputStream openBundleOrWorkspaceFile(final URL fileAbsolute, final String pluginID)
            throws IOException {
        // if bundle entry then just to string
        if (fileAbsolute.toString().contains("bundleentry")) {
            // resolve relative workspace paths
            URIConverter uriConverter = new ExtensibleURIConverterImpl();
            String fileString = pluginID + fileAbsolute.getFile();
            org.eclipse.emf.common.util.URI fileURI = org.eclipse.emf.common.util.URI
                    .createPlatformPluginURI(fileString, false);
            InputStream inputStream = uriConverter.createInputStream(fileURI);
            return inputStream;
        } else {
            FileInputStream fis;
            fis = new FileInputStream(fileAbsolute.getFile());
            return fis;
        }
    }

    // -------------------------------------------------------------------------

}
