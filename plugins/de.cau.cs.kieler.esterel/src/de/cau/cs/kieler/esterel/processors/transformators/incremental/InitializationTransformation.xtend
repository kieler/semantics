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

import com.google.inject.Inject
import de.cau.cs.kieler.esterel.Abort
import de.cau.cs.kieler.esterel.Await
import de.cau.cs.kieler.esterel.Do
import de.cau.cs.kieler.esterel.EsterelParallel
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.EveryDo
import de.cau.cs.kieler.esterel.Exec
import de.cau.cs.kieler.esterel.IfTest
import de.cau.cs.kieler.esterel.Loop
import de.cau.cs.kieler.esterel.Present
import de.cau.cs.kieler.esterel.Run
import de.cau.cs.kieler.esterel.Suspend
import de.cau.cs.kieler.esterel.Trap
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.Parallel
import de.cau.cs.kieler.scl.Statement
import de.cau.cs.kieler.scl.StatementContainer
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.esterel.EsterelThread

/**
 * @author mrb
 *
 */
class InitializationTransformation extends InplaceProcessor<EsterelProgram> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.initialization"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Initialization"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    override process() {
        model.transform
    }
    
    var EsterelProgram scestProgram
    
    def EsterelProgram transform(EsterelProgram prog) {
        scestProgram = prog
        resetLabelSuffix
        resetConstantSuffix
        resetVariableSuffix
        resetFlagSuffix
        resetAbortFlagSuffix
        resetDepthFlagSuffix 
        resetTrapSuffix 
        resetSignalSuffix 
        resetModuleSuffix
        clearNewSignalsMap
        for (var i=0; i<prog.modules.length; i++) {
            var m = prog.modules.get(i)
            if (!m.annotations.isGeneratedModule) {
                transformStatements(m.statements, 1)
            }
        } 
        return prog
    }
    
    def void transformStatements(EList<Statement> statements, int depth) {
        if (statements !== null) {
            for (var i=0; i<statements.length; i++) {
                statements.get(i).transformStatement(depth)
            }
        }
    }
    
    def Statement transformStatement(Statement statement, int depth) {
        if (statement instanceof EsterelParallel) {
            var parallel = statement as EsterelParallel
            parallel.statements.forEach [ t |
                transformStatements((t as EsterelThread).statements, depth+1)
            ]
            
        }
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads.forEach [ t |
                transformStatements(t.statements, depth+1)
            ]
        }
        else if (statement instanceof Present) {
            transformStatements((statement as Present).statements, depth+1)
            if ((statement as Present).cases !== null) {
                (statement as Present).cases.forEach[ c | transformStatements(c.statements, depth+1)]
            }
            transformStatements((statement as Present).elseStatements, depth+1)
        }
        else if (statement instanceof IfTest) {
            transformStatements((statement as IfTest).statements, depth+1)
            if ((statement as IfTest).elseif !== null) {
                (statement as IfTest).elseif.forEach [ elsif | transformStatements(elsif.statements, depth+1)]
            }
            transformStatements((statement as IfTest).elseStatements, depth+1)
        }
        else if (statement instanceof StatementContainer) {
            
            transformStatements((statement as StatementContainer).statements, depth+1)
            
            if (statement instanceof Loop) {
                (statement as Loop).annotations.add(createAnnotation(depth))
            }
            else if (statement instanceof Await) {
                (statement as Await).annotations.add(createAnnotation(depth))
                (statement as Await).cases?.forEach[ c | transformStatements(c.statements, depth+1)]
            }
            else if (statement instanceof EveryDo) {
                (statement as EveryDo).annotations.add(createAnnotation(depth))
            }
            else if (statement instanceof Suspend) {
                (statement as Suspend).annotations.add(createAnnotation(depth))
            }
            else if (statement instanceof Trap) {
                (statement as Trap).annotations.add(createAnnotation(depth))
                if ((statement as Trap).trapHandler !== null) {
                    (statement as Trap).trapHandler.forEach[h | transformStatements(h.statements, depth+1)]
                }
            }
            else if (statement instanceof Abort) {
                transformStatements((statement as Abort).doStatements, depth+1)
                if ((statement as Abort).cases !== null) {
                    (statement as Abort).cases.forEach[ c | transformStatements(c.statements, depth+1)]
                }
                (statement as Abort).annotations.add(createAnnotation(depth))
            }
            else if (statement instanceof Exec) {
                if ((statement as Exec).execCaseList !== null) {
                    (statement as Exec).execCaseList.forEach[ c | transformStatements(c.statements, depth+1)]
                }
            }
            else if (statement instanceof Do) {
                transformStatements((statement as Do).watchingStatements, depth+1)
                (statement as Do).annotations.add(createAnnotation(depth))
            }
            else if (statement instanceof Conditional) {
                if ((statement as Conditional).getElse() !== null) {
                    transformStatements((statement as Conditional).getElse().statements, depth+1)
                }
            }
        }
        else if (statement instanceof Run) {
            // create a copy of the referenced module
            // so that the original module will not be modified
            // and update the renamings
            if (!statement.module.module.annotations.isGeneratedModule) {
                var moduleCopy = EcoreUtil.copy(statement.module.module)
                statement.module.module = moduleCopy
                moduleCopy.name = moduleCopy.name.createNewUniqueModuleName
                moduleCopy.annotations.add(createModuleAnnotation)
                statement.transformRenamingsAfterModuleCopy
                scestProgram.modules.add(moduleCopy)
            }
            transformStatements(statement.module.module.statements, depth+1)
        }
        return statement
    }
}