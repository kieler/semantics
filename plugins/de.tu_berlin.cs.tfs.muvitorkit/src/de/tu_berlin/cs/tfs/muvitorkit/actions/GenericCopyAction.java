package de.tu_berlin.cs.tfs.muvitorkit.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.ui.actions.Clipboard;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.ActionFactory;

/**
 * This action copies any kind model in form of a serialized String into the
 * system's clipboard. ConnectionEditParts are always copied with their source
 * and targets.
 * 
 * @author Tony Modica
 */
public class GenericCopyAction extends SelectionAction {
	final private Collection<EObject> selection = new HashSet<EObject>();
	private EClass currentContainerEClass;
	static List<EClass> allowedPasteTargetEClasses = Collections.emptyList();

	/**
	 *
	 */
	public GenericCopyAction(final IWorkbenchPart part) {
		super(part);
		setId(ActionFactory.COPY.getId());
		super.setText("Copy");
		super.setDescription("Copy parts to clipboard");
		super.setToolTipText("Copies the selected parts to the clipboard");
	}

	/**
	 * just serialize the source...
	 */
	@Override
	public void run() {
		final Collection<EObject> copyCollection = EcoreUtil.copyAll(selection);
		Clipboard.getDefault().setContents(copyCollection);
		final List<EClass> newTargetEClasses = new ArrayList<EClass>(
				currentContainerEClass.getEAllSuperTypes());
		newTargetEClasses.add(currentContainerEClass);
		allowedPasteTargetEClasses = Collections
				.unmodifiableList(newTargetEClasses);
	}

	@Override
	public boolean calculateEnabled() {
		final List<?> selectedObjects = getSelectedObjects();
		if (selectedObjects == null || selectedObjects.isEmpty()) {
			return false;
		}
		selection.clear();
		currentContainerEClass = null;
		for (final Object element : selectedObjects) {
			if (!(element instanceof EditPart)) {
				return false;
			}
			final EditPart editpart = (EditPart) element;
			if (!(editpart.getModel() instanceof EObject)) {
				return false;
			}
			final EObject model = (EObject) ((EditPart) element).getModel();
			final EObject container = model.eContainer();
			// we do not allow copying of the top element
			if (container == null) {
				return false;
			}
			final EClass containerEClass = container.eClass();
			if (currentContainerEClass != null
					&& currentContainerEClass != containerEClass) {
				// only copy elements that can put into the same parent
				return false;
			}
			// store container ID
			currentContainerEClass = containerEClass;

			// also copy sources and targets for connections
			if (editpart instanceof ConnectionEditPart) {
				final ConnectionEditPart connection = (ConnectionEditPart) editpart;
				selection.add((EObject) connection.getSource().getModel());
				selection.add((EObject) connection.getTarget().getModel());
			}

			selection.add(model);
		}

		return !selection.isEmpty();
	}
}
