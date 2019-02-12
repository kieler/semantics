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
package de.cau.cs.kieler.kicool.compilation.internal

import de.cau.cs.kieler.core.model.Pair
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.MapPropertyHolder
import de.cau.cs.kieler.kexpressions.JsonArrayValue
import de.cau.cs.kieler.kexpressions.JsonObjectValue
import de.cau.cs.kieler.kexpressions.NullValue
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingIntegration
import java.util.ArrayList
import java.util.Collection
import java.util.LinkedHashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

import static de.cau.cs.kieler.kicool.environments.Environment.*

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import java.util.Set

/**
 * Internal class for handling the processor environments.
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class EnvironmentPropertyHolder extends MapPropertyHolder {
    
 
    static def Environment preparePrimeEnvironment(Environment environment) {
        val prime = new Environment()
        environment.copyEnvironment(prime)
        
        return prime
    }   
    
    static def <T extends EnvironmentPropertyHolder> T copyEnvironment(T source, T target) {
        val inplace = source.getProperty(INPLACE)
        val ongoingWorkingCopy = source.getProperty(ONGOING_WORKING_COPY)
        val endogenous = source.getProperty(PROCESSOR_INSTANCE)?.type == ProcessorType.ENDOGENOUS_TRANSFORMATOR
     
        val model = source.getProperty(MODEL)
        var Copier modelCopier = null
        if (model instanceof EObject) {
            if (endogenous && !inplace) {
                if (ongoingWorkingCopy) {
                    val copyResult = model.copyAndReturnCopier(source)
                    modelCopier = copyResult.second
                    source.propertyMap.put(MODEL, copyResult.first)
                    target.propertyMap.put(MODEL, model)
                } else {
                    val copyResult = model.copyAndReturnCopier(source)
                    modelCopier = copyResult.second
                    target.propertyMap.put(MODEL, copyResult.first)
                }
            } else {
                target.propertyMap.put(MODEL, model)
            }
        } else {
            copyValue(target, MODEL, model, modelCopier)
        }
        
        // set source model
        target.propertyMap.put(SOURCE_MODEL, model)

        for(k : source.propertyMap.keySet.immutableCopy) {
            if (k != MODEL && k != SOURCE_MODEL) {
                val v = source.propertyMap.get(k)
                
                if (k == ORIGINAL_MODEL) {
                    target.propertyMap.put(k, v)
                } else {
                    copyValue(target, k, v, modelCopier)
                }
                
                if (modelCopier !== null) {
                    if (v instanceof IKiCoolCloneable) {
                        if (ongoingWorkingCopy) {
                            (source.getProperty(k) as IKiCoolCloneable).resolveCopiedObjects(modelCopier)    
                        } else {
                            if (!v.volatile) {
                                // Should use the reversed map
//                                (target.getProperty(k) as IKiCoolCloneable).resolveCopiedObjects(v, copyResult.second)
                            }
                        }
                    }
                }
            }
        }
        
        target
    }
    
    static def <T extends EnvironmentPropertyHolder> copyValue(T target, IProperty<?> k, Object v, Copier copier) {
        if (v instanceof EObject) {
            target.propertyMap.put(k, v.copy)
        } else {
            if (v instanceof Integer) {
                target.propertyMap.put(k, new Integer(v))
            } else if (v instanceof Boolean) {
                target.propertyMap.put(k, new Boolean(v))
            } else if (v instanceof Double) {
                target.propertyMap.put(k, new Double(v))
            } else if (v instanceof Long) {
                target.propertyMap.put(k, new Long(v))
            } else if (v instanceof String) {
                target.propertyMap.put(k, new String(v))
            } else if (v instanceof IKiCoolCloneable) {
                if (!v.volatile) {
                    val clone =  v.cloneObject
                    if (copier !== null) { 
                        clone.resolveCopiedObjects(copier)
                    }
                    target.propertyMap.put(k, clone)
                }
            } else if (v instanceof List<?>) {
                if (k.equals(Environment.ERRORS) || k.equals(Environment.WARNINGS) || k.equals(Environment.INFOS)) {
                    target.propertyMap.put(k, new LinkedList<String>(v as List<String>))
                } else {
                    target.propertyMap.put(k, v)
                }
            } else if (v instanceof Set<?>) {
                    target.propertyMap.put(k, v)
            } else if (v instanceof Map<?,?>) {
                    target.propertyMap.put(k, v)
            } else {
                target.propertyMap.put(k, v)
//                    System.err.println("Prime environment wants to copy value of key \"" + k + "\", but the value "+ 
//                        "does not seem to be cloneable. This might be ok, but you should resolve this.");
            }
        }  
    }
    
    static def processEnvironmentConfig(Environment environment, JsonObjectValue json) {
        if (json !== null) {
            for(member : json.members) {
                environment.setPropertyById(member.key, getValue(environment, member.key, member.value))
            }
        }
    }
    
    private static def Object getValue(Environment environment, String id, Value value) {
        return switch(value) {
            JsonArrayValue: {
                val current = environment.getPropertyById(id)
                if (current === null) {
                    (new ArrayList).addToArray(value, environment, id)
                } else if (current instanceof Collection<?>) {
                    (current as Collection<Object>).addToArray(value, environment, id)
                } else {
                    environment.warnings.add("Can not parse array in configuration with id: " + id)
                    null
                }
            }
            JsonObjectValue: {
                val current = environment.getPropertyById(id)
                if (current === null) {
                    (new LinkedHashMap).addToMap(value, environment, id)
                } else if (current instanceof Map<?, ?>) {
                    (current as Map<Object, Object>).addToMap(value, environment, id)
                } else {
                    environment.warnings.add("Can not parse object in configuration with id: " + id)
                    null
                }
            }
            NullValue: {
                null
            }
            Value: {
                val attr = value.eClass.EAttributes.findFirst["value".equals(name)]
                if (attr !== null) {
                    value.eGet(attr)
                } else {
                    environment.warnings.add("Can not parse value of configuration with id: " + id)
                    null
                }
            }
        }
    }
    
    private static def Object addToArray(Collection<Object> coll, JsonArrayValue value, Environment environment, String id) {
        for (entry : value.elements.indexed) {
            coll.add(getValue(environment, id + "[" + entry.key + "]", entry.value))
        }
        return coll
    }
    
    private static def Object addToMap(Map<Object, Object> map, JsonObjectValue value, Environment environment, String id) {
        for (entry : value.members) {
            map.put(entry.key.toString, getValue(environment, id + "[" + entry.key.toString + "]", entry.value))
        }
        return map
    }
    
    static def <T extends EObject> Pair<T, Copier> copyAndReturnCopier(T eObject, EnvironmentPropertyHolder eph) {
        return TracingIntegration.copyAndReturnCopier(eObject, eph as Environment)
    }
    
    def <T> boolean propertyExists(IProperty<T> property) {
        return allProperties.keySet.contains(property)
    }
}