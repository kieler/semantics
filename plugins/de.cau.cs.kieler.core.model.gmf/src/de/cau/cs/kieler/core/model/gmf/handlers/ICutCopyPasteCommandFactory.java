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
package de.cau.cs.kieler.core.model.gmf.handlers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;

/**
 * Interface for factories that provide the commands for cut, copy and paste on
 * given selections inside a diagram.
 * 
 * @author soh
 */
public interface ICutCopyPasteCommandFactory {

    /**
     * Build the cut command.
     * 
     * @param part
     *            the diagram editor
     * @param selection
     *            the current selection
     * @return the command
     */
    ICommand buildCutCommand(final IDiagramWorkbenchPart part,
            final List<EObject> selection);

    /**
     * Build the copy command.
     * 
     * @param part
     *            the diagram editor
     * @param selection
     *            the current selection
     * @return the command
     */
    ICommand buildCopyCommand(final IDiagramWorkbenchPart part,
            final List<EObject> selection);

    /**
     * Build the paste command.
     * 
     * @param part
     *            the diagram editor
     * @param selection
     *            the current selection
     * @return the command
     */
    ICommand buildPasteCommand(final IDiagramWorkbenchPart part,
            final List<EObject> selection);

}
