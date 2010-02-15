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
 * This class implements some constants that define specific events in KIEM. A
 * DataComponent may register itself using the
 * {@link de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent#provideEventOfInterest()}
 * method to be a listener of some events. The method
 * {@link de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent#notifyEvent(KiemEvent)}
 * will then be called by KIEM for the registered events.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 proposed yellow
 * 
 */
public class KiemEvent {

    private int[] event;
    private Object info;

    /**
     * The Constant NONE event represents the default NULL event and means this
     * component does not want to be notified for any event.
     */
    public static final int NONE = 0;

    /**
     * The Constant STEP INFO event is triggered before a step is about to
     * occur.
     */
    public static final int STEP_INFO = 1;

    /** The Constant STEP DONE event is triggered after a step has been made. */
    public static final int STEP_DONE = 18;

    /**
     * The Constant CMD_STEP event is triggered when the user hits the step
     * button.
     */
    public static final int CMD_STEP = 2;

    /**
     * The Constant CMD_STEP event is triggered when the user hits the step
     * button.
     */
    public static final int CMD_STEP_BACK = 3;

    /**
     * The Constant CMD_STEP event is triggered when the user hits the step
     * button.
     */
    public static final int CMD_STEP_MACRO = 4;

    /**
     * The Constant CMD_RUN event is triggered when the user hits the run
     * button.
     */
    public static final int CMD_RUN = 5;

    /**
     * The Constant CMD_PAUSE event is triggered when the user hits the pause
     * button.
     */
    public static final int CMD_PAUSE = 6;

    /** The Constant CMD_STOP event is triggered when user hits the stop button. */
    public static final int CMD_STOP = 7;

    /**
     * The Constant ADDED event is triggered when the user adds a component
     * (instance).
     */
    public static final int ADDED = 8;

    /**
     * The Constant DELETED event is triggered when the user deletes a component
     * (instance).
     */
    public static final int DELETED = 9;

    /**
     * The Constant SCHEDULED event is triggered when the user changes the
     * scheduling order.
     */
    public static final int SCHEDULED = 10;

    /**
     * The Constant ACTIVATED event is triggered when the user activates the
     * component.
     */
    public static final int ACTIVATED = 11;

    /**
     * The Constant DEACTIVATED event is triggered when the user deactivates the
     * component.
     */
    public static final int DEACTIVATED = 12;

    /**
     * The Constant LOAD event is triggered when the user loads a scheduling.
     * The info in this case is the location of the file as an IPath object.
     */
    public static final int LOAD = 13;

    /**
     * The Constant SAVE event is triggered when the user saves a scheduling.
     * The info in this case is the location of the file as an IPath object.
     */
    public static final int SAVE = 14;

    /**
     * The Constant KIEMPROPERTY_CHANGE event is triggered when the user
     * changes/edited a property value in table.
     */
    public static final int KIEMPROPERTY_CHANGE = 15;

    /**
     * The Constant ERROR_STOP event is triggered when an error leads to the
     * execution stop.
     */
    public static final int ERROR_STOP = 16;

    /**
     * The Constant ERROR_STOP event is triggered when an error leads to the
     * execution pause.
     */
    public static final int ERROR_PAUSE = 17;

    /**
     * This constant is triggered when the Execution Manager finished building
     * the view.
     */
    public static final int VIEW_DONE = 100;

    // -------------------------------------------------------------------------

    /**
     * This KiemEvent constructor sets the event(s) of interest during
     * construction.
     * 
     * @param infoParam
     *            the (optional) info parameter
     * @param eventCodesParam
     *            the event codes param
     */
    public KiemEvent(final int[] eventCodesParam, final Object infoParam) {
        this.event = eventCodesParam.clone();
        this.info = infoParam;
    }

    // -------------------------------------------------------------------------

    /**
     * This KiemEvent constructor sets the event(s) of interest during
     * construction.
     * 
     * @param eventCodesParam
     *            the event codes param
     */
    public KiemEvent(final int[] eventCodesParam) {
        this.event = eventCodesParam.clone();
        this.info = null;
    }

    // -------------------------------------------------------------------------

    /**
     * This KiemEvent constructor sets the event(s) of interest during
     * construction.
     * 
     * @param infoParam
     *            the (optional) info parameter
     * @param eventCodeParam
     *            the event code param
     */
    public KiemEvent(final int eventCodeParam, final Object infoParam) {
        this.event = new int[1];
        this.event[0] = eventCodeParam;
        this.info = infoParam;
    }

    // -------------------------------------------------------------------------

    /**
     * This KiemEvent constructor sets the event(s) of interest during
     * construction.
     * 
     * @param eventCodeParam
     *            the event code param
     */
    public KiemEvent(final int eventCodeParam) {
        this.event = new int[1];
        this.event[0] = eventCodeParam;
        this.info = null;
    }

    // -------------------------------------------------------------------------

    /**
     * This KiemEvent constructor sets the no event of interest during
     * construction.
     */
    public KiemEvent() {
        this.event = new int[1];
        this.event[0] = KiemEvent.NONE;
        this.info = null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the current contained events.
     * 
     * @return the events
     */
    public int[] getEventCodes() {
        return this.event;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether an event is contained.
     * 
     * @param eventCodeParam
     *            the event code param
     * 
     * @return true, if is event
     */
    public boolean isEvent(final int eventCodeParam) {
        for (int currentEvent : this.event) {
            if (currentEvent == eventCodeParam) {
                return true;
            }
        }
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the event.
     * 
     * @param eventCodeParam
     *            the event code param
     */
    public void addEvent(final int eventCodeParam) {
        int[] newEvent = new int[this.event.length + 1];
        for (int c = 0; c < this.event.length; c++) {
            newEvent[c] = this.event[c];
        }
        newEvent[this.event.length] = eventCodeParam;
        this.event = newEvent;
    }

    // -------------------------------------------------------------------------

    /**
     * Adds the event.
     * 
     * @param eventCodesParam
     *            the event codes param
     */
    public void setEvents(final int[] eventCodesParam) {
        this.event = eventCodesParam.clone();
    }

    // -------------------------------------------------------------------------

    /**
     * Resets the event to NONE.
     */
    public void resetEvents() {
        this.event = new int[1];
        this.event[0] = KiemEvent.NONE;
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
     * Gets the event name for an integer event code or null.
     * 
     * @param eventCode
     *            the event code
     * 
     * @return the event name
     */
    public static String getEventName(final int eventCode) {
        Field[] flds = KiemEvent.class.getDeclaredFields();
        for (Field f : flds) {
            if (f.getType().getName().equals("int")) {
                try {
                    int currentEvent = f.getInt(f);
                    if (currentEvent == eventCode) {
                        return f.getName();
                    }
                } catch (IllegalArgumentException e) {
                    // e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // e.printStackTrace();
                }
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets all events as a list.
     * 
     * @return all events as a list
     */
    public List<Integer> getEventCodesAsList() {
        LinkedList<Integer> returnList = new LinkedList<Integer>();

        int publicStaticFinalModifier = 0;
        try {
            publicStaticFinalModifier = KiemEvent.class
                    .getDeclaredField("NONE").getModifiers();
        } catch (SecurityException e0) {
            e0.printStackTrace();
        } catch (NoSuchFieldException e0) {
            e0.printStackTrace();
        }

        Field[] flds = KiemEvent.class.getDeclaredFields();
        for (Field f : flds) {
            if ((f.getType().getName().equals("int"))
                    && (f.getModifiers() == publicStaticFinalModifier)) {
                try {
                    int currentEvent = f.getInt(f);
                    if (currentEvent > 0 && this.isEvent(currentEvent)) {
                        // System.out.println(f.getName());
                        returnList.add(currentEvent);
                    }
                } catch (IllegalArgumentException e) {
                    // e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // e.printStackTrace();
                }
            }
        }

        return returnList;
    }
}
