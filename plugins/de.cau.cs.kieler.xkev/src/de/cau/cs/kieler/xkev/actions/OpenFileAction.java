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

package de.cau.cs.kieler.xkev.actions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.Messages;
import de.cau.cs.kieler.xkev.helpers.Tools;
import de.cau.cs.kieler.xkev.views.EclipseJSVGCanvas;
import de.cau.cs.kieler.xkev.views.EnvironmentComposite;

/**
 * Implements the OpenFileDialog window.
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 * 
 */
public class OpenFileAction extends Action {

    /**
     * Constructs an OpenFile Dialog-Window.
     */
    public OpenFileAction() {
        this.setText(Messages.ActionOpenFile);
        this.setToolTipText(Messages.ActionHintOpenFile);
        this.setImageDescriptor(Activator.getDefault().getImageDescriptor("icons/view/open.gif"));
    }

    @Override
    public void run() {
        FileDialog dialog = new FileDialog(PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow().getShell());
        String[] extensions = {"*.svg", "*.mapping"};
        dialog.setFilterExtensions(extensions);
        dialog.open();
        String path = dialog.getFilterPath() + File.separator + dialog.getFileName();
        if (path != null && !path.trim().equals("") && !path.equals("/") && !path.equals("\\")) {
            try {
                File file = new File(path);
                URL url = file.toURI().toURL();
                EclipseJSVGCanvas.getInstance().loadSVGDocument(url.toExternalForm());
            } catch (MalformedURLException e) {
                Tools.showDialog("Invalid file: " + path, e);
            }
        }
        return;
    }
}
