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
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.lustre.extensions.LustreCreateExtension
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.lustre.lustre.LustreValuedObject
import de.cau.cs.kieler.lustre.lustre.LustreVariableDeclaration
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration
import de.cau.cs.kieler.lustre.scade.extensions.ScadeTransformationExtensions
import de.cau.cs.kieler.lustre.scade.scade.ScadeEquation
import de.cau.cs.kieler.lustre.scade.scade.ScadeProgram
import de.cau.cs.kieler.lustre.scade.scade.ValuedObjectString
import java.util.HashMap
import java.util.HashSet

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.kexpressions.ValuedObject

/**
 * @author lgr
 *
 */
class ScadeEquationsToLustre extends Processor<ScadeProgram, LustreProgram> {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension LustreCreateExtension
    @Inject extension ScadeTransformationExtensions
    
    var HashMap<String, ValuedObject> variableMap = newHashMap
    var HashSet<String> writtenVariables = newHashSet
    var HashSet<String> readVariables = newHashSet
    
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
        
        initializeValuedObjectStringMaps(scadeProgram)
        determineInputOutputVariable(node)
        
        // Transform the actual equations
        for (equation : scadeProgram.equations) {
            equation.processEquation(node)
        }
    }
    
    def initializeValuedObjectStringMaps(ScadeProgram scadeProgram) {
        for (equation : scadeProgram.equations) {
            for (reference : equation.references) {
                if (reference instanceof ValuedObjectString) {
                    if (!variableMap.containsKey(reference.name)) {
                        variableMap.put(reference.name, createNewValuedObject(reference.name))
                    }
                    writtenVariables.add(reference.name)
                }
            }
            equation.expression.extractExpressionReads
        }
    }
    
    dispatch def void extractExpressionReads(ValuedObjectString expression) {
        if (!variableMap.containsKey(expression.name)) {
            variableMap.put(expression.name, createNewValuedObject(expression.name))
        }
        readVariables.add(expression.name)
    }
    
    dispatch def void extractExpressionReads(OperatorExpression expression) {
        for (subExpression : expression.subExpressions) {
            extractExpressionReads(subExpression)
        }                
    }
    
    dispatch def void extractExpressionReads(Expression expression) {
        // Do nothing
    }
    
    def determineInputOutputVariable(NodeDeclaration node) {
        var keySet = variableMap.keySet.toArray
        for (key : keySet) {
            var varDecl = createLustreVariableDeclaration => [
                valuedObjects += variableMap.get(key)
            ]
            if (readVariables.contains(key) && !writtenVariables.contains(key)) {
                node.inputs += varDecl
            } else if (!readVariables.contains(key) && writtenVariables.contains(key)) {
                node.outputs += varDecl
            } else {
                node.variables += varDecl
            }
        }
    }
    
    def ValuedObject createNewValuedObject(String string) {
        createValuedObject(string)
    }
    
    /**
     * Convert the ScadeEquation to a Lustre Equation.
     */
    private def processEquation(ScadeEquation equation, NodeDeclaration node) {
        if (equation.references !== null) {
            var lustreEquation = createEquation
            for (valObjString : equation.references) {
                if (valObjString instanceof ValuedObjectString) {
                    var lustreValObj = variableMap.get(valObjString.name)
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
            }
            lustreEquation.operator = equation.operator
            node.equations += lustreEquation
        }
    }
    
    /**
     * Converts a Scade Expression to a Lustre expression and handles correct 
     * assignment for ValuedObjectReferences. If an ValuedObjectReference does not exist, 
     * it is newly created.
     */
    private dispatch def Expression convertExpression(Expression expression, NodeDeclaration node) {
        return expression.copy
    }
    
    private dispatch def Expression convertExpression(ValuedObjectString expression, NodeDeclaration node) {
        var valObj = variableMap.get(expression.name)
        return valObj.reference
    }
    
    private dispatch def Expression convertExpression(OperatorExpression expression, NodeDeclaration node) {
        var opExpression = createOperatorExpression
        opExpression.operator = expression.operator
        for (subExpression : expression.subExpressions) {
            opExpression.subExpressions += convertExpression(subExpression, node)
        }
        return opExpression
    }
}