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

package de.cau.cs.kieler.sccharts.tsccharts

import de.cau.cs.kieler.sccharts.tscharts.ktm.extensions.TSCChartsKTMExtension
import de.cau.cs.kieler.sccharts.State

/**
 * This class provides an SCChart with WCRT information by annotating all regions with two values: The
 * WCRT for the region including and not including the depth (WCRT for child regions). Those timing 
 * informations are to be optionally displayed in the SCChart for the developer.
 * 
 * @author: ima
 * @kieler.design
 * @kieler.rating  
 */
class TimingAnnotationProvider {
    extension TSCChartsKTMExtension;
    
    def public doTimingAnnotations(State scchart){
        
    }
    
    
    
}