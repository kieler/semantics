package de.cau.cs.kieler.s.formatting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;

public class STransientService extends DefaultTransientValueService {

    public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
    	
    	// chsch & cmot: if element to serialize is an ISignal and processing input or output features then
    	// do not serialize isInput or isOutput flags (because they are not part of ISignal)
    	if (KExpressionsPackage.eINSTANCE.getISignal().isInstance(owner)
    			&& (KExpressionsPackage.eINSTANCE.getSignal_IsInput().equals(feature)
    			      || KExpressionsPackage.eINSTANCE.getSignal_IsOutput().equals(feature))
    			) {
    		return true;
    	}
    	
        return !owner.eIsSet(feature);
    }    
    
}
