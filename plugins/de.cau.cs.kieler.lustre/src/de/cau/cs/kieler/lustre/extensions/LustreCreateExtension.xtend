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
import de.cau.cs.kieler.lustre.lustre.LustreFactory
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.lustre.lustre.LustreValuedObject

/**
 * @author lgr
 * 
 */
class LustreCreateExtension {
    
    static extension LustreFactory lustre = LustreFactory.eINSTANCE
    
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions   
    
    def getTypeForValuedObject(ValuedObject valuedObject) {
        if ((valuedObject.eContainer as VariableDeclaration).valuedObjects.size == 1) {
            return (valuedObject as LustreValuedObject).type
        } else {
            return (valuedObject.eContainer as VariableDeclaration).type
        }
    }
    
    /*
     * -----------------------------------------------------------------
     * Extension method for the conversion KExpressions -> Lustre
     * -----------------------------------------------------------------
     */
    def createLustreVariableDeclaration(VariableDeclaration kExpressionsvariableDeclaration) {
        var lusVariableDeclaration = createVariableDeclaration

        if (kExpressionsvariableDeclaration.valuedObjects.length == 1) {
            // Use the LustreValuedObjectInit with the type there
            val kExpressionsValuedObject = kExpressionsvariableDeclaration.valuedObjects.head
            val lustreValuedObject = createLustreValuedObject => [
                name = kExpressionsValuedObject.name
                cardinalities.addAll(kExpressionsValuedObject.cardinalities)
                type = kExpressionsvariableDeclaration.type
                initialValue = kExpressionsValuedObject.initialValue
            ]
            lusVariableDeclaration => [
                valuedObjects += lustreValuedObject
            ]
        } else {
            // Type is on VariableDeclaration, regular ValuedObjects are created
            lusVariableDeclaration.type = kExpressionsvariableDeclaration.type
            for (valuedObject : kExpressionsvariableDeclaration.valuedObjects) {
                val lustreValuedObject = createValuedObject => [
                    name = valuedObject.name
                    cardinalities.addAll(valuedObject.cardinalities)
                    initialValue = valuedObject.initialValue
                ]
                lusVariableDeclaration => [
                    valuedObjects += lustreValuedObject
                ]
            }
        }

        return lusVariableDeclaration
    }

    def createLustreClockedVariableDeclaration(VariableDeclaration kExpressionsVariableDeclaration) {
        val lustreVariableDeclaration = kExpressionsVariableDeclaration.createLustreVariableDeclaration
        
        createClockedVariableDeclaration => [
            vardecl = lustreVariableDeclaration
        ]
    }
}
