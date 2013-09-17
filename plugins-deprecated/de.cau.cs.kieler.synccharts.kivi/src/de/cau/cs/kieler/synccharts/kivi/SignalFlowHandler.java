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
package de.cau.cs.kieler.synccharts.kivi;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.ToolItem;

/**
 * Handles the button for showing the signal flow.
 * 
 * @author mmu
 * @kieler.ignore (excluded from review process)
 */
public class SignalFlowHandler extends AbstractHandler {

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        if (event.getTrigger() instanceof Event) {
            Event e = (Event) event.getTrigger();
            if (e.widget instanceof ToolItem) {
                ToolItem tool = (ToolItem) e.widget;
                boolean pushed = tool.getSelection();
                SignalFlowTrigger trigger = SignalFlowTrigger.getInstance();
                if (trigger != null) {
                    trigger.button(pushed);
                }
            }
        }
        return null;
    }

}
