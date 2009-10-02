package de.cau.cs.kieler.krep.evalbench.program;

import java.util.HashMap;
import java.util.LinkedList;

import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;


/**
 * @author ctr abstract superclass for all assembler instructions
 * 
 */
abstract public class Instruction {

    protected LinkedList<String> labels = new LinkedList<String>();

    /**
     * add an additional label
     * 
     * @param l
     *            new label for this instruction
     */
    public void addLabel(final String l) {
	labels.add(l);
    }

    /**
     * @return unique label for this instruction
     */
    public String getLabel() {
	if (!labels.isEmpty()) {
	    return labels.getFirst();
	} else {
	    return "";
	}
    }

    /**
     * @param labels list of labels for this instruction
     */
    public void setLabels(final LinkedList<String> labels) {
	for (String label : labels) {
	    this.labels.add(label);
	}
    }

    /**
     * @return all labels for this instruction
     */
    public LinkedList<String> getLabels() {
	return labels;
    }

    @Override
    abstract public String toString();

    /**
     * give object code for this instruction
     * 
     * @return 4 Bytes for this instruction
     */
    public String writeObj() {
	int[] op = getObj();
	if (op == null) {
	    return null;
	} else {
	    String res = "";
	    for (int i = 0; i < op.length; i++) {
		res += padByte(op[i]);
	    }
	    return res;
	}
    }

    abstract protected int[] getObj();

    private static String padByte(int b) {
	String res = Integer.toHexString(b).toUpperCase();
	if (res.length() < 2) {
	    res = "0" + res;
	} else if (res.length() > 2) {
	    res = res.substring(res.length() - 2);
	}
	return res;
    }

    /**
     * @param label set unique label for this instruction
     */
    public void setLabel(final String label) {
	labels.clear();
	labels.add(label);

    }

    /**
     * replace label by addresses
     * 
     * @param label2addr mapping from label to absolute addresses in the instruction ROM
     * @throws ParseException 
     */
    abstract public void asmLabel(HashMap<String, Integer> label2addr)
	    throws ParseException;

}