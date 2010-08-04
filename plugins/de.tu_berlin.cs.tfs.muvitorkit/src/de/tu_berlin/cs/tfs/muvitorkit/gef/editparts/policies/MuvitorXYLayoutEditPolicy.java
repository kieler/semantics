package de.tu_berlin.cs.tfs.muvitorkit.gef.editparts.policies;

import java.util.ArrayList;
import java.util.List;

import de.tu_berlin.cs.tfs.muvitorkit.actions.GenericPasteAction.PasteCommand;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.emf.clipboard.core.ClipboardUtil;

/**
 * This layout editpolicy installs {@link GhostFigureNonResizableEditPolicy}s on
 * an editpart's children, which will automatically show a ghost figure on
 * dragging for all children's figures that implement
 * {@link IGhostFigureProvider}. Furthermore it return a generic command for
 * clone requests.
 * 
 * @author Tony Modica
 */
public abstract class MuvitorXYLayoutEditPolicy extends XYLayoutEditPolicy {

	static public interface IGhostFigureProvider {
		IFigure getGhostFigure();
	}

	protected static class GhostFigureNonResizableEditPolicy extends
			NonResizableEditPolicy {

		/**
		 * ShadowPlaceFigure
		 */
		@Override
		protected IFigure createDragSourceFeedbackFigure() {
			if (getHostFigure() instanceof IGhostFigureProvider) {
				final IGhostFigureProvider hostFigure = (IGhostFigureProvider) getHostFigure();
				final IFigure ghostFigure = hostFigure.getGhostFigure();
				addFeedback(ghostFigure);
				return ghostFigure;
			}
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy#createAddCommand
	 * (org.eclipse.gef.EditPart, java.lang.Object)
	 */
	@Override
	protected Command createAddCommand(final EditPart child,
			final Object constraint) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.editpolicies.LayoutEditPolicy#getDeleteDependantCommand
	 * (org.eclipse.gef.Request)
	 */
	@Override
	protected Command getDeleteDependantCommand(final Request request) {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Command getCloneCommand(final ChangeBoundsRequest request) {
		final ArrayList<EObject> copies = new ArrayList<EObject>();
		for (final EditPart editPart : (List<EditPart>) request.getEditParts()) {
			final EObject copy = EcoreUtil.copy((EObject) editPart.getModel());
			setConstraint(copy, (Rectangle) getConstraintForClone(
					(GraphicalEditPart) editPart, request));
			copies.add(copy);
		}
		final String copyString = ClipboardUtil.copyElementsToString(copies,
				null, new NullProgressMonitor());
		final PasteCommand pasteCommand = new PasteCommand((EObject) getHost()
				.getModel(), copyString);
		return pasteCommand;
	}

	abstract protected void setConstraint(EObject model, Rectangle constraint);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.editpolicies.LayoutEditPolicy#createChildEditPolicy(org
	 * .eclipse.gef.EditPart)
	 */
	@Override
	protected EditPolicy createChildEditPolicy(final EditPart child) {
		return new GhostFigureNonResizableEditPolicy();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.editpolicies.XYLayoutEditPolicy#getMinimumSizeFor(org
	 * .eclipse.gef.GraphicalEditPart)
	 */
	@Override
	protected Dimension getMinimumSizeFor(final GraphicalEditPart child) {
		return child.getContentPane().getMinimumSize();
	}
}
