package de.cau.cs.kieler.krep.compiler.klp.instructions;

import de.cau.cs.kieler.krep.compiler.ceq.Variable;

/**
 * @author ctr Copy register value to another register
 */
public class Mov extends Instruction {

    private Variable to;
    private Read from;

    /**
     * @param to
     *            target register
     * @param from
     *            source register
     */
    public Mov(Variable to, Read from) {
        this.to = to;
        this.from = from; // new Read(Register.get(v.toString()), pre);
    }

    @Override
    public String toString() {
        String res = "  ";
        switch (from.getType()) {
        case BOOL:
            res += "C";
            break;
        case INT:
            res += "V";
            break;
        case REAL:
            break;
        }
        switch (to.getType()) {
        case BOOL:
            res += "C";
            break;
        case INT:
            res += "V";
            break;
        case REAL:
            break;
        }
        res += "MOV\t" + to.getName() + "\t" + from.toString();
        return res;
    }

    /*
     * @Override public String getObj() { int op=-1; switch(to.getType()){ case BOOL:
     * switch(from.getType()){ case BOOL: op = Opcode.CCMOV.getCode(); break; case INT: op =
     * Opcode.BOOL.getCode(); break; case REAL: op = -1; break; } break; case INT:
     * switch(from.getType()){ case BOOL: op = Opcode.INT.getCode(); break; case INT: op =
     * Opcode.VVMOV.getCode(); break; case REAL: op = -1; break; } break; case REAL: op = -1; }
     * return writeObj(op, 2*to.getId(), from.getId(), 0); }
     */

}
