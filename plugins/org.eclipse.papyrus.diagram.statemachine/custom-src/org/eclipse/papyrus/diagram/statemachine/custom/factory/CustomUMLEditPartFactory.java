package org.eclipse.papyrus.diagram.statemachine.custom.factory;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.statemachine.custom.edit.part.CustomFinalStateEditPart;
import org.eclipse.papyrus.diagram.statemachine.custom.edit.part.CustomPackageEditPart;
import org.eclipse.papyrus.diagram.statemachine.custom.edit.part.CustomPseudostateEditPart;
import org.eclipse.papyrus.diagram.statemachine.custom.edit.part.CustomRegionCompartmentEditPart;
import org.eclipse.papyrus.diagram.statemachine.custom.edit.part.CustomRegionEditPart;
import org.eclipse.papyrus.diagram.statemachine.custom.edit.part.CustomStateEditPart;
import org.eclipse.papyrus.diagram.statemachine.custom.edit.part.CustomStateMachineCompartmentEditPart;
import org.eclipse.papyrus.diagram.statemachine.custom.edit.part.CustomStateMachineEditPart;
import org.eclipse.papyrus.diagram.statemachine.custom.edit.part.CustomStateMachineNameEditPart;
import org.eclipse.papyrus.diagram.statemachine.custom.edit.part.CustomStateNameEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.FinalStateEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.PackageEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.PseudostateEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.RegionCompartmentEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.RegionEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateMachineCompartmentEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateMachineEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateMachineNameEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateNameEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.UMLEditPartFactory;
import org.eclipse.papyrus.diagram.statemachine.part.UMLVisualIDRegistry;

public class CustomUMLEditPartFactory extends UMLEditPartFactory {

	public EditPart createEditPart(EditPart context, Object model) {
		if(model instanceof View) {
			View view = (View)model;
			switch(UMLVisualIDRegistry.getVisualID(view)) {
			// redefined classes to modify the method createNodePlate
			case PackageEditPart.VISUAL_ID:
				return new CustomPackageEditPart(view);
			case StateMachineEditPart.VISUAL_ID:
				return new CustomStateMachineEditPart(view);
			case StateMachineNameEditPart.VISUAL_ID:
				return new CustomStateMachineNameEditPart(view);
			case StateMachineCompartmentEditPart.VISUAL_ID:
				return new CustomStateMachineCompartmentEditPart(view);
			case RegionCompartmentEditPart.VISUAL_ID:
				return new CustomRegionCompartmentEditPart(view);
			case RegionEditPart.VISUAL_ID:
				return new CustomRegionEditPart(view);
			case PseudostateEditPart.VISUAL_ID:
				return new CustomPseudostateEditPart(view);
			case FinalStateEditPart.VISUAL_ID:
				return new CustomFinalStateEditPart(view);
			case StateEditPart.VISUAL_ID:
				return new CustomStateEditPart(view);
			case StateNameEditPart.VISUAL_ID:
				return new CustomStateNameEditPart(view);
			}

		}
		return super.createEditPart(context, model);
	}

}
