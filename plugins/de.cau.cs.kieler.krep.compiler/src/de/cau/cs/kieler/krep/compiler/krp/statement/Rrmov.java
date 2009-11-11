package de.cau.cs.kieler.krep.compiler.krp.statement;

public class Rrmov extends Statement {

    String to, from;
    
    Integer R_to, R_from;
      
    public Rrmov(String to, String from) {
	super();
	this.to = to;
	this.from = from;
    }

    @Override
    public String toString() {
	return "RRMOV "+ to + " " + from; 
    }

}
