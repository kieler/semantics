package de.cau.cs.kieler.yakindu.sccharts.sim.s.ui;

import java.io.IOException;

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
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.stext.STextStandaloneSetup;

import com.google.inject.Injector;

import de.cau.cs.kieler.klighd.views.DiagramViewManager;
import de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend.CoreToSCLTransformation;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program;

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
                    EcoreUtil.resolveAll(transformed);
                    return transformed;
                }
                
		return null;
	}
	
	private static Injector injector = new STextStandaloneSetup().createInjectorAndDoEMFRegistration();
	
        public Object execute(ExecutionEvent event) throws ExecutionException {
            // Get input model from currently selected file in Explorer
            ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getSelectionService().getSelection();
            File file = (File) ((TreeSelection) selection).getFirstElement();
            URI input = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
            URI output = URI.createURI("");

            String command = event.getCommand().getId().toString();
            
            ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
            Resource resourceLoad=resourceSet.getResource(input, true);
                
            EObject modelRoot = resourceLoad.getContents().get(0); 
            EObject transformedModel = SCChartsDoTransformation(modelRoot, command);
            resourceLoad.unload();
            
            // Calculate output path
            output = URI.createURI(input.toString());
            output = output.trimFragment();
            output = output.trimFileExtension().appendFileExtension(ModelHandlerFileExtensionTransformed());                
      

            try {
                // Write out copy/transformation
                // TODO: add Factory for KIELER stand-alone
                /* Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
                Map<String, Object> m = reg.getExtensionToFactoryMap();
                m.put(ModelHandlerFileExtension(), new XMIResourceFactoryImpl());*/
                ResourceSet resSet = new ResourceSetImpl();
                
                // Create ouptut resource
                Resource resource = resSet.createResource(output);
                
                // Create Diagram, if necessary
                // Note: Diagrams created this way are empty
                Diagram diagram = null;
                if (ModelHandlerCreateDiagram()) {
                    diagram = ViewService.createDiagram(transformedModel, 
                                    ModelHandlerDiagramEditorID(), 
                                    ModelHandlerDiagramPreferencesHint());
                    if (diagram == null) { throw new NullPointerException(); }
                    diagram.setElement(transformedModel);
               
                    // Save both the model and the diagram in one resource
                    resource.getContents().add(transformedModel);
                    resource.getContents().add(diagram);
                } else {
                    resource.getContents().add(transformedModel);
                }
                
                resource.save(getSaveOptions());
                setCharset(WorkspaceSynchronizer.getFile(resource));

                // Open associated editor, if necessary
                if (ModelHandlerOpenEditor()) {
                    URI uri = EcoreUtil.getURI(transformedModel);
                    IFile file2 = ResourcesPlugin.getWorkspace().getRoot()
                                        .getFile(new Path(uri.toPlatformString(true)));
                
                    IEditorDescriptor desc = PlatformUI.getWorkbench()
                                            .getEditorRegistry().getDefaultEditor(file.getName());
             
                    final IWorkbenchPage wbPage = PlatformUI.getWorkbench()
                                            .getActiveWorkbenchWindow().getActivePage();
                    FileEditorInput fileInput = new FileEditorInput(file2);
                    IEditorPart editor = wbPage.openEditor(fileInput,
                                            desc.getId());
                }
                
                
                DiagramViewManager.getInstance().createView(
                        "de.cau.cs.kieler.yakindu.sccharts.sim.scl.klighd.scg.SCGDiagramSynthesis", 
                        "SCG", (Program) transformedModel, null); 
                
            } catch (IOException e) {
                throw new ExecutionException("Cannot write output SCChart file.");
            } catch (PartInitException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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
