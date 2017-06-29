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
package de.cau.cs.kieler.sccharts.timing.sctgenerator.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.ISCTGeneratorExtension
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.SCTGenerator
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.Value
import org.eclipse.core.resources.IProject
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions

/**
 * @author ima
 *
 */
class HostCodeTimingExtension implements ISCTGeneratorExtension {
    
    /* Injections */
    @Inject extension SCTGenerator
    @Inject extension KEffectsExtensions
    
    /* 
     * Static extension to generate models with host code calls chosen from a list in random mode.
     */

    /* Host code call properties */
        
     public static val IProperty<Value<Double>> CHANCE_FOR_HOST_CODE_CALL = 
        new Property<Value<Double>>(
            SCTGenerator.SCTGENERATOR_ID + ".chanceForHostCodeCall",
            new Value("Chance for host code call", 0.0d)
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
            CHANCE_FOR_HOST_CODE_CALL
        )
    }

    /**
     * {@inheritDoc}
     */
    override onTransitionCreate(Transition transition) {
        if (CHANCE_FOR_HOST_CODE_CALL.random != 0) {
            val hostCodeCallText = "workFor1000()";
            transition.effects.add(asHostcodeEffect(hostCodeCallText));
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
    
    override onSaveModel(State rootState, IProject project) {
        // Do nothing.
    }
    
}