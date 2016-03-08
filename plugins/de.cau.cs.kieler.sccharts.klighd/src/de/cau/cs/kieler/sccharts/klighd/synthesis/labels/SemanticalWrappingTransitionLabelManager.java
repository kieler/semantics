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
package de.cau.cs.kieler.sccharts.klighd.synthesis.labels;

import org.eclipse.swt.graphics.FontData;

import com.google.common.base.Strings;

import de.cau.cs.kieler.core.kgraph.KLabel;
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData;
import de.cau.cs.kieler.klighd.labels.AbstractKlighdLabelManager;
import de.cau.cs.kieler.klighd.labels.LabelManagementUtil;
import de.cau.cs.kieler.klighd.labels.SoftWrappingLabelManager;
import de.cau.cs.kieler.klighd.microlayout.PlacementUtil;
import de.cau.cs.kieler.sccharts.klighd.SCChartsDiagramProperties;

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
    public String resizeLabel(KLabel label, double targetWidth) {
        // Check if we have explicit trigger / effect information to work with
        KLayoutData layoutData = label.getData(KLayoutData.class);
        if (layoutData.getProperty(SCChartsDiagramProperties.TRANSITION_TRIGGER) != null) {
        	// We actually know about triggers and effects, so use those information
        	return resizeLabel(label,
        			layoutData.getProperty(SCChartsDiagramProperties.TRANSITION_PRIORITY),
        			layoutData.getProperty(SCChartsDiagramProperties.TRANSITION_TRIGGER),
        			layoutData.getProperty(SCChartsDiagramProperties.TRANSITION_EFFECT),
        			targetWidth);
        } else {
        	// We only have the label to work with, so let's just split at the first / sign we find,
        	// even though that might just be the division operator
        	int indexOfTriggerEffectSplitCharacterThingy = label.getText().indexOf('/');
        	if (indexOfTriggerEffectSplitCharacterThingy == -1) {
        		return resizeLabel(label, null, label.getText(), "", targetWidth);
        	} else {
        		return resizeLabel(label,
        				null,
        				label.getText().substring(0, indexOfTriggerEffectSplitCharacterThingy).trim(),
        				label.getText().substring(indexOfTriggerEffectSplitCharacterThingy + 1).trim(),
        				targetWidth);
        	}
        }
    }
    
    private String resizeLabel(KLabel label, String priority, String trigger, String effect,
    		double targetWidth) {
    	
        SoftWrappingLabelManager softWrappingLabelManager = new SoftWrappingLabelManager();
        softWrappingLabelManager.fixTargetWidth(targetWidth);
        
        final FontData font = PlacementUtil.fontDataFor(label);
        String[] words = label.getText().split(" ");
        double biggestWordSize = LabelManagementUtil.getWidthOfBiggestWord(font, words);
        biggestWordSize = Math.max(biggestWordSize, targetWidth / 2.0);
        
        String result = null;
        String prefix = priority != null ? priority + ": " : "";
    	
    	if (Strings.isNullOrEmpty(effect)) {
    		label.setText(trigger.trim());
    		result = prefix + softWrappingLabelManager.resizeLabel(label, targetWidth);
    	} else {
            label.setText(trigger.trim());
            String firstHalf = softWrappingLabelManager.resizeLabel(label, biggestWordSize);

            // Shorten effect
            label.setText(effect.trim());
            String secondHalf = softWrappingLabelManager.resizeLabel(label, biggestWordSize);
            
            result = prefix + firstHalf + " /\n" + secondHalf;
    	}
    	
    	return result;
    }

}
