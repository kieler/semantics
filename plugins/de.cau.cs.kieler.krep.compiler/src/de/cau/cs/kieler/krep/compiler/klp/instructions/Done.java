package de.cau.cs.kieler.krep.compiler.klp.instructions;

/**
 * @author ctr
 * Done instruction to indicate the end of the tick
 */
public class Done extends Instruction {

    private Label l;

    /**
     * @param l label from where to start in the next tick
     */
    public Done(Label l) {
	this.l = l;
    }

    @Override
    public String toString() {
	return "  " + "DONE" + "\t" + l.getName();
    }

//    @Override
//    public String getObj() {
//	
//	return writeObj(Opcode.DONE.getCode(), l.getPos(),0,0);
//    }

}
