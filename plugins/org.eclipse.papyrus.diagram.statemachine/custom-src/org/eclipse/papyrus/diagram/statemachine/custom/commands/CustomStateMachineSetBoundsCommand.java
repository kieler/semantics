package org.eclipse.papyrus.diagram.statemachine.custom.commands;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.statemachine.custom.helpers.Zone;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.RegionEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateMachineCompartmentEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateMachineNameEditPart;
import org.eclipse.papyrus.diagram.statemachine.part.UMLVisualIDRegistry;

public class CustomStateMachineSetBoundsCommand extends AbstractTransactionalCommand {

	CreateViewRequest.ViewDescriptor viewDescriptor;

	Rectangle rect;

	Point location;

	Dimension size;

	public CustomStateMachineSetBoundsCommand(TransactionalEditingDomain domain, String label, CreateViewRequest.ViewDescriptor viewDescriptor, Rectangle rect) {
		super(domain, label, null);

		this.viewDescriptor = viewDescriptor;

		this.rect = rect;
		location = rect.getLocation();
		size = rect.getSize();

		// make sure the return object is available even before
		// executing/undoing/redoing
		setResult(CommandResult.newOKCommandResult(viewDescriptor));
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {

		View stateMachineView = (View)viewDescriptor.getAdapter(View.class);
		if(location != null) {
			Zone.setX(stateMachineView, location.x);
			Zone.setY(stateMachineView, location.y);
		}
		if((size != null) && !size.equals(-1, -1)) {
			Zone.setWidth(stateMachineView, size.width);
			Zone.setHeight(stateMachineView, size.height);
		} else {
			Zone.setWidth(stateMachineView, Zone.defaultWidth);
			Zone.setHeight(stateMachineView, Zone.defaultHeight);
		}

		Iterator<Node> it = stateMachineView.getChildren().iterator();

		while(it.hasNext()) {
			Node currentNode = it.next();
			if(currentNode.getLayoutConstraint() == null) {
				currentNode.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
			}
			if(UMLVisualIDRegistry.getVisualID(currentNode.getType()) == StateMachineNameEditPart.VISUAL_ID) {
				if((size != null) && !size.equals(-1, -1)) {
					Zone.setWidth(currentNode, size.width);
					Zone.setHeight(currentNode, Zone.defaultHeader);
				} else {
					Zone.setWidth(currentNode, Zone.defaultWidth);
					Zone.setHeight(currentNode, Zone.defaultHeader);
				}
			} else if(UMLVisualIDRegistry.getVisualID(currentNode.getType()) == StateMachineCompartmentEditPart.VISUAL_ID) {
				Zone.setY(currentNode, Zone.defaultHeader);
				if((size != null) && !size.equals(-1, -1)) {
					Zone.setWidth(currentNode, size.width);
					Zone.setHeight(currentNode, size.height - Zone.defaultHeader);
				} else {
					Zone.setWidth(currentNode, Zone.defaultWidth);
					Zone.setHeight(currentNode, Zone.defaultHeight - Zone.defaultHeader);
				}
				int nRegions = currentNode.getChildren().size();
				String prefix = "";
				String zone = "";
				int i = 0;
				int width = 0;
				Iterator<Node> subit = currentNode.getChildren().iterator();
				while(subit.hasNext()) {
					Node subCurrentNode = subit.next();
					if(subCurrentNode.getLayoutConstraint() == null) {
						subCurrentNode.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
					}
					if(UMLVisualIDRegistry.getVisualID(subCurrentNode.getType()) == RegionEditPart.VISUAL_ID) {
						if((size != null) && !size.equals(-1, -1)) {
							Zone.setWidth(subCurrentNode, (i == nRegions - 1) ? size.width - width : size.width / nRegions);
							Zone.setHeight(subCurrentNode, size.height - Zone.defaultHeader);
							Zone.setX(subCurrentNode, width);
							width += size.width / nRegions;
						} else {
							Zone.setWidth(subCurrentNode, (i == nRegions - 1) ? Zone.defaultWidth - width : Zone.defaultWidth / nRegions);
							Zone.setHeight(subCurrentNode, Zone.defaultHeight - Zone.defaultHeader);
							Zone.setX(subCurrentNode, width);
							width += Zone.defaultWidth / nRegions;
						}
						zone = (i == nRegions - 1) ? prefix : prefix + Zone.LEFT;
						Zone.setZone(subCurrentNode, zone);
						prefix = prefix + Zone.RIGHT;
						i++;
					}
				}

			}
		}

		return CommandResult.newOKCommandResult();
	}
}
