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

import java.util.List
import java.util.LinkedList
import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Abort
import de.cau.cs.kieler.esterel.EsterelParallel
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.scl.Label
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.Pause
import de.cau.cs.kieler.scl.Statement
import de.cau.cs.kieler.scl.Parallel
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kicool.compilation.EObjectReferencePropertyData
import org.eclipse.emf.ecore.EObject

/**
 * @author mrb
 *
 */
class AbortTransformation extends InplaceProcessor<EsterelProgram> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.abort"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Abort"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    var EObject lastStatement
    
    override process() {
        val nextStatement = environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM).getObject
        val isDynamicCompilation = environment.getProperty(SCEstIntermediateProcessor.DYNAMIC_COMPILATION)
        
        if (isDynamicCompilation) {
            if (nextStatement instanceof Abort) {
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
            model.eAllContents.filter(Abort).toList.forEach[transform]
        }
    }
    
    def transform(Abort abort) {
        val scope = createScopeStatement
        val parallel = createParallel
        val thread1 = createThread
        val thread2 = createThread
        val abortFlag = createNewUniqueAbortFlag(createFalse)
        val decl = createDeclaration(ValueType.BOOL, abortFlag)
        val label = createLabel
        parallel.threads.add(thread1)
        parallel.threads.add(thread2)
        
        // check if its just a single abort delay or if this abort includes cases
        if (abort.delay !== null) {
            // abort with a count delay, e.g. "abort when 3 A" or "weak abort when 3 A"
            if (abort.delay.delay !== null) {
                val termFlag = createNewUniqueTermFlag(createFalse)
                decl.valuedObjects.add(termFlag)
                scope.declarations.add(decl)
                val countingVariables = new LinkedList<ValuedObject>()
                val variable = createNewUniqueVariable(createIntValue(0))
                countingVariables.add(variable)
                val decl2 = createDeclaration(ValueType.INT, variable)
                scope.declarations.add(decl2)
                scope.statements.add(parallel)
                val label2 = createLabel
                val label3 = createLabel
                val condition = createOr(createValuedObjectReference(abortFlag), createValuedObjectReference(termFlag))
                val conditional = newIfThenGoto(condition, label3, false)
                val conditional2  = createConditional(copy(abort.delay.expression))
                conditional2.statements.add(incrementInt(variable))
                thread1.statements.add(label2)
                thread1.statements.add(createPause)
                thread1.statements.add(conditional) 
                thread1.statements.add(conditional2)
                thread1.statements.add(createGotoStatement(label2))
                thread1.statements.add(label3)
                abort.statements.add(label)
                transformPauses(abort, label, abortFlag, null, countingVariables)
                transformJoins(abort, label, abortFlag)
                thread2.statements.addAll(abort.statements)
                thread2.statements.add(createAssignment(termFlag, createTrue))
                thread2.statements.add(createLabel)
                scope.statements.add(label)
                if (!abort.doStatements.empty) {
                    val conditional3 = createConditional(createValuedObjectReference(abortFlag))
                    conditional3.statements.addAll(abort.doStatements)
                    scope.statements.add(conditional3)
                }
            }
            else { // abort without a count delay
                abort.statements.add(label)
                var Conditional conditional4
                // e.g. "abort when immediate A"
                if (!abort.weak && abort.delay.isImmediate) {
                    val conditional = newIfThenGoto(copy(abort.delay.expression), label, false)
                    transformPauses(abort, label, null, null, null)
                    transformJoins(abort, label, null)
                    scope.statements.add(conditional)
                }
                else {
                    var ValuedObject depthFlag = null
                    if (abort.weak && !abort.delay.isImmediate) {
                        depthFlag = createNewUniqueDepthFlag(createFalse)
                        decl.valuedObjects.add(depthFlag)
                    }
                    transformPauses(abort, label, abortFlag, depthFlag, null)
                    transformJoins(abort, label, abortFlag)
                    scope.declarations.add(decl)
                }
                // if doStatements exist
                if (!abort.doStatements.empty) {
                    if (!abort.weak && abort.delay.isImmediate) {
                        conditional4 = createConditional(copy(abort.delay.expression))
                    }
                    else {
                        conditional4 = createConditional(createValuedObjectReference(abortFlag))
                    }
                    conditional4.statements.addAll(abort.doStatements)
                    scope.statements.add(conditional4)
                }
                scope.statements.addAll(abort.statements)
            }
        }
        // ABORT CASES
        else {
            val label2 = createLabel
            val countingVariables = new LinkedList<ValuedObject>()
            val depthFlag = createNewUniqueDepthFlag(createFalse)
            
            val termFlag = createNewUniqueTermFlag(createFalse)
            decl.valuedObjects.add(depthFlag)
            decl.valuedObjects.add(termFlag)
            val label3 = createLabel
            val label4 = createLabel
            val condition = createOr(createValuedObjectReference(abortFlag), createValuedObjectReference(termFlag))
            val conditional = newIfThenGoto(condition, label4, false)
            thread1.statements.add(label3)
            thread1.statements.add(conditional) 
            thread1.statements.add(createPause)
            thread1.statements.add(createAssignment(depthFlag, createTrue))
            scope.statements.add(label)
            for ( c : abort.cases ) {
                // creating counting variables for cases with a count delay before the signal expression
                if (c.delay.delay !== null) {
                    val variable = createNewUniqueVariable(createIntValue(0))
                    val decl2 = createDeclaration(ValueType.INT, variable)
                    countingVariables.add(variable)
                    scope.declarations.add(decl2)  
                    val conditional2  = createConditional(copy(c.delay.expression))
                    conditional2.statements.add(incrementInt(variable))
                    thread1.statements.add(conditional2)
                }
                // adding if for an immediate case before the statements which should be aborted
                else if (c.delay.immediate && !abort.weak) {
                    val conditional2 = newIfThenGoto(copy(c.delay.expression), label, false)
                    scope.statements.add(scope.statements.length-1, conditional2)
                }
            }
            transformPauses(abort, label, abortFlag, depthFlag, countingVariables)
            transformJoins(abort, label, abortFlag)
            thread1.statements.add(createGotoStatement(label3))
            thread1.statements.add(label4)
            thread2.statements.addAll(abort.statements)
            thread2.statements.add(createAssignment(termFlag, createTrue))
            thread2.statements.add(createLabel)
            scope.declarations.add(decl)
            scope.statements.add(scope.statements.length-1, parallel)

            var i = 0
            // adding the do blocks of the cases after the abort label
            for ( c : abort.cases ) {
                var Conditional conditional2
                if (c.delay.immediate) {
                    conditional2 = newIfThenGoto(copy(c.delay.expression), label2, false)
                }
                else if (c.delay.delay === null) {
                    conditional2 = newIfThenGoto(createAnd(copy(c.delay.expression), createValuedObjectReference(depthFlag)), label2, false)
                }
                else {
                    countingVariables.get(i)
                    conditional2 = newIfThenGoto(createGEQ(createValuedObjectReference(countingVariables.get(i)), copy(c.delay.delay)), label2, false)
                    i++
                }
                conditional2.statements.addAll(0, c.statements)
                scope.statements.add(conditional2)
            }
            scope.statements.add(label2)
        }
        abort.getContainingList.checkGotos
        abort.replace(scope)
        lastStatement = scope
    }
    
    def transformPauses(Abort abort, Label label, ValuedObject abortFlag, ValuedObject depthFlag, LinkedList<ValuedObject> countingVariables) {
            val tempScope = createScopeStatement(abort.statements)
            val pauses = tempScope.eAllContents.filter(Pause).toList
            abort.statements.addAll(tempScope.statements)
            for (pause : pauses) {
                var statements =  pause.getContainingList
                var pos = statements.indexOf(pause)
                var label2 = findClosestLabel(label, pause)
                
                // ABORT CASES
                if (abort.delay === null) {
                    transformCases(pause, abort, label2, abortFlag, depthFlag, countingVariables)
                }
                // WEAK ABORT
                else if (abort.weak) {
                    // e.g. "weak abort immediate A"
                    if (abort.delay.isImmediate) {
                        val conditional = newIfThenGoto(abort.delay.expression.copy, label2, false)
                        conditional.statements.add(0, createAssignment(abortFlag, createTrue))
                        insertConditionalAbove(pause, conditional)
                    }
                    else {
                        // e.g. "weak abort when A"
                        if (abort.delay.delay === null) {
                            val expr = createAnd(copy(abort.delay.expression), createValuedObjectReference(depthFlag))
                            val conditional = newIfThenGoto(expr, label2, false)
                            conditional.statements.add(0, createAssignment(abortFlag, createTrue))
                            statements.add(pos+1, createAssignment(depthFlag, createTrue))
                            insertConditionalAbove(pause, conditional)
                        }
                        // e.g. "weak abort when 3 A"
                        else {
                            var GEQExpr = createGEQ(createValuedObjectReference(countingVariables.get(0)), copy(abort.delay.delay))
                            var conditional = newIfThenGoto(GEQExpr, label2, false)
                            conditional.statements.add(0, createAssignment(abortFlag, createTrue))
                            insertConditionalAbove(pause, conditional)
                        }
                    }
                }
                // STRONG ABORT
                else {
                    // e.g. "abort immediate A"
                    if (abort.delay.isImmediate) {
                        var conditional = newIfThenGoto(abort.delay.expression.copy, label2, false)
                        statements.add(pos+1, conditional)
                    }
                    else {
                        // e.g. "abort when A"
                        if (abort.delay.delay === null) {
                            var conditional = newIfThenGoto(abort.delay.expression.copy, label2, false)
                            conditional.statements.add(0, createAssignment(abortFlag, createTrue))
                            statements.add(pos+1, conditional)
                        }
                        // e.g. "abort when 3 A"
                        else {
                            var GEQExpr = createGEQ(createValuedObjectReference(countingVariables.get(0)), copy(abort.delay.delay))
                            var conditional = newIfThenGoto(GEQExpr, label2, false)
                            conditional.statements.add(0, createAssignment(abortFlag, createTrue))
                            statements.add(pos+1, conditional)
                        }
                    }
                }
            }
            
    }
    
    def void transformJoins(Abort abort, Label label, ValuedObject flag) {
        val List<Statement> parallels = abort.eAllContents.filter(Parallel).toList
        parallels.addAll(abort.eAllContents.filter(EsterelParallel).toList)
        for (parallel : parallels) {
            val statements =  parallel.getContainingList
            val pos = statements.indexOf(parallel)
            var conditional = newIfThenGoto(abort.delay?.expression, findClosestLabel(label, parallel), false)
            if (abort.delay?.isImmediate && !abort.weak) {
                // just for an immediate strong abort
                conditional = newIfThenGoto(abort.delay?.expression, findClosestLabel(label, parallel), false)
            } 
            else {
                conditional = newIfThenGoto(createValuedObjectReference(flag), findClosestLabel(label, parallel), false)
            }
            statements.add(pos+1, conditional)
        }
    }
    
    def transformCases(Statement statement, Abort abort, Label label, ValuedObject abortFlag, ValuedObject depthFlag, LinkedList<ValuedObject> countingVariables) {
        val statements = statement.getContainingList
        var pos = statements.indexOf(statement)
        var i = 0
        for (c : abort.cases) {
            // e.g. "case 3 A"
            if (c.delay.delay !== null) {
                val conditional = newIfThenGoto(createGEQ(createValuedObjectReference(countingVariables.get(i)), copy(c.delay.delay)), label, false)
                conditional.statements.add(0, createAssignment(abortFlag, createTrue))
                if (abort.weak) {
                    insertConditionalAbove(statement, conditional)
                    pos++
                }
                else {
                    statements.add(pos+1, conditional)
                }
                i++
            }
            // e.g. "case immediate A" or "case A"
            else {
                var conditional = newIfThenGoto(copy(c.delay.expression), label, false)
                if (!c.delay.immediate) {
                    conditional = newIfThenGoto(createAnd(copy(c.delay.expression), createValuedObjectReference(depthFlag)), label, false)
                }
                else {
                    conditional = newIfThenGoto(copy(c.delay.expression), label, false)
                }
                conditional.statements.add(0, createAssignment(abortFlag, createTrue))
                if (abort.weak) {
                    insertConditionalAbove(statement, conditional)
                    pos++
                }
                else {
                    statements.add(pos+1, conditional)
                }
            }
        }
    }
    
}