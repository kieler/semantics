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
package de.cau.cs.kieler.krep.compiler.ceq;

import de.cau.cs.kieler.krep.compiler.klp.LabelInstruction;
import de.cau.cs.kieler.krep.compiler.util.Type;

/**
 * A Variable declaration in CEQ. A variable has a name, a type and a scope, i.e., input output,
 * local or temporary. A variable also has a register id.
 * 
 * @kieler.rating 2010-02-05 yellow review by cmot, msp, tam
 * 
 * @author ctr
 */
public class Variable {

    /**
     * @author ctr Kind of variable, input, output, local or temp
     */
    public enum Kind {
        /**
         * input variable.
         */
        INPUT,
        /**
         * output variable.
         */
        OUTPUT,
        /**
         * local variable.
         */
        LOCAL,
        /**
         * temporary variable, without pre value.
         */
        TEMP
    }

    private String name;

    private Type type;

    private Kind io;

    private int id;

    /** count number of variables for each kind. */
    private static int[] nValue = new int[] { 0, 0, 0, 0 };

    private static final int ID_IN = 0;
    private static final int ID_OUT = 1;
    private static final int ID_LOCAL = 2;
    private static final int ID_TEMP = 3;

    private int getKindId(final Kind k) {
        switch (k) {
        case INPUT:
            return ID_IN;
        case OUTPUT:
            return ID_OUT;
        case LOCAL:
            return ID_LOCAL;
        case TEMP:
            return ID_TEMP;
        }
        return 0;
    }

    /**
     * generate new Variable declaration.
     * 
     * @param n
     *            name of the variable
     * @param kind
     *            kind of the variable
     * @param t
     *            type of the variable
     */
    public Variable(final String n, final Kind kind, final Type t) {
        super();
        this.name = n;
        this.io = kind;
        this.type = t;
        id = nValue[getKindId(kind)]++;

        Program.addVar(n, this);
    }

    /**
     * Create Variable with the same information as an existing Lustre Variable.
     * 
     * @param var
     *            Lustre variable
     * @param kind
     *            io kind
     */
    public Variable(final de.cau.cs.kieler.krep.compiler.lustre.Variable var, final Kind kind) {
        this(var.getName(), kind, var.getType());
    }

    /**
     * @return variable kind, ie, input, output, local or temp
     */
    public Kind getKind() {
        return io;
    }

    /**
     * @return type of the variable
     */
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + ": " + type;
    }

    /**
     * @return name of the variable
     */
    public String getName() {
        return name;
    }

    /**
     * @return true if the variable is an input
     */
    public boolean isInput() {
        return io == Kind.INPUT;
    }

    /**
     * @return true if the variable is an output
     */
    public boolean isOutput() {
        return io == Kind.OUTPUT;
    }

    /**
     * @return true if the variable is local
     */
    public boolean isLocal() {
        return io == Kind.LOCAL;
    }

    /**
     * @return true if the variable is only temporary defined
     */
    public boolean isTemp() {
        return io == Kind.TEMP;
    }

    /**
     * @param clock
     *            clock on which the variable runs
     * @return KLP assembler to initialize variable
     */
    public String toKlp(final String clock) {
        String res = "";
        switch (io) {
        case INPUT:
            res += "  INPUT\t\t" + name + "\n";
            break;
        case OUTPUT:
            res += "  OUTPUT\t" + name + "\n";
            break;
        case LOCAL:
            res += "  LOCAL\t\t" + name + "\n";
            break;
        case TEMP: // no need to initialze
            break;

        }
        if (io == Kind.LOCAL || io == Kind.OUTPUT) {
            res += "  INIT";
            switch (type) {
            case BOOL:
                res += "C";
                break;
            case INT:
                res += "V";
                break;
            case REAL:
                break;
            }
            res += "\t" + name;
            res += "\t" + LabelInstruction.get(name).getName();
            res += "\t" + (clock == null ? "" : clock);
        }
        return res;
    }

    /**
     * 
     * @return register id of this variable
     */
    public int getId() {
        int i = 0;
        switch (io) {
        case INPUT:
            i = 0;
            break;
        case OUTPUT:
            i = KlpProgram.N_IO;
            break;
        case LOCAL:
            i = 2 * KlpProgram.N_IO;
            break;
        case TEMP:
            i = 2 * KlpProgram.N_IO + KlpProgram.N_LOCAL;
            break;
        }
        return id + i;
    }

}
