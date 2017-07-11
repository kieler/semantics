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
import de.cau.cs.kieler.scl.scl.StatementContainer
import de.cau.cs.kieler.esterel.esterel.Trap
import de.cau.cs.kieler.esterel.esterel.Exec
import de.cau.cs.kieler.esterel.esterel.Do
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.IfTest
import de.cau.cs.kieler.esterel.esterel.Abort
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.esterel.esterel.EsterelParallel
import de.cau.cs.kieler.scl.scl.Parallel
import com.google.common.collect.Sets
import de.cau.cs.kieler.esterel.esterel.LocalVariable
import java.util.HashMap
import de.cau.cs.kieler.esterel.esterel.IVariable
import de.cau.cs.kieler.kexpressions.ValuedObject
import java.util.Map
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.esterel.esterel.EsterelType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.esterel.esterel.EsterelAssignment
import de.cau.cs.kieler.scl.scl.Assignment
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.Run

/**
 * @author mrb
 *
 */
class LocalVariableTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::LOCALVARIABLE_ID
    }

    override getName() {
        return SCEstTransformation::LOCALVARIABLE_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::LOCALVARIABLE_ID
    }
        
//    override getProducesFeatureIds() {
//        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID, SCEstTransformation::ENTRY_ID,
//            SCEstTransformation::CONNECTOR_ID)
//    }
//
    override getNotHandlesFeatureIds() {
        return Sets.newHashSet( SCEstTransformation::INITIALIZATION_ID, 
                                SCEstTransformation::PROCCALL_ID, SCEstTransformation::EXEC_ID
        )
    }

    @Inject
    extension SCEstExtension
    
    def SCEstProgram transform(SCEstProgram prog) {
        prog.modules.forEach [ m | transformStatements(m.statements)]
        return prog
    }
    
    def EList<Statement> transformStatements(EList<Statement> statements) {
        for (var i=0; i<statements?.length; i++) {
            statements.get(i).transformStatement
        }
        return statements
    }
    
    def void transformStatement(Statement statement) {
        if (statement instanceof LocalVariable) {
            statement.transformVariable
        }
        else if (statement instanceof StatementContainer) {
            
            transformStatements((statement as StatementContainer).statements)
            
            if (statement instanceof Trap) {
                (statement as Trap).trapHandler?.forEach[h | transformStatements(h.statements)]
            }
            else if (statement instanceof Abort) {
                transformStatements((statement as Abort).doStatements)
                (statement as Abort).cases?.forEach[ c | transformStatements(c.statements)]
            }
            else if (statement instanceof Await) {
                (statement as Await).cases?.forEach[ c | transformStatements(c.statements)]
            }
            else if (statement instanceof Exec) {
                (statement as Exec).execCaseList?.forEach[ c | transformStatements(c.statements)]
            }
            else if (statement instanceof Do) {
                transformStatements((statement as Do).watchingStatements)
            }
            else if (statement instanceof Conditional) {
                transformStatements((statement as Conditional).getElse()?.statements)
            }
        }
        else if (statement instanceof Present) {
            transformStatements((statement as Present).thenStatements)
            (statement as Present).cases?.forEach[ c | transformStatements(c.statements)]
            transformStatements((statement as Present).elseStatements)
        }
        else if (statement instanceof IfTest) {
            transformStatements((statement as IfTest).thenStatements)
            (statement as IfTest).elseif?.forEach [ elsif | transformStatements(elsif.thenStatements)]
            transformStatements((statement as IfTest).elseStatements)
        }
        else if (statement instanceof EsterelParallel) {
            (statement as EsterelParallel).threads.forEach [ t |
                transformStatements(t.statements)
            ]
        }
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads.forEach [ t |
                transformStatements(t.statements)
            ]
        }
        else if (statement instanceof Run) {
            statement.module?.module?.statements.transformStatements    
        }
    }
    
    def transformVariable(Statement statement) {
        var variables = statement as LocalVariable
        var statements = statement.getContainingList
        var pos = statements.indexOf(statement)
        var scope = createScopeStatement
        scope.statements.add(variables.statements)
        // this map combines an Esterel variable with the new SCL variable
        var HashMap<IVariable, ValuedObject> newVariables = new HashMap<IVariable, ValuedObject>()
        // go through all declarations
        for (decl : variables.varDecls) {
            if (decl.type.type != null) {
                var ValueType type
                switch decl.type.type {
                    // TODO by user defined types are by default pure - correct behavior?
                    case ValueType.PURE : 
                        type = ValueType.BOOL
                    case ValueType.BOOL : 
                        type = ValueType.BOOL
                    case ValueType.UNSIGNED : 
                        type = ValueType.UNSIGNED
                    case ValueType.INT : 
                        type = ValueType.INT
                    case ValueType.FLOAT : 
                        type = ValueType.FLOAT
                    case ValueType.DOUBLE : 
                        type = ValueType.FLOAT
                    case ValueType.STRING : 
                        type = ValueType.STRING
                    case ValueType.HOST : 
                        type = ValueType.HOST
                    default: {
                        throw new UnsupportedOperationException(
                        "The following type is not supported! " + decl.type.type.toString)
                    }
                    
                }
                var declaration = createDeclaration(type, null)
                scope.declarations.add(declaration)
                // go through all variables in the current declaration
                for (variable : decl.variables) {
                    var v = createNewUniqueVariable(EcoreUtil.copy(variable.expression))
                    v.combineOperator = variable.combineOperator
                    declaration.valuedObjects.add(v)
                    newVariables.put(variable, v)
                }
            }
            else {
                 throw new UnsupportedOperationException(
                        "The type is not supported! " + decl.type.typeID + "|" + (decl.type as EsterelType)?.estType)
            }
                
        }
        // the esterel IVariables are not deleted yet
        variables.statements.add(scope)
//        // IVariables are gone
//        statements.set(pos, scope)
        transformReferences(scope, newVariables)
        transformAssignments(scope, newVariables)
        
        // TODO EXEC STATEMENT TRANSFORMATION
        
    }
    
    def transformReferences(Statement statement, Map<IVariable, ValuedObject> newVariables) {
        var references = statement.eAllContents.filter(ValuedObjectReference)
        // iterate over all valued object references contained in the scope
        // if a reference references a transformed variable then set the reference to the new variable
        while (references.hasNext) {
            var ref = references.next
            if (ref.valuedObject instanceof IVariable) {
                var vObject = ref.valuedObject as IVariable
                if (newVariables.containsKey(vObject)) {
                    ref.valuedObject = newVariables.get(vObject)
                    removeValueTestOperator(ref.eContainer)
                }
            }
        }
    }
    
    def transformAssignments(Statement statement, Map<IVariable, ValuedObject> newVariables) {
        // iterate over all Esterel assignments in the scope
        var assignmentsEst = statement.eAllContents.filter(EsterelAssignment)
        while (assignmentsEst.hasNext) {
            var a = assignmentsEst.next
            if (newVariables.containsKey(a.getVar())) {
                var statements = a.getContainingList
                var pos = statements.indexOf(a)
                var assignment = createAssignment(newVariables.get(a.getVar()), EcoreUtil.copy(a.expression))
                statements.set(pos, assignment)
            }
        }
        // iterate over all SCL assignments in the scope
        var assignmentsSCL = statement.eAllContents.filter(Assignment)
        while (assignmentsSCL.hasNext) {
            var a = assignmentsSCL.next
            if (newVariables.containsKey(a.valuedObject)) {
                a.valuedObject = newVariables.get(a.valuedObject)
            }
        }
    }
    
}