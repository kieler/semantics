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
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.lustre.lustre.ClockedVariableDeclaration
import de.cau.cs.kieler.lustre.lustre.LustreFactory
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import java.util.Map
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.lustre.lustre.LustreValuedObject

/**
 * @author lgr
 * 
 */
class LustreCreateExtension {
    
    static extension LustreFactory lustre = LustreFactory.eINSTANCE

    @Inject extension KEffectsExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension AnnotationsExtensions
    
    /*
     * -----------------------------------------------------------------
     * Extension method for the conversion Lustre -> KExpressions
     * -----------------------------------------------------------------
     */
    def createVariableDeclarationFromLustre(VariableDeclaration lustreVariableDeclaration, Map<ValuedObject, ValuedObject> lustreToKExpressionsValuedObjectMap) {
        var kExpressionsVariableDeclaration = createVariableDeclaration

        // Determine whether the declaration is an initialization...
        if (lustreVariableDeclaration.valuedObjects.length == 1 && lustreVariableDeclaration.valuedObjects.head instanceof LustreValuedObject) {
            val lustreValuedObject = lustreVariableDeclaration.valuedObjects.head as LustreValuedObject
            val objType = lustreValuedObject.type
            kExpressionsVariableDeclaration.type = objType
            
            val kExpressionsValuedObject = lustreValuedObject.createValuedObjectFromLustre(lustreToKExpressionsValuedObjectMap)
            kExpressionsVariableDeclaration.valuedObjects += kExpressionsValuedObject
        } 
        
        // ... or a declaration of an arbitary amount of variables with the same type
        else {
            kExpressionsVariableDeclaration.type = lustreVariableDeclaration.type
            
            for (lustreValuedObject : lustreVariableDeclaration.valuedObjects) {
                val kExpressionsValuedObject = lustreValuedObject.createValuedObjectFromLustre(lustreToKExpressionsValuedObjectMap)
                kExpressionsVariableDeclaration.valuedObjects += kExpressionsValuedObject
            }
        }
        
        kExpressionsVariableDeclaration
    }
    
    def createValuedObjectFromLustre(ValuedObject lustreValuedObject, Map<ValuedObject, ValuedObject> lustreToKExpressionsValuedObjectMap) {
        val kExpressionsValuedObject = createValuedObject => [
            annotations.addAll(lustreValuedObject.annotations)
            name = lustreValuedObject.name
            initialValue = createExpressionFromLustre(lustreValuedObject.initialValue)
        ]
        for (cardinalityExpression : lustreValuedObject.cardinalities) {
            kExpressionsValuedObject.cardinalities += createExpressionFromLustre(cardinalityExpression)
        }
        
        lustreToKExpressionsValuedObjectMap.put(lustreValuedObject, kExpressionsValuedObject)
                
        kExpressionsValuedObject
    }

    def createInputDeclarationFromLustre(VariableDeclaration lustreVariableDeclaration, Map<ValuedObject, ValuedObject> lustreToKExpressionsValuedObjectMap) {
        lustreVariableDeclaration.createVariableDeclarationFromLustre(lustreToKExpressionsValuedObjectMap) => [
            input = true
        ]
    }

    def createOutputDeclarationFromLustre(VariableDeclaration lustreVariableDeclaration, Map<ValuedObject, ValuedObject> lustreToKExpressionsValuedObjectMap) {
        lustreVariableDeclaration.createVariableDeclarationFromLustre(lustreToKExpressionsValuedObjectMap) => [
            output = true
        ]
    }

    def createConstantDeclarationFromLustre(VariableDeclaration lustreVariableDeclaration, Map<ValuedObject, ValuedObject> lustreToKExpressionsValuedObjectMap) {
        lustreVariableDeclaration.createVariableDeclarationFromLustre(lustreToKExpressionsValuedObjectMap) => [
            const = true
        ]
    }

    def createVariableDeclarationFromLustreClockedVariableDeclaration(ClockedVariableDeclaration lustreClockedVariableDeclaration, Map<ValuedObject, ValuedObject> lustreToKExpressionsValuedObjectMap) {
        // TODO: Include clock
        createVariableDeclarationFromLustre(lustreClockedVariableDeclaration.vardecl, lustreToKExpressionsValuedObjectMap)
    }
    
    def createAssignmentFromLustre(Assignment equation, Map<ValuedObject, ValuedObject> lustreToKExpressionsValuedObjectMap) {
        val eqValObj = equation.reference.valuedObject
        val containment = lustreToKExpressionsValuedObjectMap.containsKey(eqValObj)
        if (containment) {
            val kExpressionValuedObject = lustreToKExpressionsValuedObjectMap.get(equation.reference.valuedObject)
            createAssignment => [
                reference = kExpressionValuedObject.reference
                operator = AssignOperator.ASSIGN
                expression = equation.expression.createExpressionFromLustre
            ]
        }
    }

    def createExpressionFromLustre(Expression lustreExpression) {
        // TODO: convert precedences and different operator definitions
//        createEx
        lustreExpression
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
