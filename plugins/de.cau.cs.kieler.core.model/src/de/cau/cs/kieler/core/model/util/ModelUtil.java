/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.core.model.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
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
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.Bundle;

/**
 * This is a utility class for File inputs, opening and URL conversion of bundle and workspace
 * files.
 * 
 * @author cmot
 * @kieler.rating 2012-10-08 proposed yellow
 * 
 */
public final class ModelUtil {

    /** The Constant HEADLESS_PROPERTY to dected a headless run by program/VM parameters. */
    public static final String HEADLESS_PROPERTY = "surefire";

    // -------------------------------------------------------------------------

    /**
     * KiemUtil should not be instantiate.
     */
    private ModelUtil() {
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
     * @throws FileNotFoundException
     *             the file not found exception
     */
    public static InputStream openBundleOrWorkspaceFile(final IPath relativeFilePath,
            final String pluginID) throws FileNotFoundException {
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
     * @throws FileNotFoundException
     *             the file not found exception
     */
    public static OutputStream createWorkspaceFile(final IPath relativeFilePath)
            throws FileNotFoundException {
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        IFile relativeFile = myWorkspaceRoot.getFile(relativeFilePath);
        IPath rawLocation = relativeFile.getRawLocation();
        OutputStream outputStream;
        outputStream = new FileOutputStream(rawLocation.toString());
        return outputStream; // relativeFile.getContents(true);
    }

    // -------------------------------------------------------------------------

    /**
     * Open a bundle file and returns an InputStream.
     * 
     * @param relativeFilePath
     *            the relative file path
     * @return the input stream
     * @throws FileNotFoundException
     *             the file not found exception
     */
    public static InputStream openWorkspaceFile(final IPath relativeFilePath)
            throws FileNotFoundException {
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        IFile relativeFile = myWorkspaceRoot.getFile(relativeFilePath);
        IPath rawLocation = relativeFile.getRawLocation();
        InputStream inputStream;
        inputStream = new FileInputStream(rawLocation.toString());
        return inputStream; // relativeFile.getContents(true);
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
        final Bundle bundle = Platform.getBundle(pluginID);
        URL bundleFileUrl = bundle.getEntry(relativeFilePath.toString());

        URL absoluteBundleUrl = getAbsoluteBundlePath(bundleFileUrl);
        String absoluteBundlePathString = getAbsoluteFilePath(absoluteBundleUrl);

        FileInputStream fileInputStream = new FileInputStream(absoluteBundlePathString);

        return fileInputStream;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the resolved absolute file path.
     * 
     * @param fullBundleUrl
     *            the full bundle url
     * @return the resolved absolute file path
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static URL getAbsoluteBundlePath(final URL fullBundleUrl) throws IOException {
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
     * Convert i path to i file.
     * 
     * @param path
     *            the path
     * @return the i file
     */
    public static IFile convertIPathToIFile(final IPath path) {
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        IFile file = myWorkspaceRoot.getFile(path);
        return file;
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
        return (getAbsoluteFilePath(ifile.getLocation()));
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the absolute java io path.
     * 
     * @param resolvedPathString
     *            the resolved path string
     * @return the absolute java io path
     */
    public static String getAbsoluteJavaIOPath(final String resolvedPathString) {
        java.io.File javaFile = new File(resolvedPathString.replaceAll("%20", " "));
        if (javaFile.exists()) {
            String fileString = javaFile.getAbsolutePath();
            return fileString;
        }
        // Something went wrong, we could not resolve the file location
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the absolute file path.
     * 
     * @param resolvedPath
     *            the resolved path
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
        return resolvedPath.toString();
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
    // public static URL resolveBundleOrWorkspaceFile(final String fileLocation)
    // throws MalformedURLException, URISyntaxException {
    // String pluginID = KiemPlugin.PLUGIN_ID;
    // return resolveBundleOrWorkspaceFile(fileLocation, pluginID);
    // }

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
        String fileLocation2 = fileLocation.replaceAll("\\\\", "/").replace("%20", " ");

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
            fileURL =
                    org.eclipse.core.runtime.FileLocator
                            .find(bundle, new Path(fileLocation2), null);
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
        String fileLocation2 = fileLocation.replaceAll("\\\\", "/").replace("%20", " ");

        URL fileURL = null;
        if (fileLocation2.contains("bundleentry")) {
            return null;
        } else {

            // try to resolve workspace files as absolute files
            if (fileURL == null) {
                IFile file = myWorkspaceRoot.getFile(new Path(fileLocation2));
                String fileString = file.getLocation().toString();
                fileURL = new URI("file://" + fileString.replace(" ", "%20")).toURL();
            }
        }
        return fileURL;
    }

    // -------------------------------------------------------------------------

    /**
     * Creates a linked workspace file and opereturn
     * XtextModelingUtil.getModelFromXtextEditor((XtextEditor)editor, true);ns the corresponding
     * project. If cleanProject is true, then the project will be deleted and re-created before.
     * 
     * @param fullBundleUrl
     *            the full bundle url
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

        URL absoluteBundleUrl = getAbsoluteBundlePath(fullBundleUrl);
        String absoluteBundlePathString = getAbsoluteFilePath(absoluteBundleUrl);
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
        if (!fileStringCopy.startsWith("file:/")) {
            fileStringCopy = "file://" + fileStringCopy;
        }
        org.eclipse.emf.common.util.URI uri =
                org.eclipse.emf.common.util.URI.createURI(fileStringCopy.replaceAll(" ", "%20")
                        .replace("\\", "/"));
        return uri;
    }

    // -------------------------------------------------------------------------

    /**
     * Get the currently active editor if any was set by the
     * kiem.config.kivi.ModelSelectionCombination.
     * 
     * @return the currently active editor, or null
     */
    // public static IEditorSite getActiveEditor() {
    // IEditorSite editorSite = null;
    // IPath currentModelPath = KiemPlugin.getCurrentModelFile();
    // if (currentModelPath != null) {
    // IEditorPart editor = KiemPlugin.getOpenedModelEditors().get(currentModelPath);
    // if (editor != null) {
    // editorSite = editor.getEditorSite();
    // }
    // }
    // return editorSite;
    // }

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
        org.eclipse.emf.common.util.URI uri =
                org.eclipse.emf.common.util.URI.createPlatformResourceURI(
                        modelFilePath.toOSString(), true);
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
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static String generateRandomTempOutputFolder() throws IOException {
        String folderName = System.getProperty("java.io.tmpdir");
        if (!folderName.endsWith(File.separator)) {
            folderName += File.separator;
        }
        folderName += randomString() + File.separator;
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

    // -------------------------------------------------------------------------

    /**
     * Save a collection of models to the given URI.
     * 
     * @param models
     *            the models to store in the new file
     * @param uri
     *            the target file URI
     * @throws IOException
     *             if an error occurs while saving
     */
    public static void saveModel(final List<EObject> models,
            final org.eclipse.emf.common.util.URI uri) throws IOException {
        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();
        // Create a resource for this file.
        Resource resource = resourceSet.createResource(uri);
        // Add the model objects to the contents.
        resource.getContents().addAll(models);
        // Save the contents of the resource to the file system.
        resource.save(Collections.EMPTY_MAP);
    }

    /**
     * Save a model to the given URI.
     * 
     * @param model
     *            the model to store in the new file
     * @param uri
     *            the target file URI
     * @throws IOException
     *             if an error occurs while saving
     */
    public static void saveModel(final EObject model, final org.eclipse.emf.common.util.URI uri)
            throws IOException {
        LinkedList<EObject> list = new LinkedList<EObject>();
        list.add(model);
        saveModel(list, uri);
    }

    // -------------------------------------------------------------------------
    // DEPRECATED METHODS FROM ModelingUtil - DO NOT USE, ELIMINATE USE
    // -------------------------------------------------------------------------

    /**
     * Get all objects that are direct or indirect children of the given root EObject if they are of
     * the specified type.
     * 
     * @param eObjectClass
     *            The type of object
     * @param rootObject
     *            The root object
     * @return Collection of found EObject matching the type
     * @deprecated This is very inefficient.
     */
    public static Collection<EObject> getAllByType(final EClassifier eObjectClass,
            final EObject rootObject) {
        TreeIterator<Object> iterator = EcoreUtil.getAllContents(rootObject, true);
        Collection<EObject> elements =
                EcoreUtil.getObjectsByType(iterator2Collection(iterator), eObjectClass);
        return elements;
    }

    /**
     * Get all objects that are direct or indirect parents of the given root EObject if they are of
     * the given type.
     * 
     * @param eObjectClass
     *            The type of object
     * @param rootObject
     *            The root object to start the search
     * @return Collection of found EObject matching the type
     * @deprecated This is very inefficient.
     */
    public static Collection<EObject> getAllAncestorsByType(final EClassifier eObjectClass,
            final EObject rootObject) {
        Collection<EObject> ancestors = new ArrayList<EObject>();
        EObject parent = rootObject.eContainer();
        while (parent != null) {
            ancestors.add(parent);
            parent = rootObject.eContainer();
        }
        Collection<EObject> elements = EcoreUtil.getObjectsByType(ancestors, eObjectClass);
        return elements;
    }

    /**
     * Convert an Iterator to a Collection. Useful if some method returns only an iterator but some
     * other method takes a Collection as input to iterate over that collection. However, it has
     * linear runtime and many such transformations should be avoided.
     * 
     * @param <T>
     *            the base type
     * @param iter
     *            The input Iterator
     * @return A Collection containing all elements of the Iterator.
     * @deprecated Guava probably has a better alternative to this implementation.
     */
    public static <T> Collection<T> iterator2Collection(final Iterator<T> iter) {
        ArrayList<T> list = new ArrayList<T>();
        for (; iter.hasNext();) {
            T item = iter.next();
            list.add(item);
        }
        return list;
    }

    /**
     * Translate a KIELER URI to an EMF Fragment URI.
     * 
     * @param kielerUri
     *            The KIELER URI referring an EObject.
     * @param resource
     *            The Resource holding the EObject.
     * @return The Fragment URI for the EObject referred by the given KIELER URI. Null, if EObject
     *         doesn't exists.
     */
    public static String kielerUriToFragmentUri(final String kielerUri, final Resource resource) {
        return kielerUriToFragmentUri(kielerUri, resource, "name");
    }

    /**
     * Translate a KIELER URI to an EMF Fragment URI.
     * 
     * @param kielerUri
     *            The KIELER URI referring an EObject.
     * @param resource
     *            The Resource holding the EObject.
     * @param nameProperty
     *            the name of the structural feature that is used to get a name for elements
     * @return The Fragment URI for the EObject referred by the given KIELER URI. Null, if EObject
     *         doesn't exists.
     */
    public static String kielerUriToFragmentUri(final String kielerUri, final Resource resource,
            final String nameProperty) {
        String result = "";

        try {
            if (resource.getEObject(kielerUri) != null) {
                // when EObjects aren't named, the KIELER URI equals the Fragment URI
                return kielerUri;
            }
        } catch (IllegalArgumentException ex) {
            // can be ignored, we then know that we dont have a Fragment URI as KIELER URI
        }

        if (kielerUri.startsWith("//")) {
            // derive a method name from the name property
            String nameMethod =
                    "get" + Character.toUpperCase(nameProperty.charAt(0))
                            + nameProperty.substring(1);

            // only one root node present, no translation necessary
            EObject root = resource.getContents().get(0);
            result = "/";
            int lastOccurance = 2;
            int currentOccurance;

            while (kielerUri.indexOf("/", lastOccurance) != -1) {
                // parse KIELER URI and find corresponding EObject on the current level
                result += "/";
                currentOccurance = kielerUri.indexOf("/", lastOccurance);
                String currentUri;

                if (currentOccurance != lastOccurance) {
                    currentUri = kielerUri.substring(lastOccurance, currentOccurance);
                    lastOccurance = currentOccurance;
                } else {
                    // when this is the last referrer, just take the rest
                    currentUri = kielerUri.substring(lastOccurance);
                    lastOccurance = kielerUri.length();
                }
                StringBuilder currentResult = new StringBuilder(result);
                for (EObject eo : root.eContents()) {
                    // iterate through the current level and find the NamedObject with the same name
                    try {
                        Object obj = eo.getClass().getMethod(nameMethod).invoke(eo);
                        if (obj instanceof String) {
                            String name = (String) obj;
                            if (name.equals(currentUri.split("\\.")[1])) {
                                currentResult.append(((InternalEObject) eo.eContainer())
                                        .eURIFragmentSegment(eo.eContainingFeature(), eo));
                                root = eo;
                                break;
                            }
                        }
                    } catch (Exception exception) {
                        // a lot can go wrong with reflection, so ignore it
                    }
                }
                if (currentResult.toString().equals(result)) {
                    // Element wasn't found, although this was the right level
                    // Return null then
                    return null;
                }
                result = currentResult.toString();
            }
        } else {
            // more than one root node
            throw new UnsupportedOperationException("Can't handle more than one root node yet!");
        }
        return result;
    }

    /**
     * Method to get a (more readable) KIELER URI from a EMF Fragment URI and its resource. Will
     * return the Fragment URI, if EObjects are not NamedObjects. If using NamedObjects, it is
     * required that names on the same level are unique.
     * 
     * @see de.cau.cs.kieler.core.annotations.NamedObject
     * 
     * @param fragmentUri
     *            The Fragment URI from which the KIELER URI is generated (must not be null).
     * @param resource
     *            The resource in which the referred EObject is held.
     * @return A KIELER URI corresponding to the Fragment URI.
     */
    public static String fragmentUriToKielerUri(final String fragmentUri, final Resource resource) {
        return fragmentUriToKielerUri(fragmentUri, resource, "name");
    }

    /**
     * Method to get a (more readable) KIELER URI from a EMF Fragment URI and its resource. Will
     * return the Fragment URI, if EObjects are not NamedObjects.
     * 
     * @param fragmentUri
     *            The Fragment URI from which the KIELER URI is generated (must not be null).
     * @param resource
     *            The resource in which the referred EObject is held.
     * @param nameProperty
     *            the name of the structural feature that is used to get a name for elements
     * @return A KIELER URI corresponding to the Fragment URI.
     */
    public static String fragmentUriToKielerUri(final String fragmentUri, final Resource resource,
            final String nameProperty) {
        // derive a method name from the name property
        String nameMethod =
                "get" + Character.toUpperCase(nameProperty.charAt(0)) + nameProperty.substring(1);
        InternalEObject ieo = (InternalEObject) resource.getEObject(fragmentUri);
        InternalEObject container = (InternalEObject) ieo.eContainer();

        if (container != null) {
            try {
                Object obj = ieo.getClass().getMethod(nameMethod).invoke(ieo);
                if (obj instanceof String) {
                    String name = (String) obj;
                    return fragmentUriToKielerUri(getFragmentUri(container), resource) + "/" + "@"
                            + ieo.eContainingFeature().getName() + "." + name;
                }
            } catch (Exception exception) {
                // a lot can go wrong with reflection, so ignore it
            }
            return fragmentUriToKielerUri(getFragmentUri(container), resource) + "/"
                    + container.eURIFragmentSegment(ieo.eContainingFeature(), ieo);
        }
        return "/";
    }

    /**
     * Method to get the EMF Fragment URI for a given EObject.
     * 
     * @param eo
     *            The EObject for which the URI is requested (must not be null).
     * @return The full Fragment URI.
     */
    public static String getFragmentUri(final EObject eo) {
        String fragment = "";
        InternalEObject ieo = (InternalEObject) eo;
        InternalEObject container = (InternalEObject) eo.eContainer();

        if (container != null) {
            fragment =
                    getFragmentUri(container) + "/"
                            + container.eURIFragmentSegment(ieo.eContainingFeature(), ieo);
        } else {
            fragment = "/";
        }

        return fragment;
    }

}
