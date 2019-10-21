/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.cli.test

import de.cau.cs.kieler.core.Platform
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.nio.file.Files
import java.util.Comparator
import java.util.List
import java.util.concurrent.TimeUnit

import static org.junit.Assert.assertTrue

import static extension java.lang.String.format

/**
 * @author als
 */
abstract class AbstractCLITest {
    
    static val testsDir = new File("./tests")
    
    val res = new File("./resources")
    
    protected var timeout = 10
    
    protected static def setupCompiler(File artifact, File compiler) {
        assertTrue("Cannot find compiler artifact in " + artifact, artifact.isFile)
        if (compiler.exists) {
            compiler.delete
        }
        Files.copy(artifact.toPath, compiler.toPath)
        assertTrue("Failed to copy compiler to " + compiler, compiler.file)
        assertTrue("Cannot set executable flag of compiler", compiler.setExecutable(true))
    }
    
    protected def setupTest(String name) {
        if (!testsDir.exists) assertTrue("Cannot create tests directory " + testsDir, testsDir.mkdir)
        
    	val dir = new File(testsDir, name)
        if (dir.exists) { // clean
            Files.walk(dir.toPath).sorted(Comparator.reverseOrder).map[toFile].forEach[
                assertTrue("Cannot clean test directory " + dir, it.delete)
            ]
        }
        assertTrue("Cannot create test directory " + dir, dir.mkdir)
        
        val resPath = res.toPath
    	Files.walk(resPath).filter[!it.equals(res.toPath)].forEachOrdered[
    	    val dest = new File(dir, resPath.relativize(it).toString)
    	    if (it.toFile.isDirectory) {
    	        dest.mkdir
    	    } else {
    	        Files.copy(it, dest.toPath)
    	    }
    	]
    	return dir
    }
    
    protected def invoke(List<String> command) {
        return command.invoke(null, timeout, null)
    }
    
    protected def invoke(List<String> command, File workingDirectory) {
        return command.invoke(null, timeout, workingDirectory)
    }
    
    protected def invoke(List<String> command, List<String> outputs) {
        return command.invoke(outputs, timeout, null)
    }
    
    static protected def invoke(List<String> command, List<String> outputs, int timeout, File workingDirectory){
        println("Invoking: " + command.join(" "))
        val pb = new ProcessBuilder(command)
        if (workingDirectory !== null) pb.directory(workingDirectory)
        pb.redirectErrorStream(true)
        
        try {
            val p = pb.start
            val pReader = new BufferedReader(new InputStreamReader(p.inputStream));
            var String line = null;
            while ( (line = pReader.readLine()) !== null) {
                if( outputs !== null )
                    outputs.add(line)
                else
                    println(line)
            }
            
            val intime = p.waitFor(timeout, TimeUnit.SECONDS)
            if (!intime) {
                println("ERROR: Command execution timed out (" + timeout + " sec)")
                return -1
            }
            
            return p.exitValue
        } catch (Exception e) {
            println("ERROR: Exception while invoking command")
            e.printStackTrace
        }
    }
    
    def assertExists(File file) {
        assertTrue("Expected result %s does not exist.".format(file), file.exists)
        assertTrue("Expected result %s is empty.".format(file), file.length > 0)
    }
    
    static protected def getPlatformExePostfix() {
        // get system java version
        val command = #["java", "-version"]
        val outputs = newArrayList
        command.invoke(outputs, 10, null)
        
        if (outputs.head.contains("1.8.")) {
            switch (Platform.getOS) {
                case WIN: return "winJava8.bat"
                case MAC: return "osxJava8"
                default: return "linuxJava8"
            }
        } else {
            switch (Platform.getOS) {
                case WIN: return "win.bat"
                case MAC: return "osx"
                default: return "linux"
            }
        }
    }
}