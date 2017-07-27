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
package de.cau.cs.kieler.sccharts.ui.synthesis.srtg;

import com.google.inject.Injector;

import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis;
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisHooks;

/**
 * @author ssm
 *
 */
public class SRTGSynthesisHooks extends SynthesisHooks {

    /**
     * @param injector
     * @param synthesis
     */
    public SRTGSynthesisHooks(Injector injector, AbstractDiagramSynthesis<?> synthesis) {
        super(injector, synthesis);
    }

}
