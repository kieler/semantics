/**
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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.sbase;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import de.cau.cs.kieler.synccharts.State;

/**
 * Utility class for synccharts sbase.
 * 
 * @author Michaael Matzen - mim AT informatik.uni-kiel.de
 * 
 */
public final class Utils {

    private static State copiedState;

    /**
     * Private constructor, no instances of this class allowed.
     */
    private Utils() {
        copiedState = null;
    }

    /**
     * Stores the state reference.
     * 
     * @param s
     *            The state to store
     */
    public static void copyState(final State s) {
        copiedState = s;
    }

    /**
     * Test.
     * @param states Blabla
     */
    public static void copyStates(final EList<State> states) {
        
    }
    
    /**
     * Returns the copied state.
     * 
     * @return The copied state
     */
    public static State getBufferedState() {
        return copiedState;
    }
}
