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
package de.cau.cs.kieler.sccharts.text.sct.sctgenerator.extensions

import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.SCTGenerator
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.Value
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.ISCTGeneratorExtension
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.Declaration
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.TransitionType
import com.google.inject.Singleton
import static extension de.cau.cs.kieler.sccharts.text.sct.sctgenerator.ModelGenerator.isSuperstate

/**
 * Abort extension for the SCT Generator
 * This class adds abort transition to the model creation.
 * It serves as core example for adding extensions to the SCT Generator.
 * 
 * @author ssm
 * @kieler.design 2016-06-07 proposed 
 * @kieler.rating 2016-06-07 proposed yellow
 */
@Singleton
class AbortExtension implements ISCTGeneratorExtension {
    
    /* Injections */
    @Inject extension SCTGenerator      // You can simply inject the SCT Generator.
    
    /* 
     * Additionally, you can add static extensions to enrich your class. 
     * For example, you simply may add 
     *   import static extension de.cau.cs.kieler.sccharts.text.sct.sctgenerator.ModelGenerator.isSuperstate
     * to the list of imports to enable the superstate check within this class.
     */

    /* Abort properties */
    public static val IProperty<Value<Double>> CHANCE_FOR_STRONG_ABORTS = 
        new Property<Value<Double>>(
            SCTGenerator.SCTGENERATOR_ID + ".chanceForStrongAbort",
            new Value("Chance for Strong Abort", 0.0d)
        )

    public static val IProperty<Value<Double>> CHANCE_FOR_WEAK_ABORTS = 
        new Property<Value<Double>>(
            SCTGenerator.SCTGENERATOR_ID + ".chanceForWeakAbort",
            new Value("Chance for Weak Abort", 0.0d)
        )


    /* Satisfy property holder interface */
    
    /**
     * {@inheritDoc}
     */
    override getCategory() {
        SCTGenerator.SCTGENERATOR_EXTENSIONS_TAB
    }

    /**
     * {@inheritDoc}
     */
    override getProperties() {
        <IProperty<?>>newArrayList(
            CHANCE_FOR_STRONG_ABORTS,
            CHANCE_FOR_WEAK_ABORTS
        )
    }

    /**
     * {@inheritDoc}
     */
    override onTransitionCreate(Transition transition) {
        /* If the source state of the transition is a superstate,
         * check whether or not it should get marked as strong or weak abort. */
        if (transition.sourceState.isSuperstate) {
            if (CHANCE_FOR_STRONG_ABORTS.random != 0) {
                transition.type = TransitionType.STRONGABORT
            } else if (CHANCE_FOR_WEAK_ABORTS.random != 0) {
                transition.type = TransitionType.WEAKABORT
            }
        }
    }
    
    override onStateCreate(State state) {
        // Do nothing.
    }

    override onRegionCreate(Region region) {
        // Do nothing.
    }

    override onExpressionCreate(Expression expression) {
        // Do nothing.
    }

    override onModelCreate(State rootState) {
        // Do nothing.
    }
    
    override onDeclarationCreate(Declaration declaration) {
        // Do nothing.
    }

}
