/******************************************************************************
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
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.program;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;

/**
 * @author ctr interface to external assembler to generate object code from the
 *         kep assembler file
 */
public class KasmAssembler implements IAssembler {

	/** External command to use for assembler execution (default value) */
	public static final String KASM2KLST = "/home/esterel/kep/Misc/scripts/kasm2klst";

	/** Parameter to use for KEP - Esterel */
	public static final String S_KEPE = "kepe";

	/** Parameter to use for KEP - VHDL */
	public static final String S_KEPV = "kepv";

	/** Internal list of input signals */
	private final LinkedList<Signal> inputs;

	/** Internal list of output signals */
	private final LinkedList<Signal> outputs;

	/** Internal array of assembler instructions */
	private String[][] instructions;

	/** Internal array of object code */
	private String[] obj = null;

	/** index for all signals */
	private HashMap<String, Integer> signalIndex;

	private String name = "";

	/**
	 * Creates a new external assembler instance.
	 */
	public KasmAssembler() {
		inputs = new LinkedList<Signal>();
		outputs = new LinkedList<Signal>();
		signalIndex = new HashMap<String, Integer>();
	}

	/**
	 * Gathers signal objects from a string of signal names and stores them into
	 * a list. Signal names are expected to be separated with a space character.
	 * 
	 * @param list
	 *            list where signals are to be stored
	 * @param startIndex
	 *            starting index for the created signals
	 * @param valued
	 *            are the created signals valued?
	 * @param names
	 *            string of signal names
	 * @return the signal index increased by the number of added signals
	 */
	private int gatherSignals(final LinkedList<Signal> list,
			final int startIndex, final boolean valued, final String names) {
		final StringTokenizer tokenizer = new StringTokenizer(names, " ");
		int newIndex = startIndex;

		while (tokenizer.hasMoreTokens()) {
			final Signal signal = new Signal(tokenizer.nextToken(), false,
					valued ? 0 : null, newIndex);
			signalIndex.put(signal.getName(), signal.getIndex());
			newIndex++;
			list.add(signal);
		}
		return newIndex;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.program.IAssembler#assemble(java.lang.String)
	 */
	public void assemble(final String name, final String program)
			throws ParseException {
		this.name = name;
		String[] result;
		// File listFile;
		// clear lists of inputs and outputs
		inputs.clear();
		outputs.clear();

		// parse the listing file
		int pos = 0;
		try {
			final LinkedList<String> instructions = new LinkedList<String>();
			// final BufferedReader reader = new BufferedReader(new FileReader(
			// listFile));
			final BufferedReader reader = new BufferedReader(new StringReader(
					program));
			int signalIndex = 1;
			String line;
			while ((line = reader.readLine()) != null) {
				// detect list of valued input signals
				if (line.startsWith("INPUTV")) {
					signalIndex = gatherSignals(inputs, signalIndex, true, line
							.substring(6));
					pos += line.length() + 1;
				}
				// detect list of pure input signals
				else if (line.startsWith("INPUT")) {
					signalIndex = gatherSignals(inputs, signalIndex, false,
							line.substring(5));
					pos += line.length() + 1;
				}
				// detect list of valued output signals
				else if (line.startsWith("OUTPUTV")) {
					signalIndex = gatherSignals(outputs, signalIndex, true,
							line.substring(7));
					pos += line.length() + 1;
				}
				// detect list of pure output signals
				else if (line.startsWith("OUTPUT")) {
					signalIndex = gatherSignals(outputs, signalIndex, false,
							line.substring(6));
					pos += line.length() + 1;
				}
				// TODO Consider local signals and requirements information
				// read hex code and add to string list
				else if (line.startsWith("[")) {
					final int i1 = line.indexOf('{');
					final int i2 = line.indexOf('}');
					if (i1 < 0 || i2 < 0 || i2 - i1 == 0) {
						throw new ParseException(
								pos
										+ ": Syntax error in listing file: Curly braces with code information expected");
					}
					instructions.add(line.substring(i1 + 1, i2));
				}
			}
			result = instructions.toArray(new String[1]);
		} catch (final IOException e) {
			throw new ParseException(pos
					+ ": Could not read the listing file: " + e.getMessage());
		}

		// read the instructions and labels from the source string
		final LinkedList<String[]> instructions = new LinkedList<String[]>();
		final StringTokenizer tokenizer = new StringTokenizer(program, "\n\r");
		String label = "";
		int instrCount = 0;
		while (tokenizer.hasMoreTokens()) {
			String line = tokenizer.nextToken();
			if (line.startsWith("[")) {
				line = line.substring(line.lastIndexOf('}') + 1); // if
				// (line.length()
				// >= 2 &&
				// !line.startsWith("%")
				int icomment = line.indexOf('%');
				if (icomment > 0) {
					line = line.substring(0, icomment - 1);
				}
				// && !line.startsWith("INPUT") && !line.startsWith("OUTPUT")) {
				final int colonIndex = line.indexOf(':');
				if (colonIndex != -1) {
					label = line.substring(0, colonIndex + 1);
					line = line.substring(colonIndex + 1);
				}
				if (line.length() >= 2) {
					final String[] newInstr = new String[4];
					newInstr[0] = Integer.toString(instrCount);
					instrCount++;
					if (label != null) {
						newInstr[1] = label;
						label = null;
					} else {
						newInstr[1] = "";
					}
					newInstr[2] = line;
					newInstr[3] = result[instructions.size()];
					instructions.add(newInstr);
				}
			}
		}
		this.instructions = instructions.toArray(new String[0][0]);
		obj = result;
	}

	public void assemble(final String name, final Reader program)
			throws ParseException {
		String s = "";
		try {
			while (program.ready()) {
				s += (char) (program.read());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assemble(name, s);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.program.IAssembler#getInputs()
	 */
	public LinkedList<Signal> getInputs() {
		return inputs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.program.IAssembler#getOutputs()
	 */
	public LinkedList<Signal> getOutputs() {
		return outputs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.program.IAssembler#getInstructions()
	 */
	public String[][] getInstructions() {
		return instructions;
	}

	public String canExecute(final Config c) {
		// TODO: implement Configuration for KEP
		return "not yet implemented!";
	}

	public String[] getObj(final Config c) {
		return obj;
	}

	public HashMap<String, Integer> getSignalIndex() {
		return signalIndex;
	}

	public int adr2row(int i) {
		// each instruction is in its row
		return i;
	}

	public int size() {
		return obj.length;
	}

	public String getName() {
		return name;
	}

}
