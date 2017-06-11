/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by + Kiel University + Department of Computer Science +
 * Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL). See the file
 * epl-v10.html for the license text.
 */

/**
 * 
 * 
 * @author skn
 * @author haf
 */

package de.cau.cs.kieler.kvis.ui.svg;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.swing.gvt.GVTTreeRendererAdapter;
import org.apache.batik.swing.gvt.GVTTreeRendererEvent;
import org.apache.batik.swing.svg.GVTTreeBuilderAdapter;
import org.apache.batik.swing.svg.GVTTreeBuilderEvent;
import org.apache.batik.swing.svg.JSVGComponent;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.svg2svg.SVGTranscoder;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.kvis.ui.internal.KVisActivator;

/**
 * The adapted KEV-Composite class.
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de, Hauke Fuhrmann (haf)
 * @kieler.ignore deprecated project
 */

public class KVisCanvas extends Composite implements ISelectionListener {

    private JSVGCanvas svgCanvas = null;

    private IFile svgFile;
    private IProject svgProject;
    private URI svgURI; // required if RCP does not support IFiles

    private SVGResourceChangeListener updater;
    private JLabel statusLabel = new JLabel("Status");
    private Frame frame;

    private KVisUserAgent userAgent;

    /**
     * This one is a single loadingStatusListener so we can keep an eye on the svg document loading
     * status.
     */
    private final SVGLoadingStatusListener loadingStatusListener = new SVGLoadingStatusListener();

    public KVisUserAgent getUserAgent() {
        return userAgent;
    }

    /**
     * Returns the SVGLoadingStatusLister for the single svgCanvas instance. So we only need one for
     * whole xKEV.
     * 
     * @return loadingStatusListener
     */
    public SVGLoadingStatusListener getSVGLoadingStatusListener() {
        return loadingStatusListener;
    }

    public KVisCanvas(Composite parent, int style, boolean showScrollbars) {
        super(parent, SWT.EMBEDDED);

        parent.setLayout(new FillLayout());
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        statusLabel.setBackground(java.awt.Color.BLACK);
        statusLabel.setForeground(java.awt.Color.WHITE);
        statusLabel.setFont(new Font("helvetica", Font.BOLD, 12));
        statusLabel.setOpaque(true);
        statusLabel.setVisible(false);

        /*
         * Set a Windows specific AWT property that prevents heavyweight components from erasing
         * their background. Note that this is a global property and cannot be scoped. It might not
         * be suitable for your application.
         */
        try {
            System.setProperty("sun.awt.noerasebackground", "true");
        } catch (NoSuchMethodError error) {
            error.printStackTrace();
        }

        try {
            userAgent = new KVisUserAgent(this);
            if (EclipseJSVGCanvas.getInstance() == null) {
                // while (!EclipseJSVGCanvas.createSingleInstance(userAgent, true, true)) {
                // //Do nothing until the single instance is successfully created
                // }
                if (!EclipseJSVGCanvas.createSingleInstance(userAgent, true, true)) {
                    log("Creation of single instance of KEV-View failed!");
                    return;
                }
                // Get the single instance of the EclipseJSVGCanvas
                svgCanvas = EclipseJSVGCanvas.getInstance();
                // svgCanvas = new EclipseJSVGCanvas(userAgent, true, true);
                svgCanvas.setLayout(new BorderLayout());

                // taken from original modelgui
                svgCanvas.setDocumentState(JSVGComponent.ALWAYS_DYNAMIC);
                svgCanvas.setDoubleBufferedRendering(false);
                svgCanvas.setDisableInteractions(true);
                // svgCanvas.enableInputMethods(false);
                // this.canvas.setAnimationLimitingCPU(0.5f);
                // svgCanvas.setDoubleBuffered(true);

                // Set the JSVGCanvas listeners. (NOT USED HERE ANYMORE @see
                // de.cau.cs.kieler.kev.mapping.animations#SVGLoadingStatusListener)
                // svgCanvas.addSVGDocumentLoaderListener(loadingStatusListener);
                // svgCanvas.addSVGDocumentLoaderListener(new SVGDocumentLoaderAdapter() {
                // public void documentLoadingStarted(SVGDocumentLoaderEvent e) {
                // System.out.println("Loading svg file...");
                // }
                //
                // public void documentLoadingCompleted(SVGDocumentLoaderEvent e) {
                // System.out.println("Loading svg file... complete!");
                // }
                //
                // public void documentLoadingCancelled(SVGDocumentLoaderEvent e) {
                // System.out.println("Loading svg file... cancelled!");
                //
                // }
                //
                // public void documentLoadingFailed(SVGDocumentLoaderEvent e) {
                // System.out.println("Loading svg file... failed!");
                // }
                // });
                svgCanvas.addGVTTreeBuilderListener(new GVTTreeBuilderAdapter() {
                    public void gvtBuildStarted(GVTTreeBuilderEvent e) {
                    }

                    public void gvtBuildCompleted(GVTTreeBuilderEvent e) {
                    }
                });

                svgCanvas.addGVTTreeRendererListener(new GVTTreeRendererAdapter() {
                    public void gvtRenderingPrepare(GVTTreeRendererEvent e) {
                    }

                    public void gvtRenderingCompleted(GVTTreeRendererEvent e) {
                        // Here we can receive the updatemanager
                        log("Image rendering done.");
//                        MapAnimations.getInstance().createHashMap();
                    }
                });

                svgCanvas.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int onmask = MouseEvent.SHIFT_DOWN_MASK | MouseEvent.ALT_DOWN_MASK;
                        if ((e.getModifiersEx() & onmask) == onmask) {
                            // Only save current SVGDocument to file, if
                            // SHIFT + ALT + Right-Mousebutton is clicked
                            if (e.getButton() == MouseEvent.BUTTON3) {
                                saveSVGDocument();
                            }
                        }
                    }

                });

                // svgCanvas.addMouseMotionListener(new MouseMotionAdapter() {
                //
                // public void mouseMoved(MouseEvent arg0) {
                // // TODO Auto-generated method stub
                // System.out.println(arg0.getX()+","+arg0.getY());
                // }
                //
                // });

            } else {// Otherwise set the sourcepath to the current document uri
                svgCanvas = EclipseJSVGCanvas.getInstance();
                // If svgDocument already exists, set the current svgURI for the refresh button
                if (svgCanvas.getSVGDocument() != null) {
                    setSVGURI(URI.create(svgCanvas.getSVGDocument().getURL()));
                }
            }

            frame = null;
            try {
                frame = SWT_AWT.new_Frame(this);
            } catch (Throwable e) {
                // Catch 'not implemented' exception
            }

            Panel panel = new Panel(new BorderLayout()) {
                private static final long serialVersionUID = -3473742040625838717L;

                public void update(java.awt.Graphics g) {
                    /* Do not erase the background */
                    paint(g);
                }
            };

            JRootPane root = new JRootPane();
            panel.add(root);
            java.awt.Container contentPane = root.getContentPane();
            contentPane.setLayout(new BorderLayout());

            if (showScrollbars) {
                contentPane.add(BorderLayout.CENTER, new JScrollPane(svgCanvas));
            } else {
                contentPane.add(BorderLayout.CENTER, svgCanvas);
            }

            if (frame != null) {
                frame.setLayout(new BorderLayout());
                frame.add(BorderLayout.CENTER, panel);
                frame.setEnabled(true);
            }

            IWorkspace workspace = ResourcesPlugin.getWorkspace();
            updater = new SVGResourceChangeListener();
            workspace.addResourceChangeListener(updater);

        } catch (Throwable t) {
            Status s = new Status(IStatus.ERROR, KVisActivator.DE_CAU_CS_KIELER_KVIS_KVIS, t.getMessage(), t);
            StatusManager.getManager().handle(s, StatusManager.SHOW);
            StatusManager.getManager().handle(s, StatusManager.LOG);
            // ErrorDialog d = new
            // ErrorDialog(this.getShell(),"Error",t.getMessage(),s,IStatus.ERROR);
        }

    }

    public void dispose() {

        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        if (updater != null) {
            workspace.removeResourceChangeListener(updater);
        }
        // Don't dispose svgCanvas, could be used later on (simulation can run in background without
        // showing the canvas)
        // svgCanvas.dispose();
        frame.dispose();
        super.dispose();
    }

    public void setSVGURI(URI svgURI) {
        this.svgURI = svgURI;
    }

    public void setSVGPath(IPath path) {
        try {
            URL url = path.toFile().toURI().toURL();
            setSVGFile(url);
            svgURI = path.toFile().toURI();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void setSVGFile(IFile f) {
        svgFile = f;
        svgProject = f.getProject();
        svgURI = f.getLocationURI();
        paintSVGFile();
    }

    public void setSVGFile(URL url) {
        try {
            svgURI = url.toURI();
        } catch (URISyntaxException e) {
            log("Error converting URL " + url
                    + " to URI when trying to load svg file.", e);
        }
        try {
            // Tools.setStatusLine("loading image...");
            File f = new File(svgURI.getPath());
            // Only try to load the SVG-file if we really have selected one or if the the URI is a
            // valid bundleentry
            if (f.isFile() || svgURI.getScheme().contentEquals("bundleentry")) {
                svgCanvas.loadSVGDocument(url.toExternalForm());
            }
        } catch (Exception e) {
            log("Failed to load svg image: " + url, e);
        }

    }

    /** Returns th uri to the actual svg file if exists */
    public URI getSVGURI() {
        return svgURI;
    }

    public void paintSVGFile() {
        try {
            if (svgFile != null) {
                URL url = svgFile.getLocation().toFile().toURI().toURL();
                svgCanvas.loadSVGDocument(url.toExternalForm());
            } else if (svgURI != null) {
                // Tools.setStatusLine("loading image...");
                svgCanvas.loadSVGDocument(svgURI.toURL().toExternalForm());
            } else {
                System.out.println("No document URI set!");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Callback of ISelectionListener that listens on selection of svg-files in the file
     * navigator/project explorer. Will load the svg file from the selected IFile.
     */
    public void selectionChanged(IWorkbenchPart part, ISelection s) {
        if (s instanceof IStructuredSelection) {
            IStructuredSelection ss = (IStructuredSelection) s;
            Object obj = ss.getFirstElement();
            if (obj instanceof IFile) {
                IFile f = (IFile) obj;
                IPath path = (IPath) f.getLocation();
                if (path != null) {
                    if (path.toFile().exists()) {
                        if (path.getFileExtension().equals("svg") //$NON-NLS-1$
                                || path.getFileExtension().equals("svgz")) { //$NON-NLS-1$
                            if (svgFile == null || !(svgFile.equals(f))) {
                                // setSVGFile(f);
                            }
                        }
                    }
                }
            }
        }
    }

    public class SVGResourceChangeListener implements IResourceChangeListener {
        public void resourceChanged(IResourceChangeEvent event) {
            if (svgFile != null) {
                final IPath svgPath = svgFile.getLocation();

                final IPath PATH = new Path(svgProject.getName() + "/" //$NON-NLS-1$
                        + svgFile.getProjectRelativePath());

                // we are only interested in POST_CHANGE events
                if (event.getType() != IResourceChangeEvent.POST_CHANGE) {
                    return;
                }
                IResourceDelta rootDelta = event.getDelta();
                // get the delta, if any, for the documentation directory
                IResourceDelta docDelta = rootDelta.findMember(PATH);
                if (docDelta == null) {
                    return;
                }
                IResourceDeltaVisitor visitor = new IResourceDeltaVisitor() {
                    public boolean visit(IResourceDelta delta) {
                        // only interested in changed resources (not added or
                        // removed)
                        if (delta.getKind() != IResourceDelta.CHANGED) {
                            return true;
                        }
                        // only interested in content changes
                        if ((delta.getFlags() & IResourceDelta.CONTENT) == 0) {
                            return true;
                        }
                        IResource resource = delta.getResource();

                        IPath path = resource.getLocation();

                        if (path.equals(svgPath)) {
                            paintSVGFile();
                        }

                        return true;
                    }
                };
                try {
                    docDelta.accept(visitor);
                } catch (CoreException e) {
                    // BatikUIPlugin.getDefault().getLog().log(e.getStatus());
                    log("CoreException", e);

                    // open error dialog with syncExec or print to plugin log file
                }
                // nothing more to do if there were no changed text files
                return;
            }
        }
    }

    /**
     * Returns the current JSVGCanvas of the KEV-View.
     * 
     * @return svgCanvas the current JSVGCanvas
     */
    public JSVGCanvas getSVGCanvas() {
        return svgCanvas;
    }

    /**
     * Helper function for saving current-status of svg-file This function creates an Eclipse
     * Project with an "images" folder, where all svg-files are saved to. To save the image simple
     * press CTRL+SHIFT+RIGHT_MOUSE_BUTTON on the current svg-document
     */
    public void saveSVGDocument() {
        if (EclipseJSVGCanvas.getInstance() != null) {
            IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
            IProject project = root.getProject("KEV_SVG_FILEDUMP"); // Project name
            IFolder imageFolder = project.getFolder("images"); // Folder name
            try {
                if (!project.exists()) { // Create project if it doesn't exists
                    project.create(null);
                }
                project.open(null);

                if (!imageFolder.exists()) { // Create folder if it doesn't exists
                    imageFolder.create(false, true, null);
                }
            } catch (CoreException ce) {
                // TODO Auto-generated catch block
                ce.printStackTrace();
            }
            try {
                TranscoderInput input = new TranscoderInput(getSVGCanvas().getSVGDocument());

                FileWriter writer;
                Calendar now = Calendar.getInstance();

                String fileName;
                fileName = imageFolder.getLocation().toString(); // Get fullpath to "images" folder
                fileName += "/SVGFileDump[";
                fileName += now.get(Calendar.YEAR) + "-";
                fileName += now.get(Calendar.MONTH) + 1 < 10 ? "0" + (now.get(Calendar.MONTH) + 1)
                        + "-" : (now.get(Calendar.MONTH) + 1) + "-";
                fileName += now.get(Calendar.DAY_OF_MONTH) < 10 ? "0"
                        + now.get(Calendar.DAY_OF_MONTH) + "_" : now.get(Calendar.DAY_OF_MONTH)
                        + "-";
                fileName += now.getTimeInMillis() + "].svg";

                writer = new FileWriter(fileName);

                TranscoderOutput output = new TranscoderOutput(writer);
                SVGTranscoder t = new SVGTranscoder();

                t.transcode(input, output);
                writer.flush();
                writer.close();
                imageFolder.refreshLocal(IFolder.DEPTH_ONE, null); // Refresh the "images" folder to
                // show the saved file
            } catch (TranscoderException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (CoreException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public JSVGCanvas getSvgCanvas() {
        return svgCanvas;
    }

    protected static void log(String msg) {
        log(msg, null);
    }
    
    protected static void log(String msg, Exception e) {
        Status status = new Status(Status.INFO, KVisActivator.DE_CAU_CS_KIELER_KVIS_KVIS, msg, e);
        KVisActivator.getInstance().getLog().log(status);
    }
}
