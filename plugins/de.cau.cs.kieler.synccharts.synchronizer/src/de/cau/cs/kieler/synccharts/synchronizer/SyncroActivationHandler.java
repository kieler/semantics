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
package de.cau.cs.kieler.synccharts.synchronizer;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.commands.IElementUpdater;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Handler for (de-)activating the graphic / text synchronization.
 * 
 * If this class implements {@link IElementUpdater} it will be
 * directly in charge of determining the state of the toggle button.  
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class SyncroActivationHandler extends AbstractHandler {

    /**
     * {@inheritDoc}
     */
    public Object execute(ExecutionEvent event) throws ExecutionException {        
        ModelSynchronizer.INSTANCE.setActive(
                // This is rather weird:
                // toggleCommandState returns the oldState,
                // not the state holding after hitting the button
                // so it is negated!
                !HandlerUtil.toggleCommandState(event.getCommand()));
        return null;
    }

}
