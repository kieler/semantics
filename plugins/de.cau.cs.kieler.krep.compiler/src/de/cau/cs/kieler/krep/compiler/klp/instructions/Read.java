package de.cau.cs.kieler.krep.compiler.klp.instructions;

import de.cau.cs.kieler.krep.compiler.ceq.VarAccess;
import de.cau.cs.kieler.krep.compiler.ceq.Variable;
import de.cau.cs.kieler.krep.compiler.prog.Type;

/**
 * @author ctr
 * Reading access to a register. Can read either previous or current value.
 */
public class Read {
    private Variable v;

    private boolean pre;
    
    /**
     * @param v variable to read from
     * @param pre true if previous value should be read
     */
    public Read(Variable v, boolean pre) {
	super();
	this.pre = pre;
	this.v = v;
    }

    /**
     * @param v CEQ access to a variable
     */
    public Read(VarAccess v) {
	super();
	this.pre = v.isPre();
	this.v = Variable.get(v.getName());
    }

    @Override
    public String toString(){
	String res = new String();
	if(pre){
	    res += "pre(";
	}
	res += v.getName();
	if(pre){
	    res +=")";
	}
	return res;
    }
    
    /**
     * @return Type of the variable
     */
    public Type getType(){
	return v.getType();
    }

    /**
     * @return KLP id under which the value is stored. The
     * first bits are the register id, followed by the pre flag.
     * 
     */
    public int getId() {
	return 2*v.getId()+(pre?1:0);
    }
    
}
