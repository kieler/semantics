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
import de.cau.cs.kieler.kexpressions.IntValue

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
        if (statements != null) {
            for (var i=0; i<statements.length; i++) {
                var statement = statements.get(i).transformStatement
                if (statement instanceof Statement) {
                    statements.set(i, statement)
                }
            }
        }
        return statements
    }
    
    def Statement transformStatement(Statement statement) {
        if (statement instanceof Repeat) {
            var repeat = statement as Repeat
            var iVariable = createConstant(createNewUniqueConstantName, "0")
            var decl = createDeclaration(ValueType.INT, iVariable)
            var scope = createScopeStatement(decl)
            var label = createLabel(createNewUniqueLabel) 
            scope.statements.add(label)
            scope.statements.add(repeat.statements)
            var vObjectReference = createValuedObjectReference(iVariable)
            var addExpr = createOperatorExpression(vObjectReference, createIntValue(1), OperatorType.ADD)
            var assignment = createAssignment(iVariable, addExpr) 
            scope.statements.add(assignment)
            
            var intValue = createIntValue(1)
            if (repeat.expression instanceof IntValue) {
                intValue.value = (repeat.expression as IntValue).value
            }
            else if (repeat.expression instanceof ConstantExpression) {
                intValue.value = Integer.parseInt((repeat.expression as ConstantExpression).value)
            }
            var ifStatement = createConditional(createLT(EcoreUtil.copy(vObjectReference), intValue))
            scope.statements.add(ifStatement.statements.add(createGotoStatement(label)))
            return scope
        }
       else if (statement instanceof StatementContainer) {
            
            transformStatements((statement as StatementContainer).statements)
            
            if (statement instanceof Trap) {
                if ((statement as Trap).trapHandler != null) {
                    (statement as Trap).trapHandler.forEach[h | transformStatements(h.statements)]
                }
            }
            else if (statement instanceof Abort) {
                transformStatements((statement as Abort).doStatements)
                if ((statement as Abort).cases != null) {
                    (statement as Abort).cases.forEach[ c | transformStatements(c.statements)]
                }
            }
            else if (statement instanceof Exec) {
                if ((statement as Exec).execCaseList != null) {
                    (statement as Exec).execCaseList.forEach[ c | transformStatements(c.statements)]
                }
            }
            else if (statement instanceof Do) {
                transformStatements((statement as Do).watchingStatements)
            }
            else if (statement instanceof Conditional) {
                if ((statement as Conditional).getElse() != null) {
                    transformStatements((statement as Conditional).getElse().statements)
                }
            }
        }
        else if (statement instanceof Present) {
            transformStatements((statement as Present).thenStatements)
            if ((statement as Present).cases != null) {
                (statement as Present).cases.forEach[ c | transformStatements(c.statements)]
            }
            transformStatements((statement as Present).elseStatements)
        }
        else if (statement instanceof IfTest) {
            transformStatements((statement as IfTest).thenStatements)
            if ((statement as IfTest).elseif != null) {
                (statement as IfTest).elseif.forEach [ elsif | transformStatements(elsif.thenStatements)]
            }
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