/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.internal;

import java.util.HashMap;
import java.util.LinkedList;

import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.IntermediateResult;
import de.cau.cs.kieler.kico.KielerCompilerSelection;
import de.cau.cs.kieler.kico.klighd.view.model.CodePlaceHolder;
import de.cau.cs.kieler.kico.klighd.view.model.MessageModel;

/**
 * This is a Wrapper model for a list of models. Related to {@link ModelChainSynthesis}.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class ModelChain {

    /** The list (chain) of models. */
    private final LinkedList<Object> models = new LinkedList<Object>();

    /** The transition labels between models. */
    private final LinkedList<String> tranformations = new LinkedList<String>();

    /** A map of models in the chain and a flag indicating if this model is collapsed or not. */
    private final HashMap<Object, Boolean> collapse = new HashMap<Object, Boolean>();

    /**
     * A flag indicating if this chain should be dispalyed in blank mode. Non blank mode will draw
     * container around each model.
     */
    private boolean blankMode = true;

    /**
     * Creates a two elemental model chain from given models representing a blank side-by-side view
     * on both.
     * 
     * @param firstModel
     *            first model
     * @param secondModel
     *            second model
     */
    public ModelChain(final Object firstModel, final Object secondModel) {
        if (firstModel == null) {
            models.add(new MessageModel("Missing Model"));
        } else {
            models.add(firstModel);
        }
        if (secondModel == null) {
            models.add(new MessageModel("Missing Model"));
        } else {
            models.add(secondModel);
        }
    }

    /**
     * Creates a model chain from the given compilation result containing all intermediate models.
     * 
     * @param sourceModel
     *            the source model
     * @param compilationResult
     *            the compilation result
     * @param modelName
     *            the name of the source model
     * @param selection
     *            the selected transformations
     */
    public ModelChain(final Object sourceModel, final CompilationResult compilationResult,
            final String modelName, final KielerCompilerSelection selection) {
        models.add(sourceModel);
        collapse.put(sourceModel, false);
        for (IntermediateResult ir : compilationResult.getTransformationIntermediateResults()) {
            Object model = ir.getResult();
            if (model instanceof String) {
                model = new CodePlaceHolder(modelName, (String) model);
            } else if (model == null) {
                model = new MessageModel("Missing Model");
            }
            if (!models.contains(model)) {
                tranformations.add(ir.getId());
                models.add(model);
                collapse.put(model, false); // true
            }
        }
        collapse.put(models.getLast(), false);
        blankMode = false;
    }

    /**
     * Returns the selected model in this chain.
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
     * @return the transformations
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
