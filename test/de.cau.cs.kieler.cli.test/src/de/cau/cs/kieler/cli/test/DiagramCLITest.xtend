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
package de.cau.cs.kieler.cli.test

import de.cau.cs.kieler.core.Platform
import java.io.File
import org.junit.BeforeClass
import org.junit.Test

import static org.junit.Assert.*

/** 
 * @author als
 */
class DiagramCLITest extends AbstractCLITest {
    
    static val artifact = new File("../../build/de.cau.cs.kieler.kicool.klighd.cli/target/exe/kicodia-" + platformExePostfix )
    static val compiler = new File("./bin/kicodia" + (Platform.isWindows ? ".bat" : "")) // this is needed because if the windows version is used, then the file has to end with .bat
    
    @BeforeClass
    static def void setUpOnce() throws Exception {
        setupCompiler(artifact, compiler)
    }

    @Test
    def void testListSyntheses() {
        val command = #[compiler.path, "--list-all-syntheses"]
        val output = newArrayList
        assertEquals("Exit value not zero", 0, command.invoke(output))

        // check results
        assertTrue("There are no syntheses registered", output.size > 1)
        assertTrue("The SCCharts Synthesis is missing", output.exists[contains("de.cau.cs.kieler.sccharts.ui.synthesis.SCChartsSynthesis")])
    }

    @Test
    def void testRenderPng() {
        val dir = setupTest("render-png")
        val src = new File(dir, "sctx/abo/abo.sctx")
        val dest = new File(dir, "sctx/abo/abo.result.sctx")
        val dia = new File(dir, "sctx/abo/abo.result.sctx.png")
        
        // compiler
        val command = #[compiler.path, "-vd", "--diagram-format", "PNG", src.path, "-o", dest.path]
        assertEquals("Exit value not zero", 0, command.invoke)
        
        // check results
        assertExists(dia)
    }
    
    @Test
    def void testRenderSvg() {
        val dir = setupTest("render-svg")
        val src = new File(dir, "sctx/abo/abo.sctx")
        val dest = new File(dir, "sctx/abo/abo.result.sctx")
        val dia = new File(dir, "sctx/abo/abo.result.sctx.svg")
        
        // compiler
        val command = #[compiler.path, "-vd", "--diagram-format", "svg", src.path, "-o", dest.path]
        assertEquals("Exit value not zero", 0, command.invoke)
        
        // check results
        assertExists(dia)
    }
}
