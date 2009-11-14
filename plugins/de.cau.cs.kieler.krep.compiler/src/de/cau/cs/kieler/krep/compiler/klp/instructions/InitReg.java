package de.cau.cs.kieler.krep.compiler.klp.instructions;

import de.cau.cs.kieler.krep.compiler.ceq.Variable.Kind;

public class InitReg extends Instruction {

    private String reg;
    private String clock;
    private String label;

    public InitReg(String reg, Kind kind, String label, String clock) {
        this.reg = reg;
        this.clock = clock;
        this.label = label;
    }

    @Override
    public String toString() {
        String res = "  SETPC";
        res += "\t" + reg;
        res += "\t" + Label.get(label).getName();
        res += "\n";
        if (clock != null) {
            res += "  SETCLK";
            res += "\t" + reg;
            res += "\t" + clock;
        }
        return res;
    }

}
