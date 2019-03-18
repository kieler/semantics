/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.circuit.klighd;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.klighd.IDiagramWorkbenchPart;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;

/**
 * A simple handler for opening diagrams.
 */
public class OpenDiagramHandler extends AbstractHandler {

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        final ISelection selection = HandlerUtil.getCurrentSelection(event);

        if (selection instanceof ITextSelection) {
            IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
            
            // because of the visibility expressions in the plugin.xml guarding the menu contributions
            //  we can conclude to have a selection stemming from an XtextEditor; thus...
            IDiagramWorkbenchPart diagramPart = DiagramViewManager.createView(
                    "de.cau.cs.kieler.circuit.klighd.ActorDiagram", "Actor Diagram",
                    XtextEditorUtil.getXtextModelAccessProxy(activeEditor));
        
            
            if (diagramPart != null) {
                XtextEditorUtil.registerSelectionListener(activeEditor, diagramPart);
            }
        
        } else if (selection instanceof IStructuredSelection) {
            final IStructuredSelection sSelection  = (IStructuredSelection) selection;

            final Object firstElement = sSelection.getFirstElement();
            final Object model;

            if (firstElement instanceof IFile) {
                try {
                    final ResourceSet rs = new ResourceSetImpl();
                    final Resource r = rs.getResource(URI.createPlatformResourceURI(
                            ((IFile) firstElement).getFullPath().toString(), true), true);
                    EcoreUtil.resolveAll(r);

                    if (r.getContents().size() > 0) {
                        model = r.getContents().get(0);
                        r.unload();
                    } else {
                        r.unload();
                        return null;
                    }

                } catch (Exception e) {
                    final String message = "Could not load selected file.";
                    StatusManager.getManager().handle(
                            new Status(IStatus.ERROR, this.getClass().getCanonicalName(), message, e),
                            StatusManager.SHOW);
                    return null;
                }
            } else {
                model = firstElement;
            }

            DiagramViewManager.createView(
                    "de.cau.cs.kieler.circuit.klighd.ActorDiagram", "Actor Diagram", model);
        } else {
            MessageDialog.openInformation(HandlerUtil.getActiveShell(event), "Unsupported element",
                    "KLighD diagram synthesis is unsupported for the current selection "
                            + selection.toString() + ".");
        }
        return null;
    }
}
