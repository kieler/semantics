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
package de.cau.cs.kieler.kexpressions.kext

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.linking.lazy.LazyLinkingResource
import org.eclipse.xtext.parser.IParseResult

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class KExtResource extends LazyLinkingResource {
    
    @Accessors
    var boolean standaloneParse = false;
    
    extension KExpressionsFactory kExpressionsFactory = KExpressionsFactory.eINSTANCE
    @Inject extension KEffectsExtensions
    
    override updateInternalState(IParseResult newParseResult) {
        if (standaloneParse) {
            val voMap = <String, ValuedObject>newHashMap
            for (node : newParseResult.rootNode.asTreeIterable.filter[grammarElement instanceof CrossReference]) {
                val elem = node.semanticElement
                val voName = node.text.trim
                
                if (!voMap.containsKey(voName)) {
                    voMap.put(voName, createValuedObject => [name = voName])
                }
                
                // Manual linking
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
                    default: throw new IllegalArgumentException("Unsupported referece type " + elem.eClass)
                }
            }
            
            val root = newParseResult.rootASTElement as Kext
            if (root !== null && !root.scopes.empty) {
                root.scopes.head.declarations += createVariableDeclaration => [
                    type = ValueType.UNKNOWN;
                    valuedObjects.addAll(voMap.values)
                ]
            }
        }
        
        super.updateInternalState(newParseResult)
    }
    
    override protected doLinking() {
        if (!standaloneParse) { // Linking was already done in stadalone mode
            super.doLinking
        }
    }
    
}
