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
import de.cau.cs.kieler.esterel.esterel.EsterelParallel
import de.cau.cs.kieler.esterel.esterel.Trap
import de.cau.cs.kieler.esterel.esterel.Exec
import de.cau.cs.kieler.esterel.esterel.Do
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.IfTest
import de.cau.cs.kieler.esterel.esterel.Abort
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.esterel.esterel.Repeat
import de.cau.cs.kieler.esterel.esterel.ConstantExpression
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.OperatorType
import org.eclipse.emf.ecore.util.EcoreUtil
import com.google.common.collect.Sets

/**
 * @author mrb
 *
 */
class RepeatTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::REPEAT_ID
    }

    override getName() {
        return SCEstTransformation::REPEAT_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::REPEAT_ID
    }
        
//    override getProducesFeatureIds() {
//        return Sets.newHashSet()
//    }
//
    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID)
    }

    @Inject
    extension SCEstExtension
    
    def SCEstProgram transform(SCEstProgram prog) {
        prog.modules.forEach [ m | transformStatements(m.statements)]
        return prog
    }
    
    def EList<Statement> transformStatements(EList<Statement> statements) {
        for (var i=0; i<statements.length; i++) {
            var statement = statements.get(i).transformStatement
            if (statement instanceof Statement) {
                statements.set(i, statement)
            }
        }
        return statements
    }
    
    def Statement transformStatement(Statement statement) {
        if (statement instanceof Repeat) {
            var repeat = statement as Repeat
            var vObject = createValuedObject
            vObject.name = createNewUniqueConstantName
            vObject.initialValue = createIntValue => [ value = 0 ]
            var decl = createDeclaration
            decl.type = ValueType.INT
            decl.valuedObjects.add(vObject)
            var scope = createScopeStatement
            scope.declarations.add(decl)
            var label = createLabel(createNewUniqueLabel) 
            scope.statements.add(label)
            scope.statements.add(repeat.statements)
            var increment = createIntValue => [ value = 1 ]
            var vObjectReference = createValuedObjectReference(vObject)
            var addExpr = createOperatorExpression(vObjectReference, increment, OperatorType.ADD)
            var assignment = createAssignment(vObject, addExpr) 
            scope.statements.add(assignment)
            var ifStatement = createConditional
            ifStatement.statements.add(createGotoStatement(label))
            var intValue = createIntValue
            intValue.value = Integer.parseInt((repeat.expression as ConstantExpression).value)
            var lessExpr = createLT(EcoreUtil.copy(vObjectReference), intValue)
            ifStatement.expression = lessExpr
            scope.statements.add(ifStatement)
            return scope
        }
        else if (statement instanceof StatementContainer) {
            
            transformStatements((statement as StatementContainer).statements)
            
            if (statement instanceof Trap) {
                (statement as Trap).trapHandler.forEach[h | transformStatements(h.statements)]
            }
            else if (statement instanceof Abort) {
                transformStatements((statement as Abort).doStatements)
                (statement as Abort).cases.forEach[ c | transformStatements(c.statements)]
            }
            else if (statement instanceof Exec) {
                (statement as Exec).execCaseList.forEach[ c | transformStatements(c.statements)]
            }
            else if (statement instanceof Do) {
                transformStatements((statement as Do).watchingStatements)
            }
            else if (statement instanceof Conditional) {
                transformStatements((statement as Conditional).getElse().statements)
            }
        }
        else if (statement instanceof Present) {
            transformStatements((statement as Present).thenStatements)
            (statement as Present).cases.forEach[ c | transformStatements(c.statements)]
            transformStatements((statement as Present).elseStatements)
        }
        else if (statement instanceof IfTest) {
            transformStatements((statement as IfTest).thenStatements)
            (statement as IfTest).elseif.forEach [ elsif | transformStatements(elsif.thenStatements)]
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
        return statement
    }
    
}