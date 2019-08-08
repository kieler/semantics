/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ide.language.server

import java.lang.Thread
import java.util.List

/**
 * @author sdo
 *
 */
class GetSystemsThread extends Thread {
    
    var protected volatile List<SystemDescription> systemDescriptions
    
    new(Runnable target) {
        super(null, target, "Get System Thread", 0);
        
    }
    
    
    
    
    
}