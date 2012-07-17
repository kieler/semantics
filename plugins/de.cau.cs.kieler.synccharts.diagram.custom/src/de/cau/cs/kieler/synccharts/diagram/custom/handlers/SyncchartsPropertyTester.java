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
package de.cau.cs.kieler.synccharts.diagram.custom.handlers;

import org.eclipse.core.expressions.PropertyTester;

import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * This tester determines whether the provided property of activeEditor is
 * called by a synccharts editor.
 * 
 * @author soh
 */
public class SyncchartsPropertyTester extends PropertyTester {

    private static boolean isKsbaseInactive = true;

    /**
     * Notify the tester that the synccharts.ksbase plugin is active. This is
     * necessary to hide the non-ksbase edit actions.
     */
    public static void ksbaseIsActive() {
        isKsbaseInactive = false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean test(final Object receiver, final String property,
            final Object[] args, final Object expectedValue) {
        if (property.equals("activeSyncchartsEditor")
                && receiver instanceof SyncchartsDiagramEditor) {
            return true;
        }
        if (property.equals("isKsbaseInactive")) {
            return isKsbaseInactive;
        }
        return false;
    }

}
