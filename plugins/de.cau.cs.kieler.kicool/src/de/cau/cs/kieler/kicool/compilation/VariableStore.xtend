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
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import de.cau.cs.kieler.kicool.environments.Environment
import java.util.Comparator
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString

import static de.cau.cs.kieler.kexpressions.KExpressionsPackage.*

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@ToString
class VariableStore implements IKiCoolCloneable {
    
    public static val IProperty<VariableStore> STORE = 
        new Property<VariableStore>("de.cau.cs.kieler.kicool.compilation.variables.store", null)
        
    public static val PRINT_FORMAT_ANNOTAION = "PrintFormat"
        
    // Common variable properties
    public static val INPUT = "input"
    public static val OUTPUT = "output"
    public static val STATIC = "static"
    public static val SIGNAL = "signal"
    public static val CONST = "const"
    public static val EXTERN = "extern"
    public static val RESET = "reset" // Code generators will reset this variable explicitly.
    public static val ENUM = "enum"
        
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
                update(vo)
            }
        }
    }

    // -- Convenience for Valued Objects --
    def VariableInformation getInfo(ValuedObject vo) {
        var info = variables.get(vo.hierarchicalName).findFirst[valuedObject == vo]
        if (info === null) {
            info = variables.entries.findFirst[value.valuedObject == vo]?.value
        }
        return info
    }
        
    def VariableInformation update(ValuedObject vo, String... properties) {
        var info = variables.get(vo.hierarchicalName).findFirst[valuedObject == vo]
        if (info === null) {
            val entry = variables.entries.findFirst[value.valuedObject == vo]
            if (entry !== null && !entry.key.equals(vo.name)) {
                // allow renaming
                variables.entries.remove(entry)
            }
            info = entry?.value
        }
        if (info === null) {
            // ValuedObject not previously registered
            info = new VariableInformation
        }
        update(vo, info, properties)
    }
    
    def VariableInformation update(ValuedObject vo, VariableInformation info, String... properties) {
        val decl = vo.eContainer
        
        info.valuedObject = vo
        if (!vo.cardinalities.nullOrEmpty) {
            info.dimensions = vo.cardinalities.map[if (it instanceof IntValue) it.value else 0].toList
        } else {
            info.dimensions.clear
        }
        info.properties += properties
        
        if (decl instanceof VariableDeclaration) {
            // flags
            for (flags : DECL_FLAGS.entrySet) {
                val value = decl.eGet(decl.eClass.getEStructuralFeature(flags.key))
                if (decl.eIsSet(decl.eClass.getEStructuralFeature(flags.key)) && value instanceof Boolean && value as Boolean) {
                    info.properties += flags.value
                }
            }
            
            // type
            info.type = decl.type
            if (!decl.hostType.nullOrEmpty) {
                info.typeName = decl.hostType
            } else {
                info.typeName = decl.type.literal
            }
            
            // Add print format
            var String format = null
            if (decl.annotations.exists[PRINT_FORMAT_ANNOTAION.equalsIgnoreCase(name)]) {
                val value = decl.annotations.filter(StringAnnotation).findLast[PRINT_FORMAT_ANNOTAION.equalsIgnoreCase(name)].values?.head
                if (!value.nullOrEmpty) format = value
            }
            if (vo.annotations.exists[PRINT_FORMAT_ANNOTAION.equalsIgnoreCase(name)]) {
                val value = vo.annotations.filter(StringAnnotation).findLast[PRINT_FORMAT_ANNOTAION.equalsIgnoreCase(name)].values?.head
                if (!value.nullOrEmpty) format = value
            }
            if (!format.nullOrEmpty) {
                info.format = format
            }
        }
        
        info.annotations.clear
        vo.annotations.forEach[
            info.annotations += it.copy
        ]
        
        // Handle hierachy
        var classDecl = if (decl.eContainer instanceof ClassDeclaration) decl.eContainer as ClassDeclaration
        var superClassPrefix = ""
        if (classDecl !== null) {
            var superClass = classDecl.eContainer
            while (superClass instanceof ClassDeclaration) {
                superClassPrefix = superClass.name + "." + superClassPrefix
                superClass = superClass.eContainer
            }
            superClassPrefix += classDecl.name
            info.encapsulatedIn = superClassPrefix
        }
        if (decl instanceof ClassDeclaration) {
            info.containerName = !superClassPrefix.nullOrEmpty ? superClassPrefix + "." + decl.name : decl.name
        }
        
        var name = vo.name
        if (classDecl !== null) {
            name = superClassPrefix + "." + name
        }
        
        variables.put(name, info)
        return info
    }
    
    protected def getHierarchicalName(ValuedObject vo) {
        var name = vo.name
        var classDecl = vo.eContainer?.eContainer
        while (classDecl instanceof ClassDeclaration) {
            name = classDecl.name + "." + name
            classDecl = classDecl.eContainer
        }
        return name
    }
    
    def boolean remove(ValuedObject vo) {
        val removed = variables.values.removeIf[valuedObject == vo]
        if (removed) {
            val container = vo.eContainer
            if (container instanceof ClassDeclaration) {
                if (container.valuedObjects.size == 1) {
                    container.declarations.map[valuedObjects].flatten.forEach[this.remove(it)]
                }
            }
        }
        return removed
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
    
    
    // Cloneable
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
    
    def getOrderedVariables() {
        return variables.entries.map[new Pair(key, value)].sortWith(VARIABLE_ORDER)
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
    
    /** The value formatting rule */
    @Accessors
    var String format
    
    /** Characteristics of this variable */
    @Accessors
    val Set<String> properties = newHashSet
    
    /** Indicates that the variables is not part of the model (i.e. not part of the TickData) */
    @Accessors
    var String externalName

    /** List of copied annotations from the original valued object */
    @Accessors
    val List<Annotation> annotations = newLinkedList
    
    /** Sub variable in class */
    @Accessors
    var String encapsulatedIn
    
    /** name of this container for encapsulation */
    @Accessors
    var String containerName
    
    /** original name of the associated enum */
    //@Accessors
    //var String enumName
    
    override VariableInformation clone() {
        val clone = new VariableInformation
        clone.valuedObject = valuedObject
        clone.dimensions = dimensions
        clone.type = type
        clone.typeName = typeName
        clone.format = format
        clone.properties.addAll(properties)
        clone.encapsulatedIn = encapsulatedIn
        clone.containerName = containerName
        annotations.forEach[ clone.annotations += it.copy ]
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
    
    def isExternal() {
        return !externalName.nullOrEmpty
    }
    
    def isEncapsulated() {
        return !encapsulatedIn.nullOrEmpty
    }  
    
    def isContainer() {
        return !containerName.nullOrEmpty
    }  
}
