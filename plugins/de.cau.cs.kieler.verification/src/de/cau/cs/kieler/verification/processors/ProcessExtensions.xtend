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
import java.util.Locale

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
            proc.kill
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
            proc.kill
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
    
    /**
     * Kills the given process.
     */
    public static def void kill(Process process) {
        // Process.destroyForcibly does not kill child processes (at least on Linux).
        // For instance when using "/usr/bin/time OTHERCOMMAND",
        // the time command gets killen but OTHERCOMMAND remains.
        // Therefore we issue a system command of the 
        try {
            // Check if on unix taken from StackOverflow
            // https://stackoverflow.com/questions/228477/how-do-i-programmatically-determine-operating-system-in-java
            val osName = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH)
            val isUnix = osName.indexOf("nux") >= 0
            if(isUnix) {
                val pid = process.getPID
                // Kill process and child on unix taken from StackOverflow
                // https://stackoverflow.com/questions/392022/whats-the-best-way-to-send-a-signal-to-all-members-of-a-process-group/33556110#33556110
                
                // Note that pkill -P does not kill child processes recursively, only the direct children
                Runtime.getRuntime.exec('''pkill -P «pid»'''.toString)
            } else {
                // Try the Java API to kill the process
                process.destroyForcibly
            }
        } catch(Exception e) {
            e.printStackTrace
            // Try the Java API to kill the process
            process.destroyForcibly
        }
    }
    
    public static def Integer getPID(Process process) {
        // PID is only available on linux / unix in the private class UNIXProcess in the private field pid.
        try {
            val pidField = process.getClass().getDeclaredField("pid");
            pidField.accessible = true
            val pid = pidField.get(process) as Integer    
            return pid
        } catch(Exception e) {
            e.printStackTrace
            return null
        }
    }
}
