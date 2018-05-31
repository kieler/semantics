/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.deploy.processor

import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Processor
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.nio.charset.StandardCharsets
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.compilation.ProcessorType

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
abstract class AbstractDeploymentProcessor<I> extends Processor<I, CodeContainer> {
    
    static val charset = StandardCharsets.UTF_8
    val log = new ByteArrayOutputStream
    protected val logger = new PrintStream(log, true, charset.name())
    
    protected def saveLog(String logFileName) {
        val cc = new CodeContainer => [add(logFileName, new String(log.toByteArray, charset))]
        model = cc
        logger.close
        log.close
    }
    
    override getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }

}
