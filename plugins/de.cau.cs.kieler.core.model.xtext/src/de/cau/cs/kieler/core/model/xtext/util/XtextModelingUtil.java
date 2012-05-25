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

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork.Void;

/**
 * Utility class for Xtext modeling.
 *
 * @author msp
 */
public final class XtextModelingUtil {

    /**
     * Hidden constructor to prevent instantiation.
     */
    private XtextModelingUtil() {
    }
    


    private static EObject xtextModel = null;
    private static boolean done = false;

    /**
     * Get the model from a given xtext editor.
     * 
     * @param xtextEd
     *            the editor
     * @return the model
     */
    public static EObject getModelFromXtextEditor(final XtextEditor xtextEd) {
        checkForDirtyEditor(xtextEd);
        IXtextDocument docu = xtextEd.getDocument();

        if (docu instanceof XtextDocument) {
            XtextDocument document = (XtextDocument) docu;

            xtextModel = null;
            done = false;
            document.readOnly(new Void<XtextResource>() {

                @Override
                public void process(final XtextResource state) throws Exception {
                    if (state != null) {
                        List<EObject> eObj = state.getContents();

                        if (!eObj.isEmpty()) {
                            xtextModel = eObj.get(0);
                        }
                    }
                    done = true;
                }
            });
        }
        while (!done){
        	try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// ignore sleep error
			}
        }
        return xtextModel;
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
