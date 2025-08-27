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
package de.cau.cs.kieler.sim.kiem.config.data;

/**
 * Wraps around editor ids.
 * 
 * @author soh
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 */
public class EditorIdWrapper extends KiemPropertyKeyWrapper {

    /** Id for serialization. */
    private static final long serialVersionUID = 4496529332452044654L;

    /**
     * Creates a new EditorIdWrapper.
     * 
     * @param string
     *            the editor id
     */
    public EditorIdWrapper(final String string) {
        super(string);
    }

}
