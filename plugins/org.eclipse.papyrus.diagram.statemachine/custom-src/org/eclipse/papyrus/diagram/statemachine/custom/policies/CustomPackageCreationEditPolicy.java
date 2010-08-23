package org.eclipse.papyrus.diagram.statemachine.custom.policies;

import java.util.Iterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.statemachine.custom.commands.CustomStateMachineWithDefaultRegionCreateNodeCommand;

public class CustomPackageCreationEditPolicy extends CreationEditPolicy {

	@Override
	protected Command getCreateCommand(CreateViewRequest request) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart)getHost()).getEditingDomain();
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(editingDomain, DiagramUIMessages.AddCommand_Label);

		Iterator descriptors = request.getViewDescriptors().iterator();

		while(descriptors.hasNext()) {
			CreateViewRequest.ViewDescriptor descriptor = (CreateViewRequest.ViewDescriptor)descriptors.next();

			CreateCommand createStateMachine = new CreateCommand(editingDomain, descriptor, (View)(getHost().getModel()));

			CustomStateMachineWithDefaultRegionCreateNodeCommand createRegion = new CustomStateMachineWithDefaultRegionCreateNodeCommand((IAdaptable)createStateMachine.getCommandResult().getReturnValue(), ((IGraphicalEditPart)getHost()).getDiagramPreferencesHint(), editingDomain, DiagramUIMessages.CreateCommand_Label, createStateMachine.getAffectedFiles());

			cc.compose(createStateMachine);
			cc.compose(createRegion);

		}
		return new ICommandProxy(cc.reduce());
	}
}
