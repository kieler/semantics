/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.scgdep.xtend

import de.cau.cs.kieler.scg.Link
import de.cau.cs.kieler.scgdep.Dependency

/**
 * SCGDEP Extensions.
 * 
 * @author cmot
 * @kieler.design 2013-08-20 proposed 
 * @kieler.rating 2013-08-20 proposed yellow
 */
class Extension { 

   // -------------------------------------------------------------------------
   
   def boolean isDepenedency (Link link) {
       link instanceof Dependency;
   }
   
   // -------------------------------------------------------------------------   
      
}
