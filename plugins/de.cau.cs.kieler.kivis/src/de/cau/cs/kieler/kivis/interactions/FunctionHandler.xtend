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
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
abstract class FunctionHandler {
    private static val EXTENSION_POINT_ID = "de.cau.cs.kieler.kivis.functionHandler"
    
    @Accessors(PUBLIC_GETTER)
    private static var Map<String, FunctionHandler> handledFunctions
    
    abstract public def List<NamedFunction> getFunctions()
    
    /**
     * Returns the value of the function for the given arguments.
     */
    public def Object getValue(String functionName, List<Object> arguments) {
        val function = functions.findFirst[it.name == functionName]
        if(function == null) {
            throw new Exception("The function '"+functionName+"' is not handled.")
        }
        return function.getValue(arguments)
    }
    
    /**
     * Returns the registered function handler for the given function,
     * or null if none.
     */
    public static def FunctionHandler getFunctionHandler(String functionName) {
        // Initialize if not done yet
        if(handledFunctions == null) { 
            initFunctionHandlers
        }
        return handledFunctions.get(functionName)
    }
    
    /**
     * Returns all registered function handlers.
     */
    public static def List<FunctionHandler> getFunctionHandlers() {
        // Initialize if not done yet
        if(handledFunctions == null) { 
            initFunctionHandlers
        }
        return handledFunctions.values.toList
    }
    
    /**
     * Instantiate the function handlers from all registered extensions.
     */
    private static def void initFunctionHandlers() {
        handledFunctions = newHashMap
        val config = ExtensionLookupUtil.getConfigurationElements(EXTENSION_POINT_ID)
        try {
            for (e : config) {
                val o = e.createExecutableExtension("class");
                if (o instanceof FunctionHandler) {
                    for(fun : o.functions) {
                        handledFunctions.put(fun.name, o)    
                    }
                }
            }
        } catch (CoreException ex) {
            ex.printStackTrace
        }
    }
}