package de.cau.cs.kieler.s.formatting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;

public class STransientService extends DefaultTransientValueService {

    public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
        boolean returnValue = (!owner.eIsSet(feature));
        return returnValue;
    }    
    
}
