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
 * Assembler for Safe State Machines in the Kit format. This is mainly a wrapper 
 * for KepAssembler, into which SSMs are compiled. 
 *
 */
public class KitAssembler implements IAssembler {
    /** Internal list of input signals */
    //private LinkedList<Signal> inputs;

    /** Internal list of output signals */
    //private LinkedList<Signal> outputs;

    /** Internal list of local signals */
    //private LinkedList<Signal> locals;

    /** Internal array of assembler instructions */
    private final LinkedList<String> instructions;

   

    /** index for all signals */
    private HashMap<String, Integer> signalIndex = new HashMap<String, Integer>();

    private final KepAssembler kasm;
    
    private Map<Integer, Integer> lines=null;
    
    /**
     * generate new empty assembler for kit files
     */
    public KitAssembler() {
	super();
	kasm = new KepAssembler();
	signalIndex = new HashMap<String, Integer>();
	instructions = new LinkedList<String>();
    }


    public int adr2row(final int i) {
	if(lines!=null){
	    Integer c = lines.get(i);
	    if(c!=null ){
		return c-1;
	    }
	}
	return 0;
    }


    public void assemble(final String name, final Reader program) throws ParseException {
	String s = new String();
	char c;
	try {
	    while (program.ready()) {
		c= (char) (program.read());
		s += c;
	    }
	} catch (final IOException e) {
	    e.printStackTrace();
	}
	assemble(name, s);
	
    }

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
	    //final String filePrefix = fileName.substring(0, fileName
	    //	    .lastIndexOf('.'));
	    final String[] command = { "/home/esterel/bin/smakc", fileName };
	    final Process process = Runtime.getRuntime().exec(command, null,
		    kitFile.getParentFile());
	    // any output?

	    final StreamGobbler errorGobbler = new StreamGobbler(process
		    .getErrorStream(), "ERROR");

	    final StreamGobbler outputGobbler = new StreamGobbler(process
		    .getInputStream(), "OUTPUT");

	    errorGobbler.start();
	    outputGobbler.start();

	    final int exitVal = process.waitFor();
	    System.out.println("ExitValue: " + exitVal);
	    
	    final String filePrefix = fileName.substring(0, fileName
		    .lastIndexOf('.'));
	    
	    // get the created listing file
	    kasmFile = new File(kitFile.getParentFile(), filePrefix + ".kasm");
	    kasmFile.deleteOnExit();
	    final FileReader reader = new FileReader(kasmFile);
	    kasm.assemble(name, reader);
	    try{
		lines = Tracer.trace(kitFile.getAbsolutePath(), kasmFile.getAbsolutePath());
	    }catch (Exception e){
		e.printStackTrace();
	    }catch(Throwable t){
		t.printStackTrace();
		}finally{
		System.out.println("okay");
	    }
	    
	    final StringTokenizer token = new StringTokenizer(program, "\n");
	    while(token.hasMoreTokens()){
		instructions.add(token.nextToken());
	    }
	} catch (final Exception e) {
	    throw new ParseException(
		    "Execution of external assembler program failed: "
			    + e.getMessage());
	}
    }

    public String canExecute(final Config c) {
	if (!c.isKEP()) {
	    return "wrong processor";
	}
	// TODO Auto-generated method stub
	return null;
    }

    public LinkedList<Signal> getInputs() {
	return kasm.getInputs();
    }

    public String[][] getInstructions() {
	final LinkedList<String[]> res = new LinkedList<String[]>();
	int j = 0;
	for (final String i : instructions) {
	    final String num = String.valueOf(j++);
	    res.add(new String[] { num, "", i, "" });
	}
	return res.toArray(new String[0][0]);
    }

    public String[] getObj(final Config c) {
	return kasm.getObj(c);
    }

    public LinkedList<Signal> getOutputs() {
	return kasm.getOutputs();
    }


    public HashMap<String, Integer> getSignalIndex() {
	return kasm.getSignalIndex();
    }


    public int size() {
	return kasm.size();
    }


    public String getName() {
	return kasm.getName();
    }
}