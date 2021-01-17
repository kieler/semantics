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
package de.cau.cs.kieler.sccharts.processors.scg

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.TagAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.annotations.registry.AnnotationsType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.processors.AbortRegion
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.ForkType
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions

import static de.cau.cs.kieler.annotations.registry.AnnotationsRegistry.*

/**
 * 
 * @author als
 */
class SCGAbortRegionProcessor extends InplaceProcessor<SCGraphs> implements Traceable {
    
    public static val ANNOTATION_ABORT = 
        register("loop", AnnotationsType.SYSTEM, TagAnnotation, Entry, "Marks an entry node as a result of an abort region.")

    private static val ERROR_ORDER = "Illegal order of abort and non-abort regions. Abort regions are only allowed as first or last regions and cannot be mixed with regular regions."

    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension SCGMethodExtensions
    extension ScgFactory = ScgFactory.eINSTANCE

    override getId() {
        "de.cau.cs.kieler.sccharts.scg.processors.abortRegion"
    }
    
    override getName() {
        "Abort Regions"
    }
    
    override process() {
        // collect
        val process = newHashMap
        for (fork : model.scgs.filter[!method].map[nodes.filter(Fork)].flatten) {
            val entries = fork.next.map[targetNode].filter(Entry).toList
            if (entries.exists[hasAnnotation(ANNOTATION_ABORT)]) {
                process.put(fork, entries)
            }
        }
        
        // check environment
        if (!getProperty(AbortRegion.COMPILATION_SUPPORTS_ABORT_REGIONS)) {
            if (!process.empty) {
                environment.errors.add("Support for abort regions is not enabled in this compilation chain!")
            }
            return;
        }
        
        if (environment.inDeveloperMode && !process.empty) snapshot
        
        // check process
        for (fork : process.keySet) {
            val strong = newArrayList
            val content = newArrayList
            val weak = newArrayList
            
            // sort
            var type = 0
            for (entry : process.get(fork)) {
                if (entry.hasAnnotation(ANNOTATION_ABORT)) {
                    switch(type) {
                        case 0: strong += entry
                        case 1: {
                            weak += entry
                            type = 2
                        }
                        case 2: weak += entry
                        default: throw new IllegalStateException
                    }
                } else {
                    switch(type) {
                        case 0: {
                            content += entry
                            type = 1
                        }
                        case 1: content += entry
                        case 2: environment.errors.add(ERROR_ORDER, entry, true)
                        default: throw new IllegalStateException
                    }
                }
            }
            
            // process
            if (content.empty) {
                environment.errors.add("Found abort regions but there are no regions to abort.")
            } else if (strong.empty && weak.empty) {
                environment.warnings.add("Found abort regions but could not determine order.")
            } else if (content.size === 1){ // simple case -> keep fork join
                fork.type = ForkType.SEQUENTIAL_PREEMPTIVE
                fork.join.any = true
            } else { // nest content into abort fork
                val scg = fork.eContainer as SCGraph
                
                // create
                val abortFork = createFork
                abortFork.type = ForkType.SEQUENTIAL_PREEMPTIVE
                val abortJoin = createJoin
                abortJoin.any = true // par-or
                abortJoin.fork = abortFork
                val contentEntry = createEntry
                val contentExit = createExit
                contentExit.entry = contentEntry
                
                // add
                scg.nodes.add(scg.nodes.indexOf(fork), abortFork)
                scg.nodes.add(scg.nodes.indexOf(fork.join) + 1, abortJoin)
                scg.nodes.add(scg.nodes.indexOf(fork), contentEntry)
                scg.nodes.add(scg.nodes.indexOf(abortJoin), contentExit)
                
                // connect
                for (entry : strong) {
                    abortFork.next += entry.allPrevious.toList
                    entry.exit.next.target = abortJoin
                }
                fork.allPrevious.toList.forEach[ target = abortFork ]
                abortFork.createControlFlowTo(contentEntry)
                contentEntry.createControlFlowTo(fork)
                abortJoin.next = fork.join.next
                fork.join.createControlFlowTo(contentExit)
                contentExit.createControlFlowTo(abortJoin)
                for (entry : weak) {
                    abortFork.next += entry.allPrevious.toList
                    entry.exit.next.target = abortJoin
                }
            }
        }
    }
    
}
