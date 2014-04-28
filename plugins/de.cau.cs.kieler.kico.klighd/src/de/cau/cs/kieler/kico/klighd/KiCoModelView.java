/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd;

import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * Singleton instance to control displayed content in diagram view part
 * 
 * @author als
 * 
 */
public class KiCoModelView {

    // -- SINGLETON --

    /**
     * Returns singleton instance of KiCoModelView.
     * 
     * @return KiCoModelView instance
     */
    public static KiCoModelView getInstance() {
        if (instance == null) {
            instance = new KiCoModelView();
        }
        return instance;
    }

    /** The instance **/
    private static KiCoModelView instance;
    /** Diagram View Manager **/
    private static DiagramViewManager viewManager = DiagramViewManager.getInstance();
    /** Viewer ID **/
    private static final String viewID = "de.cau.cs.kieler.kico.klighd";

    /**
     * Create an instance
     */
    private KiCoModelView() {
    }

    // -- Interface --

    /**
     * Displays a single model as diagram in model viewer.
     * 
     * @param model
     * @param viewerName
     *            title of viewer
     */
    public void showModel(Object model, String viewerName) {
        if (viewerName == null) {
            viewerName = "";
        }
        viewManager.createView(viewID, viewerName, model, KlighdSynthesisProperties.newInstance());
    }

    /**
     * Displays multiple models as diagrams in model viewer.
     * 
     * @param models
     *            List of models to display
     * @param viewerName
     *            title of viewer
     */
    public void showModels(List<Object> models, String viewerName) {
        List<KiCoModelWrapper> wrappedModels = new LinkedList<KiCoModelWrapper>();
        for (Object model : models) {
            wrappedModels.add(new KiCoModelWrapper(model));
        }
        showWrappedModels(wrappedModels, viewerName);
    }

    /**
     * Displays multiple models wrapped with additional display information as diagrams in model
     * viewer.
     * 
     * @param models
     *            List of models to display wrapped with additional display information
     * @param viewerName
     *            title of viewer
     */
    public void showWrappedModels(List<KiCoModelWrapper> models, String viewerName) {
        KiCoModelChain chain = new KiCoModelChain();
        chain.models = models;

        showModel(chain, viewerName);
    }
}
