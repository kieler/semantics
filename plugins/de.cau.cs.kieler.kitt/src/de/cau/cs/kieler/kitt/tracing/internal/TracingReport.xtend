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
package de.cau.cs.kieler.kitt.tracing.internal

import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kitt.tracing.TracingManager

/**
 * @author als
 *
 */
class TracingReport {
    val TracingMapping mapping;

    val EObject source;
    val sourceElementInMapping = newHashSet();
    val sourceElementInTragetMapping = newHashSet();
    val sourceElementNotInMapping = newHashSet();
    val mappedSourceElementNotInModel = newHashSet();

    val EObject target;
    val targetElementInMapping = newHashSet();
    val targetElementInTragetMapping = newHashSet();
    val targetElementNotInMapping = newHashSet();
    val mappedTargetElementNotInModel = newHashSet();

    new(Object sourceModel, Object targetModel, TracingMapping tracingMapping) {
        mapping = tracingMapping;
        if (mapping.inPlace) {
            val realSource = TracingManager.getTracingChain(sourceModel).getModels(mapping).first as EObject;
            if (realSource instanceof EObject) {
                source = realSource as EObject;
            } else {
                source = null
            }
        } else if (sourceModel instanceof EObject) {
            source = sourceModel as EObject;
        } else {
            source = null
        }
        if (targetModel instanceof EObject) {
            target = targetModel as EObject;
        } else {
            target = null
        }
        analyseMapping;
    }

    private def void analyseMapping() {
        if (source != null) {
            source.eAllContents.fold(newArrayList(source))[list, item|list.add(item); list].forEach [
                if (mapping.mapping.containsKey(it)) {
                    sourceElementInMapping.add(it);
                } else if (mapping.reverseMapping.containsKey(it)) {
                    sourceElementInTragetMapping.add(it);
                } else {
                    sourceElementNotInMapping.add(it);
                }
            ];
            mappedSourceElementNotInModel.addAll(
                mapping.mapping.keySet.filter[!sourceElementInMapping.contains(it)]);
        }
        if (target != null) {
            target.eAllContents.fold(newArrayList(target))[list, item|list.add(item); list].forEach [
                if (mapping.reverseMapping.containsKey(it)) {
                    targetElementInMapping.add(it);
                } else if (mapping.mapping.containsKey(it)) {
                    targetElementInTragetMapping.add(it);
                } else {
                    targetElementNotInMapping.add(it);
                }
            ];
            mappedTargetElementNotInModel.addAll(
                mapping.reverseMapping.keySet.filter[!targetElementInMapping.contains(it)]);
        }
    }

    def void printReport() {
        println("Mapping: " + mapping.title);
        if (sourceElementInTragetMapping.empty && sourceElementNotInMapping.empty && mappedSourceElementNotInModel.empty) {
            println(" Source Mapping: OK");
        } else {
            println(" Source Mapping:");
            println("  Elements mapped as target elements:");
            sourceElementInTragetMapping.forEach[println("   " + it)];
            println("  Elements missing in mapping:");
            sourceElementNotInMapping.forEach[println("   " + it)];
            println("  Elements missing in model:");
            mappedSourceElementNotInModel.forEach[println("   " + it)];
        }
        if (targetElementInTragetMapping.empty && targetElementNotInMapping.empty && mappedTargetElementNotInModel.empty) {
            println(" Target Mapping: OK");
        } else {
            println(" Target Mapping:");
            println("  Elements mapped as source elements:");
            targetElementInTragetMapping.forEach[println("   " + it)];
            println("  Elements missing in mapping:");
            targetElementNotInMapping.forEach[println("   " + it)];
            println("  Elements missing in model:");
            mappedTargetElementNotInModel.forEach[println("   " + it)];
        }
    }
}
