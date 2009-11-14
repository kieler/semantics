package de.cau.cs.kieler.krep.compiler.krp.statement;

public class Send extends Statement {

    String Name;
    Integer ID;
    Integer Reg;

    public Send(String name) {
        super();
        Name = name;
    }

    @Override
    public String toString() {
        return "SEND " + Name;
    }

}
