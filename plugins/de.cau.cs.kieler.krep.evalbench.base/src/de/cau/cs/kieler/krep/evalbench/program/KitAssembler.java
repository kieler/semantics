/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.krep.evalbench.program;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.StringTokenizer;

import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.helpers.StreamGobbler;
import de.cau.cs.kieler.krep.evalbench.helpers.Tracer;

/**
 * @author ctr
 * 
 *         Assembler for Safe State Machines in the Kit format. This is mainly a wrapper for
 *         KepAssembler, into which SSMs are compiled.
 * 
 */
public class KitAssembler implements IAssembler {

    /** Internal array of assembler instructions. */
    private final LinkedList<String> instructions;

    private final KepAssembler kasm;

    private Map<Integer, Integer> lines = null;

    /**
     * generate new empty assembler for kit files.
     */
    public KitAssembler() {
        super();
        kasm = new KepAssembler();
        instructions = new LinkedList<String>();
    }
    /**
     * {@inheritDoc}
     */
    public int adr2row(final int i) {
        if (lines != null) {
            Integer c = lines.get(i);
            if (c != null) {
                return c - 1;
            }
        }
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    public void assemble(final String name, final Reader program) throws ParseException {
        String s = "";
        char c;
        try {
            while (program.ready()) {
                c = (char) (program.read());
                s += c;
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }
        assemble(name, s);

    }

    /**
     * {@inheritDoc}
     */
    public void assemble(final String name, final String program) throws ParseException {
        File kasmFile;
        // get command string for the external assembler
        try {
            // create temporary kasm file and write program content
            final File kitFile = File.createTempFile("temp", ".kit");
            kitFile.deleteOnExit();
            final FileWriter writer = new FileWriter(kitFile);
            writer.write(program);
            writer.flush();
            writer.close();
            // execute external assembler program
            final String fileName = kitFile.getName();
            // final String filePrefix = fileName.substring(0, fileName
            // .lastIndexOf('.'));
            final String[] command = { "/home/esterel/bin/smakc", fileName };
            final Process process = Runtime.getRuntime().exec(command, null,
                    kitFile.getParentFile());
            // any output?

            final StreamGobbler errorGobbler = new StreamGobbler(process.getErrorStream(), "ERROR");

            final StreamGobbler outputGobbler = new StreamGobbler(process.getInputStream(),
                    "OUTPUT");

            errorGobbler.start();
            outputGobbler.start();

            final int exitVal = process.waitFor();
            System.out.println("ExitValue: " + exitVal);

            final String filePrefix = fileName.substring(0, fileName.lastIndexOf('.'));

            // get the created listing file
            kasmFile = new File(kitFile.getParentFile(), filePrefix + ".kasm");
            kasmFile.deleteOnExit();
            final FileReader reader = new FileReader(kasmFile);
            kasm.assemble(name, reader);
            try {
                lines = Tracer.trace(kitFile.getAbsolutePath(), kasmFile.getAbsolutePath());
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable t) {
                t.printStackTrace();
            } finally {
                System.out.println("okay");
            }

            final StringTokenizer token = new StringTokenizer(program, "\n");
            while (token.hasMoreTokens()) {
                instructions.add(token.nextToken());
            }
        } catch (final IOException e) {
            throw new ParseException("Execution of external assembler program failed: "
                    + e.getMessage());
        } catch (InterruptedException e) {
            throw new ParseException("Execution of external assembler program failed: "
                    + e.getMessage());
        }
    }

    /**
     * {@inheritDoc}
     */
    public String canExecute(final Config c) {
        if (!c.isKEP()) {
            return "wrong processor";
        }
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public LinkedList<Signal> getInputs() {
        return kasm.getInputs();
    }

    /**
     * {@inheritDoc}
     */
    public String[][] getInstructions() {
        final LinkedList<String[]> res = new LinkedList<String[]>();
        int j = 0;
        for (final String i : instructions) {
            final String num = String.valueOf(j++);
            res.add(new String[] { num, "", i, "" });
        }
        return res.toArray(new String[0][0]);
    }

    /**
     * {@inheritDoc}
     */
    public String[] getObj(final Config c) {
        return kasm.getObj(c);
    }

    /**
     * {@inheritDoc}
     */
    public LinkedList<Signal> getOutputs() {
        return kasm.getOutputs();
    }

    /**
     * {@inheritDoc}
     */
    public HashMap<String, Integer> getSignalIndex() {
        return kasm.getSignalIndex();
    }

    /**
     * {@inheritDoc}
     */
    public int size() {
        return kasm.size();
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return kasm.getName();
    }
}
