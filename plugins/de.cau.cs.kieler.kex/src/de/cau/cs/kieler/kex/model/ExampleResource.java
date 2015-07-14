/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kex.model;

/**
 * The main model for representing a example resource.
 * 
 * @author pkl
 * 
 */
public class ExampleResource {

    private final String localPath;

    private final Type resourceType;

    private boolean directOpen = false;

    /**
     * Creates a new {@link ExampleResource}.
     * 
     * @param localPathParam
     *            , {@link String}
     * @param resourceTypeParam
     *            , {@link Type}
     */
    public ExampleResource(final String localPathParam, final Type resourceTypeParam) {
        this.localPath = localPathParam;
        this.resourceType = resourceTypeParam;
    }

    /**
     * Setter for the attribute directopen. Set if the resource should open directly after importing
     * in editor.
     * 
     * @param directOpenParam
     *            , boolean.
     */
    public void setDirectOpen(final boolean directOpenParam) {
        this.directOpen = directOpenParam;
    }

    /**
     * Getter for local path.
     * 
     * @return {@link String}
     */
    public String getLocalPath() {
        return this.localPath;
    }

    /**
     * Getter for resourcetype.
     * 
     * @return {@link Type}
     */
    public Type getResourceType() {
        return this.resourceType;
    }

    /**
     * Getter for directopen.
     * 
     * @return boolean
     */
    public boolean isDirectOpen() {
        return this.directOpen;
    }

    /**
     * Used to distinguish the resources.
     * 
     * @author pkl
     * 
     */
    public enum Type {
        /**
         * A resource can be a file, a folder or a project.
         */
        FILE, FOLDER, PROJECT;

        /**
         * Gets the name of an Type.
         * 
         * @param type
         *            , {@link Type}
         * @return {@link String}
         */
        public static String map(final Type type) {
            switch (type) {
            case FILE:
                return "file";
            case FOLDER:
                return "folder";
            case PROJECT:
                return "project";
            }
            return null;
        }
    }
}
