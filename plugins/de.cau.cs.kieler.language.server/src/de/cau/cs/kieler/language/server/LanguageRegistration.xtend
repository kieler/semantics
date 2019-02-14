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
import de.cau.cs.kieler.kgraph.text.ide.KGraphLSSetup
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageServerExtension
import java.util.ArrayList
import java.util.List
import org.eclipse.core.runtime.Platform

/**
 * @author sdo
 *
 */
class LanguageRegistration {
    
    def bindAndRegisterLanguages() {
        val injectorKGraph = KGraphLSSetup.doLSSetup()
        val lsSetups = newArrayList
        lsSetups.add(injectorKGraph.getInstance(Platform.getBundle("de.cau.cs.kieler.esterel.ide").loadClass("de.cau.cs.kieler.esterel.ide.EsterelLSSetupContribution") as Class<ILSSetupContribution>).getLSSetup())
        lsSetups.add(injectorKGraph.getInstance(Platform.getBundle("de.cau.cs.kieler.scl.ide").loadClass("de.cau.cs.kieler.scl.ide.SCLLSSetupContribution") as Class<ILSSetupContribution>).getLSSetup())
        lsSetups.add(injectorKGraph.getInstance(Platform.getBundle("de.cau.cs.kieler.lustre.ide").loadClass("de.cau.cs.kieler.lustre.ide.LustreLSSetupContribution") as Class<ILSSetupContribution>).getLSSetup())
        lsSetups.add(injectorKGraph.getInstance(Platform.getBundle("de.cau.cs.kieler.sccharts.ide").loadClass("de.cau.cs.kieler.sccharts.ide.text.SCTXLSSetupContribution") as Class<ILSSetupContribution>).getLSSetup())
        for (lsSetup: lsSetups) {
            lsSetup.doLSSetup()
        }
        return injectorKGraph.getInstance(KGraphLanguageServerExtension)
    }
}