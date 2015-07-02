/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.scl.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.esterel.esterel.ConstantDecls
import de.cau.cs.kieler.esterel.esterel.ModuleInterface
import de.cau.cs.kieler.esterel.esterel.SensorDecl
import de.cau.cs.kieler.esterel.kexpressions.Input
import de.cau.cs.kieler.esterel.kexpressions.InterfaceSignalDecl
import de.cau.cs.kieler.esterel.kexpressions.Output
import de.cau.cs.kieler.esterel.kexpressions.VariableDecl
import de.cau.cs.kieler.scl.scl.SCLProgram
import java.util.LinkedList
import java.util.HashMap
import de.cau.cs.kieler.esterel.kexpressions.CombineOperator

/**
 * This class contains a methods to transform an Esterel modules interface to KExpressions declarations
 * and adds them to a given SCL program. Also local variable declarations are handled here.
 *
 * @author krat
 * @kieler.rating yellow 2015-03-14 review KI-63 by ssm, ima, cmot
 */
class EsterelDeclarationsTransformation {

    @Inject
    extension KExpressionsExtension

    @Inject
    extension EsterelToSclExtensions
    
    @Inject
    extension EsterelToSclTransformation

    @Inject
    extension TransformExpression

    /**
     * Transforms an Esterel module interface to Kexpression declarations.
     * 
     * @param modInterface The Esterel modules interface
     * @param sclProgram The SCL target program
     * @param signalToVariableMap The list containing all declared signals
     * @param signalToValueMap The map associating a signal variable to the variable holding the value
     */
    def transformEsterelInterface(ModuleInterface moduleInterface, SCLProgram sclProgram,
        LinkedList<Pair<String, ValuedObject>> signalToVariableMap,
        HashMap<ValuedObject, ValuedObject> signalToValueMap) {
        if (moduleInterface != null) {
            moduleInterface.intConstantDecls.forEach[ transformSingleDeclartion(it, sclProgram, signalToVariableMap, signalToValueMap) ]
            moduleInterface.intSignalDecls.forEach[ transformSingleDeclartion(it, sclProgram, signalToVariableMap, signalToValueMap) ]
            moduleInterface.intSensorDecls.forEach[ transformSingleDeclartion(it, sclProgram, signalToVariableMap, signalToValueMap) ]
        }
    }

    /**
     * Transforms a single Esterel signal declaration to KExpressions declaration and adds it to
     * a SCL programs declarations.
     * 
     * @param interfaceSignalDecl The Esterel modules signal declaration
     * @param sclProgram The SCL target program
     * @param signalToVariableMap The list containing all declared signals
     * @param signalToValueMap The map associating a signal variable to the variable holding the value
     */
    def transformSingleDeclartion(InterfaceSignalDecl interfaceSignalDecl, SCLProgram sclProgram, 
        LinkedList<Pair<String, ValuedObject>> signalToVariableMap,
        HashMap<ValuedObject, ValuedObject> signalToValueMap) {
        for (signal : interfaceSignalDecl.signals) {
            val pureSignal = createValuedObject(signal.name)
            signalToVariableMap.add(signal.name -> pureSignal)
            sclProgram.declarations += createDeclaration => [
                input = (interfaceSignalDecl instanceof Input) || (interfaceSignalDecl instanceof de.cau.cs.kieler.esterel.kexpressions.InputOutput)
                output = (interfaceSignalDecl instanceof Output) || (interfaceSignalDecl instanceof de.cau.cs.kieler.esterel.kexpressions.InputOutput)
                type = ValueType::BOOL
                valuedObjects += pureSignal
            ]

            // If it is a valued signal add a variable for the value
            if (signal.channelDescr != null) {
                val signal_val = createValuedObject(signal.name + "_val")
                val signalType = signal.channelDescr.type.type
                signal_val.combineOperator = signal.channelDescr.type.operator.transformCombineOperator
                signalToValueMap.put(pureSignal, signal_val)

                // Initial value?
                if (signal.channelDescr.expression != null) {
                    signal_val.initialValue = signal.channelDescr.expression.transformExp(signalType.toString)
                }
                
                sclProgram.declarations += createDeclaration => [
                    input = interfaceSignalDecl instanceof Input || interfaceSignalDecl instanceof InputOutput
                    output = interfaceSignalDecl instanceof Output || interfaceSignalDecl instanceof InputOutput
                    valuedObjects += signal_val
                    // If there is a combine function add a variable carrying the neutral element
                    if (signal.channelDescr.type.operator != CombineOperator::NONE) {
                        val signal_cur = createValuedObject(signal.name + "_cur")
                        signal_cur.combineOperator = signal_val.combineOperator
                        signalToNeutralMap.put(pureSignal, signal_cur)
                        valuedObjects += signal_cur
                    }
                    // Check for hostcode type
                    if (signal.type.getName() == "PURE" && signal.channelDescr.type.typeID != null) {
                        it.type = ValueType::HOST
                        it.hostType = signal.channelDescr.type.typeID
                    } else if (signalType.getName() == "DOUBLE") {
                        it.type = ValueType::FLOAT
                    } else {
                        it.type = ValueType::getByName(signalType.getName())
                    }
                ]
            }
        }
    }

    /**
     * Transforms a single Esterel constant declaration to KExpressions declaration and adds it to
     * a SCL programs declarations.
     * 
     * @param constantDecls The Esterel modules constant declaration
     * @param sclProgram The SCL target program
     * @param signalToVariableMap The list containing all declared signals
     * @param signalToValueMap The map associating a signal variable to the variable holding the value
     */
    def transformSingleDeclartion(ConstantDecls constantDecls, SCLProgram sclProgram,
        LinkedList<Pair<String, ValuedObject>> signalToVariableMap,
        HashMap<ValuedObject, ValuedObject> signalToValueMap) {
        for (singleConstant : constantDecls.constants) {
            // Type of the constant
            var String constantTypeVar
            if (singleConstant.type.type.getName() != "pure") {
                constantTypeVar = singleConstant.type.type.toString
                println("getname " + singleConstant.type.type.toString )
            } else {
                constantTypeVar = singleConstant.type.typeID
            }
            val constantType = constantTypeVar
            for (constant : singleConstant.constants) {
                val constant_val = createValuedObject(constant.constant.name)
                signalToVariableMap.add(constant.constant.name -> constant_val)
                signalToValueMap.put(constant_val, constant_val)

                if (constant.value != null) {
                    constant_val.initialValue = constant.value.transformExp(constantType)
                }

                sclProgram.declarations += createDeclaration => [
                    valuedObjects += constant_val
                    it.const = true
                    if (constantType == "pure" && singleConstant.type.typeID != null) {
                        it.type = ValueType::HOST
                        it.hostType = singleConstant.type.typeID
                    } else if (constantType == "double") {
                        it.type = ValueType::FLOAT
                    } else {
                        it.type = ValueType::getByName(constantType.toUpperCase)
                    }
                ]
            }
        }

    }
    
    /**
     * Transforms a single Esterel sensor declaration to KExpressions declaration and adds it to
     * a SCL programs declarations.
     * 
     * @param sensorDecl The Esterel modules sensor declaration
     * @param sclProgram The SCL target program
     * @param signalToVariableMap The list containing all declared signals
     * @param signalToValueMap The map associating a signal variable to the variable holding the value
     */
    def transformSingleDeclartion(SensorDecl sensorDecl, SCLProgram sclProgram,
        LinkedList<Pair<String, ValuedObject>> signalToVariableMap,
        HashMap<ValuedObject, ValuedObject> signalToValueMap) {
        for (sensor : sensorDecl.sensors) {
                val sensorType = sensor.type.type
                val sensor_val = createValuedObject(sensor.sensor.name)
                signalToVariableMap.add(sensor.sensor.name -> sensor_val)
                signalToValueMap.put(sensor_val, sensor_val)
                sclProgram.declarations += createDeclaration => [
                    valuedObjects += sensor_val
                    it.type = ValueType::getByName(sensorType.getName())
                    if (sensorType.getName() == "PURE" && sensor.type.typeID != null) {
                        it.type = ValueType::HOST
                        it.hostType = sensor.type.typeID
                    } else if (sensorType.getName() == "DOUBLE") {
                        it.type = ValueType::FLOAT
                    } else {
                        it.type = ValueType::getByName(sensorType.getName())
                    }
                ]
        }
    }

    /**
     * Transforms a local variable declaration.
     * 
     * @param variableDecl The Esterel local variable declaration
     * @param locallyDeclaredSignals List saving the declared variables to delete them from the signalToVariableMap after body
     * @param signalToVariableMap The list containing all declared signals
     */
    def Declaration transformIntVarDeclaration(VariableDecl variableDecl, 
        LinkedList<Pair<String, ValuedObject>> locallyDeclaredSignals,
        LinkedList<Pair<String, ValuedObject>> signalToVariableMap) {
        val newLocalDeclaration = createDeclaration => [
            if (variableDecl.type.type.getName() != "PURE") {
                if (variableDecl.type.type.getName() == "DOUBLE") {
                    type = ValueType::FLOAT
                } else {
                    type = ValueType::getByName(variableDecl.type.type.getName())
                }
            } else {
                type = ValueType::HOST
                hostType = variableDecl.type.typeID
            }
        ]

        variableDecl.variables.forEach [
            val sclVariable = createValuedObject(uniqueName(it.name))
            locallyDeclaredSignals.add(it.name -> sclVariable)
            signalToVariableMap.add(it.name -> sclVariable)
            signalToValueMap.put(sclVariable, sclVariable)
            if (it.expression != null)
                sclVariable.initialValue = it.expression.transformExp(variableDecl.type.type.literal)
            newLocalDeclaration.valuedObjects += sclVariable
        ]

        newLocalDeclaration
    }
}
