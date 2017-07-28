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
package de.cau.cs.kieler.benchmark.common

import com.google.common.collect.HashMultimap
import de.cau.cs.kieler.test.common.repository.TestModelData
import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import java.text.SimpleDateFormat
import java.util.Calendar
import org.eclipse.core.resources.ResourcesPlugin
import org.bson.Document

/**
 * Database handler for local workspace bechmarks.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class WorkspaceBenchmarkDatabase extends AbstractBenchmarkDatabase {
    
    /** The project name. */
    val String projectName
    /** Collection of all results. */
    val results = HashMultimap.<TestModelData, Document>create
    
    /**
     * Creates a local benchmark project.
     */
    new(String projectName) {
        this.projectName = projectName
    }
    
    /**
     * {@inheritDoc}
     */
    override storeResult(IBenchmark benchmark, TestModelData data, Document result) {
        results.put(data, new Document(benchmark.getID, result))
    }
    
    /**
     * {@inheritDoc}
     */
    override save() {
        val wsRoot = ResourcesPlugin.getWorkspace().getRoot()
        
        // Create project
        val project = wsRoot.getProject(projectName)
        if (!project.exists) project.create(null)
        if (!project.open) project.open(null)
        val file = project.getFile("benchmark-" + new SimpleDateFormat("yyyyMMdd-HHmmss").format(Calendar.getInstance().getTime()) + ".json")
        
        // Create JSON data
        val data = new Document
        for (model : results.keySet) {
            data.append(model.repositoryPath.resolve(model.modelPath).toString, new Document() => [
                for (result : results.get(model)) {
                    it.putAll(result as Document)
                }
            ])
        }        
        
        //Write data
        val fileInput = new ByteArrayInputStream(data.toJson.getBytes(StandardCharsets.UTF_8))
        file.create(fileInput, true, null)
    }
    
}