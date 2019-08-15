/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import java.util.List
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.kexpressions.VectorValue
import java.util.ArrayList
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.IntValue

/**
 * SCCharts Array initialisation Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class ArrayInitialisation extends SCChartsProcessor implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.arrayInitialisation"
    }
    
    override getName() {
        "Array initialisation"
    }

    override process() {
        setModel(model.transform)
    }


    //-------------------------------------------------------------------------
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsComplexCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsActionExtensions

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"
    
    //--------------------------------------------------------------------------
    //--             A R R A Y    I N I T I A L I S A T I O N                 --
    //--------------------------------------------------------------------------
    // expand statements like y[1] = {1,2} to
    // y[1][0] = 1
    // y[1][1] = 2
    // also y[0] = {{0,1},{2,3}} is replaced by
    // y[0][0][0] = 0
    // y[0][0][1] = 1
    // y[0][1][0] = 2
    // y[0][1][1] = 3
    def State transform(State rootState) {
        // Traverse all states
        rootState.allContainedTransitions.forEach [ targetTransition |
            targetTransition.transformTransitionTrigger;
        ]
        rootState
    }

    def void transformTransitionTrigger(Transition transition) {
        var again = false
        do{
            again = false
            val assignments = transition.allContainedAssignments.toList
            for( assignment : assignments ) {
                if( assignment.reference.valuedObject !== null && 
                    assignment.reference.valuedObject.array && 
                    assignment.expression instanceof VectorValue
                ) {
                    var index = 0
                    var values = <Expression>newArrayList
                    values.addAll( (assignment.expression as VectorValue).values )
                    for( v : values )
                    {
                        again = again || v instanceof VectorValue
                        val newAss = transition.createAssignment( assignment.reference.valuedObject, v )
                        newAss.reference.indices.clear
                        for( i : assignment.reference.indices )
                            newAss.reference.indices.add( i.copy )
                        newAss.reference.indices.add( createIntValue( index++ ) )
                    }
                    transition.effects.remove( assignment )
                }
            }
        } while( again )
    }

    def SCCharts transform(SCCharts sccharts) {
        println( "test" )
        sccharts => [ rootStates.forEach[ transform ] ]
    }
}
