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
