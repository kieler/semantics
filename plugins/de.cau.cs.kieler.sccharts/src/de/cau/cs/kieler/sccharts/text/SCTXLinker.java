/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.text;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.IDiagnosticProducer;
import org.eclipse.xtext.linking.impl.Linker;


/**
 * A customized Xtext linker linking textual SCCharts models.
 *
 * @author als
 */

public class SCTXLinker extends Linker {

    @Override
    protected boolean isClearAllReferencesRequired(Resource resource) {
        if (resource instanceof SCTXResource) {
            return ((SCTXResource) resource).getClearReferencesBeforeLinking();
        } else {
            return super.isClearAllReferencesRequired(resource);
        }
    }

    @Override
    public void beforeEnsureIsLinked(EObject obj, EReference ref, IDiagnosticProducer producer) {
        checkUncontainedOpposites(obj, ref);
    }

    /**
     * Finds and removes elements in eOpposite references which are no longer contained in the
     * model.
     * 
     * @param obj
     * @param ref
     */
    public static void checkUncontainedOpposites(EObject obj, EReference ref) {
        EReference oppRef = ref.getEOpposite();
        if (oppRef != null) {
            if (ref.isMany()) {
                @SuppressWarnings("unchecked")
                EList<EObject> refObjs = (EList<EObject>) obj.eGet(ref);
                if (refObjs != null) {
                    // Remove non-contained opposites
                     refObjs.removeIf(new Predicate<EObject>() {
                        Set<EObject> exists = new HashSet<EObject>();

                        @Override
                        public boolean test(EObject t) {
                            boolean remove = t.eContainer() == null || t.eGet(oppRef) == null; 
                            if (!remove) exists.add(t);
                            return remove;
                        }
                    });
                }
            } else {
                EObject refObj = (EObject) obj.eGet(ref);
                if (refObj != null) {
                    // Remove non-contained opposites
                    if (refObj.eContainer() == null) {
                        obj.eSet(ref, null);
                    }
                }
            }
        }
    }
}
