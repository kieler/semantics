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
package de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen

import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import java.util.List
import java.util.Map
import de.cau.cs.kieler.core.properties.Property

/**
 * Common functionality for Lean State-Based Code Generation using a template.
 * 
 * @author Wechselberg ssm
 */
abstract class AbstractStatebasedLeanTemplate {
    
    public static val CONVENIENT_SET_COMPILATION = 
       new Property<Boolean>("de.cau.cs.kieler.sccharts.statebased.convenientSet", false)      

    protected State rootState

    protected List<Scope> scopes
    protected Map<Scope, String> scopeNames
    protected Map<Scope, String> scopeEnumNames
    protected Map<Scope, String> contextStructNames
    protected var int regionCounter
    protected var int stateEnumCounter

    /**
     * Analyzes the structure of the given {@link Scope}, storing all sub-scopes in a flat list,
     * preserving the containment hierarchy in the list order.
     * Also, assigns unique names to all {@link State}s and {@link ControlflowRegion}s.
     */
    protected def void enumerateScopes(Scope scope) {
        enumerateScopes(scope, "", "")
    }

    /**
     * Analyzes the structure of the given {@link Scope}, storing all sub-scopes in a flat list,
     * preserving the containment hierarchy in the list order.
     * Also, assigns unique names to all {@link State}s and {@link ControlflowRegion}s. 
     */
    protected def void enumerateScopes(Scope scope, String namePrefix, String contextPrefix) {
        // Store the current scope for later iteration
        scopes += scope

        switch (scope) {
            State: enumerateState(scope, namePrefix, contextPrefix)
            ControlflowRegion: enumerateControlflowRegion(scope, namePrefix, contextPrefix)
        }
    }

    protected def void enumerateState(State scope, String namePrefix, String contextPrefix) {
        // Check if this scope has no unique name yet 
        if (!scopeNames.containsKey(scope)) {
            val name = if (namePrefix.nullOrEmpty) {
                    scope.name.hostcodeSafeName
                } else {
                    '''«namePrefix»_state«scope.name.hostcodeSafeName»'''
                }
            // Store this unique state name in the name cache
            scopeNames.put(scope, name)
        }

        // Use the unique name to also create an enum constant for the state enumeration 
        var enumName = scope.name.hostcodeSafeName.toUpperCase
        // Ensure the enum name is unique across all enums, even enums from other regions
        // This is needed because C (up until C++11) has no separated namespaces for enums. 
        while (scopeEnumNames.containsValue(enumName)) {
            enumName = scope.name.hostcodeSafeName.toUpperCase + (stateEnumCounter++)
        }
        scopeEnumNames.put(scope, enumName)

        // Enumerate all the regions in this state, if this is a superstate
        for (region : scope.regions.filter(ControlflowRegion)) {
            // Append the parent region name to the name prefix, if available
            val newContextPrefix = if (scope.parentRegion === null) {
                    contextPrefix
                } else {
                    '''«contextPrefix»«scope.parentRegion.uniqueName.lowerCapital».'''
                }
            enumerateScopes(region, scope.uniqueName, newContextPrefix)
        }
    }

    protected def enumerateControlflowRegion(ControlflowRegion scope, String namePrefix, String contextPrefix) {
        // Check if this scope has no unique name yet 
        if (!scopeNames.containsKey(scope)) {
            var String name
            if (scope.name.nullOrEmpty) {
                // Generate a name with a running number if no region name is defined
                name = namePrefix + '_regionR' + (regionCounter++)
            } else {
                name = namePrefix + '_region' + scope.name.hostcodeSafeName
                // Ensure the name is really unique
                while (scopeNames.containsValue(name)) {
                    name = namePrefix + '_region' + scope.name.hostcodeSafeName + (regionCounter++)
                }
            }
            // Store this unique region name in the name cache
            scopeNames.put(scope, name)

            contextStructNames.put(scope, contextPrefix + scope.uniqueName.lowerCapital)
        }
        // Enumerate all the states contained in the region
        for (state : scope.states) {
            enumerateScopes(state, scope.uniqueName, contextPrefix)
        }

    }

    /**
     * Retrieves the unique name of the given {@link Scope} from the name cache.
     */
    protected def String uniqueName(Scope scope) {
        scopeNames.get(scope)
    }

    /**
     * Retrieves the name of the enum literal, created for the given {@link State}, from the name cache.
     */
    protected def String uniqueEnumName(State state) {
        scopeEnumNames.get(state)
    }

    /**
     * Retrieves the name of the context object used in other contexts, created for the given {@link Scope}.
     */
    protected def String uniqueContextName(Scope scope) {
        if (scope instanceof State) {
            if (scope == rootState) {
                "TickData"
            } else {
                scope.parentRegion.uniqueName
            }
        } else if (scope instanceof ControlflowRegion) {
            scope.uniqueName
        }
    }

    /**
     * Retrieves the name of the context type, created for the given {@link Scope}.
     */
    protected def String uniqueContextMemberName(Scope scope) {
        if (scope instanceof State) {
            if (scope == rootState) {
                '''TickData'''
            } else {
                scope.parentRegion.uniqueName + "Context"
            }
        } else if (scope instanceof ControlflowRegion) {
            scope.uniqueName.capitalize + "Context"
        }
    }

    /**
     * Capitalizes the first character in the given {@link String} and returns the resulting {@link String}.
     */
    static def String capitalize(String string) {
        string.substring(0, 1).toUpperCase + string.substring(1)
    }

    /** 
     * De-Capitalizes the first character in the given {@link String} and returns the resulting {@link String}.
     */
    static def String lowerCapital(String string) {
        string.substring(0, 1).toLowerCase + string.substring(1)
    }

    /** 
     * Transforms the given string to represent an identifier safe to be used in generated code.
     */
    static def hostcodeSafeName(String string) {
        if(string === null) return ""
        string.replaceAll("[\\s-]", "_")
    }
}
