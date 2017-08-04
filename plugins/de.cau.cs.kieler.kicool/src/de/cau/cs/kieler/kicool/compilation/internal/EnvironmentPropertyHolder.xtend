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
package de.cau.cs.kieler.kicool.compilation.internal

import org.eclipse.emf.ecore.EObject
import java.util.List
import java.util.LinkedList
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import de.cau.cs.kieler.kicool.KVPair

import static extension org.eclipse.xtext.EcoreUtil2.*
import static extension de.cau.cs.kieler.kicool.environments.Environment.*
import de.cau.cs.kieler.core.model.properties.MapPropertyHolder
import de.cau.cs.kieler.kicool.environments.Environment
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.Pair
import de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingIntegration

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
    }   
    
    static def <T extends EnvironmentPropertyHolder> T copyEnvironment(T source, T target) {
        val inplace = source.getProperty(INPLACE)
        val ongoingWorkingCopy = source.getProperty(ONGOING_WORKING_COPY)
        val inplaceValid = source.getProperty(INPLACE_VALID)
     
        val model = source.getProperty(MODEL)
        var Copier modelCopier = null
        if (model instanceof EObject) {
            if (inplace && inplaceValid) {
                target.propertyMap.put(MODEL, model)
            } else {
                if (ongoingWorkingCopy && inplaceValid) {
                    val copyResult = model.tracingCopyAndReturnCopier(source)
                    modelCopier = copyResult.second
                    source.propertyMap.put(MODEL, copyResult.first)
                    target.propertyMap.put(MODEL, model)    
                } else {
                    val copyResult = model.tracingCopyAndReturnCopier(source)
                    modelCopier = copyResult.second
                    target.propertyMap.put(MODEL, copyResult.first)
                }
            }
        } else {
            copyValue(target, MODEL, model)
        }

        for(k : source.propertyMap.keySet.immutableCopy) {
            if (k != MODEL && k != SOURCE_MODEL) {
                val v = source.propertyMap.get(k)
                
                copyValue(target, k, v)
                
                if (modelCopier != null) {
                    if (v instanceof IKiCoolCloneable) {
                        if (ongoingWorkingCopy && inplaceValid) {
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
    
    static def <T extends EnvironmentPropertyHolder> copyValue(T target, IProperty<?> k, Object v) {
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
                    target.propertyMap.put(k, v.cloneObject)
                }
            } else if (v instanceof List<?>) {
                if (k.equals(Environment.ERRORS)) {
                    target.propertyMap.put(k, new LinkedList<String>(v as List<String>))
                }
            } else {
                target.propertyMap.put(k, v)
                    System.err.println("Prime environment wants to copy value of key \"" + k + "\", but the value "+ 
                        "does not seem to be cloneable. This might be ok, but you should resolve this.");
            }
        }  
    }
    
    static def processEnvironmentSetter(Environment environment, List<KVPair> kvPairList) {
        for(pair : kvPairList) {
            var Object setTo = null
            
            if (pair.isIsKeyValue) {
                setTo = environment.propertyMap.get(pair.value)
            } else {
                val v = pair.value
                try {
                    val myInt = Integer.parseInt(v)
                    setTo = myInt
                } catch (NumberFormatException e) {
                    try {
                        val myDouble = Double.parseDouble(v)
                        setTo = myDouble
                    } catch (NumberFormatException e2) {
                        if (v.equalsIgnoreCase("true")) setTo = true
                        else if (v.equalsIgnoreCase("false")) setTo = false
                        else setTo = v
                    }
                } 
            }
            
            environment.setPropertyById(pair.key, setTo)
        }
    }
    
    static def <T extends EObject> T tracingCopy(T eObject, EnvironmentPropertyHolder eph) {
        if (TracingIntegration.isTracingActive(eph as Environment)) {
            return TracingIntegration.copy(eObject, eph as Environment) as T
        } else {
            return eObject.copy
        }
    }
    
    static def <T extends EObject> Pair<T, Copier> tracingCopyAndReturnCopier(T eObject, EnvironmentPropertyHolder eph) {
        if (TracingIntegration.isTracingActive(eph as Environment)) {
            return TracingIntegration.copyAndReturnCopier(eObject, eph as Environment)
        } else {
            val copier = new Copier()
            val EObject result = copier.copy(eObject)
            copier.copyReferences
            return new Pair(result as T, copier)
        }
    }
    
}