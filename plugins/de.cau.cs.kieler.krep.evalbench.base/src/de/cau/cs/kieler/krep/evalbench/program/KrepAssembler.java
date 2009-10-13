///******************************************************************************
// * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
// *
// * http://www.informatik.uni-kiel.de/rtsys/kieler/
// * 
// * Copyright ${year} by
// * + Christian-Albrechts-University of Kiel
// *   + Department of Computer Science
// *     + Real-Time and Embedded Systems Group
// * 
// * This code is provided under the terms of the Eclipse Public License (EPL).
// * See the file epl-v10.html for the license text.
// ******************************************************************************/
//package de.cau.cs.kieler.krep.evalbench.program;
//
//import java.io.IOException;
//import java.io.Reader;
//import java.io.StringReader;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//
//import org.antlr.runtime.ANTLRReaderStream;
//import org.antlr.runtime.CommonTokenStream;
//import org.antlr.runtime.RecognitionException;
//
//import de.cau.cs.kieler.krep.evalbench.comm.Signal;
//import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
//import de.cau.cs.kieler.krep.evalbench.program.krep.Process;
//import de.cau.cs.kieler.krep.evalbench.program.krep.parser.krepLexer;
//import de.cau.cs.kieler.krep.evalbench.program.krep.parser.krepParser;
//
///**
// * @author ctr Assembler description for the Kiel Reactive Processor
// */
//public class KrepAssembler implements IAssembler {
//
//	/** Internal list of input signals */
//	private LinkedList<Signal> inputs;
//
//	/** Internal list of output signals */
//	private LinkedList<Signal> outputs;
//
//	/** Code for the different processes */
//	private List<Process> procs;
//
//	/** Internal array of assembler instructions */
//	private String[][] instructions;
//
//	private LinkedList<String> obj = null;
//
//	/** Mapping from signal names to bus ids */
//	Map<String, Integer> busIds;
//
//	/** Number of used IO signals */
//	private int Max_IO = 0;
//
//	/** Maximal number of used local registers of a process */
//	private int Max_Reg = 0;
//
//	/** Maximal program length of a process */
//	private int Max_ROM = 0;
//
//	private int IO_REG = 4;
//
//	private String name;
//
//	/**
//	 * create empty assembler
//	 */
//	public KrepAssembler() {
//		super();
//		inputs = new LinkedList<Signal>();
//		outputs = new LinkedList<Signal>();
//		procs = new LinkedList<Process>();
//		busIds = new HashMap<String, Integer>();
//	}
//
//	/**
//	 * check whether the assembler can be executed on a given processor
//	 */
//	public String canExecute(Config c) {
//
//		if (!KrepConfig.class.isInstance(c)) {
//			return "wrong processor";
//		}
//		KrepConfig krp = (KrepConfig) c;
//		if (procs.size() <= krp.getCores()) {
//			return "not enough cores";
//		}
//		if (Max_IO <= krp.getIo()) {
//			return "not enough IO";
//		}
//		if (Max_Reg <= krp.getRegs()) {
//			return "not enough registers";
//		}
//		if (Max_ROM <= krp.getIrom()) {
//			return "not enough ROM";
//		}
//		return null;
//	}
//
//	public void assemble(final String name, String program)
//			throws ParseException {
//		assemble(name, new StringReader(program));
//	}
//
//	public void assemble(final String name, final Reader program)
//			throws ParseException {
//		this.name = name;
//
//		// clear lists of inputs and outputs
//		inputs.clear();
//		outputs.clear();
//		procs.clear();
//		busIds.clear();
//
//		try {
//			final krepLexer lex = new krepLexer(new ANTLRReaderStream(program));
//			final CommonTokenStream tokens = new CommonTokenStream(lex);
//
//			final krepParser parser = new krepParser(tokens);
//
//			procs = parser.prog();
//
//		} catch (IOException e) {
//			throw new ParseException(e.toString());
//		} catch (RecognitionException e) {
//			throw new ParseException(e.toString());
//		}
//
//		Max_ROM = setLabel();
//		Max_Reg = allocateRegs();
//		Max_IO = Math.max(inputs.size(), outputs.size());
//		setBusID();
//
//		obj = new LinkedList<String>();
//		LinkedList<String[]> instructions = new LinkedList<String[]>();
//
//		int i = 0;
//		String[] delim = { "", "PROC", "" };
//		for (Process proc : procs) {
//			instructions.add(delim);
//			i = 0;
//			for (String s : proc.getText()) {
//				String[] newInstr = { String.valueOf(i), "", "" };
//				newInstr[2] = s;
//				instructions.add(newInstr);
//				i++;
//			}
//			instructions.add(new String[3]);
//
//			// hex code
//			obj.addAll(proc.getCode());
//		}
//
//		this.instructions = instructions.toArray(new String[0][0]);
//	}
//
//	private int setLabel() {
//		int res = 0;
//		for (Process p : procs) {
//			res = Math.max(res, p.setLabel());
//		}
//		return res;
//	}
//
//	private void setBusID() {
//		busIds.put("", 0); // First real Bus Id is 1
//		int i = 1;
//		// Set inputs
//		for (Signal s : inputs) {
//			busIds.put(s.getName(), busIds.size());
//			i++;
//		}
//		if (i > IO_REG) {
//			System.err.println("Too many input signals");
//		}
//
//		// set dummy inputs
//		for (; i <= IO_REG; i++) {
//			busIds.put("Dummy" + i, i);
//		}
//
//		// set outputs
//		for (Signal s : outputs) {
//			busIds.put(s.getName(), busIds.size());
//			i++;
//		}
//		if (i < 0) {
//			System.err.println("Too many output signals");
//		}
//
//		// set dummy outputs
//		for (; i <= 2 * IO_REG; i++) {
//			busIds.put("Dummy" + i, i);
//		}
//
//		for (Process p : procs) {
//			p.setBusID(busIds);
//		}
//
//		/*
//		 * Set<String> ss = busIds.keySet(); for(String s : ss){
//		 * System.out.println(s + " -> " + busIds.get(s)); }
//		 */
//	}
//
//	private int allocateRegs() {
//		int res = 0;
//		for (Process p : procs) {
//			res = Math.max(res, p.allocateRegs());
//		}
//		return res;
//	}
//
//	/**
//	 * @param p
//	 *            additional process
//	 */
//	public void addProcess(final Process p) {
//		procs.add(p);
//	}
//
//	/**
//	 * add additional external input signal
//	 * 
//	 * @param n
//	 *            name of the signal
//	 */
//	public void addInput(String n) {
//		Signal s = new Signal(n, false, 0, 0);
//		inputs.add(s);
//	}
//
//	/**
//	 * add additional external output signal
//	 * 
//	 * @param n
//	 *            name of the signal
//	 */
//	public void addOutput(final String n) {
//		Signal s = new Signal(n, false, 0, 0);
//		outputs.add(s);
//	}
//
//	public LinkedList<Signal> getInputs() {
//		return inputs;
//	}
//
//	public LinkedList<Signal> getOutputs() {
//		return outputs;
//	}
//
//	public String[][] getInstructions() {
//		return instructions;
//	}
//
//	public String[] getObj(Config c) {
//		return obj.toArray(new String[0]);
//	}
//
//	public HashMap<String, Integer> getSignalIndex() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public int adr2row(int i) {
//		return i;
//	}
//
//	public int size() {
//		return obj.size();
//	}
//
//	public String getName() {
//		return name;
//	}
//
//}
