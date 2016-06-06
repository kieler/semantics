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
 * @author ssm
 * 
 */
@Singleton
class AbortExtension implements ISCTGeneratorExtension {
    
    @Inject extension SCTGenerator

    public static val IProperty<Value<Double>> CHANCE_FOR_STRONG_ABORTS = new Property<Value<Double>>(
        SCTGenerator.SCTGENERATOR_ID + ".chanceForStrongAbort",
        new Value("Chance for Strong Abort", 0.0d)
    )

    public static val IProperty<Value<Double>> CHANCE_FOR_WEAK_ABORTS = new Property<Value<Double>>(
        SCTGenerator.SCTGENERATOR_ID + ".chanceForWeakAbort",
        new Value("Chance for Weak Abort", 0.0d)
    )
    
    override getTab() {
        SCTGenerator.SCTGENERATOR_EXTENSIONS_TAB
    }

    override getProperties() {
        <IProperty<?>>newArrayList(
            CHANCE_FOR_STRONG_ABORTS,
            CHANCE_FOR_WEAK_ABORTS
        )
    }

    override onTransitionCreate(Transition transition) {
        if (transition.sourceState.isSuperstate) {
            if (CHANCE_FOR_STRONG_ABORTS.random != 0) {
                transition.type = TransitionType.STRONGABORT
            } else if (CHANCE_FOR_WEAK_ABORTS.random != 0) {
                transition.type = TransitionType.WEAKABORT
            }
        }
    }
    
    override onStateCreate(State state) {
    }

    override onRegionCreate(Region region) {
    }

    override onExpressionCreate(Expression expression) {
    }

    override onModelCreate(State rootState) {
    }
    
    override onDeclarationCreate(Declaration declaration) {
    }

}
