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
package de.cau.cs.kieler.esterel.klighd;

import java.util.List;

import javax.inject.Inject;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.scg.klighd.SCGraphDiagramSynthesis;
import de.cau.cs.kieler.scl.scl.Program;

/**
 * @author krat
 *
 */
public class EsterelDiagramSynthesis extends AbstractDiagramSynthesis<de.cau.cs.kieler.esterel.esterel.Program> {
    /**
     * {@inheritDoc}
     */
    @Inject private SCGraphDiagramSynthesis delegate = new SCGraphDiagramSynthesis();
    @Override
    public KNode transform(de.cau.cs.kieler.esterel.esterel.Program model) {
        Program sclProgram = (Program) KielerCompiler.compile("ESTERELTOSCL", (de.cau.cs.kieler.esterel.esterel.Program) model, false, false).getEObject();
        SCGraph scg = (SCGraph) KielerCompiler.compile("SCLTOSCG", sclProgram, false, false).getEObject();

        return delegate.transform(scg, this.getUsedContext());
    }
    
    @Override
    public List<SynthesisOption> getDisplayedSynthesisOptions() {
        return delegate.getDisplayedSynthesisOptions();
    }

}
