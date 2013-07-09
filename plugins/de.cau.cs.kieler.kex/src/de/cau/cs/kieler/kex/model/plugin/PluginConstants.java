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
package de.cau.cs.kieler.kex.model.plugin;

/**
 * Constants for communication with the plugin extensionpoints.
 * 
 * @author pkl
 */
public final class PluginConstants {
    // This class just contains a number of element names which don't need comments
    // CHECKSTYLEOFF JavadocVariable
    
    public static final String KEX_EXT_POINT = "de.cau.cs.kieler.kex";
    public static final String PLUGIN = "plugin";
    public static final String EXTENSION = "extension";
    public static final String POINT = "point";
    
    /**
     * Names of the elements used in an example definition.
     *
     * @author pkl
     */
    public static final class Example {
        public static final String EXAMPLE = "example";
        public static final String ID = "id";
        public static final String TITLE = "title";
        public static final String CATEGORY = "category";
        public static final String GENERATION_DATE = "generation_date";
        public static final String DESCRIPTION = "description";
        public static final String AUTHOR = "author";
        public static final String CONTACT = "contact";
        public static final String OVERVIEW_PIC = "overview_pic";
        public static final String ROOT_DIRECTORY = "root_directory";

        private Example() {
            // should not be called.
        }
    }
    
    /**
     * Names of the elements used in an example category definition.
     *
     * @author pkl
     */
    public static final class Category {
        public static final String CATEGORY = "category";
        public static final String ID = "id";
        public static final String TITLE = "title";
        public static final String DESCRIPTION = "description";
        public static final String ICON = "icon";
        public static final String PARENT = "parent_category";

        private Category() {
            // should not be called.
        }
    }

    /**
     * Names of the elements used in an example resource definition.
     *
     * @author pkl
     */
    public static final class Resource {
        public static final String EXAMPLE_RESOURCE = "resource";
        public static final String LOCAL_PATH = "local_path";
        public static final String DIRECT_OPEN = "direct_open";
        public static final String RESOURCE_TYPE = "resource_type";
        public static final String ROOT_DIRECTORY = "root_directory";
        public static final String QUICK_START = "QuickStart";

        private Resource() {
            // should not be called.
        }
    }

    private PluginConstants() {
        // should not be called.
    }

}
