package org.eclipse.papyrus.diagram.statemachine.custom.commands;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.commands.SemanticAdapter;
import org.eclipse.papyrus.diagram.statemachine.custom.helpers.Zone;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateMachineCompartmentEditPart;
import org.eclipse.papyrus.diagram.statemachine.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.diagram.statemachine.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;

public class CustomStateMachineWithDefaultRegionCreateNodeCommand extends AbstractTransactionalCommand {

	IAdaptable adaptable;

	PreferencesHint prefHints;

	CreateViewRequest.ViewDescriptor viewDescriptor;

	public CustomStateMachineWithDefaultRegionCreateNodeCommand(IAdaptable adaptable, PreferencesHint prefHints, TransactionalEditingDomain domain, String label, List affectedFiles) {
		super(domain, label, affectedFiles);
		this.adaptable = adaptable;
		this.prefHints = prefHints;

		viewDescriptor = new ViewDescriptor(adaptable, prefHints);

		// make sure the return object is available even before
		// executing/undoing/redoing
		setResult(CommandResult.newOKCommandResult(viewDescriptor));
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		// adapt the view at execution time
		View stateMachineView = (View)adaptable.getAdapter(View.class);

		View compartmentView = null;

		Iterator<View> it = stateMachineView.getChildren().iterator();
		while((compartmentView == null) && it.hasNext()) {
			View currentView = (View)it.next();
			if(UMLVisualIDRegistry.getVisualID(currentView.getType()) == StateMachineCompartmentEditPart.VISUAL_ID)
				compartmentView = currentView;
		}

		StateMachine stateMachine = (StateMachine)stateMachineView.getElement();

		Iterator<Region> regions = stateMachine.getRegions().iterator();
		while(regions.hasNext()) {
			Region region = regions.next();

			IAdaptable regionAdaptable = new SemanticAdapter(region, null);
			String semanticHint = ((IHintedType)UMLElementTypes.Region_3000).getSemanticHint();

			if(compartmentView != null) {
				Node regionNode = ViewService.getInstance().createNode(regionAdaptable, compartmentView, semanticHint, -1, prefHints);

				// add region specifics
				Zone.createRegionDefaultAnnotation(regionNode);

				if(regionNode != null) {
					viewDescriptor.setView(regionNode);
				}

			}
		}
		return CommandResult.newOKCommandResult(viewDescriptor);
	}
}
