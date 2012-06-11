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
import java.util.Collections;
import java.util.Random;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
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

    public static final String HEADLESS_PROPERTY = "surefire";
    
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
     * @param relativeFilePath
     *            the relative file path
     * @param pluginID
     *            the plugin id
     * @return the input stream
     * @throws CoreException
     *             the core exception
     */
    public static InputStream openBundleOrWorkspaceFile(final IPath relativeFilePath,
            final String pluginID) throws CoreException {
        InputStream inputStream = null;
        try {
            inputStream = openBundleFile(relativeFilePath, pluginID);
        } catch (Exception e) {
            inputStream = openWorkspaceFile(relativeFilePath);
        }
        return inputStream;
    }

    // -------------------------------------------------------------------------

    /**
     * Open a bundle file and returns an InputStream.
     * 
     * @param relativeFilePath
     *            the relative file path
     * @return the input stream
     * @throws CoreException
     *             the core exception
     */
    public static InputStream openWorkspaceFile(final IPath relativeFilePath) throws CoreException {
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        IFile relativeFile = myWorkspaceRoot.getFile(relativeFilePath);
        return relativeFile.getContents();
    }

    // -------------------------------------------------------------------------

    /**
     * Open a bundle or workspace file and returns an InputStream.
     * 
     * @param relativeFilePath
     *            the relative file path
     * @param pluginID
     *            the plugin id
     * @return the input stream
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static InputStream openBundleFile(final IPath relativeFilePath, final String pluginID)
            throws IOException {
        // TODO: is this working with ?
        final Bundle bundle = Platform.getBundle(pluginID);
        URL bundleFileUrl = bundle.getEntry(relativeFilePath.toString());

        URL absoluteBundleUrl = KiemUtil.getAbsoluteBundlePath(bundleFileUrl);
        String absoluteBundlePathString = KiemUtil.getAbsoluteFilePath(absoluteBundleUrl);

        FileInputStream fileInputStream = new FileInputStream(absoluteBundlePathString);

        return fileInputStream;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the resolved absolute file path.
     * 
     * @param fullBundlePath
     *            the full bundle path
     * @return the resolved absolute file path
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static URL getAbsoluteBundlePath(final URL fullBundleUrl) throws IOException {
        System.out.println("fullBundleUrl:" + fullBundleUrl);
        URL absoluteBundlePath = FileLocator.resolve(fullBundleUrl);
        return absoluteBundlePath;
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
            org.eclipse.core.internal.resources.Resource resource = null;
            resource = (org.eclipse.core.internal.resources.Resource) ifile;
            fullPath = resource.getLocalManager().locationFor(resource);
        }
        return (getAbsoluteFilePath(fullPath));
    }

    // -------------------------------------------------------------------------

    public static String getAbsoluteJavaIOPath(String resolvedPathString) {
        java.io.File javaFile = new File(resolvedPathString.replaceAll("%20", " "));
        if (javaFile.exists()) {
            String fileString = javaFile.getAbsolutePath();
            return fileString;
        }
        // Something went wrong, we could not resolve the file location
        return null;
    }

    /**
     * Gets the absolute file path.
     * 
     * @param ipath
     *            the ipath
     * @return the absolute file path
     */
    public static String getAbsoluteFilePath(final IPath resolvedPath) {
        // if bundle entry then just to string
        if (resolvedPath.toString().contains("bundleentry")) {
            return resolvedPath.toString();
        }
        // Ensure it is absolute
        resolvedPath.makeAbsolute();
        java.io.File javaFile = new File(resolvedPath.toString().replaceAll("%20", " "));
        if (javaFile.exists()) {
            String fileString = javaFile.getAbsolutePath();
            return fileString;
        }
        // Something went wrong, we could not resolve the file location
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Resolve a bundle or workspace file from a String representation. If it starts with a
     * bundleentry, then it is already resolved as a bundle file. Otherwise we first look relative
     * to the KIEM plugin and then in the current workspace.
     * 
     * @param fileLocation
     *            the file location
     * @return the uRL
     * @throws MalformedURLException
     *             the malformed url exception
     * @throws URISyntaxException
     *             the uRI syntax exception
     */
    public static URL resolveBundleOrWorkspaceFile(final String fileLocation)
            throws MalformedURLException, URISyntaxException {
        String pluginID = KiemPlugin.PLUGIN_ID;
        return resolveBundleOrWorkspaceFile(fileLocation, pluginID);
    }

    // -------------------------------------------------------------------------

    /**
     * Resolve a bundle or workspace file from a String representation. If it starts with a
     * bundleentry, then it is already resolved as a bundle file. Otherwise we first look relative
     * to the bundle/plugin and then in the bundles current workspace.
     * 
     * @param fileLocation
     *            the file location
     * @param pluginID
     *            the plugin id
     * @return the uRL
     * @throws MalformedURLException
     *             the malformed url exception
     * @throws URISyntaxException
     *             the uRI syntax exception
     */
    public static URL resolveBundleOrWorkspaceFile(final String fileLocation, final String pluginID)
            throws MalformedURLException, URISyntaxException {
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

            // then try to resolve workspace files
            if (fileURL == null) {
                fileURL = resolveWorkspaceFile(fileLocation);
            }
        }
        return fileURL;
    }

    // -------------------------------------------------------------------------
    /**
     * Resolve a workspace file from a String representation. If it starts with a bundleentry, then
     * it is already resolved as a bundle file. Otherwise we first look relative to the
     * bundle/plugin and then in the bundles current workspace.
     * 
     * @param fileLocation
     *            the file location
     * @return the uRL
     * @throws MalformedURLException
     *             the malformed url exception
     * @throws URISyntaxException
     *             the uRI syntax exception
     */
    public static URL resolveWorkspaceFile(final String fileLocation) throws MalformedURLException,
            URISyntaxException {
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

        // as \ is an escape character in a String AND a RegEx
        String fileLocation2 = fileLocation.replaceAll("\\\\", "/");

        URL fileURL = null;
        if (fileLocation2.contains("bundleentry")) {
            return null;
        } else {

            // try to resolve workspace files as absolute files
            if (fileURL == null) {
                IFile file = myWorkspaceRoot.getFile(new Path(fileLocation2));
                String fileString = file.getLocation().toString();
                fileURL = new URI("file://" + fileString).toURL();
            }
        }
        return fileURL;
    }

    // -------------------------------------------------------------------------

    /**
     * Creates a linked workspace file and opens the corresponding project. If cleanProject is true,
     * then the project will be deleted and re-created before.
     * 
     * @param fullBundlePath
     *            the full bundle path
     * @param workspaceProjectName
     *            the workspace project name
     * @param cleanProject
     *            the clean project
     * @param override
     *            the override
     * @return the i file
     * @throws CoreException
     *             the core exception
     * @throws URISyntaxException
     *             the uRI syntax exception
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static IFile createLinkedWorkspaceFile(final URL fullBundleUrl,
            final String workspaceProjectName, final boolean cleanProject, final boolean override)
            throws CoreException, URISyntaxException, IOException {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot workspaceRoot = workspace.getRoot();

        IProject project = workspaceRoot.getProject(workspaceProjectName);

        // if the test project exists, delete it
        if (cleanProject && project.exists()) {
            project.delete(true, null);
        }
        if (!project.exists()) {
            project.create(null);
        }
        if (!project.isOpen()) {
            project.open(null);
        }

        IFile workspaceLinkFile = null;
        // URL fullBundleUrl = KiemUtil.resolveBundleOrWorkspaceFile(fullBundlePath.toString());
        // URI fullBundleUri = org.eclipse.core.filesystem.URIUtil.toURI(fullBundlePath);
        // System.out.println("fullBundleUri:" + fullBundleUri);
        // URL fullBundleUrl = fullBundleUri.toURL();
        // System.out.println("fullBundleUrl:" + fullBundleUrl);

        URL absoluteBundleUrl = KiemUtil.getAbsoluteBundlePath(fullBundleUrl);
        String absoluteBundlePathString = KiemUtil.getAbsoluteFilePath(absoluteBundleUrl);
        IPath absoluteBundlePath = new Path(absoluteBundlePathString);
        workspaceLinkFile = project.getFile(absoluteBundlePath.lastSegment());
        if (override && workspaceLinkFile.exists()) {
            // delete old file
            workspaceLinkFile.delete(true, null);
        }
        if (!workspaceLinkFile.exists()) {
            workspaceLinkFile.createLink(absoluteBundlePath, IResource.NONE, null);
        }
        return workspaceLinkFile;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the input model as uri.
     * 
     * @param fileString
     *            the file string
     * @return the input model as uri
     */
    public static org.eclipse.emf.common.util.URI getFileStringAsEMFURI(final String fileString) {
        if (fileString == null) {
            return null;
        }
        String fileStringCopy = fileString;
        if (!fileStringCopy.startsWith("file://")) {
            fileStringCopy = "file://" + fileStringCopy;
        }
        org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
                .createURI(fileStringCopy.replaceAll(" ", "%20").replace("\\", "/"));
        return uri;
    }

    // -------------------------------------------------------------------------

    /**
     * Get the currently active editor if any was set by the
     * kiem.config.kivi.ModelSelectionCombination.
     * 
     * @return the currently active editor, or null
     */
    public static IEditorSite getActiveEditor() {
        IEditorSite editorSite = null;
        IPath currentModelPath = KiemPlugin.getCurrentModelFile();
        if (currentModelPath != null) {
            IEditorPart editor = KiemPlugin.getOpenedModelEditors().get(currentModelPath);
            if (editor != null) {
                editorSite = editor.getEditorSite();

            }
        }
        return editorSite;
    }

    // -------------------------------------------------------------------------

    /**
     * Load an EMF EObject from a model file.
     * 
     * @param modelFilePath
     *            the model file path
     * @return the e object
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static EObject loadEObjectFromModelFile(final IPath modelFilePath) throws IOException {
        // try to load it
        org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
                .createPlatformResourceURI(modelFilePath.toOSString(), true);
        Resource resource = new ResourceSetImpl().createResource(uri);
        resource.load(Collections.EMPTY_MAP);
        if (resource != null && resource.getContents() != null && resource.getContents().size() > 0) {
            EObject eobject = resource.getContents().get(0);
            return eobject;
        }
        throw new IOException("Resource '" + modelFilePath.toString()
                + "' loaded but no EMF model found inside.");
    }

    // -------------------------------------------------------------------------
    
    /**
     * Checks if this is a headless run.
     *
     * @return true, if is headless run
     */
    public static boolean isHeadlessRun() {
        for (String arg : Platform.getApplicationArgs()) {
            if (arg.contains(HEADLESS_PROPERTY)) {
                return true;
            }
        }
        return false;
    }
    
    // -------------------------------------------------------------------------

    /**
     * Generate a random temporary output folder in the java tempdir directory.
     *
     * @return the string
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static String generateRandomTempOutputFolder() throws IOException {
        String folderName = System.getProperty("java.io.tmpdir");
        if (!folderName.endsWith(File.separator)) {
            folderName += File.separator;
        }
        folderName += randomString() + File.separator;
        System.out.println("folderName:" + folderName);
        if (new File(folderName).mkdir()) {
            return (folderName);
        }
        throw new IOException("Could not create folder '" + folderName + "'.");
    }

    // -------------------------------------------------------------------------

    /**
     * Create random string of 16 letters/numbers.
     * 
     * @return the string
     */
    public static String randomString() {
        final int folderLength = 16;
        String allowedChars = "0123456789abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        int max = allowedChars.length();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < folderLength; i++) {
            int value = random.nextInt(max);
            buffer.append(allowedChars.charAt(value));
        }
        return buffer.toString();
    }

    // -------------------------------------------------------------------------

    /**
     * Delete folder.
     * 
     * @param directory
     *            the directory to be deleted
     * @return true, if successful
     */
    public static boolean deleteFolder(final File directory) {
        if (directory.isDirectory()) {
            String[] entries = directory.list();
            for (int x = 0; x < entries.length; x++) {
                File aktFile = new File(directory.getPath(), entries[x]);
                deleteFolder(aktFile);
            }
        }
        return directory.delete();
    }    
    
}
