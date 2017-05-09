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
package de.cau.cs.kieler.semantics.test.common.repository

import com.google.inject.Guice
import java.io.FileInputStream
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

import static extension com.google.common.base.Preconditions.*
import static extension de.cau.cs.kieler.semantics.test.common.repository.TestModelDataUtil.*
import com.google.common.reflect.TypeToken

/**
 * An abstract {@link IModelsRepositoryTest} which automatically parses XText models.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
abstract class AbstractXTextModelRepositoryTest<T extends EObject> implements IModelsRepositoryTest<T> {
    
    /** The resource sets for referenced models. */
    val resourceSets = <String, XtextResourceSet>newHashMap
    /** The list of hierarchical compare predicates */
    protected val compareHierarchy = newLinkedList(ResourceSetIDComparator, ReferencesComparator, ComplexityComparator, ModelPathComparator, TracePathComparator)  
    
    /**
     * {@inheritDoc}
     */   
    override getModelType() {
        return (new TypeToken<T>(getClass()) {}).rawType
    }
    
    /**
     * {@inheritDoc}
     */
    override T loadModel(TestModelData data) {
        val absModelPath = data.repositoryPath.resolve(data.modelPath)
        try {
            val uri = URI.createFileURI(absModelPath.toFile.absolutePath)
            // Get resource set
            var resourceSet = uri.xtextResourceSet
            if (!data.resourceSetID.nullOrEmpty) {
                if (resourceSets.containsKey(data.resourceSetID)) {
                    resourceSet = resourceSets.get(data.resourceSetID)
                } else {
                    resourceSets.put(data.resourceSetID, resourceSet)
                }
            }
            // Load file
            resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE)
            val resource = resourceSet.createResource(uri);
            resource.load(new FileInputStream(absModelPath.toFile), resourceSet.getLoadOptions());
            return resource.getContents().head as T
        } catch (Exception e) {
            throw new Exception("Cannot load model from "+absModelPath.toString, e)
        }
    }
    
    /**
     * @return the correct XtextResourceSet for the given uri based in its file extension.
     */
    static def XtextResourceSet getXtextResourceSet(URI uri) {
        uri.checkNotNull
        return Guice.createInjector().getInstance(IResourceServiceProvider.Registry).getResourceServiceProvider(uri).get(XtextResourceSet)
    }
    
    /**
     * {@inheritDoc}
     */   
    override compare(TestModelData a, TestModelData b) {
        return compareHierarchy.hierachicalCompare(a, b)
    }

}