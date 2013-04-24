package de.cau.cs.kieler.yakindu.sccharts.scl.handler;

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
import de.cau.cs.kieler.yakindu.sccharts.scl.xtend.CoreToSCLTransformation;
import de.cau.cs.kieler.scl.handler.AbstractModelFileHandler;
import de.cau.cs.kieler.scl.scl.Program;

public class SCLModelFileHandler extends AbstractModelFileHandler {
    
        private static Injector injector = new STextStandaloneSetup().createInjectorAndDoEMFRegistration();
        
        public static final String SCGKLIGHDVIEWID = "de.cau.cs.kieler.scl.klighd.scg.SCGDiagramSynthesis";
        public static final String SCGKLIGHDVIEWTITLE = "SCG Light Diagram View";
        
        public static final String SCLTRANSFORMATIONCOMMAND = "de.cau.cs.kieler.yakindu.sccharts.scl.commands.CoreToSCLTransformation";
        public static final String SCLTRANSFORMATIONCOMMANDNOOPT = "de.cau.cs.kieler.yakindu.sccharts.scl.commands.CoreToSCLTransformationNoOpt";
        public static final String SCLTRANSFORMATIONCOMMANDONLYGOTO = "de.cau.cs.kieler.yakindu.sccharts.scl.commands.CoreToSCLTransformationOnlyGoto";
        public static final String SCLTRANSFORMATIONCOMMANDONLYLABEL = "de.cau.cs.kieler.yakindu.sccharts.scl.commands.CoreToSCLTransformationOnlyLabel";
        public static final String SCLTRANSFORMATIONCOMMANDONLYSELFLOOP = "de.cau.cs.kieler.yakindu.sccharts.scl.commands.CoreToSCLTransformationOnlySelfloop";
        public static final String SCLTRANSFORMATIONCOMMANDONLYSTATEPOSITION = "de.cau.cs.kieler.yakindu.sccharts.scl.commands.CoreToSCLTransformationOnlyStatePosition";

	public SCLModelFileHandler() {
	}

	public String ModelHandlerFileExtension() {
		return "scc";
	}

	public String ModelHandlerFileExtensionTransformed() {
		return "scl";
	}

	public String ModelHandlerDiagramEditorID() {
		return "de.cau.cs.kieler.scl.SCL";
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
	    int opt = CoreToSCLTransformation.OPTIMIZE_ALL;
	    if (commandString.equals(SCLTRANSFORMATIONCOMMANDNOOPT)) {
	        opt = CoreToSCLTransformation.OPTIMIZE_NONE;
	    }
            if (commandString.equals(SCLTRANSFORMATIONCOMMANDONLYGOTO)) {
                opt = CoreToSCLTransformation.OPTIMIZE_GOTO;
            }
            if (commandString.equals(SCLTRANSFORMATIONCOMMANDONLYLABEL)) {
                opt = CoreToSCLTransformation.OPTIMIZE_LABEL;
            }
            if (commandString.equals(SCLTRANSFORMATIONCOMMANDONLYSELFLOOP)) {
                opt = CoreToSCLTransformation.OPTIMIZE_SELFLOOP;
            }
            if (commandString.equals(SCLTRANSFORMATIONCOMMANDONLYSTATEPOSITION)) {
                opt = CoreToSCLTransformation.OPTIMIZE_STATEPOSITION;
            }

            EObject transformed = (new CoreToSCLTransformation())
                                .transformCoreToSCL((Statechart) modelObject, 
                                opt);
            EcoreUtil.resolveAll(transformed);
            return transformed;
	}
	
	public void doPostProcessing(EObject modelObject) {
//            IPropertyHolder p = new MapPropertyHolder();
//            p.setProperty(LightDiagramServices.REQUESTED_UPDATE_STRATEGY, SimpleUpdateStrategy.ID);
//            DiagramViewManager.getInstance().createView(SCGKLIGHDVIEWID, SCGKLIGHDVIEWTITLE, 
//                    (Program) modelObject, p); 
	}
		
}
