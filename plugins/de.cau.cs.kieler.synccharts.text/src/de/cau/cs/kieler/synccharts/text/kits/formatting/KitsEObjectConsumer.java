/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.text.kits.formatting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.parsetree.reconstr.impl.EObjectConsumer;

import de.cau.cs.kieler.synccharts.Scope;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * Special {@link IEObjectConsumer} with customized behavior.
 * Allows serialization of uninitialized labels (-> "").
 *   
 * @author chsch
 */
public class KitsEObjectConsumer extends EObjectConsumer {
    
    public KitsEObjectConsumer(ITransientValueService transientValueService, EObject described) {
        super(transientValueService, described);
    }
    
    /**
     * Customized version of {@link EObjectConsumer#getConsumable(String, boolean)}.
     * Delegates to super method first.
     * 
     * In case the null value is returned and a scope's label is processed return something
     * unequal to null, which will lead to further investigation about serializing this value!
     * 
     * Here, the empty String is returned as this is the intended value to be dumped out, finally.
     */
    public Object getConsumable(String featureName, boolean allowDefault) {
        Object o = super.getConsumable(featureName, allowDefault);
//        if (o == null
//                && SyncchartsPackage.eINSTANCE.getScope().isInstance(getEObject())
//                && ((Scope) getEObject()).getLabel() == null
//                && featureName.equals(SyncchartsPackage.eINSTANCE.getScope_Label().getName())) {
//            return new String();
//        }
        return o;
    }
    
    
//    public IEObjectConsumer cloneAndConsume(String featureName) {
//        IEObjectConsumer res = super.cloneAndConsume(featureName);
//        
//        
//        EStructuralFeature feature = getFeature(featureName);
//        int[] consumedFeatureId = new int[nextFeatureId.length];
//        System.arraycopy(nextFeatureId, 0, consumedFeatureId, 0, nextFeatureId.length);
//        int featureId = described.eClass().getFeatureID(feature);
//        consumedFeatureId[featureId] = nextID(feature, consumedFeatureId[featureId]);
//        return new EObjectConsumer(transientValueService, described, consumedFeatureId, multiFeatures);
//    }
//
//    private EStructuralFeature getFeature(String feature) {
//        return getEObject().eClass().getEStructuralFeature(feature);
//    }
//
//    private KitsEObjectConsumer(EObjectConsumer c) {
//        super(c., c.getEObject());
//    }

}
