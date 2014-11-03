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
import de.cau.cs.kieler.scl.scl.Program

/**
 * @author krat
 *
 */
class TransformInterface {
    
    // Global variables
    var LinkedList<ValuedObject> variables
    
    @Inject
    extension KExpressionsExtension
    
    /*
     * Transforms an Esterel module interface to a list of Kexpression declarations
     */
    def transformInterface(ModuleInterface modInterface, Program program) {
        System.out.println("Transforming Interface")
        variables = new LinkedList<ValuedObject>
        transformDeclaration(modInterface.intSignalDecls, program)
    }
    
    /*
     * Transforms the signal declarations
     */
    def transformDeclaration(EList<InterfaceSignalDecl> list, Program program) {
        System.out.println("Transforming Interface Signal Declarations")
        
        for (singleDecl : list) {
            transformSingleDeclartion(singleDecl, program)
        }
    }
    
    /*
     * Transforms one signal declaration, which may consist of pure and valued signals
     */
    def transformSingleDeclartion(InterfaceSignalDecl decl, Program program) {
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
        
        for (sig : decl.signals) {
            if (sig.channelDescr == null) {
                System.out.println("Transforming pure signal " + sig)
                val variable = createValuedObject(sig.name)
//                variables.add(variable)
                pureSignals.valuedObjects.add(variable);
                System.out.println("Variable1 is " + variable)
            }
            // Valued int signal
            else if (sig.channelDescr.type.type == de.cau.cs.kieler.esterel.kexpressions.ValueType::INT) {
                System.out.println("Transforming int signal " + sig)
                val variable = createValuedObject(sig.name)
                intSignals.valuedObjects.add(variable);
//                variables.add(variable)
            }
            else {
                System.out.println("Unable to transform declaration: " + sig.channelDescr.type.type)
            }
        }
        
        if (pureSignals.valuedObjects.length != 0) {
            program.declarations.add(pureSignals)
        }
        if (intSignals.valuedObjects.length != 0) {
            program.declarations.add(intSignals)
        }
    }

    
}