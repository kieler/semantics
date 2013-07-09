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
 * This enumeration contains the names of the elements in an example description.
 * 
 * @author pkl
 */
public enum ExampleElement {
    /**
     * The example's description.
     */
    DESCRIPTION,
    
    /**
     * The destination location.
     */
    DEST_LOCATION,
    
    /**
     * Contact information of the example's author.
     */
    CONTACT,
    
    /**
     * Whether the example comes from within KIELER or from external users. The
     * latter is currently not implemented yet.
     */
    SOURCETYPE,
    
    /**
     * The resources the example is made up of.
     */
    RESOURCES,
    
    /**
     * The categories the example contributes.
     */
    CREATE_CATEGORIES,
    
    /**
     * Preview picture displayed for the example.
     */
    OVERVIEW_PIC,
    
    /**
     * Name of the example.
     */
    TITLE,
    
    /**
     * The example author.
     */
    AUTHOR,
    
    /**
     * The example's unique ID.
     */
    ID,
    
    /**
     * Category the example is displayed in.
     */
    CATEGORY;
}
