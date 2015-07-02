/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sjl;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;

/**
 * The SJLProgramWithSignals class is meant to be implemented for a better simulation interface that
 * eases the access to signals.
 * 
 * @author cmot
 * @kieler.design 2013-05-23 proposed cmot
 * @kieler.rating 2013-05-23 proposed
 * 
 */
public abstract class SJLProgramWithSignals<State extends Enum<?>> extends SJLProgram<State>
        implements Cloneable {

    // -------------------------------------------------------------------------

    protected int combineAdd(int a, int b) {
        return a + b;
    }

    protected boolean combineAdd(boolean a, boolean b) {
        return a || b;
    }

    protected double combineAdd(double a, double b) {
        return a + b;
    }

    protected long combineAdd(long a, long b) {
        return a + b;
    }

    protected int combineMult(int a, int b) {
        return a * b;
    }

    protected boolean combineMult(boolean a, boolean b) {
        return a && b;
    }

    protected double combineMult(double a, double b) {
        return a * b;
    }

    protected long combineMult(long a, long b) {
        return a * b;
    }

    protected int combineMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    protected boolean combineMax(boolean a, boolean b) {
        return a || b;
    }

    protected double combineMax(double a, double b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    protected long combineMax(long a, long b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    protected int combineMin(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    protected boolean combineMin(boolean a, boolean b) {
        return a && b;
    }

    protected double combineMin(double a, double b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    protected long combineMin(long a, long b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    protected int combineAnd(int a, int b) {
        return a & b;
    }

    protected boolean combineAnd(boolean a, boolean b) {
        return a && b;
    }

    protected double combineAnd(double a, double b) {
        return a * b;
    }

    protected long combineAnd(long a, long b) {
        return a & b;
    }

    protected int combineOr(int a, int b) {
        return a | b;
    }

    protected boolean combineOr(boolean a, boolean b) {
        return a || b;
    }

    protected double combineOr(double a, double b) {
        return a + b;
    }

    protected long combineOr(long a, long b) {
        return a | b;
    }

    // -------------------------------------------------------------------------

    @SuppressWarnings("deprecation")
    public static void main(final String[] args, SJLProgramWithSignals<?> program) {
        java.io.DataInputStream in = new java.io.DataInputStream(System.in);

        for (int tick = 0; tick < 20; tick++) {

            // Set input signals
            String input;
            program.resetSignals();

            try {
                input = in.readLine().toLowerCase();
                for (String signalName : program.getSignalNames()) {
                    if (input.contains(signalName.toLowerCase())) {
                        try {
                            program.setInput(signalName, true);
                        } catch (NoSuchFieldException e) {
                            e.printStackTrace();
                        } catch (SecurityException e) {
                            e.printStackTrace();
                        } catch (IllegalArgumentException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Do tick
            program.doTick();

            // Debug output
            if (program.isDebug()) {
                System.out.println(program.getLastDebugMessage());
            }

            // Inspect output signals
            for (String signalName : program.getSignalNames()) {
                try {
                    if (program.getOutput(signalName) instanceof Boolean
                            && ((Boolean) program.getOutput(signalName)).booleanValue()) {
                        System.out.print(signalName + " ");
                    }
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                } catch (SecurityException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("");

            if (program.isTerminated()) {
                break;
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new SJLProgramWithSignals.
     * 
     * @param startState
     *            the start state
     * @param startPrio
     *            the start prio
     * @param maxPrio
     *            the max prio
     */
    public SJLProgramWithSignals(State startState, int startPrio, int maxPrio) {
        super(startState, startPrio, maxPrio);
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean doTick() {
        // Reset output signals before computing the reaction
        resetOutputSignals();
        // Delegate to doTick() of SJLProgram
        return super.doTick();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean doTick(int number) {
        // Reset output signals before computing the reaction
        resetOutputSignals();
        // Delegate to doTick() of SJLProgram
        return super.doTick(number);
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    abstract protected void tick();

    // -------------------------------------------------------------------------

    /**
     * This method resets both the input and the output signals.
     */
    final public void resetSignals() {
        resetInputSignals();
        resetOutputSignals();
    }

    // -------------------------------------------------------------------------

    /**
     * This method should be implemented (overwritten) and should reset all output signals only. It
     * is called before the computation of the reaction starts in the doTick() method.
     */
    abstract public void resetOutputSignals();

    // -------------------------------------------------------------------------

    /**
     * This method should be implemented (overwritten) and should reset all output signals only.
     */
    abstract public void resetInputSignals();

    // -------------------------------------------------------------------------

    /**
     * Sets the input of type int.
     * 
     * @param key
     *            the key
     * @param value
     *            the value
     * @throws NoSuchFieldException
     *             the no such field exception
     * @throws SecurityException
     *             the security exception
     * @throws IllegalArgumentException
     *             the illegal argument exception
     * @throws IllegalAccessException
     *             the illegal access exception
     */
    public void setInput(String key, int value) throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        Field field = getClass().getDeclaredField(key);
        field.setInt(this, value);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the input of type boolean.
     * 
     * @param key
     *            the key
     * @param value
     *            the value
     * @throws NoSuchFieldException
     *             the no such field exception
     * @throws SecurityException
     *             the security exception
     * @throws IllegalArgumentException
     *             the illegal argument exception
     * @throws IllegalAccessException
     *             the illegal access exception
     */
    public void setInput(String key, boolean value) throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        Field field = getClass().getDeclaredField(key);
        field.setBoolean(this, value);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the input of type long.
     * 
     * @param key
     *            the key
     * @param value
     *            the value
     * @throws NoSuchFieldException
     *             the no such field exception
     * @throws SecurityException
     *             the security exception
     * @throws IllegalArgumentException
     *             the illegal argument exception
     * @throws IllegalAccessException
     *             the illegal access exception
     */
    public void setInput(String key, long value) throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        Field field = getClass().getDeclaredField(key);
        field.setLong(this, value);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the input of type double.
     * 
     * @param key
     *            the key
     * @param value
     *            the value
     * @throws NoSuchFieldException
     *             the no such field exception
     * @throws SecurityException
     *             the security exception
     * @throws IllegalArgumentException
     *             the illegal argument exception
     * @throws IllegalAccessException
     *             the illegal access exception
     */
    public void setInput(String key, double value) throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        Field field = getClass().getDeclaredField(key);
        field.setDouble(this, value);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the output.
     * 
     * @param key
     *            the key
     * @return the output
     * @throws NoSuchFieldException
     *             the no such field exception
     * @throws SecurityException
     *             the security exception
     * @throws IllegalArgumentException
     *             the illegal argument exception
     * @throws IllegalAccessException
     *             the illegal access exception
     */
    public Object getOutput(String key) throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        Field field = getClass().getDeclaredField(key);
        return field.get(this);
    }

    // -------------------------------------------------------------------------
    
    /**
     * Checks by name whether a signal exists in the SJ program.
     *
     * @param key the key
     * @return true, if successful
     */
    public boolean hasSignal(String key) {
        LinkedList<String> fieldNames = getSignalNames();
        for (String fieldName : fieldNames) {
            if (fieldName.equals(key)) {
                return true;
            }
        }
        return false;
    }
    
    // -------------------------------------------------------------------------


    /**
     * Gets all signal names declared.
     * 
     * @return the signal names
     */
    public LinkedList<String> getSignalNames() {
        Field[] fields = getClass().getFields();
        Field[] originalFields = SJLProgram.class.getFields();

        LinkedList<String> returnList = new LinkedList<String>();
        // Signal fields are assumed to be the differece
        for (Field field : fields) {
            String fieldName = field.getName();
            boolean foundOriginalField = false;
            for (Field originalField : originalFields) {
                if (originalField.getName().equals(fieldName)) {
                    foundOriginalField = true;
                    break;
                }
            }
            // If the field is not found in the original field list
            // then this is assumed to be a signal
            if (!foundOriginalField) {
                returnList.add(fieldName);
            }
        }
        return returnList;
    }

    // -------------------------------------------------------------------------
}
