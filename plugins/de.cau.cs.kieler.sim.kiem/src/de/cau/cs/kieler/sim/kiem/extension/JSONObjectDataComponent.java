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

package de.cau.cs.kieler.sim.kiem.extension;

/**
 * The Class JSONObjectDataComponent. Implementation for the extension point JSONObjectDataComponent
 * that implements the interface {@link IJSONObjectDataComponent}.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public abstract class JSONObjectDataComponent extends DataComponent implements
        IJSONObjectDataComponent {

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new JSONObjectDataComponent.
     */
    public JSONObjectDataComponent() {
        super();
    }

}
