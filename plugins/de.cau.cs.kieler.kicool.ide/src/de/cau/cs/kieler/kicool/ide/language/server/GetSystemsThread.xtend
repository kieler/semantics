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

/**
 * @author sdo
 *
 */
class GetSystemsThread extends Thread {
    
    new(Runnable target) {
        super(null, target, "Get System Thread", 0);
    }
}