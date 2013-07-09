/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kex.ui;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;

/**
 * Provides a way to load the plug-in's image files.
 * 
 * @author pkl
 */
public final class KEXUIImages {
    /**
     * Folder containing the image files.
     */
    private static final URL BASE_URL = Platform.getBundle(KEXUIPlugin.PLUGIN_ID)
            .getEntry("/icons/"); //$NON-NLS-1$

    /**
     * Overlay warning icon.
     */
    public static final ImageDescriptor OVERLAY_WARNING_32 =
            create("message_warning.gif"); //$NON-NLS-1$

    /**
     * Info message icon.
     */
    public static final ImageDescriptor MESSAGE_INFO =
            create("message_info.gif"); //$NON-NLS-1$

    /**
     * Clear search icon.
     */
    public static final ImageDescriptor FIND_CLEAR =
            create("find-clear.gif"); //$NON-NLS-1$

    /**
     * Disabled clear search icon.
     */
    public static final ImageDescriptor FIND_CLEAR_DISABLED =
            create("finde-clear-disabled.gif"); //$NON-NLS-1$
    
    /**
     * Creates an image descriptor for the given image file name.
     * 
     * @param name image file name. This is interpreted realtive to the plug-in's icons folder.
     * @return the image descriptor.
     */
    private static ImageDescriptor create(final String name) {
        try {
            if (BASE_URL == null) {
                throw new MalformedURLException();
            }
            return ImageDescriptor.createFromURL(new URL(BASE_URL, name));
        } catch (MalformedURLException e) {
            return ImageDescriptor.getMissingImageDescriptor();
        }
    }
    
    /**
     * Private constructor.
     */
    private KEXUIImages() {
        // should not be called.
    }
}
