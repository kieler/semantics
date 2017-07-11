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
import de.cau.cs.kieler.esterel.scest.scest.Set
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.Run

/**
 * @author mrb
 *
 */
class SetTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::SET_ID
    }

    override getName() {
        return SCEstTransformation::SET_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::SET_ID
    }
        
//    override getProducesFeatureIds() {
//        return Sets.newHashSet()
//    }
//
    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID, SCEstTransformation::SIGNAL_ID, 
                                SCEstTransformation::LOCALSIGNALDECL_ID)
    }

    @Inject
    extension SCEstExtension
    
    def SCEstProgram transform(SCEstProgram prog) {
        for (m : prog.modules) { 
            transformStatements(m.statements)
        }
        return prog
    }
    
    def EList<Statement> transformStatements(EList<Statement> statements) {
        for (var i=0; i<statements?.length; i++) {
            statements.get(i).transformStatement
        }
        return statements
    }
    
    def transformStatement(Statement statement) {
        if (statement instanceof Set) {
            transformSet(statement)
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
    
    def transformSet(Statement statement) {
        var set = statement as Set
        var signal = set.signal
        if (newSignals.containsKey(signal)) {
            var statements = statement.getContainingList
            var pos = statements.indexOf(statement)
            var s = newSignals.get(signal).s
            var s_set = newSignals.get(signal).s_set
            var s_cur = newSignals.get(signal).s_cur
            var assign1 = createAssignment(s, createOr(createValuedObjectReference(s), createTrue))
            var assign2 = createAssignment(s_set, createOr(createValuedObjectReference(s_set), createTrue))
            var assign3 = createAssignment(s_cur, set.expression)
            statements.set(pos, assign3)
            statements.add(pos, assign2)
            statements.add(pos, assign1)
        }
    }
    
}