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
package de.cau.cs.kieler.synccharts.text.kits;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.impl.TransactionChangeRecorder;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Scope;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * Custom {@link ITransientValueService} contributing to Kits serialization.
 * 
 * @author chsch
 */
public class KitsTransientValueService extends DefaultTransientValueService {

	@Override
	public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		
		if (feature == SyncchartsPackage.eINSTANCE.getState_ParentRegion() 
			|| feature == SyncchartsPackage.eINSTANCE.getScope_InterfaceDeclaration()
			|| feature == SyncchartsPackage.eINSTANCE.getState_IncomingTransitions()
			|| feature == SyncchartsPackage.eINSTANCE.getRegion_ParentState()
			|| feature == SyncchartsPackage.eINSTANCE.getTransition_SourceState()
			) {
			return true;
		}
		

		/* scope ids are suppressed in case of:
		 * a) the root region
		 * b) a region has no label -> whole region declaration will be skipped
		 * c) scope label != null (maybe "") and id is equal to label (label is unique)  
		 */		
		if (feature == SyncchartsPackage.eINSTANCE.getScope_Id()) {
			if (SyncchartsPackage.eINSTANCE.getRegion().isInstance(owner)
					&& (owner.eContainer() == null 
							|| ((Region) owner).getLabel() == null
							|| ((Region) owner).getLabel().equals(""))) {
				return true;
			}
			Scope scope = (Scope) owner;
			return scope.getLabel() != null 
					&& (scope.getId() == null || scope.getLabel().equals(scope.getId()));
		}

		
		/* scope labels are suppressed in case of:
		 * a) the root region
		 * b) a region has no label -> whole region declaration will be skipped
		 * 
		 * states MUST have defined labels -> define empty ones if necessary!
		 * For sure, THIS IS EVIL!!!
		 */		
		if (feature == SyncchartsPackage.eINSTANCE.getScope_Label()) {
			if (SyncchartsPackage.eINSTANCE.getRegion().isInstance(owner)
					&& (owner.eContainer() == null 
							|| ((Region) owner).getLabel() == null
							|| ((Region) owner).getLabel().equals(""))) {
				return true;
			}
			if (!owner.eIsSet(feature)) {
				
				// this is a heavy hack making sure a label is present to be serialized
				EditingDomain d = getEditingDomain(owner);
				if (d != null) {
					d.getCommandStack().execute(new SetCommand(d, owner, feature, new String()));
				} else {
					owner.eSet(feature, "");
				}
			}
			return false;
		}		
		
		/* suppress the 'normal' attribute of a state */
		if (feature == SyncchartsPackage.eINSTANCE.getState_Type()) {
			return owner.eGet(feature).equals(StateType.NORMAL);
		}
		
		/* suppress the transition's priority if it's the only outgoing one of its source state*/
		if (feature == SyncchartsPackage.eINSTANCE.getTransition_Priority()) {
			if (SyncchartsPackage.eINSTANCE.getTransition().isInstance(owner)) {
				return ((Transition) owner).getSourceState().getOutgoingTransitions().size() == 1;
			}
		}		
		
		/* suppress further undefined features */
		return !owner.eIsSet(feature); // || feature.isTransient();
	}

	
	
	/**
	 * This is part of a rather heavy hack!
	 * 
	 * @param o an EObject to check the presence of an {@link EditingDomain}
	 * @return the {@link EditingDomain} controlling the EObject o if present, null otherwise;
	 */
	private EditingDomain getEditingDomain(EObject o) {
		for (Adapter a : o.eAdapters()) {
			if (a instanceof TransactionChangeRecorder) {
				return ((TransactionChangeRecorder) a).getEditingDomain();
			}
		}			
		return null;
	}
	
	
}
