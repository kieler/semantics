/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ide.kitt.tracing.compare

import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl
import org.eclipse.emf.compare.utils.UseIdentifiers
import org.eclipse.emf.compare.scope.FilterComparisonScope
import java.util.LinkedList
import de.cau.cs.kieler.kicool.kitt.tracing.ITracingTreeComparator

/**
 * Implementation for TracingTree comparison, using EMF compare.
 * 
 * @author wechselberg
 */
class EMFCompareTracingTreeComparator implements ITracingTreeComparator {

    val LinkedList<Class<? extends EObject>> matchIgnoreClasses = new LinkedList;

    /**
     * Returns a mutable list of classes which instances should be excluded in matching process.
     * A matching is started when calling {@link findModelInTree} to check if the given model instance 
     * matches the model internally stored by EObjectWrapper in a ModelWrapper.
     * @returns list of ignored classes for matching
     */
    def getMatchIgnoreClasses() {
        matchIgnoreClasses;
    }    
    
    override HashMap<EObject, EObject> matchModels(EObject left, EObject right) {
        if (left === null || right === null) {
            return null;
        }
  
        val builder = EMFCompare.builder()
        builder.matchEngineFactoryRegistry = new MatchEngineFactoryRegistryImpl() => [
            val matchEngineFactory = new MatchEngineFactoryImpl(UseIdentifiers.NEVER)
            matchEngineFactory.setRanking(1000)
            add(matchEngineFactory)
        ]
        val comparator = builder.build

        val scope = new FilterComparisonScope(left, right, null);
        scope.setEObjectContentFilter(
            [ EObject eo |
                matchIgnoreClasses.forall [
                    !it.isInstance(eo);
                ]
            ]);
        val comparison = comparator.compare(scope);

        if (comparison.differences.empty && comparison.matches.size == 1) {
            val map = new HashMap(left.eAllContents.size);
            comparison.matches.forEach [
                map.put(it.left, it.right);
                it.allSubmatches.forEach [
                    map.put(it.left, it.right);
                ];
            ];
            return map;
        }
        return null;
    }}
