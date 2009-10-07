/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.program;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.LinkedList;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.helpers.Tools;
import de.cau.cs.kieler.krep.evalbench.program.klp.Decl;
import de.cau.cs.kieler.krep.evalbench.program.klp.Register;
import de.cau.cs.kieler.krep.evalbench.program.klp.parser.klpLexer;
import de.cau.cs.kieler.krep.evalbench.program.klp.parser.klpParser;
import de.cau.cs.kieler.krep.evalbench.ui.views.MessageView;

/**
 * @author ctr assembler description for the Lustre processor
 */
public class KlpAssembler implements IAssembler {

	/** Internal list of input signals */
	private final LinkedList<Signal> inputs;

	/** Internal list of output signals */
	private final LinkedList<Signal> outputs;

	private HashMap<String, Integer> index;

	/** Internal array of assembler instructions */
	private LinkedList<Instruction> instructions;

	private HashMap<Integer, Integer> rows = new HashMap<Integer, Integer>();

	private int size;

	private String name;

	/**
	 * generate empty assembler description
	 */
	public KlpAssembler() {
		super();
		inputs = new LinkedList<Signal>();
		outputs = new LinkedList<Signal>();
		index = new HashMap<String, Integer>();
		// locals = new LinkedList<Signal>();
		instructions = new LinkedList<Instruction>();
		size = 0;
	}

	public void assemble(final String name, final Reader program)
			throws ParseException {
		this.name = name;
		boolean error = false;
		String errorMsg;
		clear();

		try {
			final klpLexer lex = new klpLexer(new ANTLRReaderStream(program));
			final CommonTokenStream tokens = new CommonTokenStream(lex);

			final klpParser parser = new klpParser(tokens);

			instructions = parser.prog();
			error = parser.getError();
			errorMsg = parser.getErrorMsg();
			if (error) {
				MessageView.print(errorMsg);
			}
		} catch (final IOException e) {
			throw new ParseException(e.getMessage());
		} catch (RecognitionException e) {
			throw new ParseException(e.getMessage());
		}
		if (error) {
			throw new ParseException(errorMsg);
		}
		if (instructions == null) {
			throw new ParseException("unknown error");
		}
		if (!error) {
			size = 0;
			int iIndex = 0;
			HashMap<String, Integer> label2addr = new HashMap<String, Integer>();
			for (final Instruction i : instructions) {
				for (String s : i.getLabels()) {
					label2addr.put(s, iIndex);
				}
				if (i.writeObj() != null) {
					iIndex++;
				}
			}
			iIndex = 0;
			for (final Instruction i : instructions) {
				i.asmLabel(label2addr);
				if (i.writeObj() != null) {
					size++;
				}
				if (i instanceof Decl) {
					final Decl io = (Decl) i;
					final Signal s = io.getSignal();
					if (io.isInput()) {
						inputs.add(s);
						index.put(s.getName(), iIndex);
						iIndex++;
					} else if (io.isOutput()) {
						outputs.add(s);
						index.put(s.getName(), iIndex);
						iIndex++;
					}
				}
			}
		}
	}

	public void assemble(final String name, final String program)
			throws ParseException {
		final StringReader in = new StringReader(program);
		assemble(name, in);
	}

	public String canExecute(final Config c) {
		if (!c.isKLP()) {
			return "wrong processor";
		}
		final KrepConfig k = (KrepConfig) c;
		if (k.getIo() < inputs.size() || k.getIo() < outputs.size()) {
			return "not enough IO";
		}

		if (k.getRegs() < Register.getMax()) {
			return "not enough registers (" + k.getRegs() + "<"
					+ Register.getMax() + ")";
		}
		if (k.getIrom() < size) {
			return "not enough ROM (" + k.getIrom() + "<" + size + ")";
		}
		return null;
	}

	public LinkedList<Signal> getInputs() {
		return inputs;
	}

	public String[][] getInstructions() {
		final LinkedList<String[]> res = new LinkedList<String[]>();
		int j = 0;
		int k = 0;
		for (final Instruction i : instructions) {
			String opcode = i.writeObj();
			String num = "";
			if (opcode == null) {
				opcode = "";
			} else {
				rows.put(j, k);
				num = String.valueOf(j++);
			}
			String label = i.getLabel();
			String instr = i.toString();
			k++;
			res.add(new String[] { num, label, instr, opcode });
		}
		return res.toArray(new String[0][0]);
	}

	public LinkedList<Signal> getOutputs() {
		return outputs;
	}

	public String[] getObj(final Config c) {
		int j = 0;
		LinkedList<String> obj = new LinkedList<String>();
		if (instructions != null) {
			for (final Instruction i : instructions) {
				final String t = i.writeObj();
				if (t != null) {
					obj.add(Tools.toHex(j++) + t);
				}
			}
		}
		return obj.toArray(new String[0]);
	}

	private void clear() {
		inputs.clear();
		outputs.clear();

		Register.clear();
		Decl.clear();
		instructions.clear();
	}

	public HashMap<String, Integer> getSignalIndex() {
		return index;
	}

	public int adr2row(int i) {
		Integer res = rows.get(i);
		if (res == null) {
			return -1; // Out of range
		} else {
			return res;
		}
	}

	public int size() {
		return instructions.size();
	}

	public String getName() {
		return name;
	}

}
