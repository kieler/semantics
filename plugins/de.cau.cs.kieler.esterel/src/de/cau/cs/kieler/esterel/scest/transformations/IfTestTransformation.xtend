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
import de.cau.cs.kieler.esterel.esterel.Await

/**
 * @author mrb
 *
 */
class IfTestTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::IFTEST_ID
    }

    override getName() {
        return SCEstTransformation::IFTEST_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::IFTEST_ID
    }
        
//    override getProducesFeatureIds() {
//        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID, SCEstTransformation::ENTRY_ID,
//            SCEstTransformation::CONNECTOR_ID)
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
        if (statement instanceof IfTest) {
            var ifTest = statement as IfTest
            transformStatements(ifTest.thenStatements)
            if (ifTest.elseif != null) {
                ifTest.elseif.forEach [ elsif | transformStatements(elsif.thenStatements)]
            }
            transformStatements(ifTest.elseStatements)
            
            var conditional = createConditional(ifTest.expression)
            conditional.statements.add(ifTest.thenStatements)
            if (!ifTest.elseif.empty) {
                var tempConditional = conditional
                for (e : ifTest.elseif) {
                    var conditional2 = createConditional(e.expression)
                    conditional2.statements.add(e.thenStatements)
                    var elseStatement = createElseScope(conditional2)
                    tempConditional.setElse(elseStatement)
                    tempConditional = conditional2
                }
                if (!ifTest.elseStatements.isEmpty) {
                    tempConditional.setElse(createElseScope(ifTest.elseStatements))
                }
            }
            else if (!ifTest.elseStatements.isEmpty) {
                conditional.setElse(createElseScope(ifTest.elseStatements))
            }
            
            return conditional
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
            else if (statement instanceof Await) {
                (statement as Await).cases?.forEach[ c | transformStatements(c.statements)]
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