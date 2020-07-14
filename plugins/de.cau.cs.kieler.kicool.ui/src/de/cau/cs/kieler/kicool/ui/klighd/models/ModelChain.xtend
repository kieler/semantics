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
package de.cau.cs.kieler.kicool.ui.klighd.models

import de.cau.cs.kieler.kicool.kitt.tracing.Tracing
import de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingChain
import de.cau.cs.kieler.kicool.ui.klighd.syntheses.ModelChainSynthesis
import de.cau.cs.kieler.klighd.ide.model.MessageModel
import java.util.HashMap
import java.util.LinkedList

/** 
 * This is a Wrapper model for a list of models. Related to {@link ModelChainSynthesis}.
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 */
class ModelChain {
    /** 
     * The list (chain) of models. 
     */
    final LinkedList<Object> models = new LinkedList<Object>()
    /** 
     * The transition labels between models. 
     */
    final LinkedList<String> tranformations = new LinkedList<String>()
    /** 
     * A map of models in the chain and a flag indicating if this model is collapsed or not. 
     */
    final HashMap<Object, Boolean> collapse = new HashMap<Object, Boolean>()
    /** 
     * A flag indicating if this chain should be dispalyed in blank mode. Non blank mode will draw
     * container around each model.
     */
    boolean blankMode = true

    /** 
     * Creates a two elemental model chain from given models representing a blank side-by-side view
     * on both.
     * @param firstModelfirst model
     * @param secondModelsecond model
     */
    new(Object firstModel, Object secondModel) {
        if (firstModel === null) {
            models.add(new MessageModel("Missing Model"))
        } else {
            models.add(firstModel)
        }
        if (secondModel === null) {
            models.add(new MessageModel("Missing Model"))
        } else {
            models.add(secondModel)
        }
    }

    /** 
     * Creates a model chain from the given compilation result containing all intermediate models.
     * @param sourceModelthe source model
     * @param compilationResultthe compilation result
     * @param modelNamethe name of the source model
     * @param selectionthe selected transformations
     */
    new(Tracing tracing, String modelName, Object selection) {
        var TracingChain chain = tracing.getTracingChain()
        for (Object model : chain.getModels()) {
            if (chain.getInternalMappins().containsKey(model)) {
                tranformations.add(chain.getInternalMappins().get(model).getTitle())
            }
            var converted = model
            if (model instanceof String) {
                converted = new CodePlaceHolder(modelName, (model as String))
            } else if (model === null) {
                converted = new MessageModel("Missing Model")
            }
            models.add(converted)
            collapse.put(converted, false)
        }
        blankMode = false
    }

    /** 
     * Returns the selected model in this chain.
     * @return selected model
     */
    def Object getSelectedModel() {
        return models.getLast()
    }

    /** 
     * @return the models
     */
    def LinkedList<Object> getModels() {
        return models
    }

    /** 
     * @return the blankMode
     */
    def boolean isBlankMode() {
        return blankMode
    }

    /** 
     * @return the transformations
     */
    def LinkedList<String> getTranformations() {
        return tranformations
    }

    /** 
     * @return the collapse
     */
    def HashMap<Object, Boolean> getCollapse() {
        return collapse
    }
}
