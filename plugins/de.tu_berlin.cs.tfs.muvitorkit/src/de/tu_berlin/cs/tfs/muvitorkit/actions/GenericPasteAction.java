package de.tu_berlin.cs.tfs.muvitorkit.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import de.tu_berlin.cs.tfs.muvitorkit.ui.MuvitorPage;
import de.tu_berlin.cs.tfs.muvitorkit.ui.MuvitorPageBookView;
import de.tu_berlin.cs.tfs.muvitorkit.ui.MuvitorTreeEditor;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.ui.actions.Clipboard;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.gmf.runtime.emf.clipboard.core.ClipboardUtil;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.IPage;

/**
 * This action pastes the clipboard into the current edit part if allowed
 * 
 * @author Tony Modica
 */
public class GenericPasteAction extends SelectionAction {

	final static Map<EClass, IPasteRule> pasteRules = new HashMap<EClass, IPasteRule>();

	private Command command = null;

	public GenericPasteAction(final IWorkbenchPart part) {
		super(part);
		setId(ActionFactory.PASTE.getId());
		super.setText("Paste");
		super.setDescription("Paste from clipboard");
		super.setToolTipText("Pastes the copied parts from the clipboard");

		// default rule for named elements
		registerPasteRule(EcorePackage.Literals.ENAMED_ELEMENT,
				new GenericPasteAction.PasteRuleAdapter() {
					@Override
					public void afterPaste(final EObject newElement,
							final EObject target) {
						final ENamedElement namedElement = (ENamedElement) newElement;
						final String name = namedElement.getName();
						// remove the annoying "Copy_1_"
						if (name.startsWith("Copy_1_")) {
							namedElement.setName(name.substring(7));
						}
					}
				});
	}

	@Override
	public void run() {
		execute(command);
	}

	@Override
	public boolean calculateEnabled() {
		final StructuredSelection selection = (StructuredSelection) getSelection();
		if (selection == null || selection.size() != 1) {
			return false;
		}
		final Object selectionElement = selection.getFirstElement();
		if (!(selectionElement instanceof EditPart)) {
			return false;
		}

		final Object model = ((EditPart) selectionElement).getModel();
		if (!(model instanceof EObject)) {
			return false;
		}
		EObject targetModel = (EObject) model;
		// is targetModel of appropriate type?
		if (!GenericCopyAction.allowedPasteTargetEClasses.contains(targetModel
				.eClass())) {
			/*
			 * for convenience: if parent is of appropriate type try pasting
			 * into parent
			 */
			final EObject container = targetModel.eContainer();
			if (container != null
					&& GenericCopyAction.allowedPasteTargetEClasses
							.contains(container.eClass())) {
				targetModel = container;
			} else {
				return false;
			}
		}

		final Object clipboardContents = Clipboard.getDefault().getContents();
		// ensure a collection of EObjects
		if (!(clipboardContents instanceof Collection<?>)) {
			return false;
		}
		for (final Object copy : (Collection<?>) clipboardContents) {
			if (!(copy instanceof EObject)) {
				return false;
			}
		}
		@SuppressWarnings("unchecked")
		final Collection<EObject> copies = (Collection<EObject>) clipboardContents;
		for (final EObject copy : copies) {
			final EList<EClass> copySuperTypes = copy.eClass()
					.getEAllSuperTypes();
			for (final Entry<EClass, IPasteRule> entry : pasteRules.entrySet()) {
				if (copySuperTypes.contains(entry.getKey())
						&& !entry.getValue().isValidPaste(copy, targetModel)) {
					return false;
				}
			}
		}

		final String clipString = ClipboardUtil.copyElementsToString(copies,
				null, new NullProgressMonitor());
		command = new PasteCommand(targetModel, clipString);
		return true;
	}

	public void registerPasteRule(final EClass eClass,
			final IPasteRule validator) {
		pasteRules.put(eClass, validator);
	}

	public static interface IPasteRule {
		public boolean isValidPaste(EObject element, EObject target);

		public void afterPaste(EObject element, EObject target);
	}

	public static class PasteRuleAdapter implements IPasteRule {
		public void afterPaste(final EObject element, final EObject target) {
		}

		public boolean isValidPaste(final EObject element, final EObject target) {
			return true;
		}
	}

	public static class PasteCommand extends Command {

		private final EObject target;

		private final String clipString;

		private Collection<EObject> pasted;

		/**
		 * @param target
		 * @param clipString
		 */
		public PasteCommand(final EObject target, final String clipString) {
			super();
			setLabel("paste into " + target.eClass().getName());
			if (target instanceof ENamedElement) {
				setLabel(getLabel() + " '" + ((ENamedElement) target).getName()
						+ "'");
			}
			this.target = target;
			this.clipString = clipString;
		}

		@SuppressWarnings("unchecked")
		@Override
		public void execute() {
			pasted = ClipboardUtil.pasteElementsFromString(clipString, target,
					null, new NullProgressMonitor());

			// get edit part map of current viewer we are pasting into
			final IWorkbenchPart activePart = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage().getActivePart();
			EditPartViewer viewer = null;
			if (activePart instanceof MuvitorTreeEditor) {
				viewer = ((MuvitorTreeEditor) activePart).getTreeViewer();
			} else if (activePart instanceof MuvitorPageBookView) {
				final IPage page = ((MuvitorPageBookView) activePart)
						.getCurrentPage();
				viewer = ((MuvitorPage) page).getCurrentViewer();
			} else {
				return;
			}
			// -------------------------------------------
			final ArrayList<EditPart> newEditParts = new ArrayList<EditPart>();

			for (final EObject copy : pasted) {
				final EList<EClass> copySuperTypes = copy.eClass()
						.getEAllSuperTypes();
				for (final Entry<EClass, IPasteRule> entry : pasteRules
						.entrySet()) {
					if (copySuperTypes.contains(entry.getKey())) {
						entry.getValue().afterPaste(copy, target);
					}
				}
				// ----------------------

				newEditParts.add((EditPart) viewer.getEditPartRegistry().get(
						copy));
			}
			final StructuredSelection newSelection = new StructuredSelection(
					newEditParts);
			viewer.setSelection(newSelection);
		}

		@Override
		public void undo() {
			final ArrayList<EObject> pastedElements = new ArrayList<EObject>(
					pasted);
			Collections.reverse(pastedElements);
			for (final EObject pastedElement : pastedElements) {
				EcoreUtil.remove(pastedElement);
			}
		}
	}
}
