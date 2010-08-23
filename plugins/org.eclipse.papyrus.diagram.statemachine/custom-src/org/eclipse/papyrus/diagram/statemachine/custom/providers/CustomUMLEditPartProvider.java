package org.eclipse.papyrus.diagram.statemachine.custom.providers;

import org.eclipse.papyrus.diagram.statemachine.custom.factory.CustomUMLEditPartFactory;
import org.eclipse.papyrus.diagram.statemachine.providers.UMLEditPartProvider;

public class CustomUMLEditPartProvider extends UMLEditPartProvider {

	public CustomUMLEditPartProvider() {
		setFactory(new CustomUMLEditPartFactory());
		setAllowCaching(true);
	}

}
