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
package de.cau.cs.kieler.simulation.trace

import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.linking.lazy.LazyLinkingResource
import org.eclipse.xtext.parser.IParseResult

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class KTraceResource extends LazyLinkingResource {
    
    extension KExpressionsFactory kExpressionsFactory = KExpressionsFactory.eINSTANCE
    
    override updateInternalState(IParseResult newParseResult) {
        val voMap = <String, ValuedObject>newHashMap
        for (node : newParseResult.rootNode.asTreeIterable.filter[grammarElement instanceof CrossReference]) {
            val elem = node.semanticElement
            val voName = node.text.trim
            
            if (!voMap.containsKey(voName)) {
                voMap.put(voName, createValuedObject => [name = voName])
            }
            
            switch(elem) {
                Assignment: {
                    elem.valuedObject = voMap.get(voName)
                }
                Emission: {
                    elem.valuedObject = voMap.get(voName)
                }
                ValuedObjectReference: {
                    elem.valuedObject = voMap.get(voName)
                }
            }
        }
        
        val root = newParseResult.rootASTElement as TraceFile
        root.aggregatedValuedObjects.clear
        root.aggregatedValuedObjects.addAll(voMap.values)
        
        super.updateInternalState(newParseResult)
    }
}