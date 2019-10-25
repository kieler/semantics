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
package de.cau.cs.kieler.cli.test

import de.cau.cs.kieler.core.Platform
import java.io.File
import java.nio.file.Files
import org.junit.BeforeClass
import org.junit.Test

import static org.junit.Assert.*

/**
 * @author kolja
 * 
 */
class SCChartsCLIParametersTest extends AbstractCLITest {
    static val artifact = new File("../../build/de.cau.cs.kieler.sccharts.cli/target/exe/scc-" + platformExePostfix)
    static val compiler = new File("./bin/scc" + (Platform.isWindows ? ".bat" : "")) // this is needed because if the windows version is used, then the file has to end with .bat

    @BeforeClass
    static def void setUpOnce() throws Exception {
        setupCompiler(artifact, compiler)
    }

    @Test
    def void testTryAllOption() {
        val dir = setupTest("scc-try-all-test")
        val errorSrc = new File(dir, "sctx/error/syntaxerror.sctx")
        val src = new File(dir, "sctx/abo/abo.sctx")
        val dest = new File(dir, "sctx/result")
        if (!dest.exists) dest.mkdir

        // compiler
        val command = #[compiler.path, "-v", "-t", errorSrc.path, src.path, "-o", dest.path]
        assertNotEquals("Exit value not zero", 0, command.invoke)

        // check results
        assertExists(new File(dest, "abo.sctx"))
        val srcContent = new String(Files.readAllBytes(src.toPath))
        val destContent = new String(Files.readAllBytes(new File(dir, "sctx/result/abo.sctx").toPath))
        assertEquals(srcContent.replaceAll("\\s+", ""), destContent.replaceAll("\\s+", ""))
    }

    @Test
    def void testSystemFileOption() {
        val dir = setupTest("scc-system-file-test")
        val src1 = new File(dir, "sctx/abo/abo.sctx")
        val src2 = new File(dir, "sctx/abro/abro.sctx")
        val system = new File(dir, "kico/de.cau.cs.kieler.sccharts.netlist.java.kico")

        // compiler
        val command = #[compiler.path, "-v", "-s", system.path, src1.path, src2.path]
        assertEquals("Exit value not zero", 0, command.invoke)

        // check results
        assertExists(new File(dir, "sctx/abo/ABO.java"))
        assertExists(new File(dir, "sctx/abro/ABRO.java"))
    }

    @Test
    def void testIntermediateOption() {
        val dir = setupTest("scc-intermediate-test")
        val src1 = new File(dir, "sctx/abo/abo.sctx")
        val src2 = new File(dir, "sctx/abro/abro.sctx")
        val dest = new File(dir, "intermediate")
        if (!dest.exists) dest.mkdir

        // compiler
        val command = #[compiler.path, "-v", "-i", "-s", "de.cau.cs.kieler.sccharts.netlist", src1.path, src2.path,
            "-g", dest.path]
        assertEquals("Exit value not zero", 0, command.invoke)

        // check results
        assertTrue("No intermediate models are written to the output directory '" + dest.path + "'", dest.listFiles.size > 0)
        for (model : dest.listFiles) {
            assertTrue("No intermediate models are written to the output directory '" + model.path + "'", model.listFiles.size > 0)
            for (f : model.listFiles)
                assertTrue("Intermediate model '" + f.path + "' does not exist", f.listFiles.size > 0)
        }
    }

    @Test
    def void testFilterOption() {
        val dir = setupTest("scc-filter-test")
        val src = new File(dir, "sctx/filter")
        val dest = new File(dir, "output")
        if (!dest.exists) dest.mkdir

        // compiler
        val command = #[compiler.path, "-v", "-f", "*.sctx", "-s", "de.cau.cs.kieler.sccharts.netlist", src.path, "-o", dest.path]
        assertEquals("Exit value not zero", 0, command.invoke)

        // check results
        assertEquals("There are more output files then expected in '" + dest.path + "'", dest.listFiles.size, 4)
        assertExists(new File(dest, "ABO.c"))
        assertExists(new File(dest, "ABO.h"))
        assertExists(new File(dest, "ABRO.c"))
        assertExists(new File(dest, "ABRO.h"))
    }

    @Test
    def void testPropertyOption() {
        val dir = setupTest("scc-property-test")
        val src = new File(dir, "sctx/abo/abo.sctx")
        val dest = new File(dir, "output")
        if (!dest.exists) dest.mkdir

        // compiler
        val command = #[compiler.path, "-v", "-i", "-P", "de.cau.cs.kieler.kicool.deploy.project.generated.name=test",
            "-s", "de.cau.cs.kieler.sccharts.netlist", src.path, "-o", dest.path, "-g", dest.path]
        assertEquals("Exit value not zero", 0, command.invoke)

        // check results
        assertExists(new File(dest, "test"))
    }

    @Test
    def void testListSystemsOption() {
        // compiler
        val command = #[compiler.path, "--list-systems"]
        val output = newArrayList
        assertEquals("Exit value not zero", 0, command.invoke(output))

        // check results
        assertTrue("There are no public systems available", output.size > 1)
        
        val command2 = #[compiler.path, "--list-all-systems"]
        val output2 = newArrayList
        assertEquals("Exit value not zero", 0, command2.invoke(output2))

        // check results
        assertTrue("There are no systems available", output2.size > 1)
        assertTrue("There are less systems in the all-systems list than in the systems list", output2.size > output.size)
    }
}
