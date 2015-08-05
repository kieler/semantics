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

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.kgraph.KLabel;
import de.cau.cs.kieler.klighd.labels.AbstractKlighdLabelManager;

/**
 * @author ybl
 *
 */
public class TruncateHostCodeArguments extends AbstractKlighdLabelManager {

    public TruncateHostCodeArguments(final boolean initiallyActive) {
        super(initiallyActive);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String resizeLabel(KLabel label, double targetWidth) {

//        if(getListener() != null){
//            Iterator<EObject> selectedObjects=getListener().getObjectsSelected();
//
//            List<EObject> myList = Lists.newArrayList(selectedObjects);
//            System.out.println(label.getText()+" "+myList.contains(label));
//           
//        }
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
                text = text.replace(text.substring(bracketOpen + 1, bracketClose), "...");
            }
        }

        return text;
    }

}
