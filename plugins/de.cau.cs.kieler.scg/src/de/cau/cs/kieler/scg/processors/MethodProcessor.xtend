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
package de.cau.cs.kieler.scg.processors

import com.google.common.collect.HashBasedTable
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import java.util.Map
import java.util.Set

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import java.util.WeakHashMap
import de.cau.cs.kieler.kexpressions.ValueType

/**
 * 
 * @author als
 */
class MethodProcessor extends InplaceProcessor<SCGraphs> implements Traceable {

    public static val IProperty<Boolean> INLINE_ALL = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.methods.inline.all", false)
    public static val IProperty<Boolean> INLINE_NOTHING = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.methods.inline.nothing", false)  

    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension KEffectsExtensions
    @Inject extension PragmaExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension SCGMethodExtensions
        
    public static val GENERATED_PREFIX = "_"
    public static val SUPPORTED_RETURN_TYPES = #[ValueType.BOOL, ValueType.FLOAT, ValueType.HOST, ValueType.INT, ValueType.STRING]
    
    
    private int fnCouter = 0
    private val simpleMethodCache = new WeakHashMap<SCGraph, Boolean>()
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.methods"
    }
    
    override getName() {
        "Methods"
    }
    
    override process() {
        val voStore = VariableStore.get(environment)
        val methodSCGs = newHashMap
        val normalSCGs = newArrayList
        val inlined = newHashSet
        
        for (scg : model.scgs) {
            if (scg.isMethod) {
                methodSCGs.put(scg.methodDeclaration, scg)
                scg.methodDeclaration.preprocess(scg)
            } else {
                normalSCGs += scg
            }
        }
        for (scg : normalSCGs) {
            val calls = HashBasedTable.create
            for (node : scg.nodes) {
                if (node instanceof Assignment || node instanceof Conditional) {
                    for (refcall : node.eAllContents.filter(ReferenceCall).toIterable) {
                        var ValuedObjectReference vor = refcall
                        do {
                            val method = vor.valuedObject.eContainer
                            if (method instanceof MethodDeclaration) {
                                calls.put(method, node, refcall)
                            }
                            vor = vor.subReference
                        } while (vor !== null)
                    }
                }
            }
            for (call : calls.cellSet) {
                if (methodSCGs.containsKey(call.rowKey)) {
                    val method = call.rowKey
                    val methodSCG = methodSCGs.get(method)
                    if (!INLINE_NOTHING.property && (INLINE_ALL.property || method.hasAnnotation(SCGAnnotations.ANNOTATION_METHOD_INLINING) || methodSCG.isSimpleMethod)) {
                        method.inlineMethod(call.value, call.columnKey, methodSCGs, newHashSet)
                        inlined += methodSCG
                    }
                }
            }
        }
        
        // Remove inlined methods
        methodSCGs.entrySet.filter[inlined.contains(value)].forEach[
            it.key.valuedObjects.forEach[voStore.remove(it)]
            model.scgs.remove(it.value)
            it.key.remove
        ]
        // Remove classes without content
        for (scg : model.scgs) {
            scg.declarations.removeIf[it instanceof ClassDeclaration && (it as ClassDeclaration).declarations.nullOrEmpty]
        }
    }
    
    def boolean isSimpleMethod(SCGraph scg) {
        if (simpleMethodCache.containsKey(scg)) {
            return simpleMethodCache.get(scg)?:false
        } else {
            val simple = scg.nodes.size < 30
                && !scg.nodes.exists[hasAnnotation(SCGAnnotations.ANNOTATION_LOOP)]
                && !scg.nodes.map[eAllContents.toIterable].flatten.exists[it instanceof ReferenceCall]
            simpleMethodCache.put(scg, simple)
            return simple
        }
    }
    
    def void preprocess(MethodDeclaration method, SCGraph scg) {
        if (scg.declarations.map[valuedObjects].flatten.filter[isParameter].exists[parameterIndex == 1]) {
            method.markSelfInParameter
        }
        if (scg.nodes.map[eAllContents.toIterable].flatten.filter(ValuedObjectReference).exists[!(valuedObject.declaration instanceof ClassDeclaration) && valuedObject.declaration.eContainer !== scg]) {
            method.markTickDataInParameter
        }
        // Fix return
        if (!SUPPORTED_RETURN_TYPES.contains(method.returnType)) {
            method.returnType = ValueType.VOID
        }
    }
    
    def void inlineMethod(MethodDeclaration method, ReferenceCall call, Node callNode, Map<MethodDeclaration, SCGraph> methodSCGs,  Set<MethodDeclaration> callStack) {
        val methodSCG = methodSCGs.get(method)
        val voStore = VariableStore.get(environment)
        val callVOs = newLinkedList(call.valuedObject)
        var sub = call.subReference
        while (sub !== null) {
            callVOs += sub.valuedObject
            sub = sub.subReference
        }
        
        if (!callStack.add(method)) {
            environment.errors.add("Cannot inline recursive function calls")
            return
        }
        
        if (!call.schedule.nullOrEmpty) {
            environment.errors.add("User schedules are not supported in combination with method inlining!")
            return
        }
        
        val prefix = GENERATED_PREFIX + "fn" + fnCouter + callVOs.join("_", "_", "_", [name])
        fnCouter++
        val targetSCG = callNode.eContainer as SCGraph
        val scg = methodSCG.copy
        scg.unmarkAllLocalVariables
        
        val entry = scg.nodes.filter(Entry).head
        val exit = scg.nodes.filter(Exit).head
        val returnVO = scg.nodes.filter(Assignment).findFirst[isReturn]?.valuedObject
        val params = scg.declarations.map[valuedObjects].flatten.filter[isParameter].toMap([it],[parameterIndex])
        
        // Replace params
        var Declaration selfDecl
        for (vor : scg.nodes.map[eAllContents.filter(ValuedObjectReference).toIterable].flatten.toList) {
            if (params.containsKey(vor.valuedObject)) {
                val index = params.get(vor.valuedObject)
                if (index == -1) { // self
                    selfDecl = vor.valuedObject.declaration
                    vor.valuedObject = call.valuedObject
                    vor.indices += call.indices.map[copy]
                } else if (index < call.parameters.size) {
                    val exp = call.parameters.get(index).expression
                    if (exp instanceof ValuedObjectReference) {
                        vor.valuedObject = exp.valuedObject
                        vor.subReference = exp.subReference.copy
                        vor.indices.addAll(0, exp.indices.map[copy])
                    } else {
                        vor.replace(exp.copy)
                    }
                }
            }
        }
        if (selfDecl !== null) selfDecl.remove
        
        // Rename VOs
        scg.declarations.map[valuedObjects].flatten.forEach[name = prefix + name]
        
        // Connect
        callNode.allPrevious.toList.forEach[target = entry.next.target]
        entry.next.target = null
        entry.remove
        exit.allPrevious.toList.forEach[target = callNode]
        exit.remove
        
        // Remove return tag
        if (returnVO !== null) scg.nodes.filter(Assignment).forEach[removeAnnotations(SCGAnnotations.ANNOTATION_RETURN_NODE)]
        
        // Move nodes
        targetSCG.declarations += scg.declarations
        targetSCG.nodes += scg.nodes
        
        // Insert return value or remove call node
        if (returnVO !== null) {
            call.replace(returnVO.reference)
            voStore.update(returnVO, "method-inlining")
        } else if (callNode instanceof Assignment) {
            callNode.allPrevious.toList.forEach[target = callNode.next.target]
            callNode.next.target = null
            callNode.remove
        }
    }
    

}
