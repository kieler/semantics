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
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scl.StatementContainer

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
        // TODO this should be a statement in the environment which was transformed in the last step
        var EObject obj
        obj.nextStatement
        
    }
    
    def nextStatement(EObject object) {
        var obj = object
        var up = true
        while (true) {
            if (up) {
                var list = obj.containingList
                var pos = list.indexOf(obj)
                var parent = obj.eContainer
                if (pos+1 < list.length) {
                    obj = list.get(pos+1)
                    up = false
                }
                else if ((parent instanceof EsterelThread) || (parent instanceof Thread)) {
                    val threads = (parent as Thread).containingList
                    pos = threads.indexOf(parent)
                    if (pos+1 < threads.length) {
                        obj = threads.get(pos+1)
                        up = false
                    }
                    else {
                        obj = parent.eContainer
                        up = true
                    }
                }
                else if (parent instanceof Present) {
                    // obj can be in 'statements' or 'elseStatements'
                    var statements = parent.statements
                    if (statements.contains(obj)) {
                        pos = statements.indexOf(obj)
                        if (pos+1 < statements.length) {
                            obj = statements.get(pos+1)
                            up = false
                        }
                        else if (!parent.elseStatements.empty) {
                            obj = parent.elseStatements.head
                            up = false
                        }
                        else {
                            obj = parent
                            up = true
                        }
                    }
                    else { // obj is in elseStatements
                        statements = parent.elseStatements
                        pos = statements.indexOf(obj)
                        if (pos+1 < statements.length) {
                            obj = statements.get(pos+1)
                            up = false
                        }
                        else {
                            obj = parent
                            up = true
                        }
                    }
                }
                else if (parent instanceof PresentCase) {
                    val cases = parent.containingList
                    if (pos+1 < cases.length) {
                        obj = cases.get(pos+1)
                        up = false
                    }
                    else {
                        val present = parent.eContainer as Present
                        if (!present.elseStatements.empty) {
                            obj = present.elseStatements.head
                            up = false
                        }
                        else {
                            obj = present
                            up = true
                        }
                    }
                }
                else if (parent instanceof IfTest) {
                    var statements = parent.statements
                    // obj can be in 'statements' or 'elseStatements'
                    if (statements.contains(obj)) {
                        pos = statements.indexOf(obj)
                        if (pos+1 < statements.length) {
                            obj = list.get(pos+1)
                            up = false
                        }
                        else if (!parent.elseStatements.empty) {
                            obj = parent.elseStatements.head
                            up = false
                        }
                        else {
                            obj = parent
                            up = true
                        }
                    }
                    else { // obj is in elseStatements
                        statements = parent.elseStatements
                        pos = statements.indexOf(obj)
                        if (pos+1 < statements.length) {
                            obj = statements.get(pos+1)
                            up = false
                        }
                        else {
                            obj = parent
                            up = true
                        }
                    }
                }
                else if (parent instanceof ElsIf) {
                    val elsifs = parent.containingList
                    pos = elsifs.indexOf(parent)
                    if (pos+1 < elsifs.length) {
                        obj = elsifs.get(pos+1)
                        up = false
                    }
                    else {
                        val present = parent.eContainer as Present
                        if (!present.elseStatements.empty) {
                            obj = present.elseStatements.head
                            up = false
                        }
                        else {
                            obj = present
                            up = true
                        }
                    }
                }
                else if (parent instanceof Trap) {
                    val statements = parent.statements
                    pos = list.indexOf(obj)
                    if (pos+1 < statements.length) {
                        obj = statements.get(pos+1)
                        up = false
                    }
                    else  { // check TrapHandler
                        if (!parent.trapHandler.empty) {
                            obj = parent.trapHandler.head
                            up = false
                        }
                        else {
                            obj = parent
                            up = true
                        }
                    }
                    
                }
                else if (parent instanceof TrapHandler) {
                    val handler = parent.containingList
                    pos = handler.indexOf(parent)
                    if (pos+1 < handler.length) {
                        obj = handler.get(pos+1)
                        up = false
                    }
                    else {
                        obj = parent.eContainer
                        up = true
                    }
                }
                else if (parent instanceof Abort) {
                    // statements and doStatements
                    // after statements => check cases
                    var statements = parent.statements
                    if (statements.contains(obj)) {
                        pos = statements.indexOf(obj)
                        if (pos+1 < statements.length) {
                            obj = statements.get(pos+1)
                            up = false
                        }
                        else if (!parent.doStatements.empty){
                            obj = parent.doStatements.head
                            up = false
                        }
                        else if (!parent.cases.empty) {
                            obj = parent.cases.head
                            up = false
                        }
                        else {
                            obj = parent
                            up = true
                        }
                    }
                    else { // obj must be in doStatements
                        pos = statements.indexOf(obj)
                        if (pos+1 < statements.length) {
                            obj = statements.get(pos+1)
                            up = false
                        }
                        else {
                            obj = parent
                            up = true
                        }
                    }
                    
                }
                else if ((parent instanceof Case) || (parent instanceof ExecCase)) {
                    val statements = (parent as StatementContainer).statements
                    pos = statements.indexOf(obj)
                    if (pos+1 < statements.length) {
                        obj = statements.get(pos+1)
                        up = false
                    }
                    else {
                        obj = parent.eContainer
                        up = true
                    }
                }
                else if (parent instanceof Do) {
                    // statements and watchingStatements
                    var statements = parent.statements
                    if (statements.contains(obj)) {
                        pos = statements.indexOf(obj)
                        if (pos+1 < statements.length) {
                            obj = statements.get(pos+1)
                            up = false
                        }
                        else {
                            if (!parent.watchingStatements.empty) {
                                obj = parent.watchingStatements.head
                                up = false
                            }
                            else {
                                obj = parent
                                up = true
                            }
                        }
                    }
                    else { // obj in watchingStatements
                        statements = parent.watchingStatements
                        pos = statements.indexOf(obj)
                        if (pos+1 < statements.length) {
                            obj = statements.get(pos+1)
                            up = false
                        }
                        else {
                            obj = parent
                            up = true
                        }
                    }
                }
                else if (parent instanceof Conditional) {
                    // TODO statement in elseScope is in statementcontainer, next step in loop: obj = elsescope
                    // leads to problem at the moment
                    
                }
                else if (parent instanceof Module) {
                    // in Run statement or in EsterelProgram
                }
                else if (parent instanceof StatementContainer) {
                    val statements = parent.statements
                    pos = statements.indexOf(obj)
                    if (pos+1 < statements.length) {
                        obj = statements.get(pos+1)
                        up = false
                    }
                    else {
                        obj = parent
                        up = true
                    }
                }
                else {
                    // TODO call 'transform' on parent
                }
            }
            else { // down, since "up = false"
                
            }
        }
        
    }
    
    def boolean isLastModule(Module module) {
        module.containingList.indexOf(module) === module.containingList.length-1
    }
    
    
}