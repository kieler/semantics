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
package de.cau.cs.kieler.kicool.compilation

import com.google.common.collect.HashMultimap
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import de.cau.cs.kieler.kicool.environments.Environment
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.kexpressions.KExpressionsPackage.*
import de.cau.cs.kieler.kexpressions.ValueType

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class VariableStore implements IKiCoolCloneable {
    
    public static val IProperty<VariableStore> STORE = 
        new Property<VariableStore>("de.cau.cs.kieler.kicool.compilation.variables.store", null)
        
    // Common variable properties
    public static val INPUT = "input"
    public static val OUTPUT = "output"
    public static val STATIC = "static"
    public static val SIGNAL = "signal"
    public static val CONST = "const"
    public static val EXTERN = "extern"
        
    static val DECL_FLAGS = #{
        VARIABLE_DECLARATION__INPUT -> INPUT,
        VARIABLE_DECLARATION__OUTPUT -> OUTPUT,
        VARIABLE_DECLARATION__STATIC -> STATIC,
        VARIABLE_DECLARATION__SIGNAL -> SIGNAL,
        VARIABLE_DECLARATION__CONST -> CONST,
        VARIABLE_DECLARATION__EXTERN -> EXTERN
    }

    @Accessors
    val variables = HashMultimap.<String, VariableInformation>create
    
    static def getVariableStore(Environment env) {
        var store = env.getProperty(STORE)
        if (store === null) {
            store = new VariableStore
            env.setProperty(STORE, store)
        }
        return store
    }
    
    def initialize(EObject root) {
        for (decl : root.eAllContents.filter(VariableDeclaration).toIterable) {
            for (vo : decl.valuedObjects) {
                add(vo)
            }
        }
    }
    
    def add(ValuedObject vo, String... properties) {
        update(vo, new VariableInformation, properties)
    }
    
    def update(ValuedObject vo, String... properties) {
        var info = variables.get(vo.name).findFirst[valuedObject == vo]
        if (info === null) {
            val entry = variables.entries.findFirst[value.valuedObject == vo]
            if (entry !== null && !entry.key.equals(vo.name)) {
                // allow renaming
                variables.entries.remove(entry)
            }
            info = entry?.value
        }
        if (info === null) {
            throw new IllegalArgumentException("ValuedObject with name " + vo.name + " was not previously registered! Use add(..) to register.")
        }
        update(vo, info, properties)
    }
    
    def update(ValuedObject vo, VariableInformation info, String... properties) {
        val decl = vo.eContainer
        
        info.valuedObject = vo
        info.dimensions = vo.cardinalities.size
        info.properties += properties
        
        if (decl instanceof VariableDeclaration) {
            // flags
            for (flags : DECL_FLAGS.entrySet) {
                if (decl.eIsSet(decl.eClass.getEStructuralFeature(flags.key))) {
                    info.properties += flags.value
                }
            }
            if (!decl.hostType.nullOrEmpty) {
                info.typeName = decl.hostType
            } else {
                info.type = decl.type
                info.typeName = decl.type.literal
            }
        }
        
        variables.put(vo.name, info)
        return info
    }
    
    def remove(ValuedObject vo) {
        variables.values.removeIf[valuedObject == vo]
    }
    
    override isMutable() {
        true
    }
    
    override cloneObject() {
        val clone = new VariableStore
        for (entry : variables.entries) {
            clone.variables.put(entry.key, entry.value.clone)
        }
        return clone
    }
    
    override void resolveCopiedObjects(Copier copier) {
        for (info : variables.values) {
            var newVO = copier.get(info.valuedObject)
            if (newVO instanceof ValuedObject) {
                info.valuedObject = newVO
            } else {
                info.valuedObject = null
            }
        }
    }
    
    def isAmbiguous() {
        return variables.keySet.size != variables.values.size
    }
    
}

class VariableInformation {
    
    /** OPTIONAL VO reference */
    @Accessors
    var ValuedObject valuedObject
    
    /** Dimensions if is array */
    @Accessors
    var int dimensions = 0
    
    /** OPTIONAL value type */
    @Accessors
    var ValueType type
    
    /** Value type name */
    @Accessors
    var String typeName
    
    /** Characteristics of this variable */
    @Accessors
    val List<String> properties = newArrayList
    
    override VariableInformation clone() {
        val clone = new VariableInformation
        clone.valuedObject = valuedObject
        clone.dimensions = dimensions
        clone.type = type
        clone.typeName = typeName
        clone.properties.addAll(properties)
        return clone
    }
    
    def isArray() {
        return dimensions > 0
    }
    
}