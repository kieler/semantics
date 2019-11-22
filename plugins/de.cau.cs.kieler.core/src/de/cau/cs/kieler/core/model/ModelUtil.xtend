/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model

import java.io.IOException
import java.util.Collections
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import com.google.inject.Injector

/** 
 * This is a utility class for File inputs, opening and URL conversion of bundle and workspace
 * files.
 * @author cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
final class ModelUtil {

	/**
	 * Save a collection of models to the given URI.
	 * @param modelsthe models to store in the new file
	 * @param urithe target file URI
	 * @throws IOExceptionif an error occurs while saving
	 */
	def static void saveModel(List<EObject> models, URI uri) throws IOException {
		val resourceSet= new ResourceSetImpl() 
		val resource = resourceSet.createResource(uri) 
		// Add the model objects to the contents.
		resource.getContents().addAll(models) 
		// Save the contents of the resource to the file system.
		resource.save(emptyMap) 
	}
	
    /**
     * Save a model to the given URI with a specific Injector.
     * @param model the model to store in the new file
     * @param urithe target file URI
     * @param injector the injector to use
     * @throws IOExceptionif an error occurs while saving
     */
    def static void saveModel(EObject model, URI uri, Injector injector) throws IOException {
        val resourceSet= injector.getInstance(ResourceSet)
        val resource = resourceSet.createResource(uri) 
        // Add the model objects to the contents.
        resource.getContents().add(model) 
        // Save the contents of the resource to the file system.
        resource.save(emptyMap) 
    }
	
	/** 
	 * Save a model to the given URI.
	 * @param modelthe model to store in the new file
	 * @param urithe target file URI
	 * @throws IOExceptionif an error occurs while saving
	 */
	def static void saveModel(EObject model, URI uri) throws IOException {
		var LinkedList<EObject> list=new LinkedList<EObject>() 
		list.add(model) 
		saveModel(list, uri) 
	}
}