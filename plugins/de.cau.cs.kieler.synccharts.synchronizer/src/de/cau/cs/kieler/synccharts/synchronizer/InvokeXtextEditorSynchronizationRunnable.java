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
package de.cau.cs.kieler.synccharts.synchronizer;

import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.ui.texteditor.TextOperationAction;
import org.eclipse.xtext.ui.editor.XtextEditor;
//import org.eclipse.xtext.ui.editor.model.edit.IDocumentEditor;

import de.cau.cs.kieler.core.WrappedException;
//import de.cau.cs.kieler.synccharts.text.ui.KitsUIPlugin;

/**
 * A Runnable encapsulating the activities for synchronizing a textual view.
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class InvokeXtextEditorSynchronizationRunnable implements Runnable {

    private XtextEditor xtextEditor;
//    private StringBuffer buffer;
    private DiffModel diffModel;

    public InvokeXtextEditorSynchronizationRunnable(XtextEditor theXtextEditor, DiffModel theDiffModel) {
        this.xtextEditor = theXtextEditor;
        this.diffModel = theDiffModel;
    }

    public void run() {
        try {
            /*
             * if the document in the xtext editor is empty no parsetree is available and the xtext
             * merge operation (else branch) will fail with a NullPointerException; thus, dump out
             * the merged model in a buffer and inject it into the editor afterwards
             */
            // if (Strings.isEmpty(xtextEditor.getDocument().get())) {
            // buffer = new StringBuffer();
            // xtextEditor.getDocument().modify(
            // new SynchronizeXtextEditorUnitOfWork(diffModel, null, buffer));
            // } else { }
//            IDocumentEditor documentEditor = KitsUIPlugin.getInstance()
//                    .getInjector(KitsUIPlugin.KITS_LANGUAGE).getInstance(IDocumentEditor.class);
//
//            documentEditor.process(new SynchronizeXtextEditorUnitOfWork(diffModel, null),
//                    xtextEditor.getDocument());
            
            xtextEditor.getDocument().modify(new SynchronizeXtextEditorUnitOfWork(diffModel, null));

            // if (this.buffer != null && !Strings.isEmpty(buffer.toString())) {
            // xtextEditor.getDocument().set(buffer.toString());
            // }
            
            // invoke the "GUI" format action (which is different from formatted serializing")
            // for proper output as line break before enum keyword (o->) doesn't work otherwise.
            ((TextOperationAction) xtextEditor.getAction("Format")).run();
        } catch (Exception e) {
            throw new WrappedException(e, ModelSynchronizer.MSG_XTEXT_REFRESH_FAILED);
        }
    }
}
