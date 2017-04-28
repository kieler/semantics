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
package de.cau.cs.kieler.semantics.test.common.runners

import java.util.List
import org.junit.runner.Runner
import org.junit.runners.Suite
import org.eclipse.xtend.lib.annotations.Data
import java.nio.file.Paths
import org.junit.Test

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class ModelsRepositoryTestRunner extends Suite {
    
    private static val List<TestModel> testModels = newLinkedList
    private val List<Runner> modifiableRunners;
    
    /**
     * Constructor.
     * 
     * @param clazz the tests class
     * @throws Throwable if something unexpeced happens
     */
    new (Class<?> clazz) throws Throwable {
        super(clazz, newLinkedList)
        
        // Create modifiable list to add test runners to.
        // This is a workaround because the runners field in Suite is not modifiable anymore (since JUnit 4.12)
        modifiableRunners = newLinkedList
        
        // Init models repository index
        initModelsRepositoryIndex
        
    }
    
    /**
     * Returns a modifiable list of objects that define the children of this Runner.
     * 
     * Since JUnit 4.12 the runners field in {@link Suite} is changed to an unmodifiable list in the constructor.
     * As workaround, the modifiable instance is preserve manually and returned in this method.
     * 
     * @author aas
     */
    override List<Runner> getChildren() {
        return modifiableRunners;
    }
    
    /**
     * Traverses the models repository and creates an index.
     */
    def initModelsRepositoryIndex() {
        if (testModels.empty) {
            // Find models repository
            val repository = System.getenv("bamboo_models_repository")
            println("=============================================================================================")
            println(System.getProperty("user.dir"))
            println(new java.io.File( "." ).getCanonicalPath())
            println(Paths.get(""))
            println(repository)
            println("=============================================================================================")
        }
    }
    
    @Test
    def testInitModelsRepositoryIndex() {
      initModelsRepositoryIndex
   }
}

@Data
class TestModel {
    
}