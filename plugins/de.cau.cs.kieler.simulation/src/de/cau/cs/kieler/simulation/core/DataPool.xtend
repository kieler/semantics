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

import de.cau.cs.kieler.simulation.json.JsonManager
import java.util.List
import java.util.Map
import java.util.regex.Pattern
import org.eclipse.xtend.lib.annotations.Accessors

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
    private val List<Model> models = newArrayList
    
    /**
     * A mapping from model names to the corresponding model
     */
    private val Map<String, Model> modelsMap = newHashMap
    
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
     * The action index in the simulation after this data pool was created.
     * A simulation could be continued from this action index.
     */
    @Accessors
    private int actionIndex = -1
    
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
     * Convert this instance to a json representation.
     * 
     * @return the JSON representation for this object
     */
    public def String toJson() {
        val json = JsonManager.GSON.toJson(this)
        return json
    }
    
    /**
     * Creates a data pool from a json representation
     * 
     * @param json The JSON representation to be loaded
     * @return the loaded data pool
     */
    public static def DataPool createFromJson(String json) {
        val pool = JsonManager.GSON.fromJson(json, typeof(DataPool))
        return pool
    }
    
    /**
     * Returns first the model with the given name.
     * 
     * @param modelName The name of the model
     * @return the model with the given name, or null if none
     */
    public def Model getModel(String modelName) {
        return modelsMap.get(modelName)
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
     * @param variableName The (possibly fully qualified) name of the variable (e.g. MyModel.MyVar)
     * @param isfullyQualified Determines whether it is a fully qualified variable name
     * @return the first variable with the given name (possibly of the corresponding model), or null if none
     */
    public def Variable getVariable(String variableName, boolean isFullyQualified) {
        if(!isFullyQualified) {
            for(m : models) {
                val variable = m.getVariable(variableName)
                if(variable != null) {
                    return variable    
                }
            }
            // No model name specified, so search in the complete data pool for the variable
            return null    
        } else if(!variableName.isNullOrEmpty) {
            // Separate model name and variable name
            val i = variableName.indexOf(".")
            if(i >= 0 && i < variableName.length-1) {
                val modelName = variableName.substring(0,i)
                val relativeVariableName = variableName.substring(i + 1, variableName.length)
                return getVariable(modelName, relativeVariableName)
            } else {
                // This is not fully qualified actually.
                return getVariable(variableName, false)
            }
        }
    }
    
    /**
     * Returns the value of a variable, or of an array element of a variable.
     * 
     * @param variableQualifer The (possibly fully qualified) name of the variable and optional array indices (e.g. MayVar[1][2])
     * @param userValue Determines if the user value should be set instead of the 'real' value
     * @return the first variable with the given name (possibly of the corresponding model), or null if none
     */
    public def Object getVariableValue(String variableQualifer, boolean userValue) {
        // Separate variable name and array index part
        val variablePart = getVariableName(variableQualifer)
        val arrayIndices = getArrayIndices(variableQualifer)
        
        val variable = getVariable(variablePart)
        if(variable != null) {
            if(arrayIndices.isNullOrEmpty) {
                if(userValue && variable.isDirty) {
                    return variable.userValue
                } else {
                    return variable.value
                }
            } else {
                val array = variable.value as NDimensionalArray
                val arrayElement = array.getElement(arrayIndices)
                if(arrayElement != null) {
                    if(userValue && arrayElement.isDirty) {
                        return arrayElement.userValue    
                    } else {
                        return arrayElement.value
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
     * Sets the value of a variable, or of an array element of a variable.
     * 
     * @param variableQualifer The (possibly fully qualified) name of the variable and optional array indices (e.g. MayVar[1][2])
     * @param newValue The new value
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
        modelsMap.remove(m.name)
    }
    
    /**
     * Add a model to the pool.
     * 
     * @param m The model
     */
    public def void addModel(Model m) {
        // Remove in old model
        if(m.pool != null) {
            m.pool.removeModel(m)
        }
        // Set new model
        m.pool = this
        if(!hasModel(m.name)) {
            models.add(m)
            modelsMap.put(m.name, m)
        }
    }
    
    /**
     * Returns true if a model with the given name is in the pool.
     */
    public def boolean hasModel(String name) {
        return modelsMap.containsKey(name)
    }
    
    /**
     * Returns a model name that is not yet used in this data pool
     */
    public def String getUniqueModelName(String name, int suffix) {
        val uniqueName = if(suffix > 0)
                             name+"_"+suffix
                         else
                             name
        val modelWithThisName = modelsMap.get(uniqueName)
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