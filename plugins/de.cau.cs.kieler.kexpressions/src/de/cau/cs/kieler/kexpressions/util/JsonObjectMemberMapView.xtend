/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kexpressions.util

import de.cau.cs.kieler.kexpressions.JsonObjectMember
import de.cau.cs.kieler.kexpressions.Value
import java.util.List
import java.util.Map
import java.util.Map.Entry
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtend.lib.annotations.Delegate
import de.cau.cs.kieler.kexpressions.KExpressionsFactory

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@FinalFieldsConstructor
class JsonObjectMemberMapView implements Map<String, Value> {
    
    @FinalFieldsConstructor
    static class JsonObjectMemberEntry implements Entry<String, Value> {
        val JsonObjectMember member
        
        override getKey() {
            member.key
        }
        
        override getValue() {
            member.value
        }
        
        override setValue(Value value) {
            member.value = value
            member.value
        }
        
    }
    
    val List<JsonObjectMember> members
    
    override clear() {
        members.clear
    }
    
    override containsKey(Object k) {
        members.exists[if (k === null) k == key else k.equals(key)]
    }
    
    override containsValue(Object v) {
        members.exists[if (v === null) v == value else v.equals(value)]
    }
    
    override entrySet() {
        members.map[new JsonObjectMemberEntry(it) as Entry<String, Value>].toSet
    }
    
    override get(Object k) {
        members.findFirst[if (k === null) k == key else k.equals(key)]?.value
    }
    
    override isEmpty() {
        members.empty
    }
    
    override keySet() {
        members.map[key].toSet
    }
    
    override put(String k, Value v) {
        if (k.containsKey) {
            val m = members.findFirst[if (k === null) k == key else k.equals(key)]
            val old = m.value
            m.value = v
            return old
        } else {
            members.add(KExpressionsFactory.eINSTANCE.createJsonObjectMember => [
                key = k
                value = v
            ])
            return null
        }
    }
    
    override putAll(Map<? extends String, ? extends Value> m) {
        m.entrySet.forEach[key.put(value)]
    }
    
    override remove(Object k) {
        val m = members.findFirst[if (k === null) k == key else k.equals(key)]
        if (m !== null) {
            members.remove(m)
            return m.value
        }
        return null
    }
    
    override size() {
        keySet.size
    }
    
    override values() {
        members.map[value].toSet
    }
    
}