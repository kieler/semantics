package de.cau.cs.kieler.synccharts.custom;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SizeCondition extends Condition {

	// A type of condition that equals to true if the specified feature
	// contains a list with the specified number of elements
	public SizeCondition(EStructuralFeature f, Integer v) {
		super(f, v);
	}
	
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
