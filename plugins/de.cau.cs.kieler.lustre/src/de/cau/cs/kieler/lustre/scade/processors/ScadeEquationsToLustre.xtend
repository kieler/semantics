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
package de.cau.cs.kieler.lustre.scade.processors

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.lustre.extensions.LustreCreateExtension
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.lustre.lustre.LustreValuedObject
import de.cau.cs.kieler.lustre.lustre.LustreVariableDeclaration
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration
import de.cau.cs.kieler.lustre.scade.scade.ScadeEquation
import de.cau.cs.kieler.lustre.scade.scade.ScadeProgram
import java.util.HashMap

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.lustre.scade.extensions.ScadeTransformationExtensions

/**
 * @author lgr
 *
 */
class ScadeEquationsToLustre extends Processor<ScadeProgram, LustreProgram> {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension LustreCreateExtension
    @Inject extension ScadeTransformationExtensions
    
    HashMap<ValuedObject, ValuedObject> valuedObjectMap = new HashMap
    
    override getId() {
        return "de.cau.cs.kieler.lustre.scade.processors.scadeToLustre"
    }
    
    override getName() {
        return "SCADE to Lustre"
    }
    
    override getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        model = model.transform
    }
    
    /**
     * Main transformation.
     */
    def LustreProgram transform(ScadeProgram p) {
        var lustreProgram = createLustreProgram
        
        p.processScadeProgram(lustreProgram)
        
        lustreProgram
    }
    
    /**
     * Does the actual transformation work.
     */
    private def processScadeProgram(ScadeProgram scadeProgram, LustreProgram lustreProgram) {
        var node = createNodeDeclaration("scadeNode")
        lustreProgram.nodes.add(node)
        
        for (input : scadeProgram.inputs) {
            createInput(input, node)
        }
        
        for (equation : scadeProgram.equations) {
            equation.createDefinitionsForValuedObjects(node)
        }
        
        // Transform the actual equations
        for (equation : scadeProgram.equations) {
            equation.processEquation(node)
        }
    }
    
    /**
     * Convert the ScadeEquation to a Lustre Equation.
     */
    private def processEquation(ScadeEquation equation, NodeDeclaration node) {
        if (equation.references !== null) {
            var lustreEquation = createEquation
            for (valObj : equation.references) {
                var lustreValObj = valuedObjectMap.get(valObj)
                if (equation.references.size == 1) {
                    lustreEquation.reference = lustreValObj.reference
                } else {
                    lustreEquation.references += lustreValObj.reference
                }
                lustreEquation.expression = convertExpression(equation.expression, node)
                var type = determineType(lustreEquation.expression, newHashSet)
                if (lustreValObj instanceof LustreValuedObject) {
                    lustreValObj.type = type
                } else {
                    (lustreValObj.eContainer as LustreVariableDeclaration).type = type
                }
            }
            lustreEquation.operator = equation.operator
            node.equations += lustreEquation
        }
    }
    
    /**
     * For each variable defined through an equation, a new variable in Lustre 
     * is created. 
     */
    private def createDefinitionsForValuedObjects(ScadeEquation equation, NodeDeclaration node) {
        if (equation.references !== null) {
            for (valObj : equation.references) {
                createVariable(valObj, node)
            }
        }
    }
    
    private def createVariable(ValuedObject valObj, NodeDeclaration node) {
        var lustreValObj = createLustreValuedObject
        lustreValObj.name = valObj.name
        valuedObjectMap.put(valObj, lustreValObj)
        
        var varDecl = createLustreVariableDeclaration
        varDecl.valuedObjects += lustreValObj
        
        node.variables += varDecl
    }
    
    private def createInput(ValuedObject valObj, NodeDeclaration node) {
        var lustreValObj = createValuedObject
        lustreValObj.name = valObj.name
        valuedObjectMap.put(valObj, lustreValObj)
        
        var varDecl = createLustreVariableDeclaration
        varDecl.valuedObjects += lustreValObj
        
        node.inputs += varDecl
    }
    
    /**
     * Converts a Scade Expression to a Lustre expression and handles correct 
     * assignment for ValuedObjectReferences. If an ValuedObjectReference does not exist, 
     * it is newly created.
     */
    private def Expression convertExpression(Expression expression, NodeDeclaration node) {
        switch (expression) {
            Value: {
                return expression.copy
            }
            ValuedObjectReference: {
                var valObj = valuedObjectMap.get(expression.valuedObject)
                var ref = valObj.reference
                if (ref === null) {
                    var newValObj = createValuedObject
                    newValObj.name = expression.valuedObject.name
                    var varDecl = createLustreVariableDeclaration
                    varDecl.valuedObjects += newValObj
                    node.inputs += varDecl
                    return newValObj.reference
                }
                return ref
            }
            OperatorExpression: {
                var opExpression = createOperatorExpression
                opExpression.operator = expression.operator
                for (subExpression : expression.subExpressions) {
                    opExpression.subExpressions += convertExpression(subExpression, node)
                }                
                return opExpression
            }
        }
    }
}