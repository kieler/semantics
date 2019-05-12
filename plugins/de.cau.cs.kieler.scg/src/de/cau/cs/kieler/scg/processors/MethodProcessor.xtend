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

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.SCGraphs

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.annotations.ReferenceAnnotation
import com.google.common.collect.HashBasedTable
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions

/**
 * 
 * @author als
 */
class MethodProcessor extends InplaceProcessor<SCGraphs> implements Traceable {
    
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension KEffectsExtensions
    @Inject extension PragmaExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGCoreExtensions
        
    public static val GENERATED_PREFIX = "_"
    
    private int fnCouter = 0
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.methods"
    }
    
    override getName() {
        "Methods"
    }
    
    override process() {
        val methodSCG = newHashMap
        val normalSCGs = newArrayList
        
        for (scg : model.scgs) {
            if (scg.hasAnnotation(SCGAnnotations.ANNOTATION_METHOD_REFERENCE)) {
                methodSCG.put((scg.getAnnotation(SCGAnnotations.ANNOTATION_METHOD_REFERENCE) as ReferenceAnnotation).object as MethodDeclaration, scg)
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
            for (cell : calls.cellSet) {
                // Currently only inlining is available
                methodSCG.get(cell.rowKey).inlineMethod(cell.value, cell.columnKey)
            }
        }
        
        // Remove inlined methods
        model.scgs.removeAll(methodSCG.values)
    }
    
    def void inlineMethod(SCGraph methodSCG, ReferenceCall call, Node callNode) {
        val callVOs = newLinkedList(call.valuedObject)
        var sub = call.subReference
        while (sub !== null) {
            callVOs += sub.valuedObject
            sub = sub.subReference
        }
        val prefix = GENERATED_PREFIX + "fn" + fnCouter + callVOs.join("_", "_", "_", [name])
        val targetSCG = callNode.eContainer as SCGraph
        val scg = methodSCG.copy
        
        val entry = scg.nodes.filter(Entry).head
        val exit = scg.nodes.filter(Exit).head
        val params = newHashMap
        var ValuedObject returnVO
        
        for (node : scg.nodes.filter(Assignment)) {
            if (node.hasAnnotation(SCGAnnotations.ANNOTATION_METHOD_PARAMETER)) {
                params.put((node.getAnnotation(SCGAnnotations.ANNOTATION_METHOD_PARAMETER) as IntAnnotation).value, node)
            } else if (node.hasAnnotation(SCGAnnotations.ANNOTATION_RETURN_NODE)) {
                returnVO = node.valuedObject
            }
        }
        
        // Assign params
        for (index : params.keySet) {
            if (index == -1) { // self
                var vor = callVOs.head.reference
                params.get(-1).expression = vor
                for (vo : callVOs.drop(1)) {
                    if (vo !== callVOs.last) {
                        sub = vo.reference
                        vor.subReference = sub
                        vor = sub
                    }
                }
            } else if (index < call.parameters.size) {
                params.get(index).expression = call.parameters.get(index).expression
            }
        }      
        
        // Rename VOs
        scg.declarations.map[valuedObjects].flatten.forEach[name = prefix + name]
        
        // Connect
        callNode.allPrevious.toList.forEach[target = entry.next.target]
        entry.next.target = null
        entry.remove
        exit.allPrevious.toList.forEach[target = callNode]
        exit.remove
        
        // Move nodes
        targetSCG.declarations += scg.declarations
        targetSCG.nodes += scg.nodes
        
        // Insert return value or remove call node
        if (returnVO !== null) {
            call.replace(returnVO.reference)
        } else if (callNode instanceof Assignment) {
            callNode.allPrevious.toList.forEach[target = callNode.next.target]
            callNode.next.target = null
            callNode.remove
        }
    }

}
