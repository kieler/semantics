/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.view.model;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.util.StringInputStream;

import de.cau.cs.kieler.core.krendering.KContainerRendering;

/**
 * A simple message model. Provides a title, message and icon.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class MessageModel implements ISaveableModel {

    /** The title. */
    protected String title;
    /** The message. */
    protected String message;
    /** The icon path. */
    protected String iconPath;
    /** The icon plugin. */
    protected String iconPlugin;
    /** The minimal icon size. */
    protected int iconSize;

    // -- Constructors
    // -------------------------------------------------------------------------

    /**
     * Constructs a model with given message.
     * 
     * @param message
     *            The message
     */
    public MessageModel(String message) {
        this(null, message, null, null, 0);
    }

    /**
     * Constructs a model with given title and message.
     * 
     * @param title
     * @param message
     *            The message
     */
    public MessageModel(String title, String message) {
        this(title, message, null, null, 0);
    }

    /**
     * Constructs a model with given title, message and icon.
     * 
     * @param title
     *            The title
     * @param message
     *            The message
     * @param iconPath
     *            The icon path
     * @param iconPlugin
     *            The icon plugin
     * @param iconSize
     *            The minimal icon size
     */
    public MessageModel(String title, String message, String iconPlugin, String iconPath,
            int iconSize) {
        // Set or nullify title
        this.title = title != null && title.isEmpty() ? null : title;
        // Set or nullify message
        this.message = message != null && message.isEmpty() ? null : message;
        // Set or nullify icon
        iconPath = iconPath != null && iconPath.isEmpty() ? null : iconPath;
        iconPlugin = iconPlugin != null && iconPlugin.isEmpty() ? null : iconPlugin;
        if (iconPath != null && iconPlugin != null) {
            this.iconPath = iconPath;
            this.iconPlugin = iconPlugin;
        } else {
            this.iconPath = null;
            this.iconPlugin = null;
        }
        this.iconSize = iconSize;
    }

    // -- Synthesis
    // -------------------------------------------------------------------------

    /**
     * This callback allows to customize the synthesized diagram.
     * 
     * @param parent
     *            the parent element in the KGraph
     */
    public void customizeMessageSynthesis(KContainerRendering parent) {
        // do nothing
    }

    // -- Save
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(IFile file, URI uri) throws Exception {
        StringBuilder text = new StringBuilder();
        String newline = System.getProperty("line.separator");
        if (title != null) {
            text.append(title);
            text.append(newline);
        }
        if (message != null) {
            text.append(message);
        }
        // save to text file (create it if necessary)
        if (!file.exists()) {
            file.create(new StringInputStream(text.toString()), 0, null);
        } else {
            file.setContents(new StringInputStream(text.toString()), 0, null);
        }
    }

    // -- Getters
    // -------------------------------------------------------------------------

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return if icon specified
     */
    public boolean hasIcon() {
        return iconPlugin != null && iconPath != null;
    }

    /**
     * @return the iconPlugin
     */
    public String getIconPlugin() {
        return iconPlugin;
    }

    /**
     * @return the iconPath
     */
    public String getIconPath() {
        return iconPath;
    }

    /**
     * @return the iconSize
     */
    public int getIconSize() {
        return iconSize;
    }

}
