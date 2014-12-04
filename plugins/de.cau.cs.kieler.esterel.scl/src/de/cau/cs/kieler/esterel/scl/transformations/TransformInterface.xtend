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
     * @return MultiHashMap containing the signal valObj (key), the valued valObj and the CombineOperator
     */
    def transformInterface(ModuleInterface modInterface, SCLProgram program) {
        System.out.println("Transforming Interface")
        if (modInterface != null) {
            val names = new LinkedList<String>
            modInterface.collectNames(names)
            transformConstDeclaration(modInterface.intConstantDecls, program, names)
            transformSigDeclaration(modInterface.intSignalDecls, program, names)
        }
    }

    /*
     * Transforms the signal declarations
     */
    def transformSigDeclaration(EList<InterfaceSignalDecl> list, SCLProgram program, LinkedList<String> names) {
        System.out.println("Transforming Interface Signal Declarations")

        for (singleDecl : list) {
            transformSingleDeclartion(singleDecl, program, names)
        }
    }

    /*
     * Transforms the constant declarations
     */
    def transformConstDeclaration(EList<ConstantDecls> list, SCLProgram program, LinkedList<String> names) {
        System.out.println("Transforming Interface Constant Declarations")

        for (singleDecl : list) {
            transformSingleConstDeclartion(singleDecl, program, names)
        }
    }
    
    /*
     * Transforms one signal declaration, which may consist of pure and valued signals
     */
    def transformSingleDeclartion(InterfaceSignalDecl decl, SCLProgram program, LinkedList<String> names) {

        //        val HashMap<ValuedObject, ValuedObject>  valuedMap = newHashMap
        val pureSignals = KExpressionsFactory::eINSTANCE.createDeclaration => [
            input = decl instanceof Input
            output = decl instanceof Output
            type = ValueType::BOOL
        //...
        ]
        val intSignals = KExpressionsFactory::eINSTANCE.createDeclaration => [
            input = decl instanceof Input
            output = decl instanceof Output
            type = ValueType::INT
        //...
        ]
        val boolSignals = KExpressionsFactory::eINSTANCE.createDeclaration => [
            input = decl instanceof Input
            output = decl instanceof Output
            type = ValueType::BOOL
        //...
        ]
        val unsignedSignals = KExpressionsFactory::eINSTANCE.createDeclaration => [
            input = decl instanceof Input
            output = decl instanceof Output
            type = ValueType::UNSIGNED
        //...
        ]
        val floatSignals = KExpressionsFactory::eINSTANCE.createDeclaration => [
            input = decl instanceof Input
            output = decl instanceof Output
            type = ValueType::FLOAT
        //...
        ]
        val doubleSignals = KExpressionsFactory::eINSTANCE.createDeclaration => [
            input = decl instanceof Input
            output = decl instanceof Output
            type = ValueType::DOUBLE
        //...
        ]
        val stringSignals = KExpressionsFactory::eINSTANCE.createDeclaration => [
            input = decl instanceof Input
            output = decl instanceof Output
            type = ValueType::STRING
        //...
        ]

        // TODO: HOST?
        for (sig : decl.signals) {
            System.out.println("Transforming signal " + sig)
            val pureSig = createValuedObject(sig.name)
            pureSignals.valuedObjects.add(pureSig)
            signalMap.add(sig.name -> pureSig)

            // Valued signals get a variable containing the value
            if (sig.channelDescr != null) { //de.cau.cs.kieler.esterel.kexpressions.ValueType::INT) {
                System.out.println("Transforming valued signal type.type " + sig.channelDescr.type.type)
                System.out.println("Combine with: " + sig.channelDescr.type.operator)
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
                switch (type) {
                    case (de.cau.cs.kieler.esterel.kexpressions.ValueType::INT):
                        intSignals.valuedObjects.add(s_val)
                    case (de.cau.cs.kieler.esterel.kexpressions.ValueType::BOOL):
                        boolSignals.valuedObjects.add(s_val)
                    case (de.cau.cs.kieler.esterel.kexpressions.ValueType::STRING):
                        stringSignals.valuedObjects.add(s_val)
                    case (de.cau.cs.kieler.esterel.kexpressions.ValueType::FLOAT):
                        floatSignals.valuedObjects.add(s_val)
                    case (de.cau.cs.kieler.esterel.kexpressions.ValueType::UNSIGNED):
                        unsignedSignals.valuedObjects.add(s_val)
                    case (de.cau.cs.kieler.esterel.kexpressions.ValueType::DOUBLE):
                        floatSignals.valuedObjects.add(s_val)
                    default:
                        System.out.println("Unable to transform declaration: " + sig.channelDescr.type.type)
                }
            }
        }

        if (pureSignals.valuedObjects.length != 0) {
            program.declarations.add(pureSignals)
        }
        if (intSignals.valuedObjects.length != 0) {
            program.declarations.add(intSignals)
        }
        if (boolSignals.valuedObjects.length != 0) {
            program.declarations.add(boolSignals)
        }
        if (stringSignals.valuedObjects.length != 0) {
            program.declarations.add(stringSignals)
        }
        if (unsignedSignals.valuedObjects.length != 0) {
            program.declarations.add(unsignedSignals)
        }
        if (floatSignals.valuedObjects.length != 0) {
            program.declarations.add(floatSignals)
        }
        if (doubleSignals.valuedObjects.length != 0) {
            program.declarations.add(doubleSignals)
        }

    }

    /*
     * Transforms one signal constant declaration, which may consist of pure and valued constant
     * TODO: Merge with normal signal declarations...
     */
    def transformSingleConstDeclartion(ConstantDecls decl, SCLProgram program, LinkedList<String> names) {
        val pureSignals = KExpressionsFactory::eINSTANCE.createDeclaration => [
            input = decl instanceof Input
            output = decl instanceof Output
            type = ValueType::BOOL
            const = true
        //...
        ]
        val intSignals = KExpressionsFactory::eINSTANCE.createDeclaration => [
            input = decl instanceof Input
            output = decl instanceof Output
            type = ValueType::INT
            const = true
        //...
        ]
        val boolSignals = KExpressionsFactory::eINSTANCE.createDeclaration => [
            input = decl instanceof Input
            output = decl instanceof Output
            type = ValueType::BOOL
            const = true
        //...
        ]
        val unsignedSignals = KExpressionsFactory::eINSTANCE.createDeclaration => [
            input = decl instanceof Input
            output = decl instanceof Output
            type = ValueType::UNSIGNED
            const = true
        //...
        ]
        val floatSignals = KExpressionsFactory::eINSTANCE.createDeclaration => [
            input = decl instanceof Input
            output = decl instanceof Output
            type = ValueType::FLOAT
            const = true
        //...
        ]
        val doubleSignals = KExpressionsFactory::eINSTANCE.createDeclaration => [
            input = decl instanceof Input
            output = decl instanceof Output
            type = ValueType::DOUBLE
            const = true
        //...
        ]
        val stringSignals = KExpressionsFactory::eINSTANCE.createDeclaration => [
            input = decl instanceof Input
            output = decl instanceof Output
            type = ValueType::STRING
            const = true
        //...
        ]

        // TODO: HOST?
        for (singleDecl : decl.constants) {
            // Type of the constant
            val type = singleDecl.type.type
            for (const : singleDecl.constants) {
                    val s_val = createValuedObject(uniqueNameByList(names, const.constant.name))
                    signalMap.add(const.constant.name -> s_val)
                    valuedMap.put(s_val, s_val)
                    
                    if (const.value != null) {
                        s_val.initialValue = const.value.transformExp(type.toString)
                    }
                    switch (type) {
                        case (de.cau.cs.kieler.esterel.kexpressions.ValueType::INT):
                            intSignals.valuedObjects.add(s_val)
                        case (de.cau.cs.kieler.esterel.kexpressions.ValueType::BOOL):
                            boolSignals.valuedObjects.add(s_val)
                        case (de.cau.cs.kieler.esterel.kexpressions.ValueType::STRING):
                            stringSignals.valuedObjects.add(s_val)
                        case (de.cau.cs.kieler.esterel.kexpressions.ValueType::FLOAT):
                            floatSignals.valuedObjects.add(s_val)
                        case (de.cau.cs.kieler.esterel.kexpressions.ValueType::UNSIGNED):
                            unsignedSignals.valuedObjects.add(s_val)
                        case (de.cau.cs.kieler.esterel.kexpressions.ValueType::DOUBLE):
                            floatSignals.valuedObjects.add(s_val)
                        default:
                            System.out.println("Unable to transform declaration: " + type)
                    
                    }
                }
            }

        if (pureSignals.valuedObjects.length != 0) {
            program.declarations.add(pureSignals)
        }
        if (intSignals.valuedObjects.length != 0) {
            program.declarations.add(intSignals)
        }
        if (boolSignals.valuedObjects.length != 0) {
            program.declarations.add(boolSignals)
        }
        if (stringSignals.valuedObjects.length != 0) {
            program.declarations.add(stringSignals)
        }
        if (unsignedSignals.valuedObjects.length != 0) {
            program.declarations.add(unsignedSignals)
        }
        if (floatSignals.valuedObjects.length != 0) {
            program.declarations.add(floatSignals)
        }
        if (doubleSignals.valuedObjects.length != 0) {
            program.declarations.add(doubleSignals)
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
     def Declaration transformIntVarDeclaration(VariableDecl declaration, LinkedList<Pair<String, ValuedObject>> signalMap) {
         val decl = createDeclaration => [
            type = ValueType::getByName(declaration.type.type.name)
            output = true
        ]
        
        declaration.variables.forEach [
            val s_val = createValuedObject(uniqueName(signalMap, it.name))
            // TODO add to signalmap?
            signalMap.add(it.name -> s_val)
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
