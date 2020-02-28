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
package de.cau.cs.kieler.kicool.processors

import de.cau.cs.kieler.kexpressions.kext.KExtStandaloneParser
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.compilation.internal.EnvironmentPropertyHolder

/**
 * Parses a json configuration file and stores the data in the environment.
 * 
 * @author als
 */
class EnvironmentConfigurationReader extends Processor<CodeContainer, CodeContainer> {
    
    override getId() {
        "de.cau.cs.kieler.kicool.processors.json.env.reader"
    }
    
    override getName() {
        "JSON Config Reader"
    }
    
    override getType() {
        ProcessorType.ANALYZER
    }
    
    override process() {
        val configs = model.files.filter[fileName.endsWith("json")]
        for (config : configs) {
            val json = KExtStandaloneParser.parseJsonObject(config.code)
            if (json !== null) {
                EnvironmentPropertyHolder.processEnvironmentConfig(environment, json)
            } else {
                environment.errors.add("No valid JSON object in configuration file " + config.fileName)
            }
        }
    }
    
}
