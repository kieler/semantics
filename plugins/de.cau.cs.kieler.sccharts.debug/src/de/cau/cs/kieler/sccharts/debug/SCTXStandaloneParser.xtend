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
package de.cau.cs.kieler.sccharts.debug

import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.sccharts.SCCharts
import java.nio.charset.Charset
import de.cau.cs.kieler.sccharts.text.SCTXResource
import java.io.ByteArrayInputStream

/**
 * @author stu121235
 *
 */
class SCTXStandaloneParser {
    
    static val injector = SCTXStandaloneSetup.doSetup
    
    /**
     * Parses an SCChart from the given text with given encoding
     */
    static def SCCharts parseScope(String text, Charset encoding) {
        var res = injector.getInstance(SCTXResource)
        res.load(new ByteArrayInputStream(text.getBytes(encoding)), emptyMap)
        
        if (!res.contents.empty) {
            val scchart = res.contents.head
            if (scchart instanceof SCCharts) {
                return scchart
            }
        }
        return null
    }
    
}