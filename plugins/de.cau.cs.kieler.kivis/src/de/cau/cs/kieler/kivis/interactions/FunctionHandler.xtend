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
package de.cau.cs.kieler.kivis.interactions

import de.cau.cs.kieler.prom.ExtensionLookupUtil
import java.util.List
import java.util.Map
import org.eclipse.core.runtime.CoreException

/**
 * @author aas
 *
 */
abstract class FunctionHandler {
    private static val EXTENSION_POINT_ID = "de.cau.cs.kieler.kivis.functionHandler"
    
    private static var Map<String,FunctionHandler> instances
    
    abstract public def String getName()
    abstract public def Object getValue(List<Object> arguments)
    abstract public def List<Integer> getSupportedArgumentCounts()
    
    /**
     * Returns true if the arguments can be used to calculate the function.
     */
    public def boolean isSupported(List<Object> arguments) {
        return getSupportedArgumentCounts.contains(arguments.size)
    }
    
    /**
     * Returns the registered function handler for the given function,
     * or null if none.
     */
    public static def FunctionHandler getFunctionHandler(String functionName) {
        // Initialize if not done yet
        if(instances == null) { 
            initFunctionHandlers
        }
        return instances.get(functionName)
    }
    
    /**
     * Returns all registered function handlers.
     */
    public static def List<FunctionHandler> getFunctionHandlers() {
        // Initialize if not done yet
        if(instances == null) { 
            initFunctionHandlers
        }
        return instances.values.toList
    }
    
    /**
     * Instantiate the function handlers from all registered extensions.
     */
    private static def void initFunctionHandlers() {
        instances = newHashMap
        val config = ExtensionLookupUtil.getConfigurationElements(EXTENSION_POINT_ID)
        try {
            for (e : config) {
                val o = e.createExecutableExtension("class");
                if (o instanceof FunctionHandler) {
                    instances.put(o.name, o)
                }
            }
        } catch (CoreException ex) {
            ex.printStackTrace
        }
    }
}