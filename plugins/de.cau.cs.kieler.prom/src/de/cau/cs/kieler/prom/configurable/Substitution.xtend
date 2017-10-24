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
package de.cau.cs.kieler.prom.configurable

import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Contains replacements for variables that can be used for instance in configurable attributes.
 * 
 * Typically a substition maps a single variable name to some value,
 * however it is also possible in extending classes to define a set of variables that are substituted.
 * For example from a single file handle
 * it would be possible to set variable values for the file name, path or extension.
 * 
 * The syntax to use a variable is the same as in FreeMarker or Eclipse,
 * which is ${variable_name}.
 * 
 * @author aas
 *
 */
abstract class Substitution {
    /**
     * The name of the variable that will be substituted.
     * Should be only letters and numbers.
     */
    @Accessors(PUBLIC_GETTER)
    private var String variableName
    
    /**
     * Performs all the given substitutions in the text
     * 
     * @param text The text containing variables
     * @param placeholders The placeholders with replacements
     */
    public static def String performSubstitutions(String text, Iterable<? extends Substitution> substitutions) {
        var substitutedText = text
        for(sub : substitutions) {
            substitutedText = sub.replace(substitutedText)
        }
        return substitutedText
    }
    
    /**
     * Replaces a placeholder in the given text with its value.
     * If the replacement value contains spaces, then it will be inserted in the text with surrounding quotes.
     * 
     * @param text The text
     * @param placeholder The text to be replaced
     * @param value The replacement for the placeholder
     * @return the text with the replaced placeholder
     */
    public static def String replace(String text, String placeholder, String value) {
        if(value.contains(' ')) {
            return text.replace(placeholder, value, true)
        } else {
            return text.replace(placeholder, value, false)    
        }
    }
    
    /**
     * Replaces a placeholder variable in the text with its value.
     * The replacement can be quoted. 
     * 
     * @param text The text
     * @param placeholder The text to be replaced
     * @param value The replacement for the placeholder
     * @param quoted Defines whether the replacement should be inserted with surrounding quotes
     * @return the text with the replaced placeholder
     */
    public static def String replace(String text, String placeholder, String value, boolean quoted) {
        var String replacement = value
        if(quoted) {
            replacement = '"'+replacement+'"'
        }
        return text.replaceAll(placeholder, replacement)    
    }
    
    /**
     * Returns the syntax to use the variable.
     */
    public static def String getTemplateSyntax(String variableName) {
        return "${" + variableName + "}"
    }
    
    /**
     * Returns the value for the substitution that is dynamically provided by extending classes.
     */
    abstract public def Object getValue()
    
    /**
     * Returns the mapping of variable names to their corresponding values.
     */
    protected def Map<String, String> getVariableMappings() {
        return #{variableName -> value.toString}
    }
    
    /**
     * Constructor
     */
    new(String variableName) {
        this.variableName = variableName
    }
    
    /**
     * Replaces all ocurrences of this substition's variables in the given text.
     * 
     * @param text The text containing placeholders
     * @return the text where placeholders have been substituted.
     */
    public def String replace(String text) {
        var substitutedText = text
        val replacements = variableMappings
        for(entry : replacements.entrySet) {
            substitutedText = substitutedText.replace(getTemplateSyntax(entry.key), entry.value)
        }
        return substitutedText
    }
}