package de.cau.cs.kieler.uml2;
import org.eclipse.ui.IStartup;

/**
 * Hack early Startup class to explicitly load the UML Metamodel at Eclipse startup. Otherwise
 * KSBASE will throw exceptions when evaluating the enabling expressions for the menu
 * contributions about not finding the Package of the UML metamodel.
 * FIXME: This should be handled by KSBASE in some generic way.
 * @author haf
 */
public class MetamodelRegistrator implements IStartup {

	public void earlyStartup() {
		// calling the class once statically will load the bundle
		org.eclipse.uml2.uml.UMLPackage.eINSTANCE.eClass(); 
	}

}
