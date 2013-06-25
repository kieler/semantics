package de.cau.cs.kieler.yakindu.sccharts.coresccharts.handler;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.viewers.ISelection;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.stext.STextStandaloneSetup;
import org.yakindu.sct.ui.editor.DiagramActivator;
import org.yakindu.sct.ui.editor.editor.StatechartDiagramEditor;

import com.google.inject.Injector;

import de.cau.cs.kieler.scl.handler.AbstractModelFileHandler;
import de.cau.cs.kieler.yakindu.sccharts.coresccharts.xtend.SCCToCoreTransformation;

/**
 * Model transformation handler for extended SCChart to core SCCharts. 
 *
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SCCModelFileHandler extends AbstractModelFileHandler {

        private static Injector injector = new STextStandaloneSetup().createInjectorAndDoEMFRegistration();

	public static final String SCCTRANSFORMATIONCOMMAND = "de.cau.cs.kieler.yakindu.sccharts.coresccharts.commands.SCCToCoreTransformation";

	public SCCModelFileHandler() {
	}

	public String ModelHandlerFileExtension() {
		return "scc";
	}

	public String ModelHandlerFileExtensionTransformed() {
		return "core.scc";
	}

	public String ModelHandlerDiagramEditorID() {
		return StatechartDiagramEditor.ID;
	}

	public PreferencesHint ModelHandlerDiagramPreferencesHint() {
		return DiagramActivator.DIAGRAM_PREFERENCES_HINT;
	}

	public boolean ModelHandlerCreateDiagram() {
		return true;
	}

	public boolean ModelHandlerOpenEditor() {
		return true;
	}

	public Injector CreateResourceInjector() {
	    return injector;
	}

	public EObject doTransformation(EObject modelObject,
			String commandString, ISelection selection) {
		if (commandString.equals(SCCTRANSFORMATIONCOMMAND)) {
	                System.out.println("scc core transformation: " + commandString);
			EObject transformed = (new SCCToCoreTransformation())
					.transformSCCAborts((Statechart) modelObject);
			transformed = (new SCCToCoreTransformation())
					.transformSCCConditional((Statechart) transformed);
			return transformed;
		}

		return null;
	}

}
