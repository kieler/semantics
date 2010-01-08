/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem.extension;

/**
 * Components implementing this interface can provide configuration
 * information for KIEM. For example change the aimed step duration
 * and be notified if the user changes it in one of the components.
 * 
 * @author soh
 *
 */
public interface IKiemConfigurationProvider {

    /**
     * Ask the component to give a new value for the property
     * specified by the id.
     * 
     * @param propertyId the id of the property to change.
     * @return the new value of the property.
     */
    Object changeProperty(String propertyId);
    
    /**
     * Notify the listener that the user changed the property
     * specified by the id.
     * 
     * @param propertyId the id of the property.
     * @param value the new value of the property.
     */
    void propertyChanged(String propertyId, Object value);
}
