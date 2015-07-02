/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.benchmark.xtend

import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.synccharts.Region
import de.cau.cs.kieler.synccharts.State
import de.cau.cs.kieler.synccharts.SyncchartsFactory
import de.cau.cs.kieler.synccharts.Transition
import de.cau.cs.kieler.synccharts.TransitionType
import org.eclipse.xtend.util.stdlib.CloningExtensions
import de.cau.cs.kieler.core.kexpressions.Expression
import com.google.common.collect.ImmutableList
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import java.util.List
import de.cau.cs.kieler.core.kexpressions.Signal
import de.cau.cs.kieler.synccharts.Action
import de.cau.cs.kieler.synccharts.Emission
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.ComplexExpression
import de.cau.cs.kieler.synccharts.StateType

/**
 * This class contributes a benchmark for SyncCharts.
 * 
 * @author cmot
 * @kieler.design 2012-11-29 proposed cmot
 * @kieler.rating 2012-11-29 proposed yellow
 */
class SyncChartsBenchmark {
     
    //-------------------------------------------------------------------------
    //--                          S T A T E S                                --
    //-------------------------------------------------------------------------
    def int countStates (Region rootRegion) {
        rootRegion.eAllContents.filter(typeof(State)).toList().size;
     }     

    //-------------------------------------------------------------------------
    //--                       T R A N S I T I O N S                         --
    //-------------------------------------------------------------------------
    def int countTransitions (Region rootRegion) {
        rootRegion.eAllContents.filter(typeof(Transition)).toList().size;
    }     

    //-------------------------------------------------------------------------
    //--                         H I E R A R C H Y                           --
    //-------------------------------------------------------------------------
    def int maxHierarchy (Region rootRegion) {
        var maxHierarchy = 0;
        for (state : rootRegion.states) {
            for (region : state.regions) {
                var newMaxHierarchy = region.maxHierarchy;
                if (newMaxHierarchy > maxHierarchy) {
                    maxHierarchy = newMaxHierarchy;
                }
            }
        }
        maxHierarchy + 1;
     }     

    //-------------------------------------------------------------------------
    //--                      L A B E L L E N G T H                         --
    //-------------------------------------------------------------------------
    def int maxLabelLength (Region rootRegion) {
        val transitions = rootRegion.eAllContents.filter(typeof(Transition)).toList();
        var maxLabelLength = 0;
        
        for (transition : transitions) {
           if (transition.label != null) {
                val newLabelLength = transition.label.length;
                if (newLabelLength > maxLabelLength) {
                       maxLabelLength = newLabelLength;
                }
            }
        }
        
        maxLabelLength;
    }
    def int countLabelLength (Region rootRegion) {
        val transitions = rootRegion.eAllContents.filter(typeof(Transition)).toList();
        var labelLength = 0;
        
        for (transition : transitions) {
           if (transition.label != null) {
               labelLength = labelLength + transition.label.length;
           }
        }
        labelLength;
    }
    
         
}













