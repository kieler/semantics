package de.cau.cs.kieler.core.examples.handlers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.internal.resources.Resource;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewType;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ExampleRessourceCommandHandler extends AbstractHandler {
    /**
     * The constructor.
     */
    public ExampleRessourceCommandHandler() {
    }

    /**
     * the command has been executed, so extract extract the needed information
     * from the application context.
     */
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IWorkbenchWindow window = HandlerUtil
                .getActiveWorkbenchWindowChecked(event);
        MessageDialog.openInformation(window.getShell(), "Examples Plug-in",
                "Calling example command.");
        try {
            saveFile();
        } catch (CoreException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Small example that shows how to handle Workspace
     * resources such as files. Will create a new File
     * "myFile.txt" in an open and existing project "test".
     * @author haf
     * @throws CoreException
     */
    public void saveFile() throws CoreException {
        // requires org.eclipse.core.resources in the dependencies

        // get the actual workspace
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace()
                .getRoot();

        // get a project called "test". Does nothing if it does not exist!
        IProject project = myWorkspaceRoot.getProject("test");
        if (project.exists() && project.isOpen()) {
            // set some example contents
            String exampleData = "This is my Example Data!\n";
            // create or load a file with a specific name
            IFile myFile = project.getFile("myFile.txt");
            if (!myFile.exists()) {
                // create new file if it does not exist
                myFile.create(new ByteArrayInputStream(exampleData.getBytes()),
                        true, null);
            } else {
                // set the contents of the file to our example contents
                myFile.setContents(new ByteArrayInputStream(exampleData
                        .getBytes()), IFile.BACKGROUND_REFRESH, null);
            }
        }
    }

    /**
     * Initializes a GMF diagram model with the contents
     * of an EMF model and saves it as XMI.
     * @author haf
     * @param emfObject
     * @param diagramResource
     * @throws ExecutionException
     * @throws IOException
     */
    public void initializeDiagram(final EObject emfObject,
            final XMLResource diagramResource) throws ExecutionException,
            IOException {
        // Dependency: org.eclipse.emf.transaction
        // Dependency: org.eclipse.gmf.runtime.emf.commands.core
        // Dependency: org.eclipse.gmf.runtime.diagram.core

        // Get the "editingDomain" of the emfObject
        TransactionalEditingDomain domain = TransactionUtil
                .getEditingDomain(emfObject);

        // create empty List of files that will be changed = none
        // TODO: not sure whether here we must add the Diagram resource
        List<IFile> affectedFiles = new ArrayList<IFile>();
        
        // create a new EMF command, that actually does the diagram creation
        AbstractTransactionalCommand command = new AbstractTransactionalCommand(
                domain, "Initializing diagram contents", affectedFiles) {

            protected CommandResult doExecuteWithResult(
                    IProgressMonitor monitor, IAdaptable info)
                    throws ExecutionException {
                // int diagramVID =
                // RuleVisualIDRegistry.getDiagramVisualID(myDiagramRoot);
                // if (diagramVID != RuleDiagramEditPart.VISUAL_ID) {
                // return CommandResult
                // newErrorCommandResult("Incorrect model object stored as a root resource object");
                // }
                
                // create a new Diagram model
                Diagram diagram = ViewService.createDiagram(emfObject,
                        ViewType.DIAGRAM_NAME, new PreferencesHint("foo.bar"));

                // save the diagram model to XMI
                diagramResource.getContents().add(diagram);
                return CommandResult.newOKCommandResult();
            }
        };

        // execute the command
        OperationHistoryFactory.getOperationHistory().execute(command,
                new NullProgressMonitor(), null);
        diagramResource.save(Collections.EMPTY_MAP);
    }

    /**
     * Opens up an GMF diagram in an editor.
     * @author haf
     * @param diagramResource XMLResource of the Diagram file
     * @param editorID String ID of the graphical editor
     * @return true, iff opening was successful
     * @throws PartInitException
     */
    public boolean openDiagram(XMLResource diagramResource, String editorID)
            throws PartInitException {
        // Dependency: org.eclipse.ui.ide
        String path = diagramResource.getURI().toPlatformString(true);
        IResource workspaceResource = ResourcesPlugin.getWorkspace().getRoot()
                .findMember(new Path(path));
        if (workspaceResource instanceof IFile) {
            IWorkbenchPage page = PlatformUI.getWorkbench()
                    .getActiveWorkbenchWindow().getActivePage();
            return null != page.openEditor(new FileEditorInput(
                    (IFile) workspaceResource), editorID);
        }
        return false;
    }

}
