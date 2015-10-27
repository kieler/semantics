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
package de.cau.cs.kieler.c.sccharts

import de.cau.cs.kieler.kico.features.Feature
import org.eclipse.emf.ecore.EObject

/**
 * @author ssm
 *
 */
class CFeature extends Feature {
    
    override getId() {
        CFeatures::C_ID
    }
    
    override isContained(EObject model) {
        return true;
    }    
    
}