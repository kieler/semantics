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
		if (feature == SyncchartsPackage.eINSTANCE.getScope_Id()) {
			if (owner.eContainer() == null ) {
				return true;
			}
			Scope scope = (Scope) owner;
			return scope.getLabel() != null 
					&& (scope.getId() == null || scope.getLabel().equals(scope.getId()));
		}		
		if (feature == SyncchartsPackage.eINSTANCE.getState_Type()) {
			return owner.eGet(feature).equals(StateType.NORMAL);
		}
		
		if (feature == SyncchartsPackage.eINSTANCE.getTransition_Priority()) {
			if (SyncchartsPackage.eINSTANCE.getTransition().isInstance(owner)) {
				return ((Transition) owner).getSourceState().getOutgoingTransitions().size() == 1;
			}
		}
		
		if (feature == SyncchartsPackage.eINSTANCE.getScope_Label()
				&& SyncchartsPackage.eINSTANCE.getScope().isInstance(owner)) {
			if (owner.eContainer() == null ) {
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
