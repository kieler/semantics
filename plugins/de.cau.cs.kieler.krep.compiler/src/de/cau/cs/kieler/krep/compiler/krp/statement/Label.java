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
package de.cau.cs.kieler.krep.compiler.krp.statement;

public class Label extends Statement {

    static int max = 0;

    int i;

    public Label() {
        i = max;
        max++;
    }

    @Override
    public String toString() {
        return new String("L" + i);
    }

    public static String indent() {
        return indent("");
    }

    public static String indent(String s) {
        int l = new String("L" + max + ": ").length();
        String res = s;
        while (res.length() < l) {
            res += " ";
        }
        return res;
    }

}
