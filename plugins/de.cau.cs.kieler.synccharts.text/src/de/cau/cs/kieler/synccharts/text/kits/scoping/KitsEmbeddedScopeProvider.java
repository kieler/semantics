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
package de.cau.cs.kieler.synccharts.text.kits.scoping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Scope;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * Specialized version of {@link KitsScopeProvider} for embedded Kits.
 * 
 * @author chsch
 */
public class KitsEmbeddedScopeProvider extends KitsScopeProvider {

    public static Scope logicalContainer = null;

    public IScope scope_Transition_targetState(Transition trans, EReference reference) {
        List<IEObjectDescription> l;
        if (trans.eContainer().eContainer() == null) {
            l = new ArrayList<IEObjectDescription>();
            l.add(new EObjectDescription(QualifiedName.create(((State) trans.eContainer()).getId()),
                    trans.eContainer(), Collections.EMPTY_MAP));
            if (SyncchartsPackage.eINSTANCE.getRegion().isInstance(logicalContainer)) {
                for (State s : ((Region) logicalContainer).getStates()) {
                    l.add(new EObjectDescription(QualifiedName.create(s.getId()), s,
                            Collections.EMPTY_MAP));
                }
            }
            return new SimpleScope(l);
        } else {
            return super.scope_Transition_targetState(trans, reference);
        }
    }

    /**
     * A implementation of scoping for signals and variables. Won't be called directly but via
     * reflection by the Xtext runtime. Delegates to
     * {@link KitsScopeProvider#scope_ValuedObject(EObject, EReference, State)}.
     * 
     * @param trans
     * @param reference
     * @return
     */
    public IScope scope_ValuedObjectReference_valuedObject(final EObject obj,
            final EReference reference) {
        return new SimpleScope(this.scope_ValuedObject(obj, reference, logicalContainer));
    }

    /**
     * A implementation of scoping for signal emissions. Won't be called directly but via reflection
     * by the Xtext runtime. Delegates to
     * {@link KitsScopeProvider#scope_Signal(EObject, EReference, State)}.
     * 
     * @param obj
     * @param reference
     * @return
     */
     public IScope scope_Emission_signal(final EObject obj, final EReference reference) {
//    public IScope scope_Signal(final EObject obj, final EReference reference) {
        return new SimpleScope(this.scope_Signal(obj, reference, logicalContainer));
    }

    /**
     * A implementation of scoping for variable assignments. Won't be called directly but via
     * reflection by the Xtext runtime. Delegates to
     * {@link KitsScopeProvider#scope_Variable(EObject, EReference, State)}.
     * 
     * @param obj
     * @param reference
     * @return
     */
     public IScope scope_Assignment_variable(final EObject obj, final EReference reference) {
//    public IScope scope_Variable(final EObject obj, final EReference reference) {
        return new SimpleScope(this.scope_Variable(obj, reference, logicalContainer));
    }
}
