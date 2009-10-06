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
import java.util.Stack;


import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.program.kep.AddrInstruction;
import de.cau.cs.kieler.krep.evalbench.program.kep.AddrSigWatchInstruction;
import de.cau.cs.kieler.krep.evalbench.program.kep.Instruction;
import de.cau.cs.kieler.krep.evalbench.program.kep.KepSignal;
import de.cau.cs.kieler.krep.evalbench.program.kep.Label;
import de.cau.cs.kieler.krep.evalbench.program.kep.Register;
import de.cau.cs.kieler.krep.evalbench.program.kep.ThreadID;
import de.cau.cs.kieler.krep.evalbench.program.kep.Watcher;
import de.cau.cs.kieler.krep.evalbench.program.kep.parser.kepLexer;
import de.cau.cs.kieler.krep.evalbench.program.kep.parser.kepParser;
import de.cau.cs.kieler.krep.evalbench.ui.views.MessageView;



/**
 * @author ctr
 *
 * integrated interface for kep assembler files
 */
public class KepAssembler implements IAssembler {
    /** Internal list of input signals */
    private LinkedList<Signal> inputs;

    /** Internal list of output signals */
    private LinkedList<Signal> outputs;

    /** Internal list of local signals */
    private LinkedList<Signal> locals;

    /** Internal array of assembler instructions */
    private LinkedList<Instruction> instructions;

    Stack<Integer> watcher_list = new Stack<Integer>();

    HashMap<String, KepSignal> signals = new HashMap<String, KepSignal>();

    // HashMap<String, Signal> localSignals = new HashMap<String, Signal>();
    HashMap<String, Register> registers = new HashMap<String, Register>();

    HashMap<String, Label> labels = new HashMap<String, Label>();

    HashMap<String, ThreadID> threads = new HashMap<String, ThreadID>();

    /** index for all signals */
    private HashMap<String, Integer> signalIndex = new HashMap<String, Integer>();

    private String name;
    
    // private HashMap<String, Integer> labels = new HashMap<String, Integer>();

    /**
     * empty assembler, useless until assemble is called
     */
    public KepAssembler() {
	inputs = new LinkedList<Signal>();
	outputs = new LinkedList<Signal>();
	signalIndex = new HashMap<String, Integer>();
    }


    public int adr2row(final int i) {
	return i;
    }


    public void assemble(final String name, final Reader program) throws ParseException {
	this.name = name;
	boolean error = false;
	String errorMsg;
	// clear();

	try {
	    final kepLexer lex = new kepLexer(new ANTLRReaderStream(program));
	    final CommonTokenStream tokens = new CommonTokenStream(lex);

	    final kepParser parser = new kepParser(tokens);

	    // instructions =
	    parser.program();
	    instructions = parser.getInstructions();
	    inputs = parser.getInputs();
	    outputs = parser.getOutputs();
	    locals = parser.getLocals();

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
	    for (final Signal s : inputs) {
		signalIndex.put(s.getName(), s.getIndex());
	    }

	    for (final Signal s : outputs) {
		  signalIndex.put(s.getName(), s.getIndex());
		  signalIndex.put("TICKWARN", s.getIndex());
	    }

	    for (final Signal s : locals) {
		  signalIndex.put(s.getName(), s.getIndex());
	    }

	    final HashMap<String, String> uniqueLabel = new HashMap<String, String>();
	    int pos = 0;
	    for (final Instruction i : instructions) {
		final String s = i.getLabel();
		for (final String label : i.getLabels()) {
		    labels.put(label, new Label(label, pos));
		    uniqueLabel.put(label, s);
		}
		pos++;
	    }
	    this.postProcess();
	    outputs.add(new Signal("TickWarn", false, null, signalIndex));
	    /*
	     * for (final Instruction i : instructions) {
	     * i.setLabel(uniqueLabel.get(i.getLabel()));
	     * i.asmLabel(label2addr); i.asmSignal(signalIndex); }
	     */
	}
    }


    public void assemble(final String name, final String program) throws ParseException {
	final StringReader in = new StringReader(program);
	assemble(name, in);
    }


    public String canExecute(final Config c) {
	if (!c.isKEP()) {
	    return "wrong processor";
	}
	//KepConfig k = (KepConfig)c;
	// TODO: implement
    return null;
    }


    public LinkedList<Signal> getInputs() {
    	return inputs;
    }


    public String[][] getInstructions() {
	final LinkedList<String[]> res = new LinkedList<String[]>();
	int j = 0;
	for (final Instruction i : instructions) {
	    final String opcode = i.writeObj();
	    final String num = String.valueOf(j++);
	    final String label = i.getLabel();
	    final String instr = i.toString();
	    res.add(new String[] { num, label, instr, opcode });
	}
	return res.toArray(new String[0][0]);
    }


    public String[] getObj(final Config c) {
	LinkedList<String> obj = new LinkedList<String>();
	if (instructions != null) {
	    for (final Instruction i : instructions) {
		obj.add(i.writeObj());
	    }
	}
	return obj.toArray(new String[0]);
    }


    public LinkedList<Signal> getOutputs() {
	return outputs;
    }


    public HashMap<String, Integer> getSignalIndex() {
	return signalIndex;
    }


    public int size() {
	return instructions.size();
    }

    private Watcher getNewWatcher(final int endAddr) {

	if (watcher_list.empty()) {
	    watcher_list.push(endAddr);
	    // max_watchers_needed++;
	    assert watcher_list.size() - 1 == 0 : "watcher Stack emty, but size!=0";
	    return new Watcher(watcher_list.size() - 1);

	} else {
	    // if (watcher_list.peek()>=endAddr){
	    watcher_list.push(endAddr);
	    // max_watchers_needed++;
	    return new Watcher(watcher_list.size() - 1);
	}
	/*
	 * else { watcher_list.pop(); max_watchers_needed--; return
	 * getNewWatcher(endAddr); } }
	 */
    }

    private void postProcess() throws NullPointerException {
	final LinkedList<Instruction> result = new LinkedList<Instruction>();
	for (final Instruction instr : instructions) {
	    if (instr instanceof AddrInstruction) {
		final AddrInstruction aInstr = (AddrInstruction) instr;
		if (aInstr.getAddr().getId() == null) {
		    aInstr.setAddr(getLabel(aInstr.getAddr().getName()));
		    if (instr instanceof AddrSigWatchInstruction) {
			final AddrSigWatchInstruction aswInstr = (AddrSigWatchInstruction) instr;
			if (aswInstr.getWatch() == null) {
			    aswInstr.setWatch(getNewWatcher(aswInstr.getAddr()
				    .getId()));
			    /*
			     * myinst.setSourceCode(myinst .getScource()
			     * .appendContent( "," + ((AddrSigWatchInstruction)
			     * myinst) .getWatch() .getId()));
			     */
			}
		    }
		    result.add(instr);
		} else {
		    result.add(instr);
		}
	    } else {
		result.add(instr);
	    }
	}
	this.instructions = result;
    }

    private de.cau.cs.kieler.krep.evalbench.program.kep.Label getLabel(final String name) {
	return labels.get(name);
    }


    public String getName() {
	return name;
    }

}
