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
package de.cau.cs.kieler.esterel.scoping;

import java.util.List;

import org.eclipse.xtext.resource.IEObjectDescription;

/**
 * interface specifying a scoping function. Determines the way an element is handled and which
 * information is extracted and added to the list of scope elements.
 * 
 * @author uru
 * 
 * @param <T>
 */
public abstract class ScopeFunction<T> {

    /**
     * collects all the elements needed for this specific scope.
     * 
     * @param element
     *            object holding the scoping information.
     * @param scopeElems
     *            list to add the scope elements to.
     */
    abstract void collect(final T element, final List<IEObjectDescription> scopeElems);

    /**
     * merges this function with the one passed as argument and returns a new instance.
     * 
     * @param other
     *            other function
     * @return merged ScopeFunction
     */
    public ScopeFunction<T> merge(final ScopeFunction<T> other) {
        final ScopeFunction<T> parent = this;
        final ScopeFunction<T> merged = new ScopeFunction<T>() {
            void collect(final T element, final List<IEObjectDescription> scopeElems) {
                parent.collect(element, scopeElems);
                other.collect(element, scopeElems);
            };
        };
        return merged;
    }
}
