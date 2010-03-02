/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.synccharts.dsl.kits.glue.concurrency;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextViewerExtension;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.VerifyKeyListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtext.ui.core.editor.XtextEditor;

import de.cau.cs.kieler.kiml.ui.layout.DiagramLayoutManager;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.dsl.kits.glue.Activator;

/**
 * An observer to trigger auto layout in synchronization and detects concurrent
 * modifications on the same model
 * 
 * @author oba
 */
public class ConcurrentModificationObserver implements IPartListener,
        ResourceSetListener, VerifyKeyListener {

    private final IWorkbenchPage page;

    // private final Transformer transformer;

    /**
     * public constructor for the concurrent modification listener
     * 
     * @param activePage
     *            the currently active page
     */
    public ConcurrentModificationObserver(final IWorkbenchPage activePage) {
        // this.transformer = new Transformer();
        this.page = activePage;
        IEditorReference[] editorReferences = activePage.getEditorReferences();

        for (IEditorReference editorReference : editorReferences) {
            /**
             * get the editor from its reference without trying to restore it
             */
            IEditorPart editor = editorReference.getEditor(false);
            if (editor instanceof SyncchartsDiagramEditor) {
                ((DiagramEditor) editor).getEditingDomain()
                        .addResourceSetListener(this);
                System.out
                        .println("I have been added to: " + editor.getTitle());
            }
            if (editor instanceof XtextEditor) {

                ISourceViewer sourceViewer = ((XtextEditor) editor)
                        .getInternalSourceViewer();
                if (sourceViewer instanceof ITextViewerExtension) {
                    ((ITextViewerExtension) sourceViewer)
                            .appendVerifyKeyListener(this);
                }
            }
        }

    }

    private URI getEditorInputURI(final ITextEditor textEditor) {
        IEditorInput editorInput = textEditor.getEditorInput();
        if (editorInput instanceof FileEditorInput) {
            return URI.createPlatformResourceURI(
                    ((FileEditorInput) editorInput).getFile().getFullPath()
                            .toString(), true);
        } else if (editorInput instanceof URIEditorInput) {
            return ((URIEditorInput) editorInput).getURI();
        }
        return null;
    }

    /**
     * @see IPartListener#partOpened(IWorkbenchPart)
     */

    public void partOpened(final IWorkbenchPart part) {
        // add resource set listener to ThinkCharts editor when it is opened
        if (part instanceof DiagramEditor) {
            TransactionalEditingDomain editingDomain = ((DiagramEditor) part)
                    .getEditingDomain();
            editingDomain.addResourceSetListener(this);
            // trigger layout
            tryLayoutWholeDiagram(part);
            System.out.println("=====================");
            System.out.println("AutoLayout-PartOpened: " + part.getTitle());
            System.out.println("=====================");
        }
        // add verify key listener to Xtext editor when it is opened
        if (part instanceof XtextEditor) {
            ISourceViewer sourceViewer = ((XtextEditor) part)
                    .getInternalSourceViewer();
            if (sourceViewer instanceof ITextViewerExtension) {
                ((ITextViewerExtension) sourceViewer)
                        .appendVerifyKeyListener(this);
            }
        }
    }

    public void partClosed(final IWorkbenchPart part) {
        // remove the listener when the editors are closed
        if (part instanceof DiagramEditor) {
            TransactionalEditingDomain editingDomain = ((DiagramEditor) part)
                    .getEditingDomain();
            editingDomain.removeResourceSetListener(this);
        }
        if (part instanceof XtextEditor) {
            ISourceViewer sourceViewer = ((XtextEditor) part)
                    .getInternalSourceViewer();
            if (sourceViewer instanceof ITextViewerExtension) {
                ((ITextViewerExtension) sourceViewer)
                        .removeVerifyKeyListener(this);
            }
        }
    }

    public void partActivated(final IWorkbenchPart part) {
        // do nothing
    }

    public void partDeactivated(final IWorkbenchPart part) {
        // do nothing
    }

    public void partBroughtToTop(final IWorkbenchPart part) {
        // trigger layout
        if (part instanceof SyncchartsDiagramEditor) {
            tryLayoutWholeDiagram(part);
            System.out.println("=====================");
            System.out.println("AutoLayout-PartBroughtToTop: "
                    + part.getTitle());
            System.out.println("=====================");
        }
    }

    public NotificationFilter getFilter() {
        return NotificationFilter.ANY;
    }

    public boolean isAggregatePrecommitListener() {
        return false;
    }

    public boolean isPostcommitOnly() {
        return false;
    }

    public boolean isPrecommitOnly() {
        return true;
    }

    public void resourceSetChanged(final ResourceSetChangeEvent event) {
        // trigger layout
        IEditorPart editorPart = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow().getActivePage().getActiveEditor();
        tryLayoutWholeDiagram(editorPart);
        System.out.println("=====================");
        System.out.println("AutoLayout-ResourceSetChanged");
        System.out.println("=====================");
    }

    public Command transactionAboutToCommit(final ResourceSetChangeEvent event)
            throws RollbackException { // check concurrent editing

        List<Notification> notifications = event.getNotifications();

        Set<IEditorPart> conflictingEditors = new HashSet<IEditorPart>();

        for (Notification notification : notifications) {
            Object notifier = notification.getNotifier();
            if (notifier instanceof EObject) {
                Resource eResource = ((EObject) notifier).eResource();
                if (eResource != null) {
                    URI uri = eResource.getURI();
                    conflictingEditors.addAll(findConflictingEditors(uri));
                }
            }

        }
        for (Iterator<IEditorPart> i = conflictingEditors.iterator(); i
                .hasNext();) {
            IEditorPart conflictingEditor = i.next();
            if (conflictingEditor instanceof DiagramEditor) {
                if (((DiagramEditor) conflictingEditor).getEditingDomain()
                        .equals(event.getEditingDomain())) {
                    i.remove();
                }
            }
        }
        if (!conflictingEditors.isEmpty()) {// && !queryApplyChanges()) {
            throw new RollbackException(new Status(IStatus.ERROR,
                    Activator.PLUGIN_ID, "Transaction aborted by user"));
        }
        return null;
    }

    public void verifyKey(final VerifyEvent event) {
        IEditorPart editor = page.getActiveEditor();
        if (!editor.isDirty() && editor instanceof ITextEditor) {
            ITextEditor textEditor = (ITextEditor) editor;
            URI editorInputURI = getEditorInputURI(textEditor);
            List<IEditorPart> conflictingEditors = findConflictingEditors(editorInputURI);
            /**
             * queryApplyChanges is set to true if the user clicks on
             * "yes, apply" in the message dialog
             */
            if (!conflictingEditors.isEmpty() && !queryApplyChanges()) {
                event.doit = false;
            }
        }
    }

    private List<IEditorPart> findConflictingEditors(final URI resourceURI) {
        List<IEditorPart> conflictingDirtyEditors = new ArrayList<IEditorPart>();
        for (IEditorPart dirtyEditor : page.getDirtyEditors()) {
            if (dirtyEditor instanceof DiagramEditor) {
                DiagramEditor dirtyDiagramEditor = (DiagramEditor) dirtyEditor;
                ResourceSet resourceSet = dirtyDiagramEditor.getEditingDomain()
                        .getResourceSet();
                for (Resource diagramEditorResource : resourceSet
                        .getResources()) {
                    if (resourceURI.equals(diagramEditorResource.getURI())
                            && diagramEditorResource.isModified()) {
                        conflictingDirtyEditors.add(dirtyDiagramEditor);
                    }
                }
            }
            if (dirtyEditor instanceof ITextEditor) {
                URI editorInputURI = getEditorInputURI((ITextEditor) dirtyEditor);
                if (editorInputURI.equals(resourceURI)) {
                    conflictingDirtyEditors.add(dirtyEditor);
                }
            }
        }
        return conflictingDirtyEditors;
    }

    /**
     * boolean flag to activate/deactivate an event
     * 
     * @return yesResult
     */
    private boolean queryApplyChanges() {
        DialogPrompter dialogPrompter = new DialogPrompter();
        Display.getDefault().syncExec(dialogPrompter);
        boolean yesResult = dialogPrompter.isYesResult();
        return yesResult;
    }

    /**
     * Ask user if the resource should be saved although the changes in the
     * conflicting editors will be lost
     * 
     * @author oba
     * 
     */
    private class DialogPrompter implements Runnable {

        private boolean isYesResult;

        public boolean isYesResult() {
            return isYesResult;
        }

        public void run() {
            Shell shell = page.getWorkbenchWindow().getShell();
            isYesResult = MessageDialog
                    .open(
                            MessageDialog.QUESTION,
                            shell,
                            "KITE Concurrent Modification Observer",
                            "Other editors have a modified version of models you are going to change.\n"
                                    + "If apply your changes you are loosing the possibility to save the others.\n"
                                    + "Apply changes anyway?", SWT.NONE);
        }
    }

    // FIXME: Should be done with ViewManagement, see todo's for that below
    // TODO: Is it sufficient that the LayoutCombo, provided by the
    // ViewManagement is in the combinations list or do I need to add my own
    // combinations
    // there?
    // FIXME: Problem for now is that the trigger does not have any
    // listeners
    // RunLogic.getInstance().init();
    // RunLogic.getInstance().registerListeners();
    // AutoLayoutTrigger trigger = ((AutoLayoutTrigger) RunLogic
    // .getTrigger("de.cau.cs.kieler.synccharts.dsl.kits.autolayout.AutoLayoutTrigger"));
    // //here you have to give the name of the extension element
    // "trigger" and not the package name or so like I did!
    // if (trigger != null) {
    // trigger.triggerAutoLayout(e, (DiagramEditor) part);
    // }

    // ================ HELPER METHODS ================ //
    // @SuppressWarnings("unused")
    void tryLayoutWholeDiagram(final IWorkbenchPart part) {
        // trigger layout and catch exceptions
        if (part instanceof IEditorPart) {
            IEditorPart editor = ((IEditorPart) part);

            try {// second arg is null as we want to layout the complete diagram
                DiagramLayoutManager.layout(editor, null, true, false);

            } catch (Exception layoutFailed) {
                Status myStatus = new Status(
                        IStatus.WARNING,
                        Activator.PLUGIN_ID,
                        "Auto-layout failed. Please file a bug with the subject \"Auto Layout failed in ConcurrentModificationObserver\" ",
                        layoutFailed);
                StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
            }
        } else {
            Status myStatus = new Status(
                    IStatus.WARNING,
                    Activator.PLUGIN_ID,
                    "Auto-layout has been triggered from a non-editor WorkbenchPart. Please file a bug with the subject \"Auto Layout triggered from outside of an EditorPart\" ");
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
    }
}
