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
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
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
import java.util.WeakHashMap

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * 
 * @author als
 */
class MethodProcessor extends InplaceProcessor<SCGraphs> implements Traceable {

    public static val IProperty<Boolean> INLINE_ALL = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.methods.inline.all", false)
    public static val IProperty<Boolean> INLINE_NOTHING = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.methods.inline.nothing", false)  
    public static val IProperty<Boolean> REMOVE_UNUSED = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.methods.removeUnused", true) 

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
        val remainingCalls = newHashSet
        
        for (scg : model.scgs) {
            if (scg.isMethod) {
                methodSCGs.put(scg.methodDeclaration, scg)
                scg.methodDeclaration.preprocess(scg)
            } else {
                normalSCGs += scg
            }
        }
        
        // inline calls in main SCGs
        for (scg : normalSCGs) {
            scg.inlineCalls(methodSCGs, inlined, remainingCalls)
            if (environment.inDeveloperMode) snapshot
        }
        // Inline method calls in non-inlined methods
        val processedIntramethodCalls = newHashSet
        while (!remainingCalls.empty) {
            val method = remainingCalls.head
            remainingCalls.remove(method)
            if (!processedIntramethodCalls.contains(method)) {
                processedIntramethodCalls += method
                methodSCGs.get(method).inlineCalls(methodSCGs, inlined, remainingCalls)
                if (environment.inDeveloperMode) snapshot
            }
        }
        remainingCalls += processedIntramethodCalls
        
        // Clean VO store of variables in methods
        methodSCGs.entrySet.forEach[
            voStore.remove(key.valuedObjects.head)
            key.parameterDeclarations.map[valuedObjects].flatten.forEach[voStore.remove(it)]
            value.declarations.map[valuedObjects].flatten.forEach[voStore.remove(it)]
        ]
        
        // Remove inlined/unused methods
        methodSCGs.entrySet.filter[inlined.contains(value) || (REMOVE_UNUSED.property && !remainingCalls.contains(it.key))].forEach[
            model.scgs.remove(it.value)
            it.key.remove
        ]
        
        // Remove classes without content
        for (scg : model.scgs) {
            val classes = scg.declarations.filter(ClassDeclaration).toSet
            for (classDecl : classes) {
                if (classDecl.declarations.nullOrEmpty) {
                    scg.declarations.remove(classDecl)
                }
                // Remove host classes from VO store
                if (classDecl.host) {
                    classDecl.eAllContents.filter(ValuedObject).forEach[voStore.remove(it)]
                }
            }
        }
    }
    
    def Set<SCGraph> inlineCalls(SCGraph scg, Map<MethodDeclaration, SCGraph> methodSCGs, Set<SCGraph> inlined, Set<MethodDeclaration> remaining) {
        val calls = HashBasedTable.create
        for (node : scg.nodes) {
            if (node instanceof Assignment || node instanceof Conditional) {
                // Method calls must be added and process in reverse hierachy such that call that have call as parameter are correctly handled
                // TODO check is iteration order is really deterministic
                for (refcall : node.eAllContents.filter(ReferenceCall).toList.reverseView) {
                    var ValuedObjectReference vor = refcall.lowermostReference
                    val method = vor.valuedObject.eContainer
                    if (method instanceof MethodDeclaration) {
                        calls.put(method, node, refcall)
                    }
                }
            }
        }
        for (call : calls.cellSet) {
            if (methodSCGs.containsKey(call.rowKey)) {
                val method = call.rowKey
                val methodSCG = methodSCGs.get(method)
                if (methodSCG !== null && !INLINE_NOTHING.property && (INLINE_ALL.property || method.hasAnnotation(SCGAnnotations.ANNOTATION_METHOD_INLINING) || methodSCG.isSimpleMethod)) {
                    method.inlineMethod(call.value, call.columnKey, methodSCGs, newHashSet, inlined)
                    inlined += methodSCG
                } else {
                    remaining += method
                }
            }
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
            //println(scg.methodDeclaration.valuedObjects.head.name + (simple ? " simple" : " NOT simple"))
            return simple
        }
    }
    
    def void preprocess(MethodDeclaration method, SCGraph scg) {
        // Fix return
        if (!SUPPORTED_RETURN_TYPES.contains(method.returnType)) {
            method.returnType = ValueType.VOID
        }
    }
    
    def void inlineMethod(MethodDeclaration method, ReferenceCall call, Node callNode, Map<MethodDeclaration, SCGraph> methodSCGs,  Set<MethodDeclaration> callStack, Set<SCGraph> inlined) {
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
        val selfVO = scg.declarations.findFirst[isSelfVO]?.valuedObjects?.head
        val params = scg.declarations.map[valuedObjects].flatten.filter[isParameter].toMap([it],[parameterIndex])
        
        // Replace params
        val methodCalls = HashBasedTable.create
        for (node : scg.nodes) {
            for (vor : node.eAllContents.filter(ValuedObjectReference).toList) {
                if (params.containsKey(vor.valuedObject)) {
                    val index = params.get(vor.valuedObject)
                    if (index >= 0 && index < call.parameters.size) {
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
                if (vor.valuedObject === selfVO) {
                    vor.valuedObject = call.valuedObject
                    vor.indices += call.indices.map[copy]
                    // remaining sub refs
                    var subVOR = call as ValuedObjectReference
                    var insertAt = vor
                    while (subVOR !== null && subVOR.subReference !== null) {
                        subVOR = subVOR.subReference
                        if (subVOR.subReference !== null) { // skip last because it is the method
                            val insert = subVOR.valuedObject.reference
                            insert.indices += subVOR.indices.map[copy]
                            insert.subReference = vor.subReference
                            insertAt.subReference = insert
                            insertAt = insert
                        } else {
                            subVOR = null
                        }
                    }
                }
                if (vor instanceof ReferenceCall) {
                    var ValuedObjectReference mcall = vor
                    do {
                        val m = mcall.valuedObject.eContainer
                        if (m instanceof MethodDeclaration) {
                            methodCalls.put(m, node, vor)
                        }
                        mcall = mcall.subReference
                    } while (mcall !== null)
                }
            }
        }
        if (selfVO !== null) selfVO.declaration.remove
        
        // Rename VOs
        val allVOs = scg.declarations.map[valuedObjects].flatten.toList
        for (clashes : allVOs.groupBy[name].values) {
            if (clashes.size > 1) {
                for (i : 0..clashes.size -1) {
                    val clash = clashes.get(i)
                    clash.name = clash.name + "_" + i
                }
            }
        }
        allVOs.forEach[name = prefix + name]
        
        // Handle method calls
        for (mcall : methodCalls.cellSet) {
            if (methodSCGs.containsKey(mcall.rowKey)) {
                val m = mcall.rowKey
                val mSCG = methodSCGs.get(m)
                if (mSCG !== null && !INLINE_NOTHING.property && (INLINE_ALL.property || m.hasAnnotation(SCGAnnotations.ANNOTATION_METHOD_INLINING) || mSCG.isSimpleMethod)) {
                    m.inlineMethod(mcall.value, mcall.columnKey, methodSCGs, newHashSet, inlined)
                    inlined += methodSCG
                }
            }
        }
        
        // Connect
        callNode.allPrevious.toList.forEach[target = entry.next.target]
        entry.next.target = null
        entry.remove
        exit.allPrevious.toList.forEach[target = callNode]
        exit.remove
        
        // Remove return tag
        if (returnVO !== null) {
            scg.nodes.filter(Assignment).forEach[removeAnnotations(SCGAnnotations.ANNOTATION_RETURN_NODE)]
            returnVO.removeAnnotations(SCGAnnotations.ANNOTATION_RETURN_NODE)
            if (targetSCG.isMethod) {
                returnVO.markLocalVariable
            }
        }
        // Fix if any deeper inline method wants to have local variables
        if (!targetSCG.isMethod) {
            scg.unmarkAllLocalVariables
        }
        
        // Move nodes
        targetSCG.declarations += scg.declarations
        targetSCG.nodes += scg.nodes
        
        // Insert return value or remove call node
        val callContainer = call.eContainer
        val isRead = callContainer instanceof Expression
            || callContainer instanceof Conditional
            || callContainer instanceof Parameter
            || (callContainer instanceof Assignment && (callContainer as Assignment).valuedObject !== null)
        if (isRead) {
            if (returnVO !== null) {
                call.replace(returnVO.reference)
                voStore.update(returnVO, "method-inlining")
            } else {
                environment.errors.add("The method does not return any value!", callNode)
            } 
        } else if (callNode instanceof Assignment) {
            callNode.allPrevious.toList.forEach[target = callNode.next.target]
            callNode.next.target = null
            callNode.remove
        }
    }
    

}
