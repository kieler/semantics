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
import de.cau.cs.kieler.scl.scl.Label

/**
 * @author mrb
 *
 */
class OptimizationLabelRenamingTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::LABELRENAMING_ID
    }

    override getName() {
        return SCEstTransformation::LABELRENAMING_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::LABELRENAMING_ID
    }
        
    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(
              SCEstTransformation::ABORT_ID, SCEstTransformation::ESTERELPARALLEL_ID
            , SCEstTransformation::NOTHING_ID, SCEstTransformation::HALT_ID
            , SCEstTransformation::BLOCK_ID, SCEstTransformation::EMIT_ID
            , SCEstTransformation::SUSTAIN_ID, SCEstTransformation::ESTERELASSIGNMENT_ID
            , SCEstTransformation::PROCCALL_ID, SCEstTransformation::PRESENT_ID
            , SCEstTransformation::IFTEST_ID, SCEstTransformation::LOOP_ID
            , SCEstTransformation::REPEAT_ID, SCEstTransformation::AWAIT_ID
            , SCEstTransformation::EVERYDO_ID, SCEstTransformation::SUSPEND_ID
            , SCEstTransformation::TRAP_ID, SCEstTransformation::EXEC_ID
            , SCEstTransformation::LOCALSIGNALDECL_ID, SCEstTransformation::LOCALVARIABLE_ID
            , SCEstTransformation::RUN_ID, SCEstTransformation::DO_ID
            , SCEstTransformation::UNEMIT_ID, SCEstTransformation::SET_ID
            , SCEstTransformation::SIGNAL_ID, SCEstTransformation::CONSTANT_ID
            , SCEstTransformation::SENSOR_ID, SCEstTransformation::FUNCTION_ID
            , SCEstTransformation::RUN_ID, SCEstTransformation::EXEC_ID
        )
    }

    @Inject
    extension SCEstExtension
    
    def SCEstProgram transform(SCEstProgram prog) {
        resetLabelSuffix
        prog.modules.forEach [ m | transformStatements(m.statements)]
        return prog
    }
    
    def void transformStatements(EList<Statement> statements) {
        if (statements != null) {
            for (var i=0; i<statements.length; i++) {
                statements.get(i).transformStatement
            }
        }
    }
    
    def transformStatement(Statement statement) {
        if (statement instanceof Label) {
            (statement as Label).name = createNewUniqueLabelOptimization
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
    }
}