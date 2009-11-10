package krp.statement;

public class Irmov extends Statement {

    String to;
    Integer val;
    Integer R_to;
    
    
    public Irmov(String to, Integer val) {
	super();
	this.to = to;
	this.val = val;
    }

    @Override
    public String toString() {
	return "IRMOV "+ to + " " + val ;
    }

}
