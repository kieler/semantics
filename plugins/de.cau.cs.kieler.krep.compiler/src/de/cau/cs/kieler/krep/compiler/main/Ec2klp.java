package de.cau.cs.kieler.krep.compiler.main;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import de.cau.cs.kieler.krep.compiler.ceq.Program;
import de.cau.cs.kieler.krep.compiler.exceptions.ClockException;
import de.cau.cs.kieler.krep.compiler.exceptions.TypeException;
import de.cau.cs.kieler.krep.compiler.helper.Debug;
import de.cau.cs.kieler.krep.compiler.klp.Klp;
import de.cau.cs.kieler.krep.compiler.lustre.Lustre;



/**
 * @author ctr Compile Lustre ec-file to KLP assembler
 */
public class Ec2klp {

    private String inputFile = null;
    private String outputFile = null;

    private Options options = new Options();

    private boolean genDot = false;
    private boolean useclocks = true;

    private void parseArgs(String[] args) {
        CommandLine cmd = null;
        CommandLineParser parser = new GnuParser();

        options.addOption("help", false, "show this help and exit");
        options.addOption("verbose", false, "show debug output");
        options.addOption("silent", false, "don't show any output");
        options.addOption("dot", false, "print dependency graph");
        options.addOption("noclocks", false, "do not use KLP clocks");

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            usage();
        }

        if (cmd.hasOption("help")) {
            usage();
        }

        genDot = cmd.hasOption("dot");
        useclocks = !cmd.hasOption("noclocks");

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
        System.exit(1);
    }

    public String compile(String name, InputStream ec) {
        try {
            Lustre lustre;

            lustre = new Lustre(ec);

            lustre.setName(name);

            Program ceq = lustre.getCEQ();

            Klp prog = new Klp(name, ceq);

            prog.propagateConst();
           
            prog.compile(useclocks, "");
            return prog.toString();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClockException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TypeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "START: DONE START";

    }

    private void execute() {
        FileWriter klpFile = null;
        FileWriter dotFile = null;
        try {
            Lustre lustre = new Lustre(new FileInputStream(inputFile));

            String nodeName = outputFile.substring(outputFile.lastIndexOf('/') + 1);
            nodeName = nodeName.substring(0, nodeName.lastIndexOf('.'));
            lustre.setName(nodeName);

            Program ceq = lustre.getCEQ();

            Klp prog = new Klp(nodeName, ceq);

            prog.propagateConst();
            int wcrt = prog.wcrt();

            prog.compile(useclocks, "");
            try {
                klpFile = new FileWriter(outputFile);
                klpFile.write((prog.toString()));
                klpFile.flush();

                if (genDot) {
                    dotFile = new FileWriter(outputFile.replaceAll(".klp", ".dot"));
                    dotFile.write(prog.toDot());
                    dotFile.flush();
                }
            } finally {
                if (klpFile != null) {
                    klpFile.close();
                }
                if (dotFile != null) {
                    dotFile.close();
                }

            }

            Debug.medium("compiled " + nodeName);
            Debug.medium("\t" + prog.nEq() + " equations");
            Debug.medium("\t" + prog.nReg() + " registers");
            Debug.medium("\t" + prog.nInstr() + " instructions");
            Debug.medium("\t" + wcrt + " wcrt");
        } catch (FileNotFoundException e1) {
            System.err.println(e1.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Ec2klp comp = new Ec2klp();
        comp.parseArgs(args);
        comp.execute();
    }

}
