/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kitt.klighd.tracing.internal;

import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

/**
 * A HashMultimap which also provides a fast reverse mapping.
 * <p>
 * Should only be used to store immutable mappings. Changes will not be applied to reverse mapping
 * or vice versa.
 * 
 * @author als
 * @kieler.design 2014-09-23 proposed
 * @kieler.rating 2014-09-23 proposed yellow
 * 
 */
public class InternalTraceMap {

    private final HashMultimap<EObject, EObject> mapping = HashMultimap.create(10000, 10);
    private final HashMultimap<EObject, EObject> rev_mapping = HashMultimap.create(10000, 10);

    /**
     * Add a new multimapping to this mapping and its reverse version.
     * @param multimap
     */
    public void addMapping(Multimap<EObject, EObject> multimap) {
        for (Entry<EObject, EObject> entry : multimap.entries()) {
            mapping.put(entry.getKey(), entry.getValue());
            rev_mapping.put(entry.getValue(), entry.getKey());
        }
    }

    /**
     * @return the mapping
     */
    public Multimap<EObject, EObject> getMapping() {
        return Multimaps.unmodifiableMultimap(mapping);
    }

    /**
     * @return the reverse mapping
     */
    public Multimap<EObject, EObject> getReverseMapping() {
        return Multimaps.unmodifiableMultimap(rev_mapping);
    }

    /**
     * @see com.google.common.collect.AbstractSetMultimap#get(java.lang.Object)
     */
    public Set<EObject> get(EObject key) {
        return mapping.get(key);
    }

    /**
     * @see com.google.common.collect.AbstractSetMultimap#get(java.lang.Object)
     */
    public Set<EObject> getReverse(EObject key) {
        return rev_mapping.get(key);
    }

}
