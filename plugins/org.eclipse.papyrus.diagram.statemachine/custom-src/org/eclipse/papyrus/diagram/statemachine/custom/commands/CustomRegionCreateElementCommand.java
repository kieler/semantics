package org.eclipse.papyrus.diagram.statemachine.custom.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.commands.SemanticAdapter;
import org.eclipse.papyrus.diagram.statemachine.custom.helpers.Zone;
import org.eclipse.papyrus.diagram.statemachine.providers.ElementInitializers;
import org.eclipse.papyrus.diagram.statemachine.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.UMLFactory;

public class CustomRegionCreateElementCommand extends AbstractTransactionalCommand {

	IAdaptable adaptable;

	IAdaptable adaptableForDropped = null;

	PreferencesHint prefHints;

	CreateViewRequest.ViewDescriptor viewDescriptor;

	CreateElementRequest createElementRequest;

	String dropLocation = Zone.RIGHT;

	public CustomRegionCreateElementCommand(IAdaptable adaptable, IAdaptable adaptableForDropped, PreferencesHint prefHints, TransactionalEditingDomain domain, String label, String dropLocation) {
		super(domain, label, null);
		this.adaptable = adaptable;
		this.adaptableForDropped = adaptableForDropped;
		this.prefHints = prefHints;

		viewDescriptor = new ViewDescriptor(adaptable, prefHints);

		// make sure the return object is available even before
		// executing/undoing/redoing
		setResult(CommandResult.newOKCommandResult(viewDescriptor));

		this.dropLocation = dropLocation;
	}

	protected void doConfigure(Region newElement, IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		IElementType elementType = createElementRequest.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(createElementRequest.getClientContext());
		configureRequest.addParameters(createElementRequest.getParameters());
		ICommand configureCommand = elementType.getEditCommand(configureRequest);
		if(configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		// adapt the view at execution time
		View existingRegion = (View)adaptable.getAdapter(View.class);

		// get existingRegion bounds (i.e. the space which needs to be divided)
		int height = Zone.getHeight(existingRegion);
		int width = Zone.getWidth(existingRegion);
		int x = Zone.getX(existingRegion);
		int y = Zone.getY(existingRegion);

		// get the stateMachine via the stateMachineView
		View stateMachineCompartment = (View)existingRegion.eContainer();
		View stateMachine = (View)stateMachineCompartment.eContainer();

		if(adaptableForDropped == null) {
			// create a new UML region
			StateMachine umlStateMachine = (StateMachine)stateMachine.getElement();

			createElementRequest = new CreateElementRequest(getEditingDomain(), stateMachine, UMLElementTypes.Region_3000);

			Region umlRegion = UMLFactory.eINSTANCE.createRegion();
			umlStateMachine.getRegions().add(umlRegion);

			ElementInitializers.getInstance().init_Region_3000(umlRegion);

			doConfigure(umlRegion, monitor, info);

			adaptableForDropped = new SemanticAdapter(umlRegion, null);
		}

		// create a view for the new region on the stateMachineCompartment
		String semanticHint = ((IHintedType)UMLElementTypes.Region_3000).getSemanticHint();
		View newRegion = (View)ViewService.getInstance().createNode(adaptableForDropped, stateMachineCompartment, semanticHint, -1, prefHints);

		// add region specific annotation
		Zone.createRegionDefaultAnnotation(newRegion);

		// adjust bounds and zone

		// the test itself and change of bounds
		if(Zone.isRight(dropLocation)) {
			// the new region zone should reflect that of other branch
			Zone.copyZone(existingRegion, newRegion);
			// now set new region as RIGHT
			Zone.setRight(newRegion);
			// and existing region to LEFT
			Zone.setLeft(existingRegion);

			// shrink width of existing region
			width *= 0.5;
			Zone.setWidth(existingRegion, width);
			// new region will have same height and width
			Zone.setWidth(newRegion, width);
			Zone.setHeight(newRegion, height);

			// set new region to location (x+width,y) (existing region is not
			// moved)
			Zone.setX(newRegion, x + width);
			Zone.setY(newRegion, y);
		} else if(Zone.isLeft(dropLocation)) {
			// the new region zone should reflect that of existing region
			Zone.copyZone(existingRegion, newRegion);
			// now set new region as LEFT
			Zone.setLeft(newRegion);
			// and existing region to RIGHT
			Zone.setRight(existingRegion);

			// shrink width of existing region
			width *= 0.5;
			Zone.setWidth(existingRegion, width);
			// new region will have same height and width
			Zone.setWidth(newRegion, width);
			Zone.setHeight(newRegion, height);

			// set existing region to location (x+width,y) and new region at
			// (x,y)
			Zone.setX(existingRegion, x + width);
			Zone.setX(newRegion, x);
			Zone.setY(newRegion, y);
		} else if(Zone.isBottom(dropLocation)) {
			// the new region zone should reflect that of existing region
			Zone.copyZone(existingRegion, newRegion);
			// now set new region as BOTTOM
			Zone.setBottom(newRegion);
			// and existing region to TOP
			Zone.setTop(existingRegion);

			// shrink height of existing region
			height *= 0.5;
			Zone.setHeight(existingRegion, height);
			// new region will have same height and width
			Zone.setWidth(newRegion, width);
			Zone.setHeight(newRegion, height);

			// set new region to location (x,y+height) (existing region is not
			// moved)
			Zone.setX(newRegion, x);
			Zone.setY(newRegion, y + height);
		} else if(Zone.isTop(dropLocation)) {
			// the new region zone should reflect that of existing region
			Zone.copyZone(existingRegion, newRegion);
			// now set new region as TOP
			Zone.setTop(newRegion);
			// and existing region to BOTTOM
			Zone.setBottom(existingRegion);

			// shrink height of existing region
			height *= 0.5;
			Zone.setHeight(existingRegion, height);
			// new region will have same height and width
			Zone.setWidth(newRegion, width);
			Zone.setHeight(newRegion, height);

			// set existing region to location (x,y+height) and new region at
			// (x,y)
			Zone.setY(existingRegion, y + height);
			Zone.setX(newRegion, x);
			Zone.setY(newRegion, y);
		}
		viewDescriptor.setView(newRegion);

		return CommandResult.newOKCommandResult(viewDescriptor);
	}

}
