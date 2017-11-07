/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation

/**
 * @author aas
 *
 */
interface SimulationParticipant {
     /**
     * Enables or disables this participant.
     * 
     * @param value The new enabled state
     */
    public def void setEnabled(boolean value)
    
    /**
     * Returns whether this participant is enabled.
     * 
     * @return the enabled state
     */
    public def boolean isEnabled()
    
    /**
     * Returns the user readable name for this participant
     */
    public def String getName() {
        return splitCamelCase(class.simpleName)
    }
    
    /**
     * Converts a text in camelCase to a more human readable form.
     * Examples:
     * "lowercase"        -> "lowercase"
     * "Class"            -> "Class"
     * "MyClass"          -> "My Class"
     * "HTML"             -> "HTML"
     * "PDFLoader"        -> "PDF Loader"
     * "AString"          -> "A String"
     * "SimpleXMLParser"  -> "Simple XML Parser"
     * "GL11Version"      -> "GL 11 Version"
     * "99Bottles"        -> "99 Bottles"
     * "May5"             -> "May 5"
     * "BFG9000"          -> "BFG 9000"
     * 
     * @param s The text in camelCase
     */
    static public def String splitCamelCase(String s) {
       return s.replaceAll(
           String.format("%s|%s|%s",
               "(?<=[A-Z])(?=[A-Z][a-z])",
               "(?<=[^A-Z])(?=[A-Z])",
               "(?<=[A-Za-z])(?=[^A-Za-z])"),
           " ")
    }
}