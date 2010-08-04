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
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.reconstr.ITokenSerializer;
import org.eclipse.xtext.parsetree.reconstr.impl.ValueSerializer;

import com.google.inject.Inject;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * customized {@link ITokenSerializer.IValueSerializer}.
 * Realizes the output of the optional keyword state
 * and empty state labels
 */
public class KitsValueSerializer extends ValueSerializer {
	
	@Inject
	IGrammarAccess grammarAccess;

	
	/**
	 * Declares any value of a state's label to be accepted.
	 * This is needed for serialization of empty labels.
	 * One Exception: Don't mention the root region!
	 */
	public boolean isValid(EObject context, RuleCall ruleCall, Object value, IErrorAcceptor errorAcceptor) {
		
		// Don't mention the root region and unnamed regions!
		if (SyncchartsPackage.eINSTANCE.getRegion().isInstance(context)
				&& (context.eContainer() == null 
						|| ((Region) context).getLabel() == null
						|| ((Region) context).getLabel().equals(""))) {
			return false;
		}
		
		// if we have a state under consideration and are processing the call of a
		//  parser rule called from an assignment to a ecore feature of the state
		if (SyncchartsPackage.eINSTANCE.getScope().isInstance(context)
				&& XtextPackage.eINSTANCE.getAssignment().isInstance(ruleCall.eContainer())) {
			
			Assignment a = (Assignment) ruleCall.eContainer();
			
			// if the feature the assignment is made to is the label feature
			if (a.getFeature().equals(SyncchartsPackage.eINSTANCE.getScope_Label().getName())) {
				
				// any value is OK
				return true;
			}
		}
		return super.isValid(context, ruleCall, value, errorAcceptor);
	}
	

	/**
	 * Determines the output of the state labels.
	 * Distinguishes the empty labels, one word labels any multi word labels
	 */
	public String serializeAssignedValue(EObject context, RuleCall ruleCall, Object value, AbstractNode node) {
		
		// if we have a state under consideration and are processing the call of a
		//  parser rule called from an assignment to a ecore feature of the state
		if (SyncchartsPackage.eINSTANCE.getScope().isInstance(context)
				&& XtextPackage.eINSTANCE.getAssignment().isInstance(ruleCall.eContainer())) {
			
			Assignment a = (Assignment) ruleCall.eContainer();
			
			// if the feature the assignment is made to is the label feature
			if (a.getFeature().equals(SyncchartsPackage.eINSTANCE.getScope_Label().getName())) {
				
				// get the label
				String label = (String) value;
				
				// if it is set and is non-empty
				if (label!= null && !label.equals("")) {
					
					if (label.indexOf(' ') == -1)  {
						// no spaces within the label
						return label;
					} else {
						// label contains spaces
						return "\"" + label + "\"";
					}
				}
				// otherwise print "" at the label's position in the kits file
				else {
					return "\"\"";
				}
			}
		}
		
		return super.serializeAssignedValue(context, ruleCall, value, node);
	}
	
	
	/**
	 * Customized Computation of serialized output fragments.
	 * In particular, this serializes the keyword state, no matter it was mentioned in the source.
	 */
	public String serializeUnassignedValue(EObject context, RuleCall ruleCall, AbstractNode node) {
		if (SyncchartsPackage.eINSTANCE.getState().isInstance(context)) {
			return new String("state");
		}
		return super.serializeUnassignedValue(context, ruleCall, node);
	}
}
