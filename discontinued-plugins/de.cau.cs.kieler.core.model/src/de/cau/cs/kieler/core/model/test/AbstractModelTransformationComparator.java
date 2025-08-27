/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time & Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.test;

import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.framework.Bundle;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.transformations.AbstractModelTransformation;


/**
 * You can use this class to compare an applied transformation with a model.
 * This enables you to determine if your transformation is correct.
 * The class expects the source model, an injector, the transformation to apply and the target model.<br/>
 * Also, the class loads the model for you. By default, the test models are expected to reside inside
 * the bundle but you can overwrite this default behaviour.
 * 
 * @author ssm
 * @kieler.design 2014-01-14 proposed 
 * @kieler.rating 2014-01-14 proposed yellow
 *
 */
public abstract class AbstractModelTransformationComparator {

    /**    
     * @return Return an injector to be used.
     */
    protected abstract Injector getResourceInjector();
    
    /**
     * @return Return an model comparator to be used.
     */
    protected abstract AbstractModelComparator getModelComparator();	
	
    /**
     * USe this method to compare two models and a transformation between them.<br/>
     * The models are loaded and the transformed source model is compared to the destination model.
     * 
     * @param source
     *          the source model
     * @param transformationClass
     *          the transformation class
     * @param target
     *          the target model
     * @return Returns true if the transformed source model is somehow identical to the target model.
     */
    public boolean compare(URL source, Class<? extends AbstractModelTransformation> transformationClass, URL target) {
        // Load both models. Exit if one is null.
	EObject sourceModel = loadModel(source);
	EObject targetModel = loadModel(target);
	if (sourceModel == null || targetModel == null) return false;
		
	// Retrieve the actual transformation.
	AbstractModelTransformation transformation = 
	        Guice.createInjector().getInstance(transformationClass);
	
	// Transform the model and retrieve the comparator.
	EObject transformedModel = transformation.transform(sourceModel);
	AbstractModelComparator modelComparator = getModelComparator();

	// Compare the transformed model with the target model.
	boolean result = modelComparator.compare(transformedModel, targetModel);

	// Unload the models and return the result.
	sourceModel.eResource().unload();
	targetModel.eResource().unload();
		
	return result;
    }
	
    /**
     * Does the actual loading of the model.
     * 
     * @param source
     *          the source URL of the model.
     * @return Returns the root object of the model.
     */
    private EObject loadModel(URL source) {
        // Retrieve the injector and create an URI.
	EObject model = null;
	Injector injector = getResourceInjector();
	URI input = URI.createURI(source.toString());
		
	// If we have an injector, load the input into a resource and retrieve the contents.
	if (injector != null) {
		ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
		Resource resource = resourceSet.getResource(input, true);
		model = resource.getContents().get(0);
	}
	
	// Return the model root.
	return model;
    }
    
    /**
     * Compares two models residing inside a bundle.
     * 
     * @param pluginId 
     *          the ID of the plugin bundle
     * @param modelPath
     *          the path to the model
     * @param sourceModel
     *          the name of the source model relative to the model path
     * @param transformationClass
     *          the class of the transformation
     * @param targetModel
     *          the name of the target model relative to the model path
     */
    public boolean compareModelsInBundle(String pluginId, String modelPath, 
            String sourceModel, Class<? extends AbstractModelTransformation> transformationClass, 
            String targetModel) {
        final Bundle bundle = Platform.getBundle(pluginId);

        URL sourceModelLocation = bundle.getEntry(modelPath + sourceModel);
        URL targetModelLocation = bundle.getEntry(modelPath + targetModel);
            
        return compare(sourceModelLocation, transformationClass, targetModelLocation);
    }

}
