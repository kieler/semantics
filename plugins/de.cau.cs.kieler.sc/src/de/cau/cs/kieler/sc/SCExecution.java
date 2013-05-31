/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.sim.benchmark.AbstractExecution;
import de.cau.cs.kieler.sim.benchmark.Benchmark;
import de.cau.cs.kieler.sim.kiem.util.KiemUtil;

/**
 * This class is intended to compile and execute SC code.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 */
public class SCExecution extends AbstractExecution {

    /** The Constant COMPILER_DEFAULT. */
    private static final String COMPILER_DEFAULT = "gcc";

    /** The Constant EXECUTABLE_PREFIX. */
    private static final String EXECUTABLE_PREFIX = "SC-GENERATED-EXECUTABLE-";

    /** The path for sc. */
    private static final String SC_PATH = "sc";

    /** The path to scl. */
    private static final String SCL_PATH = "scl";

    /** The scl. */
    private boolean scl;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new sC execution.
     * 
     * @param outputPath
     *            the output path
     * @param cycleCountOrTime
     *            the cycle count or time
     */
    public SCExecution(final String outputPath, final boolean cycleCountOrTime) {
        super(outputPath, cycleCountOrTime);

    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String setCompilerDefault() {
        return COMPILER_DEFAULT;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String buildCompileCommandLine(final List<String> filePaths) {
        // building path to bundle
        Bundle bundle = Platform.getBundle(SCPlugin.PLUGIN_ID);

        URL url = null;
        try {
            // the SC path is the path to the needed SC c files
            if (this.isScl()) {
                url = FileLocator.toFileURL(FileLocator.find(bundle, new Path(SCL_PATH), null));
            } else {
                url = FileLocator.toFileURL(FileLocator.find(bundle, new Path(SC_PATH), null));
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        // if (url == null) {
        // return;
        // }
        String bundleLocation = url.getFile();

        // Windows vs. Linux: Exchange possibly wrong slash/backslash
        bundleLocation = bundleLocation.replaceAll("[/\\\\]+", "\\" + File.separator);
        if (bundleLocation.startsWith("\\")) {
            bundleLocation = bundleLocation.substring(1);
        }
        for (String filePath : filePaths) {
            filePath = filePath.replaceAll("[/\\\\]+", "\\" + File.separator);
            if (filePath.startsWith("\\")) {
                filePath = filePath.substring(1);
            }
        }

        String compile = this.getCompiler();

        StringBuffer compileBuf = new StringBuffer();
        for (String filePath : filePaths) {
            compileBuf.append(" " + filePath);
        }

        compile += compileBuf.toString();

        // If Cycle counting activated include the header
        if (this.isCycleCountOrTime()) {
            compile += " " + bundleLocation + "cycle.h ";
        }

        compile += " "
                // + outPath
                // + "sim.c "
                // + outPath
                // + "sim_data.c "
                // + outPath
                // + "misc.c "
                + bundleLocation + "sc.c " + bundleLocation + "cJSON.c " + " -I " + bundleLocation
                + " " + "-o " + this.getOutputPath() + getExecutableName()
                // -m32 = 32 bit compatibility mode to prevent compiler errors on
                // 64bit machines/architectures.
                // + " -lm -D_SC_NOTRACE  -D_SC_USE_PRE -D_SC_NOASSEMBLER";
                + " -lm  -D_SC_USE_PRE -D_SC_NOASSEMBLER";

        // If debugging AND if no cycle counting, then provide a trace for the
        // SC debug console
        if (!this.isDebug() || this.isCycleCountOrTime()) {
            compile += " -D_SC_NOTRACE ";
        }

        // -D_SC_SUPPRESS_ERROR_DETECT
        // cmot: removed this option for now because of strange error
        // in causality-test @ #define _checkEMIT(s) in sc-generic.h
        // EMAIL to rvh on 16. Jul 2012

        /*
         * -m32"; REMOVED due to error with surefire on 64bit machine:
         * 
         * In file included from /usr/include/string.h:27:0, build 11-Jun-2012 11:42:26 from /var
         * /atlassian/bamboo-data/xml-data/build-dir/KIELER-PLUGIN2-JOB1/test/de.cau.cs.kieler .s.
         * sim.sc.test/target/work/data/test-s/05-simpletransition-inputoutput-communication.c :16:
         * build 11-Jun-2012 11:42:26 /usr/include/features.h:323:26: fatal error: bits/predefs.h:
         * No such file or directory build 11-Jun-2012 11:42:26 compilation terminated. build
         * 11-Jun-2012 11:42:26 In file included from /usr/include/string.h:27:0, build 11-Jun-2012
         * 11:42:26 from /var/atlassian/bamboo-data
         * /xml-data/build-dir/KIELER-PLUGIN2-JOB1/test/de.cau.cs.kieler .s.sim.sc.test/target/work
         * /configuration/org.eclipse.osgi/bundles/67/1/.cp/sc/sc.c:14: build 11-Jun-2012 11:42:26
         * /usr/include/features.h:323:26: fatal error: bits/predefs.h: No such file or directory
         * build 11-Jun-2012 11:42:26 compilation terminated. build 11-Jun-2012 11:42:26 In file
         * included from /usr/include/string.h:27:0, build 11-Jun-2012 11:42:26 from
         * /var/atlassian/bamboo-data/xml-data/build-dir/KIELER-PLUGIN2-JOB1/test/de.cau.cs. kieler
         * .s.sim.sc.test/target/work/configuration/org.eclipse.osgi/bundles/67/1/.cp/sc/cJSON
         * .c:26: build 11-Jun-2012 11:42:26 /usr/include/features.h:323:26: fatal error:
         * bits/predefs.h: No such file or directory build 11-Jun-2012 11:42:26 compilation
         * terminated.
         */
        return compile;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String generateExecutableName(final List<String> filePaths, final String modelName) {
        // choose a random name for the compiled executable
        return EXECUTABLE_PREFIX + KiemUtil.randomString();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String filesPreProcessing(final String filePath) {
        try {
            return addCycleCounterCode(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String buildExecutionCommandLine() {
        // start compiled sc code
        String executable = this.getOutputPath() + getExecutableName() + " ";
        // executable = "C:\\Users\\delphino\\AppData\\Local\\Temp\\SC.exe";
        return executable;
    }

    // -------------------------------------------------------------------------

    // If Cycle counting activated, do the following on all sc files:
    // 1. include header #include<cycle.h>
    // 2. add "ticks t0, t1;" as global variables
    // 3. search for "tick();" and surround with
    // t0 = getticks();
    // tick();
    // t1 = getticks();
    // value = cJSON_CreateObject();
    // cJSON_AddItemToObject(value, "value",
    // cJSON_CreateNumber((double)((double)(t1)-(double)(t0))));
    // cJSON_AddItemToObject(value, "present", cJSON_CreateTrue());
    // cJSON_AddItemToObject(output, "cycles", value);

    /**
     * Adds cycle counter code.
     * 
     * @param filePath
     *            the file path
     * @return the string
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static String addCycleCounterCode(final String filePath) throws IOException {

        String newFilePath = filePath.replace(".c", ".cyclecount.c");

        LinkedList<String> fileContent = new LinkedList<String>();

        // Load original SC file
        FileInputStream fis = new FileInputStream(filePath);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String lineIn;
        while ((lineIn = br.readLine()) != null) {

            // Before the main function, add
            // #include<cycle.h>
            // ticks t0, t1;
            if (lineIn.contains("int main")) {
                fileContent.add("#include<cycle.h>");
                fileContent.add("ticks t0, t1;");
            }

            // Instead of the tick() function add
            // t0 = getticks();
            // tick();
            // t1 = getticks();
            // value = cJSON_CreateObject();
            // cJSON_AddItemToObject(value, "value",
            // cJSON_CreateNumber((double)((double)(t1)-(double)(t0))));
            // cJSON_AddItemToObject(value, "present", cJSON_CreateTrue());
            // cJSON_AddItemToObject(output, "cycles", value);
            if (lineIn.contains("tick();")) {
                fileContent.add("t0 = getticks();");
                fileContent.add("tick();");
                fileContent.add("t1 = getticks();");
                // fileContent.add("value = cJSON_CreateObject();");
                // fileContent.add("cJSON_AddItemToObject(value, \"value\", "
                // + "cJSON_CreateNumber((double)((double)(t1)-(double)(t0))));");
                // fileContent.add("cJSON_AddItemToObject(value, \"present\", cJSON_CreateTrue());");
                fileContent.add("cJSON_AddItemToObject(output, \"" + Benchmark.BENCHMARK_SIGNAL_CYCLES + "\""
                        + ", cJSON_CreateNumber((double)((double)(t1)-(double)(t0))));");
            } else {
                fileContent.add(lineIn);
            }
        }
        br.close();
        fis.close();

        // Write out SC modified file
        PrintWriter out = new PrintWriter(newFilePath);
        for (String lineOut : fileContent) {
            out.println(lineOut);
        }
        out.close();

        return newFilePath;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the scl option (to use scl instead of sc).
     * 
     * @param scl
     *            the scl option to set
     */
    public void setScl(final boolean scl) {
        this.scl = scl;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if the scl option is set.
     * 
     * @return the scl option
     */
    public boolean isScl() {
        return scl;
    }

    // -------------------------------------------------------------------------

}
