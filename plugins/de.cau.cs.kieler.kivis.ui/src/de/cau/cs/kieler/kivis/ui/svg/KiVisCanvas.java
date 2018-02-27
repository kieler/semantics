/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

/**
 * 
 * 
 * @author skn
 * @author haf
 */

package de.cau.cs.kieler.kivis.ui.svg;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;
import java.io.FileWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JRootPane;
import javax.swing.JScrollPane;

import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.swing.svg.JSVGComponent;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.svg2svg.SVGTranscoder;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.kivis.ui.internal.KiVisActivator;
import de.cau.cs.kieler.prom.console.ConsoleStyle;
import de.cau.cs.kieler.prom.console.PromConsole;

/**
 * SWT control to hold display SVG image from file. 
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de, Hauke Fuhrmann (haf)
 */

public class KiVisCanvas extends Composite {

    /**
     * The underlying JSVGCanvas.
     */
    private EclipseJSVGCanvas svgCanvas;
    /**
     * The AWT Frame for the JSVGCanvas
     */
    private Frame frame;
    
    /**
     * The user agent
     */
    private KiVisUserAgent userAgent;
    
    /**
     * The file handle of the loaded image.
     */
    private IFile svgFile;
    /**
     * The URI of the loaded image
     */
    private URI svgURI; // required if RCP does not support IFiles

    /**
     * Constructor
     * 
     * @param parent The parent composite
     * @param style The SWT style bits
     * @param showScrollbars Determines if scrollbars should be shown
     */
    public KiVisCanvas(Composite parent, int style, boolean showScrollbars) {
        super(parent, style);
        try {
            // Create the user agent
            userAgent = new KiVisUserAgent(this);
            
            // Create the EclipseJSVGCanvas
            svgCanvas = new EclipseJSVGCanvas(userAgent, true, false);
            svgCanvas.setLayout(new BorderLayout());
            svgCanvas.setDocumentState(JSVGComponent.ALWAYS_DYNAMIC);
            svgCanvas.setDoubleBufferedRendering(true);
            svgCanvas.setProgressivePaint(true);
            svgCanvas.setFocusCycleRoot(false);

            // Create a AWT panel
            Panel panel = new Panel(new BorderLayout()) {
                private static final long serialVersionUID = -3473742040625838717L;

                public void update(java.awt.Graphics g) {
                    /* Do not erase the background */
                    paint(g);
                }
            };
            panel.setFocusable(false);
            JRootPane root = new JRootPane();
            root.setFocusable(false);
            panel.add(root);
            java.awt.Container contentPane = root.getContentPane();
            contentPane.setLayout(new BorderLayout());
            contentPane.setFocusable(false);
            
            if (showScrollbars) {
                contentPane.add(BorderLayout.CENTER, new JScrollPane(svgCanvas));
            } else {
                contentPane.add(BorderLayout.CENTER, svgCanvas);
            }
            
            // Create the AWT frame inside the SWT composite
            frame = SWT_AWT.new_Frame(this);
            frame.setLayout(new BorderLayout());
            frame.add(BorderLayout.CENTER, panel);
            frame.setEnabled(true);
            frame.setFocusable(false);
            
            frame.addFocusListener(new FocusAdapter() {
                public void focusGained(FocusEvent e) {
                    PromConsole.getDebugConsole().info("awt frame received focus");
                }

                public void focusLost(FocusEvent e) {
                    PromConsole.getDebugConsole().info("awt frame lost focus");
                }
            });
        } catch (Throwable t) {
            Status s = new Status(IStatus.ERROR, KiVisActivator.DE_CAU_CS_KIELER_KIVIS_KIVIS, t.getMessage(), t);
            StatusManager.getManager().handle(s, StatusManager.SHOW);
            StatusManager.getManager().handle(s, StatusManager.LOG);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void dispose() {
        svgCanvas.dispose();
        frame.dispose();
        super.dispose();
    }

    /**
     * Returns the user agent.
     * @return the user agent
     */
    public KiVisUserAgent getUserAgent() {
        return userAgent;
    }
    
    /**
     * Sets the svgURI
     * @param svgURI The new svgURI
     */
    public void setSVGURI(URI svgURI) {
        this.svgURI = svgURI;
    }

    /**
     * Sets the svgPath
     * @param path The new svgPath
     */
    public void setSVGPath(IPath path) {
        try {
            URL url = path.toFile().toURI().toURL();
            setSVGFile(url);
            svgURI = path.toFile().toURI();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sets the svgFile
     * @param file The svgFile
     */
    public void setSVGFile(IFile file) {
        svgFile = file;
        svgURI = file.getLocationURI();
        paintSVGFile();
    }

    /**
     * Sets the svgFile using an URL
     * @param url The url
     */
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

    /**
     * Returns the svgURI
     * @return the svgURI
     */
    public URI getSVGURI() {
        return svgURI;
    }

    /**
     * Loads the SVG document from the svgFile. 
     */
    public void paintSVGFile() {
        try {
            if (svgFile != null) {
                URL url = svgFile.getLocation().toFile().toURI().toURL();
                svgCanvas.loadSVGDocument(url.toExternalForm());
            } else if (svgURI != null) {
                svgCanvas.loadSVGDocument(svgURI.toURL().toExternalForm());
            } else {
                System.out.println("No document URI set!");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
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
    
    /**
     * Returns the JSVGCanvas
     * @return svgCanvas the JSVGCanvas
     */
    public JSVGCanvas getSvgCanvas() {
        return svgCanvas;
    }

    /**
     * Logs a message.
     * @param msg The message
     */
    protected static void log(String msg) {
        log(msg, null);
    }
    
    /**
     * Logs a message and an exception.
     * @param msg The message
     * @param e The exception
     */
    protected static void log(String msg, Exception e) {
        Status status = new Status(Status.INFO, KiVisActivator.DE_CAU_CS_KIELER_KIVIS_KIVIS, msg, e);
        KiVisActivator.getInstance().getLog().log(status);
    }
}
