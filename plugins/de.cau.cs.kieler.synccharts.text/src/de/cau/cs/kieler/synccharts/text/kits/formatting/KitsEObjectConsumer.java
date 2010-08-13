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
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.parsetree.reconstr.impl.EObjectConsumer;

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
    
    
    public Object getConsumable(String featureName, boolean allowDefault) {
        if (featureName.equals(SyncchartsPackage.eINSTANCE.getScope_Label().getName())) {
            return new String();
        } else {
            return super.getConsumable(featureName, allowDefault);
        }
    }
}
