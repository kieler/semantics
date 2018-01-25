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
import de.cau.cs.kieler.esterel.Constant
import de.cau.cs.kieler.esterel.ConstantExpression
import de.cau.cs.kieler.esterel.ConstantRenaming
import de.cau.cs.kieler.esterel.Do
import de.cau.cs.kieler.esterel.Emit
import de.cau.cs.kieler.esterel.EsterelFunctionCall
import de.cau.cs.kieler.esterel.EsterelParallel
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Exec
import de.cau.cs.kieler.esterel.Function
import de.cau.cs.kieler.esterel.FunctionRenaming
import de.cau.cs.kieler.esterel.IfTest
import de.cau.cs.kieler.esterel.ModuleRenaming
import de.cau.cs.kieler.esterel.Present
import de.cau.cs.kieler.esterel.Procedure
import de.cau.cs.kieler.esterel.ProcedureRenaming
import de.cau.cs.kieler.esterel.RelationImplication
import de.cau.cs.kieler.esterel.RelationIncompatibility
import de.cau.cs.kieler.esterel.Run
import de.cau.cs.kieler.esterel.Sensor
import de.cau.cs.kieler.esterel.Set
import de.cau.cs.kieler.esterel.Signal
import de.cau.cs.kieler.esterel.SignalRenaming
import de.cau.cs.kieler.esterel.Task
import de.cau.cs.kieler.esterel.TaskRenaming
import de.cau.cs.kieler.esterel.Trap
import de.cau.cs.kieler.esterel.TypeDefinition
import de.cau.cs.kieler.esterel.TypeIdentifier
import de.cau.cs.kieler.esterel.TypeRenaming
import de.cau.cs.kieler.esterel.UnEmit
import de.cau.cs.kieler.esterel.extensions.EsterelExtensions
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.Module
import de.cau.cs.kieler.scl.Parallel
import de.cau.cs.kieler.scl.Statement
import de.cau.cs.kieler.scl.StatementContainer
import java.util.HashMap
import java.util.LinkedList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.esterel.EsterelThread
import de.cau.cs.kieler.esterel.LocalSignalDeclaration
import de.cau.cs.kieler.esterel.Sustain
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author mrb
 *
 */
class RunTransformation extends InplaceProcessor<EsterelProgram> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.run"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Run"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    @Inject
    extension EsterelExtensions
    
    override process() {
//        model.eAllContents.filter(Run).toList.forEach[ r |
//            transformRunStatement(r, r.findParentModule)
//        ]
        transform(model)
    }
    
    def Module findParentModule(Run run) {
        var parent = run.eContainer
        while (!(parent instanceof Module)) {
            parent = parent.eContainer
        }
        parent as Module
    }
        
    // sorted renamings    
    var signalRenamings = new HashMap<Signal, Signal>
    var sensorRenamings = new HashMap<Sensor, Sensor>
    var constantRenamings = new HashMap<Constant, ConstantRenaming>
    var functionRenamings = new HashMap<Function, Function>
    var procedureRenamings = new HashMap<Procedure, Procedure>
    var typeRenamings = new HashMap<TypeDefinition, TypeDefinition>
    var taskRenamings = new HashMap<Task, Task> 
    
    // parent interface declarations
    var parentSignals = new HashMap<String, Signal>
    var parentConstants = new HashMap<String, Constant>
    var parentSensors = new HashMap<String, Sensor>
    
    // references
    var valuedObjectReferences = new LinkedList<ValuedObjectReference>
    var constantExpressions = new LinkedList<ConstantExpression>
    var emits = new LinkedList<Emit>
    var sustains = new LinkedList<Sustain>
    var unemits = new LinkedList<UnEmit>
    var sets = new LinkedList<Set>
    var execs = new LinkedList<Exec>
    var typeIdentifiers = new LinkedList<TypeIdentifier>
    var functionExpressions = new LinkedList<EsterelFunctionCall>
    var signals = new LinkedList<Signal>
    var relationImplications = new LinkedList<RelationImplication>
    var relationIncompatibilities = new LinkedList<RelationIncompatibility>
    
    def EsterelProgram transform(EsterelProgram prog) {
        prog.moveGeneratedModulesToEnd
        for (var i=0; i<prog.modules.length; i++) {
            var m = prog.modules.get(i) as Module
            if (!m.annotations.generatedModule) {
                m.startTransformation
            }
        }
        return prog
    }
    
    /**
     * Move all generated modules to the end of the Module list of a program
     * to avoid problems in "transform(SCEstProgram prog)" when a run 
     * transformation is completed and the used generated modules are deleted 
     * of the Module list.
     * 
     * @param prog The program
     */
    def moveGeneratedModulesToEnd(EsterelProgram prog) {
        var notGeneratedModuleList = new LinkedList<Module>
        for (var i=0; i<prog.modules.length; i++) {
            var m = prog.modules.get(i)
            if (!m.annotations.generatedModule) {
                notGeneratedModuleList.add(m)
                prog.modules.remove(m)
                i--
            }
        }
        prog.modules.addAll(0, notGeneratedModuleList)
    }
    
    /**
     * Start looking for run statements.
     * This method is used on the Module of a ModuleRenaming every time a run statement is found
     * 
     * @param parentModule The closest surrounding module
     */
    def startTransformation(Module parentModule) {
        parentModule.statements.transformStatements(parentModule)
        clearMapsLists
    }
    
    /**
     * Get the interface signals of the surrounding module
     * 
     * @param parentModule The surrounding module
     */
    def void getSignals(Module parentModule) {
        for (signalDecl : parentModule.signalDeclarations) {
            for (signal : signalDecl.signals) {
                parentSignals.put(signal.name, signal)
            }
        }
    }
    
    /**
     * Put surrounding local signals into parentSignals map
     * 
     * @param obj An EObject
     * @param parentModule The surroundingModule
     */
    def void getLocalSignals(EObject obj, Module parentModule) {
        var parent = obj.eContainer
        while ((parent !== null) && !(parent instanceof Module)) {
            if (parent instanceof LocalSignalDeclaration) {
                parent.valuedObjects.filter(Signal).forEach[s |
                    parentSignals.put(s.name, s)
                ]
            }
            parent = parent.eContainer
        }
    }
    
    /**
     * Get the interface sensors of the surrounding module
     * 
     * @param parentModule The surrounding module
     */
    def void getSensors(Module parentModule) {
        for (decl : parentModule.sensorDeclarations) {
            for (swt : decl.sensors) {
                parentSensors.put(swt.name, swt)
            }
        }
    }
    
    /**
     * Get the constants of the surrounding module
     * 
     * @param parentModule The surrounding module
     */
    def void getConstants(Module parentModule) {
        for (decls : parentModule.constantDeclarations) {
            for (constant : decls.constants) {
                parentConstants.put(constant.name, constant)
            }
        }
    }
    
    /**
     * Search for run statements
     * 
     * @param statements The list of statements in which the search takes place
     * @param parentModule The surrounding module
     */
    def EList<Statement> transformStatements(EList<Statement> statements, Module parentModule) {
        for (var i=0; i<statements?.length; i++) {
            statements.get(i).transformStatement(parentModule)
        }
        return statements
    }
    
    /**
     * Find out if a specific statement is a run statement and if it is, transform it.
     * 
     * @param statement A specific statement
     * @param parentModule The surrounding module
     */
    def Statement transformStatement(Statement statement, Module parentModule) {
        if (statement instanceof Run) {
            startTransformation(statement.module.module)
            transformRunStatement(statement, parentModule)
        }
        else if (statement instanceof Present) {
            transformStatements((statement as Present).statements, parentModule)
            (statement as Present).cases?.forEach[ c | transformStatements(c.statements, parentModule)]
            transformStatements((statement as Present).elseStatements, parentModule)
        }
        else if (statement instanceof IfTest) {
            transformStatements((statement as IfTest).statements, parentModule)
            (statement as IfTest).elseif?.forEach [ elsif | transformStatements(elsif.statements, parentModule)]
            transformStatements((statement as IfTest).elseStatements, parentModule)
        }
        else if (statement instanceof EsterelParallel) {
            (statement as EsterelParallel).statements.forEach [ t |
                transformStatements((t as EsterelThread).statements, parentModule)
            ]
        }
        else if (statement instanceof StatementContainer) {
            
            transformStatements((statement as StatementContainer).statements, parentModule)
            
            if (statement instanceof Trap) {
                (statement as Trap).trapHandler?.forEach[h | transformStatements(h.statements, parentModule)]
            }
            else if (statement instanceof Abort) {
                transformStatements((statement as Abort).doStatements, parentModule)
                (statement as Abort).cases?.forEach[ c | transformStatements(c.statements, parentModule)]
            }
            else if (statement instanceof Await) {
                (statement as Await).cases?.forEach[ c | transformStatements(c.statements, parentModule)]
            }
            else if (statement instanceof Exec) {
                (statement as Exec).execCaseList?.forEach[ c | transformStatements(c.statements, parentModule)]
            }
            else if (statement instanceof Do) {
                transformStatements((statement as Do).watchingStatements, parentModule)
            }
            else if (statement instanceof Conditional) {
                transformStatements((statement as Conditional).getElse()?.statements, parentModule)
            }
        }
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads.forEach [ t |
                transformStatements(t.statements, parentModule)
            ]
        }
        return statement
    }
    
    /**
     * Set up a specific run statement transformation and then start transforming
     * 
     * @param run The run statement
     * @param parentModule The surrounding Module
     */
    def transformRunStatement(Run run, Module parentModule) {
        getLocalSignals(run, parentModule)
        parentModule.getSignals
        parentModule.getConstants
        parentModule.getSensors
        var statementList = run.containingList
        var pos = statementList.indexOf(run)
        var runCopy = EcoreUtil.copy(run)
        var scope = createScopeStatement
        var moduleRenaming = runCopy.module
        // give the new scope the modules name or the new name as an annotation
        if (moduleRenaming.newName !== null) {
            scope.annotations.add(createAnnotation(moduleRenaming.newName))
        }
        else {
            scope.annotations.add(createAnnotation(moduleRenaming.module.name))
        }
        
        // sort renamings
        runCopy.initializeRenamingMaps
        
        moduleRenaming.module.filterAllObjectsInModule
        
        // SIGNALS
        moduleRenaming = moduleRenaming.transformSignals
        // CONSTANTS
        moduleRenaming = transformConstants(moduleRenaming, parentModule)
        // SENSORS
        moduleRenaming = transformSensors(moduleRenaming, parentModule)
        // TYPES
        moduleRenaming = transformTypes(moduleRenaming, parentModule)
        // FUNCTIONS
        moduleRenaming = transformFunctions(moduleRenaming, parentModule)
        
        scope.statements.addAll(moduleRenaming.module.statements)
        statementList.set(pos, scope)        
        moduleRenaming.module.remove
        
        // TODO PROCEDURES and TASKS will not be transformed at the moment
    }
    
    /**
     * Clear all maps and lists
     */
    def clearMapsLists() {
        signalRenamings.clear
        sensorRenamings.clear
        constantRenamings.clear
        functionRenamings.clear
        procedureRenamings.clear
        typeRenamings.clear
        taskRenamings.clear
        parentSignals.clear
        parentConstants.clear
        parentSensors.clear
        valuedObjectReferences.clear
        emits.clear
        sustains.clear
        unemits.clear
        sets.clear
        execs.clear
        typeIdentifiers.clear
        functionExpressions.clear
        signals.clear
        relationImplications.clear
        relationIncompatibilities.clear
    }
    
    /**
     * Sort the renamings of a run statement into Maps.
     * 
     * @param runCopy The run statement
     */
    def void initializeRenamingMaps(Run runCopy) {
        if (runCopy.renamings !== null && !runCopy.renamings.empty) {
            for (oneTypeRenaming : runCopy.renamings) {
                for (renaming : oneTypeRenaming.renamings) {
                    switch renaming {
                        SignalRenaming: {
                            if (renaming.oldName.valuedObject instanceof Signal) {
                                signalRenamings.put(renaming.oldName.valuedObject as Signal, renaming.newName.valuedObject as Signal)
                            }
                            else if (renaming.oldName.valuedObject instanceof Sensor) {
                                sensorRenamings.put(renaming.oldName.valuedObject as Sensor, renaming.newName.valuedObject as Sensor)
                            }
                        }
                        ConstantRenaming: {
                            constantRenamings.put(renaming.oldName, renaming)
                        }
                        FunctionRenaming: {
                            functionRenamings.put(renaming.oldName, renaming.newName)
                        }
                        ProcedureRenaming: {
                            procedureRenamings.put(renaming.oldName, renaming.newName)
                        }
                        TypeRenaming: {
                            typeRenamings.put(renaming.oldName, renaming.newName)
                        }
                        TaskRenaming: {
                            taskRenamings.put(renaming.oldName, renaming.newName)
                        }
                    }
                    
                }
            }
        }
    }
    
    /**
     * Check if a signal already exists by a given name and type
     * 
     * @param name The name of the signal
     * @param type The ValueType of the signal
     * @return The signal if found, otherwise null
     */
    def Signal checkIfSignalExistsByNameAndType(String name, ValueType type, String typeID) {
        var correspondingSignal = parentSignals.get(name)
        if (correspondingSignal instanceof Signal) {
            if (type !== null && correspondingSignal.type == type) {
                return correspondingSignal
            }
            else if (typeID !== null && correspondingSignal.idType == typeID) {
                return correspondingSignal
            }
        }
        return null
    }
    
    /**
     * Check if a sensor already exists by a given name and type
     * 
     * @param name The name of the sensor
     * @param type The type of the sensor
     */
    def Sensor checkIfSensorExistsByNameAndType(String name, TypeIdentifier typeIdent) {
        var correspondingSensor = parentSensors.get(name)
        if (correspondingSensor instanceof Sensor) {
            var swt = correspondingSensor.eContainer as Sensor
            if (typeIdent.type !== null && swt.type?.type == typeIdent.type) {
                return correspondingSensor
            }
            else if (typeIdent.idType !== null && swt.type?.idType == typeIdent.idType) {
                return correspondingSensor
            }
            else if (typeIdent.esterelType !== null && swt.type?.esterelType.name == typeIdent.esterelType.name) {
                return correspondingSensor
            }
        }
        return null
    }
    
    /**
     * Filter all EObjects attached to a given EObject
     * 
     * @param obj The given EObject
     */
    def filterAllObjectsInModule(EObject obj) {
        // get everything of the run Module and filter it
        // so every reference to old objects can be transformed
        var everything = obj.eAllContents.toList
        for (o : everything) {
            switch o {
                ValuedObjectReference: {
                    valuedObjectReferences.add(o)
                }
                ConstantExpression: {
                    constantExpressions.add(o)
                }
                Emit: {
                    emits.add(o)
                }
                Sustain: {
                    sustains.add(o)
                }
                UnEmit: {
                    unemits.add(o)
                }
                Set: {
                    sets.add(o)
                }
                Exec: {
                    execs.add(o)
                }
                TypeIdentifier: {
                    typeIdentifiers.add(o)
                }
                EsterelFunctionCall: {
                    functionExpressions.add(o)
                }
                Signal: {
                    signals.add(o)
                }
                RelationImplication: {
                    relationImplications.add(o)
                }
                RelationIncompatibility: {
                    relationIncompatibilities.add(o)
                }
            }
        }
    }
    
    /**
     * Transform all renamings for the signals and all references from the old to the new signals
     * 
     * @param moduleRenaming ModuleRenaming of a run statement
     */
    def ModuleRenaming transformSignals(ModuleRenaming moduleRenaming) {
        for (signalDecl : moduleRenaming.module.signalDeclarations) {
            for (signal : signalDecl.signals) {
                var Signal relatedSignal
                // if the signal is in the renaming list, rename signal
                if (signalRenamings.containsKey(signal)) {
                    relatedSignal = signalRenamings.get(signal)
                }
                else {
                    relatedSignal = checkIfSignalExistsByNameAndType(signal.name, signal.type, signal.idType)
                }
                if (relatedSignal instanceof Signal) {
                    if (relatedSignal.name.equals("tick")) {
                        tickTransformation(signal, relatedSignal)
                    }
                    else {
                        // transform all references
                        for (voRef : valuedObjectReferences) {
                            if (voRef.valuedObject == signal) {
                                voRef.valuedObject = relatedSignal
                            }
                        }
                        for (emit : emits) {
                            if (emit.signal == signal) {
                                emit.signal = relatedSignal
                            }
                        }
                        for (sustain : sustains) {
                            if (sustain.signal == signal) {
                                sustain.signal = relatedSignal
                            }
                        }
                        for (unemit : unemits) {
                            if (unemit.signal == signal) {
                                unemit.signal = relatedSignal
                            }
                        }
                        for (set : sets) {
                            if (set.signal == signal) {
                                set.signal = relatedSignal
                            }
                        }
                        for (exec : execs) {
                            if (exec.returnSignal == signal) {
                                exec.returnSignal = relatedSignal
                            }
                        }
                        for (ri : relationImplications) {
                            if (ri.first == signal) {
                                ri.first = relatedSignal
                            }
                            if (ri.second == signal) {
                                ri.second = relatedSignal
                            }
                        }
                        for (ri : relationIncompatibilities) {
                            for (var i=0; i<ri.incomp.length; i++) {
                                if (ri.incomp.get(i) == signal) {
                                    ri.incomp.set(i, relatedSignal)
                                }
                            }
                        }
                    }
                }
                else {
                    throw new UnsupportedOperationException("There is no corresponding signal in the parent Module for " + signal.name + "!")
                }
            }
        }
        return moduleRenaming
    }
    
    /**
     * Special case: old signal will be renamed to "tick"
     */
    def tickTransformation(Signal signal, Signal relatedSignal) {
        val tickRef = relatedSignal.createTickReference
        if (relatedSignal instanceof Signal) {
            for (voRef : valuedObjectReferences) {
                if (voRef.valuedObject == signal) {
                    voRef.replace(tickRef)
                }
            }
            for (emit : emits) {
                if (emit.signal == signal) {
                    emit.remove
                }
            }
            for (sustain : sustains) {
                if (sustain.signal == signal) {
                    sustain.signal = relatedSignal // TODO 
                }
            }
            for (unemit : unemits) {
                if (unemit.signal == signal) {
                    unemit.remove
                }
            }
            for (set : sets) {
                if (set.signal == signal) {
                    set.remove
                }
            }
            for (exec : execs) {
                if (exec.returnSignal == signal) {
                    exec.returnSignal = relatedSignal
                }
            }
            for (ri : relationImplications) {
                if (ri.first == signal) {
                    ri.first = relatedSignal
                }
                if (ri.second == signal) {
                    ri.second = relatedSignal
                }
            }
            for (ri : relationIncompatibilities) {
                for (var i=0; i<ri.incomp.length; i++) {
                    if (ri.incomp.get(i) == signal) {
                        ri.incomp.set(i, relatedSignal)
                    }
                }
            }
        }
        else {
            throw new UnsupportedOperationException("There is no corresponding signal in the parent Module for " + signal.name + "!")
        }
    }
    
    /**
     * Transform all renamings for the constants and all references from the old to the new constants
     * 
     * @param moduleRenaming ModuleRenaming of a run statement
     * @param parentModule The parent Module where the constants will be copied to
     */
    def ModuleRenaming transformConstants(ModuleRenaming moduleRenaming, Module parentModule) {
        for (decl : moduleRenaming.module.constantDeclarations) {
                for (var i=0; i<decl.constants.length; i++) {
                    val constant = decl.constants.get(i)
                    var updateReferences = true
                    var ConstantRenaming relatedConstantRenaming
                    if (constantRenamings.containsKey(constant)) {
                        relatedConstantRenaming = constantRenamings.get(constant)
                        if (relatedConstantRenaming.newName !== null) {
                            updateReferences = true
                        }
                        else {
                            constant.initialValue = relatedConstantRenaming.newValue
                            updateReferences = false
                        }
                    }
                    else {
                        updateReferences = false
                    }
                    if (updateReferences) {
                        for (expr : constantExpressions) {
                            if (expr.constant == constant) {
                                expr.constant = relatedConstantRenaming.newName
                            }
                        }
                    }
                    else {
                        constant.name = createNewUniqueConstantName(constant.name)
                        parentModule.declarations.add(createConstantDecl(constant, constant.type))
                        i-- // because the old constant of "decl.sensors"
                    }
                    
                }
        }
        return moduleRenaming
    }
    
    /**
     * Transform all references from the old to the new sensor or just copy sensor to parent module
     * 
     * @param moduleRenaming ModuleRenaming of a run statement
     * @param parentModule The parent Module where the sensors will be copied to
     */
    def transformSensors(ModuleRenaming moduleRenaming, Module parentModule) {
        for (decl : moduleRenaming.module.sensorDeclarations) {
            for (var i=0; i<decl.valuedObjects.size; i++) {
                val sensorWType = decl.valuedObjects.get(i) as Sensor
                var Sensor relatedSensor
                // if the sensor is in the renaming list, rename sensor
                if (sensorRenamings.containsKey(sensorWType)) {
                    relatedSensor = sensorRenamings.get(sensorWType)
                }
                else {
                    relatedSensor = checkIfSensorExistsByNameAndType(sensorWType.name, sensorWType.type)
                }
                if (relatedSensor instanceof Sensor) {
                    for (voRef : valuedObjectReferences) {
                        if (voRef.valuedObject == sensorWType) {
                            voRef.valuedObject = relatedSensor
                        }
                    }
                }
                else {
                    sensorWType.name = sensorWType.name.createNewUniqueSensorName
                    parentModule.declarations.add(createSensorDecl(sensorWType))
                    i-- // because the old sensor with type was removed of "decl.sensors"
                }
            }
        }
        return moduleRenaming
    }
    
    /**
     * Transform all references from the old to the new types or just copy types to parent module
     * 
     * @param moduleRenaming ModuleRenaming of a run statement
     * @param parentModule The parent Module where the types will be copied to
     */
    def transformTypes(ModuleRenaming moduleRenaming, Module parentModule) {
        for (decl : moduleRenaming.module.typeDeclarations) {
            for (var i=0; i<decl.types.length; i++) {
                var oldType = decl.types.get(i)
                var type = checkIfTypeExistsByName(oldType.name, parentModule)
                if (type instanceof TypeDefinition) {
                    for (typeIdent : typeIdentifiers) {
                        if (typeIdent.esterelType !== null) {
                            if (typeIdent.esterelType == oldType) {
                                typeIdent.esterelType = type
                            }
                        }
                    }
                } 
                else {
                    parentModule.declarations += createTypeDecl(oldType)
                    i-- // because the old type was removed of "decl.types"
                }
            }
        }
        
        return moduleRenaming
    }
    
    /**
     * Checks if a given type exists in the parent module
     * 
     * @param name The name of the type
     * @param parentModule The parent module
     */
    def checkIfTypeExistsByName(String name, Module parentModule) {
        for (decl : parentModule.typeDeclarations) {
            for (t : decl.types) {
                if (t.name.equals(name)) {
                    return t
                }
            }
        }
        return null
    }
    
    /**
     * Transform all references from the old to the new functions or just copy functions to parent module
     * 
     * @param moduleRenaming ModuleRenaming of a run statement
     * @param parentModule The parent Module where the functions will be copied to
     */
    def transformFunctions(ModuleRenaming moduleRenaming, Module parentModule) {
        for (decl : moduleRenaming.module.functionDeclarations) {
            for (var i=0; i<decl.functions.length; i++) {
                var oldFunction = decl.functions.get(i)
                var function = checkIfFunctionExists(oldFunction, parentModule)
                if (function instanceof Function) {
                    for (expr : functionExpressions) {
                        if (expr.function == oldFunction) {
                            expr.function = function
                        }
                    }
                    for (signal : signals) {
                        if (signal.combineFunction == oldFunction) {
                            signal.combineFunction = function
                        }
                    }
                    
                }
                else {
                    parentModule.declarations += createFunctionDecl(oldFunction)
                    i-- // because the old function was removed of "decl.functions"
                }
            }
        }
        return moduleRenaming
    }
    
    /**
     * Checks if a given function exists in the parent module
     * 
     * @param oldFunction The old function
     * @param parentModule The parent module
     */
    def checkIfFunctionExists(Function oldFunction, Module parentModule) {
        for (decl : parentModule.functionDeclarations) {
            for (f : decl.functions) {
                if (f.name.equals(oldFunction.name)) {
                    var same = true
                    for (var i=0; i<f.parameterTypes.length; i++) {
                        var typeIdent = f.parameterTypes.get(i)
                        if (i<oldFunction.parameterTypes.length) {
                            var oldTypeIdent = oldFunction.parameterTypes.get(i)
                            // if one of type, typeID or estType is equal, "same" stays true
                            if (!(     (typeIdent.type !== null && oldTypeIdent.type == typeIdent.type)
                                    || (typeIdent.idType !== null && oldTypeIdent.idType == typeIdent.idType)
                                    || (typeIdent.esterelType !== null && oldTypeIdent.esterelType.name == typeIdent.esterelType.name) 
                               )) {
                                same =  false
                            }
                            
                        }
                        else {
                            same = false 
                        }
                    }
                    if (same) {
                        return f
                    }
                }
            }
        }
        return null
    }
    
}