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
 package de.cau.cs.kieler.sccharts.verification.processor

import com.google.common.io.CharStreams
import java.io.InputStreamReader
import java.util.concurrent.TimeUnit
import java.util.function.Function

/**
 * @author aas
 */
class ProcessExtensions {
    
    public static def String execute(ProcessBuilder processBuilder, Function<Void, Boolean> processCanceled) {
        var String processOutput = null
        try {
            val proc = processBuilder.start()
            var boolean finished = false
            var boolean canceled = false
            while(!canceled && !finished && proc.isAlive) {
                canceled = processCanceled.apply(null)
                finished = proc.waitFor(500, TimeUnit.MILLISECONDS)
            }
            if(canceled) {
                proc.destroyForcibly
            } else {
                processOutput = proc.readInputStream
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return processOutput
    }
    
    public static def String readInputStream(Process process) {
        var String streamOutput = null
        var InputStreamReader inStreamReader
        try {
            inStreamReader = new InputStreamReader(process.getInputStream())
            streamOutput = CharStreams.toString(inStreamReader)
        } finally {
            if(inStreamReader !== null) {
                inStreamReader.close()
            }
        }
        return streamOutput
    }
}
