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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;
import org.eclipse.xtext.util.Strings;

import de.cau.cs.kieler.core.annotations.Annotatable;
import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.annotations.StringAnnotation;
import de.cau.cs.kieler.core.kexpressions.CombineOperator;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Scope;
import de.cau.cs.kieler.synccharts.StateType;
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
    @Override
    public boolean isCheckElementsIndividually(EObject owner, EStructuralFeature feature) {

        if (feature == AnnotationsPackage.eINSTANCE.getAnnotatable_Annotations()) {
            return true;
        }
        if (feature == SyncchartsPackage.eINSTANCE.getScope_Signals()) {
            // check all signals in order to prevent attempts to serialize trapdecls (kies)
//                && SyncchartsPackage.eINSTANCE.getRegion().isInstance(owner)
//                && owner.eContainer() == null) {
            return true;
        }
        return false;
    }
    
    /**
     * Decides whether an owner's feature (or one of its elements are not to be serialized).
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {

        /* suppress the implicit (mostly EOpposites) features */
        if (feature == SyncchartsPackage.eINSTANCE.getState_ParentRegion()
                || feature == SyncchartsPackage.eINSTANCE.getScope_InterfaceDeclaration()
                || feature == SyncchartsPackage.eINSTANCE.getState_IncomingTransitions()
                || feature == SyncchartsPackage.eINSTANCE.getRegion_ParentState()
                || feature == SyncchartsPackage.eINSTANCE.getTransition_SourceState()
                || feature == SyncchartsPackage.eINSTANCE.getSubstitution_ParentScope()) {
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

        if (feature == SyncchartsPackage.eINSTANCE.getScope_BodyContents()) {
            return true;
        }

        if (feature == SyncchartsPackage.eINSTANCE.getScope_BodyReference()) {
            return true;
        }
        
                
        /* suppress id serialization if id is equals to "" */
        if (SyncchartsPackage.eINSTANCE.getRegion().isInstance(owner)
                && feature == SyncchartsPackage.eINSTANCE.getScope_Id()) {
            return Strings.isEmpty((String) owner.eGet(feature));
        }
        
       
        /* suppress the 'normal' attribute of a state */
        if (feature == SyncchartsPackage.eINSTANCE.getState_Type()) {
            return owner.eGet(feature).equals(StateType.NORMAL);
        }
        
        
        /* suppress the additions introduced by uru's ISignal/IVariable classes */
        if (feature == KExpressionsPackage.eINSTANCE.getISignal_ChannelDescr()
                || feature == KExpressionsPackage.eINSTANCE.getIVariable_Expression()) {
            return true;
        }
        
        
        /* suppress the 'initialValue' feature if null or "" */
        if (feature == KExpressionsPackage.eINSTANCE.getValuedObject_InitialValue()) {
            return Strings.isEmpty((String) owner.eGet(feature));
        }

        
        /*
         * suppress the enum value of a valueObjects's 'type' feature if a) type == host && hostType
         * is set b) type == pure && combineOperator != none
         */
        if (feature == KExpressionsPackage.eINSTANCE.getValuedObject_Type()) {
            if (owner.eGet(feature).equals(ValueType.HOST)) {
                return !this.isTransient(owner,
                        KExpressionsPackage.eINSTANCE.getValuedObject_HostType(), index);
            }
            if (KExpressionsPackage.eINSTANCE.getSignal().isInstance(owner)) {
                return owner.eGet(feature).equals(ValueType.PURE)
                        && ((Signal) owner).getCombineOperator().equals(CombineOperator.NONE);
            } else {
                // the type of variables is mandatory, so serialize it! 
                return false;
            }
        }

        
        /* do not serialize a host type if 'host' is not selected in 'type' */
        if (feature == KExpressionsPackage.eINSTANCE.getValuedObject_HostType()) {
            return !((ValuedObject) owner).getType().equals(ValueType.HOST)
                    || Strings.isEmpty((String) owner.eGet(feature));
        }

        
        /*
         * suppress the enum value of a signal's 'combineOperator' feature if a) combineOperator ==
         * host && hostCombineOperator is set b) combineOperator == none
         */
        if (feature == KExpressionsPackage.eINSTANCE.getSignal_CombineOperator()) {
            if (owner.eGet(feature).equals(CombineOperator.HOST)) {
                return !this.isTransient(owner,
                        KExpressionsPackage.eINSTANCE.getSignal_HostCombineOperator(), index);
            }
            return owner.eGet(feature).equals(CombineOperator.NONE);
        }

        
        /* do not serialize a hostCombineOperator if 'host' is not selected in 'combineOperator' */
        if (feature == KExpressionsPackage.eINSTANCE.getSignal_HostCombineOperator()) {
            return !((Signal) owner).getCombineOperator().equals(CombineOperator.HOST)
                    || Strings.isEmpty((String) owner.eGet(feature));
        }

        
        if (feature == SyncchartsPackage.eINSTANCE.getAction_Label()) {
            if (SyncchartsPackage.eINSTANCE.getTransition().isInstance(owner)) {
                return Strings.isEmpty((String) owner.eGet(feature)) || !actionIsEmpty((Action) owner);
            } else {
                // FIXME: the action label is not part of a parser rule yet, so it has to be marked transient
                // what about unparsable actions (drawing tool ...)??
                return true;
            }
        }
        
        
        /* suppress the transition's priority if it's the only outgoing one of its source state */
        if (feature == SyncchartsPackage.eINSTANCE.getTransition_Priority()) {
            if (SyncchartsPackage.eINSTANCE.getTransition().isInstance(owner)) {
                return ((Transition) owner).getSourceState().getOutgoingTransitions().size() == 1;
            }
        }

        
        if (feature == SyncchartsPackage.eINSTANCE.getScope_Signals()) {
            if (SyncchartsPackage.eINSTANCE.getRegion().isInstance(owner)
                    && owner.eContainer() == null) {
                /* do not serialized the implicit 'tick' signal! */
                return ((Region) owner).getSignals().get(index).getName().equals("tick");
            }
            
            // During the esterel2synccharts transformation, TrapDecls may occur in SyncCharts models.
            //  Since Traps are Esterel stuff and the SyncCharts stuff must not have any dependency
            //  on this I cannot explicitly check "instanceof TrapDecl".
            // what an evil hack ... :-(
            if (((EList<Signal>) owner.eGet(feature)).get(index).eClass().getName()
                    .startsWith("T")) {
                return true;
            } else {
                return false;
            }
        }
        
        /* try not to serialize annotations that are of type unequal to StringAnnotations */
        if (feature == AnnotationsPackage.eINSTANCE.getAnnotatable_Annotations()) {
            if (AnnotationsPackage.eINSTANCE.getImportAnnotation().isInstance(
                    ((Annotatable) owner).getAnnotations().get(index))) {
                return false;
            }
            if (AnnotationsPackage.eINSTANCE.getBooleanAnnotation().isInstance(
                    ((Annotatable) owner).getAnnotations().get(index))) {
                return false;
            }
            if (AnnotationsPackage.eINSTANCE.getIntAnnotation().isInstance(
                    ((Annotatable) owner).getAnnotations().get(index))) {
                return false;
            }
            if (AnnotationsPackage.eINSTANCE.getFloatAnnotation().isInstance(
                    ((Annotatable) owner).getAnnotations().get(index))) {
                return false;
            }
            if (AnnotationsPackage.eINSTANCE.getStringAnnotation().isInstance(
                    ((Annotatable) owner).getAnnotations().get(index))) {
                StringAnnotation a = (StringAnnotation) ((Annotatable)  owner).getAnnotations().get(index);
                return Strings.isEmpty(a.getName()) && Strings.isEmpty(a.getValue());
            }
            return true;            
        }
        
        if (AnnotationsPackage.eINSTANCE.getStringAnnotation().isInstance(owner)
                && feature == AnnotationsPackage.eINSTANCE.getNamedObject_Name()) {
            return Strings.isEmpty(((StringAnnotation) owner).getName());
        }

        
        /* suppress residual uninitialized features */
        return !owner.eIsSet(feature) || feature.isTransient();
    }
    
    
    private boolean actionIsEmpty(Action a) {
        return a.getDelay() == 1 && a.isIsImmediate() == false
          && a.getTrigger() == null && a.getEffects().isEmpty();
    }

}
