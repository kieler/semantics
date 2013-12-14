/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.ktm.tree;

import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.HashMultimap;

/**
 * Interface for accessing raw mapping data
 * 
 * @author als
 * 
 */
public interface ObjectMapping {
    /**
     * Returns map with all relations created during transformation. Keys must be source objects and
     * values their associated target objects.
     * 
     * @return mapping data.
     */
    public HashMultimap<EObject, EObject> getMappingData();
}
