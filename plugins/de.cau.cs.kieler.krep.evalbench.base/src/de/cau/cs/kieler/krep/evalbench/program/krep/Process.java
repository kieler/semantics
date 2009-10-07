/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.program.krep;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author ctr
 * 
 *         KReP process that is executed on one core
 */
public class Process {
    private List<Statement> stmts = new LinkedList<Statement>();

    private byte id;

    private HashMap<String, Integer> labels = new HashMap<String, Integer>();

    /**
     * @param id
     *            identifier of the core on which the process runs
     */
    public Process(final byte id) {
	this.id = id;
    }

    /**
     * @param s
     *            additional statement
     */
    public void addStatement(Statement s) {
	stmts.add(s);
    }

    /**
     * @param label
     *            label for end of current process code
     */
    public void addLabel(final String label) {
	labels.put(label, stmts.size());
    }

    /**
     * Compute that address for each label
     * 
     * @return number of statements
     */
    public int setLabel() {
	for (Statement s : stmts) {
	    s.setLabel(labels);
	}
	return stmts.size();
    }

    /**
     * Allocate all register for the process
     * 
     * @return number of used registers
     */
    public int allocateRegs() {
	HashMap<String, Integer> regs = new HashMap<String, Integer>();
	for (Statement s : stmts) {
	    s.allocateRegs(regs);
	}
	return regs.size();
    }

    /**
     * Compute identifier for all send values
     * 
     * @param ids maps register names to bus identifiers
     */
    public void setBusID(final Map<String, Integer> ids) {
	for (Statement s : stmts) {
	    s.setBusID(ids);
	}
    }

    /**
     * @return textual assembler description of the code
     */
    public List<String> getText() {
	List<String> res = new LinkedList<String>();
	for (Statement s : stmts) {
	    res.add(s.toString());
	}
	return res;
    }

    private String toHex(int i) {
	String res = "";
	res = Integer.toHexString(i);
	if (res.length() == 1) {
	    res = "0" + res;
	}
	return res;
    }

    /**
     * @return hex description of the program code. Each list entry is one
     *         instruction (4 Bytes)
     * 
     */
    public List<String> getCode() {
	final List<String> res = new LinkedList<String>();
	for (final Statement stmt : stmts) {
	    String s = toHex(id);

	    for (final int i : stmt.getBytes()) {
		s += toHex(i);
	    }
	    res.add(s);
	}
	return res;
    }

    @Override
    public String toString() {
	String res = "";
	for (Statement s : stmts) {
	    res += s.toString() + "\n";
	}
	return res;
    }
}
