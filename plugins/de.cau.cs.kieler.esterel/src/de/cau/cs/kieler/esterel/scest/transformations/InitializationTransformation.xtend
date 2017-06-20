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
import de.cau.cs.kieler.esterel.esterel.Loop
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.EveryDo
import de.cau.cs.kieler.esterel.esterel.Suspend

/**
 * @author mrb
 *
 */
class InitializationTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::INITIALIZATION_ID
    }

    override getName() {
        return SCEstTransformation::INITIALIZATION_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::INITIALIZATION_ID
    }
        
//    override getProducesFeatureIds() {
//        return Sets.newHashSet(SCEstTransformation::)
//    }
//
//    override getNotHandlesFeatureIds() {
//        return Sets.newHashSet()
//    }

    @Inject
    extension SCEstExtension

    def SCEstProgram transform(SCEstProgram prog) {
        resetLabelSuffix
        resetConstantSuffix
        resetVariableSuffix
        prog.modules.forEach [ m | 
            transformStatements(m.statements, 1)
            m.statements.add(createLabel(createNewUniqueLabel))
        ]
        return prog
    }
    
    def void transformStatements(EList<Statement> statements, int depth) {
        if (statements != null) {
            for (var i=0; i<statements.length; i++) {
                statements.get(i).transformStatement(depth)
            }
        }
    }
    
    def Statement transformStatement(Statement statement, int depth) {
        if (statement instanceof EsterelParallel) {
            var parallel = statement as EsterelParallel
            parallel.threads.forEach [ t |
                transformStatements(t.statements, depth+1)
                t.statements.add(createLabel(createNewUniqueLabel))
            ]
            
        }
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads.forEach [ t |
                transformStatements(t.statements, depth+1)
                t.statements.add(createLabel(createNewUniqueLabel))
            ]
        }
        else if (statement instanceof StatementContainer) {
            
            transformStatements((statement as StatementContainer).statements, depth+1)
            
            if (statement instanceof Loop) {
                (statement as Loop).annotations.add(createAnnotation(depth))
            }
            else if (statement instanceof Await) {
                (statement as Await).annotations.add(createAnnotation(depth))
            }
            else if (statement instanceof EveryDo) {
                (statement as EveryDo).annotations.add(createAnnotation(depth))
            }
            else if (statement instanceof Suspend) {
                (statement as Suspend).annotations.add(createAnnotation(depth))
            }
            else if (statement instanceof Trap) {
                if ((statement as Trap).trapHandler != null) {
                    (statement as Trap).trapHandler.forEach[h | transformStatements(h.statements, depth+1)]
                }
            }
            else if (statement instanceof Abort) {
                transformStatements((statement as Abort).doStatements, depth+1)
                if ((statement as Abort).cases != null) {
                    (statement as Abort).cases.forEach[ c | transformStatements(c.statements, depth+1)]
                }
                (statement as Abort).annotations.add(createAnnotation(depth))
            }
            else if (statement instanceof Exec) {
                if ((statement as Exec).execCaseList != null) {
                    (statement as Exec).execCaseList.forEach[ c | transformStatements(c.statements, depth+1)]
                }
            }
            else if (statement instanceof Do) {
                transformStatements((statement as Do).watchingStatements, depth+1)
                (statement as Do).annotations.add(createAnnotation(depth))
            }
            else if (statement instanceof Conditional) {
                if ((statement as Conditional).getElse() != null) {
                    transformStatements((statement as Conditional).getElse().statements, depth+1)
                }
            }
        }
        else if (statement instanceof Present) {
            transformStatements((statement as Present).thenStatements, depth+1)
            if ((statement as Present).cases != null) {
                (statement as Present).cases.forEach[ c | transformStatements(c.statements, depth+1)]
            }
            transformStatements((statement as Present).elseStatements, depth+1)
        }
        else if (statement instanceof IfTest) {
            transformStatements((statement as IfTest).thenStatements, depth+1)
            if ((statement as IfTest).elseif != null) {
                (statement as IfTest).elseif.forEach [ elsif | transformStatements(elsif.thenStatements, depth+1)]
            }
            transformStatements((statement as IfTest).elseStatements, depth+1)
        }
        return statement
    }
}