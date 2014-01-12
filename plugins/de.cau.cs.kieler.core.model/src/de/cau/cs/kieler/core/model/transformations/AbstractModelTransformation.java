package de.cau.cs.kieler.core.model.transformations;

import org.eclipse.emf.ecore.EObject;

/**
 * Interface for transformation classes
 * 
 * @author ssm
 *
 */

public abstract class AbstractModelTransformation {
	public abstract EObject transform(EObject eObject);
}
