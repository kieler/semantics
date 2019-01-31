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
 package de.cau.cs.kieler.verification.processors

import java.util.concurrent.TimeUnit
import java.util.function.Function

/**
 * @author aas
 */
class ProcessExtensions {
    
    public static def void waitForOutput(Process proc, Function<Void, Boolean> processCanceled) {
        var boolean finished = !proc.isAlive
        var boolean outputAvailable = (proc.inputStream.available > 0)
        var boolean done = (finished || outputAvailable)
        var boolean canceled = processCanceled.apply(null)
        while(!canceled && !done && proc.isAlive) {
            canceled = processCanceled.apply(null)
            finished = proc.waitFor(1, TimeUnit.MILLISECONDS)
            outputAvailable = (proc.inputStream.available > 0) 
            done = (finished || outputAvailable)
        }
        if(canceled) {
            proc.destroyForcibly
        }
    }
    
    public static def void waitForTermination(Process proc, Function<Void, Boolean> processCanceled) {
        var boolean finished = !proc.isAlive
        var boolean canceled = processCanceled.apply(null)
        while(!canceled && !finished && proc.isAlive) {
            canceled = processCanceled.apply(null)
            finished = proc.waitFor(500, TimeUnit.MILLISECONDS)
        }
        if(canceled) {
            proc.destroyForcibly
        }
    }
    
    public static def String readInputStream(Process process) {
        val stringBuffer = new StringBuffer
        val inputStream = process.inputStream
        while(inputStream.available > 0 ) {
            val b = inputStream.read
            stringBuffer.append( b as char )
        }
        return stringBuffer.toString
    }
}
