/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kvis.ui.svg;

import java.util.Locale;

import org.apache.batik.bridge.ExternalResourceSecurity;
import org.apache.batik.bridge.NoLoadExternalResourceSecurity;
import org.apache.batik.bridge.NoLoadScriptSecurity;
import org.apache.batik.bridge.ScriptSecurity;
import org.apache.batik.swing.svg.SVGUserAgent;
import org.apache.batik.util.ParsedURL;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.w3c.dom.Element;

import de.cau.cs.kieler.kvis.ui.internal.KVisActivator;

/**
 * This class implements a SVG user agent.
 */
public class KVisUserAgent implements SVGUserAgent {

    private KVisCanvas canvas;
    
    public Shell getShell() {
        return canvas.getShell();
    }
    
    /**
     * Creates a new SVGUserAgent.
     */
    protected KVisUserAgent(KVisCanvas canvas) {
        this.canvas = canvas;
    }

    public String getDefaultFontFamily() {
        return "arial"; //$NON-NLS-1$
    }

    /**
     * Displays an error message.
     */
    public void displayError(String message) {
        final String fMessage = message;
        getShell().getDisplay().syncExec(new Runnable() {
            public void run() {
                Exception ex = new Exception(fMessage);
                ex.printStackTrace();
                Status status = new Status(Status.ERROR, KVisActivator.getInstance().getBundle()
                        .getSymbolicName(), Status.OK, fMessage, ex);
                ErrorDialog.openError(getShell(), "Error", fMessage, status);
            }
        });
    }

    /**
     * Displays an error resulting from the specified Exception.
     */
    public void displayError(Exception ex) {
        final Exception fex = ex;
        getShell().getDisplay().syncExec(new Runnable() {
            public void run() {
                String msg = fex.getMessage();
                if (msg == null) {
                    msg = "NO MESSAGE";
                }
                Status status = new Status(Status.ERROR, KVisActivator.getInstance().getBundle()
                        .getSymbolicName(), Status.OK, msg, fex);
                ErrorDialog.openError(getShell(), "Error", fex.getMessage(), status);
            }
        });
    }

    /**
     * Displays a message in the User Agent interface. The given message is typically displayed
     * in a status bar.
     */
    public void displayMessage(String message) {
        final String fMessage = message;
        getShell().getDisplay().syncExec(new Runnable() {
            public void run() {
                MessageDialog.openInformation(getShell(), "Message", fMessage);
            }
        });
    }

    /**
     * Shows an alert dialog box.
     */
    public void showAlert(String message) {
        final String fMessage = message;
        getShell().getDisplay().syncExec(new Runnable() {
            public void run() {
                KVisCanvas.log(fMessage);
                //MessageDialog.openWarning(shell, Messages.getString("SVGView.40"), fMessage); //$NON-NLS-1$
            }
        });
    }

    /**
     * Shows a prompt dialog box.
     */
    public String showPrompt(String message) {
        return canvas.getSVGCanvas().showPrompt(message);
    }

    /**
     * Shows a prompt dialog box.
     */
    public String showPrompt(String message, String defaultValue) {
        return canvas.getSVGCanvas().showPrompt(message, defaultValue);
    }

    /**
     * Shows a confirm dialog box.
     */
    public boolean showConfirm(String message) {
        return true;
    }

    /**
     * Returns the size of a px CSS unit in millimeters.
     */
    public float getPixelUnitToMillimeter() {
        return 0.26458333333333333333333333333333f; // 96dpi
    }

    /**
     * Returns the size of a px CSS unit in millimeters. This will be removed after next
     * release.
     * 
     * @see #getPixelUnitToMillimeter();
     */
    public float getPixelToMM() {
        return getPixelUnitToMillimeter();

    }

    /**
     * Returns the medium font size.
     */
    public float getMediumFontSize() {
        // 9pt (72pt == 1in)
        return 9f * 25.4f / (72f * getPixelUnitToMillimeter());
    }

    /**
     * Returns a lighter font-weight.
     */
    public float getLighterFontWeight(float f) {
        // Round f to nearest 100...
        int weight = ((int) ((f + 50) / 100)) * 100;
        switch (weight) {
        case 100:
            return 100;
        case 200:
            return 100;
        case 300:
            return 200;
        case 400:
            return 300;
        case 500:
            return 400;
        case 600:
            return 400;
        case 700:
            return 400;
        case 800:
            return 400;
        case 900:
            return 400;
        default:
            throw new IllegalArgumentException("Bad Font Weight " + f); //$NON-NLS-1$
        }
    }

    /**
     * Returns a bolder font-weight.
     */
    public float getBolderFontWeight(float f) {
        // Round f to nearest 100...
        int weight = ((int) ((f + 50) / 100)) * 100;
        switch (weight) {
        case 100:
            return 600;
        case 200:
            return 600;
        case 300:
            return 600;
        case 400:
            return 600;
        case 500:
            return 600;
        case 600:
            return 700;
        case 700:
            return 800;
        case 800:
            return 900;
        case 900:
            return 900;
        default:
            throw new IllegalArgumentException("Bad Font Weight " + f); //$NON-NLS-1$
        }
    }

    /**
     * Returns the language settings.
     */
    public String getLanguages() {
        return Locale.getDefault().getLanguage();
    }

    /**
     * Returns the user stylesheet uri.
     * 
     * @return null if no user style sheet was specified.
     */
    public String getUserStyleSheetURI() {
        return null;
    }

    /**
     * Returns the class name of the XML parser.
     */
    public String getXMLParserClassName() {
        return "org.apache.crimson.parser.XMLReaderImpl"; //$NON-NLS-1$
    }

    /**
     * Returns true if the XML parser must be in validation mode, false otherwise.
     */
    public boolean isXMLParserValidating() {
        return false;
    }

    /**
     * Returns this user agent's CSS media.
     */
    public String getMedia() {
        return "screen"; //$NON-NLS-1$
    }

    /**
     * Returns this user agent's alternate style-sheet title.
     */
    public String getAlternateStyleSheet() {
        return null;
    }

    /**
     * Opens a link.
     * 
     * @param uri
     *            The document URI.
     * @param newc
     *            Whether the link should be activated in a new component.
     */
    public void openLink(String uri, boolean newc) {
    }

    /**
     * Tells whether the given extension is supported by this user agent.
     */
    public boolean supportExtension(String s) {
        return false;
    }

    public void handleElement(Element elt, Object data) {
    }

    /**
     * Returns the security settings for the given script type, script url and document url
     * 
     * @param scriptType
     *            type of script, as found in the type attribute of the &lt;script&gt; element.
     * @param scriptURL
     *            url for the script, as defined in the script's xlink:href attribute. If that
     *            attribute was empty, then this parameter should be null
     * @param docURL
     *            url for the document into which the script was found.
     */
    public ScriptSecurity getScriptSecurity(String scriptType, ParsedURL scriptURL,
            ParsedURL docURL) {
        return new NoLoadScriptSecurity(scriptType);
    }

    /**
     * This method throws a SecurityException if the script of given type, found at url and
     * referenced from docURL should not be loaded.
     * 
     * This is a convenience method to call checkLoadScript on the ScriptSecurity strategy
     * returned by getScriptSecurity.
     * 
     * @param scriptType
     *            type of script, as found in the type attribute of the &lt;script&gt; element.
     * @param scriptURL
     *            url for the script, as defined in the script's xlink:href attribute. If that
     *            attribute was empty, then this parameter should be null
     * @param docURL
     *            url for the document into which the script was found.
     */
    public void checkLoadScript(String scriptType, ParsedURL scriptURL, ParsedURL docURL)
            throws SecurityException {
    }

    /**
     * Returns the security settings for the given resource url and document url
     * 
     * @param resourceURL
     *            url for the resource, as defined in the resource's xlink:href attribute. If
     *            that attribute was empty, then this parameter should be null
     * @param docURL
     *            url for the document into which the resource was found.
     */
    public ExternalResourceSecurity getExternalResourceSecurity(ParsedURL resourceURL,
            ParsedURL docURL) {
        return new NoLoadExternalResourceSecurity();
    }

    /**
     * This method throws a SecurityException if the resource found at url and referenced from
     * docURL should not be loaded.
     * 
     * This is a convenience method to call checkLoadExternalResource on the
     * ExternalResourceSecurity strategy returned by getExternalResourceSecurity.
     * 
     * @param scriptURL
     *            url for the script, as defined in the script's xlink:href attribute. If that
     *            attribute was empty, then this parameter should be null
     * @param docURL
     *            url for the document into which the script was found.
     */
    public void checkLoadExternalResource(ParsedURL resourceURL, ParsedURL docURL)
            throws SecurityException {
    }
}