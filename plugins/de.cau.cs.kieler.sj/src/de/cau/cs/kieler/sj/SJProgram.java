/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sj;

import java.lang.reflect.Field;

/**
 * 
 * @author mhei
 * 
 *         The desktop/comfort version of SJ.
 * 
 * @param <StateLabel>
 *            The state labels which exits for this program.
 */
public abstract class SJProgram<StateLabel extends Enum<?>> extends EmbeddedSJProgram<StateLabel> {

    /**
     * Creates a new SJ program with a given start label and priority.
     * 
     * @param startLabel
     *            The label the program should start at.
     * @param prio
     *            The priority the program should start with.
     * @see de.cau.cs.kieler.sj.EmbeddedSJProgram#EmbeddedSJProgram(Enum, int)
     */
    public SJProgram(final StateLabel startLabel, final int prio) {
        super(startLabel, prio);
    }

    /**
     * Creates a new SJ program with a given start label, priority and logger.
     * 
     * @param startLabel
     *            The label the program should start at.
     * @param prio
     *            The priority the program should start with.
     * @param logger
     *            The logger to deal with the logging informations.
     * 
     * @see de.cau.cs.kieler.sj.EmbeddedSJProgram#EmbeddedSJProgram(Enum, int, SJLogger)
     */
    public SJProgram(final StateLabel startLabel, final int prio, final SJLogger logger) {
        super(startLabel, prio, logger);
    }

    /**
     * Adds all public signals to the Signal list. Also initialize all not defined public class
     * variables of the depending sub class using the default constructor.
     * 
     * For example:<br />
     * If you write <code>public Signal a, b, c;</code> in the sub class, this method does the same
     * like <code>a = new Signal("a"); b = new Signal("b"); c = new Signal("c"); 
     * addSignals(a, b, c, d);</code>
     * 
     * Attention: If initSignals should be work all Signals an the class with the program should be
     * public
     * 
     * You can not do this as part of the constructor because it could not consider a variable
     * declaration in the head of the class.
     * 
     */
    public void initSignals() {
        // get all declared fields
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field f : fields) {
            // if its a valued signal
            if (f.getType().equals(ValuedSignal.class)) {
                try {
                    if (f.get(this) == null) {
                        f.set(this, new ValuedSignal(f.getName()));
                    }
                    addSignals((ValuedSignal) f.get(this));
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } else if (f.getType().equals(Signal.class)) {
                try {
                    if (f.get(this) == null) {
                        f.set(this, new Signal(f.getName()));
                    }
                    addSignals((Signal) f.get(this));
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
