package de.cau.cs.kieler.esterel.cec.sim;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.esterel.cec.CEC;

/**
 * @author ctr
 * 
 *         Generate C from Esterel using the CEC.
 * 
 */
public class CGenerator extends AbstractHandler implements IHandler {

    private static final String ESTEREL_LANGUAGE = "de.cau.cs.kieler.esterel.Esterel";

    public Object execute(final ExecutionEvent event) throws ExecutionException {

        IWorkbench workbench = PlatformUI.getWorkbench();
        IWorkbenchPage page = null;
        if (workbench != null) {
            IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
            if (window != null) {
                page = window.getActivePage();
            }
        }
        if (page == null) {
            throw new ExecutionException("Cannot get active page", null);
        }

        IEditorPart editor = page.getActiveEditor();
        if (editor == null) {
            throw new ExecutionException("No active editor selected!", null);
        }

        FileEditorInput input = null;

        if (editor instanceof XtextEditor) {
            XtextEditor xtextEditor = (XtextEditor) editor;

            if (xtextEditor.getDocument() instanceof XtextDocument
                    && xtextEditor.getLanguageName().equals(ESTEREL_LANGUAGE)) {
                input = (FileEditorInput) editor.getEditorInput();
            }
        }

        if (input == null) {
            throw new ExecutionException("Cannot generate C code for active editor");
        }

        final URI strlFile = input.getURI();
        final File cFile = new File(input.getURI().getPath().replace(".strl", ".c"));

        // compile Esterel to C
        Job genC = new Job("generate C code") {
            public IStatus run(IProgressMonitor monitor) {
                try {
                    CEC.run(strlFile, cFile);
                } catch (IOException e) {
                    Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "IO Error", e);
                    StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
                    return Status.OK_STATUS;
                } catch (KielerException e) {
                    Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Internal Error", e);
                    StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
                    return Status.OK_STATUS;
                }
                return Status.OK_STATUS;
            }
        };
        genC.schedule();
        
        return null;
    }
}
