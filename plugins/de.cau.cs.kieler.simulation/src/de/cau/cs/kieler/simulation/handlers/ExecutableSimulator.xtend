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
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.build.simulation.SimulationCompiler
import de.cau.cs.kieler.prom.build.simulation.SimulationCompilerListener
import de.cau.cs.kieler.prom.configurable.ConfigurableAttribute
import de.cau.cs.kieler.prom.configurable.ResourceSubstitution
import de.cau.cs.kieler.prom.console.PromConsole
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.DataPoolOperation
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.SimulationManager
import java.io.BufferedReader
import java.io.File
import java.io.IOException
import java.io.InputStreamReader
import java.io.PrintStream
import java.util.concurrent.Callable
import java.util.concurrent.TimeUnit
import org.eclipse.core.resources.IFile
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.prom.FileExtensions.*

/**
 * Creates a new process by starting an executable or shell command and sends / receives variables of this process using JSON.
 * The executable must communicate its state to stdin / stdout and is taken as system under development. 
 * 
 * @author aas
 *
 */
class ExecutableSimulator extends DefaultSimulator {
    
    /**
     * The path to the executable.
     * This can be an absolute file system path, an absolute path in the workspace
     * or a project relative path. For a project relative path, the configuration file must be in the same project as the executable. 
     */
    public val executablePath = new ConfigurableAttribute("executable", null, #[String])
    
    /**
     * Optional shell command that is executed to start the process.
     * If no shell command is specified, then a command is infered for the given executable.
     * However, this is available only for executables and jar files at the moment.
     * In other cases (e.g. to start a python script) the shell command must be specified here.
     */
    public val shellCommand = new ConfigurableAttribute("command", null, #[String])
    
    /**
     * The loaded file handle of the executable.
     */
    @Accessors
    private var IFile executableFile
    
    /**
     * The name of the model in the simulation.
     */
    protected var String modelName
    
    /**
     * The created process
     */
    private var Process process
    
    /**
     * A reader to read stdout of the process
     */
    private var BufferedReader processReader
    
    /**
     * A writer to write to stdin of the process
     */
    private var PrintStream processWriter
    
    /**
     * A time limiter to have a maximum time in which the process must respond with the output of its next tick.
     * Otherwise the process is terminated and the simulation stopped.
     * A timeout can occur for instance if the tick needed to long to calculate,
     * or the started executable does not respond with a JSON object on stdout as expected. 
     */
    private val timeLimiter = new SimpleTimeLimiter()
    
    /**
     * A listener to be notified when the started executable is going to be deleted by a simulation compiler.
     * In this case, the running simulation is stopped, so that the simulation compiler can update the executable.
     * This is only required on Windows.
     */
    private var SimulationCompilerListener exeResourceListener
    
    /**
     * The operation of this data handler
     */
    public val operation = new DataPoolOperation("write") {
        override apply(DataPool pool) {
            write(pool)
        }
    }
    
    public val exeSubstitution = new ResourceSubstitution("executable") {
        override getValue() {
            return executable
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getOperations() {
        return #[operation]
    }
    
    /**
     * Creates a new process and reads it's first JSON object to fill the data pool.
     * 
     * @param pool The pool
     */
    override initialize(DataPool pool) {
        // Execute jar file or binary
        val pBuilder = createProcessBuilder
        process = pBuilder.start()
        
        // Get reader and writer for process
        val isr = new InputStreamReader(process.inputStream)
        processReader = new BufferedReader(isr)
        processWriter = new PrintStream(process.outputStream)
        
        // Read json data
        var String line = waitForJSONOutput(processReader)
    
        modelName = getUniqueModelName(pool, Files.getNameWithoutExtension(executable.name))
        val model = Model.createFromJson(modelName, line)
        pool.addModel(model)
        
        // Stop simulation when the executable is deleted
        registerResourceChangeListener(executable)
    }
    
    /**
     * Creates the process builder to start the process.
     * 
     * @return the process builder
     */
    private def ProcessBuilder createProcessBuilder() {
        var ProcessBuilder pBuilder
        if(!shellCommand.stringValue.isNullOrEmpty) {
            // The executable file can still be used as placeholder in the shell command, so we substitute these here.
            val commandWithoutPlaceholders = exeSubstitution.replace(shellCommand.stringValue)
            val commandList = PromPlugin.splitStringOnWhitespace(commandWithoutPlaceholders)
            pBuilder = new ProcessBuilder(commandList)
        } else {
            if(executable == null) {
                throw new IllegalArgumentException("Could not load the executable file '"+executablePath.stringValue+"'")
            }
            // Create suited command for the executable
            if(isJavaArchive(executable)) {
                // Create process builder for java
                val currentDir = "." + File.separator
                pBuilder = new ProcessBuilder(#["java", "-jar", currentDir+executable.name])
                pBuilder.directory(new File(executable.location.removeLastSegments(1).toOSString))
            } else if (isExecutable(executable)) {
                // Create process builder for executable
                pBuilder = new ProcessBuilder(#[executable.location.toOSString])    
            } else {
                throw new IllegalArgumentException("Could not run executable '"+executablePath.stringValue+"'\n"
                                                 + "because it is neither a jar file, nor an executable.\n"
                                                 + "Please specify the full shell command to start the process.")
            }    
        }
        return pBuilder
    }
    
    /**
     * Registers a listener to stop the simulation when one of the files is going to be deleted.
     * 
     * @param files The files to monitor
     */
    private def void registerResourceChangeListener(IFile... files) {
        // Remove old listener
        removeResourceChangeListener()
        // Create new listener
        exeResourceListener = new SimulationCompilerListener() {
            override preDelete(IFile oldExecutable) {
                if(executable.fullPath == oldExecutable.fullPath) {
                    // Stop simulation
                    SimulationManager.instance.stop
                    // Notify user why simulation stopped
                    PromConsole.print("Stopped simulation because the executable '"+executable.fullPath+"' changed")
                }
            }
        }
        // Add new listener
        SimulationCompiler.addListener(exeResourceListener)
    }
    
    /**
     * Removes the listener
     */
    private def void removeResourceChangeListener() {
        if(exeResourceListener != null) {
            SimulationCompiler.removeListener(exeResourceListener)    
        }
    }
    
    /**
     * Send the variables of the model that belongs to this simulator to the process via JSON.
     * 
     * @param pool The pool
     */
    protected def void write(DataPool pool) {
        // Create json for this model from data pool
        val model = findModel(pool)
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
        removeResourceChangeListener
        if(process != null) {
            process.destroyForcibly
            process = null
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getName() {
        return "sim"
    }
    
    /**
     * Waits until the reader returns a JSON object.
     * This is done with a time limit in case the process does not respond.
     * 
     * @param br The buffered reader
     * @return the JSON string that has been returned by the reader
     * @throws IOException if no JSON object is sent or it is not sent fast enough. 
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
    
    /**
     * Returns the executable file handle, possibly loaded from the executable path of the configuration.
     * 
     * @return the file handle of the executable, or null if none
     */
    private def IFile getExecutable() {
        if(executableFile == null && !executablePath.stringValue.isNullOrEmpty) {
            executableFile = getIFile(executablePath.stringValue)
        }
        return executableFile
    }
    
    /**
     * Returns the model handled by this simulator from the pool
     * 
     * @return the model handled by this simulator
     */
    private def Model findModel(DataPool pool) {
        return pool.models.findFirst[it.name == modelName]
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