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

import de.cau.cs.kieler.kicool.compilation.Environment
import org.eclipse.emf.ecore.EObject
import java.util.List
import java.util.LinkedList
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import de.cau.cs.kieler.kicool.KVPair

import static extension org.eclipse.xtext.EcoreUtil2.*
import static extension de.cau.cs.kieler.kicool.compilation.Environment.*
import de.cau.cs.kieler.core.model.properties.MapPropertyHolder

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
     
        for(k : source.propertyMap.keySet) {
            val v = source.propertyMap.get(k)
            if (v instanceof EObject) {
                if (inplace) {
                    target.propertyMap.put(k, v)
                } else {
                    target.propertyMap.put(k, v.copy)
                }
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
                        if (inplace) {
                            target.propertyMap.put(k, v)
                        } else {
                            target.propertyMap.put(k, v.cloneObject)
                        }
                    }
                } else if (v instanceof List<?>) {
                    if (k.equals(Environment.ERRORS)) {
                        target.propertyMap.put(k, new LinkedList<String>(v as List<String>))
                    }
                } else {
                    target.propertyMap.put(k, v)
                    if (!inplace) {
                        System.err.println("Prime environment wants to copy value of key \"" + k + "\", but the value "+ 
                            "does not seem to be cloneable. This might be ok, but you should resolve this.");
                    }
                }
            }
        }   
        
        target
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
}