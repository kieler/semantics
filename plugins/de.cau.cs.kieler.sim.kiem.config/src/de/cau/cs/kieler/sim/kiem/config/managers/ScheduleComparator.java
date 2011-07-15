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

package de.cau.cs.kieler.sim.kiem.config.managers;

import java.io.Serializable;
import java.util.Comparator;

import de.cau.cs.kieler.sim.kiem.config.data.EditorDefinition;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;

/**
 * Compares schedule data based on their supported priorities for an editor. The
 * sorter works in a way that the schedules with a high priority get the lowest
 * compare() value to ensure that they stand at the beginning of the list.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class ScheduleComparator implements Comparator<ScheduleData>,
        Serializable {

    /** Id for serialization. */
    private static final long serialVersionUID = -764086765589954316L;
    /** the editor to use for comparison. */
    private EditorDefinition editor;

    // --------------------------------------------------------------------------

    /**
     * Create a new comparator. Schedules are sorted by name.
     */
    public ScheduleComparator() {
        editor = null;
    }

    /**
     * Create a new comparator.
     * 
     * @param matchingEditor
     *            the editor to use for comparison.
     */
    public ScheduleComparator(final EditorDefinition matchingEditor) {
        this.editor = matchingEditor;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public int compare(final ScheduleData arg0, final ScheduleData arg1) {
        if (editor == null) {
            String string0 = "";
            String string1 = "";

            if (arg0 != null) {
                string0 = arg0.getExtendedName();
            }
            if (arg1 != null) {
                string1 = arg1.getExtendedName();
            }
            return string0.compareTo(string1);
        }
        Integer prio0 = Integer.MIN_VALUE;
        Integer prio1 = Integer.MIN_VALUE;

        if (arg0 != null) {
            prio0 = arg0.getSupportedPriority(editor.getEditorId());
        }
        if (arg1 != null) {
            prio1 = arg1.getSupportedPriority(editor.getEditorId());
        }
        return prio1.compareTo(prio0);

    }

}
