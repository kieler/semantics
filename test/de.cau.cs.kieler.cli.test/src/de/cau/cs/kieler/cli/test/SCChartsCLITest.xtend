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

import java.io.File
import org.junit.BeforeClass
import org.junit.Test

import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertTrue

/** 
 * @author als
 */
class SCChartsCLITest extends AbstractCLITest {
    
    static val artifact = new File("../../build/de.cau.cs.kieler.sccharts.cli/target/exe/scc-" + platformExe)
    static val compiler = new File("./bin/scc")
    
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
}
