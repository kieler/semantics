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

import de.cau.cs.kieler.prom.configurable.ConfigurableAttribute
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.DataPoolOperation
import java.io.File
import org.eclipse.core.resources.IFile
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
abstract class SimulationInputOutputFileHandlerBase extends DefaultSimulator {
    /**
     * The file to be loaded.
     * The path can be an absolute file system path, or an absolute workspace path, or a project relative path.
     * If it is project relative, the file must be in the same project as the configuration file.
     */
    public val filePath = new ConfigurableAttribute("file", null, true, #[String])
    
    /**
     * Optional name of the model of which the variables should be set.
     * If no model is specified, the first matching variable is used.
     */
    public val modelName = new ConfigurableAttribute("modelName")
    
    /**
     * The file handle to be used
     */
    @Accessors
    protected var File file
    
    /**
     * The operation of this data handler
     */
    private val operation = new DataPoolOperation("write") {
        override apply(DataPool pool) {
            write(pool)
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getOperations() {
        return #[operation]
    }
    
    /**
     * {@inheritDoc}
     */
    override initialize() {
        // Load file
        if(file == null) {
            file = getJavaFile(filePath.stringValue)
        }
    }
    
    /**
     * Operation of this data handler
     */
    abstract def void write(DataPool pool)
    
    /**
     * Sets the Java file handle from an Eclipse file handle. 
     */
    public def void setFile(IFile file) {
        file = new File(file.location.toOSString)
    }
}