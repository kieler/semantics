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

import de.cau.cs.kieler.esterel.esterel.ModuleInterface
import java.util.ArrayList
import de.cau.cs.kieler.core.kexpressions.Declaration
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.esterel.kexpressions.InterfaceSignalDecl
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.esterel.kexpressions.Input
import de.cau.cs.kieler.esterel.kexpressions.Output
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.core.kexpressions.ValueType
import java.util.LinkedList
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.esterel.esterel.ConstantExpression
import java.util.HashMap
import de.cau.cs.kieler.core.kexpressions.CombineOperator
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.esterel.esterel.ConstantDecls
import de.cau.cs.kieler.esterel.esterel.LocalSignalList
import de.cau.cs.kieler.esterel.kexpressions.ISignal
import de.cau.cs.kieler.esterel.kexpressions.InterfaceVariableDecl
import de.cau.cs.kieler.esterel.kexpressions.VariableDecl
import de.cau.cs.kieler.esterel.esterel.SensorDecl

/**
 * @author krat
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

    /*
     * Transforms an Esterel module interface to a list of Kexpression declarations
     */
    def transformInterface(ModuleInterface modInterface, SCLProgram program) {
        if (modInterface != null) {
            val names = new LinkedList<String>
            modInterface.collectNames(names)
            transformConstDeclaration(modInterface.intConstantDecls, program, names)
            transformSigDeclaration(modInterface.intSignalDecls, program, names)
            transformSensorDeclaration(modInterface.intSensorDecls, program, names)
        }
    }

    /*
     * Transforms the signal declarations
     */
    def transformSigDeclaration(EList<InterfaceSignalDecl> list, SCLProgram program, LinkedList<String> names) {

        for (singleDecl : list) {
            transformSingleDeclartion(singleDecl, program, names)
        }
    }

    /*
     * Transforms the constant declarations
     */
    def transformConstDeclaration(EList<ConstantDecls> list, SCLProgram program, LinkedList<String> names) {

        for (singleDecl : list) {
            transformSingleConstDeclartion(singleDecl, program, names)
        }
    }

    /*
     * Transforms the sensor declarations
     */
    def transformSensorDeclaration(EList<SensorDecl> list, SCLProgram program, LinkedList<String> names) {

        for (singleDecl : list) {
            transformSingleSensorDeclartion(singleDecl, program, names)
        }
    }

    /*
     * Transforms single declaration
     */
    def transformDeclaration(boolean isInput, boolean isOutput, boolean isConstant, ValueType valType) {
        KExpressionsFactory::eINSTANCE.createDeclaration => [
            input = isInput
            output = isOutput
            const = isConstant
            type = valType
        //...
        ]
    }

    /*
     * Transforms one signal declaration, which may consist of pure and valued signals
     */
    def transformSingleDeclartion(InterfaceSignalDecl decl, SCLProgram program, LinkedList<String> names) {

        // TODO: HOST?
        for (sig : decl.signals) {
            if (signalMap.findFirst[sig.name == key] == null) {
                val pureSig = createValuedObject(sig.name)

                val sclSigDecl = transformDeclaration(
                    (decl instanceof Input) || (decl instanceof InputOutput),
                    (decl instanceof Output) || (decl instanceof InputOutput),
                    false,
                    ValueType::BOOL
                )
                sclSigDecl.valuedObjects += pureSig
                signalMap.add(sig.name -> pureSig)
                program.declarations += sclSigDecl

                // Valued signals get a variable containing the value
                if (sig.channelDescr != null) {
                    val s_val = createValuedObject(uniqueNameByList(names, sig.name + "_val"))
                    s_val.combineOperator = sig.channelDescr.type.operator.transformCombineOperator
                    valuedMap.put(pureSig, s_val)
                    signalMap.add(s_val.name -> s_val)
                    val type = sig.channelDescr.type.type
                    if (sig.channelDescr.expression != null && sig.channelDescr.expression instanceof ConstantExpression) {
                        s_val.initialValue = sig.channelDescr.expression.transformExp(type.toString)
                    } else if (sig.channelDescr.expression != null) {
                        s_val.initialValue = sig.channelDescr.expression.transformExp(signalMap)
                    }
                    var ValueType t
                    // Check for hostcode type
                    if (sig.type.name == "PURE" && sig.channelDescr.type.typeID != null) {
                        t = ValueType::HOST
                    } else {
                        t = ValueType::getByName(type.name)
                    }

                    val sclDecl = transformDeclaration(
                        (decl instanceof Input) || (decl instanceof InputOutput),
                        (decl instanceof Output) || (decl instanceof InputOutput),
                        false,
                        t
                    )
                    sclDecl.valuedObjects += s_val

                    program.declarations += sclDecl

                }

            }
        }
    }

    /*
     * Transforms one signal constant declaration, which may consist of pure and valued constant
     * TODO: Merge with normal signal declarations...
     */
    def transformSingleConstDeclartion(ConstantDecls decl, SCLProgram program, LinkedList<String> names) {

        // TODO: HOST?
        for (singleDecl : decl.constants) {

            // Type of the constant
            val type = singleDecl.type.type
            for (const : singleDecl.constants) {
                if (signalMap.findFirst[const.constant.name == key] == null) {
                    val s_val = createValuedObject(uniqueNameByList(names, const.constant.name))
                    signalMap.add(const.constant.name -> s_val)
                    valuedMap.put(s_val, s_val)

                    if (const.value != null) {
                        s_val.initialValue = const.value.transformExp(type.toString)
                    }

                    val sclDecl = transformDeclaration(
                        false,
                        false,
                        true,
                        ValueType::getByName(type.name)
                    )
                    sclDecl.valuedObjects += s_val

                    program.declarations += sclDecl

                }

            }
        }

    }

    /*
     * Transforms one signal constant declaration, which may consist of pure and valued constant
     * TODO: Merge with normal signal declarations...
     */
    def transformSingleSensorDeclartion(SensorDecl decl, SCLProgram program, LinkedList<String> names) {

        // TODO: HOST?
        for (singleDecl : decl.sensors) {

            // Type of the constant
            if (signalMap.findFirst[singleDecl.sensor.name == key] == null) {
                val type = singleDecl.type.type
                val s_val = createValuedObject(uniqueNameByList(names, singleDecl.sensor.name))
                signalMap.add(singleDecl.sensor.name -> s_val)
                valuedMap.put(s_val, s_val)
                val sclDecl = transformDeclaration(
                    false,
                    false,
                    false,
                    ValueType::getByName(type.name)
                )
                sclDecl.valuedObjects += s_val

                program.declarations += sclDecl

            }
        }
    }

    /*
     * Transforms a valued declaration
     * @param sig The signal to be declared
     * @param name The resulting variable (should be unique)
     */
    def Declaration transformValuedDeclaration(ISignal sig, ValuedObject valObj) {
        val decl = createDeclaration => [
            type = ValueType::getByName(sig.channelDescr.type.type.name)
            output = true
        ]

        decl.valuedObjects += valObj

        decl
    }

    /*
     * Transforms a local variable declaration
     * @param sig The variable to be declared
     * @param name The resulting variable (should be unique)
     */
    def Declaration transformIntVarDeclaration(VariableDecl declaration,
        LinkedList<Pair<String, ValuedObject>> signalMap) {
        val decl = createDeclaration => [
            if (declaration.type.type.name != "PURE") {
                type = ValueType::getByName(declaration.type.type.name)
            } else {
                type = ValueType::HOST
            }
//            output = true
        ]

        declaration.variables.forEach [
            val s_val = createValuedObject(uniqueName(signalMap, it.name))
            // TODO add to signalmap?
            signalMap.add(it.name -> s_val)
            valuedMap.put(s_val, s_val)
            localVars += s_val.name
            if (it.expression instanceof ConstantExpression)
                s_val.initialValue = it.expression.transformExp(declaration.type.type.literal)
            else if (it.expression != null)
                s_val.initialValue = it.expression.transformExp(signalMap)
            decl.valuedObjects += s_val
        ]

        decl
    }

    /*
     * Collects all declarated signal names
     */
    def LinkedList<String> collectNames(ModuleInterface modInt, LinkedList<String> names) {
        if (modInt == null)
            return names
        modInt.intSignalDecls.collectSigNames(names)
        modInt.intConstantDecls.collectConstNames(names)

        names
    }

    def LinkedList<String> collectSigNames(EList<InterfaceSignalDecl> decls, LinkedList<String> names) {
        decls.forEach [
            signals.forEach [
                names += it.name
            ]
        ]

        names
    }

    /*
     * Collects all declarated signal names
     */
    def LinkedList<String> collectConstNames(EList<ConstantDecls> decls, LinkedList<String> names) {
        decls.forEach [
            constants.forEach [
                constants.forEach [
                    valuedObjects.forEach[names += it.name]
                ]
            ]
        ]

        names
    }
    
}
