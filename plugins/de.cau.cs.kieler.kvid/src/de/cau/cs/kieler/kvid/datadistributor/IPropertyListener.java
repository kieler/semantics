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
package de.cau.cs.kieler.kvid.datadistributor;

/**
 * Listener interface for participants who are interested in {@link Property} changes.
 * Either the value of a {@link Property} might have changed, or the known {@link Property}s
 * have changed.
 * 
 * @author jjc
 *
 */
public interface IPropertyListener {
    
    /**
     * Method that is called when the value of a certain {@link Property} changes.
     *  
     * @param changedProperty The {@link Property} which value was changed
     */
    void triggerPropertyChanged(Property changedProperty);
    
    /**
     * Method that is called when a {@link Property} is added or removed.
     */
    void triggerPropertyListChanged();

}
