package de.cau.cs.kieler.scl.handler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
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

import com.google.inject.Injector;
// NEEDED for KIELER stand-alone

import de.cau.cs.kieler.sim.kiem.util.KiemUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.AbstractHandler
 */
@SuppressWarnings("restriction")
public abstract class AbstractModelFileHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	
	public AbstractModelFileHandler() {
	}
	
	public abstract String ModelHandlerFileExtension();
	
	public abstract String ModelHandlerFileExtensionTransformed();
	
	public abstract String ModelHandlerDiagramEditorID();
	
	public abstract PreferencesHint ModelHandlerDiagramPreferencesHint();
	
	public abstract boolean ModelHandlerCreateDiagram();
	
	public abstract boolean ModelHandlerOpenEditor();
	
	public abstract Injector CreateResourceInjector();
	
	public abstract Object doTransformation(EObject modelObject, String commandString, ISelection selection);
	
	public void doPostProcessing(EObject modelObject) { 
	    
	}
	
	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
        public Object execute(ExecutionEvent event) throws ExecutionException {
            // Get input model from currently selected file in Explorer
            ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getSelectionService().getSelection();
            File file = (File) ((TreeSelection) selection).getFirstElement();
            URI input = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
            URI output = URI.createURI("");

            String command = event.getCommand().getId().toString();
            
            Injector rInjector = CreateResourceInjector();
            ResourceSet resourceSet = rInjector.getInstance(ResourceSet.class);
            Resource resourceLoad=resourceSet.getResource(input, true);
                
            EObject modelRoot = resourceLoad.getContents().get(0); 
            
            Object transformedModel = doTransformation(modelRoot, command, selection);
            EObject transformedEObject = null;
            if (transformedModel instanceof EObject) {
                transformedEObject = (EObject) transformedModel;
            }
            
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
                Resource saveRes = resSet.createResource(output);
                
                if (transformedEObject != null) {
                    // Create Diagram, if necessary
                    // Note: Diagrams created this way are empty
                    Diagram diagram = null;
                    if (ModelHandlerCreateDiagram()) {
                        diagram = ViewService.createDiagram(transformedEObject, 
                                        ModelHandlerDiagramEditorID(), 
                                        ModelHandlerDiagramPreferencesHint());
                        if (diagram == null) { throw new NullPointerException(); }
                        diagram.setElement(transformedEObject);
                   
                        // Save both the model and the diagram in one resource
                        saveRes.getContents().add(transformedEObject);
                        saveRes.getContents().add(diagram);
                    } else {
                        saveRes.getContents().add(transformedEObject);
                    }
                    saveRes.save(getSaveOptions());
                    setCharset(WorkspaceSynchronizer.getFile(saveRes));
                }
                
                // Save text
                if (transformedModel instanceof CharSequence) {
                    IPath txtOutputPath = new Path(output.toPlatformString(false).replace("%20", " "));
                    IFile txtOutputFile = KiemUtil.convertIPathToIFile(txtOutputPath);
                    String txtOutputString = KiemUtil.getAbsoluteFilePath(txtOutputFile);
                    
                    CharSequence charSequenceContent = (CharSequence) transformedModel;
                    String stringContent = charSequenceContent.toString();
                    
                    // Write out c program
                    FileWriter fileWriter = new FileWriter(txtOutputString);
                    if (fileWriter != null) {
                        BufferedWriter out = new BufferedWriter(fileWriter);
                        if (out != null) {
                            out.write(stringContent);
                            out.close();
                        }
                    }
                    
                }

                // Open associated editor, if necessary
                if (ModelHandlerOpenEditor() && transformedEObject != null) {
                    URI uri = EcoreUtil.getURI(transformedEObject);
                    IFile file2 = ResourcesPlugin.getWorkspace().getRoot()
                                        .getFile(new Path(uri.toPlatformString(true)));
                
                    IEditorDescriptor desc = PlatformUI.getWorkbench()
                                            .getEditorRegistry().getDefaultEditor(file2.getName());
             
                    final IWorkbenchPage wbPage = PlatformUI.getWorkbench()
                                            .getActiveWorkbenchWindow().getActivePage();
                    FileEditorInput fileInput = new FileEditorInput(file2);
                    IEditorPart editor = wbPage.openEditor(fileInput,
                                            desc.getId());
                }
                
                doPostProcessing(transformedEObject);
               
            } catch (IOException e) {
                throw new ExecutionException("Cannot write output SCChart file.");
            } catch (PartInitException e) {
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
	
    protected Map<String, String> getSaveOptions() {
        Map<String, String> saveOptions = new HashMap<String, String>();
        saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
        saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
                            Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
        return saveOptions;
    }
       
    protected void setCharset(IFile file) {
        if (file == null) {
            return;
        }
        try {
            file.setCharset("UTF-8", new NullProgressMonitor());
        } catch (CoreException e) {
            e.printStackTrace();
        }
    }
}
