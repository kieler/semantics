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

import java.util.Arrays;
import java.util.List;

import org.eclipse.swt.graphics.FontData;

import de.cau.cs.kieler.core.kgraph.KLabel;
import de.cau.cs.kieler.klighd.labels.AbstractKlighdLabelManager;
import de.cau.cs.kieler.klighd.microlayout.PlacementUtil;

/**
 * Shorten every Signal a bit, instead cutting of the end
 * 
 * @author ybl
 *
 */
public class TruncateOnlySignalsLabelManager extends AbstractKlighdLabelManager {

    private final static String[] OPERATORS = { "<<", ">>", ">>>", "<=", ">=", "==", "!=", "&",
            "^", "|", "&&", "||", "?", "=", "+=", "-=", "*=", "/=", "%=", "&=", "^=", "|=", "<<=",
            ">>=", ">>>=", ";", "~", "!", "*", "/", "%", "+", "-", "<", ">" };

    /**
     * {@inheritDoc}
     */
    @Override
    public String resizeLabel(KLabel label, double targetWidth) {
        FontData fontData = PlacementUtil.fontDataFor(label);
        int numOperators = countOperatorsInLabel(label);
        targetWidth = targetWidth / (numOperators + 2);
        String result = "";
        String[] labelParts = label.getText().split(" ");
        List<String> operators = Arrays.asList(OPERATORS);
        String nextToShorten="";
        for (String labelPart : labelParts) {
            if (!operators.contains(labelPart)) {
                nextToShorten+=labelPart+" ";
            }else{
                result+=findFittingString(nextToShorten, fontData, targetWidth)+"... ";
                result+=labelPart+" ";
                nextToShorten="";
            }
        }
        result+=findFittingString(nextToShorten, fontData, targetWidth)+"... ";
        return result;
    }

    private int countOperatorsInLabel(final KLabel label) {
        List<String> operators = Arrays.asList(OPERATORS);
        String[] labelParts = label.getText().split(" ");
        int cnt = 0;
        for (String labelPart : labelParts) {
            if (operators.contains(labelPart)) {
                cnt++;
            }
        }
        return cnt;
    }
}
