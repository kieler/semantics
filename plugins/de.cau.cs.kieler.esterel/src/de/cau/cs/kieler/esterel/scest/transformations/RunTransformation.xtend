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

import de.cau.cs.kieler.esterel.scest.features.SCEstFeature
import de.cau.cs.kieler.esterel.scest.scest.SCEstProgram
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.esterel.scest.extensions.SCEstExtension
import de.cau.cs.kieler.esterel.esterel.Run
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cau.cs.kieler.esterel.esterel.ISignal
import de.cau.cs.kieler.esterel.esterel.SignalRenaming
import de.cau.cs.kieler.esterel.esterel.ConstantRenaming
import java.util.HashMap
import java.util.LinkedList
import de.cau.cs.kieler.esterel.esterel.Emit
import de.cau.cs.kieler.esterel.esterel.Exec
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.esterel.scest.scest.UnEmit
import de.cau.cs.kieler.esterel.scest.scest.Set
import de.cau.cs.kieler.esterel.esterel.ModuleRenaming
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.esterel.esterel.ConstantExpression
import de.cau.cs.kieler.esterel.esterel.Constant
import de.cau.cs.kieler.esterel.esterel.Module
import de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecls
import de.cau.cs.kieler.esterel.esterel.SensorWithType
import de.cau.cs.kieler.esterel.esterel.Type
import de.cau.cs.kieler.esterel.esterel.TypeIdentifier
import de.cau.cs.kieler.esterel.esterel.Function
import de.cau.cs.kieler.esterel.esterel.Procedure
import de.cau.cs.kieler.esterel.esterel.Task
import de.cau.cs.kieler.esterel.esterel.FunctionRenaming
import de.cau.cs.kieler.esterel.esterel.ProcedureRenaming
import de.cau.cs.kieler.esterel.esterel.TypeRenaming
import de.cau.cs.kieler.esterel.esterel.TaskRenaming
import de.cau.cs.kieler.esterel.esterel.EsterelType
import de.cau.cs.kieler.esterel.esterel.FunctionExpression
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.StatementContainer
import de.cau.cs.kieler.esterel.esterel.Trap
import de.cau.cs.kieler.esterel.esterel.Abort
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.Do
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.IfTest
import de.cau.cs.kieler.esterel.esterel.EsterelParallel
import de.cau.cs.kieler.scl.scl.Parallel


/**
 * @author mrb
 *
 */
class RunTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::RUN_ID
    }

    override getName() {
        return SCEstTransformation::RUN_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::RUN_ID
    }
        
    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID)
    }
    
    @Inject
    extension SCEstExtension
        
    var signalRenamings = new HashMap<ISignal, ISignal>
    var constantRenamings = new HashMap<Constant, ConstantRenaming>
    var functionRenamings = new HashMap<Function, Function>
    var procedureRenamings = new HashMap<Procedure, Procedure>
    var typeRenamings = new HashMap<Type, Type>
    var taskRenamings = new HashMap<Task, Task> 
    var parentSignals = new HashMap<String, ISignal>
    var parentConstants = new HashMap<String, Constant>
    var parentSensors = new HashMap<String, ISignal>
    var valuedObjectReferences = new LinkedList<ValuedObjectReference>
    var constantExpressions = new LinkedList<ConstantExpression>
    var emits = new LinkedList<Emit>
    var unemits = new LinkedList<UnEmit>
    var sets = new LinkedList<Set>
    var execs = new LinkedList<Exec>
    var typeIdentifiers = new LinkedList<TypeIdentifier>
    var functionExpressions = new LinkedList<FunctionExpression>
    var signals = new LinkedList<ISignal>
    
    def SCEstProgram transform(SCEstProgram prog) {
        for (var i=0; i<prog.modules.length; i++) {
            var m = prog.modules.get(i)
            if (!m.annotations.generatedModule) {
                m.getSignals
                m.getConstants
                m.statements.transformStatements(m)
                clearMapsLists
            }
        }
        return prog
    }
    
    def void getSignals(Module parentModule) {
        for (signalDecl : parentModule.intSignalDecls) {
            for (signal : signalDecl.signals) {
                parentSignals.put(signal.name, signal)
            }
        }
    }
    
    def void getConstants(Module parentModule) {
        for (decls : parentModule.intConstantDecls) {
            for (oneTypeDecl : decls.constants) {
                for (constant : oneTypeDecl.constants) {
                    parentConstants.put(constant.name, constant)
                }
            }
        }
    }
    
    def EList<Statement> transformStatements(EList<Statement> statements, Module parentModule) {
        for (var i=0; i<statements.length; i++) {
            statements.get(i).transformStatement(parentModule)
        }
        return statements
    }
    
    def Statement transformStatement(Statement statement, Module parentModule) {
        if (statement instanceof Run) {
            statement.module.module.statements.transformStatements(parentModule)
            transformRunStatement(statement, parentModule)
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
        else if (statement instanceof Present) {
            transformStatements((statement as Present).thenStatements, parentModule)
            (statement as Present).cases?.forEach[ c | transformStatements(c.statements, parentModule)]
            transformStatements((statement as Present).elseStatements, parentModule)
        }
        else if (statement instanceof IfTest) {
            transformStatements((statement as IfTest).thenStatements, parentModule)
            (statement as IfTest).elseif?.forEach [ elsif | transformStatements(elsif.thenStatements, parentModule)]
            transformStatements((statement as IfTest).elseStatements, parentModule)
        }
        else if (statement instanceof EsterelParallel) {
            (statement as EsterelParallel).threads.forEach [ t |
                transformStatements(t.statements, parentModule)
            ]
        }
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads.forEach [ t |
                transformStatements(t.statements, parentModule)
            ]
        }
        return statement
    }
    
    def transformRunStatement(Run run, Module parentModule) {
        var statementList = run.containingList
        var pos = statementList.indexOf(run)
        var runCopy = EcoreUtil.copy(run)
        var scope = createScopeStatement(null)
        var moduleRenaming = runCopy.module
        // give the new scope the modules name or the new name as an annotation
        if (moduleRenaming.newName != null) {
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
        
        scope.statements.add(moduleRenaming.module.statements)
        statementList.set(pos, scope)        
        var moduleContainingList = moduleRenaming.module.getContainingList
        moduleContainingList.remove(moduleRenaming.module)
        
        // TODO 
        // PROCEDURES and TASKS will not be transformed at the moment
        // and Functions only check their ValueTypes
        
            
    }
    
    def clearMapsLists() {
        signalRenamings.clear
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
        unemits.clear
        sets.clear
        execs.clear
        typeIdentifiers.clear
        functionExpressions.clear
        signals.clear
    }
    
    /**
     * Sort the renamings of a run statement into Maps.
     * 
     * @param runCopy The run statement
     */
    def void initializeRenamingMaps(Run runCopy) {
        if (runCopy.list != null && !runCopy.list.empty) {
            for (oneTypeRenaming : runCopy.list) {
                for (renaming : oneTypeRenaming.renamings) {
                    switch renaming {
                        SignalRenaming: {
                            signalRenamings.put(renaming.oldName, renaming.newName)
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
    def ISignal checkIfSignalExistsByNameAndType(String name, ValueType type) {
        var correspondingSignal = parentSignals.get(name)
        if (correspondingSignal instanceof ISignal) {
            if (correspondingSignal.type == type) {
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
    def ISignal checkIfSensorExistsByNameAndType(String name, ValueType type) {
        var correspondingSensor = parentConstants.get(name)
        if (correspondingSensor instanceof ISignal) {
            if ((correspondingSensor.eContainer as SensorWithType).type?.type == type) {
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
        // get everything of the run module and filter it
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
                FunctionExpression: {
                    functionExpressions.add(o)
                }
                ISignal: {
                    signals.add(o)
                }
                // TODO Relation-Implication/-Incompatibility for ISignal reference
            }
        }
    }
    
    /**
     * Transform all renamings for the signals and all references from the old to the new signals
     * 
     * @param moduleRenaming ModuleRenaming of a run statement
     */
    def ModuleRenaming transformSignals(ModuleRenaming moduleRenaming) {
        for (signalDecl : moduleRenaming.module.intSignalDecls) {
            for (signal : signalDecl.signals) {
                var ISignal relatedSignal
                // if the signal is in the renaming list, rename signal
                if (signalRenamings.containsKey(signal)) {
                    relatedSignal = signalRenamings.get(signal)
                }
                else {
                    // TODO check is just for 'type' not for 'typeID'
                    relatedSignal = checkIfSignalExistsByNameAndType(signal.name, signal.type)
                }
                // transform all references
                if (relatedSignal instanceof ISignal) {
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
                        if (exec.retSignal == signal) {
                            exec.retSignal = relatedSignal
                        }
                    }
                }
                else {
                    throw new UnsupportedOperationException("There is no corresponding signal in the parent module for " + signal.name + "!")
                }
            }
        }
        return moduleRenaming
    }
    
    /**
     * Transform all renamings for the constants and all references from the old to the new constants
     * 
     * @param moduleRenaming ModuleRenaming of a run statement
     * @param parentModule The parent module where the constants will be copied to
     */
    def ModuleRenaming transformConstants(ModuleRenaming moduleRenaming, Module parentModule) {
        for (decl : moduleRenaming.module.intConstantDecls) {
            for (oneTypeConstants : decl.constants) {
                for (var i=0; i<oneTypeConstants.constants.length; i++) {
                    var constant = oneTypeConstants.constants.get(i)
                    var updateReferences = true
                    var ConstantRenaming relatedConstantRenaming
                    if (constantRenamings.containsKey(constant)) {
                        relatedConstantRenaming = constantRenamings.get(constant)
                        if (relatedConstantRenaming.newName != null) {
                            updateReferences = true
                        }
                        else {
                            constant.value = relatedConstantRenaming.newValue
                            updateReferences = false
                        }
                    }
                    else {
                        updateReferences = false
                    }
                    if (updateReferences) {
                        for (voRef : valuedObjectReferences) {
                            if (voRef.valuedObject == constant) {
                                voRef.valuedObject = relatedConstantRenaming.newName
                            }
                        }
                        for (expr : constantExpressions) {
                            if (expr.constant == constant) {
                                expr.constant = relatedConstantRenaming.newName
                            }
                        }
                    }
                    else {
                        constant.name = createNewUniqueConstantName(constant.name)
                        parentModule.intConstantDecls.add(createConstantDecl(constant, (constant.eContainer as OneTypeConstantDecls).type))
                    }
                    
                }
            }
        }
        return moduleRenaming
    }
    
    /**
     * Transform all references from the old to the new sensor or just copy sensor to parent module
     * 
     * @param moduleRenaming ModuleRenaming of a run statement
     * @param parentModule The parent module where the sensors will be copied to
     */
    def transformSensors(ModuleRenaming moduleRenaming, Module parentModule) {
        for (decl : moduleRenaming.module.intSensorDecls) {
            for (var i=0; i<decl.sensors.length; i++) {
                var sensorWType = decl.sensors.get(i)
                var sensor = checkIfSensorExistsByNameAndType(sensorWType.sensor.name, sensorWType.type?.type)
                if (sensor instanceof ISignal) {
                    for (voRef : valuedObjectReferences) {
                        if (voRef.valuedObject == sensorWType.sensor) {
                            voRef.valuedObject = sensor
                        }
                    }
                }
                else {
                    sensorWType.sensor.name = sensorWType.sensor.name.createNewUniqueSensorName
                    parentModule.intSensorDecls.add(createSensorDecl(sensorWType))
                    i--
                }
            }
        }
        return moduleRenaming
    }
    
    /**
     * Transform all references from the old to the new types or just copy types to parent module
     * 
     * @param moduleRenaming ModuleRenaming of a run statement
     * @param parentModule The parent module where the types will be copied to
     */
    def transformTypes(ModuleRenaming moduleRenaming, Module parentModule) {
        for (decl : moduleRenaming.module.intTypeDecls) {
            for (var i=0; i<decl.types.length; i++) {
                var oldType = decl.types.get(i)
                var type = checkIfTypeExistsByName(oldType.name, parentModule)
                if (type instanceof Type) {
                    for (typeIdent : typeIdentifiers) {
                        if (typeIdent instanceof EsterelType) {
                            if (typeIdent.estType == oldType) {
                                typeIdent.estType = type
                            }
                        }
                    }
                } 
                else {
                    oldType.name = oldType.name.createNewUniqueTypeName
                    parentModule.intTypeDecls += createTypeDecl(oldType)
                    i--
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
        for (decl : parentModule.intTypeDecls) {
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
     * @param parentModule The parent module where the functions will be copied to
     */
    def transformFunctions(ModuleRenaming moduleRenaming, Module parentModule) {
        for (decl : moduleRenaming.module.intFunctionDecls) {
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
                        if (signal.func == oldFunction) {
                            signal.func = function
                        }
                    }
                    
                }
                else {
                    parentModule.intFunctionDecls += createFunctionDecl(oldFunction)
                    i--
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
        for (decl : parentModule.intFunctionDecls) {
            for (f : decl.functions) {
                if (f.name.equals(name)) {
                    var same = true
                    for (var i=0; i<f.idList.length; i++) {
                        var typeIdent = f.idList.get(i)
                        // TODO just the type field of the TypeIdentifier is checked at the moment
                        if (i<oldFunction.idList.length) {
                            if (typeIdent.type == null || typeIdent.type != oldFunction.idList.get(i).type) {
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