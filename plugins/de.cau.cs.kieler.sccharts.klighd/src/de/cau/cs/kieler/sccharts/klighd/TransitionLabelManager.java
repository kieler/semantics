/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd;

import de.cau.cs.kieler.core.kgraph.KLabel;
import de.cau.cs.kieler.klighd.labels.AbstractKlighdLabelManager;

/**
 * Modifies the size of labels by truncating them once the target width is reached. This label
 * manager knows that transition labels can consist of two parts: the trigger and the action. Both
 * are taken into consideration when shortening the label.
 * 
 * @author cds
 */
public final class TransitionLabelManager extends AbstractKlighdLabelManager {

    /**
     * {@link AbstractKlighdLabelManager} to handle the trigger of the transition
     */
    private final AbstractKlighdLabelManager labelManagerTrigger;

    /**
     * {@link AbstractKlighdLabelManager} to handle the effect of the transition
     */
    private final AbstractKlighdLabelManager labelManagerEffect;

    /**
     * Create a new instance that is either switched on or off initially. If it is switched off, the
     * user will need to explicitly switch it on.
     * 
     * @param initiallyActive
     *            whether the label size modifier is switched on or not.
     * @param labelManager
     *            {@link AbstractKlighdLabelManager} to shorten label of the transition
     */
    public TransitionLabelManager(final AbstractKlighdLabelManager labelManager) {
        this.labelManagerTrigger = labelManager;
        this.labelManagerEffect = labelManager;

    }

    /**
     * Create a new instance that is either switched on or off initially. If it is switched off, the
     * user will need to explicitly switch it on.
     * 
     * @param initiallyActive
     *            whether the label size modifier is switched on or not.
     * @param labelManagerTrigger
     *            {@link AbstractKlighdLabelManager} to shorten label of the trigger
     * 
     * @param labelManagerEffect
     *            {@link AbstractKlighdLabelManager} to shorten label of the effect
     */
    public TransitionLabelManager(final AbstractKlighdLabelManager labelManagerTrigger,
            final AbstractKlighdLabelManager labelManagerEffect) {
        this.labelManagerTrigger = labelManagerTrigger;
        this.labelManagerEffect = labelManagerEffect;
    }

    // ////////////////////////////////////////////////////////////////////////////////////////
    // Label Size Modification

    /**
     * {@inheritDoc}
     */
    @Override
    public String resizeLabel(KLabel label, double targetWidth) {
        String[] triggerEffect = label.getText().split("/");
        String newText = label.getText();

        if (triggerEffect.length == 1) {
            // there is no Trigger or effect
            if (!label.getText().startsWith("/")) {
                newText = labelManagerTrigger.resizeLabel(label, targetWidth);
            } else {
                newText = labelManagerEffect.resizeLabel(label, targetWidth);
            }
        } else if (triggerEffect.length == 2) {
            // shorten trigger
            label.setText(triggerEffect[0]);
            String firstHalf = labelManagerTrigger.resizeLabel(label, targetWidth / 2.0);

            // shorten effect
            label.setText(triggerEffect[1]);
            String secondHalf = labelManagerEffect.resizeLabel(label, targetWidth / 2.0);
            newText = firstHalf + " / " + secondHalf;
        }
        return newText;
    }

}
