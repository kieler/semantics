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
package de.cau.cs.kieler.core.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.ui.CoreUIPlugin;

/**
 * A Command handler that removes all problem markers from the currently opened
 * file/diagram.
 * 
 * @author haf
 */
public class RemoveMarkerHandler extends AbstractHandler {

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        // get currently opened file
        IEditorInput input = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                .getActiveEditor().getEditorInput();
        if (input instanceof FileEditorInput) {
            try {
                IMarker[] markers = ((FileEditorInput) input).getFile().findMarkers(
                        "de.cau.cs.kieler.synccharts.diagram.diagnostic", true,
                        IResource.DEPTH_INFINITE);
                for (int i = 0; i < markers.length; i++) {
                    markers[i].delete();
                }
            } catch (Exception e) {
                Status myStatus = new Status(IStatus.ERROR, CoreUIPlugin.PLUGIN_ID,
                        "Some Problem markers could not be removed: " + e.getClass().getName(), e);
                StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
            }
        }
        return null;
    }

}
