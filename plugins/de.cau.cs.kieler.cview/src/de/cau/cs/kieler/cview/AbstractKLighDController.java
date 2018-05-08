package de.cau.cs.kieler.cview;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.cdt.internal.core.model.Parent;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.cview.model.cViewModel.CViewModel;
import de.cau.cs.kieler.cview.model.cViewModel.CViewModelFactory;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * Abstract controller for general behavior used for updating the model and initiating the CView
 * graphical diagram.
 * 
 * @author cmot
 *
 */
public abstract class AbstractKLighDController {

    public static String CVIEW_KLIGHD_ID = "de.cau.cs.kieler.cview.klighd"; // de.cau.cs.kieler.cview.klighd
    public static String CVIEW_KLIGHD_PRIMARY_ID =
            "de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart";
    public static String CVIEW_KLIGHD_TITLE = "C View";
    public static String CVIEW_KLIGHD_TITLE_FILTERED = "C View  (FILTERED)";
    
    // TODO @cmot: an invalid number of files in the selection
    public static int COUNT_INVALID = -1;

    static CViewModel model = null;
    static AbstractKLighDController controller = null;
    static Object[] allSelections;
    
    // TODO @cmot: the count of all files
    private static int fileCount = -1;
    
    // Initially, force a complete re-build (no refresh) for the (existing) KLighD view
    static boolean viewInitialized = false;

    // -------------------------------------------------------------------------

    public abstract CViewModel calculateModel(Object[] allselections, IProgressMonitor monitor);

    public abstract int preCalculateModel(Object[] allselections);

    // -------------------------------------------------------------------------

    public static Object[] getAllSelections() {
        return allSelections;
    }

    // -------------------------------------------------------------------------

    public static CViewModel getModel() {
        return model;
    }
    
    
    public static int getSelectionCount() {
    	if(fileCount == COUNT_INVALID) {
    		controller.updateCount();
    	}
    	return fileCount;
    }
    
    // -------------------------------------------------------------------------
    
    public static AbstractKLighDController getController() {
    	return controller;
    }

    public List<java.io.File> listFiles(String dirPath) {
        return listFiles(dirPath, "*.{c,h}");
    }

    // -------------------------------------------------------------------------

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

    // -------------------------------------------------------------------------

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
//                        allSelections = ((IStructuredSelection) selection).toArray();
                    	allSelections = removeChildren((IStructuredSelection) selection);
                    	// TODO @cmot: Resets count
                    	resetCount();
                    }
                };
                selectionService.addPostSelectionListener(IPageLayout.ID_PROJECT_EXPLORER,
                        selectionListener);
            }
        });
    }
    
    private Object[] removeChildren(IStructuredSelection selection) {
    	Object[] selected = selection.toArray();
    	HashSet<Object> selectedSet = new HashSet<Object>();
    	List<Object> selectedNoChildrenList = new ArrayList<Object>();
    	for(Object obj : selected) {
    		selectedSet.add(obj);
    	}
    	for(Object obj : selected) {
    		if(obj instanceof Project) {
    			Object[] ret = {obj};
    			return ret;
    		}
    		if(obj instanceof ICElement) {
    			ICElement objElement = (ICElement) obj;
    			ICElement parent = objElement.getParent();
    			boolean contained = false;
    			while(parent != null && !contained) {
    				if(selectedSet.contains(parent)) {
    					contained = true;
    				}
    				parent = parent.getParent();
    			}
    			if(!contained) {
    				selectedNoChildrenList.add(obj);
    			}
    		}
    	}
    	
    	return selectedNoChildrenList.toArray();
    }
    
    
    /** TODO @cmot
     * Resets count. Count must be recalculated before the next query.
     */
    private void resetCount() {
    	fileCount = COUNT_INVALID;
    }
    
    
    /** TODO @cmot
     * Updates the count. Takes all selected elements and counts its files and folders.
     * Writes the result to the static integer fileCount.
     */
    private void updateCount() {
    	HashSet<File> files = new HashSet<File>();
    	
    	for(Object selectedObject : allSelections) {
    		File file = null;
    		
    		if(selectedObject instanceof File) {
    			file = (File) selectedObject;
    		} else {
    			String filePath = getFilePath(selectedObject);
    			String folderPath = getDirPath(selectedObject);
    			String projectPath = getProjectPath(selectedObject);
    			
    			if(filePath != null && !filePath.isEmpty()) {
    				file = new File(filePath);
    			} else if (folderPath != null && !folderPath.isEmpty()) {
    				file = new File(folderPath);
    			} else if (projectPath != null && !projectPath.isEmpty()) {
    				file = new File(projectPath);
    			}
    			
    		}
    		
    		addAllFilesToHashSet(file, files);
    	}
    	
    	fileCount = files.size();
    }
    
    /** TODO @cmot
     * Adds all child files, the files themselves and the folders themselves 
     * to the provided Set.
     * 
     * @param element The element to examine
     * @param files The set
     */
    private void addAllFilesToHashSet(File element, HashSet<File> files) {
    	if(element.isFile()) {
    		files.add(element);
    	} else if(element.isDirectory()) {
    		files.add(element);
    		for(File child : element.listFiles()) {
    			addAllFilesToHashSet(child, files);
    		}
    	}
    }
    
    // -------------------------------------------------------------------------

    public static void findAndCloseOldViews() {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                IWorkbench workBench = PlatformUI.getWorkbench();
                for (IWorkbenchWindow window : workBench.getWorkbenchWindows()) {
                    for (IWorkbenchPage page : window.getPages()) {
                        for (IViewReference viewReference : page.getViewReferences()) {
                            IViewPart part = viewReference.getView(false);
                            String id = viewReference.getId();
                            if (id.equals(CVIEW_KLIGHD_PRIMARY_ID)) {
                                if (viewReference.getSecondaryId().startsWith(CVIEW_KLIGHD_ID)) {
                                    //page.hideView(part);
                                    //part.dispose();
                                    page.hideView(part);
//                                    page.close();
                                    part.dispose();
                                    System.out.println(">>> " + id);
                                }
                            }
                        }
                    }
                }
            }});

        
//        final IWorkbenchWindow window = workBench.getActiveWorkbenchWindow();
    }

    // -------------------------------------------------------------------------

    public void openAndRefreshKLighDView(CViewModel updateModel, boolean updateIfExists) {
        DiagramViewPart view = DiagramViewManager.getView(CVIEW_KLIGHD_ID);
        if (view == null) {
            KlighdSynthesisProperties properties = new KlighdSynthesisProperties();
            // properties.setProperty(KlighdSynthesisProperties.REQUESTED_UPDATE_STRATEGY,
            // "de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy");
            // "de.cau.cs.kieler.klighd.incremental.IncrementalUpdateStrategy");
            if (updateIfExists) {
                if (updateModel != null) {
                    DiagramViewManager.createView(CVIEW_KLIGHD_ID, CVIEW_KLIGHD_TITLE, updateModel,
                            properties);
                } else {
                    CViewModel nullModel = CViewModelFactory.eINSTANCE.createCViewModel();
                    DiagramViewManager.createView(CVIEW_KLIGHD_ID, CVIEW_KLIGHD_TITLE, nullModel,
                            properties);
                }
            }
        } else {
            if (updateIfExists) {
                if (updateModel != null) {
                    if (!viewInitialized) {
                        view.initialize(updateModel, CVIEW_KLIGHD_TITLE, null);
                        viewInitialized = true;
                    } else {
                        DiagramViewManager.updateView(view.getViewContext(), updateModel);
                    }
                } else {
                    CViewModel nullModel = CViewModelFactory.eINSTANCE.createCViewModel();
                    if (!viewInitialized) {
                        view.initialize(nullModel, CVIEW_KLIGHD_TITLE, null);
                        viewInitialized = true;
                    } else {
                        DiagramViewManager.updateView(view.getViewContext(), nullModel);
                    }
                }
            }
        }
    }

    public void refreshCView(boolean forceRebuild) {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                if (forceRebuild) {
                    CViewModel nullModel = CViewModelFactory.eINSTANCE.createCViewModel();
                    openAndRefreshKLighDView(null, true);
                }
                if (controller != null && model != null) {
                    openAndRefreshKLighDView(model, true);
                }
            }
        });
    }
    
    public void setNoCView() {
    	Display.getDefault().asyncExec(new Runnable() {
    		public void run() {
    			DiagramViewPart view = DiagramViewManager.getView(CVIEW_KLIGHD_ID);
    			CViewModel nullModel = CViewModelFactory.eINSTANCE.createCViewModel();
    			if(view == null) {
    				KlighdSynthesisProperties properties = new KlighdSynthesisProperties();
                    DiagramViewManager.createView(CVIEW_KLIGHD_ID, CVIEW_KLIGHD_TITLE, nullModel,
                            properties);
    			} else {
    				DiagramViewManager.updateView(view.getViewContext(), nullModel);
    			}
    		}
    	});
    }

    // -------------------------------------------------------------------------

    public void rebuildModelAndrefreshCView(boolean forceRebuild) {
        rebuildModel(forceRebuild, true);
    }

    // -------------------------------------------------------------------------
    
    
    public void rebuildModelNoRefresh(boolean forceRebuild) {
    	rebuildModel(forceRebuild, false);
    }
    
    
    // -------------------------------------------------------------------------
    
    
    private void rebuildModel(boolean forceRebuild, boolean refreshCView) {
        if (allSelections != null) {
            int workTotal = preCalculateModel(allSelections); // , IProgressMonitor monitor));
            try {
                new CViewProgressMonitorDialog(new Shell()).run(true, true,
                        (new RunnableWithProgress() {
                            public void run(IProgressMonitor monitor) {
                                SubMonitor subMonitor = SubMonitor.convert(monitor, workTotal);
                                // TODO @cmot: Changed to files and folders to better mirror actual process
                                monitor.beginTask("Processing " + workTotal + " files and folders...", workTotal);
                                subMonitor.worked(1);
                                model = calculateModel(allSelections, subMonitor); // , IProgressMonitor
                                                                                   // monitor));
                                if(refreshCView) {
                                	refreshCView(forceRebuild);                                	
                                } else {
                                	setNoCView();
                                }
                            }
                        }));
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }    	
    }
    
    
    public String getFilePath(Object object) {
        IFile file = null;
        if (object instanceof IFile) {
            file = (IFile) object;
        } else  if (object instanceof File){
        	IWorkspace workspace = ResourcesPlugin.getWorkspace();
        	IPath loc = Path.fromOSString(((File)object).getAbsolutePath());
        	file = workspace.getRoot().getFileForLocation(loc);
        } else {
            try {

                // The FILE type
                PlatformObject po = (org.eclipse.core.runtime.PlatformObject) object;
                Class fieldType = po.getClass();
                file = (org.eclipse.core.internal.resources.File) fieldType
                        .getMethod("getFile", null).invoke(po, null);
            } catch (Exception e) {
            }
        }
        if (file != null) {
            try {
                String workspacePath = file.getFullPath().toString();
                String fullPath = resolveFile(workspacePath);
                return fullPath;
            } catch (Exception e) {
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------

    public String getDirPath(Object object) {
        IFolder folder = null;
        if (object instanceof IFolder) {
            folder = ((IFolder) object);
        } else if (object instanceof File){
        	IWorkspace workspace = ResourcesPlugin.getWorkspace();
        	IPath loc = Path.fromOSString(((File)object).getAbsolutePath());
        	folder = workspace.getRoot().getFolder(loc);
        } else {
            try {
                PlatformObject po = (org.eclipse.core.runtime.PlatformObject) object;
                // The FOLDER type
                Class fieldType = po.getClass();
                folder = (org.eclipse.core.internal.resources.Folder) fieldType
                        .getMethod("getResource", null).invoke(po, null);
            } catch (Exception e) {
            }
        }
        if (folder != null) {
            try {
                String workspacePath = folder.getFullPath().toString();
                String fullPath = resolveFile(workspacePath);
                return fullPath;

            } catch (Exception ee) {
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------

    public String getProjectPath(Object object) {
        IPath path = null;
        if (object instanceof IProject) {
            IProject project = ((IProject) object);
            path = project.getLocation();
            // path = project.getWorkspace().getRoot().getFullPath();
            String workspacePath = path.toString();
            return workspacePath;
        } else {
            try {
                // The PROJECT type
                PlatformObject po = (org.eclipse.core.runtime.PlatformObject) object;
                Class fieldType = po.getClass();
                path = (IPath) fieldType.getMethod("getWorkingLocation", String.class).invoke(po,
                        ".");
                String workspacePath = path.toString().substring(0, path.toString().indexOf("/."))
                        + po.toString().substring(1);
                String fullPath = workspacePath;
                return fullPath;

            } catch (Exception eee) {
            }
        }

        return null;
    }

    // -------------------------------------------------------------------------

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

    // -------------------------------------------------------------------------

    public static int getSynthesisOptionIntValue(final SynthesisOption option) {
        ViewContext viewContext = getCurrentViewContext();
        if (viewContext != null) {
            final Object result = viewContext.getOptionValue(option);
            if (result == null) {
                return 0;

            } else if (result instanceof Float) {
                return ((Float) result).intValue();

            } else if (result instanceof Integer) {
                return (Integer) result;
            }
        }
        return -1;
    }

    // -------------------------------------------------------------------------
    static int c = 0;

    public static ViewContext getCurrentViewContext() {
        DiagramViewPart view = DiagramViewManager.getView(CVIEW_KLIGHD_ID);
        ViewContext returnContext = null;
        if (view != null) {
            returnContext = view.getViewContext();
        }
        return returnContext;
    }

    // -------------------------------------------------------------------------
}
