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
package de.cau.cs.kieler.simulation.handlers

import de.cau.cs.kieler.prom.configurable.ConfigurableAttribute
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.DataPoolOperation
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.NDimensionalArray
import de.cau.cs.kieler.simulation.core.Variable
import java.util.Arrays
import java.util.Map

/**
 * Sets the value of input variables of one model (to)
 * to the value of output variables of another model (from).
 * 
 * @author aas
 *
 */
class Redirect extends DefaultDataHandler {
    
    /**
     * The name of the model of which the outputs should be read.
     */
    public val from = new ConfigurableAttribute("from", null, true, #[String])
    /**
     * The name of the model of which the inputs should be set.
     */
    public val to = new ConfigurableAttribute("to", null, true, #[String])
    
    /**
     * Optional mapping of output variables to input variables, in case not all inputs should be set,
     * or to create a mapping without matching names of inputs and outputs.
     */
    public val mapping = new ConfigurableAttribute("mapping", null, #[Map])
    
    /**
     * The operation of this data handler
     */
    private val operation = new DataPoolOperation("write") {
        override apply(DataPool pool) {
            write(pool)
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getOperations() {
        return #[operation]
    }
    
    /**
     * Sets the value of input variables of the to-model
     * to the value of output variables of the from-model.
     */
    public def void write(DataPool pool) {
        // Get output variables
        val fromModel = findModel(pool, from.stringValue)
        val outputs = fromModel.variables.filter[it.isOutput]
        // Get input variables
        val toModel = findModel(pool, to.stringValue)
        val inputs = toModel.variables.filter[it.isInput]
        
        // Read outputs and set corresponding inputs (corresponding here means "with same name") 
        for(i : inputs) {
            val o = outputs.findFirst[it.isMappingFor(i)]
            if(i != null && o != null) {
                if(i.value.class.isAssignableFrom(o.value.class)) {
                    if(i.value instanceof NDimensionalArray && o.value instanceof NDimensionalArray) {
                        val iIndices = (i.value as NDimensionalArray).getCardinalities
                        val oIndices = (o.value as NDimensionalArray).getCardinalities
                        val boolean arraySizeMatches = Arrays.equals(iIndices, oIndices)
                        if(!arraySizeMatches) {
                            throw new Exception("Array size mismatch of '"+this+"'\n"
                                              + "(size " + NDimensionalArray.toString(iIndices) + " != size " + NDimensionalArray.toString(oIndices) + ")")
                        }
                    }
                } else {
                    throw new Exception("Type mismatch of redirected variable '" + i.name + "' from '"+from.stringValue+ "' to '" + to + "'")
                }
                
                i.value = o.value
            }
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override Model findModel(DataPool pool, String name) {
        val model = super.findModel(pool, name)
        if(model == null) {
            throw new Exception("Can't redirect variables. Model '"+name+"' has not been found in the data pool.")
        }
        return model
    }
    
    /**
     * {@inheritDoc}
     */
    override getName() {
        return "redirect"
    }
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        return "Redirect from '"+from.stringValue+ "' to '"+to.stringValue+"'"
    }

    /**
     * Determines if the input variable should be set to the value of the output variable.
     * If no explicit mapping is defined then the names of the variables are compared.
     * 
     * @param out The output variable
     * @param in The input variable
     * @return true if the input should be set to the value of the output, false otherwise
     */
    private def boolean isMappingFor(Variable out, Variable in) {
        if(mapping.isDefined) {
            val targetVariable = mapping.mapValue.getOrDefault(out.name, null)
            if(targetVariable != null) {
                if(!(targetVariable instanceof String)) {
                    throw new IllegalArgumentException("Could not determine the mapping for the output variable '"+out.name+ "'\n"
                                                     + "Please provide the name of the input variable that this output should be mapped to.")
                }
                return in.name == (targetVariable as String)
            }
         } else {
            return out.name == in.name
        }
        return false
    }
}