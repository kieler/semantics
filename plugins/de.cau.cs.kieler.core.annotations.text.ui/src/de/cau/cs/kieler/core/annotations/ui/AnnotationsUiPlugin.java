/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2008 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.annotations.ui;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.core.annotations.ui.internal.AnnotationsActivator;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author msp
 */
public class AnnotationsUiPlugin extends AnnotationsActivator {

    /** the plug-in ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.core.annotations.text.ui";

    /** nested class used to store images that are loaded at runtime. */
    public static class Images {

        /** map of already loaded images. */
        private Map<String, Image> imageMap = new HashMap<String, Image>();

        /**
         * Frees all resources used by loaded images.
         */
        void dispose() {
            for (Image image : imageMap.values()) {
                image.dispose();
            }
        }
        
        /**
         * Retrieve the image for the given key. The key is the image file name without extension.
         * 
         * @param key image file name
         * @return the corresponding image, or {@code null} if there is no such image
         */
        public Image get(final String key) {
            Image image = imageMap.get(key);
            if (image == null) {
                image = getImageDescriptor("icons/obj16/" + key + ".gif").createImage();
                if (image != null) {
                    imageMap.put(key, image);
                }
            }
            return image;
        }

    }

    /** the images class instance. */
    private Images images;

    /**
     * Returns the images, or {@code null} if the plugin was disposed.
     * 
     * @return the images
     */
    public Images getImages() {
        return images;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        images = new Images();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void stop(final BundleContext context) throws Exception {
        if (images != null) {
            images.dispose();
            images = null;
        }
        super.stop(context);
    }

    /**
     * Returns an image descriptor for the image file at the given plug-in
     * relative path.
     * 
     * @param path the path
     * @return the image descriptor
     */
    public static ImageDescriptor getImageDescriptor(final String path) {
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    }
    
}
