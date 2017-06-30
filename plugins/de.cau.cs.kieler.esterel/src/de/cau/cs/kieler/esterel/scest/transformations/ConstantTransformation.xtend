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
package de.cau.cs.kieler.esterel.scest.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.esterel.scest.extensions.SCEstExtension
import de.cau.cs.kieler.esterel.scest.features.SCEstFeature
import de.cau.cs.kieler.esterel.scest.scest.SCEstProgram
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.scl.scl.Statement
import com.google.common.collect.Sets
import java.util.HashMap
import de.cau.cs.kieler.kexpressions.ValuedObject
import java.util.Map
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.esterel.scest.scest.SCEstModule
import de.cau.cs.kieler.esterel.esterel.Constant
import de.cau.cs.kieler.scl.scl.ScopeStatement
import de.cau.cs.kieler.esterel.esterel.ConstantExpression
import de.cau.cs.kieler.kexpressions.Expression

/**
 * @author mrb
 *
 */
class ConstantTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::CONSTANT_ID
    }

    override getName() {
        return SCEstTransformation::CONSTANT_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::CONSTANT_ID
    }
        
//    override getProducesFeatureIds() {
//        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID, SCEstTransformation::ENTRY_ID,
//            SCEstTransformation::CONNECTOR_ID)
//    }
//
    override getNotHandlesFeatureIds() {
        return Sets.newHashSet( SCEstTransformation::INITIALIZATION_ID )
    }

    @Inject
    extension SCEstExtension
    
    def SCEstProgram transform(SCEstProgram prog) {
        prog.modules.forEach [ m | m.transformConstants]
        return prog
    }
    
    def transformConstants(SCEstModule module) {
        // this map combines an Esterel sensor with the new SCL variable
        var HashMap<Constant, ValuedObject> newVariables = new HashMap<Constant, ValuedObject>()
        var ScopeStatement scope = module.getIScope
        for (decl: module.intConstantDecls) {
            for (constants : decl.constants) {
                if (constants.type.type != null) {
                    var ValueType newType
                    if (constants.type.type != ValueType.PURE) {
                        newType = if (constants.type.type == ValueType.DOUBLE) ValueType.FLOAT else constants.type.type
                    }
                    else {
                        throw new UnsupportedOperationException(
                        "The following constants are of type PURE which is not a valid type! " + constants)
                    }
                    var newDecl = createDeclaration(newType, null)
                    for (v : constants.constants) {
                        var c = v as Constant
                        var variable = createNewUniqueVariable(createStringValue(c.value))
                        newVariables.put(c, variable)
                    }
                    scope.declarations.add(newDecl)
                }
                else { 
                    throw new UnsupportedOperationException(
                        "The following constants don't have a valid type for SCL! " + constants)
                }
            }
        }
        transformReferences(scope, newVariables)
        transformConstantExpressions(scope, newVariables)
        module.intSensorDecls.clear
    }
    
    def transformReferences(Statement statement, Map<Constant, ValuedObject> newVariables) {
        var references = statement.eAllContents.filter(ValuedObjectReference)
        // iterate over all valued object references contained in the scope
        // if a reference references a transformed sensor then set the reference to the new variable
        while (references.hasNext) {
            var ref = references.next
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
        var constantExpr = statement.eAllContents.filter(ConstantExpression)
        while (constantExpr.hasNext) {
            var expr = constantExpr.next
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
                        setExpression(createValuedObjectReference(newVariables.get(constant)), expr.eContainer)
                    }
                }
            }
            else if (expr.value != null) {
                if(expr.eContainer.eGet(expr.eContainingFeature) instanceof EList) {
                    var list = expr.eContainer.eGet(expr.eContainingFeature) as EList<Expression>
                    var pos = list.indexOf(expr)
                    list.set(pos, createStringValue(expr.value))
                }
                else {
                    setExpression(createStringValue(expr.value), expr.eContainer)
                }
            }
            else {
                throw new UnsupportedOperationException(
                        "The following constant expression doesn't have a constant and value! " + expr)
            }
        }
    }
    
}