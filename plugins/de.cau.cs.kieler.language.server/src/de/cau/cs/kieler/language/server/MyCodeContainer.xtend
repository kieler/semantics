/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import java.util.ArrayList

/**
 * A CodeContainer is a list of list of TextDocuments.
 * 
 * @author sdo
 * 
 */
class MyCodeContainer {
    
    @Accessors List<Pair<String, List<TextDocument>>> files = new ArrayList<Pair<String, List<TextDocument>>>
    
    def add(String id, List<TextDocument> list) {
        files.add(new Pair(id, list))
    }
    
    def get(String id) {
        //TODO
    }
    
}