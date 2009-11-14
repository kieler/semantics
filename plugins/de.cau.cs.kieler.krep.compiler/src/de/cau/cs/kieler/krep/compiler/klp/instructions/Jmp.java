package de.cau.cs.kieler.krep.compiler.klp.instructions;

/**
 * @author ctr uncondintional jump
 */
public class Jmp extends Instruction {

    private Label label;

    /**
     * @param label
     *            to jump to
     */
    public Jmp(Label label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "  " + "JMP\t" + label.getName();
    }

    /*
     * @Override public String getObj() { return writeObj(Opcode.JMP.getCode(), label.getPos(),0,0);
     * }
     */

}
