package de.cau.cs.kieler.krep.compiler.klp.instructions;

import de.cau.cs.kieler.krep.compiler.ceq.Variable.Kind;

public class DeclareReg extends Instruction {

    private String reg;
    private Kind kind;

    public DeclareReg(String reg, Kind kind) {
        this.reg = reg;
        this.kind = kind;
    }

    @Override
    public String toString() {
        String res = "";
        switch (kind) {
        case INPUT:
            res += "  INPUT\t\t" + reg;
            break;
        case OUTPUT:
            res += "  OUTPUT\t" + reg;
            break;
        case LOCAL:
            res += "  LOCAL\t\t" + reg;
            break;
        case TEMP: // no need to initialze
            break;
        }
        return res;
    }

}
