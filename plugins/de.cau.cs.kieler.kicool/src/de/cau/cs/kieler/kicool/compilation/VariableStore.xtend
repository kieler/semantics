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
import com.google.common.collect.Sets
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import de.cau.cs.kieler.kicool.environments.Environment
import java.util.Comparator
import java.util.List
import java.util.Map.Entry
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString

import static de.cau.cs.kieler.kexpressions.KExpressionsPackage.*

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
    // A floating point value representing time in seconds
    public static val TIME_FLOAT_SEC = "time"
        
    public static val DECL_FLAGS = #{
        VARIABLE_DECLARATION__INPUT -> INPUT,
        VARIABLE_DECLARATION__OUTPUT -> OUTPUT,
        VARIABLE_DECLARATION__STATIC -> STATIC,
        VARIABLE_DECLARATION__SIGNAL -> SIGNAL,
        VARIABLE_DECLARATION__CONST -> CONST,
        VARIABLE_DECLARATION__EXTERN -> EXTERN
    }
    
    public static val COMMON_VALUE_TYPE_NAMES = #{
        ValueType.BOOL.literal -> ValueType.BOOL,
        ValueType.BOOL.getName -> ValueType.BOOL,
        typeof(Boolean).name -> ValueType.BOOL,
        typeof(Boolean).name.toLowerCase -> ValueType.BOOL,
        ValueType.DOUBLE.literal -> ValueType.FLOAT,
        ValueType.DOUBLE.getName -> ValueType.FLOAT,
        typeof(Double).name -> ValueType.FLOAT,
        typeof(Double).name.toLowerCase -> ValueType.FLOAT,
        ValueType.FLOAT.literal -> ValueType.FLOAT,
        ValueType.FLOAT.getName -> ValueType.FLOAT,
        typeof(Float).name -> ValueType.FLOAT,
        typeof(Float).name.toLowerCase -> ValueType.FLOAT,
        ValueType.INT.literal -> ValueType.INT,
        ValueType.INT.getName -> ValueType.INT,
        typeof(Integer).name -> ValueType.INT,
        typeof(Integer).name.toLowerCase -> ValueType.INT,
        ValueType.STRING.literal -> ValueType.STRING,
        ValueType.STRING.getName -> ValueType.STRING,
        typeof(String).name -> ValueType.STRING,
        typeof(String).name.toLowerCase -> ValueType.STRING
    }
    
    public static val VARIABLE_ORDER = new Comparator<Pair<String, VariableInformation>>() {
        
        override compare(Pair<String, VariableInformation> o1, Pair<String, VariableInformation> o2) {
            val info1 = o1.value
            val info2 = o2.value
            if (info1 !== null && info2 !== null) {
                if (info1.input && info2.input) {
                    if (info1.output && !info2.output) {
                        return 1
                    } else if (!info1.output && info2.output) {
                        return -1
                    }
                } else if (info1.input){
                    return -1
                } else if (info2.input){
                    return 1
                } else if (info1.output && !info2.output) {
                    return -1
                } else if (!info1.output && info2.output) {
                    return 1
                }
            }
            return o1.key.compareTo(o2.key)
        }
        
    }

    @Accessors
    val variables = HashMultimap.<String, VariableInformation>create
    
    
    static def getVariableStore(Environment env) {
        var store = env?.getProperty(STORE)
        if (store === null && env !== null) {
            store = new VariableStore
            env.setProperty(STORE, store)
        }
        return store
    }
    
    // alias
    static def get(Environment env) {
        getVariableStore(env)
    }
    
    def initialize(EObject root) {
        for (decl : root.eAllContents.filter(VariableDeclaration).toIterable) {
            for (vo : decl.valuedObjects) {
                add(vo)
            }
        }
    }

    // Convenance for Valued Objects
    
    /**
     * Shoudl only be used for variables that are NOT yet contained in the store.
     */
    def VariableInformation add(ValuedObject vo, String... properties) {
        update(vo, new VariableInformation, properties)
    }
    
    def VariableInformation update(ValuedObject vo, String... properties) {
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
    
    def VariableInformation update(ValuedObject vo, VariableInformation info, String... properties) {
        val decl = vo.eContainer
        
        info.valuedObject = vo
        if (!vo.cardinalities.nullOrEmpty) {
            info.dimensions = vo.cardinalities.map[if (it instanceof IntValue) it.value else 0]
        } else {
            info.dimensions.clear
        }
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

    def void removeAllUncontainedVO(EObject eObject, Environment env) {
        removeAllUncontainedVO(eObject, env, false, false)
    }
    
    def void removeAllUncontainedVO(EObject eObject, Environment env, boolean checkNonVO, boolean warning) {
        val containedVOs = eObject.eAllContents.filter(ValuedObject).toSet
        variables.entries.removeIf[
            val remove = (it.value.valuedObject !== null || checkNonVO) && !containedVOs.contains(it.value.valuedObject)
            if (remove && warning) {
                if (it.value.valuedObject !== null) {
                    env.warnings.add("Removing ValuedObject " + (it.value.valuedObject.name)?:"null" + " from VariableStore since it is no longer contained in the model.")
                } else {
                    env.warnings.add("Removing entry " + it.key + " without ValuedObject association from VariableStore.")
                }
            }
            return remove
        ]
    }
    
    def void matchAllVOs(EObject eObject, Environment env, boolean error) {
        val containedVOs = eObject.eAllContents.filter(ValuedObject).toSet
        val markedVOs = variables.values.map[valuedObject].toSet
        
        Sets.difference(containedVOs, markedVOs).forEach[
            (if (error) env.errors else env.warnings).add("ValuedObject with name " + it.name + " is contained in the model but not in VariableStore.")
        ]
        Sets.difference(markedVOs, containedVOs).forEach[
            (if (error) env.errors else env.warnings).add("ValuedObject with name " + it.name + " is registered in the VariableStore but not contained in the model.")
        ]        
    }
    
    // Functions without VO
        
    def VariableInformation add(CharSequence name, String... properties) {
        val info = new VariableInformation => [it.properties += properties]
        variables.put(name.toString, info)
        return info
    }
    
    
    // Clonable
    
    override isMutable() {
        true
    }
    
    override cloneObject() {
        val clone = new VariableStore
        clone.copyFrom(this)
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
    
    protected def void copyFrom(VariableStore source) {
        for (entry : source.variables.entries) {
            variables.put(entry.key, entry.value.clone)
        }
    }
    
    def isAmbiguous() {
        return variables.keySet.size != variables.entries.size
    }
    
    def getOrderedVariableNames() {
        return variables.entries.map[new Pair(key, value)].sortWith(VARIABLE_ORDER).map[key]
    }
    
}

@ToString
class VariableInformation {
    
    /** OPTIONAL VO reference */
    @Accessors
    var ValuedObject valuedObject
    
    /** Dimensions if is array */
    @Accessors
    var List<Integer> dimensions = newArrayList
    
    /** OPTIONAL value type */
    @Accessors
    var ValueType type
    
    /** Value type name */
    @Accessors
    var String typeName
    
    /** Characteristics of this variable */
    @Accessors
    val Set<String> properties = newHashSet
    
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
        return !dimensions.empty
    }
    
    def setType(ValueType type) {
        if (typeName.nullOrEmpty) {
            typeName = type.literal
        }
        this.type = type
    }
    
    def inferType() {
        if (type !== null) {
            return type
        } else if (!typeName.nullOrEmpty) {
            return VariableStore.COMMON_VALUE_TYPE_NAMES.get(typeName)
        }
        return null
    }
    
    def isInput() {
        return properties.contains(VariableStore.INPUT)
    }
    
    def isOutput() {
        return properties.contains(VariableStore.OUTPUT)
    }
    
}