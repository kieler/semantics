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

import org.eclipse.emf.ecore.EObject;

/**
 * You can use this class interface to derive a specialized class that compares two models.
 * Feed the class two models and specify compare metrics to determine if the models are somehow equal.<br/>
 * Of course your can simply use tools such as EMF compare to do the comparison but that might not be desired. 
 * You can control your comparison by overwriting the appropriate methods.
 * 
 * @author ssm
 * @kieler.design 2014-01-14 proposed 
 * @kieler.rating 2014-01-14 proposed yellow
 */
public abstract class AbstractModelComparator {

        /** 
         * Is meant to fill a model information structure with the specific information of the given model.
         * Overwrite this method to fill your information class.
         * 
         * @param eObject
         *              the model in question
         * @return Returns a filled model information (specialization).
         */
	protected abstract AbstractModelInformation gatherInformation(EObject eObject);
	
	/**
	 * Is meant to do the actual comparison of two models. 
	 * Overwrite this method to compare your models.
	 * 
	 * @param eObject1
	 *             the first model
	 * @param eObject2
	 *             the second model
	 * @return Returns true if the models are identical with respect to the model information structure.
	 */
	protected abstract boolean compareModels(EObject eObject1, EObject eObject2);
	
	/**
	 * Simply use compare (everywhere) to compare your models. 
	 * 
	 * @param eObject1
	 *             the first model
	 * @param eObject2
	 *             the second model
	 * @return Returns trie if the models are identical with respect to the model information structure.
	 */
	public boolean compare(EObject eObject1, EObject eObject2) {
		return compareModels(eObject1, eObject2);
	}

}
