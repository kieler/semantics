package org.eclipse.papyrus.diagram.statemachine.custom.commands;

import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.uml2.uml.StateMachine;

/*
 * The default command is fine only the canExecute needs to be changed to 
 * prevent deletion of the last region of a state machine
 */
public class CustomRegionDestroyElementCommand extends DestroyElementCommand {

	public CustomRegionDestroyElementCommand(DestroyElementRequest request) {
		super(request);
	}

	@Override
	public boolean canExecute() {
		if(super.canExecute()) {
			StateMachine stateMachine = (StateMachine)getElementToEdit();
			if(stateMachine.getRegions().size() == 1)
				return false;
			return true;
		}
		return false;
	}
}
