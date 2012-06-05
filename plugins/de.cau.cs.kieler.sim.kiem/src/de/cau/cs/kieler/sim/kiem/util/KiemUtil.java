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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;

/**
 * This is a utility class for File inputs, opening and URL conversion of bundle and workspace
 * files.
 * 
 * @author cmot
 * 
 */
public final class KiemUtil {

    // -------------------------------------------------------------------------

    /**
     * KiemUtil should not be instantiate.
     */
    private KiemUtil() {
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is bundle file.
     * 
     * @param fileAbsolute
     *            the file absolute
     * @return true, if is bundle file
     */
    public static boolean isBundleFile(final URL fileAbsolute) {
        return (fileAbsolute.toString().contains("bundleentry"));
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the plugin id to a given bundle file URL like
     * "bundleentry://189.fwk22643639/testdata/03-goodcycle.s".
     * 
     * @param fileAbsolute
     *            the file absolute
     * @return the plugin id
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static String getPluginID(final URL fileAbsolute) throws IOException {
        // if bundle entry then just to string
        if (isBundleFile(fileAbsolute)) {
            URL resolvedFileAbsolute = FileLocator.resolve(fileAbsolute);
            String fileRelative = fileAbsolute.getFile();
            String pluginID = resolvedFileAbsolute.toString();
            pluginID = pluginID.substring(0, pluginID.length() - fileRelative.length());
            pluginID = pluginID.substring(pluginID.lastIndexOf("/") + 1);
            return pluginID;
        } else {
            return null;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Open bundle or workspace file.
     * 
     * @param fileAbsolute
     *            the file absolute
     * @return the input stream
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static InputStream openBundleOrWorkspaceFile(final URL fileAbsolute) throws IOException {
        String pluginID = getPluginID(fileAbsolute);
        return openBundleOrWorkspaceFile(fileAbsolute, pluginID);
    }

    // -------------------------------------------------------------------------

    /**
     * Open a bundle or workspace file and returns an InputStream.
     * 
     * @param fileAbsolute
     *            the file absolute
     * @param pluginID
     *            the plugin id
     * @return the input stream
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static InputStream openBundleOrWorkspaceFile(final URL fileAbsolute,
            final String pluginID) throws IOException {
        // if bundle entry then just to string
        if (isBundleFile(fileAbsolute)) {
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

    /**
     * Gets the absolute file path.
     * 
     * @param url
     *            the url
     * @return the absolute file path
     */
    public static String getAbsoluteFilePath(final URL url) {
        // if bundle entry then just to string
        if (url.toString().contains("bundleentry")) {
            return url.toString();
        }
        IPath urlPath = new Path(url.getFile());
        return getAbsoluteFilePath(urlPath);
    }

    // -------------------------------------------------------------------------
    /**
     * Creates the URL from string and try no normalize backslashes.
     *
     * @param fileLocation the file location
     * @return the uRL
     */
//    public static URL createURLfromWorkspaceRelativeString(final String urlString)
//            throws MalformedURLException {
//        String fileSeparator = System.getProperty("file.separator");
//        String urlString2 = urlString.replaceAll("\\\\", "/"); // as \ is an escape character in
//                                                               // a String AND a RegEx
//        Path path = new Path(urlString);
//        path.URL returnURL = new URL(urlString2);
//        return returnURL;
//    }

    // -------------------------------------------------------------------------

    /**
     * Resolve a bundle or workspace file from a String representation. If it starts with a
     * bundleentry, then it is already resolved as a bundle file. Otherwise we first look
     * relative to the KIEM plugin and then in the current workspace.
     * 
     * @param fileLocation
     *            the file location
     * @return the uRL
     * @throws URISyntaxException 
     * @throws MalformedURLException 
     */
    public static URL resolveBundleOrWorkspaceFile(final String fileLocation) throws MalformedURLException, URISyntaxException {
        String pluginID = KiemPlugin.PLUGIN_ID;
        return resolveBundleOrWorkspaceFile(fileLocation, pluginID);
    }

    // -------------------------------------------------------------------------

    /**
     * Resolve a bundle or workspace file from a String representation. If it starts with a
     * bundleentry, then it is already resolved as a bundle file. Otherwise we first look
     * relative to the bundle/plugin and then in the bundles current workspace.
     *
     * @param fileLocation the file location
     * @param pluginID the plugin id
     * @return the uRL
     * @throws MalformedURLException the malformed url exception
     * @throws URISyntaxException the uRI syntax exception
     */
    public static URL resolveBundleOrWorkspaceFile(final String fileLocation, final String pluginID) 
            throws MalformedURLException, URISyntaxException {
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        
        // as \ is an escape character in a String AND a RegEx
        String fileLocation2 = fileLocation.replaceAll("\\\\", "/"); 

        URL fileURL = null;
        if (fileLocation2.contains("bundleentry")) {
            // already resolved bundle file
            try {
                fileURL = new URI(fileLocation2).toURL();
            } catch (Exception e) {
                // ignore errors
            }
        } else {
            // if the bundle is not ready then there is no image
            final Bundle bundle = Platform.getBundle(pluginID);

            // first try to resolve bundle files (give preference to bundle files)
            fileURL = org.eclipse.core.runtime.FileLocator.find(bundle, new Path(fileLocation2),
                    null);
            // then try to resolve workspace files
            if (fileURL == null) {
                fileURL = bundle.getResource(fileLocation2);
            }
            
            // try to resolve workspace files as absolute files
            if (fileURL == null) {
                IFile file = myWorkspaceRoot.getFile(new Path(fileLocation2));
                String fileString = myWorkspaceRoot
                        .getFile(file.getFullPath()).getLocation()
                        .toString();  
                fileURL = new URI("file://" + fileString).toURL();
            }
        }
        return fileURL;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the absolute file path.
     * 
     * @param ifile
     *            the file
     * @return the absolute file path
     */
    // To resolve references to locations outside the workspace
    // org.eclipse.core.internal.resources.Resource seems to be needed.
    // Is there a better alternative? -> "restriction"
    @SuppressWarnings({ "restriction" })
    public static String getAbsoluteFilePath(final IFile ifile) {
        IPath fullPath = ifile.getLocation();
        // If we have spaces, try it like this...
        if (fullPath == null && ifile instanceof org.eclipse.core.internal.resources.Resource) {
            org.eclipse.core.internal.resources.Resource resource = (org.eclipse.core.internal.resources.Resource) ifile;
            fullPath = resource.getLocalManager().locationFor(resource);
        }
        return (getAbsoluteFilePath(fullPath));
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the absolute file path.
     * 
     * @param ipath
     *            the ipath
     * @return the absolute file path
     */
    public static String getAbsoluteFilePath(final IPath ipath) {
        // if bundle entry then just to string
        if (ipath.toString().contains("bundleentry")) {
            return ipath.toString();
        }
        // Ensure it is absolute
        ipath.makeAbsolute();
        java.io.File javaFile = new File(ipath.toString().replaceAll("%20", " "));
        if (javaFile.exists()) {
            String fileString = javaFile.getAbsolutePath();
            return fileString;
        }
        // Something went wrong, we could not resolve the file location
        return null;
    }

    // -------------------------------------------------------------------------

}
