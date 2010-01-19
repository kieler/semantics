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

package de.cau.cs.kieler.sim.kiem.internal;

import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

/**
 * The Class JSONObjectDataComponent. Implementation for the extension point JSONObjectDataComponent
 * that implements the interface {@link IJSONObjectDataComponent}.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public abstract class JSONObjectDataComponent extends AbstractDataComponent implements
        IJSONObjectDataComponent {

    /** The global initial variables as JSONObjects. */
    private JSONObject globalInitialVariables;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new JSONObjectDataComponent.
     */
    public JSONObjectDataComponent() {
        super();
    }

    // -------------------------------------------------------------------------

    /**
     * Provide filter keys and default values as a JSONObject.
     * 
     * @return the JSONObject
     */
    public JSONObject provideFilterKeysJSON() {
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the global interface variables and their initial values. This method is called by the
     * execution manager during the initialization phase.
     * 
     * @param globalInitialVariablesParam
     *            the global initial variables
     */
    public final void setInitialVariables(final JSONObject globalInitialVariablesParam) {
        this.globalInitialVariables = globalInitialVariablesParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the (global) interface variables. Can be used by the DataComponent itself to retrieve
     * information about global interface variables.
     * 
     * @return the global initial variables
     */
    protected final JSONObject getInitialVariables() {
        if (globalInitialVariables == null) {
            // probably not initialized or there are no such
            // variable keys
            return null;
        } else {
            return globalInitialVariables;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Provide (local) interface variables and possible initial values. This is an optional method
     * that will provide some interface variable keys and values that can be used by other
     * DataComponents within and after the initialization phase every DataComponent may receive the
     * union of all those variable keys by calling the {@link #getInitialVariables()} method.
     * 
     * @return the local initial variables as a JSONObject
     * 
     * @throws KiemInitializationException
     *             if a property prevents the execution of this DataComponent this error should be
     *             thrown
     */
    public JSONObject provideInitialVariables() throws KiemInitializationException {
        return null;
    }

}
