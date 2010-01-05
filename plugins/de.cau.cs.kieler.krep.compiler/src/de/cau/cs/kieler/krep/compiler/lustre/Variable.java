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

import java.util.HashMap;

import de.cau.cs.kieler.krep.compiler.helper.Type;

/**
 * A Lustre variable. This is used both for declaration and access of a variable.
 * 
 * @kieler.rating 2010-01-05 proposed yellow ctr
 * 
 * @author ctr
 */
public class Variable {

    private static HashMap<String, Integer> temps = new HashMap<String, Integer>();
    private static HashMap<String, Variable> vars = new HashMap<String, Variable>();

    private Type type;
    private ClockList clock;
    private String name;

    /**
     * @param n
     *            name of the variable
     * @param t
     *            type of the variable This assumes that the variable runs on the base clock.
     */
    public Variable(final String n, final Type t) {
        this(n, t, null);

    }

    /**
     * @param n
     *            name of the variable
     * @param t
     *            type of the variable
     * @param clk
     *            clock on which this variable runs
     */
    public Variable(final String n, final Type t, final String clk) {
        // super(name);
        this.name = n;
        if (vars.containsKey(n)) {
            System.err.println("Variabel " + n + " allready defined");
        }
        this.type = t;
        this.clock = new ClockList();
        if (clk != null) {
            this.clock.addClock(clk);
        }
        vars.put(n, this);
    }

    /**
     * @param clk
     *            on which the variable shall run
     */
    public void setClock(final String clk) {
        if (clk != null) {
            this.clock.addClock(clk);
        }
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * @return name of the variable
     */
    public String getName() {
        return name;
    }

    /**
     * @return infered type of the variable
     */
    public Type getType() {
        return type;
    }

    /**
     * @return clocks on which the variable runs.
     */
    public ClockList getClock() {
        return clock;
    }

    /**
     * @param prefix
     *            prefix of the temporary variable
     * @param type
     *            type of the variable
     * @param clock
     *            clock on whoch the vriable runs
     * @return a new variable with a unique name
     */
    public static Variable getTemp(final String prefix, final Type type, final String clock) {
        if (!temps.containsKey(prefix)) {
            temps.put(prefix, 0);
        }
        temps.put(prefix, temps.get(prefix) + 1);

        return new Variable(prefix + "_" + temps.get(prefix), type, clock);
    }

    /**
     * @param name
     *            name of the variable
     * @return unique variable with that name
     */
    public static Variable get(final String name) {
        Variable res = vars.get(name);
        if (res == null) {
            System.err.println("Variable " + name + " not defined");
            return new Variable(name, Type.INT);
        } else {
            return res;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Variable other = (Variable) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

}
