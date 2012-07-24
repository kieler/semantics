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
package de.cau.cs.kieler.synccharts.text.kits.bridge;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.ui.editor.validation.MarkerIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.ValidationJob;
import org.eclipse.xtext.validation.CheckMode;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.xtext.AbstractXtextEditorValidationActionFactory;
import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.text.ui.KitsUIPlugin;

/**
 * Factory for constructing the validate actions for the actions grammar.
 * 
 * @author soh
 * @kieler.ignore (excluded from review process)
 */
public class KitsValidationActionFactory extends
        AbstractXtextEditorValidationActionFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public Action getValidationAction(final IWorkbenchPage page) {

        return new Action() {

            @Override
            public void run() {
                Injector injector = KitsUIPlugin.getInstance().getInjector(
                        "de.cau.cs.kieler.synccharts.text.kits.Kits");
                IEditorPart part = EditorUtils.getLastActiveEditor();
                if (part instanceof XtextEditor) {
                    XtextEditor xtextEditor = (XtextEditor) part;

                    /**
                     * taken from: org.eclipse.xtext.ui.editor.handler.
                     * ValidateActionHandler
                     */
                    MarkerIssueProcessor markerIssueProcessor = new MarkerIssueProcessor(
                            xtextEditor.getResource(),
                            injector.getInstance(org.eclipse.xtext.ui.editor.validation.MarkerCreator.class));
                    IXtextDocument xtextDocument = XtextDocumentUtil
                            .get(xtextEditor);
                    ValidationJob validationJob = new ValidationJob(
                            injector.getInstance(org.eclipse.xtext.validation.IResourceValidator.class),
                            xtextDocument, markerIssueProcessor, CheckMode.ALL);
                    validationJob.schedule();
                }
            }
        };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EPackage getEPackage() {
        return SyncchartsPackage.eINSTANCE;
    }
}
