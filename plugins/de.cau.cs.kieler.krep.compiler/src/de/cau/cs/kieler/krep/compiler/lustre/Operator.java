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
package de.cau.cs.kieler.krep.compiler.lustre;

import de.cau.cs.kieler.krep.compiler.ceq.Const;
import de.cau.cs.kieler.krep.compiler.ceq.Expression;

public enum Operator {
    ADD, SUB, MUL, DIV, MOD, AND, OR, XOR,
    // NOT,
    IMPL,

    LT, LE, EQ, GE, GT, NEQ;

    @Override
    public String toString() {
        String res = new String();
        switch (this) {
        case ADD:
            res = "+";
            break;
        case SUB:
            res = "-";
            break;
        case MUL:
            res = "*";
            break;
        case DIV:
            res = "/";
            break;
        case MOD:
            res = "mod";
            break;

        case AND:
            res = " and ";
            break;
        case OR:
            res = " or ";
            break;
        case XOR:
            res = " xor ";
            break;
        case IMPL:
            res = "=>";
            break;

        case LT:
            res = "<";
            break;
        case LE:
            res = "<=";
            break;
        case EQ:
            res = "=";
            break;
        case GE:
            res = ">=";
            break;
        case GT:
            res = ">";
            break;
        case NEQ:
            res = "<>";
            break;
        }
        return res;
    }

    public String toKlp() {
        String res = null;
        switch (this) {
        case AND:
            res = "AND";
            break;
        case OR:
            res = "OR";
            break;
        case XOR:
            res = "XOR";
            break;
        case LT:
            res = "LT";
            break;
        case LE:
            res = "LE";
            break;
        case EQ:
            res = "EQ";
            break;
        case GE:
            res = "GE";
            break;
        case GT:
            res = "GT";
            break;
        case NEQ:
            res = "NEQ";
            break;
        case ADD:
            res = "ADD";
            break;
        case SUB:
            res = "SUB";
            break;
        case MUL:
            res = "MUL";
            break;
        case DIV:
            res = "DIV";
            break;
        }
        return res;
    }

    public String toKrp() {
        String res = new String();
        switch (this) {
        case ADD:
            res = "ADD";
            break;
        case SUB:
            res = "SUB";
            break;
        case MUL:
            res = "MUL";
            break;
        case DIV:
            res = "DIV";
            break;
        case MOD:
            res = "MOD";
            break;

        case AND:
            res = "AND";
            break;
        case OR:
            res = "OR";
            break;
        case XOR:
            res = "XOR";
            break;
        case IMPL:
            res = "IMPL";
            break;
        case LT:
            res = "LT";
            break;
        case LE:
            res = "LE";
            break;
        case EQ:
            res = "EQ";
            break;
        case GE:
            res = "GE";
            break;
        case GT:
            res = "GT";
            break;
        case NEQ:
            res = "NEQ";
            break;
        }
        return res;
    }

    /**
     * static evluation
     * 
     * @param x
     * @param y
     * @param op
     * @return evaluation of the operator
     */
    /*
     * public static int eval(final int x, final int y, final Operator op) { int res=0; switch (op)
     * { case AND: res = x != 0 && y != 0 ? 1 : 0; break; case OR: res = x != 0 || y != 0 ? 1 : 0;
     * break; case XOR: res = x != 0 ^ y != 0 ? 1 : 0; break; case LT: res = x < y ? 1 : 0; break;
     * case LE: res = x <= y ? 1 : 0; break; case EQ: res = x == y ? 1 : 0; break; case GE: res = x
     * >= y ? 1 : 0; break; case GT: res = x > y ? 1 : 0; break; case NEQ: res = x != y ? 1 : 0;
     * break; case ADD: res = x + y; break; case SUB: res = x - y; break; case MUL: res = x * y;
     * break; case DIV: res = x / y; break; } return res; }
     */

    public static int eval(int a1, int a2, Operator op) {
        boolean b1 = a1 != 0;
        boolean b2 = a2 != 0;
        switch (op) {
        case ADD:
            return a1 + a2;
        case SUB:
            return a1 - a2;
        case MUL:
            return a1 * a2;
        case DIV:
            return a1 / a2;
        case MOD:
            return a1 % a2;
        case AND:
            return b1 && b2 ? 1 : 0;
        case OR:
            return b1 || b2 ? 1 : 0;
        case XOR:
            return b1 ^ b2 ? 1 : 0;
        case LT:
            return a1 < a2 ? 1 : 0;
        case LE:
            return a1 <= a2 ? 1 : 0;
        case EQ:
            return a1 == a2 ? 1 : 0;
        case GE:
            return a1 >= a2 ? 1 : 0;
        case GT:
            return a1 > a2 ? 1 : 0;
        case NEQ:
            return a1 != a2 ? 1 : 0;
        case IMPL:
            return (a1 == 0 || a2 != 0) ? 1 : 0;
        }
        return 0;
    }
}
