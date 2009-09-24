package de.cau.cs.kieler.krep.evalbench.program.kep;

public class PrioID extends Identifer {

    public PrioID(int val) throws IllegalArgumentException {

	if (val > Program.constants.max_prio)
	    throw new IllegalArgumentException("Prio ID (" + val
		    + ") is greater then " + Program.constants.max_prio);
	this.id = val;

    }

    public String encode() {
	{
	    String result = "";
	    if (this.id != null) {
		result = super.encode(Program.constants.prio_width);
	    }
	    // else while(result.length()<Constants.prio_width) result+="0";
	    assert result.length() == Program.constants.prio_width : "Opcode length for prio should be "
		    + Program.constants.prio_width
		    + " but is "
		    + result.length() + "!";

	    return result;
	}

    }

    public String toString(){
	return  String.valueOf(id);
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.Identifer#info()
     */
    @Override
    public String info() {
	String result = "";
	while (result.length() < Program.constants.prio_width)
	    result += "p";
	return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.Identifer#length()
     */
    @Override
    public int length() {
	return Program.constants.prio_width;
    }

}
