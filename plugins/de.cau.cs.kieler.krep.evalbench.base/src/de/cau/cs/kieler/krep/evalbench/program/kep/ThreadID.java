package de.cau.cs.kieler.krep.evalbench.program.kep;

public class ThreadID extends Identifer {
    PrioID prio;

    public ThreadID(int ident, int prio_val)
	    throws IllegalArgumentException {
	PrioID prio;
	try {
	    prio = new PrioID(prio_val);

	} catch (IllegalArgumentException e) {
	    throw new IllegalArgumentException(e.getMessage());
	}
	int idt = ident;
	if (idt > Program.constants.max_threadId)
	    throw new IllegalArgumentException("Thread ID (" + idt
		    + ") is greater then " + Program.constants.max_threadId);
	this.id = idt;
	this.prio = prio;
    }

    public String encode() {
	return "0" + super.encode(Program.constants.threadId_width);

    }

    @Override
    public String toString() {
	return String.valueOf(id);
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.Identifer#info()
     */
    @Override
    public String info() {
	String result = "";
	while (result.length() < Program.constants.threadId_width)
	    result += "T";
	return "0" + result;

    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.Identifer#length()
     */
    @Override
    public int length() {
	return Program.constants.threadId_width + 1;

    }

    public PrioID getPrio() {
	return prio;
    }

}
