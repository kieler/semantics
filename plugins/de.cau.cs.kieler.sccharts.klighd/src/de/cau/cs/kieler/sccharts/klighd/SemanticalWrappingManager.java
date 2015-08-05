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
import de.cau.cs.kieler.klighd.labels.SoftWrappingLabelManager;

/**
 * Modifies the size of labels by truncating them once the target width is reached. This label
 * manager knows that transition labels can consist of two parts: the trigger and the action. Both
 * are taken into consideration when shortening the label.
 * 
 * @author cds
 */
public final class SemanticalWrappingManager extends AbstractKlighdLabelManager {

    public SemanticalWrappingManager(final boolean initiallyActive) {
        super(initiallyActive);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String resizeLabel(KLabel label, double targetWidth) {
        SoftWrappingLabelManager labelManager = new SoftWrappingLabelManager();
        String[] triggerEffect = label.getText().split("/");
        String newText = label.getText();

        if (triggerEffect.length == 1) {
            newText = labelManager.resizeLabel(label, targetWidth);

        } else if (triggerEffect.length == 2) {
            // shorten trigger
            label.setText(triggerEffect[0]);
            String firstHalf = labelManager.resizeLabel(label, targetWidth / 2.0);
            double size = labelManager.getBiggestWordSize();
            // shorten effect
            label.setText(triggerEffect[1]);
            String secondHalf = labelManager.resizeLabel(label, size);
            newText = firstHalf + " /\n" + secondHalf;
        }
        return newText;
    }

}
