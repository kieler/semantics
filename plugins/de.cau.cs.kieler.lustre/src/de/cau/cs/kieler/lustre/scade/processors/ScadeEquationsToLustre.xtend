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
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import de.cau.cs.kieler.lustre.lustre.Equation
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property

/**
 * @author lgr
 *
 */
class ScadeEquationsToLustre extends Processor<ScadeProgram, LustreProgram> {
        
    public static val IProperty<Boolean> SUBSTITUTION = 
        new Property<Boolean>("de.cau.cs.kieler.lustre.scade.processors.scadeToLustre.substitution", false)
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsTypeExtensions
    @Inject extension LustreCreateExtension
    @Inject extension ScadeTransformationExtensions
    
    var HashMap<ValuedObject, Equation> equationMap = newHashMap 
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
        
        for (equation : scadeProgram.equations) {
            equation.processEquation(node)
        }
        
        val substitute = environment.getProperty(SUBSTITUTION)?:SUBSTITUTION.^default
        if (substitute) {
            for (varDecl : node.variables.immutableCopy) {
                for (valObj : varDecl.valuedObjects.immutableCopy) {
                    valObj.substituteVariables(node)
                }
            }
        }
        
        for (equation : node.equations) {
            var type = equation.expression.approximateType
            var valObj = equation.reference.valuedObject
            if (valObj instanceof LustreValuedObject) {
                valObj.type = type
            } else {
                (valObj.eContainer as LustreVariableDeclaration).type = type
            }
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
                type = ValueType.BOOL
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
                    equationMap.put(lustreValObj, lustreEquation)
                    var type = determineType(lustreEquation.expression, newHashSet)
                    if (type == ValueType.UNKNOWN) {
                        type = inferType(lustreEquation.expression)
                    }
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
    
    private def substituteVariables(ValuedObject valObj, NodeDeclaration node) {
        var eq = equationMap.get(valObj)
        
        var remove = false
        for (equation : node.equations) {
            if (equation !== eq) {
                if (equation.expression instanceof ValuedObjectReference 
                    && (equation.expression as ValuedObjectReference).valuedObject === valObj 
                    && eq.expression.contains(valObj)) {
                        remove = true
                        equation.expression = eq.expression.copy.replaceValObj(valObj, equation.reference)
                }
                equation.expression = equation.expression.replaceValObj(valObj, eq.expression)
            }
        }
        
        if (remove || !eq.expression.contains(valObj)) {
            node.equations.remove(eq)
            valObj.variableDeclaration.remove
        }
    }
    
    private dispatch def Expression replaceValObj(Expression expression, ValuedObject valObj, Expression replacement) {
        return expression
    }
    
    private dispatch def Expression replaceValObj(OperatorExpression expression, ValuedObject valObj, Expression replacement) {
        for (subExpr : expression.subExpressions) {
            subExpr.replace(subExpr.replaceValObj(valObj, replacement.copy))
        }
        
        return expression
    }
    
    private dispatch def Expression replaceValObj(ValuedObjectReference expression, ValuedObject valObj, Expression replacement) {
        if (expression.valuedObject === valObj) {
            return replacement.copy
        }
        return expression
    }
    
    private dispatch def boolean contains(Expression expression, ValuedObject valObj) {
        return false
    }
    
    private dispatch def boolean contains(OperatorExpression expression, ValuedObject valObj) {
        var subContain = false
        for (subExpr : expression.subExpressions) {
            subContain = subContain || subExpr.contains(valObj)
        }
        
        return subContain
    }
    
    private dispatch def boolean contains(ValuedObjectReference expression, ValuedObject valObj) {
        if (expression.valuedObject === valObj) {
            return true
        }
        return false
    }
    
    private dispatch def ValueType approximateType(OperatorExpression expression) {
        switch (expression.operator) {
            case ATMOSTONEOF, case BITWISE_AND, case BITWISE_NOT, case BITWISE_OR, case BITWISE_XOR, 
            case EQ, case IMPLIES, case LOGICAL_AND, case LOGICAL_OR, case GEQ, case GT, case LEQ, case LT, case NE, case NOR, case NOT: {
                return ValueType.BOOL
            }
            case ADD, case DIV, case MULT, case SUB, case MOD, case SHIFT_LEFT, case SHIFT_RIGHT, case SHIFT_RIGHT_UNSIGNED, case POSTFIX_ADD, case POSTFIX_SUB: {
                return ValueType.INT
            }
            case CURRENT, case WHEN, case VAL, case PRE: {
                return approximateType(expression.subExpressions.get(0))
            }
            case CONDITIONAL: {
                return approximateType(expression.subExpressions.get(1))
            }            
            case FBY, case INIT: {
                var currType = ValueType.UNKNOWN
                for (subExpr : expression.subExpressions) {
                    var subType = approximateType(subExpr)
                    if (subType !== ValueType.UNKNOWN) {
                        currType = subType
                    }
                }
                return currType
            }
        }
    }
    
    private dispatch def ValueType approximateType(BoolValue expression) {
        return ValueType.BOOL
    }
    
    private dispatch def ValueType approximateType(IntValue expression) {
        return ValueType.INT
    }
    
    private dispatch def ValueType approximateType(FloatValue expression) {
        return ValueType.FLOAT
    }
    
    private dispatch def ValueType approximateType(ValuedObjectReference expression) {
        return expression.valuedObject.type
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