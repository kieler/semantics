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
package de.cau.cs.kieler.kicool.ide.language.server

import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.observer.AbstractContextNotification
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished
import de.cau.cs.kieler.kicool.compilation.observer.CompilationStart
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorFinished
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorSnapshot
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorStart
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.environments.Snapshots
import de.cau.cs.kieler.kicool.ide.language.server.data.SnapshotDescription
import java.util.Observable
import java.util.Observer

/**
 * @author sdo
 * 
 * Listens to running compilation and updates the client via the LS extension.
 */
class KeithCompilationUpdater implements Observer {
    
    override update(Observable o, Object arg) {
        if (arg instanceof AbstractContextNotification) {
            arg.update
        }
    }
    
    val KiCoolLanguageServerExtension kicoolExt
    val CompilationContext context
    val String uri
    val String clientId
    val String command
    val boolean inplace
    val boolean showResultingModel
    
    var int maxIndex = 0
    var int currentIndex = 0
    
    new(KiCoolLanguageServerExtension kicoolExt, CompilationContext context, String uri, String clientId,
        String command, boolean inplace, boolean showResultingModel
    ) {
        this.kicoolExt = kicoolExt
        this.context = context
        this.uri = uri
        this.clientId = clientId
        this.command = command
        this.inplace = inplace
        this.showResultingModel = showResultingModel
    }
    
    def update(AbstractContextNotification notification) {
        switch notification {
            ProcessorStart: {
                if (kicoolExt.snapshotMap.isEmpty) {
                    return
                }
                kicoolExt.snapshotMap.get(uri).add(newArrayList)
            }
            ProcessorSnapshot: {
                if (kicoolExt.snapshotMap.isEmpty) {
                    return
                }
                val currentSnapshotList = kicoolExt.snapshotMap.get(uri).last
                val processor = notification.processorInstance
                val environment = processor.environment
                val Snapshots snapshots = environment.getProperty(Environment.SNAPSHOTS)
                val errors = environment.errors
                val warnings = environment.warnings
                val infos = environment.infos
                // Add snapshot
                currentSnapshotList.add(new SnapshotDescription(processor.name, currentSnapshotList.length, errors, warnings, infos))
                // Add snapshot to map
                kicoolExt.objectMap.get(uri).add(notification.snapshot)
                maxIndex = context.processorInstances.length;
                kicoolExt.update(uri, context, clientId, command, inplace, false, showResultingModel, currentIndex, maxIndex)
            }
            ProcessorFinished: {
                if (kicoolExt.snapshotMap.isEmpty) {
                    return
                }
                val currentSnapshotList = kicoolExt.snapshotMap.get(uri).last
                val processor = notification.processorInstance
                val environment = processor.environment
                val impl = environment.model
                val errors = environment.errors
                val warnings = environment.warnings
                val infos = environment.infos
                currentSnapshotList.add(new SnapshotDescription(processor.name, currentSnapshotList.length, errors, warnings, infos))
                kicoolExt.objectMap.get(uri).add(impl)
                currentIndex++
                maxIndex = context.processorInstances.length
                kicoolExt.update(uri, context, clientId, command, inplace, false, showResultingModel, currentIndex, maxIndex)
            }
            CompilationStart: {
                kicoolExt.snapshotMap.put(uri, newLinkedList)
                kicoolExt.objectMap.put(uri, newLinkedList)
            }
            CompilationFinished: {
                kicoolExt.update(uri, context, clientId, command, inplace, true, showResultingModel, currentIndex, maxIndex)
            }
        }
    }
    
}