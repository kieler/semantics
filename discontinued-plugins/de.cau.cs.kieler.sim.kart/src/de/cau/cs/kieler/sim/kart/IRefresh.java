/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kart;

/**
 * Interface for an extension point to allow KART to initiate a Refresh of all projects. This is
 * needed because the Project explorer else would not show newly recorded trace files.
 * 
 * @author ssc
 * @kieler.design 2012-02-23 cmot
 * @kieler.rating 2012-02-23 yellow cmot
 */
public interface IRefresh {

    /**
     * Refresh the Project explorer.
     */
    void refreshProjectExplorer();

}
