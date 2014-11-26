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
    extension TransformExpression
    
    /*
     * Transforms an Esterel module interface to a list of Kexpression declarations
     * @return MultiHashMap containing the signal valObj (key), the valued valObj and the CombineOperator
     */
    def HashMap<ValuedObject, Pair<ValuedObject, OperatorType>> transformInterface(ModuleInterface modInterface, SCLProgram program) {
        System.out.println("Transforming Interface")
        transformDeclaration(modInterface.intSignalDecls, program)
    }
    
    /*
     * Transforms the signal declarations
     */
    def HashMap<ValuedObject, Pair<ValuedObject, OperatorType>>  transformDeclaration(EList<InterfaceSignalDecl> list, SCLProgram program) {
        System.out.println("Transforming Interface Signal Declarations")
        val names = list.collectNames
        val HashMap<ValuedObject, Pair<ValuedObject, OperatorType>>  valuedMap = newHashMap
        
        for (singleDecl : list) {
            valuedMap.putAll(transformSingleDeclartion(singleDecl, program, names))
        }
        
        valuedMap
    }
    
    /*
     * Transforms one signal declaration, which may consist of pure and valued signals
     */
    def HashMap<ValuedObject, Pair<ValuedObject, OperatorType>>  transformSingleDeclartion(InterfaceSignalDecl decl, SCLProgram program, LinkedList<String> names) {
        val HashMap<ValuedObject, Pair<ValuedObject, OperatorType>>  valuedMap = newHashMap
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
            pureSignals.valuedObjects.add(pureSig);
            
            // Valued signals get a variable containing the value
            if (sig.channelDescr != null) {//de.cau.cs.kieler.esterel.kexpressions.ValueType::INT) {
                System.out.println("Transforming valued signal type.type " + sig.channelDescr.type.type)
                System.out.println("Combine with: " + sig.channelDescr.type.operator)
                val s_val = createValuedObject(uniqueNameByList(names, sig.name + "_val"))
                
                valuedMap.put(pureSig, (s_val -> sig.channelDescr.type.operator.transformCombineOperator))
                val type = sig.channelDescr.type.type
                s_val.initialValue = sig.channelDescr.expression.transformConstExp(type.toString)
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
                        doubleSignals.valuedObjects.add(s_val)
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

        valuedMap
    }
    
    /*
     * Collects all declarated signal names
     */
     def LinkedList<String> collectNames(EList<InterfaceSignalDecl> decls) {
         val LinkedList<String> names = newLinkedList
         decls.forEach[
             signals.forEach[
                 names += it.name
             ]
         ]
         
         names
     }

    
}