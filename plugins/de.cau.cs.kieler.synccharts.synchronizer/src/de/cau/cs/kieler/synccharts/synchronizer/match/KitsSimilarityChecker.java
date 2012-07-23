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
package de.cau.cs.kieler.synccharts.synchronizer.match;

import org.eclipse.emf.compare.FactoryException;
import org.eclipse.emf.compare.match.engine.AbstractSimilarityChecker;
import org.eclipse.emf.compare.match.statistic.MetamodelFilter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.util.EcoreUtil;
//import org.eclipse.xtext.EcoreUtil2;
//
//import de.cau.cs.kieler.synccharts.Scope;
//import de.cau.cs.kieler.synccharts.SyncchartsPackage;


/**
 * Customized {@link AbstractSimilarityChecker} allowing to influence the match behaviour.
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class KitsSimilarityChecker extends AbstractSimilarityChecker {

	private AbstractSimilarityChecker delegate = null;
	
	public KitsSimilarityChecker(MetamodelFilter filter,
			AbstractSimilarityChecker theDelegate,
			EObject leftObject,
			EObject rightObject) {
		super(filter);
		this.delegate = theDelegate;
	}
	
	@Override
	public boolean isSimilar(EObject obj1, EObject obj2)
			throws FactoryException {
		return delegate.isSimilar(obj1, obj2);
	}

	@Override
	public double absoluteMetric(EObject obj1, EObject obj2)
			throws FactoryException {
		
//		if (SyncchartsPackage.eINSTANCE.getScope().isInstance(obj1)
//				&& SyncchartsPackage.eINSTANCE.getScope().isInstance(obj2)) {
//			Scope scope1 = (Scope) obj1;
//			Scope scope2 = (Scope) obj2; 
//			boolean equalClass = obj1.eClass().equals(obj2.eClass());
//			boolean equalId = scope1.getId().equals(scope2.getId());
//			boolean equalLabel = scope1.getLabel().equals(scope2.getLabel());
//			
//			boolean equalCountSignals = scope1.getSignals().size() == scope2.getSignals().size();
//			boolean equalCountVariables = scope1.getVariables().size() == scope2.getVariables().size();
//			
//		}
		
		return delegate.absoluteMetric(obj1, obj2);
	}
	
	@Override
	public void init(EObject leftObject, EObject rightObject)
			throws FactoryException {
		// not needed
	}

	@Override
	public void init(Resource leftResource, Resource rightResource)
			throws FactoryException {
		// not needed
	}

}
