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
package de.cau.cs.kieler.kicool.processors.metrics

import de.cau.cs.kieler.kicool.compilation.EndogenousProcessor
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.deploy.Logger

/**
 * @author ssm
 * @kieler.design 2020-01-30 proposed 
 * @kieler.rating 2020-01-30 proposed yellow 
 * 
 */
class LinesOfCode extends EndogenousProcessor<CodeContainer> {
    
    override getId() {
        "de.cau.cs.kieler.kicool.meters.linesOfCode"
    }
    
    override getName() {
        "LoC"
    }
    
    override process() {
        val codeContainer = getModel
        
        var logger = new Logger
        
        val count = codeContainer.files.map[ getCode.countLines ].reduce[ a, b | a + b ]
        
        logger.println("LoC: " + count)
        setProperty(Environment.CAPTION, "LoC: " + count)
        logger.saveLog(environment, "loc.log")
        
        val meterObjects = getProperty(MeterObject.METER_OBJECTS) => 
            [ it += new MeterObject("LoC", count, true) ]
        setProperty(MeterObject.METER_OBJECTS, meterObjects)
    }
    
    private def countLines(String s) {
        s.split("\\n").length
    }
    
}