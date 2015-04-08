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
import de.cau.cs.kieler.core.math.KVector;
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout;
import de.cau.cs.kieler.klighd.labels.AbstractKlighdLabelManager;
import de.cau.cs.kieler.klighd.microlayout.Bounds;
import de.cau.cs.kieler.klighd.microlayout.PlacementUtil;

/**
 * Modifies the size of labels by truncating them once the target width is reached. This label
 * manager knows that transition labels can consist of two parts: the trigger and the action. Both
 * are taken into consideration when shortening the label.
 * 
 * @author cds
 */
public final class TransitionLabelManager extends AbstractKlighdLabelManager {
    
    /** The string appended to a truncated label text. */
    private static final String ELLIPSES = "...";
    
    
    /**
     * Create a new instance that is either switched on or off initially. If it is switched off, the
     * user will need to explicitly switch it on.
     * 
     * @param initiallyActive whether the label size modifier is switched on or not.
     */
    public TransitionLabelManager(final boolean initiallyActive) {
        super(initiallyActive);
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////
    // Label Size Modification
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected KVector doResizeLabelToWidth(KLabel label, double targetWidth) {
        final KShapeLayout labelLayout = label.getData(KShapeLayout.class);
        
        if (labelLayout.getWidth() > targetWidth) {
            // Label exceeds target width, so shorten it
            return truncateTransitionLabel(label, targetWidth);
        } else {
            return null;
        }
    }
    
    /**
     * Truncates the given transition label.
     * 
     * @param label
     *            the transition label.
     * @param targetWidth
     *            the width the label shouldn't exceed.
     * @return the label's new size as estimated.
     */
    private KVector truncateTransitionLabel(final KLabel label, final double targetWidth) {
        // The label's font data
        final FontData font = PlacementUtil.fontDataFor(label);
        
        // Look for the '/' character that separates condition and action
        int separatorIndex = label.getText().indexOf('/');
        if (separatorIndex == -1) {
            label.setText(truncateOverlyWideLabel(label.getText(), font, targetWidth));
            
            Bounds newBounds = PlacementUtil.estimateTextSize(font, label.getText());
            return new KVector(newBounds.getWidth(), newBounds.getHeight());
        } else {
            // First, shorten the label's two parts
            String shortenedCondition = truncateOverlyWideLabel(
                    label.getText().substring(0, separatorIndex).trim(),
                    font,
                    targetWidth / 2.0);
            String shortenedAction = truncateOverlyWideLabel(
                    label.getText().substring(separatorIndex + 1).trim(),
                    font,
                    targetWidth / 2.0);
            
            // Apply shortened label
            label.setText(shortenedCondition + " / " + shortenedAction);

            Bounds newBounds = PlacementUtil.estimateTextSize(font, label.getText());
            return new KVector(newBounds.getWidth(), newBounds.getHeight());
        }
    }
    
    /**
     * Truncates the given text until it falls below the given target width when rendered with the given
     * font.
     * 
     * @param text
     *            the text to truncate.
     * @param targetWidth
     *            the width the label shouldn't exceed.
     * @return the new text.
     */
    private String truncateOverlyWideLabel(final String text, final FontData fontData,
            final double targetWidth) {
        
        // Our current index inside the label's text
        int currentIndex = 0;
        // The character at the current position
        char currentChar;
        // Index of the last non-whitespace character
        int lastNonWhitespaceCharacter = 0;
        // The new text
        String resultText = text;
        
        // The label's size from the beginning up to the character we're currently at
        Bounds currentSize = null;
        
        // Iterate over the characters until we find a newline character or until the width exceeds
        // the target width; after this loop, currentSize is the (possibly new) size of the label
        while (currentIndex < text.length()) {
            // Measure the length of the string from the beginning up to the current position
            currentSize = PlacementUtil.estimateTextSize(fontData, text.substring(0, currentIndex));
            
            // If we exceed the target width or find a newline character, truncate!
            currentChar = text.charAt(currentIndex);
            if (currentSize.getWidth() > targetWidth || currentChar == '\n') {
                resultText = text.substring(0, lastNonWhitespaceCharacter) + ELLIPSES;
                currentSize = PlacementUtil.estimateTextSize(fontData, resultText);
                break;
            }
            
            // If this is not a whitespace character, remember its position
            if (!Character.isWhitespace(currentChar)) {
                lastNonWhitespaceCharacter = currentIndex;
            }
            
            currentIndex++;
        }
        
        return resultText;
    }
    
}
