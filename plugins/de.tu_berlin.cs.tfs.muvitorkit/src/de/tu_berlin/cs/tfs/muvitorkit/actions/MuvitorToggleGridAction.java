package de.tu_berlin.cs.tfs.muvitorkit.actions;

import de.tu_berlin.cs.tfs.muvitorkit.ui.utils.IconUtilTemplate;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.internal.GEFMessages;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.gef.ui.actions.ToggleGridAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

/**
 * An action that toggles the grid. This action keeps the
 * {@link org.eclipse.gef.SnapToGrid#PROPERTY_GRID_VISIBLE visibility} and
 * {@link org.eclipse.gef.SnapToGrid#PROPERTY_GRID_ENABLED enabled} properties
 * in sync, i.e., it toggles both at the same time. This action can handle the
 * case where these properties are not set on the given viewer initially. This
 * class is a generalization of {@link ToggleGridAction} to handle several
 * viewers.
 * 
 * @author "Tony Modica"
 */
@SuppressWarnings("restriction")
public class MuvitorToggleGridAction extends SelectionAction {

	/**
	 * the viewer containing the currently selected GraphicalEditPart
	 */
	private EditPartViewer viewer;

	/**
	 * Constructor.
	 */
	public MuvitorToggleGridAction(final IWorkbenchPart part) {
		super(part, AS_CHECK_BOX);
		setToolTipText(GEFMessages.ToggleGrid_Tooltip);
		setText(GEFMessages.ToggleGrid_Label);
		setId(GEFActionConstants.TOGGLE_GRID_VISIBILITY);
		setImageDescriptor(IconUtilTemplate.getDescriptor(
				IconUtilTemplate.GRID, 16));
	}

	/**
	 * @see org.eclipse.jface.action.IAction#run()
	 */
	@Override
	public void run() {
		// when invoking directly, a viewer must be set manually!
		if (viewer == null) {
			return;
		}
		final Boolean val = Boolean.valueOf(!isChecked());
		viewer.setProperty(SnapToGrid.PROPERTY_GRID_VISIBLE, val);
		viewer.setProperty(SnapToGrid.PROPERTY_GRID_ENABLED, val);
		setChecked(val.booleanValue());
	}

	/**
	 * This action is enabled if some graphical edit part is currently selected
	 * from which a viewer can be determined.
	 */
	@Override
	protected boolean calculateEnabled() {
		if (getSelection() == null) {
			return false;
		}
		final IStructuredSelection selection = (IStructuredSelection) getSelection();
		for (final Object selectedObject : selection.toList()) {
			if (selectedObject instanceof GraphicalEditPart) {
				final EditPartViewer selectedViewer = ((GraphicalEditPart) selectedObject)
						.getViewer();
				if (selectedViewer != null) {
					setViewer(selectedViewer);
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * This setter allows universal usage of this action. Just call the
	 * constructor with <code>null</code> and set the viewer manually.
	 * 
	 * @param viewer
	 */
	public void setViewer(final EditPartViewer viewer) {
		this.viewer = viewer;
		final Boolean val = (Boolean) viewer
				.getProperty(SnapToGrid.PROPERTY_GRID_ENABLED);
		setChecked(val == null ? false : val.booleanValue());
	}
}
