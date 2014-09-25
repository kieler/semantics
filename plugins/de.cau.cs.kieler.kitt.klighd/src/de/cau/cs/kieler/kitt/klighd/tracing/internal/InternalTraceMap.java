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

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

import de.cau.cs.kieler.kitt.tracing.internal.TracingMapping;

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

    private final HashMultimap<Object, Object> mapping = HashMultimap.create(10000, 10);
    private final HashMultimap<Object, Object> rmapping = HashMultimap.create(10000, 10);

    /**
     * Add a new multimapping to this mapping and its reverse version.
     * @param multimap
     */
    public void addMapping(Multimap<Object, Object> multimap) {
        for (Entry<Object, Object> entry : multimap.entries()) {
            mapping.put(entry.getKey(), entry.getValue());
            rmapping.put(entry.getValue(), entry.getKey());
        }
    }


    /**
     * Add a new tracing mapping to this mapping and its reverse version.
     * @param multimap
     */
    public void addMapping(TracingMapping traceMapping) {
        mapping.putAll(traceMapping.getMapping());
        rmapping.putAll(traceMapping.getReverseMapping());
    }
    
    /**
     * @return the mapping
     */
    public Multimap<Object, Object> getMapping() {
        return Multimaps.unmodifiableMultimap(mapping);
    }

    /**
     * @return the reverse mapping
     */
    public Multimap<Object, Object> getReverseMapping() {
        return Multimaps.unmodifiableMultimap(rmapping);
    }

    /**
     * @see com.google.common.collect.AbstractSetMultimap#get(java.lang.Object)
     */
    public Set<Object> get(Object key) {
        return mapping.get(key);
    }

    /**
     * @see com.google.common.collect.AbstractSetMultimap#get(java.lang.Object)
     */
    public Set<Object> getReverse(Object key) {
        return rmapping.get(key);
    }

}
