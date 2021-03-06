/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.esterel.scest

import com.google.inject.Injector
import de.cau.cs.kieler.core.services.KielerLanguage
import de.cau.cs.kieler.esterel.EsterelPackage
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.SCEstStatement
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.scl.Assignment
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.Goto
import de.cau.cs.kieler.scl.Label
import de.cau.cs.kieler.scl.Parallel
import de.cau.cs.kieler.scl.ScopeStatement

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 * 
 * @author sdo
 * 
 */
class SCEstStandaloneSetup extends SCEstStandaloneSetupGenerated implements KielerLanguage {
    
    static Injector injector
    
    def static doSetup() {
        if (injector === null) {
            // Ensure meta model package is registered 
            EsterelPackage.eINSTANCE.eClass()
            injector = new SCEstStandaloneSetup().createInjectorAndDoEMFRegistration()
        }
        return injector
    }
    
    override register(Injector injector) {
        super.register(injector)
        // Ensure package is registered 
        EsterelPackage.eINSTANCE.eClass()
    }
    
    override getInjector() {
        return doSetup()
    }
    
    override getSupportedModels() {
        #[EsterelProgram]
    }
    
    override getSupportedResourceExtensions() {
        #["scest"]
    }
    
    override getResourceExtension(Object model) {
        return getEsterelResourceExtension(model)
    }

    static def getEsterelResourceExtension(Object model) {
        if (model instanceof EsterelProgram) {
            if (model.eAllContents.exists[
                switch (it) {
                    SCEstStatement,
                    VariableDeclaration,
                    Label,
                    Goto,
                    Conditional,
                    ScopeStatement,
                    Parallel,
                    Assignment : true
                    default : false
                }
            ]) {
                return "scest"
            } else {
                return "strl"
            }
        }
        return null
    }
}
