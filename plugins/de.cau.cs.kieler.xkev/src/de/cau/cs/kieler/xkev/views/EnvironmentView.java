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

package de.cau.cs.kieler.xkev.views;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.batik.swing.JSVGCanvas;
import org.eclipse.jface.action.Action; //import org.eclipse.jface.action.ControlContribution;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.Messages;
import de.cau.cs.kieler.xkev.actions.OpenFileAction;
import de.cau.cs.kieler.xkev.actions.OpenImageWizardAction; //import de.cau.cs.kieler.xkev.animation.AnimationManager;
import de.cau.cs.kieler.xkev.ui.OpenImageWizard;
import de.cau.cs.kieler.xkev.helpers.Tools;

public class EnvironmentView extends ViewPart {

    private Action openWizardAction;
    private Action openAction;
    private Action refreshAction;

    private EnvironmentComposite svg;
    // private AnimationManager animationManager;

    /**
     * ID declares the name of the KEV-View. 
     */
    public static final String ID = "de.cau.cs.kieler.xkev.views.EnvironmentView";
    
    
    /**
     * The constructor.
     */
    public EnvironmentView() {

    }

    /**
     * This is a callback that will allow us to create the viewer and initialize it.
     */
    public void createPartControl(Composite parent) {
        parent.setLayout(new FillLayout());

        if (EnvironmentComposite.getInstance() == null) {
            while (!EnvironmentComposite.createSingleInstance(parent, SWT.NONE, false)) {
              //Do nothing until the single instance is successfully created
            }
        }
        //Get the single instance of the EclipseJSVGCanvas
        svg = EnvironmentComposite.getInstance();
        
        //svg = new EnvironmentComposite(parent, SWT.NONE, false);
        
         // animationManager = new AnimationManager(this);
        getViewSite().getPage().addSelectionListener(svg);
        // getViewSite().getPage().addSelectionListener(animationManager);
        // listen to the event that rendering was finished
        // svg.getSvgCanvas().addGVTTreeRendererListener(animationManager);

        parent.layout();
        makeActions();
        contributeToActionBars();

        // load default image if available
        IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
        String defaultFile = preferenceStore.getString(OpenImageWizard.DEFAULT_IMAGE);
        boolean load = preferenceStore.getBoolean(OpenImageWizard.LOAD_STARTUP);
        if ((defaultFile != null) && (!defaultFile.trim().equals("")) && load) {
            try {
                svg.setSVGFile(new URL(defaultFile));
            } catch (MalformedURLException e) {
                Tools.showDialog("Could not load default image file: ", e);
            }
        }
    }

    private void contributeToActionBars() {
        IActionBars bars = getViewSite().getActionBars();
        fillLocalPullDown(bars.getMenuManager());
        fillLocalToolBar(bars.getToolBarManager());
    }

    private void fillLocalPullDown(IMenuManager manager) {
        manager.add(openWizardAction);
        manager.add(openAction);
        manager.add(refreshAction);
    }

    private void fillLocalToolBar(IToolBarManager manager) {
        manager.add(openWizardAction);
        manager.add(openAction);
        manager.add(refreshAction);
    }

    private void makeActions() {
        refreshAction = new Action() {
            public void run() {
                svg.paintSVGFile();
            }
        };
        refreshAction.setText(Messages.ActionRefresh);
        refreshAction.setToolTipText(Messages.ActionHintRefresh);
        refreshAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(
                "icons/view/refresh.gif"));

        openWizardAction = new OpenImageWizardAction();
        openAction = new OpenFileAction();

        // printAction = new PrintAction(svg);
        // printAction.setImageDescriptor(BatikUIPlugin.getDefault().getImageDescriptor(BatikUIPlugin.IMG_PRINT));
    }

    public void setFocus() {
        svg.setFocus();
    }

    public void dispose() {
        getViewSite().getPage().removeSelectionListener(svg);
        svg.dispose();
        super.dispose();
    }

    public EnvironmentComposite getComposite() {
        return svg;
    }

    public JSVGCanvas getSVGCanvas() {
        return svg.getSVGCanvas();
    }
}