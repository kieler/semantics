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

import java.util.List
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
     * Read from the inputStream (i.e. the output) of proc, until proc is finished OR until it is canceled. 
     * When finished or canceled, returns with the output that was read so far. 
     */
    public static def String readUntilFinishedOrCanceled(Process proc, Function<Void, Boolean> processCanceled){
    	var boolean finished = !proc.isAlive
        var boolean canceled = processCanceled.apply(null)
        val stringBuffer = new StringBuffer
        val inputStream = proc.inputStream
        
        while(!canceled && !finished && proc.isAlive) {
        	while(inputStream.available > 0) {
        		//We could also check here if the process was canceled - but that'd be terrible for performance
        		// It would, however, protect against locking up in the case 
        		// where proc never stops writing stuff to inputStream
	            val int b = inputStream.read
	            if(b != -1){
	            	stringBuffer.append( b as char )
	            }
	        }
            canceled = processCanceled.apply(null)
            finished = proc.waitFor(5, TimeUnit.MILLISECONDS)
        }
        if(canceled) {
            proc.kill
        }
        return stringBuffer.toString
    }
    
    /**
     * Kills the given process. On Linux / Unix also all child processes are killed.
     * This differs from destroyForcibly(), where child processes will remain as orphans
     * and further use system resources.
     */
    public static def void kill(Process process) {
        // TODO: check if killing the process is needed on windows and mac.
        
        // Process.destroyForcibly does not kill child processes (at least on Linux).
        // For instance when using "/usr/bin/time sleep 60",
        // the time command can be killed but sleep remains as an orphan.
        // Therefore we issue system commands to find all child processes and kill them manually.
        try {
            if(OsUtil.isLinux) {
                val pid = process.getPID
                val childrenPIDs = getChildrenPIDs(pid, true)
                for(childPID : childrenPIDs) {
                    Runtime.getRuntime.exec('''kill «childPID»'''.toString)    
                }            
            }
        } catch(Exception e) {
            e.printStackTrace
        }
        
        // Kill parent process
        process.destroyForcibly
    }
    
    /**
     * This is a linux / unix only command.
     * Return the PID of the process.
     * 
     * @return The process ID if it is an instance of UNIXProcess,
     *         or null if something went wrong.
     */
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
    
    /**
     * This is a linux / unix only command.
     * Returns a list of process IDs that are the child processes of the process with the given PID.
     * Further child process IDs are collected recusively when the corresponding parameter is true.
     * 
     * @return The list of process IDs, or null if something went wrong
     */
    private static def List<Integer> getChildrenPIDs(Integer parentPID, boolean recursive) {
        try {
            // Find child processes using pgrep command
            val pgrepProcess = Runtime.runtime.exec('''pgrep -P «parentPID»''')
            pgrepProcess.waitForTermination([return false])
            val pgrepOutput = pgrepProcess.readInputStream
            if(pgrepOutput.isNullOrEmpty) {
                return newArrayList
            } else {
                // Find further child processes recursively, or return findings
                val childPIDsAsStringList = pgrepOutput.split('''\n''')
                val directChildPIDs = childPIDsAsStringList.map[ Integer.valueOf(it) ]
                if(recursive && !directChildPIDs.isNullOrEmpty) {
                    val allChildPIDs = newArrayList
                    allChildPIDs.addAll(directChildPIDs)
                    for(childPID : directChildPIDs) {
                        allChildPIDs.addAll(getChildrenPIDs(childPID, true))
                    }
                    return allChildPIDs
                } else {
                    return directChildPIDs                
                }
            }
        } catch(Exception e) {
            e.printStackTrace
            return null
        }
    }
    
    /**
     * For manual testing of the kill implementation
     */
    private static class KillProcessTestMain { 
        public static def void main(String[] args) {
            val timeCommand = "/usr/bin/time"
            val sleepCommand = "sleep 60"
            val process = Runtime.getRuntime.exec('''«timeCommand» «timeCommand» «timeCommand» «sleepCommand»''')
            
            // Killing the process should destoy all time commands and the sleep command
            Thread.sleep(4000)
            
            // Process.destroy only kills this very process,
            // its children will remain as orphans and further use system resources.
//            process.destroyForcibly
            
            // ProcessExtensions.kill also kills all child processes (on linux / unix)
            // TODO: Try if this works on Mac
            process.kill
        }    
    }
}
