/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.scg.processors.analyzer

import com.google.inject.Inject
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions

/** 
 * @author ssm
 * @kieler.design 2017-11-01 proposed 
 * @kieler.rating 2017-11-01 proposed yellow
 */
class ThreadAnalyzer extends InplaceProcessor<SCGraphs> {
	
	@Inject extension SCGThreadExtensions
	
    public static val IProperty<ThreadData> THREAD_DATA = 
        new Property<ThreadData>("de.cau.cs.kieler.scg.processors.threadAnalyzer.data", null)	
	
    override getId() {
        "de.cau.cs.kieler.scg.processors.threadAnalyzer"
    }
    
    override getName() {
        "Thread Analyzer"
    }
    
    override process() {
        val model = getModel
        val threadData = new ThreadData 
        environment.setProperty(THREAD_DATA, threadData)
        
        for (scg : model.scgs) {
            val entry = scg.nodes.head as Entry
            
            val threadPathTypes = entry.getThreadControlFlowTypes
            for (threadEntry : threadPathTypes.keySet) {
                threadData.data.put(threadEntry, threadPathTypes.get(threadEntry))
            }            
        }
    }	
	
}

