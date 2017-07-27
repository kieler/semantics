/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd.synthesis.labels;

import org.eclipse.elk.graph.ElkLabel;
import org.eclipse.swt.graphics.FontData;

import de.cau.cs.kieler.klighd.labels.AbstractKlighdLabelManager;
import de.cau.cs.kieler.klighd.labels.LabelManagementUtil;
import de.cau.cs.kieler.klighd.labels.SoftWrappingLabelManager;

/**
 * Semantically wraps transition labels, taking the trigger and effect part into account separately.
 * 
 * @author cds
 */
public final class SemanticalWrappingTransitionLabelManager extends AbstractKlighdLabelManager {

    /**
     * {@inheritDoc}
     */
    @Override
    public String resizeLabel(ElkLabel label, double targetWidth) {
        SoftWrappingLabelManager softWrappingLabelManager = new SoftWrappingLabelManager();
        softWrappingLabelManager.fixTargetWidth(targetWidth);
        
        String[] triggerEffect = label.getText().split("/");
        String[] words = label.getText().split(" ");

        final FontData font = LabelManagementUtil.fontDataFor(label);

        double biggestWordSize = LabelManagementUtil.getWidthOfBiggestWord(font, words);
        biggestWordSize = Math.max(biggestWordSize, targetWidth / 2.0);

        if (triggerEffect.length == 1) {
            return softWrappingLabelManager.resizeLabel(label, targetWidth);
        } else if (triggerEffect.length == 2) {
            // Shorten trigger
            label.setText(triggerEffect[0].trim());
            String firstHalf = softWrappingLabelManager.resizeLabel(label, biggestWordSize);

            // Shorten effect
            label.setText(triggerEffect[1].trim());
            String secondHalf = softWrappingLabelManager.resizeLabel(label, biggestWordSize);
            
            return firstHalf + " /\n" + secondHalf;
        }
        
        return null;
    }

}
