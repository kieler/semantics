/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.diagram.custom;

import de.cau.cs.kieler.core.annotations.ui.properties.AnnotationsPropertySection;
import de.cau.cs.kieler.core.model.GmfEditingProvider;

/**
 * Property section for SyncCharts annotations.
 *
 * @author msp
 */
public class SyncchartsAnnotationsPropertySection extends AnnotationsPropertySection {

    /**
     * Creates a property section for SyncCharts annotations.
     */
    public SyncchartsAnnotationsPropertySection() {
        super(new GmfEditingProvider());
    }
    
}
