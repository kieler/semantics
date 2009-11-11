package de.cau.cs.kieler.krep.compiler.krp.statement;

public class Recv extends Statement {

    String Name; 
    Integer ID;
    Integer Reg;  
    
        
    public Recv(String name) {
	super();
	Name = name;
    }

    @Override
    public String toString(){
	return "RECV " + Name;
    }
}
