/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.interfacedeclparser.scoping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on
 * how and when to use it
 * 
 * @author uru
 * @author car
 * 
 */
public class InterfaceDeclScopeProvider extends
        AbstractDeclarativeScopeProvider {

    /**
     * parent state.
     */
    private static State parent;

    /**
     * Getter for the parent.
     * 
     * @return the parent
     */
    public static State getParent() {
        return parent;
    }

    /**
     * Setter for the parent.
     * 
     * @param parentParam
     *            the parent to set
     */
    public static void setParent(final State parentParam) {
        InterfaceDeclScopeProvider.parent = parentParam;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IScope getScope(final EObject context, final EReference reference) {
        if (parent != null) {
            Iterable<IEObjectDescription> li = getElements(parent);
            return new SimpleScope(li);
        }
        // this is likely to return the NULLSCOPE
        return super.getScope(context, reference);
    }

    /**
     * only the contained regions need to be scoped.
     * 
     * @param parentState
     *            state containing the regions being scoped
     * @return
     */
    private Iterable<IEObjectDescription> getElements(final State parentState) {
        ArrayList<IEObjectDescription> elements = new ArrayList<IEObjectDescription>();

        for (Region r : parentState.getRegions()) {
            Map<String, String> map = new HashMap<String, String>();
            elements.add(new EObjectDescription(r.getId(), r, map));
        }

        return elements;
    }

}
