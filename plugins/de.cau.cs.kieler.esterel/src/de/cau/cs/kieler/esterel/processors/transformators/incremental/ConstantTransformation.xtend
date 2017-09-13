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
package de.cau.cs.kieler.esterel.processors.transformators.incremental

import com.google.inject.Inject
import de.cau.cs.kieler.esterel.Constant
import de.cau.cs.kieler.esterel.ConstantExpression
import de.cau.cs.kieler.esterel.EsterelModule
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.esterel.processors.EsterelProcessor
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scl.ScopeStatement
import de.cau.cs.kieler.scl.Statement
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.esterel.extensions.EsterelExtensions
import de.cau.cs.kieler.esterel.ConstantMultiDeclaration

/**
 * @author mrb
 *
 */
class ConstantTransformation extends EsterelProcessor {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::CONSTANT_ID
    }

    override getName() {
        return SCEstTransformation::CONSTANT_NAME
    }

//    override getExpandsFeatureId() {
//        return SCEstFeature::CONSTANT_ID
//    }
//        
//    override getNotHandlesFeatureIds() {
//        return Sets.newHashSet( SCEstTransformation::INITIALIZATION_ID, SCEstTransformation::RUN_ID)
//    }

    @Inject
    extension EsterelTransformationExtensions
    @Inject
    extension EsterelExtensions
    
    override EsterelProgram transform(EsterelProgram prog) {
        prog.modules.filter(EsterelModule).forEach [transformConstants]
        return prog
    }
    
    def transformConstants(EsterelModule module) {
        // this map combines an Esterel sensor with the new SCL variable
        var HashMap<Constant, ValuedObject> newVariables = new HashMap<Constant, ValuedObject>()
        var ScopeStatement scope = module.getIScope
        for (decl: module.constantDeclarations) {
            if (decl.type != null) {
                var ValueType newType
                if (decl.type != ValueType.PURE) {
                    newType = if (decl.type == ValueType.DOUBLE) ValueType.FLOAT else decl.type.type
                }
                else {
                    throw new UnsupportedOperationException(
                    "The following constant doesn't have a valid type for SCL! " + decl)
                }
                var newDecl = createDeclaration(newType, null)
                for (v : decl.constants) {
                    var c = v as Constant
                    var variable = createNewUniqueVariable(if (c.initialValue!=null) c.initialValue else null)
                    newVariables.put(c, variable)
                    newDecl.valuedObjects.add(variable)
                }
                scope.declarations.add(newDecl)
            }
            else { 
                throw new UnsupportedOperationException(
                    "The following constants don't have a valid type for SCL! " + decl)
            }
        }
        transformReferences(scope, newVariables)
        transformConstantExpressions(scope, newVariables)
        module.declarations.removeIf[it instanceof ConstantMultiDeclaration]
    }
    
    def transformReferences(Statement statement, Map<Constant, ValuedObject> newVariables) {
        var references = statement.eAllContents.filter(ValuedObjectReference).toList
        // iterate over all valued object references contained in the scope
        // if a reference references a transformed sensor then set the reference to the new variable
        for (ref : references) {
            if (ref.valuedObject instanceof Constant) {
                var vObject = ref.valuedObject as Constant
                if (newVariables.containsKey(vObject)) {
                    ref.valuedObject = newVariables.get(vObject)
                    removeValueTestOperator(ref.eContainer)
                }
            }
        }
    }
    
    def transformConstantExpressions(Statement statement, Map<Constant, ValuedObject> newVariables) {
        var constantExpr = statement.eAllContents.filter(ConstantExpression).toList
        for (expr : constantExpr) {
            if (expr.constant instanceof Constant) {
                var constant = expr.constant as Constant
                // if the constant expression references a transformed constant
                if (newVariables.containsKey(constant)) {
                    if(expr.eContainer.eGet(expr.eContainingFeature) instanceof EList) {
                        var list = expr.eContainer.eGet(expr.eContainingFeature) as EList<Expression>
                        var pos = list.indexOf(expr)
                        list.set(pos, createValuedObjectReference(newVariables.get(constant)))
                    }
                    else {
                        setExpression(createValuedObjectReference(newVariables.get(constant)), expr.eContainer, false)
                    }
                }
            }
            else if (expr.value != null) {
                if(expr.eContainer.eGet(expr.eContainingFeature) instanceof EList) {
                    var list = expr.eContainer.eGet(expr.eContainingFeature) as EList<Expression>
                    var pos = list.indexOf(expr)
                    list.set(pos, expr.value)
                }
                else {
                    setExpression(expr.value, expr.eContainer, false)
                }
            }
            else {
                throw new UnsupportedOperationException(
                        "The following constant expression doesn't have a constant and value! " + expr)
            }
        }
    }
    
}