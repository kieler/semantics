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


package de.cau.cs.kieler.sccharts.tscharts.ktm.extensions

import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.ktm.transformationtree.Model


/**
 * Extensions for the KTM dedicated to the providing of timing information for sccharts.
 * 
 * @autor ima
 * @kieler.design
 * @kieler.rating
 */
class TSCChartsKTMExtension {
    
    /* Finds the corresponding components for this state in the S Model via KTM and annotates them with 
     * a time Domain annotation that holds the String string. Method annotates the corresponding edges 
     * as well, if they are not already annotated
     */
    def setTimingDomainForSElements(State state, String string, Model model){
        
    }
    
   }