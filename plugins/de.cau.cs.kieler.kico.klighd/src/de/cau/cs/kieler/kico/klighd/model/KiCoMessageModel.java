/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.model;

/**
 * Model of KiCoModelView to represent a message string
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class KiCoMessageModel {

    private final String title;
    private final String message;
    private final String iconPath;
    private final String iconPlugin;
    private final int iconSize;

    /**
     * Constructs a model with given message
     * 
     * @param message
     */
    public KiCoMessageModel(String message) {
        this(null, message, null, null, 0);
    }

    /**
     * Constructs a model with given title and message
     * 
     * @param title
     * @param message
     */
    public KiCoMessageModel(String title, String message) {
        this(title, message, null, null, 0);
    }

    /**
     * Constructs a model with given title, message and icon
     * 
     * @param title
     * @param message
     * @param iconPath
     * @param iconPlugin
     * @param iconSize
     */
    public KiCoMessageModel(String title, String message, String iconPath, String iconPlugin,
            int iconSize) {
        super();
        this.title = title != null && title.isEmpty() ? null : title;
        this.message = message != null && message.isEmpty() ? null : message;
        iconPath = iconPath != null && iconPath.isEmpty() ? null : iconPath;
        iconPlugin = iconPlugin != null && iconPlugin.isEmpty() ? null : iconPlugin;
        if (iconPath != null && iconPlugin != null) {
            this.iconPath = iconPath;
            this.iconPlugin = iconPlugin;
        }else{
            this.iconPath = null;
            this.iconPlugin = null;
        }
        this.iconSize = iconSize;
    }

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
