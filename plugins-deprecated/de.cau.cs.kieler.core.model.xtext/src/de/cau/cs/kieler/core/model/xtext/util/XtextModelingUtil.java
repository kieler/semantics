/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.xtext.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * Utility class for Xtext modeling.
 * 
 * @author msp, cmot
 */
public final class XtextModelingUtil {

    /**
     * Hidden constructor to prevent instantiation.
     */
    private XtextModelingUtil() {
    }

    /**
     * Get the model from a given xtext editor.
     * 
     * @param xtextEditor
     *            the Xtext editor
     * @param ignoreDirtyEditor
     *            the ignore dirty editor
     * @return the EObject of the root part of the model
     */
    public static EObject getModelFromXtextEditor(final XtextEditor xtextEditor,
            final boolean ignoreDirtyEditor) {

        if (!ignoreDirtyEditor) {
            checkForDirtyEditor(xtextEditor);
        }

        IXtextDocument xtextDocument = xtextEditor.getDocument();

        if (xtextDocument instanceof XtextDocument) {
            IParseResult result = null;
            IUnitOfWork<IParseResult, XtextResource> work
                    = new IUnitOfWork<IParseResult, XtextResource>() {
                public IParseResult exec(final XtextResource xtextResource) throws Exception {
                    return xtextResource.getParseResult();
                }
            };
            result = xtextDocument.readOnly(work);
            return result.getRootASTElement();
        }
        return null;
    }

    private static void checkForDirtyEditor(final XtextEditor diagramEditor) {
        if (diagramEditor.isDirty()) {
            final Shell shell = Display.getCurrent().getShells()[0];
            boolean b = MessageDialog.openQuestion(shell, "Save Resource", "'"
                    + diagramEditor.getEditorInput().getName() + "'"
                    + " has been modified. Save changes before simulating? (XtextModelingUtil)");
            if (b) {
                IEditorSite part = diagramEditor.getEditorSite();
                part.getPage().saveEditor((IEditorPart) part.getPart(), false);
            }
        }
    }

}
