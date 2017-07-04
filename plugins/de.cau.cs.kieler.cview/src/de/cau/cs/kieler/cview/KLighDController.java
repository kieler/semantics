package de.cau.cs.kieler.cview;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

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

import de.cau.cs.kieler.klighd.ui.view.controller.AbstractViewUpdateController;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * Controller for de.cau.cs.kieler.cview
 * 
 * @author delphino
 *
 */
public class KLighDController extends AbstractViewUpdateController {

    static String displayElem = "NO SELECTION";

    static KLighDController controller = null;

    public KLighDController() {
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
                if (!(selection instanceof IStructuredSelection))
                    return;

                displayElem = "";

                Object[] allselections = null;
                allselections = ((IStructuredSelection) selection).toArray();
                for (Object element : allselections) {

                    if (element instanceof org.eclipse.core.runtime.PlatformObject) {
                        if (displayElem.length() > 0) {
                            displayElem += "\n";
                        }
                        displayElem += getFilePath(element);
                    }
                }

                if (displayElem.length() == 0) {
                    displayElem = "NO SELECTION";
                }

                if (controller != null) {
                    controller.updateModel(displayElem, null);
                    controller.getDiagramView().updateDiagram();
                }

            }
        };
        selectionService.addPostSelectionListener(IPageLayout.ID_PROJECT_EXPLORER,
                selectionListener);

    }

    public String getFilePath(Object object) {
        PlatformObject po = (org.eclipse.core.runtime.PlatformObject) object;
        try {
            // The FILE type
            Class fieldType = po.getClass();
            File res = (org.eclipse.core.internal.resources.File) fieldType
                    .getMethod("getFile", null).invoke(po, null);
            String workspacePath = res.getFullPath().toString();
            String fullPath = resolveFile(workspacePath);
            return fullPath;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                // The FOLDER type
                Class fieldType = po.getClass();
                Folder res = (org.eclipse.core.internal.resources.Folder) fieldType
                        .getMethod("getResource", null).invoke(po, null);
                String workspacePath = res.getFullPath().toString();
                String fullPath = resolveFile(workspacePath);
                return fullPath;

            } catch (Exception ee) {
                ee.printStackTrace();
                try {
                    // The PROJECT type

                    Class fieldType = po.getClass();
                    IPath res = (IPath) fieldType
                            .getMethod("getWorkingLocation", String.class).invoke(po, ".");
                    String workspacePath = res.toString().substring(0, res.toString().indexOf("/."))
                    + po.toString().substring(1);
                    String fullPath = workspacePath;
                    return fullPath;

                } catch (Exception eee) {
                    eee.printStackTrace();
                }
            }
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

        Object model = displayElem + " [" + (c++) + "]";
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
