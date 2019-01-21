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
package de.cau.cs.kieler.language.server

import com.google.inject.Guice
import de.cau.cs.kieler.esterel.EsterelRuntimeModule
import de.cau.cs.kieler.esterel.ide.EsterelIdeModule
import de.cau.cs.kieler.esterel.ide.EsterelIdeSetup
import de.cau.cs.kieler.kgraph.text.KGraphRuntimeModule
import de.cau.cs.kieler.kgraph.text.ide.KGraphIdeModule
import de.cau.cs.kieler.kgraph.text.ide.KGraphIdeSetup
import de.cau.cs.kieler.klighd.lsp.KGraphDiagramModule
import de.cau.cs.kieler.lustre.LustreRuntimeModule
import de.cau.cs.kieler.lustre.ide.LustreIdeModule
import de.cau.cs.kieler.lustre.ide.LustreIdeSetup
import de.cau.cs.kieler.sccharts.ide.text.SCTXIdeModule
import de.cau.cs.kieler.sccharts.ide.text.SCTXIdeSetup
import de.cau.cs.kieler.sccharts.text.SCTXRuntimeModule
import de.cau.cs.kieler.scl.SCLRuntimeModule
import de.cau.cs.kieler.scl.ide.SCLIdeModule
import de.cau.cs.kieler.scl.ide.SCLIdeSetup
import org.eclipse.xtext.util.Modules2

/**
 * @author sdo
 *
 */
class LanguageRegistration {
    
    def bindAndRegisterLanguages() {
        new SCLIdeSetup {
            override createInjector() {
                Guice.createInjector(Modules2.mixin(new SCLRuntimeModule, new SCLIdeModule))
            }
        }.createInjectorAndDoEMFRegistration()
        new SCTXIdeSetup {
            override createInjector() {
                Guice.createInjector(Modules2.mixin(new SCTXRuntimeModule, new SCTXIdeModule))
            }
        }.createInjectorAndDoEMFRegistration()
        
        new EsterelIdeSetup {
            override createInjector() {
                Guice.createInjector(Modules2.mixin(new EsterelRuntimeModule, new EsterelIdeModule))
            }
        }.createInjectorAndDoEMFRegistration()
        
        new LustreIdeSetup {
            override createInjector() {
                Guice.createInjector(Modules2.mixin(new LustreRuntimeModule, new LustreIdeModule))
            }
        }.createInjectorAndDoEMFRegistration()
        val injector =  new KGraphIdeSetup {
            override createInjector() {
                Guice.createInjector(Modules2.mixin(
                    new KGraphRuntimeModule, new KGraphIdeModule, new KGraphDiagramModule))
            }
        }.createInjectorAndDoEMFRegistration()
        return injector
    }
}