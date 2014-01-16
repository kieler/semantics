/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.ktm.klighd.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;
import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper;

/**
 * @author als
 * 
 */
public class OpenTransformationTreeHandler extends AbstractHandler {

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        final ISelection selection = HandlerUtil.getCurrentSelection(event);

        try {
            ResourceSet resourceSet = new ResourceSetImpl();
            IFile file = (IFile) ((IStructuredSelection) selection).getFirstElement();

            Resource resource =
                    resourceSet.getResource(URI.createFileURI(file.getLocationURI().getPath()),
                            true);

            ModelWrapper tree = null;
            for (EObject obj : resource.getContents()) {
                if (obj instanceof ModelWrapper) {
                    tree = (ModelWrapper) obj;
                    break;
                }
            }

            DiagramViewManager.getInstance().createView(
                    "de.cau.cs.kieler.ktm.klighd.TransformationTreeDiagramSynthesis",
                    file.getName(), tree, KlighdSynthesisProperties.newInstance());
        } catch (Exception e) {
            MessageDialog.openInformation(HandlerUtil.getActiveShell(event),
                    "Cannot open TransformationTree",
                    "Cannot open TransformationTree from current selection " + selection.toString()
                            + ".");
            e.printStackTrace();
        }
        return null;
    }

}
