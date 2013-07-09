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
package de.cau.cs.kieler.kex.controller;

/**
 * This class contains a lot of defined error messages.
 * 
 * @author pkl
 */
public final class ErrorMessage {
    // These are just internationalization constants which don't require comments.
    // CHECKSTYLEOFF JavadocVariable
    
    public static final String NOT_WRITE_PLUGIN = "Could not write to plugin.xml of given project.\n";
    public static final String NOT_PARSE_PLUGIN = "Could not parse plugin.xml: ";
    public static final String NO_SOURCETYPE = "No Sourcetype defined.";
    public static final String DESTFILE_NOT_EXIST = "There is no file at destination location: ";
    public static final String DOC_BUILDER_NEW_ERROR = "Error while creating new document builder.";
    public static final String TRANSFORM_ERROR = "Could not transform to plugin.xml.";
    public static final String PLUGIN_WRITE_ERROR = "Error appears at writing plugin.xml.";
    public static final String PREVIEW_LOAD_ERROR = "Could not load preview for example: ";
    public static final String NO_IMPORT = "Can't import example!";
    public static final String NO_SOURCE_FILE = "Source file for does not exist for path: ";
    public static final String NO_EXAMPLE_SELECTED = "No Example has been selected.";
    public static final String DUPLICATE_EXAMPLE = "Example exists already in workspace.";
    public static final String DUPLICATE_ELEMENT = "Duplicate element.";
    public static final String NO_DEST_SET = "No destination set for import.";
    public static final String LOAD_ERROR = "Error while loading example \"";
    public static final String NO_EXAMPLE_FOUND = "Could not find example.";

    private ErrorMessage() {
        // should not be called
    }
}
