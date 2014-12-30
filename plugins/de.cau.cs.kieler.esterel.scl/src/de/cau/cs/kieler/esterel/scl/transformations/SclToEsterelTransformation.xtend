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

import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.esterel.esterel.Module
import de.cau.cs.kieler.esterel.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.esterel.kexpressions.ValueType

/**
 * @author krat
 *
 */
class SclToEsterelTransformation {

    def Program transform(SCLProgram sclProgram) {
        val esterelProgram = EsterelFactory::eINSTANCE.createProgram
        val module = EsterelFactory::eINSTANCE.createModule
        module.name = sclProgram.name
        module.end = "end module"
        module.body = EsterelFactory::eINSTANCE.createModuleBody

        // Transform declarations
        transform(sclProgram.declarations, module)

        // Transform body
        module.body.statements += EsterelFactory::eINSTANCE.createNothing

        esterelProgram.modules += module
        esterelProgram
    }

    /*
     * Transforms SCL declarations to Esterel module interface
     */
    def Module transform(EList<Declaration> decls, Module module) {
        val interf = EsterelFactory::eINSTANCE.createModuleInterface
        for (decl : decls) {
            for (valObj : decl.valuedObjects) {

                //Create the signal
                val signal = KExpressionsFactory::eINSTANCE.createISignal => [
                    name = valObj.name
                    channelDescr = EsterelFactory::eINSTANCE.createChannelDescription => [
                        type = KExpressionsFactory::eINSTANCE.createTypeIdentifier => [
                            type = ValueType::getByName(decl.type.getName)
                        ]
                    ]
                ]

                if (decl.isOutput && decl.isInput) {
                    interf.intSignalDecls += KExpressionsFactory::eINSTANCE.createInputOutput => [
                        signals += signal
                    ]
                } else if (decl.isInput) {
                    interf.intSignalDecls += KExpressionsFactory::eINSTANCE.createInput => [
                        signals += signal
                    ]
                } else if (decl.isOutput) {
                    interf.intSignalDecls += KExpressionsFactory::eINSTANCE.createOutput => [
                        signals += signal
                    ]
                } else if (decl.isOutput && decl.isInput) {
                    interf.intSignalDecls += KExpressionsFactory::eINSTANCE.createInputOutput => [
                        signals += signal
                    ]
                }
            }
        }

        module.interface = interf

        module
    }
}
