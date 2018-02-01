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
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Present
import de.cau.cs.kieler.esterel.Case
import de.cau.cs.kieler.esterel.PresentCase
import de.cau.cs.kieler.esterel.IfTest
import de.cau.cs.kieler.esterel.ElsIf
import de.cau.cs.kieler.esterel.TrapHandler
import de.cau.cs.kieler.esterel.Abort
import de.cau.cs.kieler.esterel.ExecCase
import de.cau.cs.kieler.esterel.Do
import de.cau.cs.kieler.esterel.Trap
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
import de.cau.cs.kieler.esterel.Exec
import de.cau.cs.kieler.esterel.Exit
import de.cau.cs.kieler.scl.ElseScope
import de.cau.cs.kieler.scl.Module
import de.cau.cs.kieler.scl.Thread
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.StatementContainer
import de.cau.cs.kieler.scl.Label
import de.cau.cs.kieler.scl.Goto
import de.cau.cs.kieler.scl.ModuleCall
import de.cau.cs.kieler.scl.Assignment
import de.cau.cs.kieler.scl.Parallel
import de.cau.cs.kieler.scl.Pause
import de.cau.cs.kieler.scl.ScopeStatement
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kicool.compilation.EObjectReferencePropertyData
import de.cau.cs.kieler.esterel.EsterelThread

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
        return "Intermediate"
    }

    public static var IProperty<EObjectReferencePropertyData> NEXT_STATEMENT_TO_TRANSFORM = 
        new Property<EObjectReferencePropertyData>("de.cau.cs.kieler.esterel.processors.scestintermediateprocessor.nextstatementtotransform", null)
        
    public static var IProperty<Boolean> TRANSFORM_THIS_STATEMENT = 
        new Property<Boolean>("de.cau.cs.kieler.esterel.processors.scestintermediateprocessor.transformthisstatement", false)

    public static var IProperty<Boolean> DYNAMIC_COMPILATION = 
        new Property<Boolean>("de.cau.cs.kieler.esterel.processors.scestintermediateprocessor.dynamiccompilation", true)

    public static var IProperty<Boolean> APPEND_PROCESSORS = 
        new Property<Boolean>("de.cau.cs.kieler.esterel.processors.scestintermediateprocessor.append", false)        
    
    @Inject
    extension EsterelTransformationExtensions
    
    override process() {
        var EObject obj
        val processorsToAdd = <String>newLinkedList
        if (environment.getProperty(NEXT_STATEMENT_TO_TRANSFORM) === null) {
            obj = model
            processorsToAdd += INIT
            processorsToAdd += RUN
            processorsToAdd += ID
            environment.setProperty(NEXT_STATEMENT_TO_TRANSFORM, new EObjectReferencePropertyData(model))
        } else {
            obj = environment.getProperty(NEXT_STATEMENT_TO_TRANSFORM).getObject as EObject
        
            // the next object which needs to be transformed and the corresponding processor id
            val nextObj = obj.nextStatement 
            if (nextObj === null) {
                throw new Exception("The next statement to transform can not be null!")
            }
            val processorID = nextObj.getCorrespondingProcessorID 
            environment.setProperty(NEXT_STATEMENT_TO_TRANSFORM, new EObjectReferencePropertyData(nextObj))
            if (nextObj instanceof Module) {
                processorsToAdd += SENSOR
                processorsToAdd += CONSTANT
                processorsToAdd += SIGNAL
            }
            else {
                processorsToAdd += processorID
            }
            // as long as there are Esterel statements, add intermediate processor to the end of the compilation chain
            if (!(nextObj instanceof EsterelProgram)) {
                processorsToAdd += ID
            }
        }
        
        // Add new processors
        if (environment.getProperty(APPEND_PROCESSORS)) {
            compilationContext.addProcessorEntries(this, processorsToAdd)
        } else { // Add to the end of the system
            for (pid : processorsToAdd) {
                compilationContext.addProcessorEntry(pid)
            }
        }
        
    }
    
    def getCorrespondingProcessorID(EObject obj) {
        switch (obj) {
            Abort : return ABORT
            Await : return AWAIT
            Block : return BLOCK
            Do : return DO
            Emit : return EMIT
            EsterelParallel : return PARALLEL
            EsterelProgram : return SCL
            EveryDo : return EVERYDO
            Exec : return EXEC
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
        var transform = false
        // Do, EveryDo and Loop transformation create Esterel statements which need to be transformed.
        // This can be done directly (there is no need to find the next statement to transform).
        if (environment.getProperty(TRANSFORM_THIS_STATEMENT)) {
            environment.setProperty(TRANSFORM_THIS_STATEMENT, false)
            return obj
        }
        // at the beginning start with going down in the tree
        if (obj instanceof EsterelProgram) {
            up = false
        }
        while (!transform) {
            
            /* 
             * #########################################################################
             * ###                         GO UP IN TREE                             ###
             * #########################################################################
             * 
             */
            if (up) {
                var list = obj.containingList
                if (list === null) {
                    throw new Exception("IntermediateProcessor: Found an object which"
                                        + " is not contained by a list."
                                        + "\nThis should not have happened!"
                    )
                }
                var pos = list.indexOf(obj)
                var parent = obj.eContainer
                if (pos+1 < list.length) {
                    obj = list.get(pos+1)
                    up = false
                }
                else if (parent instanceof Thread) {
                    val threads = (parent as Thread).containingList
                    pos = threads.indexOf(parent)
                    if (pos+1 < threads.length) {
                        obj = threads.get(pos+1)
                        up = false
                    }
                    else {
                        obj = parent.eContainer
                        switch (obj) {
                            EsterelParallel : transform = true
                            Parallel : up = true
                        }
                    }
                }
                else if (parent instanceof Present) {
                    // obj can be in 'statements', 'cases' or 'elseStatements'
                    var statements = parent.statements
                    if ( ( statements.contains(obj) || parent.cases.contains(obj) )
                         && !parent.elseStatements.empty
                    ) {
                        obj = parent.elseStatements.head
                        up = false
                    }
                    else { // obj is last statement in elseStatements or elseStatements is empty
                        obj = parent
                        transform = true
                    }
                }
                else if (parent instanceof IfTest) {
                    var statements = parent.statements
                    // obj can be last in 'statements', 'elseIf' or 'elseStatements'
                    if (statements.contains(obj)) {
                        if (!parent.elseif.empty) {
                            obj = parent.elseif.head
                            up = false
                        }
                        else if (!parent.elseStatements.empty) {
                            obj = parent.elseStatements.head
                            up = false
                        }
                        else {
                            obj = parent
                            transform = true
                        }
                    }
                    else if (parent.elseif.contains(obj)) {
                        if (!parent.elseStatements.empty) {
                            obj = parent.elseStatements.head
                            up = false
                        }
                        else {
                            obj = parent
                            transform = true
                        }
                    }
                    else { // obj is last in elseStatements
                        obj = parent
                        transform = true
                    }
                }
                else if (parent instanceof Trap) {
                    if ( parent.statements.contains(obj) && !parent.trapHandler.empty ) {
                        obj = parent.trapHandler.head
                        up = false
                    }
                    else {
                        obj = parent
                        transform = true
                    }
                }
                else if (parent instanceof Abort) {
                    var statements = parent.statements
                    if (statements.contains(obj)) {
                        if (!parent.doStatements.empty){
                            obj = parent.doStatements.head
                            up = false
                        }
                        else if (!parent.cases.empty) {
                            obj = parent.cases.head
                            up = false
                        }
                        else {
                            obj = parent
                            transform = true
                        }
                    }
                    else { // obj must be last in doStatements or the last case
                        obj = parent
                        transform = true
                    }
                    
                }
                else if (parent instanceof Case || parent instanceof ExecCase || parent instanceof ElsIf
                    || parent instanceof TrapHandler || parent instanceof PresentCase
                ) {
                    obj = parent
                }
                else if (parent instanceof Do) {
                    // statements and watchingStatements
                    var statements = parent.statements
                    if (statements.contains(obj) && !parent.watchingStatements.empty) {
                        obj = parent.watchingStatements.head
                        up = false
                    }
                    else { // obj last in watchingStatements or watchingStatements are empty
                            obj = parent
                            transform = true
                    }
                }
                else if (parent instanceof Conditional) {
                    if (parent.statements.contains(obj) && parent.^else instanceof ElseScope) {
                        obj = parent.^else
                        up = false
                    }
                    else {
                        obj = parent
                        transform = true
                    }
                }
                else if (parent instanceof ElseScope) {
                    obj = parent.eContainer
                    transform = true
                }
                else if (parent instanceof Module) {
                    obj = parent
                    transform = true
                }
                else if (parent instanceof StatementContainer) {
                    obj = parent
                    if (parent instanceof ScopeStatement) {
                        up = true // no need to transform an SCL StatementContainer
                    }
                    else {
                        transform = true
                    }
                }
                else if (parent instanceof EsterelProgram) {
                    obj = parent
                    transform = true
                }
                else {
                    throw new Exception("IntermediateProcessor: This point should never be reached.")
                }
            }
            
            /* 
             * #########################################################################
             * ###                       GO DOWN IN TREE                             ###
             * #########################################################################
             * 
             */
            else { // "up = false"
                switch (obj) {
                    Parallel : { 
                        /* do not transform the Parallel statement since it's already an scl statement */
                        if (!obj.threads.empty) {
                            obj = obj.threads.head
                        }
                        else {
                            up = true
                        }
                    }
                    ScopeStatement : { 
                        /* do not transform the ScopeStatement statement since it's already an scl statement */
                        if (!obj.statements.empty) {
                            obj = obj.statements.head
                        }
                        else {
                            up = true
                        }
                    }
                    Present : {
                        var EObject tempObj = obj
                        if (!obj.statements.empty) {
                            tempObj = obj.statements.head
                        }
                        else if (!obj.cases.empty) {
                           tempObj = obj.cases.head
                        }
                        else if (!obj.elseStatements.empty) {
                            tempObj = obj.elseStatements.head
                        }
                        else {
                            transform = true 
                        }
                        obj = tempObj
                    }
                    IfTest : {
                        var EObject tempObj = obj
                        if (!obj.statements.empty) {
                            tempObj = obj.statements.head
                        }
                        else if (!obj.elseif.empty) {
                           tempObj = obj.elseif.head
                        }
                        else if (!obj.elseStatements.empty) {
                            tempObj = obj.elseStatements.head
                        }
                        else {
                            transform = true 
                        }
                        obj = tempObj
                    }
                    Abort : {
                        var EObject tempObj = obj
                        if (!obj.statements.empty) {
                            tempObj = obj.statements.head
                        }
                        else if (!obj.doStatements.empty) {
                           tempObj = obj.doStatements.head
                        }
                        else if (!obj.cases.empty) {
                            tempObj = obj.cases.head
                        }
                        else {
                            transform = true 
                        }
                        obj = tempObj
                    }
                    Await : {
                        var EObject tempObj = obj
                        if (!obj.statements.empty) {
                            tempObj = obj.statements.head
                        }
                        else if (!obj.cases.empty) {
                           tempObj = obj.cases.head
                        }
                        else {
                            transform = true 
                        }
                        obj = tempObj
                    }
                    Trap : {
                        var EObject tempObj = obj
                        if (!obj.statements.empty) {
                            tempObj = obj.statements.head
                        }
                        else if (!obj.trapHandler.empty) {
                           tempObj = obj.trapHandler.head
                        }
                        else {
                            transform = true 
                        }
                        obj = tempObj
                    }
                    Exec : {
                        var EObject tempObj = obj
                        if (!obj.statements.empty) {
                            tempObj = obj.statements.head
                        }
                        else if (!obj.execCaseList.empty) {
                           tempObj = obj.execCaseList.head
                        }
                        else {
                            transform = true 
                        }
                        obj = tempObj
                    }
                    Do : {
                        var EObject tempObj = obj
                        if (!obj.statements.empty) {
                            tempObj = obj.statements.head
                        }
                        else if (!obj.watchingStatements.empty) {
                           tempObj = obj.watchingStatements.head
                        }
                        else {
                            transform = true 
                        }
                        obj = tempObj
                    }
                    Conditional : {
                        var EObject tempObj = obj
                        if (!obj.statements.empty) {
                            tempObj = obj.statements.head
                        }
                        else if (obj.^else !== null) {
                           tempObj = obj.^else
                        }
                        else {
                            up = true 
                        }
                        obj = tempObj
                    }                    
                    StatementContainer : {
                        if (!obj.statements.empty) {
                            obj = obj.statements.head
                        }
                        else {
                            switch (obj) {
                                PresentCase,
                                ElsIf,
                                Case,
                                ExecCase,
                                TrapHandler : {
                                    up = true
                                }
                                EsterelThread,
                                Thread, // empty (esterel)thread should not be possible
                                ElseScope : {
                                    obj = obj.eContainer
                                    transform = true
                                }
                                default : { // empty Block statement
                                    transform = true 
                                }
                            }
                        }
                    }
                    /* The following statements do not have to be transformed. 
                     * Pause, Label, Goto, ModuleCall, Assignment, Exit */
                    Pause,
                    Label,
                    Goto,
                    ModuleCall,
                    Assignment,
                    Exit: {
                        up = true
                    }
                    
                    Run : { // must not be used since all run statements should already been transformed
                        if (obj.module?.module instanceof Module) {
                            obj = obj.module.module
                        }
                    }
                    EsterelProgram : {
                        if (!obj.modules.empty) {
                            obj = obj.modules.head
                        }
                        else {
                            transform = true
                        }
                    }
                    default : {
                        /* if 'obj' is a single statement which needs to be transformed:
                           UnEmit, Set, Nothing, Halt, Emit, Sustain, ProcedureCall */ 
                        transform = true
                    }
                }
            }
        }
        
        return obj
    }
    
    public static val ABORT = de.cau.cs.kieler.esterel.processors.transformators.incremental.AbortTransformation.ID
    public static val AWAIT = de.cau.cs.kieler.esterel.processors.transformators.incremental.AwaitTransformation.ID
    public static val BLOCK = de.cau.cs.kieler.esterel.processors.transformators.incremental.BlockTransformation.ID
    public static val CONSTANT = de.cau.cs.kieler.esterel.processors.transformators.incremental.ConstantTransformation.ID
    public static val DO = de.cau.cs.kieler.esterel.processors.transformators.incremental.DoTransformation.ID
    public static val EMIT = de.cau.cs.kieler.esterel.processors.transformators.incremental.EmitTransformation.ID
    public static val PARALLEL = de.cau.cs.kieler.esterel.processors.transformators.incremental.EsterelParallelTransformation.ID
    public static val EVERYDO = de.cau.cs.kieler.esterel.processors.transformators.incremental.EveryDoTransformation.ID
    public static val EXEC = de.cau.cs.kieler.esterel.processors.transformators.incremental.ExecTransformation.ID
    public static val FUNCTION = de.cau.cs.kieler.esterel.processors.transformators.incremental.FunctionTransformation.ID
    public static val HALT = de.cau.cs.kieler.esterel.processors.transformators.incremental.HaltTransformation.ID
    public static val IFTEST = de.cau.cs.kieler.esterel.processors.transformators.incremental.IfTestTransformation.ID
    public static val INIT = de.cau.cs.kieler.esterel.processors.transformators.incremental.InitializationTransformation.ID
    public static val LOCALSIGNAL = de.cau.cs.kieler.esterel.processors.transformators.incremental.LocalSignalDeclTransformation.ID
    public static val LOCALVARIABLE = de.cau.cs.kieler.esterel.processors.transformators.incremental.LocalVariableTransformation.ID
    public static val LOOP = de.cau.cs.kieler.esterel.processors.transformators.incremental.LoopTransformation.ID
    public static val NOTHING = de.cau.cs.kieler.esterel.processors.transformators.incremental.NothingTransformation.ID
    public static val PRESENT = de.cau.cs.kieler.esterel.processors.transformators.incremental.PresentTransformation.ID
    public static val PROCCALL = de.cau.cs.kieler.esterel.processors.transformators.incremental.ProcCallTransformation.ID
    public static val REPEAT = de.cau.cs.kieler.esterel.processors.transformators.incremental.RepeatTransformation.ID
    public static val RUN = de.cau.cs.kieler.esterel.processors.transformators.incremental.RunTransformation.ID
    public static val SCL = de.cau.cs.kieler.esterel.processors.transformators.incremental.SCLTransformation.ID    
    public static val SENSOR = de.cau.cs.kieler.esterel.processors.transformators.incremental.SensorTransformation.ID
    public static val SET = de.cau.cs.kieler.esterel.processors.transformators.incremental.SetTransformation.ID
    public static val SIGNAL = de.cau.cs.kieler.esterel.processors.transformators.incremental.SignalTransformation.ID
    public static val SUSPEND = de.cau.cs.kieler.esterel.processors.transformators.incremental.SuspendTransformation.ID
    public static val SUSTAIN = de.cau.cs.kieler.esterel.processors.transformators.incremental.SustainTransformation.ID
    public static val TRAP = de.cau.cs.kieler.esterel.processors.transformators.incremental.TrapTransformation.ID
    public static val UNEMIT  = de.cau.cs.kieler.esterel.processors.transformators.incremental.UnEmitTransformation.ID
    
}