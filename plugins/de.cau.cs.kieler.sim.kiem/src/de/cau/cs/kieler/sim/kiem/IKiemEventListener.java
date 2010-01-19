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

package de.cau.cs.kieler.sim.kiem;

/**
 * Classes implementing this interface can listen to
 * events happening anywhere in KIEM.
 * <BR><BR>
 * When an event successfully completes somewhere inside
 * the KIEM plugin, the plugin may choose to notify the listeners
 * of this event.
 * <BR><BR>
 * Currently only file based events like load and save are
 * supported. These work in such a way that the event has the
 * bits for KiemEvent.SAVE or KiemEvent.LOAD in event.getEvents()
 * set to 1. The event.getInfo() will contain the location of the
 * file in question as an Object of type IPath.
 * <BR><BR>
 * {@see de.cau.cs.kieler.sim.kiem.extension.KiemEvent}
 * 
 * @author soh
 *
 */
public interface IKiemEventListener {

    /**
     * This method is called by the plugin when some
     * event happens that might be interesting for listeners.
     * <BR><BR>
     * Currently only file based events like load and save are
     * supported. These work in such a way that the event has the
     * bits for KiemEvent.SAVE or KiemEvent.LOAD in event.getEvents()
     * set to 1. The event.getInfo() will contain the location of the
     * file in question as an Object of type IPath.
     * 
     * @param event The event that was dispatched.
     */
    void eventDispatched(KiemEvent event);
}
