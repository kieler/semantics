package de.cau.cs.kieler.core.model.test;

import org.eclipse.emf.ecore.EObject;

/**
 * You can use this class to load and compare two models.
 * Feed the class two models and specify compare metrics to determine if the models are somehow equal.
 * 
 * @author ssm
 *
 */

public abstract class AbstractModelComparator {
	
	protected abstract AbstractModelInformation gatherInformation(EObject eObject);
	
	protected abstract boolean compareInformation(EObject eObject1, EObject eObject2);
	
	public boolean compare(EObject eObject1, EObject eObject2) {
		return compareInformation(eObject1, eObject2);
	}

}
