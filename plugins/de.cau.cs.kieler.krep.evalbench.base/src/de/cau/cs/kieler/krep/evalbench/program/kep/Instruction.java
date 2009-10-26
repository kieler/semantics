/******************************************************************************
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
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.program.kep;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Instruction extends
        de.cau.cs.kieler.krep.evalbench.program.Instruction implements InstInf {

    String id;
    String mnemonic;
    SCLine sourceCode;

    public Instruction() {
    }

    public Instruction(String id, String name, SCLine sourceCode) {
        this.id = id;
        this.mnemonic = name;
        this.sourceCode = sourceCode;
    }

    @Override
    public String toString() {
        return mnemonic + " ";
    }

    public String encode() {
        return id;
    }

    public String info() {
        return "" + mnemonic + "\n\r" + id;
    }

    public int length() {
        return Constants.id_width;
    }

    public SCLine getScource() {
        return sourceCode;
    }

    public void setSourceCode(SCLine sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getId() {
        return id;
    }

    public boolean equals(String crit) {

        StringTokenizer tokenizer = new StringTokenizer(this.mnemonic);
        String name = tokenizer.nextToken();

        return name.contains(crit);
    }

    @Override
    public void asmLabel(HashMap<String, Integer> label2addr) {
        // TODO Auto-generated method stub
    }

    private int[] string2Array(String bin) {
        int[] res = new int[5];
        // pad with 0
        StringBuffer pad = new StringBuffer();
        for (int i = 0; i < 5 * 8 - bin.length(); i++) {
            pad.append("0");
        }
        bin += pad.toString();

        for (int i = 0; i < 5; i++) {
            String s = bin.substring(8 * i, 8 * (i + 1));
            res[i] = Integer.parseInt(s, 2);
        }
        return res;
    }

    @Override
    protected int[] getObj() {
        return string2Array(encode());
    }

}
