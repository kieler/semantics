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

import static org.junit.Assert.assertEquals

/** 
 * @author als
 */
class SCChartsCLITest extends AbstractCLITest {
    
    static val artifact = new File("../../build/de.cau.cs.kieler.sccharts.cli/target/exe/scc-" + platformExePostfix)
    static val compiler = new File("./bin/scc" + (Platform.isWindows ? ".bat" : "")) // this is needed because if the windows version is used, then the file has to end with .bat
    
    @BeforeClass
    static def void setUpOnce() throws Exception {
        setupCompiler(artifact, compiler)
    }

    @Test
    def void testSingleCompile() {
        val dir = setupTest("single-compile")
        
        // compiler
        val command = #[compiler.path, "-v", "-s", "de.cau.cs.kieler.sccharts.netlist", new File(dir, "sctx/abo/abo.sctx").path]
        assertEquals("Exit value not zero", 0, command.invoke)
        
        // check results
        assertExists(new File(dir, "sctx/abo/ABO.c"))
        assertExists(new File(dir, "sctx/abo/ABO.h"))
    }
    
    @Test
    def void testMultiCompile() {
        val dir = setupTest("multi-compile")
        
        // compiler
        val command = #[compiler.path, "-v", "-s", "de.cau.cs.kieler.sccharts.netlist", new File(dir, "sctx/abo/abo.sctx").path, new File(dir, "sctx/abro/abro.sctx").path]
        assertEquals("Exit value not zero", 0, command.invoke)
        
        // check results
        assertExists(new File(dir, "sctx/abo/ABO.c"))
        assertExists(new File(dir, "sctx/abo/ABO.h"))
        assertExists(new File(dir, "sctx/abro/ABRO.c"))
        assertExists(new File(dir, "sctx/abro/ABRO.h"))
    }
    
    
    @Test
    def void testComplexCompile() {
        val dir = setupTest("complex-compile")
        
        val wd = new File(dir, "sctx/abo")
        val rel_compiler = new File("../../../../" + compiler.path)
        
        // compiler
        val command = #[rel_compiler.path, "-v", "-s", "de.cau.cs.kieler.sccharts.netlist", "-o", "code", "-ig", "kieler-gen", "abo.sctx"]
        assertEquals("Exit value not zero", 0, command.invoke(wd))
        
        // check results
        assertExists(new File(wd, "code/ABO.c"))
        assertExists(new File(wd, "code/ABO.h"))
        assertExists(new File(wd, "kieler-gen/abo.sctx/27_de.cau.cs.kieler.sccharts.processors.triggerEffect/abo.sctx"))
        assertExists(new File(wd, "kieler-gen/abo.sctx/29_de.cau.cs.kieler.sccharts.scg.processors.SCG/abo.scg"))
    }
}
