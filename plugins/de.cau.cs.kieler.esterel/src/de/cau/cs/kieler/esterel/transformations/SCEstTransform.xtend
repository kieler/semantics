/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.transformations

import com.google.common.collect.Sets
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.esterel.features.EsterelFeature
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.scest.transformations.SCEstTransformation
import de.cau.cs.kieler.esterel.scest.scest.SCEstProgram
import de.cau.cs.kieler.esterel.scest.scest.SCEstModule
import de.cau.cs.kieler.esterel.esterel.Module
import com.google.inject.Inject
import de.cau.cs.kieler.esterel.scest.extensions.SCEstExtension
import java.util.HashMap
import de.cau.cs.kieler.esterel.esterel.Run
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.StatementContainer
import de.cau.cs.kieler.esterel.esterel.Trap
import de.cau.cs.kieler.esterel.esterel.Abort
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.Exec
import de.cau.cs.kieler.esterel.esterel.Do
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.IfTest
import de.cau.cs.kieler.esterel.esterel.EsterelParallel
import de.cau.cs.kieler.scl.scl.Parallel
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * This class handles the default NO simulation visualization
 * 
 * @author cmot
 * @kieler.design 2014-07-23 proposed cmot
 * @kieler.rating 2014-07-23 proposed yellow
 */
class SCEstTransform extends AbstractExpansionTransformation {
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    
    override getId() {
        return "esterel.scest"
    }

    override getName() {
        return "SCEst"
    }

    override getExpandsFeatureId() {
        return "esterel.scest"
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID)
    }
    
    @Inject
    extension SCEstExtension
    
    var moduleReferences = new HashMap<Module, Run>
    var SCEstProgram scestProgram
    
    def SCEstProgram transform(Program prog) {
//        for (var i=0; i<prog.modules.length; i++) {
//            prog.modules.set(i, prog.modules.get(i) as SCEstModule)
//        }
//        return prog
//        var scestProgram = createSCEstProgram
//        for (m : prog.modules) {
//            scestProgram.modules.add(m.copyModule)
//        }
        scestProgram = createSCEstProgram
        for (var i=0; i<prog.modules.length; i++) {
            var m = prog.modules.get(i)
            transformStatements(m.statements)
            scestProgram.modules.add(m.copyModule)
        } 
        scestProgram
    }
    
    def SCEstModule copyModule(Module m) {
        var module = createSCEstModule
        module.annotations += m.annotations
        module.name = m.name
        module.intConstantDecls += m.intConstantDecls
        module.intFunctionDecls += m.intFunctionDecls
        module.intProcedureDecls += m.intProcedureDecls
        module.intRelationDecls += m.intRelationDecls
        module.intSensorDecls += m.intSensorDecls
        module.intSignalDecls += m.intSignalDecls
        module.intTaskDecls += m.intTaskDecls
        module.intTypeDecls += m.intTypeDecls
        module.statements += m.statements
        return module
    }
    
    def EList<Statement> transformStatements(EList<Statement> statements) {
        for (var i=0; i<statements?.length; i++) {
            statements.get(i).transformStatement
            
        }
        return statements
    }
    
    def Statement transformStatement(Statement statement) {
        if (statement instanceof Run) {
            // create a copy of the referenced module
            // so that the original module will not be modified
            // and update the renamings
            var statements = statement.containingList
            var pos = statements.indexOf(statement)
            var moduleCopy = EcoreUtil.copy(statement.module.module)
            var moduleCopy2 = moduleCopy.copyModule
            statement.module.module = moduleCopy2
            moduleCopy2.name = moduleCopy2.name.createNewUniqueModuleName
            moduleCopy2.annotations.add(createModuleAnnotation)
            statement.transformRenamingsAfterModuleCopy
            scestProgram.modules.add(moduleCopy2)
            transformStatements(statement.module.module.statements)
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
        return statement
    }

}
