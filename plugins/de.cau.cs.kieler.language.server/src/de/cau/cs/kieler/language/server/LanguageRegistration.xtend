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
import de.cau.cs.kieler.kexpressions.ide.kext.KExtIdeModule
import de.cau.cs.kieler.kexpressions.ide.kext.KExtIdeSetup
import de.cau.cs.kieler.kexpressions.kext.KExtRuntimeModule
import de.cau.cs.kieler.kgraph.text.KGraphRuntimeModule
import de.cau.cs.kieler.kgraph.text.ide.KGraphIdeModule
import de.cau.cs.kieler.kgraph.text.ide.KGraphIdeSetup
import de.cau.cs.kieler.klighd.lsp.KGraphDiagramModule
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageServerExtension
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
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.kgraph.text.KGraphStandaloneSetup
import de.cau.cs.kieler.annotations.xtext.IHighlighting
import java.util.List
import java.util.ArrayList

/**
 * @author sdo
 *
 */
class LanguageRegistration {
    
    public static var List<IHighlighting> iHighlightings = new ArrayList
    
    def bindAndRegisterLanguages() {
        // Since Esterel depends on scl, scl has to be registered after strl
        val injectorEsterel = new EsterelIdeSetup {
            override createInjector() {
                Guice.createInjector(Modules2.mixin(new EsterelRuntimeModule, new EsterelIdeModule, new KGraphDiagramModule))
            }
        }.createInjectorAndDoEMFRegistration()
        iHighlightings.add(injectorEsterel.getInstance(IHighlighting))
        val injectorSCL = new SCLIdeSetup {
            override createInjector() {
                Guice.createInjector(Modules2.mixin(new SCLRuntimeModule, new SCLIdeModule))
            }
        }.createInjectorAndDoEMFRegistration()
        iHighlightings.add(injectorSCL.getInstance(IHighlighting))
        val injectorSCTX = new SCTXIdeSetup {
                       
            override createInjector() {
                val injector = Guice.createInjector(Modules2.mixin(new SCTXRuntimeModule, new SCTXIdeModule))
                SCTXStandaloneSetup.injector = injector
                return injector
            }
        }.createInjectorAndDoEMFRegistration()
        iHighlightings.add(injectorSCTX.getInstance(IHighlighting))
        new KGraphIdeSetup {
            override createInjector() {
                val injector = Guice.createInjector(Modules2.mixin(new KGraphRuntimeModule, new KGraphIdeModule))
                KGraphStandaloneSetup.injector = injector
                return injector
            }
        }.createInjectorAndDoEMFRegistration()
        val injectorLustre = new LustreIdeSetup {
            override createInjector() {
                Guice.createInjector(Modules2.mixin(new LustreRuntimeModule, new LustreIdeModule))
            }
        }.createInjectorAndDoEMFRegistration()
        iHighlightings.add(injectorLustre.getInstance(IHighlighting))
        return injectorEsterel.getInstance(KGraphLanguageServerExtension)
    }
}