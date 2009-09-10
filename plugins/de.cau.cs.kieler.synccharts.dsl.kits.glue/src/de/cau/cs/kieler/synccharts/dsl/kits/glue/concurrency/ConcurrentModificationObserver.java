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
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtext.ui.core.editor.XtextEditor;

import de.cau.cs.kieler.synccharts.dsl.kits.glue.Activator;

/**
 * Detects concurrent modifications of diagrams and text files.
 * 
 * @author koehnlein
 * 
 */
public class ConcurrentModificationObserver implements IPartListener,
		ResourceSetListener, VerifyKeyListener {

	private IWorkbenchPage page;
	private Transformer transformer;

	public ConcurrentModificationObserver(IWorkbenchPage activePage) {
		this.transformer = new Transformer();
		this.page = activePage;
		IEditorReference[] editorReferences = activePage.getEditorReferences();

		for (IEditorReference editorReference : editorReferences) {
			IEditorPart editor = editorReference.getEditor(false);
			if (editor instanceof DiagramEditor) {
				((DiagramEditor) editor).getEditingDomain()
						.addResourceSetListener(this);
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

	private URI getEditorInputURI(ITextEditor textEditor) {
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

	public void partOpened(IWorkbenchPart part) {
		if (part instanceof DiagramEditor) {
			TransactionalEditingDomain editingDomain = ((DiagramEditor) part)
					.getEditingDomain();
			editingDomain.addResourceSetListener(this);
			// run layout

			transformer.ManualLayoutTrigger(part);
			transformer.setLabel2Id();

		}
		if (part instanceof XtextEditor) {
			ISourceViewer sourceViewer = ((XtextEditor) part)
					.getInternalSourceViewer();
			if (sourceViewer instanceof ITextViewerExtension) {
				((ITextViewerExtension) sourceViewer)
						.appendVerifyKeyListener(this);
			}
		}
	}

	public void partClosed(IWorkbenchPart part) {
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

	public void partActivated(IWorkbenchPart part) {
		// do nothing
	}

	public void partDeactivated(IWorkbenchPart part) {
		// do nothing
	}

	public void partBroughtToTop(IWorkbenchPart part) {
		// do nothing
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

	public void resourceSetChanged(ResourceSetChangeEvent event) {
		// do nothing
		System.out.println("==============================");
		System.out.println("I AM IN: resourceSetChanged");
		System.out.println("==============================");

	}

	public Command transactionAboutToCommit(ResourceSetChangeEvent event)
			throws RollbackException {

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
		if (!conflictingEditors.isEmpty() && !queryApplyChanges()) {
			throw new RollbackException(new Status(IStatus.ERROR,
					Activator.PLUGIN_ID, "Transaction aborted by user"));
		}
		// do nothing
		System.out.println("==============================");
		System.out.println("I AM IN: transactionAboutToCommit");
		System.out.println("==============================");

		return null;
	}

	public void verifyKey(VerifyEvent event) {
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

	private List<IEditorPart> findConflictingEditors(URI resourceURI) {
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

	// FIXME: Trigger view management rather than
	// TODO: Is it sufficient that the LayoutCombo, provided by the
	// ViewManagement is in the combinations list or do I need to add my own
	// combinations
	// there?
	// TODO: Uncomment this part later when you understand how to activate
	// the combinations
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

}
