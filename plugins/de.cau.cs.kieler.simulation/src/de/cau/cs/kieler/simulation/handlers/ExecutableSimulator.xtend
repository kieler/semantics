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
package de.cau.cs.kieler.simulation.handlers

import com.google.common.util.concurrent.SimpleTimeLimiter
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.DefaultDataHandler
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.Simulator
import java.io.BufferedReader
import java.io.File
import java.io.IOException
import java.io.InputStreamReader
import java.io.PrintStream
import java.util.concurrent.Callable
import java.util.concurrent.TimeUnit
import org.eclipse.core.resources.IFile
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Creates a new process by starting an executable and sends / receives variables of this process using JSON.
 * The executable should be a compiled model file and is taken as system under development. 
 * 
 * @author aas
 *
 */
class ExecutableSimulator extends DefaultDataHandler implements Simulator {
    
    @Accessors
    private var IFile executable
    
    private var String modelName
    
    private var Process process
    private var BufferedReader processReader
    private var PrintStream processWriter
    
    /**
     * Create new process and read it's first JSON object with variables to fill the data pool.
     */
    override initialize(DataPool pool) {
        val currentDir = "." + File.separator
        // Execute jar file or binary
        var ProcessBuilder pBuilder
        if(executable.name.endsWith(".jar"))
            pBuilder = new ProcessBuilder(#["java", "-jar", currentDir+executable.name])
        else
            pBuilder = new ProcessBuilder(#[executable.location.toOSString])
        pBuilder.directory(new File(executable.location.removeLastSegments(1).toOSString))
        process = pBuilder.start()
        
        // Get reader and writer for process
        val isr = new InputStreamReader(process.inputStream)
        processReader = new BufferedReader(isr)
        processWriter = new PrintStream(process.outputStream)
        
        // Read json data
        var String line = waitForJSONOutput(processReader)

        modelName = getUniqueModelName(executable.name, pool, 0)
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
        pool.models.remove(model)
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
    
    /**
     * Returns the name of the executable.
     */
    public def String getModelName() {
        return executable.name
    }
    
    /**
     * Reads stdout of the process and until a JSON object is returned.
     * Reading stdout is done with a time limit in case the process does not respond.
     */
    private def String waitForJSONOutput(BufferedReader br) {
        // Wait until output has been generated
        var String line
        val timeLimiter = new SimpleTimeLimiter();
        do {
            System.err.println("Calling readLine "+System.currentTimeMillis)
            // Call readLine with a timeout of 1 second
            val callable = new Callable<String>(){ 
                override call() throws Exception {
                    br.readLine
                }
            }
            try {
                line = timeLimiter.callWithTimeout(callable, 1, TimeUnit.SECONDS, false)
            } catch(Exception e) {
                stop();
                throw new IOException("Process of simulation '" + executable.name + "' is not responding", e)
            }
            
            Thread.sleep(1);
        } while(line == null || !line.startsWith("{") || !line.endsWith("}"))
        return line
    }
    
    private def String getUniqueModelName(String name, DataPool pool, int suffix) {
        val uniqueName = if(suffix > 0)
                             name+"_"+suffix
                         else
                             name
        val modelWithThisName = pool.models.findFirst[it.name.equals(uniqueName)]
        if(modelWithThisName == null) {
            return uniqueName
        } else {
            return getUniqueModelName(name, pool, suffix+1)
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override String toString() {
        return "Simulator for "+modelName
    }
}