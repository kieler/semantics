/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.core;

import com.google.gson.annotations.SerializedName;

/**
 * Possible types for variables
 * 
 * @author aas
 *
 */
public enum VariableType {
    @SerializedName("int")
    INT,
    @SerializedName("bool")
    BOOL,
    @SerializedName("float")
    FLOAT,
    @SerializedName("string")
    STRING
}
