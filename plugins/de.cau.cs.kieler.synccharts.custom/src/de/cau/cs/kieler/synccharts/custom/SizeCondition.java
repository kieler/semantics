package de.cau.cs.kieler.synccharts.custom;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A special condition that checks whether referenced lists have a certain size.
 * @author schm
 *
 */
public class SizeCondition extends Condition {

	/**
	 * The constructor.
	 * @param f The feature to check.
	 * @param v The value the feature is supposed to have.
	 */
	// A type of condition that equals to true if the specified feature
	// contains a list with the specified number of elements
	public SizeCondition(EStructuralFeature f, Integer v) {
		super(f, v);
	}
	
	/**
	 * Check if the condition is fulfilled by a model element.
	 * @param modelElement The model element.
	 */
	@Override
	public boolean isValid(EObject modelElement) {
		if ((modelElement == null) || (modelElement.eGet(feature) == null) || !(modelElement.eGet(feature) instanceof EList)) {
			return false;
		}
		if (((Integer) value).intValue() == ((EList) modelElement.eGet(feature)).size()) {
			return true;
		}
		return false;
	}

}
