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
package de.cau.cs.kieler.kico.klighd.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.IntermediateResult;
import de.cau.cs.kieler.kico.ui.KiCoSelection;

/**
 * This is a Wrapper for a list of KiCoModelWrapper because KLighD does not support diagram
 * synthesis on Lists properly.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class KiCoModelChain {

    private final LinkedList<Object> models = new LinkedList<Object>();
    private final LinkedList<String> tranformations = new LinkedList<String>();
    private final HashMap<Object, Boolean> collapse = new HashMap<Object, Boolean>();
    private boolean blankMode = true;

    /**
     * Creates a one element model chain from given model. This is used to have a fall-back
     * synthesis for models without a own synthesis.
     * 
     * @param firstModel
     *            first model
     * @param secondModel
     *            second model
     */
    public KiCoModelChain(final Object model) {
        if (model == null) {
            models.add(new KiCoMessageModel("Missing Model"));
        } else {
            models.add(model);
        }
    }

    /**
     * Creates a two element model chain from given models representing a side-by-side model.
     * 
     * @param firstModel
     *            first model
     * @param secondModel
     *            second model
     */
    public KiCoModelChain(final Object firstModel, final Object secondModel) {
        if (firstModel == null) {
            models.add(new KiCoMessageModel("Missing Model"));
        } else {
            models.add(firstModel);
        }
        if (secondModel == null) {
            models.add(new KiCoMessageModel("Missing Model"));
        } else {
            models.add(secondModel);
        }
    }

    /**
     * Creates a model chain from the given compilation result containing all intermediate models.
     * 
     * @param compilationResult
     *            the compilation result
     * @param modelName
     *            the name of the source model
     * @param transformations
     *            the selected transformations
     */
    public KiCoModelChain(Object sourceModel, final CompilationResult compilationResult, final String modelName,
            KiCoSelection selection) {
        models.add(sourceModel);
        collapse.put(sourceModel, false);
        for (IntermediateResult ir : compilationResult.getTransformationIntermediateResults()) {
            Object model = ir.getResult();
            if (model instanceof String) {
                model = new KiCoCodePlaceHolder(modelName, (String) model);
            } else if(model == null) {
                model = new KiCoMessageModel("Missing Model");
            }
            if(!models.contains(model)) {
                tranformations.add(ir.getId());
                models.add(model);
                collapse.put(model, false);//true
            }
        }
        collapse.put(models.getLast(), false);
        blankMode = false;
    }

    /**
     * Returns the selected model in this chain
     * 
     * @return selected model
     */
    public Object getSelectedModel() {
        return models.getLast();
    }

    /**
     * @return the models
     */
    public LinkedList<Object> getModels() {
        return models;
    }

    /**
     * @return the blankMode
     */
    public boolean isBlankMode() {
        return blankMode;
    }

    /**
     * @return the tranformations
     */
    public LinkedList<String> getTranformations() {
        return tranformations;
    }

    /**
     * @return the collapse
     */
    public HashMap<Object, Boolean> getCollapse() {
        return collapse;
    }
}
