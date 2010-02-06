/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.krep.evalbench.program;

import java.util.HashMap;
import java.util.LinkedList;


/**
 * 
 * Superclass for all assembler instructions. This includes same basic code for displaying an
 * instruction and to convert it into object code.
 * 
 * @kieler.rating 2010-01-28 proposed yellow ctr
 * 
 * @author ctr abstract
 * 
 */
public abstract class Instruction {

    /**
     * all labels for this instruction.
     */
    private LinkedList<String> labels = new LinkedList<String>();

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
     * @param labs
     *            list of labels for this instruction
     */
    public void setLabels(final LinkedList<String> labs) {
        for (String label : labs) {
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
    public abstract String toString();

    /**
     * give object code for this instruction.
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

    /**
     * 
     * @return object code for the instruction.
     */
    protected abstract int[] getObj();

    private static String padByte(final int b) {
        String res = Integer.toHexString(b).toUpperCase();
        if (res.length() < 2) {
            res = "0" + res;
        } else if (res.length() > 2) {
            res = res.substring(res.length() - 2);
        }
        return res;
    }

    /**
     * @param label
     *            set unique label for this instruction
     */
    public void setLabel(final String label) {
        labels.clear();
        labels.add(label);

    }

    /**
     * replace label by addresses.
     * 
     * @param label2addr
     *            mapping from label to absolute addresses in the instruction ROM
     * @throws ParseException
     *             exception thrown for undefined labels
     */
    public abstract void asmLabel(HashMap<String, Integer> label2addr) throws ParseException;

}
