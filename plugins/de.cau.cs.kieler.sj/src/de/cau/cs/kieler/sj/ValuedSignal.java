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

import static de.cau.cs.kieler.sj.SJLogger.LogMsgTyp.INSTRUCTION;
import de.cau.cs.kieler.sj.exceptions.NoPreSignalException;
import de.cau.cs.kieler.sj.exceptions.SignalNotDeclaredException;

/**
 * SJ realization of a valued signal.
 * 
 * @author mhei
 */
public class ValuedSignal extends Signal {

    /**
     * The current value of the signal.
     */
    private Number value;

    /**
     * The value a valued signal gets at the beginning of every tick.
     */
    private Number startValue;

    /**
     * The last values of the signal to make a history.
     */
    private Number[] lastSignalValues;

    /**
     * The combination function used for the signal values.
     */
    private CombinationFunction comb;

    /**
     * Creates a new valued signal with the given name.
     * 
     * @param name
     *            The name for the valued signal.
     */
    public ValuedSignal(final String name) {
        this(name, CombinationFunction.MULTIPLY, 0);
    }

    /**
     * Creates a new valued signal with the given name an combination function for more than one
     * value.
     * 
     * @param name
     *            The name for the valued signal.
     * @param combinationFuction
     *            The combination function for the valued signal.
     */
    public ValuedSignal(final String name, final CombinationFunction combinationFuction) {
        this(name, combinationFuction, 0);
    }

    /**
     * Creates a new valued signal.
     * 
     * @param name
     *            The name for the valued signal.
     * @param historyLength
     *            The history length of the valued signal.
     */
    public ValuedSignal(final String name, final int historyLength) {
        this(name, CombinationFunction.MULTIPLY, historyLength);
    }

    /**
     * Creates a new valued signal.
     * 
     * @param name
     *            The name for the signal.
     * @param combinationFunction
     *            The combination function for the signal.
     * @param historyLength
     *            The length of the signal history to log.
     */
    public ValuedSignal(final String name, final CombinationFunction combinationFunction,
            final int historyLength) {
        super(name, historyLength);
        if (historyLength > 0) {
            this.lastSignalValues = new Number[historyLength];
        } else {
            this.lastSignalValues = null;
        }
        this.comb = combinationFunction;
        this.startValue = null;
        this.value = null;
    }

    private ValuedSignal(final String name, final boolean state, final Number val,
            final EmbeddedSJProgram<?> program, final Boolean[] lastSignalAssignments,
            final Number[] lastSignalVals) {

        super(name, state, program, lastSignalAssignments);
        this.lastSignalValues = lastSignalVals;
        this.value = val;

    }

    @Override
    public ValuedSignal pre() {
        if (!isDeclared()) {
            throw new SignalNotDeclaredException(
                    "The Signal has not declared in the SJProgram that belongs to the Signal");
        } else if (getLastSignalAssignments() == null || getLastSignalAssignments().length == 0) {
            throw new NoPreSignalException(
                    "There is no pre signal existing. Your history is too small");
        } else if (getLastSignalAssignments()[(getIndex() + getLastSignalAssignments().length - 1)
                % getLastSignalAssignments().length] == null) {
            throw new NoPreSignalException(
                    "There is no pre signal existing. Not enougth ticks done");
        } else {
            Boolean[] signalHistory;
            Number[] valueHistory;
            if ((getLastSignalAssignments().length) - 1 <= 0) {
                // if there is only 1 element in the history thats the one pre
                // will return and we do not need a history for that element.
                valueHistory = null;
                signalHistory = null;
            } else {
                // create a history for the signal pre returns
                valueHistory = new Number[getLastSignalAssignments().length - 1];
                signalHistory = new Boolean[getLastSignalAssignments().length - 1];
                for (int i = 0; i < (getLastSignalAssignments().length - 1); i++) {
                    valueHistory[(valueHistory.length - i) % valueHistory.length]
                            = lastSignalValues[(getIndex()
                            - 2 - i + 2 * lastSignalValues.length)
                            % lastSignalValues.length];

                    signalHistory[(signalHistory.length - i) % signalHistory.length] 
                            = getLastSignalAssignments()[(getIndex()
                            - 2 - i + 2 * getLastSignalAssignments().length)
                            % getLastSignalAssignments().length];

                }
            }

            ValuedSignal retVal = new ValuedSignal(getName(),
                    getLastSignalAssignments()[(getIndex() + getLastSignalAssignments().length - 1)
                            % getLastSignalAssignments().length], lastSignalValues[(getIndex()
                            + getLastSignalAssignments().length - 1)
                            % getLastSignalAssignments().length], getProgram(), signalHistory,
                    valueHistory);

            // JSON logging
            if (getProgram().isThreadRunning() && getProgram().getLogger() != null) {
                getProgram().getLogger().log(
                        INSTRUCTION,
                        "\"pre\":" + "{\"label\":\""
                                + getProgram().getCurThread().getLabel().name() + "\",\"prio\":"
                                + getProgram().getCurThread().getPriority() + "\",\"param\":["
                                + toJSONString() + "],\"retval\":" + retVal.toJSONString() + "}");
            }

            return retVal;
        }
    }

    void nextTick() {
        if (!isDeclared()) {
            throw new SignalNotDeclaredException(
                    "You can not work with a signal which has not been declared.");
        }

        // if we want to use a history
        if (getLastSignalAssignments() != null) {
            getLastSignalAssignments()[getIndex()] = isPresent();
            lastSignalValues[getIndex()] = this.value;
            setIndex((getIndex() + 1) % getLastSignalAssignments().length);
        }

        // reset signal values to default
        setPresent(ABSENT);
        setHasStateChecked(false);
        this.value = startValue;

    }

    /**
     * Emits a signal with a given value. If the signal has already a value in this tick the new
     * value for the signal will be calculated using the old signal value, the new signal value and
     * the combination function of the signal.
     * 
     * @param val
     *            The given value.
     * 
     * @see de.cau.cs.kieler.sj.Signal#emit()
     */
    public void emit(final Number val) {
        if (val == null) {
            throw new NullPointerException("A value of a valued signal can not set to null");
        }
        super.emit();
        if (this.value == null) {
            this.value = val;
        } else {
            this.value = this.comb.call(this.value, val);
        }
        // The JSON logging is done by the super.emit(). This works because super.emit() calls
        // toJSONString to create the logging message.
    }

    /**
     * Sustain a signal using the given value.
     * 
     * @param val
     *            The value.
     */
    public void sustainCB(final Number val) {
        if (val == null) {
            throw new NullPointerException("A value of a valued signal can not set to null");
        }
        super.sustainCB();
        if (this.value == null) {
            this.value = val;
        } else {
            this.value = this.comb.call(this.value, val);
        }
        // The JSON logging is done by the super.sustainCB(). This works because super.sustainCB()
        // calls toJSONString to create the logging message.
    }

    /**
     * Returns the value of the valued signal.
     * 
     * @return The current value of the valued signal.
     */
    public Number getValue() {
        return this.value;
    }

    /**
     * The JSON representation of the ValuedSignal object. The value is <code>null</code> if he has
     * not been set for the signal.
     * 
     * @return A string with the JSON representation of the valued signal.
     */
    @Override
    public String toJSONString() {
        return "{\"" + getName() + "\"" + ":{\"present\":" + ((isPresent()) ? "true" : "false")
                + ((value != null) ? ",\"value\":" + value.toString() : "") + "}}";
    }

    /**
     * Return a sting representation of the this valued signal.
     * 
     * @return A string representation of the valued signal
     */
    @Override
    public String toString() {
        return super.toString() + ((value != null) ? " Value: " + value.toString() : "");
    }

    /**
     * Sets the default value for the signal at the beginning of every new tick.
     * 
     * @param startVal
     *            The start value.
     * 
     */
    public void setStartValue(final Number startVal) {
        if (startVal == null) {
            throw new NullPointerException("A value of a valued signal can not set to null.");
        } else if (this.value == null) {
            this.value = startValue;
        }
        this.startValue = startVal;
    }

}
