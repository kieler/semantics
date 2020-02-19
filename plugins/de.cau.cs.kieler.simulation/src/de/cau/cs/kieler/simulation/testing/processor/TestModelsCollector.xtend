/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.testing.processor

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.core.uri.URIUtils
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.simulation.testing.TestModelCollection
import java.io.File
import java.util.List

/**
 * @author als
 */
class TestModelsCollector extends Processor<Object, TestModelCollection> {
    
    public static val IProperty<List<String>> PATHS = 
        new Property<List<String>>("de.cau.cs.kieler.simulation.testing.models.collector.paths", null)
    
    override getId() {
        "de.cau.cs.kieler.simulation.testing.models.collector"
    }
    
    override getName() {
        "Test Models Collector"
    }
    
    override getType() {
        ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        val paths = getProperty(PATHS)
        val dirs = newArrayList
        if (paths !== null && !paths.empty) {
            for (path : paths) {
                var file = new File(path)
                if (file.isDirectory) {
                    dirs += file
                } else if (!file.exists) {
                    // Try relative to input model
                    if (model instanceof CodeContainer) { // Assuming some config file
                        val base = (model as CodeContainer).head.file
                        file = new File(base.parentFile, file.path)
                        if (file.isDirectory) {
                            dirs += file
                        } else {
                            environment.errors.add("Illegal search path (" + path + "). Destination does not exist. Also a relative resolving against the input model (" + file + ") does not yield a valid path.")
                        }
                    } else if (environment.findResource !== null) {
                        val res = environment.findResource
                        if (res.URI !== null) {
                            file = new File(URIUtils.getJavaFile(res.URI)?.parentFile, file.path)
                            if (file.isDirectory) {
                                dirs += file
                            } else {
                                environment.errors.add("Illegal search path (" + path + "). Destination does not exist. Also a relative resolving against the input model (" + file + ") does not yield a valid path.")
                            }
                        } else {
                            environment.errors.add("Illegal search path (" + path + "). Destination does not exist. Also a relative resolving against the input model does not yield a valid path (no URI for input model).")
                        }
                    } else {
                        environment.errors.add("Illegal search path (" + path + "). Destination does not exist.")
                    }
                } else {
                    environment.errors.add("Illegal search path (" + path + "). Only directories can be searched for models.")
                }
            }
        } else {
            environment.errors.add("Missing arguments! There are no paths for searching test models.")
        }
        model = new TestModelCollection(dirs)
    }
    
}