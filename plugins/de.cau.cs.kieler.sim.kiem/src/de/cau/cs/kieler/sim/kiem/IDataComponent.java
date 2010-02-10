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

/**
 * The Interface IDataComponent that a
 * {@link de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent} implements.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 yellow
 * 
 */
public interface IDataComponent {

    // -------------------------------------------------------------------------

    /**
     * Initialize. Do some initializing prior to execution. If an error occurs during
     * initialization, the DataComponent should raise a {@link KiemInitializationException}.
     * 
     * @throws KiemInitializationException
     *             a KiemInitializationException
     */
    void initialize() throws KiemInitializationException;

    // -------------------------------------------------------------------------

    /**
     * Wrap-up. Do some wrapping-up after execution has finished. If an error occurs during wrap up,
     * the DataComponent should raise a {@link KiemInitializationException}.
     * 
     * @throws KiemInitializationException
     *             a KiemInitializationException
     */
    void wrapup() throws KiemInitializationException;

    // -------------------------------------------------------------------------

    /**
     * To check whether the DataComponent is a producer. If the DataComponent is a producer it
     * should return != null in its step() method.
     * 
     * @return true, if is producer
     */
    boolean isProducer();

    // -------------------------------------------------------------------------

    /**
     * To check whether the DataComponent is an observer. If the DataComponent is an observer the
     * arguments in its step() method will be != null.
     * 
     * @return true, if is observer
     */
    boolean isObserver();

}
