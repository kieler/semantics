/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.scg.processors

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import java.util.Set
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.scg.GuardDependency
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import java.util.List
import de.cau.cs.kieler.scg.processors.IAnnotationModelCreator

/** 
 * @author ssm
 * @kieler.design 2019-02-26 proposed 
 * @kieler.rating 2019-02-26 proposed yellow
 */
class SCChartsAnnotationModelCreatorForUnschedulableNodes implements IAnnotationModelCreator {
    
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCGDependencyExtensions
    
    override create(Object annotationObject, Environment environment) {
        val originalModel = environment.getProperty(Environment.ORIGINAL_MODEL)
        val unschedulableNodes = annotationObject as Set<Node>  
        if (originalModel instanceof SCCharts) {
            val guardedNodes = unschedulableNodes.map[ dependencies ].flatten.filter(GuardDependency).map[ target ].filter(Assignment).toList
            
            val states = originalModel.rootStates.head.getAllContainedStates.toIterable.
               filter[ !actions.empty || !outgoingTransitions.empty || regions.exists[ it instanceof DataflowRegion ] ].toList
            for (state : states) {
                val actions = state.actions + state.outgoingTransitions
                
                val equations = if (state.regions.exists[ it instanceof DataflowRegion ]) 
                   state.regions.filter(DataflowRegion).map[ equations ].flatten
                   else (<Assignment> newArrayList)
                
                val assignments = actions.map[ effects ].flatten.filter(Assignment)
                
                for (assignment : assignments) {
                    if (assignment.heuristicallyTheSameTo(guardedNodes)) {
                        environment.errors.add(originalModel, 
                           "Causal loop!", 
                           assignment.eContainer, assignment.valuedObject.name)
                    }
                }
                for (assignment : equations) {
                    if (assignment.heuristicallyTheSameTo(guardedNodes)) {
                        environment.errors.add(originalModel, 
                           "Causal loop!", 
                           assignment.reference, assignment.valuedObject.name)
                    }
                }
            } 
        }
    }
    
    private def boolean heuristicallyTheSameTo(Assignment assignment, List<Assignment> assignments) {
        for (compAss : assignments) {
            if (assignment.valuedObject.name == compAss.valuedObject.name) {
                // TODO: This is a PROTOTYPE. Use compare extension to get a better match.
                return true
            }
        }
        return false
    }    
    
}