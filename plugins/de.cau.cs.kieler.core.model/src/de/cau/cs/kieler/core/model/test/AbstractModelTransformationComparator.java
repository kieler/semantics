package de.cau.cs.kieler.core.model.test;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.transformations.AbstractModelTransformation;

/**
 * You can use this class to compare an applied transformation with a model.
 * This enables you to determine if your transformation is correct.
 * The class expects the source model, an injector, the transformation to apply and the target model.
 * 
 * @author ssm
 *
 */

public abstract class AbstractModelTransformationComparator {
	
	protected abstract Injector getResourceInjector();
	
	protected abstract AbstractModelComparator getModelComparator();	
	
	public boolean compare(File source, Class<? extends AbstractModelTransformation> transformationClass, File target) {
		EObject sourceModel = loadModel(source);
		EObject targetModel = loadModel(target);
		if (sourceModel == null || targetModel == null) return false;
		
		AbstractModelTransformation transformation = 
				Guice.createInjector().getInstance(transformationClass);
		
		EObject transformedModel = transformation.transform(sourceModel);
		AbstractModelComparator modelComparator = getModelComparator();
		
		boolean result = modelComparator.compare(transformedModel, targetModel);
		
		sourceModel.eResource().unload();
		targetModel.eResource().unload();
		
		return result;
	}
	
	private EObject loadModel(File source) {
		EObject model = null;
		Injector injector = getResourceInjector();
//		URI input = URI.createPlatformResourceURI(source.getPath().toString(), true);
		URI input = URI.createFileURI(source.getPath().toString());
		
		if (injector != null) {
			ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
			Resource resource = resourceSet.getResource(input, true);
			model = resource.getContents().get(0);
		}
		
		return model;
	}

}
