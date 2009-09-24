package de.cau.cs.kieler.krep.evalbench.program.klp;

/**
 * @author ctr
 * Reading access to a register. Can read either previous or current value.
 */
public class Read {
    private Register reg;

    private boolean pre;
    
    /**
     * @param v variable to read from
     * @param pre true if previous value should be read
     */
    public Read(String v, boolean pre) {
	super();
	this.pre = pre;
	this.reg = Register.get(v);
    }

    @Override
    public String toString(){
	if(pre){
	    return "pre(" + reg.toString() + ")";
	}else{
	    return reg.toString();
	}
    }
    

    /**
     * @return KLP id under which the value is stored. The
     * first bits are the register id, followed by the pre flag.
     * 
     */
    public int getId() {
	return 2*reg.getId()+(pre?1:0);
    }
    
}
