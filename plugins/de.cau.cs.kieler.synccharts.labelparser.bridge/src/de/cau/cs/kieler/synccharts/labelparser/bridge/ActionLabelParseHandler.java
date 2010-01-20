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
 * 
 */
package de.cau.cs.kieler.synccharts.labelparser.bridge;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.synccharts.Region;

/**
 * A command handler that looks for an SyncCharts graphical GMF editor and
 * parses all action labels again and then serializes all again.
 * 
 * @author haf
 * 
 * @kieler.rating 2010-01-19 proposed yellow proposed by haf
 */
public class ActionLabelParseHandler extends AbstractHandler {

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "");
        try {
            IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getActivePage().getActiveEditor();
            EditPart rootEditPart = ((DiagramEditor) editor).getDiagramEditPart();
            Object rootView = rootEditPart.getModel();
            EObject rootModel = ((View) rootView).getElement();
            if (rootModel instanceof Region) {
                ActionLabelProcessorWrapper.processActionLabels(rootModel,
                        ActionLabelProcessorWrapper.SERIALIZE);
                ActionLabelProcessorWrapper.processActionLabels(rootModel,
                        ActionLabelProcessorWrapper.PARSE);
            } else {
                throw new KielerException("Root model element is no Region");
            }
            myStatus = new Status(IStatus.OK, Activator.PLUGIN_ID,
                    "Parsing and re-serialization of action strings done.");
        } catch (NullPointerException e) {
            myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "No SyncChart Editor open. This is a seldom occuring "
                            + "exception that we could not yet reproduce. Please report "
                            + "the stack trace to the KIELER developer team.", e);
        } catch (ClassCastException e) {
            myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "Not a SyncChart Editor open. ", e);
        } catch (Exception e) {
            myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "Error parsing an action label. ", e);
        } finally {
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
        return null;
    }

}
