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

import java.util.Iterator;

import org.eclipse.gef.EditPart;
import org.eclipse.jface.viewers.IStructuredSelection;

import de.cau.cs.kieler.core.model.gmf.handlers.AbstractCutCopyPasteHandler;
import de.cau.cs.kieler.core.model.gmf.handlers.ICutCopyPasteCommandFactory;
import de.cau.cs.kieler.synccharts.diagram.custom.commands.SyncchartsCutCopyPasteCommandFactory;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;

/**
 * Synccharts specific handler for the copy and paste operations. Determines
 * whether or not a selection is valid and creates a command factory.
 * 
 * @author soh
 * @kieler.ignore (excluded from review process)
 */
public class SyncchartsCutCopyPasteHandler extends AbstractCutCopyPasteHandler {

    /**
     * Creates a new SyncchartsCutCopyPasteHandler.
     */
    public SyncchartsCutCopyPasteHandler() {
        super();
    }

    /**
     * Checks whether the selection contains only valid parts.
     * 
     * @param selection
     *            the selection
     * @return true if only valid parts are in the selection
     */
    @Override
    protected boolean isValidSelection(final IStructuredSelection selection) {
        Iterator<?> iter = selection.iterator();

        while (iter.hasNext()) {
            Object object = iter.next();
            if (object instanceof EditPart) {
                EditPart editPart = (EditPart) object;
                if (editPart instanceof RegionStateEditPart) {
                    continue;
                } else if (editPart instanceof StateEditPart) {
                    continue;
                } else if (editPart instanceof RegionEditPart) {
                    continue;
                } else if (editPart instanceof StateRegionEditPart) {
                    continue;
                } else if (editPart instanceof TransitionEditPart) {
                    continue;
                }
            }
            // selection contains invalid parts, return.
            return false;
        }
        // no invalid parts found
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ICutCopyPasteCommandFactory getCommandFactory() {
        return new SyncchartsCutCopyPasteCommandFactory();
    }

}
