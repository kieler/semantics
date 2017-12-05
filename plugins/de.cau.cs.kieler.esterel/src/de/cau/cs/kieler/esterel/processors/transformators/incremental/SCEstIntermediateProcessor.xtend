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
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Present
import de.cau.cs.kieler.esterel.EsterelThread
import de.cau.cs.kieler.esterel.Case
import de.cau.cs.kieler.esterel.PresentCase
import de.cau.cs.kieler.esterel.IfTest
import de.cau.cs.kieler.esterel.ElsIf
import de.cau.cs.kieler.esterel.TrapHandler
import de.cau.cs.kieler.esterel.Abort
import de.cau.cs.kieler.esterel.ExecCase
import de.cau.cs.kieler.esterel.Do
import de.cau.cs.kieler.esterel.Trap
import de.cau.cs.kieler.scl.Statement
import de.cau.cs.kieler.scl.Module
import de.cau.cs.kieler.scl.Thread
import de.cau.cs.kieler.scl.Conditional
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author mrb
 *
 */
class  SCEstIntermediateProcessor extends InplaceProcessor<EsterelProgram> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.scestintermediateprocessor"
    
    override getId() {
        return ID
    }

    override getName() {
        return "SCEstIntermediateProcessor"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    override process() {
        var done = false
        var Statement statement
        while (!done) {
            var list = statement.containingList
            var pos = list.indexOf(statement)
            val parent = statement.eContainer
            if (pos+1 < list.length) {
                statement = list.get(pos+1)
                // TODO do something with this statement
            }
            else if ((parent instanceof EsterelThread) || (parent instanceof Thread)) {
                val threads = (parent as Thread).containingList
                pos = threads.indexOf(parent)
                if (pos+1 < threads.length) {
                    statement = threads.get(pos+1).statements.head
                    // TODO do something with this statement
                }
                else {
                    statement = parent.eContainer as Statement
                    // TODO do something with this statement
                }
            }
            else if (parent instanceof Present) {
                list = parent.statements
                if (list.contains(statement)) {
                    pos = list.indexOf(statement)
                    if (pos+1 < list.length) {
                        statement = list.get(pos+1)
                        // TODO do something with this statement
                    }
                    else if (!parent.elseStatements.empty) {
                        statement = parent.elseStatements.head
                        // TODO do something with this statement
                    }
                }
                else { // 'statement' is in elseStatements
                    list = parent.elseStatements
                    pos = list.indexOf(statement)
                    if (pos+1 < list.length) {
                        statement = list.get(pos+1)
                        // TODO do something with this statement
                    }
                    else {
                        statement = parent
                        // TODO do something with this statement
                    }
                }
            }
            else if (parent instanceof PresentCase) {
                
            }
            else if (parent instanceof IfTest) {
                // statements, then elsif, then elseStatements
            }
            else if (parent instanceof ElsIf) {
                
            }
            else if (parent instanceof Trap) {
                // check statements and then TrapHandler
            }
            else if (parent instanceof TrapHandler) {
                
            }
            else if (parent instanceof Abort) {
                // statements and doStatements
                // after statements => check cases
            }
            else if (parent instanceof Case) {
                
            }
            else if (parent instanceof ExecCase) {
                
            }
            else if (parent instanceof Do) {
                // statements and watchingStatements
            }
            else if (parent instanceof Conditional) {
                
            }
            else if (parent instanceof Module) {
                // in Run statement or in EsterelProgram
            }
            else {
                // TODO call 'transform' on parent
            }
            
        }
    }
    
    def boolean isLastModule(Module module) {
        module.containingList.indexOf(module) === module.containingList.length-1
    }
    
    
}