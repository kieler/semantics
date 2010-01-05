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

/**
 * Implement binary operators.
 * 
 * @kieler.rating 2010-01-05 proposed yellow ctr
 * 
 * @author ctr
 */

public enum Operator {
    /** Add. */
    ADD, 
    /** Sub. */
    SUB, 
    /** Multiply. */
    MUL, 
    /** divide. */
    DIV, 
    /** modulo operator. */
    MOD, 
    /** logical and. */
    AND, 
    /** logical or. */
    OR,
    /** logical exclusive or. */
    XOR,
    /** logical imply. */
    IMPL,

    /** less than. */
    LT, 
    /** less than or equal. */
    LE,
    /** equal.*/
    EQ, 
    /** greater than or equal.*/
    GE,
    /** greater than. */
    GT,
    /** not equal. */
    NEQ;

    @Override
    public String toString() {
        String res = "";
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

    
    /**
     * 
     * @return Klp identifier for the operator.
     */
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

 

    /**
     * static evaluation.
     * 
     * @param a1 first parameter
     * @param a2 second parameter
     * @param op operator to eval
     * @return evaluation of the operator
     */
    public static int eval(final int a1, final int a2, final Operator op) {
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
