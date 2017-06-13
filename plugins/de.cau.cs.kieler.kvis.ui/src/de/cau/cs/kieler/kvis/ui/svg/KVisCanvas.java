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
import java.io.File;
import java.io.FileWriter;
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
import org.apache.batik.swing.svg.JSVGComponent;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.svg2svg.SVGTranscoder;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
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

    private JSVGCanvas svgCanvas;

    private IFile svgFile;
    private IProject svgProject;
    private URI svgURI; // required if RCP does not support IFiles

    private JLabel statusLabel;
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
        statusLabel = new JLabel("Status");
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
//        try {
//            System.setProperty("sun.awt.noerasebackground", "true");
//        } catch (NoSuchMethodError error) {
//            error.printStackTrace();
//        }

        try {
            userAgent = new KVisUserAgent(this);
            // Create the EclipseJSVGCanvas
            svgCanvas = new EclipseJSVGCanvas(userAgent, true, true);
            svgCanvas.setLayout(new BorderLayout());

            svgCanvas.setDocumentState(JSVGComponent.ALWAYS_DYNAMIC);
            svgCanvas.setDoubleBufferedRendering(false);
            svgCanvas.setDisableInteractions(true);
            // this.canvas.setAnimationLimitingCPU(0.5f);

            frame = null;
            frame = SWT_AWT.new_Frame(this);

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
        } catch (Throwable t) {
            Status s = new Status(IStatus.ERROR, KVisActivator.DE_CAU_CS_KIELER_KVIS_KVIS, t.getMessage(), t);
            StatusManager.getManager().handle(s, StatusManager.SHOW);
            StatusManager.getManager().handle(s, StatusManager.LOG);
        }
    }

    public void dispose() {
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

    /**
     * Returns the current JSVGCanvas of the KEV-View.
     * 
     * @return svgCanvas the current JSVGCanvas
     */
    public JSVGCanvas getSVGCanvas() {
        return svgCanvas;
    }

    /**
     * Save the currently displayed SVG to the file at the given location.
     */
    public void saveSVGDocument(String location) {
        if (svgCanvas != null) {
            try {
                TranscoderInput input = new TranscoderInput(svgCanvas.getSVGDocument());

                FileWriter writer = new FileWriter(location);

                TranscoderOutput output = new TranscoderOutput(writer);
                SVGTranscoder t = new SVGTranscoder();

                t.transcode(input, output);
                writer.flush();
                writer.close();
            } catch (Exception e) {
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
