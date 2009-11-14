package de.cau.cs.kieler.krep.compiler.ceq;

import java.util.HashMap;
import java.util.LinkedList;

import de.cau.cs.kieler.krep.compiler.dependencies.DepGraph;
import de.cau.cs.kieler.krep.compiler.klp.Klp;
import de.cau.cs.kieler.krep.compiler.klp.instructions.*;

public class State implements Scope {
    public State(String name, boolean initial) {

        this.initial = initial;
        this.name = name;
        content = new Scade(name);
    }

    private boolean initial;

    private String name;

    private Scade content;

    private LinkedList<Transition> saborts = new LinkedList<Transition>();
    private LinkedList<Transition> waborts = new LinkedList<Transition>();

    public void addSAbort(Transition t) {
        saborts.add(t);
    }

    public void addWAbort(Transition t) {
        waborts.add(t);
    }

    public String toString() {
        String res = (initial ? "initial " : "") + "state " + name + "\n";
        if (!saborts.isEmpty()) {
            res += "unless\n";
            for (Transition t : saborts) {
                res += t.toString() + "\n";
            }
        }
        res += content.toLustre();
        if (!waborts.isEmpty()) {
            res += "until\n";
            for (Transition t : waborts) {
                res += t.toString() + "\n";
            }
        }

        return res;
    }

    public void add(LinkedList<Variable> vars) {
        if (vars != null) {
            for (Variable v : vars) {
                content.addVar(v);
            }
        }
    }

    public void add(Automaton ssm) {
        content.add(ssm);

    }

    public void add(Equation eq) {
        content.add(eq);
    }

    public void addEq(LinkedList<Equation> eq) {
        content.addEq(eq);

    }

    public void propagateConst() {
        content.propagateConst();
    }

    public void simplify() {
        content.simplify();

    }

    public String getName() {
        return name;
    }

    public boolean isInitial() {
        return initial;
    }

    public LinkedList<Instruction> compileBody() {
        Klp klp = new Klp(name, content);
        return klp.compile(true, name);
    }

    public void setIO() {
        content.setIO();
    }

    public LinkedList<Instruction> compileCtrl(String ssm, HashMap<String, State> states,
            int prioOffset) {
        LinkedList<Instruction> res = new LinkedList<Instruction>();

        res.add(new Comment("check strong aborts"));
        for (Transition t : saborts) {
            res.addAll(t.compile(ssm, name, "S"));
        }
        Instruction i = new Prio(ssm, prioOffset + content.depGraph.getMaxPrio() + 1);
        i.setComment("Execute state");
        res.add(i);
        res.add(new Prio(ssm, prioOffset));
        res.add(new Comment("check weak aborts"));
        for (Transition t : waborts) {
            res.addAll(t.compile(ssm, name, "W"));
        }
        res.add(new Done(Label.get(ssm + "_" + name)));

        for (Transition t : saborts) {
            Label l = Label.get(name + "2" + t.getTarget() + "S");
            l.setComment("strong abort from " + name + " to " + t.getTarget());
            res.add(l);
            res.addAll(states.get(t.getTarget()).compileInit(false, false, prioOffset + 1));
            res.add(new Jmp(Label.get(ssm + "_" + t.getTarget())));
        }
        for (Transition t : waborts) {
            Label l = Label.get(name + "2" + t.getTarget() + "W");
            l.setComment("weak abort from " + name + " to " + t.getTarget());
            res.add(l);
            res.addAll(states.get(t.getTarget()).compileInit(false, false, prioOffset + 1));
            res.add(new Done(Label.get(ssm + "_" + t.getTarget())));
        }

        return res;
    }

    public LinkedList<Instruction> compileInit(boolean setInputs, boolean setOutputs, int prioOffset) {
        Klp klp = new Klp(name, content);
        return klp.compileInit(true, name, false, setOutputs, prioOffset);
    }

    public int getMaxPrio() {
        return content.depGraph.getMaxPrio();
    }

    public LinkedList<Variable> getInputs() {
        return content.inputs;
    }

    public LinkedList<Variable> getOutputs() {
        return content.outputs;
    }

    void init() {
        content.init();
    }

    public DepGraph getDepGraph() {
        return content.depGraph;
    }

    public void replace(HashMap<String, Variable> equiv) {
        content.replace(equiv);
        for (Transition t : waborts) {
            t.replace(equiv);
        }
        for (Transition t : saborts) {
            t.replace(equiv);
        }
    }

}
