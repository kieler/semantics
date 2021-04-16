/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.scg.processors.analyzer

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.ForkType
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import java.util.Map

import static de.cau.cs.kieler.scg.processors.SCGAnnotations.*

/** 
 * @author ssm
 * @kieler.design 2017-11-01 proposed 
 * @kieler.rating 2017-11-01 proposed yellow
 */
class ThreadAnalyzer extends InplaceProcessor<SCGraphs> {
	
	@Inject extension AnnotationsExtensions
	@Inject extension SCGCoreExtensions
	@Inject extension SCGThreadExtensions
    @Inject extension SCGControlFlowExtensions
	@Inject Injector injector
	
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
        val threadData = injector.getInstance(ThreadData) 
        environment.setProperty(THREAD_DATA, threadData)
        
        for (scg : model.scgs) {
            val entry = scg.nodes.head as Entry
            
            val threadPathTypes = entry.getThreadControlFlowTypes
            threadPathTypes.postProcessSpecialForkJoins(scg)
            for (threadEntry : threadPathTypes.keySet) {
                threadData.data.put(threadEntry, threadPathTypes.get(threadEntry))
                if (!threadEntry.hasAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE)) {
                    threadEntry.createStringAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE, threadPathTypes.get(threadEntry).toString2)
                }                
            }
            
            threadData.createThreadNodeMaps(scg.nodes.findFirst[ it instanceof Entry ].asEntry)            
        }
        
        threadData.createForkMap
    }
    
    def postProcessSpecialForkJoins(Map<Entry, ThreadPathType> threadPathTypes, SCGraph scg) {
        val threads = newHashMap
        val preemtiveFork = newHashSet
        val preemtiveJoin = newHashSet
        for (fork : scg.nodes.filter(Fork)) {
            threads.put(fork, fork.allNextNodes.filter(Entry))
            if (fork.type === ForkType.SEQUENTIAL_PREEMPTIVE) preemtiveFork += fork
            if (fork.join.any) preemtiveJoin += fork.join
        }
        
        val alreadyDegraded = newHashSet
        for (fork : preemtiveFork) {
            // If any thread is (pot.) instantaneous all following are too
            // ASSUMTION: Enum is accordinly ordered
            var fastest = ThreadPathType.DISCONNECTED
            for (entry : threads.get(fork)) {
                val currType = threadPathTypes.get(entry)
                if (currType !== ThreadPathType.UNKNOWN) {
                    if (currType.ordinal < fastest.ordinal) {
                        fastest = currType
                    } else if (currType.ordinal > fastest.ordinal && fastest.ordinal < ThreadPathType.DELAYED.ordinal) {
                        // degrade
                        threadPathTypes.put(entry, fastest)
                        alreadyDegraded += entry
                        entry.removeAnnotations(ANNOTATION_CONTROLFLOWTHREADPATHTYPE)
                        entry.createStringAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE, fastest.toString2)
                        entry.createStringAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE_PREEMPTION, "(due to strong preemtion)")
                    }
                }
            }
        }
        
        for (join : preemtiveJoin) {
            // If any thread is (pot.) instantaneous all other are too
            // ASSUMTION: Enum is accordinly ordered
            if (join.fork.type !== ForkType.PARALLEL) { // sequential fork
                var fastest = ThreadPathType.DISCONNECTED
                for (entry : threads.get(join.fork).toList.reverseView) { // backward order!
                    val currType = threadPathTypes.get(entry)
                    if (currType !== ThreadPathType.UNKNOWN) {
                        if (currType.ordinal < fastest.ordinal && !alreadyDegraded.contains(entry)) {
                            fastest = currType
                        } else if (currType.ordinal > fastest.ordinal) {
                            // degrade
                            threadPathTypes.put(entry, fastest)
                            entry.removeAnnotations(ANNOTATION_CONTROLFLOWTHREADPATHTYPE)
                            entry.createStringAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE, fastest.toString2)
                            entry.createStringAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE_PREEMPTION, "(due to weak preemtion)")
                        }
                    }
                }
            } else {
                val fastest = ThreadPathType.values.get(threads.get(join.fork).filter[!alreadyDegraded.contains(it)].map[threadPathTypes.get(it)].filter[it !== ThreadPathType.UNKNOWN].map[ordinal].min)
                for (entry : threads.get(join.fork)) {
                    val currType = threadPathTypes.get(entry)
                    if (currType.ordinal > fastest.ordinal) {
                        // degrade
                        threadPathTypes.put(entry, fastest)
                        entry.removeAnnotations(ANNOTATION_CONTROLFLOWTHREADPATHTYPE)
                        entry.createStringAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE, fastest.toString2)
                        entry.createStringAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE_PREEMPTION, "(due to weak preemtion)")
                    }
                }
            }
        }
    }
	
}

