package de.cau.cs.kieler.cview;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.Workbench;

import de.cau.cs.kieler.cview.model.cViewModel.CViewModel;
import de.cau.cs.kieler.cview.model.cViewModel.CViewModelFactory;
import de.cau.cs.kieler.klighd.ui.view.controller.AbstractViewUpdateController;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * Controller for de.cau.cs.kieler.cview
 * 
 * @author delphino
 *
 */
public abstract class AbstractKLighDController extends AbstractViewUpdateController {

    static CViewModel model = null;

    static AbstractKLighDController controller = null;
    
    static Object[] allSelections;

    public abstract CViewModel calculateModel(Object[] allselections);

    public List<java.io.File> listFiles(String dirPath) {
        return listFiles(dirPath, "*.{c,h}");
    }

    public List<java.io.File> listFiles(String dirPath, String filter) {
        List<java.io.File> files = new ArrayList<>();
        java.nio.file.Path path = Paths.get(dirPath);
        try (DirectoryStream<java.nio.file.Path > stream = Files.newDirectoryStream(path, filter)) {
            for (java.nio.file.Path  entry: stream) {
                files.add(entry.toFile());
            }
            return files;
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return null; 
    }

    public AbstractKLighDController() {
        System.out.println("+++ CONTROLLER INSTANTIATED +++");
        controller = this;

        // IEditorPart editor = Workbench.getInstance().getActiveWorkbenchWindow().getActivePage()
        // .getActiveEditor();
        // String editorID = editor.getEditorSite().getId();
        // System.out.println("+++ ID '" + editorID + "'");
        ;

        ISelectionService selectionService =
                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();

        ISelectionListener selectionListener = new ISelectionListener() {
            public void selectionChanged(IWorkbenchPart part, ISelection selection) {

                // Save selection in ANY case (for later usage)
                allSelections = ((IStructuredSelection) selection).toArray();

                if (!CViewPlugin.isEnabled()) {
                    return;
                }
                
                if (!(selection instanceof IStructuredSelection)) {
                    return;
                }
                
                CViewPlugin.refreshCView();
            }
        };
        selectionService.addPostSelectionListener(IPageLayout.ID_PROJECT_EXPLORER,
                selectionListener);

    }
    
    
    public void refreshCView() {
        model = calculateModel(allSelections);

        if (controller != null) {
            controller.updateModel(model, null);
            controller.getDiagramView().updateDiagram();
        }

    }

    public String getFilePath(Object object) {
        try {
            // The FILE type
            PlatformObject po = (org.eclipse.core.runtime.PlatformObject) object;
            Class fieldType = po.getClass();
            File res = (org.eclipse.core.internal.resources.File) fieldType
                    .getMethod("getFile", null).invoke(po, null);
            String workspacePath = res.getFullPath().toString();
            String fullPath = resolveFile(workspacePath);
            return fullPath;
        } catch (Exception e) {
        }
        return null;
    }

    // -------------------------------------------------------------------------

    public String getDirPath(Object object) {
        try {
            PlatformObject po = (org.eclipse.core.runtime.PlatformObject) object;
            // The FOLDER type
            Class fieldType = po.getClass();
            Folder res = (org.eclipse.core.internal.resources.Folder) fieldType
                    .getMethod("getResource", null).invoke(po, null);
            String workspacePath = res.getFullPath().toString();
            String fullPath = resolveFile(workspacePath);
            return fullPath;

        } catch (Exception ee) {
        }
        return null;
    }

    public String getProjectPath(Object object) {
        try {
            // The PROJECT type
            PlatformObject po = (org.eclipse.core.runtime.PlatformObject) object;
            Class fieldType = po.getClass();
            IPath res =
                    (IPath) fieldType.getMethod("getWorkingLocation", String.class).invoke(po, ".");
            String workspacePath = res.toString().substring(0, res.toString().indexOf("/."))
                    + po.toString().substring(1);
            String fullPath = workspacePath;
            return fullPath;

        } catch (Exception eee) {
        }
        return null;
    }

    public String resolveFile(String workSpaceFileLocation) {
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

        // as \ is an escape character in a String AND a RegEx
        String fileLocation2 = workSpaceFileLocation.replaceAll("\\\\", "/").replace("%20", " ");

        IFile file = myWorkspaceRoot.getFile(new Path(fileLocation2));
        String fileString = file.getLocation().toString();
        if (new java.io.File(fileString).exists()) {
            return fileString;
        }
        return null;
    }

    @Override
    public String getID() {
        return "de.cau.cs.kieler.cview.klighd.controller";
    }

    static int c = 1;

    @Override
    public void onActivate(IEditorPart editor) {
        System.out.println("+++ CONTROLLER ACTIVATED +++");

        // IEditorPart editor = Workbench.getInstance().getActiveWorkbenchWindow().getActivePage()
        // .getActiveEditor();
        String editorID = editor.getEditorSite().getId();
        System.out.println("+++ ID '" + editorID + "'");

        this.updateModel(model, null);
        this.getDiagramView().updateDiagram();
    }

    @Override
    public void onDeactivate() {
        System.out.println("+++ CONTROLLER DEACTIVATED +++");

    }

    @Override
    public void refresh() {
        System.out.println("+++ CONTROLLER REFRESHED +++");

    }

}
