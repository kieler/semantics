/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.extensions

import de.cau.cs.kieler.scg.Conditional

import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kicool.compilation.VariableStore
import static de.cau.cs.kieler.kicool.compilation.VariableStore.*
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.OperatorType
import com.google.inject.Inject

/**
 * The SCG Extensions are a collection of common methods for SCG manipulation.
 * 
 * @author ssm
 * @kieler.design 2019-12-17 proposed 
 * @kieler.rating 2019-12-17 proposed yellow
 */
class SCGValidationExtensions { 
    
    @Inject extension KExpressionsValuedObjectExtensions    
    
    def invalidDefUseGuards(SCGraph scg, VariableStore variableStore) {
        val resetVariables = <String> newHashSet
        for (vk : variableStore.variables.keySet) {
            if (variableStore.variables.get(vk).exists[ properties.contains(RESET) ])
                resetVariables += vk 
        }        
        
        val result = <ValuedObject> newHashSet
        val assignedGuards = <ValuedObject> newHashSet
        
        var nextNode = scg.nodes.filter(Entry).head.next.target
        while (nextNode !== null) {
            switch(nextNode) {
                Assignment: {
                    if (nextNode.reference !== null) 
                        assignedGuards += nextNode.reference.valuedObject
                    
                    result += nextNode.expression.allReferences.
                        filter[ it.valuedObject.name.startsWith("_g") ].
                        filter[ it.eContainer instanceof OperatorExpression ? (it.eContainer as OperatorExpression).operator !== OperatorType.PRE : true ]. 
                        filter[ !assignedGuards.contains(it.valuedObject) ].
                        filter[ !resetVariables.contains(it.valuedObject.name) ].
                        map[ valuedObject ]    
                        
                    nextNode = nextNode.next.target 
                }
                Conditional: {
                    nextNode = nextNode.^else.target
                }
                default: nextNode = null
            }
        }
        
        return result    
    }
        
}
