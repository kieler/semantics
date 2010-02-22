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
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;

import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInterfaceDeclaration2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInterfaceDeclarationEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateOnEntryAction2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateOnEntryActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * Handles edit requests for model elements.
 * 
 * @author uru
 * @author car
 */
public class EditInStateHandler extends AbstractHandler implements IHandler {

    /** parameter for type of element to edit. */
    public static final String TYPE_PARAM = "de.cau.cs.kieler.synccharts.custom.parameters.type";

    private static final String VAL_IFDECL = "InterfaceDeclaration";

    private static final String DEFAULT_INTERFACEDECL_STRING = "signal a, b, c;";

    /**
     * {@inheritDoc}
     */
    @Override
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        IStructuredSelection selection = (IStructuredSelection) HandlerUtil
                .getActiveMenuSelection(event);
        if (selection == null) {
            selection = (IStructuredSelection) HandlerUtil
                    .getCurrentSelection(event);
        }
        String type = event.getParameter(TYPE_PARAM);
        if (selection != null && type != null) {
            // edit each selected node
            Iterator<?> selectionIter = selection.iterator();
            while (selectionIter.hasNext()) {
                Object nextObj = selectionIter.next();
                if (nextObj instanceof StateEditPart
                        || nextObj instanceof State2EditPart) {
                    editElement((ShapeNodeEditPart) nextObj, type);
                } else if (nextObj instanceof ShapeCompartmentEditPart
                        || nextObj instanceof ITextAwareEditPart) {
                    EditPart parent = ((EditPart) nextObj).getParent();
                    if (parent instanceof StateEditPart
                            || parent instanceof State2EditPart) {
                        editElement((ShapeNodeEditPart) parent, type);
                    }
                }
            }
        }
        return null;
    }

    /**
     * selects the element which should be edited.
     * 
     * @param stateEditPart
     *            parent edit part
     * @param type
     *            element type which should be edited
     */
    private void editElement(final ShapeNodeEditPart stateEditPart,
            final String type) {

        Class<?> class1 = null, class2 = null;
        String insertIfEmpty = null;
        if (type.equals(VAL_IFDECL)) {
            class1 = StateInterfaceDeclarationEditPart.class;
            class2 = StateInterfaceDeclaration2EditPart.class;
            insertIfEmpty = DEFAULT_INTERFACEDECL_STRING;
        }

        final EditPartViewer viewer = stateEditPart.getViewer();

        EditPart editPart = null;
        // find matching EditPart
        for (Object editObj : stateEditPart.getChildren()) {
            if (editObj.getClass().equals(class1)
                    || editObj.getClass().equals(class2)) {
                editPart = (EditPart) editObj;
                break;
            }
        }

        // insert a given string in case editPart supports it
        if (editPart instanceof ITextAwareEditPart && insertIfEmpty != null) {
            IParser p = ((ITextAwareEditPart) editPart).getParser();
            // only edit if empty, other behaviors like append would also be possible 
            if (p.getEditString(editPart, 0).length() == 0) {
                ICommand c = p.getParseCommand(editPart, insertIfEmpty, 0);
                try {
                    c.execute(null, null);
                } catch (ExecutionException e) {
                    // if it fails we do not want to nag the user
                }
            }
        }

        // select it (if any) and send edit request
        if (editPart != null) {
            final EditPart elementPart = editPart;
            Display.getCurrent().asyncExec(new Runnable() {
                public void run() {
                    viewer.setSelection(new StructuredSelection(elementPart));
                    Request der = new Request(RequestConstants.REQ_DIRECT_EDIT);
                    elementPart.performRequest(der);
                }
            });
        }
        return;
    }
}
