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

import com.google.common.hash.Hashing
import com.google.common.io.Files
import com.mongodb.MongoClient
import com.mongodb.MongoClientURI
import com.mongodb.client.MongoCollection
import de.cau.cs.kieler.test.common.repository.ModelsRepository
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryUtil
import de.cau.cs.kieler.test.common.repository.TestModelData
import java.util.Collection
import java.util.Map
import org.bson.Document
import org.bson.types.ObjectId

import static com.mongodb.client.model.Filters.*
import static com.mongodb.client.model.Sorts.*
import static com.mongodb.client.model.Updates.*
import org.bson.BsonArray

/**
 * Database handler for the benchmark MongoDB.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class MongoBenchmarkDatabase extends AbstractBenchmarkDatabase {

    /** The client connection */
    val MongoClient client
    /** The benchmarks collection */
    val MongoCollection<Document> benchmarks
    /** The runs collection */
    val MongoCollection<Document> runs
    /** The ID of the current run entry */
    val ObjectId runID
    /** A map form all test model data to their database file entry */
    val modelFiles = newHashMap

    /**
     * Creates a connection to the database with the given URI.
     */
    new(String dbURI) {
        // Connect to mongodb server
        val uri = new MongoClientURI(dbURI)
        client = new MongoClient(uri)
        // Connect to the benchmark database
        val db = client.getDatabase(uri.database)
        
        // Get DB collections
        benchmarks = db.getCollection("benchmarks")
        runs = db.getCollection("runs")
        val files = db.getCollection("files")

        // Find the run with the highest number
        val lastRun = runs.find().sort(descending("num")).first
        // Add new run entry
        val run = #{
            "num" -> if (lastRun !== null) lastRun.getLong("num") + 1 else 0L,
            "benchmarks" -> emptyList
        }.doc
        runs.insertOne(run)
        runID = run.getObjectId("_id")
        // Add serverside time stamp
        runs.updateOne(eq("_id", runID), combine(currentDate("date"), currentTimestamp("start")))

        // Update model data set
        for (data : ModelsRepository.models) {
            val absModelPath = data.repositoryPath.resolve(data.modelPath)
            val revision = ModelsRepositoryUtil.getFileVersion(data.repositoryPath, data.modelPath)
            val fileFilter = and(eq("repository", data.repositoryPath.fileName.toString), eq("path", data.modelPath.toString), eq("revision", revision))
            var fileEntry = files.find(fileFilter).first
            
            // Create entry if not present
            if (fileEntry === null) {
                fileEntry = #{
                    "repository" -> data.repositoryPath.fileName.toString,
                    "path" -> data.modelPath.toString,
                    "revision" -> revision,
                    "hash" -> Files.hash(absModelPath.toFile, Hashing.sha256).toString
                }.doc
                files.insertOne(fileEntry)
            }
            val id = fileEntry.getObjectId("_id")  
    
            // Update data
            files.updateOne(eq("_id", id), combine(
                unset("traces"), // Cannot set lists (mongo 3.2 bug)
                unset("properties")
            ))
            files.updateOne(eq("_id", id), combine(
                pushEach("traces", data.tracePaths.map[toString]),
                pushEach("properties", data.modelProperties.toList)
            ))
            
            // Store db association
            modelFiles.put(data, id)
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override storeResult(IBenchmark benchmark, TestModelData data, Document result) {
        // FInd entry
        val benchmarkFinder = and(eq("run", runID), eq("file", modelFiles.get(data)))
        var benchmarkEntry = benchmarks.find(benchmarkFinder).first
        // Create entry if necessary
        if (benchmarkEntry === null) {
            val newDocument = #{
                "run" -> runID,
                "file" -> modelFiles.get(data)
            }.doc
            benchmarks.insertOne(newDocument)
            runs.updateOne(eq("_id", runID), addToSet("benchmarks", newDocument.getObjectId("_id")))
        }
        // Insert result
        benchmarks.updateOne(benchmarkFinder, set(benchmark.ID, result))
    }
    
    /**
     * {@inheritDoc}
     */
    override save() {
        runs.updateOne(eq("_id", runID), currentTimestamp("end"))
        // Shutdown
        client.close
    }

    //-----------------------------------------------------------------------------------------------------------------

    /**
     * Creates a MongoDB document from the given map.
     */
    def doc(Map<String, ?> data) {
        new Document(data as Map<String, Object>)
    }
    
}
