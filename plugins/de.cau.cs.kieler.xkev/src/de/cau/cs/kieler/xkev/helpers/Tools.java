/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.xkev.helpers;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.xml.sax.SAXException;

import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.ui.AbortErrorDialog;
import de.cau.cs.kieler.xkev.views.KevView;

//import com.sun.org.apache.xml.internal.serialize.OutputFormat;
//import com.sun.org.apache.xml.internal.serialize.XMLSerializer;

/**
 * @author haf
 * 
 */
public class Tools {

    private static long time;

    /**
     * @param fileURL
     * @param schemaURL
     * @return
     * @throws IOException
     * @throws SAXException
     * @throws ParserConfigurationException
     * @throws URISyntaxException
     */
    public static boolean isValidXml(File file, File schemaFile) throws IOException, SAXException,
            ParserConfigurationException, URISyntaxException {
        // create a SchemaFactory capable of understanding WXS schemas
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = factory.newSchema(schemaFile);
        // create a Validator instance, which can be used to validate an
        // instance document
        Validator validator = schema.newValidator();

        validator.validate(new StreamSource(file.getPath()));
        // will throw SAXException if invalid

        return true;
    }

    public static boolean isValidXml(URL xmlFile, URL schemaFile) throws IOException, SAXException,
            ParserConfigurationException, URISyntaxException {
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = factory.newSchema(schemaFile);
        // create a Validator instance, which can be used to validate an
        // instance document
        Validator validator = schema.newValidator();
        validator.validate(new StreamSource(xmlFile.openStream()));
        // will throw SAXException if invalid
        return true;
    }

    /**
     * Very simple dialog.
     * 
     * @param msg
     * @author haf
     */
    public static void showDialog(String msg) {
        showDialog(msg, null);
    }

    public static void showDialog(Exception exc) {
        showDialog(null, exc);
    }

    /**
     * Error Dialog displaying a message and a details field. In the details field is printed the
     * stack trace.
     * 
     * @param msg
     * @param exc
     */
    public static void showDialog(String msg, Exception exc) {
        PlatformUI.getWorkbench().getDisplay().syncExec(new DiagramRunnable(msg, exc));
    }

    /**
     * To write to the status line, you need to obtain the status line manager from a view
     * 
     * @return
     */
    private static IStatusLineManager getStatusLineManager() {
        try {
            IWorkbench wb = PlatformUI.getWorkbench();
            IWorkbenchWindow wbw = wb.getActiveWorkbenchWindow();
            IWorkbenchPage wbp = wbw.getActivePage();
            IViewReference[] views = wbp.getViewReferences();
            for (int i = 0; i < views.length; i++) {
                IViewPart view = views[i].getView(false);
                if (view.getViewSite().getId().equals(KevView.ID)) {
                    return view.getViewSite().getActionBars().getStatusLineManager();
                }
            }
        } catch (Exception e) {/* nothing */
        }
        return null;
    }

    static IStatusLineManager statusLineManager;

    public static void setStatusLine(String message) {
        final String msg = message;
        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
            public void run() {
                if (statusLineManager == null) {
                    statusLineManager = getStatusLineManager();
                }
                if (statusLineManager != null) {
                    statusLineManager.setMessage(msg);
                    // System.out.println("Message: "+msg);
                }

            }
        });
    }

    /**
     * Tries to parse the given String to a Java DataType. It first tries to parse it to a Boolean,
     * then to an Integer and then to a Double. If all fails, it will return the String itself.
     * 
     * @param item
     * @return
     */
    public static Object parseStringToDatatype(String item) {
        Object dataObject = item;
        try {
            if (item.equalsIgnoreCase("true") || item.equalsIgnoreCase("false")) {
                dataObject = Boolean.valueOf(item);
            } else {
                throw new NumberFormatException(item + " is no boolean!");
            }
        } catch (Exception e1) {
            try {
                dataObject = Integer.valueOf(item);
            } catch (Exception e2) {
                try {
                    dataObject = Double.valueOf(item);
                } catch (Exception e3) {/* nothing */
                }
            }
        }
        return dataObject;
    }

    /**
     * for time measurement purposes Should be called at start of measuring
     */
    public static void tic() {
        time = System.currentTimeMillis();
    }

    /**
     * for time measuremant purposes
     * 
     * @return elapsed time since calling tic()
     */
    public static long tac() {
        return System.currentTimeMillis() - time;
    }

    /**
     * Takes a URI and exchanges the extension in the path segment with a new one.
     * 
     * @param uri
     * @param extension
     * @return
     * @throws URISyntaxException
     */
    public static URI exchangeExtension(URI uri, String extension) throws URISyntaxException {
        String path = uri.getPath();
        int index = path.lastIndexOf('.');
        String pathWithoutExtension = path.substring(0, index);
        String newPath = pathWithoutExtension + '.' + extension;
        // clone uri with adapted path segment
        URI newUri = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(),
                newPath, uri.getQuery(), uri.getFragment());
        return newUri;
    }

    /** Write a Throwable's StackTrace to a String */
    public static String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        t.printStackTrace(new PrintWriter(sw));
        return sw.toString();
    }

    public static void main(String[] args) {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setLayout(new GridLayout(1, false));

        String msg = "Message";
        Exception exc = new Exception("Message3");
        Exception exc2 = new Exception(getStackTrace(exc));
        Status s = new Status(IStatus.ERROR, "pluginId", "Message2", exc2);
        AbortErrorDialog.openError(msg, s, true);

        shell.pack();
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
    }
    /** generating the mapping for the railway example */

    // public static void main(String[] args) {
    // try {
    // DocumentBuilderFactory factory = DocumentBuilderFactory
    // .newInstance();
    // DocumentBuilder builder = factory.newDocumentBuilder();
    // Document mappingDoc = builder.newDocument();
    // Element mappingRoot = mappingDoc.createElement("mapping");
    // mappingRoot.setAttribute("xmlns",
    // "http://rtsys.informatik.uni-kiel.de/modelgui");
    // mappingRoot.setAttribute("xmlns:xsd",
    // "http://www.w3.org/2001/XMLSchema");
    // mappingDoc.appendChild(mappingRoot);
    //
    // JSVGCanvas canvas = new JSVGCanvas();
    // canvas.setDocumentState(JSVGComponent.ALWAYS_DYNAMIC);
    // canvas.setDoubleBufferedRendering(true);
    // URL svgURL = new
    // URL("file:///home/sja/workspaces/eclipse/svn/modelgui/examples/railway.svg");
    // System.out.println("File: " + svgURL);
    // canvas.setURI(svgURL.toString());
    // Thread.sleep(5000);
    // SVGDocument imageDoc = canvas.getSVGDocument();
    //
    // System.out.println(imageDoc);
    //
    // NodeList children = imageDoc.getChildNodes();
    // Node root = children.item(1);
    // children = root.getChildNodes();
    //
    // ArrayList childList = new ArrayList();
    // for (int i = 0; i < children.getLength(); i++) {
    // String type = children.item(i).getLocalName();
    //
    // if (type != null && type.equals("path")) {
    // childList.add(children.item(i));
    // SVGPathElement path = (SVGPathElement) children.item(i);
    // System.out.println("found: " + path.getId());
    // }
    // }
    // Object[] sortedChildren = childList.toArray();
    // Arrays.sort(sortedChildren, new Comparator<Object>() {
    // public int compare(Object a, Object b) {
    // return (((SVGPathElement) a).getId()
    // .compareTo(((SVGPathElement) b).getId()));
    // }
    //
    // public boolean equals(Object a, Object b) {
    // return (((SVGPathElement) a).getId()
    // .equals(((SVGPathElement) b).getId()));
    // }
    // });
    //
    // int counter = 0;
    // for (int i = 0; i < sortedChildren.length; i++) {
    // SVGPathElement path = (SVGPathElement) sortedChildren[i];
    // System.out.println(i);
    // System.out.println(path.getId());
    // String pathNameRegEx = "KH.*|OC.*|IC.*|KIO.*|IO.*|OI.*";
    // if (path.getId().matches(pathNameRegEx)) {
    // // System.out.println(path.getId());
    // /*SVGPathElement clonedPath = (SVGPathElement) path
    // .cloneNode(false);
    // root.insertBefore(clonedPath, path);
    //
    // clonedPath.setId("b_" + path.getId());
    // clonedPath.getStyle().setProperty("stroke", "#000000", "");
    // clonedPath.getStyle().setProperty("stroke-width", "12.0",
    // "");
    // */
    // int port = counter + 0 * 48;
    // Element display = mappingDoc.createElement("display");
    // display.setAttribute("port", "" + port);
    // mappingRoot.appendChild(display);
    // Element movePath = mappingDoc.createElement("move-path");
    // movePath.setAttribute("direction-angle", "90");
    // movePath.setAttribute("id", "engine");
    // movePath.setAttribute("input", "1..100");
    // movePath.setAttribute("path", path.getId());
    // display.appendChild(movePath);
    //
    // port = counter + 1 * 48;
    // Element displayMove2 = mappingDoc.createElement("display");
    // displayMove2.setAttribute("port", "" + port);
    // mappingRoot.appendChild(displayMove2);
    // Element movePath2 = mappingDoc.createElement("move-path");
    // movePath2.setAttribute("direction-angle", "90");
    // movePath2.setAttribute("id", "trailer");
    // movePath2.setAttribute("input", "1..100");
    // movePath2.setAttribute("path", path.getId());
    // displayMove2.appendChild(movePath2);
    //
    // port = counter + 2 * 48;
    // Element displayColor = mappingDoc.createElement("display");
    // displayColor.setAttribute("port", "" + port);
    // mappingRoot.appendChild(displayColor);
    // Element colorize = mappingDoc.createElement("colorize");
    // colorize.setAttribute("id", "b_" + path.getId());
    // colorize
    // .setAttribute(
    // "input",
    // "M_OFF__simulation, M_PRIMARY__simulation, M_SECONDARY__simulation, M_BRAKE__simulation");
    // colorize.setAttribute("color",
    // "#ffffff, #00ff00, #ff0000, #000000");
    // colorize.setAttribute("color-property", "stroke");
    // displayColor.appendChild(colorize);
    //
    // port = counter + 3 * 48;
    // Element displayText = mappingDoc.createElement("display");
    // displayText.setAttribute("port", "" + port);
    // mappingRoot.appendChild(displayText);
    // Element opaque = mappingDoc.createElement("opaque");
    // opaque.setAttribute("id", "t_" + path.getId());
    // opaque.setAttribute("input", "E_OK__simulation");
    // opaque.setAttribute("opacity", "0");
    // displayText.appendChild(opaque);
    // Element text = mappingDoc.createElement("textbox");
    // text.setAttribute("id", "t_" + path.getId());
    // displayText.appendChild(text);
    //
    // // points
    // if (counter <= 29) {
    // port = counter + 4 * 48;
    // Element displayPoint = mappingDoc
    // .createElement("display");
    // displayPoint.setAttribute("port", "" + port);
    // mappingRoot.appendChild(displayPoint);
    // Element opaque2 = mappingDoc.createElement("opaque");
    // opaque2.setAttribute("id", "point_straight_" + counter);
    // opaque2.setAttribute("input",
    // "P_STRAIGHT__simulation, P_TURN__simulation");
    // opaque2.setAttribute("opacity", "1, 0.3");
    // displayPoint.appendChild(opaque2);
    // Element opaque3 = mappingDoc.createElement("opaque");
    // opaque3.setAttribute("id", "point_turn_" + counter);
    // opaque3.setAttribute("input",
    // "P_STRAIGHT__simulation, P_TURN__simulation");
    // opaque3.setAttribute("opacity", "0.3, 1");
    // displayPoint.appendChild(opaque3);
    //
    // port = counter + 5 * 48;
    // Element displayText2 = mappingDoc
    // .createElement("display");
    // displayText2.setAttribute("port", "" + port);
    // mappingRoot.appendChild(displayText2);
    // Element text2 = mappingDoc.createElement("textbox");
    // text2.setAttribute("id", "t_point_" + counter);
    // displayText2.appendChild(text2);
    // Element opaque4 = mappingDoc.createElement("opaque");
    // opaque4.setAttribute("id", "t_point_" + counter);
    // opaque4.setAttribute("input", "E_OK__simulation");
    // opaque4.setAttribute("opacity", "0");
    // displayText2.appendChild(opaque4);
    // }
    //
    // counter++;
    // }
    // }
    //
    // // write SVG
    // // ================================================================
    // // OutputFormat format = new OutputFormat(imageDoc);
    // // String file = "/home/haf/shared/modelgui/trunk/examples/railway-new2.svg";
    // // OutputStream os = new FileOutputStream(file);
    // // XMLSerializer serializer = new XMLSerializer(os,format);
    // // serializer.serialize(imageDoc);
    // // write mapping
    // // ================================================================
    // OutputFormat format2 = new OutputFormat();
    // format2.setEncoding("UTF-8");
    // format2.setIndent(2);
    // format2.setIndenting(true);
    // String file2 = "/home/sja/workspaces/eclipse/svn/modelgui/examples/railway-new2.map";
    // OutputStream os2 = new FileOutputStream(file2);
    // XMLSerializer serializer2 = new XMLSerializer(os2, format2);
    // serializer2.serialize(mappingDoc);
    //
    // System.out.println("finished.");
    //
    // }
    // catch (Exception e) {
    // e.printStackTrace();
    // }
    // }

}

/**
 * A simple runnable that will display an Error dialog with a message and the stack-trace of the
 * Exception in a details pane. This can be called by the current Display thread. Necessary because
 * of SWT's multithreading principles.
 * 
 * e.g. call: PlatformUI.getWorkbench().getDisplay().syncExec(new DiagramRunnable(msg,exc));
 * 
 * @author haf
 * 
 */
class DiagramRunnable implements Runnable {
    String msg;
    Exception exc;

    DiagramRunnable(String msg, Exception exc) {
        this.msg = msg;
        if (this.msg == null) {
            this.msg = "An Exception was thrown.";
        }
        this.exc = exc;
        if (this.exc == null) {
            this.exc = new Exception("not specified");
        }
    }

    public void run() {
        Exception alibiException = new Exception(Tools.getStackTrace(exc));
        Status s = new Status(IStatus.ERROR, Activator.PLUGIN_ID, exc.getMessage(), alibiException);
        // ErrorDialog.openError(null,"Error",msg,s);
        AbortErrorDialog.openError(msg, s, true);
    }
}
