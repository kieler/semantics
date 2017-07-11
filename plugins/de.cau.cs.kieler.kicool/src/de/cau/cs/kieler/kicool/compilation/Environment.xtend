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
package de.cau.cs.kieler.kicool.compilation

import java.util.List
import de.cau.cs.kieler.kicool.compilation.internal.Snapshots
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kicool.compilation.internal.EnvironmentPropertyHolder
import de.cau.cs.kieler.kicool.ProcessorReference

/**
 * Class for a processor environment, which is basically a key value map with some convenient methods.
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class Environment extends EnvironmentPropertyHolder {
    
    public static val IProperty<Object> SOURCE_MODEL = 
        new Property<Object>("de.cau.cs.kieler.kicool.sourceModel")
        
    public static val IProperty<Boolean> INPLACE = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.inplace", false)

    public static val IProperty<Boolean> ONGOING_WORKING_COPY = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.ongoingWorkingCopy", true)
    
    public static val IProperty<Object> MODEL = 
        new Property<Object>("de.cau.cs.kieler.kicool.model")
    
    public static val IProperty<CompilationContext> COMPILATION_CONTEXT = 
        new Property<CompilationContext>("de.cau.cs.kieler.kicool.compilationContext")
    
    public static val IProperty<ProcessorReference> PROCESSOR_REFERENCE = 
        new Property<ProcessorReference>("de.cau.cs.kieler.kicool.processorReference")

    public static val IProperty<Processor<?,?>> PROCESSOR_INSTANCE = 
        new Property<Processor<?,?>>("de.cau.cs.kieler.kicool.processorInstance")
        
    public static val IProperty<List<String>> ERRORS = 
        new Property<List<String>>("de.cau.cs.kieler.kicool.errors", <String> newLinkedList)
        
    public static val IProperty<Long> START_TIMESTAMP = 
        new Property<Long>("de.cau.cs.kieler.kicool.startTimestamp", new Long(0))
        
    public static val IProperty<Long> STOP_TIMESTAMP = 
        new Property<Long>("de.cau.cs.kieler.kicool.stopTimestamp", new Long(0))

    public static val IProperty<Long> OVERALL_TIMESTAMP = 
        new Property<Long>("de.cau.cs.kieler.kicool.overallTimestamp", new Long(0))

    public static val IProperty<Long> PTIME = 
        new Property<Long>("de.cau.cs.kieler.kicool.pTime", new Long(0))

    public static val IProperty<Long> OVERALL_PTIME = 
        new Property<Long>("de.cau.cs.kieler.kicool.overallPTime", new Long(0))

    public static val IProperty<Snapshots> SNAPSHOTS = 
        new Property<Snapshots>("de.cau.cs.kieler.kicool.snapshots", new Snapshots)
        
    public static val IProperty<Boolean> ENABLED = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.enabled", true)
             
    new() {
    }
    
    def addError(String msg) {
        getProperty(ERRORS) += msg
    }
    
    def getStatus() {
        if (getProperty(ERRORS).size == 0) ProcessorStatus.OK else ProcessorStatus.ERRORS
    }
    
}