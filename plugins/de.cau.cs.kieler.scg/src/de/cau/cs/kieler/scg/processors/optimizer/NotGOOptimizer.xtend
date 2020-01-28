/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.scg.processors.optimizer

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scg.processors.SimpleGuardExpressions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValueExtensions
import de.cau.cs.kieler.scg.extensions.SCGManipulationExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions

/** 
 * @author ssm
 * @kieler.design 2020-01-26 proposed 
 * @kieler.rating 2020-01-26 proposed yellow
 */
class NotGOOptimizer extends InplaceProcessor<SCGraphs> {
	
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsValueExtensions
    @Inject extension KExpressionsComplexCreateExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension SCGManipulationExtensions
    
    public static val IProperty<Boolean> NOT_GO_OPTIMIZER_ENABLED = 
        new Property<Boolean>("de.cau.cs.kieler.scg.opt.notGo", false)    
	
    override getId() {
        "de.cau.cs.kieler.scg.processors.notGoOptimizer"
    }
    
    override getName() {
        "Not GO Optimizer"
    }
    
    override process() {
        if (!environment.getProperty(NOT_GO_OPTIMIZER_ENABLED)) return;
        
        val model = getModel
        applyAnnotations

        for (scg : model.scgs) {
            scg.performNotGoOptimization
        }
    }	
    
    private def performNotGoOptimization(SCGraph scg) {
        val nodes = <Node> newLinkedList => [ it += (scg.nodes.findFirst[ it instanceof Entry ] as Entry) ]
        val Multimap<ValuedObject, Conditional> candidates =  HashMultimap.create
        val notGOAssignments = <Assignment> newLinkedHashSet
        val notGOConditionals = <Conditional> newLinkedHashSet
        
        while (!nodes.empty) {
            val node = nodes.pop
            
            switch (node) {
                Conditional: {
                    if (node.condition instanceof ValuedObjectReference) {
                        candidates.put(node.condition.asValuedObjectReference.valuedObject, node)
                    }
                    nodes.push(node.^else.target.asNode)
                }
                Assignment: {
                    val vo = node.valuedObject
                    if (vo !== null) {
                        if (candidates.keys.contains(vo)) {
                            if (node.expression.isGenericTrue) {
                                notGOAssignments += node
                                notGOConditionals.addAll(candidates.get(vo))
                                candidates.get(vo).forEach[
                                    annotationModel.addInfo(it, "!_GO Candidate")
                                ]
                            } else {
                                candidates.removeAll(vo)
                            }                          
                        }
                    }
                    nodes.push(node.next.target.asNode)
                }
                default: {
                    node.allNext.map[target].filter(Node).forEach[ nodes.push(it) ]
                }
            }
        }
        
        for (a : notGOAssignments) {
            a.removeNode(true)
        }
        
        val goVO = scg.findValuedObjectByName(SimpleGuardExpressions.GO_GUARD_NAME)
        for (c : notGOConditionals) {
            c.condition = goVO.reference.not
        }
    }
	
}


