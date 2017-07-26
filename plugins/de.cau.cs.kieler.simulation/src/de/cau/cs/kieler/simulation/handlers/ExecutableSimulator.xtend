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
package de.cau.cs.kieler.simulation.handlers

import com.google.common.io.Files
import com.google.common.util.concurrent.SimpleTimeLimiter
import com.google.common.util.concurrent.UncheckedTimeoutException
import de.cau.cs.kieler.prom.build.ConfigurableAttribute
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.Model
import java.io.BufferedReader
import java.io.File
import java.io.IOException
import java.io.InputStreamReader
import java.io.PrintStream
import java.util.concurrent.Callable
import java.util.concurrent.TimeUnit
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.Path
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Creates a new process by starting an executable and sends / receives variables of this process using JSON.
 * The executable should be a compiled model file and is taken as system under development. 
 * 
 * @author aas
 *
 */
class ExecutableSimulator extends DefaultSimulator {
    
    public val executablePath = new ConfigurableAttribute("executable", null, true)
    
    @Accessors
    private var IFile executableFile
    protected var String modelName
    
    private var Process process
    private var BufferedReader processReader
    private var PrintStream processWriter
    private val timeLimiter = new SimpleTimeLimiter()
    
    /**
     * Create new process and read it's first JSON object with variables to fill the data pool.
     */
    override initialize(DataPool pool) {
        val currentDir = "." + File.separator
        // Execute jar file or binary
        var ProcessBuilder pBuilder
        if(executable.name.endsWith(".jar")) {
            pBuilder = new ProcessBuilder(#["java", "-jar", currentDir+executable.name])
        } else {
            pBuilder = new ProcessBuilder(#[executable.location.toOSString])    
        }
        pBuilder.directory(new File(executable.location.removeLastSegments(1).toOSString))
        process = pBuilder.start()
        
        // Get reader and writer for process
        val isr = new InputStreamReader(process.inputStream)
        processReader = new BufferedReader(isr)
        processWriter = new PrintStream(process.outputStream)
        
        // Read json data
        var String line = waitForJSONOutput(processReader)
    
        modelName = getUniqueModelName(pool, Files.getNameWithoutExtension(executableFile.name))
        val model = Model.createFromJson(modelName, line)
        pool.addModel(model)
    }
    
    /**
     * Send the variables in the pool of this simulator's model via JSON.
     */
    override write(DataPool pool) {
        // Create json for this model from data pool
        val model = pool.models.findFirst[it.name == modelName]
        val jsonInput = model.toJson
        
        // Write data pool to process
        processWriter.print(jsonInput)
        processWriter.print("\n")
        processWriter.flush()
        
        // Read data pool from process
        // Let the process perform tick and wait for output
        val line = waitForJSONOutput(processReader)
        val newModel = Model.createFromJson(modelName, line)
        pool.removeModel(model)
        pool.addModel(newModel)        
    }
    
    /**
     * Terminate the process.
     */
    override stop() {
        if(process != null) {
            process.destroy()
            process = null
        }
    }
    
    override getName() {
        return "sim"
    }
    
    /**
     * Reads stdout of the process and until a JSON object is returned.
     * Reading stdout is done with a time limit in case the process does not respond.
     */
    private def String waitForJSONOutput(BufferedReader br) {
        // Wait until output has been generated
        var String line
        do {
            // Call readLine with a timeout of 1 second
            val callable = new Callable<String>(){ 
                override call() throws Exception {
                    br.readLine
                }
            }
            try {
                line = timeLimiter.callWithTimeout(callable, 1, TimeUnit.SECONDS, true)
            } catch(UncheckedTimeoutException e) {
                // If the process is null, the simulation was stopped already
                if(process != null) {
                    stop();
                    throw new IOException("Process of simulation '" + executable.name + "' is not responding", e)    
                }
            }
            
            Thread.sleep(1);
        } while(line == null || !line.startsWith("{") || !line.endsWith("}"))
        
        return line
    }
    
    private def IFile getExecutable() {
        if(executableFile == null) {
            if(executablePath.stringValue.isNullOrEmpty) {
                throw new Exception("Executable of simulator cannot be null")
            }
            val path = new Path(executablePath.stringValue)
            executableFile = getFile(path)
        }
        return executableFile
    }
    
    /**
     * {@inheritDoc}
     */
    override String toString() {
        if(modelName.isNullOrEmpty) {
            return "Simulator '"+executablePath.stringValue+"'"
        } else {
            return "Simulator '"+modelName+"'"
        }
    }
}