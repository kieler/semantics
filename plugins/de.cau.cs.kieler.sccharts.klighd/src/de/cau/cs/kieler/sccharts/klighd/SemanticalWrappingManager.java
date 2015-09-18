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

import org.eclipse.swt.graphics.FontData;

import de.cau.cs.kieler.core.kgraph.KLabel;
import de.cau.cs.kieler.klighd.labels.AbstractKlighdLabelManager;
import de.cau.cs.kieler.klighd.labels.SoftWrappingLabelManager;
import de.cau.cs.kieler.klighd.microlayout.PlacementUtil;

/**
 * Modifies the size of labels by truncating them once the target width is reached. This label
 * manager knows that transition labels can consist of two parts: the trigger and the action. Both
 * are taken into consideration when shortening the label.
 * 
 * @author cds
 */
public final class SemanticalWrappingManager extends AbstractKlighdLabelManager {

    /**
     * {@inheritDoc}
     */
    @Override
    public String resizeLabel(KLabel label, double targetWidth) {
        SoftWrappingLabelManager softWrappingLabelManager = new SoftWrappingLabelManager();
        softWrappingLabelManager.setTargetWidth(targetWidth);
        String[] triggerEffect = label.getText().split("/");
        String[] words = label.getText().split(" ");
        String newText = label.getText();

        final FontData font = PlacementUtil.fontDataFor(label);

         double biggestWordSize = softWrappingLabelManager.getSizeOfBiggestWord(font,words);
         biggestWordSize=Math.max(biggestWordSize,targetWidth / 2.0);

        if (triggerEffect.length == 1) {
            newText = softWrappingLabelManager.resizeLabel(label, targetWidth);

        } else if (triggerEffect.length == 2) {
            
            // shorten trigger
            label.setText(triggerEffect[0].trim());
            String firstHalf = softWrappingLabelManager.resizeLabel(label, biggestWordSize);
            
            // shorten effect
            label.setText(triggerEffect[1].trim());
            String secondHalf = softWrappingLabelManager.resizeLabel(label, biggestWordSize);
            newText = firstHalf + " /\n" + secondHalf;
        }
        return newText;
    }

}
