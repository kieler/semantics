package de.cau.cs.kieler.yakindu.sccharts.sim.s.handler;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.stext.STextStandaloneSetup;
import com.google.inject.Injector;

import de.cau.cs.kieler.core.properties.IPropertyHolder;
import de.cau.cs.kieler.core.properties.MapPropertyHolder;
import de.cau.cs.kieler.klighd.LightDiagramServices;
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy;
import de.cau.cs.kieler.klighd.views.DiagramViewManager;
import de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend.CoreToSCLTransformation;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program;

public class SCLModelFileHandler extends AbstractModelFileHandler {
    
        private static Injector injector = new STextStandaloneSetup().createInjectorAndDoEMFRegistration();
        
        public static final String SCGKLIGHDVIEWID = "de.cau.cs.kieler.yakindu.sccharts.sim.scl.klighd.scg.SCGDiagramSynthesis";
        public static final String SCGKLIGHDVIEWTITLE = "SCG Light Diagram View";
        
        public static final String SCLTRANSFORMATIONCOMMAND = "de.cau.cs.kieler.yakindu.sccharts.sim.s.commands.CoreToSCLTransformation";

	public SCLModelFileHandler() {
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
	
	public Injector CreateResourceInjector() {
	    return injector;
	}

	public EObject doTransformation(EObject modelObject,
			String commandString) {
                if (commandString.equals(SCLTRANSFORMATIONCOMMAND)) {
                    System.out.println("scl transformation: " + commandString);
                    EObject transformed = (new CoreToSCLTransformation())
                                    .transformCoreToSCL((Statechart) modelObject);
                    EcoreUtil.resolveAll(transformed);
                    return transformed;
                }
                
		return null;
	}
	
	public void doPostProcessing(EObject modelObject) {
            IPropertyHolder p = new MapPropertyHolder();
            p.setProperty(LightDiagramServices.REQUESTED_UPDATE_STRATEGY, SimpleUpdateStrategy.ID);
            DiagramViewManager.getInstance().createView(SCGKLIGHDVIEWID, SCGKLIGHDVIEWTITLE, 
                    (Program) modelObject, p); 
	}
		
}
