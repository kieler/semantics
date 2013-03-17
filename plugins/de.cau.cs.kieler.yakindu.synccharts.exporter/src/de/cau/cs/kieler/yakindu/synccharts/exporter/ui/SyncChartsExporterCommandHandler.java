package de.cau.cs.kieler.yakindu.synccharts.exporter.ui;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.yakindu.sct.model.sgraph.Statechart;

import de.cau.cs.kieler.yakindu.sccharts.sim.s.ui.SCChartsGenericFileCommandHandler;
import de.cau.cs.kieler.yakindu.synccharts.exporter.xtend.SyncChartsExporter;


/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SyncChartsExporterCommandHandler extends SCChartsGenericFileCommandHandler {
//	/**
//	 * The constructor.
//	 */
//	public SCChartsExporterCommandHandler() {
//		ModelHandlerSetDiagramEditor(StatechartDiagramEditor.ID, 
//				DiagramActivator.DIAGRAM_PREFERENCES_HINT, 
//				true);
//	}
	
	@Override
	public String ModelHandlerFileExtension() {
		return "ysc";
	}

	
	@Override
	public String ModelHandlerFileExtensionTransformed() {
		return "kixs";
	}
	
	public EObject SCChartsDoTransformation(EObject modelObject, String commandString) {
		EObject transformed = (new SyncChartsExporter()).transformStatechart((Statechart) modelObject);
		return transformed;
	}


	@Override
	public String ModelHandlerDiagramEditorID() {
		return null;
	}

	@Override
	public PreferencesHint ModelHandlerDiagramPreferencesHint() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean ModelHandlerCreateDiagram() {
		return false;
	}

	@Override
	public boolean ModelHandlerOpenEditor() {
		return false;
	}

}
