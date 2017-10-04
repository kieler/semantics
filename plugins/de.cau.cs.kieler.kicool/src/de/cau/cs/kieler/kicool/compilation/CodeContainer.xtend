/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.compilation

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Map

/**
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
class CodeContainer {
    
    @Accessors Map<String, String> files = <String, String> newLinkedHashMap
    
    def add(String file, String code) {
        files.put(file, code)
    }
    
    def get(String file) {
        files.get(file)
    }
    
    def getHead() {
        files.get(files.keySet.head)
    }
    
}