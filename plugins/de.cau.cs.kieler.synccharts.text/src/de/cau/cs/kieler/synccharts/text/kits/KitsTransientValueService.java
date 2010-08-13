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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;
import org.eclipse.xtext.util.Strings;

import de.cau.cs.kieler.core.annotations.Annotatable;
import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.expressions.CombineOperator;
import de.cau.cs.kieler.core.expressions.ExpressionsPackage;
import de.cau.cs.kieler.core.expressions.Signal;
import de.cau.cs.kieler.core.expressions.ValueType;
import de.cau.cs.kieler.core.expressions.ValuedObject;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Scope;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.text.kits.formatting.KitsValueSerializer;

/**
 * Custom {@link ITransientValueService} contributing to Kits serialization.
 * Besides the usual references {@link KitsValueSerializer} also delegates to this class.
 * 
 * @author chsch
 */
public class KitsTransientValueService extends DefaultTransientValueService {

    /**
     * Decides whether each element of an owners feature needs to be checked. Here, I want this to
     * be false except while serializing annotations and the signals of the root region: The 'tick'
     * signal should not be serialized.
     * 
     * Serialization of entryActions,... especially for regions is NOT considered yet!!
     * 
     */
    public boolean isCheckElementsIndividually(EObject owner, EStructuralFeature feature) {

        if (feature == AnnotationsPackage.eINSTANCE.getAnnotatable_Annotations()) {
            return true;
        }
        if (feature == SyncchartsPackage.eINSTANCE.getScope_Signals()
                && SyncchartsPackage.eINSTANCE.getRegion().isInstance(owner)
                && owner.eContainer() == null) {
            return true;
        }
        return false;
    }
    
    private Action t = SyncchartsFactory.eINSTANCE.createAction();

    /**
     * Decides whether an owner's feature (or one of its elements are not to be serialized).
     */
    public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {

        /* suppress the implicit (mostly EOpposites) features */
        if (feature == SyncchartsPackage.eINSTANCE.getState_ParentRegion()
                || feature == SyncchartsPackage.eINSTANCE.getScope_InterfaceDeclaration()
                || feature == SyncchartsPackage.eINSTANCE.getState_IncomingTransitions()
                || feature == SyncchartsPackage.eINSTANCE.getRegion_ParentState()
                || feature == SyncchartsPackage.eINSTANCE.getTransition_SourceState()) {
            return true;
        }

 
        /*
         * scope ids are suppressed in case of:
         * a) the root region (only one region is allowed -> no naming problems may occur!
         * b) a region has no label -> whole region declaration will be skipped
         * c) scope label != null (maybe "") and id is equal to label (label is unique)
         */
        if (feature == SyncchartsPackage.eINSTANCE.getScope_Label()) {
            if (SyncchartsPackage.eINSTANCE.getRegion().isInstance(owner)) {
                if (owner.eContainer() == null || Strings.isEmpty(((Region) owner).getLabel())) {
                    return true;
                }
            }
            Scope scope = (Scope) owner;
            return (scope.getLabel() == null || scope.getLabel().equals(scope.getId()));
        }

        
//        /*
//         * scope labels are suppressed in case of: a) region contains states and the root region b)
//         * region contains states and has no label -> whole region declaration will be skipped
//         * 
//         * scope labels are enforced in case of: a) scope is a state b) scope is an empty region
//         */
//        if (feature == SyncchartsPackage.eINSTANCE.getScope_Id()) {
//
//            /* is obsolete as fixed by the default value config of Scope.label, Scope.id */
//            // if (!owner.eIsSet(feature)) {
//            //
//            // // states MUST have defined labels -> define empty ones if necessary!
//            // // For sure, THIS IS EVIL!!!
//            // EditingDomain d = getEditingDomain(owner);
//            // if (d != null) {
//            // d.getCommandStack().execute(new SetCommand(d, owner, feature, new String()));
//            // } else {
//            // owner.eSet(feature, "");
//            // }
//            // }
//
//            if (SyncchartsPackage.eINSTANCE.getRegion().isInstance(owner)) {
//
//                if (owner.eContainer() == null || ((State) owner.eContainer()).getRegions().size() == 1) {
//                    return true;
//                }
//            }
//            return false;
//        }

        
        /* suppress the 'normal' attribute of a state */
        if (feature == SyncchartsPackage.eINSTANCE.getState_Type()) {
            return owner.eGet(feature).equals(StateType.NORMAL);
        }

        
        /* suppress the 'initialValue' feature if null or "" */
        if (feature == ExpressionsPackage.eINSTANCE.getValuedObject_InitialValue()) {
            return Strings.isEmpty((String) owner.eGet(feature));
        }

        
        /*
         * suppress the enum value of a valueObjects's 'type' feature if a) type == host && hostType
         * is set b) type == pure && combineOperator != none
         */
        if (feature == ExpressionsPackage.eINSTANCE.getValuedObject_Type()) {
            if (owner.eGet(feature).equals(ValueType.HOST)) {
                return !this.isTransient(owner,
                        ExpressionsPackage.eINSTANCE.getValuedObject_HostType(), index);
            }
            if (ExpressionsPackage.eINSTANCE.getSignal().isInstance(owner)) {
                return owner.eGet(feature).equals(ValueType.PURE)
                        && ((Signal) owner).getCombineOperator().equals(CombineOperator.NONE);
            }
        }

        
        /* do not serialize a host type if 'host' is not selected in 'type' */
        if (feature == ExpressionsPackage.eINSTANCE.getValuedObject_HostType()) {
            return !((ValuedObject) owner).getType().equals(ValueType.HOST)
                    || Strings.isEmpty((String) owner.eGet(feature));
        }

        
        /*
         * suppress the enum value of a signal's 'combineOperator' feature if a) combineOperator ==
         * host && hostCombineOperator is set b) combineOperator == none
         */
        if (feature == ExpressionsPackage.eINSTANCE.getSignal_CombineOperator()) {
            if (owner.eGet(feature).equals(CombineOperator.HOST)) {
                return !this.isTransient(owner,
                        ExpressionsPackage.eINSTANCE.getSignal_HostCombineOperator(), index);
            }
            return owner.eGet(feature).equals(CombineOperator.NONE);
        }

        
        /* do not serialize a hostCombineOperator if 'host' is not selected in 'combineOperator' */
        if (feature == ExpressionsPackage.eINSTANCE.getSignal_HostCombineOperator()) {
            return !((Signal) owner).getCombineOperator().equals(CombineOperator.HOST)
                    || Strings.isEmpty((String) owner.eGet(feature));
        }

        
        if (feature == SyncchartsPackage.eINSTANCE.getAction_Label()) {
            return Strings.isEmpty((String) owner.eGet(feature)) || !actionIsEmpty((Action) owner);
        }
        
        
//        /* suppress the transition's priority if it's the only outgoing one of its source state */
//        if (feature == SyncchartsPackage.eINSTANCE.getTransition_Priority()) {
//            if (SyncchartsPackage.eINSTANCE.getTransition().isInstance(owner)) {
//                return ((Transition) owner).getSourceState().getOutgoingTransitions().size() == 1;
//            }
//        }

        
        /* do not serialized the implicit 'tick' signal! */
        if (feature == SyncchartsPackage.eINSTANCE.getScope_Signals()
                && SyncchartsPackage.eINSTANCE.getRegion().isInstance(owner)
                && owner.eContainer() == null) {
            return ((Region) owner).getSignals().get(index).getName().equals("tick");
        }

        
        /* try not to serialize annotations that are of type unequal to StringAnnotations */
        if (feature == AnnotationsPackage.eINSTANCE.getAnnotatable_Annotations()) {
            if (AnnotationsPackage.eINSTANCE.getImportAnnotation().isInstance(
                    ((Annotatable) owner).getAnnotations().get(index))) {
                return false;
            }
            return !AnnotationsPackage.eINSTANCE.getStringAnnotation().isInstance(
                    ((Annotatable) owner).getAnnotations().get(index));
        }

        
        /* suppress residual uninitialized features */
        return !owner.eIsSet(feature) || feature.isTransient();
    }
    
    
    private boolean actionIsEmpty(Action a) {
        return a.getDelay() == 1 && a.isIsImmediate() == false
          && a.getTrigger() == null && a.getEffects().isEmpty();
    }

/* is obsolete as fixed by the default value config of Scope.label, Scope.id */	
//	/**
//	 * This is part of a rather heavy hack!
//	 * 
//	 * @param o an EObject to check the presence of an {@link EditingDomain}
//	 * @return the {@link EditingDomain} controlling the EObject o if present, null otherwise;
//	 */
//	private EditingDomain getEditingDomain(EObject o) {
//		for (Adapter a : o.eAdapters()) {
//			if (a instanceof TransactionChangeRecorder) {
//				return ((TransactionChangeRecorder) a).getEditingDomain();
//			}
//		}			
//		return null;
//	}
	
	
}
