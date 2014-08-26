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
package de.cau.cs.kieler.kitt.tracing

import com.google.common.collect.HashMultimap
import java.util.HashSet
import org.eclipse.emf.ecore.EObject

/**
 * Utility class to perform a transitive join on tracing chains used by {@link ModelTracingManager}.
 * <p>
 * For TracingTree use TracingTreeExtensions.joinWrapperMappings
 * 
 * @author als
 * @kieler.design 2014-08-11 proposed
 * @kieler.rating 2014-08-11 proposed yellow
 */
class TransitiveChainJoinUtil {

    /**
     * Performs a transitive join of all mappings between source and target model in given chain.
     * 
     * @param source the source model.
     * @param target the target model.
     * @param chain tracing chain containing both source and target.
     * @return Returns a multi-mapping from objects of source model to target model objects. 
     *      Returns null mapping cannot be joined.
     */
    def join(EObject source, EObject target, ModelTracingManager.TracingChain chain) {
        if (source != null && target != null && chain != null) {
            val mapping = HashMultimap.create();
            if (source == target) { // trivial case: mapping to itself
                val index = chain.models.indexOf(source);
                if (index < chain.mappings.size()) {
                    chain.mappings.get(index).keys.forEach[mapping.put(it, it)];
                } else if (index > 0 && index == chain.mappings.size()){
                    chain.mappings.get(index-1).values.forEach[mapping.put(it, it)];
                }
            } else {
                var index = 0;
                var joining = false;
                var reverse = false;
                while (index < chain.models.size()) { //resolve path
                    val models = chain.models.get(index);
                    if (models == source || models == target) { //if start or end of joining reached
                        if (joining) {

                            //if end point is source the produced mapping must be reverted
                            if (models == source) {
                                reverse = true;
                            }

                            //stop joining
                            joining = false;
                        } else {

                            //start joining
                            joining = true;
                        }
                    }
                    if (joining) {
                        if (mapping.empty) { // initial mapping
                            mapping.putAll(chain.mappings.get(index) ?: HashMultimap::create());
                        } else if (index < chain.mappings.size()) {
                            val map = chain.mappings.get(index);

                            //Replace all values by new values of additional joined (next) mapping
                            mapping.keySet.forEach [
                                //resolve elementTransformation for all values and replace value
                                val values = mapping.get(it).map [
                                    map.get(it)
                                ].fold(new HashSet) [ first, second | //fold new values into one set
                                    first.addAll(second);
                                    first; //return first as container of next folding
                                ];
                                mapping.replaceValues(it, values);
                            ];
                        }
                    }
                    index = index + 1;
                }

                //revert mapping if necessary
                if (reverse) {
                    val reverseMap = HashMultimap::create();
                    mapping.keys.forEach [ key |
                        mapping.get(key).forEach [ value |
                            reverseMap.put(value, key);
                        ];
                    ];
                    return reverseMap;
                } else {
                    return mapping;
                }
            }
        }
        return null;
    }

}
