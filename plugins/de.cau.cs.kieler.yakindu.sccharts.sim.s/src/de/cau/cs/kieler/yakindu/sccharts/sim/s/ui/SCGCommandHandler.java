package de.cau.cs.kieler.yakindu.sccharts.sim.s.ui;

import java.io.IOException;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.yakindu.sct.model.sgraph.SGraphPackage;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.sgraph.resource.AbstractSCTResource;
import org.yakindu.sct.ui.editor.DiagramActivator;
import org.yakindu.sct.model.stext.resource.impl.StextResource;

import de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend.SCLToSCGTransformation;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
@SuppressWarnings("restriction")
public class SCGCommandHandler extends SCChartsGenericFileCommandHandler {

        public static final String SCGTRANSFORMATIONCOMMAND = "de.cau.cs.kieler.yakindu.sccharts.sim.s.commands.SCLToSCGTransformation";

	/**
	 * The constructor.
	 */
	public SCGCommandHandler() {
	}

	public String ModelHandlerFileExtension() {
		return "scl";
	}

	public String ModelHandlerFileExtensionTransformed() {
		return "scg";
	}

	public String ModelHandlerDiagramEditorID() {
		return "de.cau.cs.kieler.yakindu.sccharts.sim.scg.SCG";
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
                if (commandString.equals(SCGTRANSFORMATIONCOMMAND)) {
                    System.out.println("scg transformation: " + commandString);
                    EObject transformed = (new SCLToSCGTransformation())
                                    .SCLToSCG(((Program) modelObject));
                    return transformed;
                }
                
		return null;
	}
	
        public Object execute(ExecutionEvent event) throws ExecutionException {
            // Get input model from currently selected file in Explorer
            ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getSelectionService().getSelection();
            File file = (File) ((TreeSelection) selection).getFirstElement();
            URI input = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
            URI output = URI.createURI("");

            // Try to load SyncCharts model
            Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
            Map<String, Object> m = reg.getExtensionToFactoryMap();
            
            XMIResourceImpl inputResource = new XMIResourceImpl(input);
            // Extract command
            String command = event.getCommand().getId().toString();
            
            ResourceSet resourceSet = new ResourceSetImpl();
            Resource resourceLoad=resourceSet.getResource(input, true);
            
                
            // Load model
//                inputResource.load(null);
//              EObject modelRoot = inputResource.getContents().get(0);
            EObject modelRoot = resourceLoad.getContents().get(0); 
            EObject transformedModel = SCChartsDoTransformation(modelRoot, command);
            
            // Calculate output path
            output = URI.createURI(input.toString());
            output = output.trimFragment();
            output = output.trimFileExtension().appendFileExtension(ModelHandlerFileExtensionTransformed());                
      

            try {
                ResourceSet resSet = new ResourceSetImpl();
                Resource resource = resSet.createResource(output);
                
                resource.getContents().add(transformedModel);
                resource.save(getSaveOptions());
                setCharset(WorkspaceSynchronizer.getFile(resource));
            } catch (IOException e) {
                throw new ExecutionException("Cannot write output SCChart file.");
            }

            // Refresh the file explorer
            try {
                ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
            } catch (CoreException e2) {
                e2.printStackTrace();
            }
            
            
            return null;
    }

}
