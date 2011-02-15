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
package de.cau.cs.kieler.kies.transformation.action;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;

import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil.TransformationType;

/**
 * @author uru
 * 
 */
public class InitialTransformationAction implements IActionDelegate {

    private IFile strlFile;

    /**
     * {@inheritDoc}
     */
    public void run(final IAction action) {
        if (strlFile == null || !strlFile.exists()) {
            return;
        }
        IFile kixsFile = TransformationUtil.strlToKixs(strlFile);
        TransformationUtil.performHeadlessTransformation(kixsFile, TransformationType.E2S);
        TransformationUtil.performHeadlessTransformation(kixsFile, TransformationType.SYNC_OPT);
        TransformationUtil.openKidsInEditor(kixsFile);
    }

    /**
     * {@inheritDoc}
     */
    public void selectionChanged(final IAction action, final ISelection selection) {
        action.setEnabled(false);
        if (!(selection instanceof IStructuredSelection) || selection.isEmpty()) {
            return;
        }
        strlFile = (IFile) ((IStructuredSelection) selection).getFirstElement();
        action.setEnabled(true);
    }

    /**
     * @return the currentFile
     */
    public IFile getCurrentFile() {
        return strlFile;
    }

}
