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
package de.cau.cs.kieler.sccharts.cli

import de.cau.cs.kieler.kicool.cli.KielerCompilerCLI
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.kicool.util.KiCoolUtils
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import picocli.CommandLine
import picocli.CommandLine.Command

/**
 * @author als
 */
@Command(name = "scc")
class SCChartsCompilerCLI extends KielerCompilerCLI {
    
    new () {
        systemId = "de.cau.cs.kieler.sccharts.extended";
        filter = "*.sctx";
    }
    
    static def void main(String[] args) throws Exception {
        val cl = new CommandLine(new SCChartsCompilerCLI())
        System.exit(cl.execute(args))
    }
    
    override getAvailableSystemsMap() {
        return KiCoolRegistration.getSystemModels.filter[KiCoolUtils.hasInput(it, SCCharts)].toMap[id]
    }
    
    override getAvailableInputLanguagesMap() {
        // only support sctx input
        #{"sctx" -> new SCTXStandaloneSetup}
    }
}