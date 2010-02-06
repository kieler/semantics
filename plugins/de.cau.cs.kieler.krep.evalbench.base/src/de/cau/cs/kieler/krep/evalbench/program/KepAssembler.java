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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.program.kep.AddrInstruction;
import de.cau.cs.kieler.krep.evalbench.program.kep.AddrSigWatchInstruction;
import de.cau.cs.kieler.krep.evalbench.program.kep.Emit;
import de.cau.cs.kieler.krep.evalbench.program.kep.Instruction;
import de.cau.cs.kieler.krep.evalbench.program.kep.Label;
import de.cau.cs.kieler.krep.evalbench.program.kep.Watcher;
import de.cau.cs.kieler.krep.evalbench.program.kep.parser.kepLexer;
import de.cau.cs.kieler.krep.evalbench.program.kep.parser.kepParser;

/**
 * 
 * Reads human readable KEP assembler files. This contrast to the KasmAssembler, which uses an
 * externally defined compiler to transform KEP assembler files into object code, before reading
 * them.
 * 
 * @kieler.rating 2010-01-28 proposed yellow ctr
 * 
 * @author ctr
 * 
 */
public class KepAssembler implements IAssembler {
    /** Internal list of input signals. */
    private LinkedList<Signal> inputs;

    /** Internal list of output signals. */
    private LinkedList<Signal> outputs;

    /** Internal list of local signals. */
    private LinkedList<Signal> locals;

    /** Internal array of assembler instructions. */
    private LinkedList<Instruction> instructions;

    private Stack<Integer> watcherList = new Stack<Integer>();

    private HashMap<String, Label> labels = new HashMap<String, Label>();

    /** index for all signals. */
    private HashMap<String, Integer> signalIndex = new HashMap<String, Integer>();

    private String name;

    /**
     * empty assembler, useless until assemble is called.
     */
    public KepAssembler() {
        inputs = new LinkedList<Signal>();
        outputs = new LinkedList<Signal>();
        signalIndex = new HashMap<String, Integer>();
    }

    /**
     * {@inheritDoc}
     */
    public int adr2row(final int i) {
        return i;
    }

    /**
     * {@inheritDoc}
     */
    public void assemble(final String progName, final InputStream program) throws ParseException {
        this.name = progName;
        Reader p = new InputStreamReader(program);
        boolean error = false;
        String errorMsg;

        try {
            final kepLexer lex = new kepLexer(new ANTLRReaderStream(p));
            final CommonTokenStream tokens = new CommonTokenStream(lex);

            final kepParser parser = new kepParser(tokens);

            parser.program();
            instructions = parser.getInstructions();
            inputs = parser.getInputs();
            outputs = parser.getOutputs();
            locals = parser.getLocals();

            error = parser.getError();
            errorMsg = parser.getErrorMsg();
            if (error) {
                throw new ParseException(errorMsg);
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
        }
    }

    /**
     * {@inheritDoc}
     */
    public void assemble(final String progName, final String program) throws ParseException {
        assemble(progName, new ByteArrayInputStream(program.getBytes()));
    }

    /**
     * {@inheritDoc}
     */
    public String canExecute(final IConfig c) {
        if (!c.isKEP()) {
            return "wrong processor";
        }
        // TODO: implement
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public LinkedList<Signal> getInputs() {
        return inputs;
    }

    /**
     * {@inheritDoc}
     */
    public String[][] getInstructions() {
        final int lineSize = 4;
        final LinkedList<String[]> res = new LinkedList<String[]>();
        if (instructions != null) {
            int j = 0;

            for (final Instruction i : instructions) {
                final String opcode = i.writeObj();
                final String num = String.valueOf(j++);
                final String label = i.getLabel();
                final String instr = i.toString();
                res.add(new String[] { num, label, instr, opcode });
            }
        }
        return res.toArray(new String[res.size()][lineSize]);
    }

    /**
     * {@inheritDoc}
     * 
     */
    public String[] getObj(final IConfig c) {
        LinkedList<String> obj = new LinkedList<String>();
        if (instructions != null) {
            for (final Instruction i : instructions) {
                obj.add(i.writeObj());
            }
        }
        return obj.toArray(new String[0]);
    }

    /**
     * {@inheritDoc}
     */
    public LinkedList<Signal> getOutputs() {
        return outputs;
    }

    /**
     * {@inheritDoc}
     */
    public HashMap<String, Integer> getSignalIndex() {
        return signalIndex;
    }

    /**
     * {@inheritDoc}
     */
    public int size() {
        return instructions.size();
    }

    private Watcher getNewWatcher(final int endAddr) {

        if (watcherList.empty()) {
            watcherList.push(endAddr);
            // max_watchers_needed++;
            assert watcherList.size() - 1 == 0 : "watcher Stack emty, but size!=0";
            return new Watcher(watcherList.size() - 1);

        } else {
            watcherList.push(endAddr);
            return new Watcher(watcherList.size() - 1);
        }
    }

    private void postProcess() {
        final LinkedList<Instruction> result = new LinkedList<Instruction>();
        for (final Instruction instr : instructions) {
            if (instr instanceof AddrInstruction) {
                final AddrInstruction aInstr = (AddrInstruction) instr;
                if (aInstr.getAddr().getId() == null) {
                    aInstr.setAddr(getLabel(aInstr.getAddr().getName()));
                    if (instr instanceof AddrSigWatchInstruction) {
                        final AddrSigWatchInstruction aswInstr = (AddrSigWatchInstruction) instr;
                        if (aswInstr.getWatch() == null) {
                            aswInstr.setWatch(getNewWatcher(aswInstr.getAddr().getId()));
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

    private Label getLabel(final String tName) {
        return labels.get(tName);
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    public int getTickLen() {
        if (instructions == null || instructions.size() == 0) {
            return Integer.MAX_VALUE;
        }
        if (!(instructions.getFirst() instanceof Emit)) {
            return Integer.MAX_VALUE;
        }
        Emit e = (Emit) instructions.getFirst();
        if (!e.getSig().getName().equals("_TICKLEN")) {
            return Integer.MAX_VALUE;
        }
        return e.getData().getId();
    }
}
