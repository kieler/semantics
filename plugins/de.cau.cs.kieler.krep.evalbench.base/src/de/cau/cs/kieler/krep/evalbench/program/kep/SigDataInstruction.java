package de.cau.cs.kieler.krep.evalbench.program.kep;

public class SigDataInstruction extends SigInstruction {

    Data data;

    public SigDataInstruction(String id, String name, KepSignal sig, Data data,
	    SCLine sc) {
	super(id, name, sig, sc);
	this.data = data;
    }

    public SigDataInstruction(String id, String name, KepSignal sig, SCLine sc) {
	super(id, name, sig, sc);
	this.data = sig.getValue();
    }

    @Override
    public String encode() {
	String res = super.encode();
	if (data != null) {
	    res += data.encode();
	}
	return res;
    }

    @Override
    public String toString() {
	String res = super.toString();
	if (data != null) {
	    res += ", #" +  data.toString();
	}
	return res;
    }

    @Override
    public String info() {
	return super.info() + " " + data.info();
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.Instruction#length()
     */
    @Override
    public int length() {
	int res = super.length();
	if (data != null) {
	    res += data.length();
	}
	return res;
    }

}
