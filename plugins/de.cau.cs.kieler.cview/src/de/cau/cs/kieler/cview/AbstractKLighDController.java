package de.cau.cs.kieler.cview;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.elk.graph.properties.IProperty;
import org.eclipse.elk.graph.properties.Property;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.Workbench;

import com.google.common.primitives.Bytes;

import de.cau.cs.kieler.cview.model.cViewModel.CViewModel;
import de.cau.cs.kieler.cview.model.cViewModel.CViewModelFactory;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.kgraph.KNode;
import de.cau.cs.kieler.klighd.piccolo.internal.controller.DiagramController;
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.KNodeAbstractNode;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart;
import de.cau.cs.kieler.klighd.ui.view.controller.AbstractViewUpdateController;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;
import de.cau.cs.kieler.klighd.util.RenderingContextData;

/**
 * Controller for de.cau.cs.kieler.cview
 * 
 * @author delphino
 *
 */
public abstract class AbstractKLighDController {

    static String CVIEW_KLIGHD_ID = "de.cau.cs.kieler.cview.klighd";
    static String CVIEW_KLIGHD_TITLE = "C View";

    static CViewModel model = null;

    static AbstractKLighDController controller = null;

    static Object[] allSelections;
    
    public static Object[] getAllSelections() {
        return allSelections;
    }
    
    public static CViewModel getModel() {
        return model;
    }

    public abstract CViewModel calculateModel(Object[] allselections, IProgressMonitor monitor);

    public abstract int preCalculateModel(Object[] allselections);

    public List<java.io.File> listFiles(String dirPath) {
        return listFiles(dirPath, "*.{c,h}");
    }

    public List<java.io.File> listFiles(String dirPath, String filter) {
        List<java.io.File> files = new ArrayList<>();
        java.nio.file.Path path = Paths.get(dirPath);
        try (DirectoryStream<java.nio.file.Path> stream = Files.newDirectoryStream(path, filter)) {
            for (java.nio.file.Path entry : stream) {
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
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                ISelectionService selectionService =
                        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();

                ISelectionListener selectionListener = new ISelectionListener() {
                    public void selectionChanged(IWorkbenchPart part, ISelection selection) {
                        // Save selection in ANY case (for later usage)
                        allSelections = ((IStructuredSelection) selection).toArray();
                    }
                };
                selectionService.addPostSelectionListener(IPageLayout.ID_PROJECT_EXPLORER,
                        selectionListener);
            }
        });
    }

    
    public void refreshCView(boolean forceRebuild) {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                if (forceRebuild) {
                    CViewModel nullModel = CViewModelFactory.eINSTANCE.createCViewModel();
                    DiagramViewPart view = DiagramViewManager.getView(CVIEW_KLIGHD_ID);
                    if (view == null) {
                        DiagramViewManager.createView(CVIEW_KLIGHD_ID, CVIEW_KLIGHD_TITLE,
                                nullModel, KlighdSynthesisProperties.create());
                    } else {
                        DiagramViewManager.updateView(view.getViewContext(), nullModel);
                    }
                }
                if (controller != null && model != null) {
                    DiagramViewPart view = DiagramViewManager.getView(CVIEW_KLIGHD_ID);
                    if (view == null) {
                        DiagramViewManager.createView(CVIEW_KLIGHD_ID, CVIEW_KLIGHD_TITLE,
                                model, KlighdSynthesisProperties.create());
                    } else {
                        DiagramViewManager.updateView(view.getViewContext(), model);
                    }
                }
            }
        });
    }

    
    public void rebuildModelAndrefreshCView(boolean forceRebuild) {
     int workTotal = preCalculateModel(allSelections); // , IProgressMonitor monitor));
        try {
            new CViewProgressMonitorDialog(new Shell()).run(true,true, (new RunnableWithProgress() {
                public void run(IProgressMonitor monitor) {
                    SubMonitor subMonitor = SubMonitor.convert(monitor, workTotal);
                    monitor.beginTask("Processing "+workTotal+" files...", workTotal);
                    subMonitor.worked(1);
                    model = calculateModel(allSelections, subMonitor); // , IProgressMonitor monitor));
                    
                    refreshCView(forceRebuild);
                }
            }));
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
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

    public static Charset getEncoding() {
        Charset encoding = Charset.defaultCharset();
        return encoding;
    }

    static char[] readFile(String filePath) throws IOException {
        Charset encoding = getEncoding();
        StringBuilder stringBuilder = new StringBuilder();
        try (InputStream in = new FileInputStream(filePath);
                Reader reader = new InputStreamReader(in, encoding);
                Reader buffer = new BufferedReader(reader)) {
            int r;
            while ((r = reader.read()) != -1) {
                char ch = (char) r;
                stringBuilder.append(ch);
                // System.out.print(ch);
            }
        }
        // Byte[] bytes = readBytes.toArray(new Byte[readBytes.size()]);;
        return stringBuilder.toString().toCharArray();
    }

    // -------------------------------------------------------------------------
    
    public static int getSynthesisOptionIntValue(final SynthesisOption option) {
        ViewContext viewContext = getCurrentViewContext();
        if (viewContext != null) {
            final Object result = viewContext.getOptionValue(option);
            if (result == null) {
                return 0;

            } else if (result instanceof Float) {
                return ((Float) result).intValue();

            } else  if (result instanceof Integer) {
                return (Integer) result;
            }
        }
        return -1;
    }

    // -------------------------------------------------------------------------

    public static ViewContext getCurrentViewContext() {
        DiagramViewPart view = DiagramViewManager.getView(CVIEW_KLIGHD_ID);
        ViewContext returnContext = null;
        if (view != null) {
            returnContext = view.getViewContext();            
        }
        return returnContext;
    }

}
