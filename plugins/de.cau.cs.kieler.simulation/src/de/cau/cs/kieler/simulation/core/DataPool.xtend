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
package de.cau.cs.kieler.simulation.core

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.regex.Pattern

/**
 * Central class of the simulation that holds all models and their variables for a given tick.
 * A data pool consists of its models.
 * 
 * @author aas
 *
 */
class DataPool implements Cloneable {
    
    /**
     * The models in this pool
     */
    private val List<Model> models = newArrayList()
    
    /**
     * The data pool of the previous state of the simulation.
     */
    @Accessors
    private var DataPool previousPool
    
    /**
     * Indicates that at least one variable might have a user value set,
     * which must be applied before the next tick is executed.
     */
    @Accessors(PUBLIC_GETTER)
    private boolean hasModifiedVariable
    
    /**
     * Clone this object.
     */
    override DataPool clone() {
        val pool = new DataPool()
        for(m : models) {
            pool.addModel(m.clone())            
        }
        return pool
    }
    
    /**
     * Returns first the model with the given name.
     * 
     * @param modelName The name of the model
     * @return the first model with the given name, or null if none
     */
    public def Model getModel(String modelName) {
        return models.findFirst[it.name == modelName]
    }
    
    /**
     * Returns the first variable with the given name.
     * 
     * @param modelName The name of the variable
     * @return the first variable with the given name, or null if none
     */
    public def Variable getVariable(String variableName) {
        return getVariable(variableName, true)
    }
    
    /**
     * Returns the first variable with the given name.
     * If the name is fully qualified (e.g. MyModel.MyVar)
     * then the variable is searched in the model with the corresponding name.
     * 
     * @param variableName The name of the variable
     * @param isfullyQualified Determines whether it is a fully qualified variable name
     * @return the first variable with the given name (possibly of the corresponding model), or null if none
     */
    public def Variable getVariable(String variableName, boolean isFullyQualified) {
        if(!isFullyQualified) {
            // No model name specified, so search in the complete data pool for the variable
            return allVariables.findFirst[it.name == variableName]    
        } else if(!variableName.isNullOrEmpty) {
            // Separate model name and variable name
            val i = variableName.indexOf(".")
            if(i >= 0 && i < variableName.length-1) {
                val modelName = variableName.substring(0,i)
                val relativeVariableName = variableName.substring(i + 1, i - variableName.length)
                return getVariable(modelName, relativeVariableName)
            } else {
                // This is not fully qualified actually.
                return getVariable(variableName, false)
            }
        }
    }
    
    /**
     * Sets the value of a variable, or of an array element of a variable.
     * 
     * @param variableQualifer The (possibly fully qualified) name of the variable and optional array indices (e.g. MayVar[1][2])
     * @param userValue Determines if the user value should be set instead of the 'real' value
     * @return the first variable with the given name (possibly of the corresponding model), or null if none
     */
    public def void setVariableValue(String variableQualifer, Object newValue, boolean userValue) {
        // Separate variable name and array index part
        val variablePart = getVariableName(variableQualifer)
        val arrayIndices = getArrayIndices(variableQualifer)
        
        val variable = getVariable(variablePart, true)
        if(variable != null) {
            if(arrayIndices.isNullOrEmpty) {
                if(userValue) {
                    variable.userValue = newValue
                } else {
                    variable.value = newValue
                }
            } else {
                val array = variable.value as NDimensionalArray
                val arrayElement = array.getElement(arrayIndices)
                if(arrayElement != null) {
                    if(userValue) {
                        arrayElement.userValue = newValue
                        variable.model.setModifiedVariable    
                    } else {
                        arrayElement.value = newValue
                    }
                } else {
                    throw new Exception("Could not find array element with indices "+arrayIndices)
                }
            }
        } else {
            throw new Exception("Could not find variable with name '"+variablePart+"'")
        }
    }
    
    /**
     * Returns the variable name part of a variable qualifier.
     * 
     * @param variableQualifier The variable qualifier (e.g. MyModel.MyVar[1][2])
     * @return the variable name part of the qualifier (e.g. MyModel.MyVar)
     */
    public static def String getVariableName(String variableQualifier) {
        val i = variableQualifier.indexOf("[")
        if(i >= 0) {
            return variableQualifier.substring(0, i)
        }
        return variableQualifier
    }
    
    /**
     * Returns the array indices of a variable qualifier.
     * 
     * @param variableQualifier The variable qualified (e.g. MyModel.MyVar[1][2])
     * @return the array indices of the qualifier (e.g. #[1,2])
     */
    public static def List<Integer> getArrayIndices(String variableQualifier) {
        val indices = <Integer> newArrayList
        val i = variableQualifier.indexOf("[")
        if(i >= 0) {
            val arrayIndexPart = variableQualifier.substring(i+1) 
            val numberPattern = Pattern.compile("\\d+")
            val matcher = numberPattern.matcher(arrayIndexPart)
            while (matcher.find()) {
                val numberText = matcher.group()
                indices.add(Integer.valueOf(numberText))
            }
        }
        return indices
    } 
    
    /**
     * Returns the first variable with the given name of the model with the given name.
     * 
     * @param modelName The name of the model, or null if any variable with the given name should be returned
     * @param variableName The name of the variable
     * @return the first variable with the given name of the given model, or null if none
     */
    public def Variable getVariable(String modelName, String variableName) {
        if(modelName != null) {
            val model = getModel(modelName)
            if(model != null) {
                return model.getVariable(variableName)    
            }
        } else {
            return getVariable(variableName)
        }
        return null
    }
    
    /**
     * Returns the concatenation of all variables of all models.
     * 
     * @return the concatenation of all variables of all models.
     */
    public def List<Variable> getAllVariables() {
        val List<Variable> allVariables = newArrayList()
        for(m : models) {
            allVariables.addAll(m.variables)
        }
        return allVariables
    }
    
    /**
     * Returns the models in this pool.
     * 
     * @return the models in this pool
     */
    public def List<Model> getModels() {
        return models
    }
    
    /**
     * Remove a model from the pool.
     * 
     * @param m The model
     */
    public def void removeModel(Model m) {
        models.remove(m)
    }
    
    /**
     * Add a model to the pool.
     * 
     * @param m The model
     */
    public def void addModel(Model m) {
        // Remove in old model
        if(m.pool != null) {
            m.pool.models.remove(m)
        }
        // Set new model
        m.pool = this
        if(!models.contains(m)) {
            models.add(m)
        }
    }
    
    /**
     * Returns a model name that is not yet used in this data pool
     */
    public def String getUniqueModelName(String name, int suffix) {
        val uniqueName = if(suffix > 0)
                             name+"_"+suffix
                         else
                             name
        val modelWithThisName = models.findFirst[it.name.equals(uniqueName)]
        if(modelWithThisName == null) {
            return uniqueName
        } else {
            return getUniqueModelName(name, suffix+1)
        }
    }
    
    /**
     * Returns a list of all previous pools from old to new.
     * 
     * @return the list of previous data pools
     */
    public def List<DataPool> getHistory() {
        val List<DataPool> history = newArrayList()
        var next = this.previousPool
        while(next != null) {
            history.add(next)
            next = next.previousPool
        }
        return history.reverse
    }
    
    /**
     * Sets the flag that a variable has been modified so that the variables have to be applied before the next tick.
     */
    protected def void setModifiedVariable() {
        hasModifiedVariable = true
    }
    
    /**
     * Applies all user values.
     */
    public def void applyUserValues() {
        // Apply user made changes to variable values
        for(m : models) {
            m.applyUserValues
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override String toString() {
        var String txt = "{  "
        val modelCount = models.size
        for(var i = 0; i < modelCount; i++) {
            val model = models.get(i)
            txt += model.name+"={"
            
            val variableCount = model.variables.size
            for(var v = 0; v < variableCount; v++) {
                val variable = model.variables.get(v)
                txt += variable.name + "=" + variable.value
                if(v < variableCount-1) {
                    txt += ", "
                }
            }
            
            txt += "}"
            if(i < modelCount-1) {
                txt += "\n"
            }
        }
        txt += "  }"
        return txt 
    }
}