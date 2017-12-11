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
import de.cau.cs.kieler.scl.StatementContainer
import org.eclipse.emf.ecore.EObject
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.ElseScope
import de.cau.cs.kieler.esterel.Await
import de.cau.cs.kieler.esterel.Block
import de.cau.cs.kieler.esterel.Emit
import de.cau.cs.kieler.esterel.EsterelParallel
import de.cau.cs.kieler.esterel.EveryDo
import de.cau.cs.kieler.esterel.Function
import de.cau.cs.kieler.esterel.Halt
import de.cau.cs.kieler.esterel.LocalSignalDeclaration
import de.cau.cs.kieler.esterel.LocalVariableDeclaration
import de.cau.cs.kieler.esterel.Loop
import de.cau.cs.kieler.esterel.Nothing
import de.cau.cs.kieler.esterel.ProcedureCall
import de.cau.cs.kieler.esterel.Repeat
import de.cau.cs.kieler.esterel.Run
import de.cau.cs.kieler.esterel.Set
import de.cau.cs.kieler.esterel.Suspend
import de.cau.cs.kieler.esterel.Sustain
import de.cau.cs.kieler.esterel.UnEmit

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
    
    def activateSpecificProcessor(EObject obj) {
        switch (obj) {
            Abort : return ABORT
            Await : return AWAIT
            Block : return BLOCK
            Do : return DO
            Emit : return EMIT
            EsterelParallel : return PARALLEL
            EveryDo : return EVERYDO
//            Exec : return EXEC
            Function : return FUNCTION
            Halt : return HALT
            IfTest : return IFTEST
            LocalSignalDeclaration : return LOCALSIGNAL
            LocalVariableDeclaration : return LOCALVARIABLE
            Loop : return LOOP
            Nothing : return NOTHING
            Present : return PRESENT
            ProcedureCall : return PROCCALL
            Repeat : return REPEAT
            Run : return RUN
            Set : return SET
            Suspend : return SUSPEND
            Sustain : return SUSTAIN
            Trap : return TRAP
            UnEmit : return UNEMIT
            
        }
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
                    val statements = parent.statements
                    pos = statements.indexOf(obj)
                    if (pos+1 < statements.length) {
                        obj = statements.get(pos+1)
                        up = false
                    }
                    else {
                        if (parent.^else !== null) {
                            obj = parent.^else.statements.head
                            up = false
                        }
                        else {
                            obj = parent
                            up = true
                        }
                    }
                }
                else if (parent instanceof ElseScope) {
                    val statements = parent.statements
                    pos = statements.indexOf(obj)
                    if (pos+1 < statements.length) {
                        obj = statements.get(pos+1)
                        up = false
                    }
                    else {
                        obj = parent.eContainer
                        up = true //TODO transform statement
                    }
                }
                
                // TODO statement in elseScope is in statementcontainer, next step in loop: obj = elsescope
                // leads to problem at the moment, find similar cases
                    
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
    
    public static val ABORT = de.cau.cs.kieler.esterel.processors.transformators.incremental.AbortTransformation.ID
    public static val AWAIT = de.cau.cs.kieler.esterel.processors.transformators.incremental.AwaitTransformation.ID
    public static val BLOCK = de.cau.cs.kieler.esterel.processors.transformators.incremental.BlockTransformation.ID
    public static val CONSTANT = de.cau.cs.kieler.esterel.processors.transformators.incremental.ConstantTransformation.ID
    public static val DO = de.cau.cs.kieler.esterel.processors.transformators.incremental.DoTransformation.ID
    public static val EMIT = de.cau.cs.kieler.esterel.processors.transformators.incremental.EmitTransformation.ID
    public static val PARALLEL = de.cau.cs.kieler.esterel.processors.transformators.incremental.EsterelParallelTransformation.ID
    public static val EVERYDO = de.cau.cs.kieler.esterel.processors.transformators.incremental.EveryDoTransformation.ID
//    public static val EXEC = de.cau.cs.kieler.esterel.processors.transformators.incremental.ExecTransformation.ID
    public static val FUNCTION = de.cau.cs.kieler.esterel.processors.transformators.incremental.FunctionTransformation.ID
    public static val HALT = de.cau.cs.kieler.esterel.processors.transformators.incremental.HaltTransformation.ID
    public static val IFTEST = de.cau.cs.kieler.esterel.processors.transformators.incremental.IfTestTransformation.ID
    public static val LOCALSIGNAL = de.cau.cs.kieler.esterel.processors.transformators.incremental.LocalSignalDeclTransformation.ID
    public static val LOCALVARIABLE = de.cau.cs.kieler.esterel.processors.transformators.incremental.LocalVariableTransformation.ID
    public static val LOOP = de.cau.cs.kieler.esterel.processors.transformators.incremental.LoopTransformation.ID
    public static val NOTHING = de.cau.cs.kieler.esterel.processors.transformators.incremental.NothingTransformation.ID
    public static val PRESENT = de.cau.cs.kieler.esterel.processors.transformators.incremental.PresentTransformation.ID
    public static val PROCCALL = de.cau.cs.kieler.esterel.processors.transformators.incremental.ProcCallTransformation.ID
    public static val REPEAT = de.cau.cs.kieler.esterel.processors.transformators.incremental.RepeatTransformation.ID
    public static val RUN = de.cau.cs.kieler.esterel.processors.transformators.incremental.RunTransformation.ID
    public static val SENSOR = de.cau.cs.kieler.esterel.processors.transformators.incremental.SensorTransformation.ID
    public static val SET = de.cau.cs.kieler.esterel.processors.transformators.incremental.SetTransformation.ID
    public static val SIGNAL = de.cau.cs.kieler.esterel.processors.transformators.incremental.SignalTransformation.ID
    public static val SUSPEND = de.cau.cs.kieler.esterel.processors.transformators.incremental.SuspendTransformation.ID
    public static val SUSTAIN = de.cau.cs.kieler.esterel.processors.transformators.incremental.SustainTransformation.ID
    public static val TRAP = de.cau.cs.kieler.esterel.processors.transformators.incremental.TrapTransformation.ID
    public static val UNEMIT  = de.cau.cs.kieler.esterel.processors.transformators.incremental.UnEmitTransformation.ID
    
    
}