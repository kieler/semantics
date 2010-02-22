/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by + Christian-Albrechts-University of Kiel + Department of Computer Science +
 * Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL). See the file
 * epl-v10.html for the license text.
 */

package de.cau.cs.kieler.kev.views;

import org.apache.batik.swing.JSVGCanvas;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.kev.Activator;
import de.cau.cs.kieler.kev.Messages;
import de.cau.cs.kieler.kev.actions.OpenWizardAction;
import de.cau.cs.kieler.kev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.kev.ui.OpenWizard;

/**
 * The KEV-view which holds the EclipseJSVGCanvas for SVG document manipulation.
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 * @kieler.rating 2010-02-17 proposed yellow
 */
public class KevView extends ViewPart {

    /** The value that identifies the OpenWizard button. */
    public static final int BUTTON_OPEN_WIZARD = 1;

    /** The value that identifies the Refresh button. */
    public static final int BUTTON_REFRESH = 2;
    
    /** The value that identifies the both buttons. */
    public static final int BUTTON_BOTH = 3;
    
    private Action openWizardAction = null;
    private Action refreshAction = null;

    private KevComposite svg = null;
    // private AnimationManager animationManager;

    /**
     * ID declares the name of the KEV-View.
     */
    public static final String ID = "de.cau.cs.kieler.kev.views.KevView";

    /**
     * The constructor.
     */
    public KevView() {
        Activator.setKevView(this);
    }

    /**
     * This is a callback that will allow us to create the viewer and initialize it.
     * 
     * @param parent
     *            the Composite. This method is called by Eclipse.
     */
    public void createPartControl(final Composite parent) {
        parent.setLayout(new FillLayout());

        svg = new KevComposite(parent, SWT.NONE, false);

        // animationManager = new AnimationManager(this);
        getViewSite().getPage().addSelectionListener(svg);
        // getViewSite().getPage().addSelectionListener(animationManager);
        // listen to the event that rendering was finished
        // svg.getSvgCanvas().addGVTTreeRendererListener(animationManager);

        parent.layout();
        makeActions();
        contributeToActionBars();

        // This UI-Thread was started after the Kev-View was successfully created!
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                // Load default image if available
                IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
                String defaultFile = preferenceStore.getString(OpenWizard.DEFAULT_IMAGE);
                boolean load = preferenceStore.getBoolean(OpenWizard.LOAD_STARTUP);
                if ((defaultFile != null) && (!defaultFile.trim().equals("")) && load
                        && Activator.getKevView().getComposite().getSVGURI() == null) {
                    if (!defaultFile.contains("/")) { // It must be an bundleentry
                        MapAnimations.getInstance().initializeMappingFile(defaultFile, true);
                    } else {
                        MapAnimations.getInstance().initializeMappingFile(defaultFile, false);
                    }
                    //MapAnimations.getInstance().createHashMap();
                }
            }
        });

    }

    private void contributeToActionBars() {
        IActionBars bars = getViewSite().getActionBars();
        fillLocalPullDown(bars.getMenuManager());
        fillLocalToolBar(bars.getToolBarManager());
    }

    private void fillLocalPullDown(final IMenuManager manager) {
        manager.add(openWizardAction);
        manager.add(refreshAction);
    }

    private void fillLocalToolBar(final IToolBarManager manager) {
        manager.add(openWizardAction);
        manager.add(refreshAction);
    }

    private void makeActions() {
        refreshAction = new Action() {
            public void run() {
                //svg.paintSVGFile();
                System.out.println(MapAnimations.getInstance().getMappingFilePath());
                if (MapAnimations.getInstance().getMappingFilePath().contains(":/")) {
                    MapAnimations.getInstance().initializeMappingFile(MapAnimations.getInstance().getMappingFilePath(), false);                    
                } else {
                    MapAnimations.getInstance().initializeMappingFile(MapAnimations.getInstance().getMappingFilePath(), true);
                }
                MapAnimations.getInstance().createHashMap();
            }
        };
        refreshAction.setText(Messages.ActionRefresh);
        refreshAction.setToolTipText(Messages.ActionHintRefresh);
        refreshAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(
                "icons/view/refresh.gif"));

        openWizardAction = new OpenWizardAction();
        // If the execution manager is running, disable the openWizardAction otherwise enable it
        if (Activator.isExecutionManagerRunning()) {
            disableButton(BUTTON_BOTH);
        } else {
            enableButton(BUTTON_BOTH);
        }
        
    }

    /**
     * Enable the openWizardAction.
     * 
     * @param id
     *            indicates which button should be enabled
     */
    public void enableButton(final int id) {
        switch (id) {
        case BUTTON_OPEN_WIZARD:
            openWizardAction.setEnabled(true);
            break;
        case BUTTON_REFRESH:
            refreshAction.setEnabled(true);
            break;
        case BUTTON_BOTH:
            openWizardAction.setEnabled(true);
            refreshAction.setEnabled(true);
            break;
        }
    }

    /**
     * Disable the openWizardAction.
     * 
     * @param id
     *            indicates which button should be disabled
     */
    public void disableButton(final int id) {
        switch (id) {
        case BUTTON_OPEN_WIZARD:
            openWizardAction.setEnabled(false);
            break;
        case BUTTON_REFRESH:
            refreshAction.setEnabled(false);
            break;
        case BUTTON_BOTH:
            openWizardAction.setEnabled(false);
            refreshAction.setEnabled(false);
            break;
        }
    }

    /**
     * Sets the focus to the KevComposite.
     */
    public void setFocus() {
        svg.setFocus();
    }

    /**
     * Does some code-wrapup before calling the super method.
     */
    public void dispose() {
        getViewSite().getPage().removeSelectionListener(svg);
        // Set the single KevView instance to null because the view gets closed
        Activator.setKevView(null);
        svg.dispose();
        super.dispose();
    }

    /**
     * Returns the current KEVComposite.
     * 
     * @see KevComposite
     * @return svg, the current KEVComposite object.
     */
    public KevComposite getComposite() {
        return svg;
    }

    /**
     * Returns the current EclipseJSVGCanvas. Better to call it directly from the static instance:
     * EclipseJSVGCanvas.getInstance()
     * 
     * @see EclipseJSVGCanvas
     * @return EclipseJSVGCanvas, the current EclipseJSVGCanvas.
     */
    public JSVGCanvas getSVGCanvas() {
        return svg.getSVGCanvas();
    }
}
