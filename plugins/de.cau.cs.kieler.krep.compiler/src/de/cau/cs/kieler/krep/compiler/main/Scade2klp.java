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
package de.cau.cs.kieler.krep.compiler.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import de.cau.cs.kieler.krep.compiler.ceq.Scade;
import de.cau.cs.kieler.krep.compiler.helper.Debug;
import de.cau.cs.kieler.krep.compiler.klp.Klp;

/**
 * @author ctr Compile Lustre ec-file to KLP assembler
 */
public final class Scade2klp {

    private Scade2klp() {

    }

    private String inputFile = null;
    private String outputFile = null;

    private Options options = new Options();

    private boolean genDot = false;
    private boolean genLus = false;

    private void parseArgs(final String[] args) {
        CommandLine cmd = null;
        CommandLineParser parser = new GnuParser();

        options.addOption("help", false, "show this help and exit");
        options.addOption("verbose", false, "show debug output");
        options.addOption("silent", false, "don't show any output");
        options.addOption("dot", false, "print dependency graph");
        options.addOption("lus", false, "print Lustre code");
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            usage();
        }

        if (cmd.hasOption("help")) {
            usage();
        }

        genDot = cmd.hasOption("dot");
        genLus = cmd.hasOption("lus");

        Debug.setLevel(Debug.NORMAL);
        if (cmd.hasOption("verbose")) {
            Debug.setLevel(Debug.ALL);
        }
        if (cmd.hasOption("silent")) {
            Debug.setLevel(Debug.SILENT);
        }

        if (cmd.getArgs().length != 1) {
            usage();
        }

        inputFile = cmd.getArgs()[0];

        int pos = inputFile.lastIndexOf(".");
        if (pos < 0) {
            usage();
        }
        outputFile = inputFile.substring(0, pos) + ".klp";
    }

    private void usage() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("ec2klp [options] input-file", options);

    }

    private void execute() {
        FileWriter klpFile = null;
        FileWriter dotFile = null;
        FileWriter lusFile = null;
        try {
            Scade scade = new Scade(new FileInputStream(inputFile));

            String nodeName = outputFile.substring(outputFile.lastIndexOf('/') + 1);
            nodeName = nodeName.substring(0, nodeName.lastIndexOf('.'));
            scade.setName(nodeName);

            // Program ceq = lustre.getCEQ();

            Klp prog = new Klp(nodeName, scade);

            prog.propagateConst();
            int wcrt = prog.wcrt();

            prog.compile(true, "");
            try {
                klpFile = new FileWriter(outputFile);
                klpFile.write((prog.toString()));
                klpFile.flush();

                if (genDot) {
                    dotFile = new FileWriter(outputFile.replaceAll(".klp", ".dot"));
                    dotFile.write(prog.toDot());
                    dotFile.flush();
                }
                if (genLus) {
                    lusFile = new FileWriter(outputFile.replaceAll(".klp", ".lus"));
                    lusFile.write(prog.toLustre());
                    lusFile.flush();
                }
            } finally {
                if (klpFile != null) {
                    klpFile.close();
                }
                if (dotFile != null) {
                    dotFile.close();
                }
                if (lusFile != null) {
                    lusFile.close();
                }

            }

            Debug.medium("compiled " + nodeName);
            Debug.medium("\t" + prog.nEq() + " equations");
            Debug.medium("\t" + prog.nInstr() + " instructions");
            Debug.medium("\t" + wcrt + " wcrt");
        } catch (FileNotFoundException e1) {
            System.err.println(e1.getMessage());
            // System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args
     *            source file
     */
    public static void main(final String[] args) {
        Scade2klp comp = new Scade2klp();
        comp.parseArgs(args);
        comp.execute();
    }

}
