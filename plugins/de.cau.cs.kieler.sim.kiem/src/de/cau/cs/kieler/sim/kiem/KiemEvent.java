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

package de.cau.cs.kieler.sim.kiem;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

/**
 * This class implements some constants that define specific events in KIEM. A DataComponent may
 * register itself using the
 * {@link de.cau.cs.kieler.sim.kiem.extension.AbstractDataComponent.provideEventOfInterest} method
 * to be a listener of some events. The method
 * {@link de.cau.cs.kieler.sim.kiem.extension.AbstractDataComponent.notifyEvent} will then be called
 * by KIEM for the registered events.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class KiemEvent {

    private double event;
    private Object info;

    /**
     * The Constant NONE event represents the default NULL event and means this component does not
     * want to be notified for any event.
     */
    public static final double NONE = 0;

    /** The Constant STEP event is triggered before a step is about to occur. */
    public static final double STEP_INFO = 1;

    /** The Constant CMD_STEP event is triggered when the user hits the step button. */
    public static final double CMD_STEP = 2;

    /** The Constant CMD_STEP event is triggered when the user hits the step button. */
    public static final double CMD_STEP_BACK = 4;

    /** The Constant CMD_STEP event is triggered when the user hits the step button. */
    public static final double CMD_STEP_MACRO = 8;

    /** The Constant CMD_RUN event is triggered when the user hits the run button. */
    public static final double CMD_RUN = 16;

    /** The Constant CMD_PAUSE event is triggered when the user hits the pause button. */
    public static final double CMD_PAUSE = 32;

    /** The Constant CMD_STOP event is triggered when user hits the stop button. */
    public static final double CMD_STOP = 64;

    /** The Constant ADDED event is triggered when the user adds a component (instance). */
    public static final double ADDED = 128;

    /** The Constant DELETED event is triggered when the user deletes a component (instance). */
    public static final double DELETED = 256;

    /** The Constant SCHEDULED event is triggered when the user changes the scheduling order. */
    public static final double SCHEDULED = 512;

    /** The Constant ACTIVATED event is triggered when the user activates the component. */
    public static final double ACTIVATED = 1024;

    /** The Constant DEACTIVATED event is triggered when the user deactivates the component. */
    public static final double DEACTIVATED = 2048;

    /**
     * The Constant LOAD event is triggered when the user loads a scheduling. The info in this case
     * is the location of the file as an IPath object.
     */
    public static final double LOAD = 4096;

    /**
     * The Constant SAVE event is triggered when the user saves a scheduling. The info in this case
     * is the location of the file as an IPath object.
     */
    public static final double SAVE = 8192;

    /**
     * The Constant KIEMPROPERTY_CHANGE event is triggered when the user changes/edited a property
     * value in table.
     */
    public static final double KIEMPROPERTY_CHANGE = 16384;

    /** The Constant ERROR_STOP event is triggered when an error leads to the execution stop. */
    public static final double ERROR_STOP = 32768;

    /** The Constant ERROR_STOP event is triggered when an error leads to the execution pause. */
    public static final double ERROR_PAUSE = 65536;

    // -------------------------------------------------------------------------

    /**
     * This KiemEvent constructor sets the event(s) of interest during construction.
     * 
     * @param eventParam
     *            the event of interest
     * @param infoParam
     *            the (optional) info parameter
     */
    public KiemEvent(final double eventParam, final Object infoParam) {
        this.event = eventParam;
        this.info = infoParam;
    }

    // -------------------------------------------------------------------------

    /**
     * This KiemEvent constructor sets the event(s) of interest during construction.
     * 
     * @param eventParam
     *            the event of interest
     */
    public KiemEvent(final double eventParam) {
        this.event = eventParam;
        this.info = null;
    }

    // -------------------------------------------------------------------------

    /**
     * This KiemEvent constructor sets the no event of interest during construction.
     */
    public KiemEvent() {
        this.event = KiemEvent.NONE;
        this.info = null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the current contained events.
     * 
     * @return the events
     */
    public double getEvents() {
        return this.event;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether an event is contained.
     * 
     * @param eventParam
     *            the event of interest to check
     * 
     * @return true, if is event
     */
    public boolean isEvent(final double eventParam) {
        return ((this.event % eventParam) == 0);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the event.
     * 
     * @param eventParam
     *            the new event
     */
    public void setEvent(final double eventParam) {
        this.event = eventParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Adds the event.
     * 
     * @param eventParam
     *            the event param
     */
    public void addEvent(final double eventParam) {
        this.event += eventParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Resets the event to NONE.
     */
    public void resetEvent() {
        this.event = KiemEvent.NONE;
        this.info = null;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the optional info parameter.
     * 
     * @param infoParam
     *            the new info
     */
    public void setInfo(final Object infoParam) {
        this.info = infoParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the info parameter or null if no info was attached.
     * 
     * @return the info
     */
    public Object getInfo() {
        return this.info;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets all events as a list.
     * 
     * @return all events as a list
     */
    public List<Double> getEventsAsList() {
        LinkedList<Double> returnList = new LinkedList<Double>();

        Field[] flds = KiemEvent.class.getDeclaredFields();
        for (Field f : flds) {
            if (f.isEnumConstant()) {
                try {
                    System.out.println(f.getName());
                    returnList.add(f.getDouble(f));
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return returnList;
    }
}
