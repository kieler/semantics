package de.tu_berlin.cs.tfs.muvitorkit.gef.directedit;

import de.tu_berlin.cs.tfs.muvitorkit.commands.SetEObjectFeatureValueCommand;
import de.tu_berlin.cs.tfs.muvitorkit.gef.directedit.IDirectEditPart.IGraphicalDirectEditPart;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.swt.widgets.Text;

/**
 * The direct edit policy for {@link IGraphicalDirectEditPart}s. Creates a
 * {@link SetEObjectFeatureValueCommand} and updates the figure while typing.
 * 
 * @author Tony Modica
 */
public class MuvitorDirectEditPolicy extends DirectEditPolicy {

	/*
	 * @see DirectEditPolicy#getDirectEditCommand(DirectEditRequest)
	 */
	@Override
	protected Command getDirectEditCommand(final DirectEditRequest edit) {
		final String labelText = (String) edit.getCellEditor().getValue();
		final IGraphicalDirectEditPart graphicalDirectEditPart = (IGraphicalDirectEditPart) getHost();
		return new SetEObjectFeatureValueCommand(
				(EObject) getHost().getModel(), labelText.trim(),
				graphicalDirectEditPart.getDirectEditFeatureID());
	}

	/*
	 * @see DirectEditPolicy#showCurrentEditValue(DirectEditRequest)
	 */
	@Override
	protected void showCurrentEditValue(final DirectEditRequest request) {
		/*
		 * getCellEditor().getValue() returns null when invalid, so get the text
		 * directly
		 */
		final String value = ((Text) request.getCellEditor().getControl())
				.getText();
		((IGraphicalDirectEditPart) getHost()).updateValueDisplay(value);
		// hack to prevent async layout from placing the cell editor twice.
		getHostFigure().getUpdateManager().performUpdate();
	}

}
