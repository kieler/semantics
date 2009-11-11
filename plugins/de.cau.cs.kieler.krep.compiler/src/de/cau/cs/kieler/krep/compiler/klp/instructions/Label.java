package de.cau.cs.kieler.krep.compiler.klp.instructions;


import java.util.HashMap;

import de.cau.cs.kieler.krep.compiler.helper.Debug;

/**
 * Label in the assembler code. Connects names and actual addresses.
 * @author ctr
 *
 */
public class Label extends Instruction {

    private static HashMap<String, Label> labels = new HashMap<String, Label>();

    private String label;


    /**
     * 
     * @param name unique identifier of the label
     */
    private Label(String name) {
	label = name;
    }

    /**
     * @param name of the label
     * @return Label with this name, if it exists, null otherwise
     */
    public static Label get(String name) {
	Label l =  labels.get(name);
	if (l==null){
	    l = new Label(name);
	    labels.put(name, l);
	    Debug.low("define label " + name);
	}else{
	  Debug.low("get label " + name);
	}
	return labels.get(name);
    }

    @Override
    public String toString() {
	return getName() + ": "; //(" + pos + ")";
    }

    
    /**
     * @return name of the label
     */
    public String getName(){
	return "L_" + label;
    }
}
