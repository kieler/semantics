/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.custom;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * This class represents conditions which consist of a feature and a value that the feature is supposed to have.
 * @author schm
 *
 */
// A class to represent conditions; a condition contains a feature and a value
// that the feature is supposed to have for the condition to be fulfilled
public class Condition {
	protected EStructuralFeature feature;
	protected Object value;
	
	/**
	 * The constructor.
	 * @param f The feature.
	 * @param v The value of the feature.
	 */
	public Condition (EStructuralFeature f, Object v) {
		feature = f;
		value = v;
	}
	
	/**
	 * Return the feature of the condition.
	 * @return The feature.
	 */
	public EStructuralFeature getFeature() {
		return feature;
	}
	
	/**
	 * Return the value of the condition.
	 * @return The value.
	 */
	public Object getValue() {
		return value;
	}
	
	/**
	 * Check if this condition is fulfilled by a model element.
	 * @param modelElement The model element to check.
	 * @return True if fulfilled, false otherwise.
	 */
	// This method checks if the condition is fulfilled
	public boolean isValid(EObject modelElement) {
		if ((modelElement == null) || (modelElement.eGet(feature) == null)) {
			return false;
		}
		if (value.equals(modelElement.eGet(feature))) {
			return true;
		}
		return false;
	}
}
