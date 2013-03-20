package de.cau.cs.kieler.yakindu.sccharts.sim.s.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.ui.editor.DiagramActivator;

import de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend.CoreToSCLTransformation;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
@SuppressWarnings("restriction")
public class SCLCommandHandler extends SCChartsGenericFileCommandHandler {

        public static final String SCLTRANSFORMATIONCOMMAND = "de.cau.cs.kieler.yakindu.sccharts.sim.s.commands.CoreToSCLTransformation";

	/**
	 * The constructor.
	 */
	public SCLCommandHandler() {
	}

	public String ModelHandlerFileExtension() {
		return "scc";
	}

	public String ModelHandlerFileExtensionTransformed() {
		return "scl";
	}

	public String ModelHandlerDiagramEditorID() {
		return "de.cau.cs.kieler.yakindu.sccharts.sim.scl.SCL";
	}

	public PreferencesHint ModelHandlerDiagramPreferencesHint() {
		return new PreferencesHint("");
	}

	public boolean ModelHandlerCreateDiagram() {
		return false;
	}

	public boolean ModelHandlerOpenEditor() {
		return false;
	}

	public EObject SCChartsDoTransformation(EObject modelObject,
			String commandString) {
                if (commandString.equals(SCLTRANSFORMATIONCOMMAND)) {
                    System.out.println("scl transformation: " + commandString);
                    EObject transformed = (new CoreToSCLTransformation())
                                    .transformCoreToSCL((Statechart) modelObject);
                    return transformed;
                }
                
		return null;
	}

}
