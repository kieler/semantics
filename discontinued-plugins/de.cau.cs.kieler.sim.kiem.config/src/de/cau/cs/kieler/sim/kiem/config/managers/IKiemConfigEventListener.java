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
package de.cau.cs.kieler.sim.kiem.config.managers;

import de.cau.cs.kieler.sim.kiem.config.data.KiemConfigEvent;

/**
 * An interface for listeners that want to receive events from any of the
 * managers.
 * 
 * @author soh
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 */
public interface IKiemConfigEventListener {

    /**
     * Act on an event dispatched by the manager.
     * 
     * @param event
     *            the dispatched event.
     */
    void eventDispatched(final KiemConfigEvent event);

}
