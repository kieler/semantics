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
package de.cau.cs.kieler.lustre.ide

import com.google.inject.Guice
import de.cau.cs.kieler.core.ls.ILSSetup
import de.cau.cs.kieler.lustre.LustreRuntimeModule
import de.cau.cs.kieler.lustre.LustreStandaloneSetup
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.XtextPackage
import org.eclipse.xtext.resource.impl.BinaryGrammarResourceFactoryImpl
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 * 
 * @author sdo
 * 
 */
class LustreIdeSetup extends LustreStandaloneSetup implements ILSSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new LustreRuntimeModule, new LustreIdeModule))
	}
	
	def static doSetup() {
        if (injector === null) {
            injector = new LustreIdeSetup().createInjectorAndDoEMFRegistration()
        }
        return injector
    }
    
    override doLSSetup() {
        return LustreIdeSetup.doSetup
    }
	
}
