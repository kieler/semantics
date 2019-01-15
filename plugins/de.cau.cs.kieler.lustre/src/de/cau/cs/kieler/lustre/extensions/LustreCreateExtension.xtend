/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.lustre.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.lustre.lustre.ClockedVariableDeclaration
import de.cau.cs.kieler.lustre.lustre.LustreFactory

/**
 * @author lgr
 *
 */
class LustreCreateExtension {
   
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    
    def VariableDeclaration createLustreVariableDeclaration(VariableDeclaration variableDeclaration) {
        var lusVariableDeclaration = createVariableDeclaration
        
        if (variableDeclaration.valuedObjects.length == 1) {
            // Use the LustreValuedObjectInit with the type there
            val valuedObject = variableDeclaration.valuedObjects.head
            lusVariableDeclaration => [
                valuedObjects += LustreFactory.eINSTANCE.createLustreValuedObject => [
                    name = valuedObject.name
                    cardinalities.addAll(valuedObject.cardinalities)
                    type = variableDeclaration.type
                    initialValue = valuedObject.initialValue
                ]
            ]
        } else {
            // Type is on VariableDeclaration, regular ValuedObjects are created
            lusVariableDeclaration.type = variableDeclaration.type
            for (valuedObject : variableDeclaration.valuedObjects) {
                lusVariableDeclaration => [
                    valuedObjects += createValuedObject => [
                        name = valuedObject.name
                        cardinalities.addAll(valuedObject.cardinalities)
                        initialValue = valuedObject.initialValue
                    ]
                ]
            }
        }
        
        return lusVariableDeclaration
    }
    
    def ClockedVariableDeclaration createClockedVariableDeclaration(VariableDeclaration variableDeclaration) {
        val lustreVariableDeclaration = createLustreVariableDeclaration(variableDeclaration)
        
        LustreFactory.eINSTANCE.createClockedVariableDeclaration => [
            vardecl = lustreVariableDeclaration
        ]
    }
    
}