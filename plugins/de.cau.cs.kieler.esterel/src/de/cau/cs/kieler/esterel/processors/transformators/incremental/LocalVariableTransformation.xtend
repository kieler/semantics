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
package de.cau.cs.kieler.esterel.processors.transformators.incremental

import java.util.HashMap
import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.LocalVariableDeclaration
import de.cau.cs.kieler.esterel.Variable
import de.cau.cs.kieler.scl.Statement
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kicool.compilation.EObjectReferencePropertyData
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.esterel.VariableReference

/**
 * @author mrb
 *
 */
class LocalVariableTransformation extends InplaceProcessor<EsterelProgram> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.variable"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Variable"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    var EObject lastStatement
    
    override process() {
        val nextStatement = environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM).getObject
        val isDynamicCompilation = environment.getProperty(SCEstIntermediateProcessor.DYNAMIC_COMPILATION)
        
        if (isDynamicCompilation) {
            if (nextStatement instanceof LocalVariableDeclaration) {
                transform(nextStatement)
            }
            else {
                throw new UnsupportedOperationException(
                    "The next statement to transform and this processor do not match.\n" +
                    "This processor ID: " + ID + "\n" +
                    "The statement to transform: " + nextStatement
                )
            }
            environment.setProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM, new EObjectReferencePropertyData(lastStatement))
        }
        else {
            model.eAllContents.filter(LocalVariableDeclaration).toList.forEach[transform]
        }
    }
    
    def transform(LocalVariableDeclaration variables) {
        val scope = variables.statements.createScopeStatement
        // this map combines an Esterel variable with the new SCL variable
        val HashMap<ValuedObject, ValuedObject> newVariables = new HashMap<ValuedObject, ValuedObject>()
        // go through all declarations
        for (decl : variables.declarations) {
            if (decl.type.type !== null) {
                var ValueType type
                switch decl.type.type {
                    case ValueType.PURE : 
                        type = ValueType.BOOL
                    case ValueType.DOUBLE : 
                        type = ValueType.FLOAT 
                    default: {
                        type = decl.type.type
                    }
                    
                }
                val declaration = createDeclaration(type, null)
                scope.declarations.add(declaration)
                // go through all variables in the current declaration
                for (variable : decl.valuedObjects) {
                    val v = createNewUniqueVariable(variable.initialValue)
                    v.combineOperator = variable.combineOperator
                    declaration.valuedObjects.add(v)
                    newVariables.put(variable, v)
                }
            }
            else {
                 throw new UnsupportedOperationException(
                    "The type is not supported! " + decl.type.idType + "|" + decl.type.esterelType)
            }
                
        }
        variables.replace(scope)
        lastStatement = scope
        transformReferences(scope, newVariables)
        // TODO EXEC STATEMENT TRANSFORMATION        
    }
    
    def transformReferences(Statement statement, HashMap<ValuedObject, ValuedObject> newVariables) {
        var references = statement.eAllContents.filter(ValuedObjectReference).toList
        for (ref : references) {
            if (ref.valuedObject instanceof Variable) {
                val vObject = ref.valuedObject as Variable
                if (newVariables.containsKey(vObject)) {
                    if (ref instanceof VariableReference) {
                        ref.replace(newVariables.get(vObject).createValuedObjectReference)
                    }
                    else {
                        ref.valuedObject = newVariables.get(vObject)
                    }
                }
            }
        }
    }
    
}