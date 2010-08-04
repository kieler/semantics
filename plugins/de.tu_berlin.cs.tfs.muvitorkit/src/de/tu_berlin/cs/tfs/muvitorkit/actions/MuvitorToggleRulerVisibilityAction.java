package de.tu_berlin.cs.tfs.muvitorkit.actions;

import de.tu_berlin.cs.tfs.muvitorkit.ui.utils.IconUtilTemplate;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.internal.GEFMessages;
import org.eclipse.gef.rulers.RulerProvider;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.gef.ui.actions.ToggleRulerVisibilityAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

/**
 * An action that toggles the ruler
 * {@link org.eclipse.gef.rulers.RulerProvider#PROPERTY_RULER_VISIBILITY
 * visibility} property on the given viewer. This action can handle the case
 * where that property is not set on the viewer initially. This class is a
 * generalization of {@link ToggleRulerVisibilityAction} to handle several
 * viewers.
 * 
 * @author "Tony Modica"
 */
@SuppressWarnings("restriction")
public class MuvitorToggleRulerVisibilityAction extends SelectionAction {

	/**
	 * the viewer containing the currently selected GraphicalEditPart
	 */
	private EditPartViewer viewer;

	/**
	 * Constructor.
	 */
	public MuvitorToggleRulerVisibilityAction(final IWorkbenchPart part) {
		super(part, AS_CHECK_BOX);
		setText(GEFMessages.ToggleRulerVisibility_Label);
		setToolTipText(GEFMessages.ToggleRulerVisibility_Tooltip);
		setId(GEFActionConstants.TOGGLE_RULER_VISIBILITY);
		setImageDescriptor(IconUtilTemplate.getDescriptor(
				IconUtilTemplate.RULER, 16));
		setChecked(isChecked());
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
		viewer.setProperty(RulerProvider.PROPERTY_RULER_VISIBILITY, val);
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
				.getProperty(RulerProvider.PROPERTY_RULER_VISIBILITY);
		setChecked(val == null ? false : val.booleanValue());
	}
}
