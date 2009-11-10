package klp.instructions;

public class Prio extends Instruction {

    private int prio;
    private String reg;
    
    public Prio(String reg, int prio){
	this.reg=reg;
	this.prio=prio;
    }
    
    @Override
    public String toString() {
	return "  PRIO " + reg + " " + prio;
    }

}
