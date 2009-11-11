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

import de.cau.cs.kieler.krep.compiler.exceptions.ClockException;
import de.cau.cs.kieler.krep.compiler.exceptions.TypeException;
import de.cau.cs.kieler.krep.compiler.helper.Debug;
import de.cau.cs.kieler.krep.compiler.lustre.Lustre;




/**
 * @author ctr
 * Compile ec file inte clock equations and write them again as lustre (or ec) files
 */
public class Ec2ceq {
    private String inputFile=null;
    private String outputFile=null;
    
    private Options options = new Options();

    private void parseArgs(String[] args) {
	CommandLine cmd = null;
	CommandLineParser parser = new GnuParser();
	
	options.addOption("help", false, "show this help and exit");
	options.addOption("v", "verbose", false, "show debug output");
	options.addOption("s", "silent", false, "don't show any output");
	
	try {
	    cmd = parser.parse(options, args);
	} catch (ParseException e) {
	    usage();
	}

        if (cmd.hasOption("help")) {
            usage();
    	}
    
	Debug.setLevel(Debug.NORMAL);
	if (cmd.hasOption("v")){
	    Debug.setLevel(Debug.ALL);
	}
	if (cmd.hasOption("s")){
	    Debug.setLevel(Debug.SILENT);
	}
	
	if(cmd.getArgs().length < 1){
	    usage();
	}
	
	inputFile = cmd.getArgs()[0];
	
	if(cmd.getArgs().length>1){
	    outputFile =cmd.getArgs()[1];
	}else{
	    int pos = inputFile.lastIndexOf(".");
	    if(pos<0){
		usage();
	    }
	    outputFile = inputFile.substring(0, pos) + ".ceq";
	}
    }

    private void usage() {
	HelpFormatter formatter = new HelpFormatter();
	formatter.printHelp( "ec2ceq [options] input-file [output-file]",  options );
	System.exit(1);
    }    
    
    private void execute() {
	try {
	    Lustre lustre = new Lustre(new FileInputStream(inputFile));
	    lustre.setName(inputFile);
	    de.cau.cs.kieler.krep.compiler.ceq.Program prog = lustre.getCEQ();
	    prog.staticEval();
	    prog.propagateConst();
	    prog.removeEquiv();
	    
	    String nodeName= outputFile.substring(outputFile.lastIndexOf('/')+1);
	    nodeName=nodeName.substring(0, nodeName.lastIndexOf('.'));
	    prog.setName(nodeName);
	    
	    FileWriter simple = new FileWriter(outputFile);
	    simple.write((prog.toString()));
	    simple.flush();
	    simple.close();
	} catch (ClockException e){
	    System.err.println(e.toString());	   
	} catch (FileNotFoundException e1) {
	    System.err.println(e1.getMessage());
	} catch (IOException e) {
	    e.printStackTrace();
	} catch (TypeException e) {
	    System.err.println(e.getMessage());
	}
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	Ec2ceq comp = new Ec2ceq();
	comp.parseArgs(args);
	comp.execute();
    }
}
