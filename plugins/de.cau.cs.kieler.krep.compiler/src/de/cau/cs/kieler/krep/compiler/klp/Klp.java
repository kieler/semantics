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
package de.cau.cs.kieler.krep.compiler.klp;

import java.util.Date;
import java.util.LinkedList;

import de.cau.cs.kieler.krep.compiler.ceq.Automaton;
import de.cau.cs.kieler.krep.compiler.ceq.Equation;
import de.cau.cs.kieler.krep.compiler.ceq.Program;
import de.cau.cs.kieler.krep.compiler.ceq.Variable;
import de.cau.cs.kieler.krep.compiler.ceq.Variable.Kind;
import de.cau.cs.kieler.krep.compiler.helper.Debug;
import de.cau.cs.kieler.krep.compiler.klp.instructions.DeclareReg;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Done;
import de.cau.cs.kieler.krep.compiler.klp.instructions.InitReg;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Instruction;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Label;
import de.cau.cs.kieler.krep.compiler.klp.instructions.Prio;

/**
 * @author ctr Klp Assembler
 */
public class Klp extends Program {

    private boolean useClocks;

    /**
     * Number of input output registers.
     */
    public static final int N_IO = 4;

    /**
     * Number of full local registers.
     */
    public static final int N_LOCAL = 4;

    /**
     * Number of temporary registers.
     */
    public static final int N_TEMP = 4;

    private LinkedList<Instruction> instr = new LinkedList<Instruction>();

    /**
     * @param name
     *            name of the main node
     */
    public Klp(final String name) {
        super(name);
    }

    /**
     * Generate a new program from an existing one.
     * 
     * @param name
     *            of the program
     * @param p
     *            the program
     */
    public Klp(final String name, final Program p) {
        super(name, p);
    }

    /**
     * generate KLP instructions for all equations.
     * 
     * @param useHWClocks
     *            use hardware clocks, if false, a software test for clocks is generated
     * @param scope
     *            scope, if the equations is in a state
     * @return klp instructions that implement the program
     */
    public LinkedList<Instruction> compile(final boolean useHWClocks, final String scope) {
        this.useClocks = useHWClocks;
        init();

        // compute priorities
        for (Equation e : eqs) {
            e.setPrio(depGraph.getPrio(e.getName()));
        }

        int j = 0;
        for (Variable v : vars.values()) {
            if (v.getKind() != Kind.TEMP) {
                j++;
            }
        }

        j++;
        for (Equation e : eqs) {
            Label l = Label.get(e.getName() + "_run" + scope);

            // if(!useClocks && e.hasClock()){
            // done = Label.get(e.getName() + "_done" + scope);
            // instr.add(new CJmp(CJmp.Cond.F, new Read(Variable.get(e.getClock()),false), done));
            // }
            instr.addAll(e.toKlp(useHWClocks, scope, vars));
            // if(!useClocks && e.hasClock()){
            // instr.add(done);
            // }
            instr.add(new Done(l));
        }

        for (Automaton a : ssms) {
            instr.addAll(a.compile(depGraph.getPrio(a.getName())));

        }
        return instr;
    }

    @Override
    public String toString() {
        String res = "# " + name + "\n";
        res += "# compiled: " + new Date().toString() + "\n";
        // Initialize

        for (Instruction i : compileInit(useClocks, "", true, true, 0)) {
            res += i.toString() + "\n";
        }

        // for(Automaton a: ssms){
        // res += a.getKlpHeader();
        // }

        // Running
        res += "\n";
        res += "  DONE\n\n";

        for (Instruction i : instr) {
            res += i.toString() + i.getComment() + "\n";
        }

        return res;
    }

    /**
     * @return number of instructions
     */
    public int nInstr() {
        return instr.size();
    }

    /**
     * @return number of clocked equations
     */
    public int nEq() {
        return eqs.size();
    }

    /**
     * @return dot description of the dependency graph
     */
    public String toDot() {
        return depGraph.toDot(true);
    }

    /**
     * @param useHWClocks should the hw clocks of the klp be used?
     * @param scope scope of this program, if it is inside of an automaton
     * @param setInputs should inputs be initialized (for initial states)
     * @param setOutputs should outputs be initialized (for initial states)
     * @param prioOffset minimal priority to use
     * @return klp code to initialize the registers 
     */
    public LinkedList<Instruction> compileInit(final boolean useHWClocks, final String scope,
            final boolean setInputs, final boolean setOutputs, final int prioOffset) {
        LinkedList<Instruction> res = new LinkedList<Instruction>();
        if (setInputs) {
            for (Variable v : inputs) {
                res.add(new DeclareReg(v.getName(), Kind.INPUT));
            }
        }
        for (Equation e : eqs) {
            String clock = e.getClock();
            Variable v = vars.get(e.getName());
            if (v == null) {
                Debug.high("unknown equation " + e.getName());
            } else {
                if (setOutputs) {
                    res.add(new DeclareReg(v.getName(), v.getKind()));
                }
                res.add(new InitReg(v.getName(), v.getKind(), v.getName() + scope,
                        useHWClocks ? clock : null));
                res.add(new Prio(v.getName(), prioOffset + e.getPrio()));
            }
        }

        for (Automaton ssm : ssms) {
            res.addAll(ssm.compileInit(setInputs, setOutputs, depGraph.getPrio(ssm.getName())));
        }

        return res;
    }

    /**
     * @return number of totally used registers
     */
    public int nReg() {
        return Variable.getMax();
    }

}
