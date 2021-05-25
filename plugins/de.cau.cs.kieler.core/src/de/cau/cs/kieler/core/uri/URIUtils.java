/*******************************************************************************
 * Copyright (c) 2007, 2010 BMW Car IT, Technische Universitaet Muenchen, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * BMW Car IT - Initial API and implementation
 * Technische Universitaet Muenchen - Major refactoring and extension
 * Johannes Faltermeier - Extension
 * Alexander Schulz-Rosengarten - Adjustments for KIELER project
 *******************************************************************************/
package de.cau.cs.kieler.core.uri;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.osgi.framework.Bundle;

/**
 * Helper methods for conversions between different types of resource
 * identifiers
 *
 * @author herrmama, als
 */
public final class URIUtils {

	/**
	 * Constructor
	 */
	private URIUtils() {
		// hidden, since this class only provides static helper methods
	}

	/**
	 * Convert EMF URI to Eclipse file
	 */
	public static IFile getFile(URI uri) {
		final String platformString = uri.toPlatformString(true);
		if (platformString != null) {
			final Path path = new Path(platformString);
			return ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		}
		return null;
	}

	/**
	 * Convert EMF URI to Eclipse folder
	 */
	public static IFolder getFolder(URI uri) {
		final Path path = new Path(uri.toPlatformString(true));
		return ResourcesPlugin.getWorkspace().getRoot().getFolder(path);
	}

	/**
	 * Convert Eclipse resource to EMF URI
	 */
	public static URI getURI(IResource file) {
		return getURI(file.getFullPath());
	}

	/**
	 * Create an EMF URI from an Eclipse path
	 */
	public static URI getURI(IPath path) {
		return URI.createPlatformResourceURI(path.toString(), true);
	}

	/**
	 * Convert a file name to an EMF URI
	 *
	 * @param fileName
	 * @return EMF URI
	 */
	public static URI getURI(String fileName) {
		return getURI(new File(fileName));
	}

	/**
	 * Convert a file name to an EMF URI
	 *
	 * @param file
	 * @return EMF URI
	 */
	public static URI getURI(File file) {
		return URI.createFileURI(file.getAbsolutePath());
	}

	/**
	 * Get Java URL from EMF URI
	 *
	 * @param uri
	 *            EMF URI
	 * @return Java URL
	 */
	public static URL getURL(URI uri) {
		try {
            if (uri.isPlatformPlugin()) {
    		    if (Platform.isRunning()) {
                    Bundle bundle = Platform.getBundle(uri.segment(1));
                    String path = String.join("/", uri.segmentsList().subList(2, uri.segmentCount() - 1));
                    Enumeration<URL> entries = bundle.findEntries(path, uri.lastSegment(), true);
                    if (entries.hasMoreElements()) {
                        return entries.nextElement();
                    }
                    return null;
                } else {
                    return ClassLoader.getSystemResource(String.join("/", uri.segmentsList().subList(2, uri.segmentCount())));
                }
            }
			return new URL(uri.toString());
		} catch (final MalformedURLException e) {
			return null;
		}
	}

	/**
	 * Get EMF URI from Java URL
	 *
	 * @param url
	 *            Java URL
	 * @return EMF URI
	 */
	public static URI getURI(URL url) {
		return URI.createURI(url.toString());
	}

	/**
	 * Replace extension of a file
	 *
	 * @param file
	 *            File
	 * @param ext
	 *            New extension
	 * @return New file
	 */
	public static IFile replaceExtension(IFile file, String ext) {
		final IProject project = file.getProject();
		return project.getFile(file.getProjectRelativePath()
			.removeFileExtension().addFileExtension(ext));
	}

	/**
	 * Replace extension of a EMF URI
	 *
	 * @param uri
	 *            EMF URI
	 * @param ext
	 *            New extension
	 * @return New EMF URI
	 */
	public static URI replaceExtension(URI uri, String ext) {
		return uri.trimFileExtension().appendFileExtension(ext);
	}

	/**
	 * Get the Java file for a URI
	 *
	 * @param uri
	 * @return Java file
	 */
	public static File getJavaFile(URI uri) {
		try {
			if (uri.isPlatformPlugin()) {
				final Bundle bundle = Platform.getBundle(uri.segment(1));
				final StringBuilder builder = new StringBuilder();
				for (int i = 2; i < uri.segmentCount(); i++) {
					if (builder.length() != 0) {
						builder.append("/"); //$NON-NLS-1$
					}
					builder.append(uri.segment(i));
				}
				final URL entry = bundle.getEntry(builder.toString());
				return new File(FileLocator.resolve(entry).toURI());
			}
			if (uri.isPlatform()) {
				final IFile file = getFile(uri);
				final IPath location = file.getLocation();
				return location.toFile();
			}
			if (uri.toFileString() == null) {
			    return null;
			}
			return new File(uri.toFileString());
		} catch (final URISyntaxException ex) {
			return null;
		} catch (final IOException ex) {
			return null;
		}
	}

	/**
	 * Get an input stream from the given URI.
	 *
	 * @return an {@link InputStream} or <code>null</code> if no stream could be created
	 */
	public static InputStream getInputStream(URI uri) {
		try {
			return new ExtensibleURIConverterImpl().createInputStream(uri);
		} catch (final IOException ex) {
			return null;
		}
	}

	/**
	 * Get an output stream from the given URI.
	 *
	 * @return an {@link OutputStream} or <code>null</code> if no stream could be created
	 */
	public static OutputStream getOutputStream(URI uri) {
		try {
			return new ExtensibleURIConverterImpl().createOutputStream(uri);
		} catch (final IOException ex) {
			return null;
		}
	}

	/** Get the relative path of a {@link URI} w.r.t. another {@link URI}. */
	public static URI getRelativePath(URI uri, URI relativeTo) {
		return uri.deresolve(relativeTo, true, true, true);
	}
	
}
