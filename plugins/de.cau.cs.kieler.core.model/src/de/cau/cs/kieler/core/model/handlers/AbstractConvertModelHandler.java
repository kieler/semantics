package de.cau.cs.kieler.core.model.handlers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
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
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import com.google.inject.Injector;


/**
 * 
 */

public abstract class AbstractConvertModelHandler extends AbstractHandler {	

	protected abstract String getTargetExtension();
	
        protected abstract Injector CreateResourceInjector();
        
        protected abstract Object transform(EObject model, ExecutionEvent event, ISelection selection);
        
	protected String getDiagramEditorID() {
	    return null;
	}
	
	protected PreferencesHint getPreferencesHint() {
	    return new PreferencesHint("");
	}
	
	protected boolean doCreateDiagram(EObject model, ExecutionEvent event, ISelection selection) {
	    return getDiagramEditorID() != null;
	}
	
	protected boolean doOpenEditor(Object modelObject, ExecutionEvent event, ISelection selection) {
	    return false;
	}
	
	protected void postProcess(Object modelObject) { 
	  
	}
			
        public Object execute(ExecutionEvent event) throws ExecutionException {
            // Get input model from currently selected files in Explorer
            final ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getSelectionService().getSelection();
            
            if (selection instanceof IStructuredSelection) {
                final Object[] elements = ((IStructuredSelection) selection).toArray();
                final ExecutionEvent fEvent = event;

                Job job = new Job("Processing model") {
                    protected IStatus run(final IProgressMonitor monitor) {
                        monitor.beginTask("Processing model", elements.length);
                        for (Object object : elements) {
                            if (monitor.isCanceled()) {
                                break;
                            }
                            if (object instanceof IFile) {
                                try {
                                    convert(fEvent, (IFile) object, selection);
                                } catch (ExecutionException e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                                }
                            }
                            monitor.worked(1);
                        }
                        monitor.done();
                        return Status.OK_STATUS;
                    }
                    
                };
                job.setUser(true);
                job.schedule();
            }
            
            return null;
        }
            
        protected void convert(ExecutionEvent event, IFile file, ISelection selection) throws ExecutionException {

            URI input = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
            URI output = URI.createURI("");

            Injector rInjector = CreateResourceInjector();
            ResourceSet resourceSet = rInjector.getInstance(ResourceSet.class);
            Resource resourceLoad=resourceSet.getResource(input, true);    
            EObject model = resourceLoad.getContents().get(0); 
            
            Object transformedObject = transform(model, event, selection);
         
            resourceLoad.unload();
            
            output = URI.createURI(input.toString());
            output = output.trimFragment();
            output = output.trimFileExtension().appendFileExtension(getTargetExtension());                

            try {
                ResourceSet resSet = new ResourceSetImpl();
                Resource saveRes = resSet.createResource(output);
                
                if (transformedObject instanceof EObject) {
                    EObject transformedModel = (EObject) transformedObject;
                    
                    // Create Diagram, if necessary
                    // Note: Diagrams created this way are empty
                    Diagram diagram = null;
                    if (doCreateDiagram(transformedModel, event, selection)) {
                        diagram = ViewService.createDiagram(transformedModel, 
                                        getDiagramEditorID(), 
                                        getPreferencesHint());
                        if (diagram == null) { throw new NullPointerException("Diagram is null!"); }
                        diagram.setElement(transformedModel);
                   
                        // Save both the model and the diagram in one resource
                        saveRes.getContents().add(transformedModel);
                        saveRes.getContents().add(diagram);
                    } else {
                        saveRes.getContents().add(transformedModel);
                    }
                    saveRes.save(getSaveOptions());
                    setCharset(WorkspaceSynchronizer.getFile(saveRes));
                }
                
                // Save text
                if (transformedObject instanceof CharSequence) {
                    IPath txtOutputPath = new Path(output.toPlatformString(false).replace("%20", " "));
                    IFile txtOutputFile = convertIPathToIFile(txtOutputPath);
                    String txtOutputString = getAbsoluteFilePath(txtOutputFile);
                    
                    CharSequence charSequenceContent = (CharSequence) transformedObject;
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
                if (doOpenEditor(transformedObject, event, selection)) {
                    openEditorSync(transformedObject);
                }
                
                postProcess(transformedObject);
               
            } catch (IOException e) {
                throw new ExecutionException("Cannot write output SCChart file.");
            }

            // Refresh the file explorer
            try {
                ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
            } catch (CoreException e2) {
                e2.printStackTrace();
            }
            
    }
        
    private void openEditorSync(final Object modelObject) {
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                openEditor(modelObject);
            }
        });
    }
        
    private void openEditor(final Object modelObject) {
        EObject transformedModel = (EObject) modelObject;
        
        URI uri = EcoreUtil.getURI(transformedModel);
        IFile file2 = ResourcesPlugin.getWorkspace().getRoot()
                            .getFile(new Path(uri.toPlatformString(true)));
    
        IEditorDescriptor desc = PlatformUI.getWorkbench()
                                .getEditorRegistry().getDefaultEditor(file2.getName());
 
        final IWorkbenchPage wbPage = PlatformUI.getWorkbench()
                                .getActiveWorkbenchWindow().getActivePage();
        FileEditorInput fileInput = new FileEditorInput(file2);
        try {
            IEditorPart editor = wbPage.openEditor(fileInput,
                                    desc.getId());
        } catch (PartInitException e) {
            e.printStackTrace();
        }

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
    
    private IFile convertIPathToIFile(final IPath path) {
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        IFile file = myWorkspaceRoot.getFile(path);
        return file;
    }
    
    @SuppressWarnings({ "restriction" })
    private String getAbsoluteFilePath(final IFile ifile) {
        IPath fullPath = ifile.getLocation();
        // If we have spaces, try it like this...
        if (fullPath == null && ifile instanceof org.eclipse.core.internal.resources.Resource) {
            org.eclipse.core.internal.resources.Resource resource = null;
            resource = (org.eclipse.core.internal.resources.Resource) ifile;
            fullPath = resource.getLocalManager().locationFor(resource);
        }
        return (getAbsoluteFilePath(ifile.getLocation()));
    }
   
   private String getAbsoluteFilePath(final IPath resolvedPath) {
       // if bundle entry then just to string
       if (resolvedPath.toString().contains("bundleentry")) {
           return resolvedPath.toString();
       }
       // Ensure it is absolute
       resolvedPath.makeAbsolute();
       java.io.File javaFile = new java.io.File(resolvedPath.toString().replaceAll("%20", " "));
       if (javaFile.exists()) {
           String fileString = javaFile.getAbsolutePath();
           return fileString;
       }
       // Something went wrong, we could not resolve the file location
       return resolvedPath.toString();
   }

}
