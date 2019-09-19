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
package de.cau.cs.kieler.simulation

import com.google.common.util.concurrent.SimpleTimeLimiter
import com.google.common.util.concurrent.UncheckedTimeoutException
import com.google.gson.JsonObject
import de.cau.cs.kieler.annotations.Nameable
import de.cau.cs.kieler.kicool.compilation.ExecutableContainer
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.simulation.internal.SimulationVariableStore
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.PrintStream
import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SimulationModelWrapper implements Simulatable {
    
    private static val POOL = Executors.newCachedThreadPool

    @Accessors(PUBLIC_GETTER)
    val ExecutableContainer executable
    @Accessors(PUBLIC_GETTER)
    val Environment environment
    @Accessors(PUBLIC_GETTER)
    var String id
    @Accessors(PUBLIC_GETTER)
    var SimulationContext context
    protected var SimulationVariableStore variables

    // Internal Process
    private val timeLimiter = SimpleTimeLimiter.create(POOL)
    private var timeout = SimulationContext.REACTION_TIMEOUT_IN_SECONDS.^default
    private var Process process
    private var AsynchronousRedirect out
    private var AsynchronousRedirect err
    private var PrintStream in
    // Synchronization queue for AsynchronousRedirect
    package val jsonQueue = new ArrayBlockingQueue<JsonObject>(1)
    
    new (ExecutableContainer executable, Environment environment) {
        this.executable = executable
        this.environment = environment
        this.variables = new SimulationVariableStore(VariableStore.get(environment))
        var id = executable.file.toPath.fileName.toString
        if (environment !== null) {
            val model = environment.getProperty(Environment.ORIGINAL_MODEL)
            if (model instanceof Nameable) {
                id = model.name
            }
        }
        this.id = id
    }
    
    override initialize(SimulationContext context, DataPool pool) {
        if (running) {
            throw new IllegalStateException("Simulation already started!")
        } else {
            try {
                this.context = context
                this.timeout = context.startEnvironment.getProperty(SimulationContext.REACTION_TIMEOUT_IN_SECONDS)
                
                // Create process
                val pb = executable.processBuilder
                if (environment !== null) {
                    val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
                    pb.directory(infra.generatedCodeFolder)
                }
                
                // Start and set up concurrent redirects
                process = pb.start
                out = new AsynchronousRedirect(
                    this,
                    new BufferedReader(new InputStreamReader(process.inputStream)),
                    context.outputStream,
                    true
                )
                out.name = AsynchronousRedirect.simpleName + ":Out"
                out.start
                err = new AsynchronousRedirect(
                    this,
                    new BufferedReader(new InputStreamReader(process.errorStream)),
                    context.errorStream,
                    false
                )
                err.name = AsynchronousRedirect.simpleName + ":Err"
                err.start
                in = new PrintStream(process.outputStream)
                
                // Read inital message
                val json = jsonQueue.poll(2 * timeout, TimeUnit.SECONDS)
                if (json !== null) {
                    this.variables = new SimulationVariableStore(json, VariableStore.get(environment))
                    pool.setOutput(this, json)
                }
            } catch (Exception ex) {
                // Kill threads
                out?.interrupt
                err?.interrupt
                
                throw ex
            }
        }
    }
        
    override doStep(DataPool pool) {
        if (!running) {
            throw new IllegalStateException("Simulation unexpectedly terminated or not yet started!")
        } else {
            writeInput(pool)
            readOutput(pool)
        }
    }
    
    override reset() {
        // TODO support
        return false
    }
    
    override stop() {
        if (running) {
            // Kill the process and wait until it has been destroyed,
            // but with a time limit in case the process cannot be killed or does not respond at all.
            try {
                timeLimiter.callWithTimeout([process.destroyForcibly.waitFor], 2 * timeout, TimeUnit.SECONDS)
            } catch(UncheckedTimeoutException e) {
                throw new IOException("Failed attempt to kill simulation process '" + executable.file.toString + "'", e)
            } finally {
                out?.interrupt
                err?.interrupt
                process = null
            }
        }
    }
    
    override isRunning() {
        val running = process !== null && process.alive
        if (!running && (out !== null || err !== null)) {
            try {
                out?.interrupt
                err?.interrupt
            } catch (Exception e) {
                // Bad luck
            }
        }
        return running
    }
    
    override getVariableInformation() {
        return variables
    }
    
    protected def readOutput(DataPool pool) {
        val json = jsonQueue.poll(timeout, TimeUnit.SECONDS)
        
        if (json === null) {
            throw new IOException("Process '" + executable.file + " is not responding.")
        } else {
            pool.setOutput(this, json)
        }
    }
    
    protected def writeInput(DataPool pool) {
        // Create json for this model from data pool
        val jsonInput = DataPool.serializeJSON(pool.getInput())
        
        // Write data pool to process
        in.print(jsonInput)
        in.print("\n")
        in.flush()
    }
    
    override toString() {
        id
    }
}

@FinalFieldsConstructor
class AsynchronousRedirect extends Thread {
//    val timeLimiter = new SimpleTimeLimiter
//    static val TIMEOUT_SECONS = 10
    
    val SimulationModelWrapper sim
    val BufferedReader input
    val PrintStream output
    val boolean redirectJSON
    
    override run() {
//        val read = new Callable<String>(){ 
//            override call() throws Exception {
//                return input.readLine
//            }
//        }
        while (sim.running) {
            try {
//                val line = timeLimiter.callWithTimeout(read, TIMEOUT_SECONS, TimeUnit.SECONDS, true)
                val line = input.readLine
                if (line !== null) { // real output
                    if (redirectJSON && line.contains("{") && line.indexOf("{") < line.lastIndexOf("}")) { // May include json
                        try {
                            val String jsonTxt = if (DataPool.isJSON(line)) {
                                line // Only json
                            } else {
                                // json mixed with prints
                                val start = line.indexOf("{")
                                val end = line.lastIndexOf("}")
                                val prefix = if (start > 0) line.substring(0, start) else ""
                                val jsonPart = line.substring(start, end + 1)
                                val postfix = if (end < line.length - 1) line.substring(end + 1) else ""
                                output.println(prefix + postfix)
                                jsonPart
                            }
                            val json = DataPool.parseJSON(jsonTxt)
                            if (json !== null) {
                                sim.jsonQueue.offer(json)
                            }
                        } catch(Exception e) {
                            // bad json
                            val err = if (sim.context !== null) {
                                sim.context.errorStream
                            } else {
                                System.out
                            }
                            err.print("Cannot parse JSON output from simulatable: " + line)
                            e.printStackTrace(err)
                        }
                    } else { // Just println
                        sim.context.simulationPrintOutput.add(line)
                        output.println(line)
                    }
                }
            } catch (InterruptedException ie) {
                // stop
                return
            } catch (Exception e) {
                // just loop
            }
            
            // sleep and loop
            try {
                Thread.sleep(1)
            } catch (InterruptedException ie) {
                // stop
                return
            }
        }
    }
}