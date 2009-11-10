package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import krp.Krp;

import lustre.Lustre;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import ceq.Program;

import exceptions.ClockException;
import exceptions.TypeException;

import helper.Debug;


/**
 * @author ctr
 * Compile Lustre ec-file to KRP assembler 
 */
public class Ec2krp {

    private String inputFile=null;
    private String outputFile=null;

    private Options options = new Options();

    private String baseName;


    boolean genDot = false;

    int cores = 0;

    
    private void parseArgs(String[] args) {
	CommandLine cmd = null;
	CommandLineParser parser = new GnuParser();
	
	options.addOption("help", false, "show this help and exit");
	options.addOption("verbose", false, "show debug output");
	options.addOption("silent", false, "don't show any output");
	
	options.addOption("dot", false, "print dependency graph");
	options.addOption("lus", false, "generate Lustre code");
	
	
	try {
	    cmd = parser.parse(options, args);
	} catch (ParseException e) {
            usage();
	}

        if (cmd.hasOption("help")) {
            usage();
    	}
        
        genDot = cmd.hasOption("dot");
     	
	Debug.setLevel(Debug.NORMAL);
	if (cmd.hasOption("verbose")){
	    Debug.setLevel(Debug.ALL);
	}
	if (cmd.hasOption("silent")){
	    Debug.setLevel(Debug.SILENT);
	}

	
	if(cmd.getArgs().length != 2){
	    usage();
	}
	
	inputFile = cmd.getArgs()[0];
	cores = Integer.parseInt(cmd.getArgs()[1]);
	
	
	if (inputFile.endsWith(".lus") || inputFile.endsWith(".ec")) {
	    int pos = inputFile.lastIndexOf(".");
	    baseName = inputFile.substring(0, pos);
	    outputFile = inputFile.substring(0, pos) + ".klp";
	} else {
	    System.err.println("unkown filetype for " + inputFile);
	    usage();
	}
    }
    
     private void usage() {
	HelpFormatter formatter = new HelpFormatter();
	formatter.printHelp( "ec2krp [options] input-file.[ec|.lus] #cores",  options );
	System.exit(1);
    }
    
    private void execute() {
	try {
	    Lustre lustre = new Lustre(new FileInputStream(inputFile));
	    
	    String nodeName= outputFile.substring(outputFile.lastIndexOf('/')+1);
	    nodeName=nodeName.substring(0, nodeName.lastIndexOf('.'));
	    
	    Program ceq = lustre.getCEQ();
	    
	    Krp krp = new Krp(nodeName, ceq);
	    krp.propagateConst();
	    krp.init();
	    krp.compile(cores);
	    
	    if (genDot) {
		FileWriter dot = new FileWriter(baseName + "_" + cores + ".dot");
		dot.write(krp.toDot());
		dot.flush();
		dot.close();
	    }
		FileWriter f = new FileWriter(baseName + "_krp" + ".lus");
		f.write(krp.printMain());
		f.write("\n");
		for(int i =0; i< cores; i++){
		    f.write(krp.toLus(i));
		    f.write("\n");
		}
		f.flush();
		f.close();
	} catch (FileNotFoundException e1) {
	    System.err.println(e1.getMessage());
	} catch (IOException e) {
	    e.printStackTrace();
	} catch (ClockException e) {
	    e.printStackTrace();
	} catch (TypeException e) {
	    e.printStackTrace();
	}
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	Ec2krp comp = new Ec2krp();
	comp.parseArgs(args);
	comp.execute();
    }

}
