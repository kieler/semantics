package de.cau.cs.kieler.yakindu.sccharts.sim.s.ui;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.yakindu.sct.ui.editor.editor.StatechartDiagramEditor;
import org.yakindu.sct.ui.editor.DiagramActivator;

import org.yakindu.sct.model.sgraph.Statechart;
import de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend.SCChartsTransformation;


/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
@SuppressWarnings("restriction")
public class SCChartsCommandHandler extends SCChartsGenericFileCommandHandler {
    
        public static final String SCCTRANSFORMATIONCOMMAND = "de.cau.cs.kieler.yakindu.sccharts.sim.s.commands.SCChartsTransformation";
	/**
	 * The constructor.
	 */
	public SCChartsCommandHandler() {
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
	
	
	public EObject SCChartsDoTransformation(EObject modelObject, String commandString) {
            System.out.println("scc core transformation: "+ commandString);
            if (commandString.equals(SCCTRANSFORMATIONCOMMAND)) {
                EObject transformed = (new SCChartsTransformation()).transformSCCAborts((Statechart) modelObject);
                transformed = (new SCChartsTransformation()).transformSCCConditional((Statechart)transformed);
                return transformed;
            } 
            
            return null;
	}
	
}
