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

import java.io.Reader;
import java.util.HashMap;
import java.util.LinkedList;

import de.cau.cs.kieler.krep.editors.klp.klp.Binop;
import de.cau.cs.kieler.krep.editors.klp.klp.CJmp;
import de.cau.cs.kieler.krep.editors.klp.klp.Decl;
import de.cau.cs.kieler.krep.editors.klp.klp.Done;
import de.cau.cs.kieler.krep.editors.klp.klp.Instruction;
import de.cau.cs.kieler.krep.editors.klp.klp.Jmp;
import de.cau.cs.kieler.krep.editors.klp.klp.KLP;
import de.cau.cs.kieler.krep.editors.klp.klp.Label;
import de.cau.cs.kieler.krep.editors.klp.klp.Line;
import de.cau.cs.kieler.krep.editors.klp.klp.Move;
import de.cau.cs.kieler.krep.editors.klp.klp.Prio;
import de.cau.cs.kieler.krep.editors.klp.klp.Read;
import de.cau.cs.kieler.krep.editors.klp.klp.Reg;
import de.cau.cs.kieler.krep.editors.klp.klp.Scope;
import de.cau.cs.kieler.krep.editors.klp.klp.SetClk;
import de.cau.cs.kieler.krep.editors.klp.klp.SetPC;
import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.helpers.Tools;
import de.cau.cs.kieler.krep.evalbench.program.kep.Register;
import de.cau.cs.kieler.krep.evalbench.program.klp.Opcode;

/*import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import de.cau.cs.kieler.krep.editors.klp.klp.Binop;
import de.cau.cs.kieler.krep.editors.klp.klp.CJmp;
import de.cau.cs.kieler.krep.editors.klp.klp.KLP;
import de.cau.cs.kieler.krep.editors.klp.klp.Line;
import de.cau.cs.kieler.krep.editors.klp.klp.Prio;
import de.cau.cs.kieler.krep.editors.klp.klp.Read;
import de.cau.cs.kieler.krep.editors.klp.klp.Reg;
import de.cau.cs.kieler.krep.editors.klp.klp.Scope;
import de.cau.cs.kieler.krep.editors.klp.klp.SetClk;
import de.cau.cs.kieler.krep.editors.klp.klp.SetPC;
import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.helpers.Tools;
import de.cau.cs.kieler.krep.evalbench.program.klp.Decl;
import de.cau.cs.kieler.krep.evalbench.program.klp.Opcode;
import de.cau.cs.kieler.krep.evalbench.program.klp.Register;
import de.cau.cs.kieler.krep.evalbench.program.klp.parser.klpLexer;
import de.cau.cs.kieler.krep.evalbench.program.klp.parser.klpParser;
import de.cau.cs.kieler.krep.evalbench.ui.views.MessageView;
*/

/**
 * @author ctr assembler description for the Lustre processor
 */
public class KlpAssembler implements IAssembler {

    /** Internal list of input signals. */
    private final LinkedList<Signal> inputs;

    /** Internal list of output signals. */
    private final LinkedList<Signal> outputs;

    private HashMap<String, Integer> index;

    /** Internal array of assembler instructions. */
    private LinkedList<de.cau.cs.kieler.krep.evalbench.program.Instruction> instructions;

    private KLP model = null;

    private HashMap<Integer, Integer> rows = new HashMap<Integer, Integer>();

    private int size;

    private String name;

    /**
     * generate empty assembler description.
     */
    public KlpAssembler() {
        super();
        inputs = new LinkedList<Signal>();
        outputs = new LinkedList<Signal>();
        index = new HashMap<String, Integer>();
        // instructions = new LinkedList<Instruction>();
        size = 0;
    }

    /**
     * @param name
     *            Name of the model
     * @param model
     *            model parsed by xtext parser
     * @throws ParseException
     */
    public void assemble(final String name, final KLP model)
            throws ParseException {
        this.name = name;
        this.model = model;
        HashMap<String, Integer> label2addr = new HashMap<String, Integer>();
        HashMap<String, Integer> regs = new HashMap<String, Integer>();
        size = 0;
        int iIndex = 0;
        for (Line l : model.getInstructions()) {
            if (l.getLabels() != null) {
                for (String s : l.getLabels()) {
                    label2addr.put(s, iIndex);
                }
            }
            iIndex++;
            Instruction i = l.getInstruction();
            if (i instanceof Decl) {
                Decl s = (Decl) i;
                addSignal(s);
                regs.put(s.getReg().getName(), regs.size());
                if (s.getScope() == Scope.LOCAL) {
                    iIndex--;
                }
            }
        }

        for (Line l : model.getInstructions()) {
            initialize(l.getInstruction(), label2addr, regs);
        }

    }

    private void initialize(final Instruction instruction,
            HashMap<String, Integer> label2addr, HashMap<String, Integer> regs) {
        if (instruction instanceof Decl) {
            Decl i = (Decl) instruction;
            setRegs(i.getReg(), regs);
            setOpcode(i);
        } else if (instruction instanceof Binop) {
            Binop i = (Binop) instruction;
            setRegs(i.getTo(), regs);
            setRegs(i.getArg1().getReg(), regs);
            if (i.getArg2() != null) {
                setRegs(i.getArg2().getReg(), regs);
            }
            setOpcode(i);
        } else if (instruction instanceof CJmp) {
            CJmp i = (CJmp) instruction;
            setOpcode(i);
            setRegs(i.getReg(), regs);
            i.getLabel().setAddr(label2addr.get(i.getLabel().getName()));
        } else if (instruction instanceof Done || instruction == null) {
            Done i = null;
            if (instruction == null) {
                i = new de.cau.cs.kieler.krep.editors.klp.klp.impl.DoneImpl();
            } else {
                i = (Done) instruction;
            }
            i.setOpcode0(Opcode.DONE.getCode());
            if (i.getPc() != null) {
                i.getPc().setAddr(label2addr.get(i.getPc().getName()));
            }
        } else if (instruction instanceof Jmp) {
            Jmp i = (Jmp) instruction;
            i.setOpcode0(Opcode.JMP.getCode());
            i.getLabel().setAddr(label2addr.get(i.getLabel().getName()));
            i.setOpcode1(i.getLabel().getAddr());
        } else if (instruction instanceof Move) {
            Move i = (Move) instruction;
            // res = i.getType().getName().toUpperCase() + " " +
            // printReg(i.getTo()) + " ";
            // if (i.getFrom() != null) {
            // res += i.getFrom().getReg();
            // } else {
            // res += i.getVal();
            // }
        } else if (instruction instanceof Prio) {
            Prio i = (Prio) instruction;
            if (i.getReg() != null) {
                setRegs(i.getReg(), regs);
            }
            setOpcode(i);
        } else if (instruction instanceof SetClk) {
            SetClk i = (SetClk) instruction;
            setRegs(i.getReg(), regs);
            setRegs(i.getClk(), regs);
            setOpcode(i);
        } else if (instruction instanceof SetPC) {
            SetPC i = (SetPC) instruction;
            setRegs(i.getReg(), regs);
            i.getLabel().setAddr(label2addr.get(i.getLabel().getName()));
            setOpcode(i);
        }
    }

    private void setOpcode(Prio i) {
        i.setOpcode0(Opcode.PRIO.getCode());
        i.setOpcode1(i.getPrio());
    }

    private void setOpcode(SetClk i) {
        i.setOpcode0(Opcode.SETCLK.getCode());
        i.setOpcode1(i.getReg().getId());
        i.setOpcode2(i.getClk().getId());
    }

    private void setOpcode(SetPC i) {
        i.setOpcode0(Opcode.SETPC.getCode());
        i.setOpcode1(i.getReg().getId());
        i.setOpcode2(i.getLabel().getAddr());
    }

    private void setRegs(Read reg, HashMap<String, Integer> regs) {
        setRegs(reg.getReg(), regs);
    }

    private void setOpcode(CJmp i) {
        switch (i.getCond()) {
        case JT:
            i.setOpcode0(Opcode.JT.getCode());
            break;
        case JF:
            i.setOpcode0(Opcode.JF.getCode());
            break;
        case JZ:
            i.setOpcode0(Opcode.JZ.getCode());
            break;
        case JNZ:
            i.setOpcode0(Opcode.JNZ.getCode());
            break;
        }
        i.setOpcode1(i.getReg().getReg().getId());
        i.setOpcode2(i.getLabel().getAddr());
    }

    private void setOpcode(final Binop i) {
        i.setOpcode1(i.getTo().getId());
        i.setOpcode2(i.getArg1().getReg().getId());
        if (i.getArg2() != null) {
            switch (i.getOp()) {
            case ADD:
                i.setOpcode0(Opcode.ADD.getCode());
                break;
            case SUB:
                i.setOpcode0(Opcode.SUB.getCode());
                break;
            case DIV:
                i.setOpcode0(Opcode.DIV.getCode());
                break;
            case MUL:
                i.setOpcode0(Opcode.MUL.getCode());
                break;
            case AND:
                i.setOpcode0(Opcode.AND.getCode());
                break;
            case OR:
                i.setOpcode0(Opcode.OR.getCode());
                break;
            case XOR:
                i.setOpcode0(Opcode.XOR.getCode());
                break;
            case LE:
                i.setOpcode0(Opcode.LE.getCode());
                break;
            case LT:
                i.setOpcode0(Opcode.LT.getCode());
                break;
            case EQ:
                i.setOpcode0(Opcode.EQ.getCode());
                break;
            case GE:
                i.setOpcode0(Opcode.GE.getCode());
                break;
            case GT:
                i.setOpcode0(Opcode.GT.getCode());
                break;
            case NEQ:
                i.setOpcode0(Opcode.NEQ.getCode());
                break;
            }
            i.setOpcode3(i.getArg2().getReg().getId());
        } else {
            // immediate
            switch (i.getOp()) {
            case ADD:
                i.setOpcode0(Opcode.IADD.getCode());
                break;
            case SUB:
                i.setOpcode0(Opcode.ISUB.getCode());
                break;
            case DIV:
                i.setOpcode0(Opcode.IDIV.getCode());
                break;
            case MUL:
                i.setOpcode0(Opcode.IMUL.getCode());
                break;
            case AND:
                i.setOpcode0(Opcode.IAND.getCode());
                break;
            case OR:
                i.setOpcode0(Opcode.IOR.getCode());
                break;
            case XOR:
                i.setOpcode0(Opcode.IXOR.getCode());
                break;
            case LE:
                i.setOpcode0(Opcode.ILE.getCode());
                break;
            case LT:
                i.setOpcode0(Opcode.ILT.getCode());
                break;
            case EQ:
                i.setOpcode0(Opcode.IEQ.getCode());
                break;
            case GE:
                i.setOpcode0(Opcode.IGE.getCode());
                break;
            case GT:
                i.setOpcode0(Opcode.IGT.getCode());
                break;
            case NEQ:
                i.setOpcode0(Opcode.INEQ.getCode());
                break;
            }
            i.setOpcode3(i.getVal());
        }
    }

    private void setOpcode(Decl i) {
        switch (i.getScope()) {
        case INPUT:
            i.setOpcode0(Opcode.INPUT.getCode());
            break;
        case OUTPUT:
            i.setOpcode0(Opcode.OUTPUT.getCode());
            break;
        }
        i.setOpcode1(i.getReg().getId());
    }

    private void setRegs(Reg reg, HashMap<String, Integer> regs) {
        Integer id = regs.get(reg.getName());
        if (id == null) {
            reg.setId(regs.size());
            regs.put(reg.getName(), regs.size());
        } else {
            reg.setId(id);
        }

    }

    private void addSignal(Decl decl) {
        Signal s = new Signal(decl.getReg().getName(), false, 0, 0);
        switch (decl.getScope()) {
        case INPUT:
            inputs.add(s);
            break;
        case OUTPUT:
            outputs.add(s);
            break;
        default:
            // nothing to do
        }
    }

    /*public void assemble(final String name, final Reader program)
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
    }*/

    public String canExecute(final Config c) {
        if (!(c instanceof KrepConfig)) {
            return "wrong processor";
        }
        final KrepConfig k = (KrepConfig) c;
        if (k.getIo() < inputs.size() || k.getIo() < outputs.size()) {
            return "not enough IO";
        }

        // if (k.getRegs() < Register.getMax()) {
        // return "not enough registers (" + k.getRegs() + "<";
        // + Register.getMax() + ")";
        // }
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
        if (model != null) {
            for (Line line : model.getInstructions()) {
                String num = String.valueOf(j++);
                String label = "";
                if (line.getLabels() != null && line.getLabels().size() > 0) {
                    label = line.getLabels().get(0);
                }
                String i = print(line.getInstruction());
                String opcode = getOpcode(line.getInstruction());
                if (line.getInstruction() == null
                        || line.getInstruction().getOpcode0() == 0) {
                    num = "";
                    opcode = "";
                }
                res.add(new String[] { num, label, i, opcode });
            }
        } /*else {

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
          }*/
        return res.toArray(new String[0][0]);
    }

    private static String padByte(int b) {
        String res = Integer.toHexString(b).toUpperCase();
        if (res.length() < 2) {
            res = "0" + res;
        } else if (res.length() > 2) {
            res = res.substring(res.length() - 2);
        }
        return res;
    }

    private String getOpcode(Instruction instr) {
        if (instr == null) {
            return "";
        } else {
            return padByte(instr.getOpcode0()) + padByte(instr.getOpcode1())
                    + padByte(instr.getOpcode2()) + padByte(instr.getOpcode3());
        }
    }

    // print Label with associated address
    private String printLabel(Label label) {
        return label.getName() + " (" + label.getAddr() + ")";
    }

    private String printReg(Reg reg) {
        return reg.getName() + " (" + reg.getId() + ")";
    }

    private String printRead(Read read) {
        String res = printReg(read.getReg());
        if (read.isPre()) {
            res = "PRE(" + res + ")";
        }
        return res;
    }

    private String print(Instruction instr) {
        // ugly solution, should use dynamic dispatching instead
        String res = "";
        if (instr instanceof Decl) {
            Decl i = (Decl) instr;

            res = i.getScope().getName().toUpperCase() + " "
                    + printReg(i.getReg());
        } else if (instr instanceof Binop) {
            Binop i = (Binop) instr;
            res = i.getOp().getName().toUpperCase() + " " + printReg(i.getTo())
                    + " " + printRead(i.getArg1()) + " ";
            if (i.getArg2() != null) {
                res += printRead(i.getArg2());
            } else {
                res += i.getVal();
            }
        } else if (instr instanceof CJmp) {
            CJmp i = (CJmp) instr;
            res = "J" + i.getCond() + " " + printLabel(i.getLabel()) + " "
                    + i.getReg() + "(";
        } else if (instr instanceof Done) {
            Done i = (Done) instr;
            res = "DONE";
            if (i.getPc() != null) {
                res += " " + printLabel(i.getPc());
            }
        } else if (instr instanceof Jmp) {
            Jmp i = (Jmp) instr;
            res = "JMP " + printLabel(i.getLabel());
        } else if (instr instanceof Move) {
            Move i = (Move) instr;
            res = i.getType().getName().toUpperCase() + " "
                    + printReg(i.getTo()) + " ";
            if (i.getFrom() != null) {
                res += i.getFrom().getReg();
            } else {
                res += i.getVal();
            }
        } else if (instr instanceof Prio) {
            Prio i = (Prio) instr;
            res = "PRIO " + printReg(i.getReg()) + " " + i.getPrio();
        } else if (instr instanceof SetClk) {
            SetClk i = (SetClk) instr;
            res = "SETCLK " + printReg(i.getReg()) + " " + i.getClk();
        } else if (instr instanceof SetPC) {
            SetPC i = (SetPC) instr;
            res = "SETPC " + printReg(i.getReg()) + " "
                    + printLabel(i.getLabel());
        } else {
            res = "error";
        }
        return res;
    }

    public LinkedList<Signal> getOutputs() {
        return outputs;
    }

    public String[] getObj(final Config c) {
        int j = 0;
        LinkedList<String> obj = new LinkedList<String>();
        /*  if (instructions != null) {
              for (final Instruction i : instructions) {
                  final String t = i.writeObj();
                  if (t != null) {
                      obj.add(Tools.toHex(j++) + t);
                  }
              }
          }*/
        return obj.toArray(new String[obj.size()]);
    }

    private void clear() {
        inputs.clear();
        outputs.clear();

        // Register.clear();
        // Decl.clear();
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

    public void assemble(String name, String program) throws ParseException {
        // TODO Auto-generated method stub

    }

    public void assemble(String name, Reader program) throws ParseException {
        // TODO Auto-generated method stub

    }

}
