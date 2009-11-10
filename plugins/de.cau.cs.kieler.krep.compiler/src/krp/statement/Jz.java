package krp.statement;

public class Jz extends Statement {
    String label;
    String test;
    
    public Jz(String test, String label) {
	super();
	this.label = label;
	this.test = test;
    }
     
    @Override
    public String toString() {
	return "JZ " + test + " " +  label;
    }

}
