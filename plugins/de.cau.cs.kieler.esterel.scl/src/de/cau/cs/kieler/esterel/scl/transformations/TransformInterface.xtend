/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
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

/**
 * @author krat
 * 
 * This class contains a method to transform an Esterel modules interface to KExpressions declarations
 * and adds them to a given SCL program. Also local variable declarations are handled here.
 *
 */
class TransformInterface {

    @Inject
    extension KExpressionsExtension

    @Inject
    extension EsterelToSclExtensions
    
    @Inject
    extension EsterelToSclTransformation

    @Inject
    extension TransformExpression

    /**
     * Transforms an Esterel module interface to Kexpression declarations
     * 
     * @param modInterface The Esterel modules interface
     * @param program      The SCL target program
     * @param signalMap    The list containing all declared signals
     * @param valuedMap    The map associating a signal variable to the variable holding the value
     */
    def transformEsterelInterface(ModuleInterface modInterface, SCLProgram program,
        LinkedList<Pair<String, ValuedObject>> signalMap,
        HashMap<ValuedObject, ValuedObject> valuedMap) {
        if (modInterface != null) {
            modInterface.intConstantDecls.forEach[ transformSingleDeclartion(it, program, signalMap, valuedMap) ]
            modInterface.intSignalDecls.forEach[ transformSingleDeclartion(it, program, signalMap, valuedMap) ]
            modInterface.intSensorDecls.forEach[ transformSingleDeclartion(it, program, signalMap, valuedMap) ]
        }
    }

    /**
     * Transforms a single Esterel signal declaration to KExpressions declaration and adds it to
     * a SCL programs declarations.
     * 
     * @param decl         The Esterel modules signal declaration
     * @param program      The SCL target program
     * @param signalMap    The list containing all declared signals
     * @param valuedMap    The map associating a signal variable to the variable holding the value
     */
    def transformSingleDeclartion(InterfaceSignalDecl decl, SCLProgram program, 
        LinkedList<Pair<String, ValuedObject>> signalMap,
        HashMap<ValuedObject, ValuedObject> valuedMap) {
        for (sig : decl.signals) {
            val pureSig = createValuedObject(sig.name)
            signalMap.add(sig.name -> pureSig)
            program.declarations += createDeclaration => [
                input = (decl instanceof Input) || (decl instanceof de.cau.cs.kieler.esterel.kexpressions.InputOutput)
                output = (decl instanceof Output) || (decl instanceof de.cau.cs.kieler.esterel.kexpressions.InputOutput)
                type = ValueType::BOOL
                valuedObjects += pureSig
            ]

            // If it is a valued signal add a variable for the value
            if (sig.channelDescr != null) {
                val s_val = createValuedObject(sig.name + "_val")
                val type = sig.channelDescr.type.type
                s_val.combineOperator = sig.channelDescr.type.operator.transformCombineOperator
                valuedMap.put(pureSig, s_val)

                // Initial value?
                if (sig.channelDescr.expression != null) {
                    s_val.initialValue = sig.channelDescr.expression.transformExp(type.toString)
                }
                program.declarations += createDeclaration => [
                    input = decl instanceof Input || decl instanceof InputOutput
                    output = decl instanceof Output || decl instanceof InputOutput
                    valuedObjects += s_val
                    // Check for hostcode type
                    if (sig.type.getName() == "PURE" && sig.channelDescr.type.typeID != null) {
                        it.type = ValueType::HOST
                        it.hostType = sig.channelDescr.type.typeID
                    } else {
                        it.type = ValueType::getByName(type.getName())
                    }
                ]
            }
        }
    }

    /**
     * Transforms a single Esterel constant declaration to KExpressions declaration and adds it to
     * a SCL programs declarations.
     * 
     * @param decl         The Esterel modules constant declaration
     * @param program      The SCL target program
     * @param signalMap    The list containing all declared signals
     * @param valuedMap    The map associating a signal variable to the variable holding the value
     */
    def transformSingleDeclartion(ConstantDecls decl, SCLProgram program,
        LinkedList<Pair<String, ValuedObject>> signalMap,
        HashMap<ValuedObject, ValuedObject> valuedMap) {
        for (singleDecl : decl.constants) {
            // Type of the constant
            val type = singleDecl.type.type
            for (constant : singleDecl.constants) {
                val s_val = createValuedObject(constant.constant.name)
                signalMap.add(constant.constant.name -> s_val)
                valuedMap.put(s_val, s_val)

                if (constant.value != null) {
                    s_val.initialValue = constant.value.transformExp(type.toString)
                }

                program.declarations += createDeclaration => [
                    valuedObjects += s_val
                    it.const = true
                    if (type.getName() == "PURE" && singleDecl.type.typeID != null) {
                        it.type = ValueType::HOST
                        it.hostType = singleDecl.type.typeID
                    } else {
                        it.type = ValueType::getByName(type.getName())
                    }
                ]
            }
        }

    }
    
    /**
     * Transforms a single Esterel sensor declaration to KExpressions declaration and adds it to
     * a SCL programs declarations.
     * 
     * @param decl         The Esterel modules sensor declaration
     * @param program      The SCL target program
     * @param signalMap    The list containing all declared signals
     * @param valuedMap    The map associating a signal variable to the variable holding the value
     */
    def transformSingleDeclartion(SensorDecl decl, SCLProgram program,
        LinkedList<Pair<String, ValuedObject>> signalMap,
        HashMap<ValuedObject, ValuedObject> valuedMap) {
        for (singleDecl : decl.sensors) {
                val type = singleDecl.type.type
                val s_val = createValuedObject(singleDecl.sensor.name)
                signalMap.add(singleDecl.sensor.name -> s_val)
                valuedMap.put(s_val, s_val)
                program.declarations += createDeclaration => [
                    valuedObjects += s_val
                    it.type = ValueType::getByName(type.getName())
                    if (type.getName() == "PURE" && singleDecl.type.typeID != null) {
                        it.type = ValueType::HOST
                        it.hostType = singleDecl.type.typeID
                    } else {
                        it.type = ValueType::getByName(type.getName())
                    }
                ]
        }
    }

    /**
     * Transforms a local variable declaration
     * 
     * @param declaration The Esterel local variable declaration
     * @param signals     List saving the declared variables to delete them from the signalMap after body
     * @param signalMap   The list containing all declared signals
     */
    def Declaration transformIntVarDeclaration(VariableDecl declaration, 
        LinkedList<Pair<String, ValuedObject>> signals,
        LinkedList<Pair<String, ValuedObject>> signalMap) {
        val decl = createDeclaration => [
            if (declaration.type.type.getName() != "PURE") {
                type = ValueType::getByName(declaration.type.type.getName())
            } else {
                type = ValueType::HOST
                hostType = declaration.type.typeID
            }
        ]

        declaration.variables.forEach [
            val s_val = createValuedObject(uniqueName(it.name))
            signals.add(it.name -> s_val)
            signalMap.add(it.name -> s_val)
            signalToValueMap.put(s_val, s_val)
            if (it.expression != null)
                s_val.initialValue = it.expression.transformExp(declaration.type.type.literal)
            decl.valuedObjects += s_val
        ]

        decl
    }
}
