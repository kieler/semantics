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


import org.eclipse.elk.graph.ElkLabel;

import de.cau.cs.kieler.klighd.labels.AbstractKlighdLabelManager;

/**
 * Label manager that truncates all host code arguments and adds some dots to point this out.
 * 
 * @author ybl
 */
public class HostCodeTransitionLabelManager extends AbstractKlighdLabelManager {
    
    /** Three dots. THREE DOTS! */
    private static final String ELLIPSES = "...";

    
    /**
     * {@inheritDoc}
     */
    @Override
    public String resizeLabel(ElkLabel label, double targetWidth) {
        String text = label.getText();
        int bracketOpen = 0;
        int bracketClose = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char character = text.toCharArray()[i];

            if (character == '(') {
                bracketOpen = i;
            }

            if (character == ')') {
                bracketClose = i;
                
                if (bracketOpen + 1 != bracketClose) {
                    text = text.replace(text.substring(bracketOpen + 1, bracketClose), ELLIPSES);
                }
            }
        }

        return text;
    }

}
