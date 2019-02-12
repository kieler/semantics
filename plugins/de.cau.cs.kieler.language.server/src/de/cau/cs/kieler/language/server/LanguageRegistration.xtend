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
package de.cau.cs.kieler.language.server

import de.cau.cs.kieler.annotations.xtext.IHighlighting
import de.cau.cs.kieler.esterel.ide.EsterelLSSetup
import de.cau.cs.kieler.kgraph.text.ide.KGraphLSSetup
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageServerExtension
import de.cau.cs.kieler.lustre.ide.LustreLSSetup
import de.cau.cs.kieler.sccharts.ide.text.SCTXLSSetup
import de.cau.cs.kieler.scl.ide.SCLLSSetup
import java.util.ArrayList
import java.util.List

/**
 * @author sdo
 *
 */
class LanguageRegistration {
    
    public static var List<IHighlighting> iHighlightings = new ArrayList
    
    def bindAndRegisterLanguages() {
        // Since Esterel depends on scl, scl has to be registered after strl
        // TODO register concrete LSSetup classes via ServiceLoader and bind their implementations here to avoid dependencies
        iHighlightings.add(EsterelLSSetup.doLSSetup.getInstance(IHighlighting))
        iHighlightings.add(SCLLSSetup.doLSSetup.getInstance(IHighlighting))
        iHighlightings.add(SCTXLSSetup.doLSSetup.getInstance(IHighlighting))
        val injectorKGraph = KGraphLSSetup.doLSSetup()
        iHighlightings.add(LustreLSSetup.doLSSetup().getInstance(IHighlighting))
        return injectorKGraph.getInstance(KGraphLanguageServerExtension)
    }
}